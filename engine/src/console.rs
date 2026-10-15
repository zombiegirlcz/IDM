//! Keep spawned children from flashing a console window on Windows.
//!
//! `idm.exe` is a console-subsystem binary, so every child it starts without
//! CREATE_NO_WINDOW pops up a black console for as long as that child lives.
//! The queue starts one `idm.exe` per download, media work starts yt-dlp, and
//! aria2c gets started too -- and a download that fails is retried ten times,
//! which a user sees as the terminal flickering without end.
//!
//! The flag is a no-op everywhere else, so the call sites stay free of
//! `#[cfg(windows)]`: one trait, called unconditionally, and the difference
//! lives here.

/// CREATE_NO_WINDOW: the child gets no console of its own and inherits none.
#[allow(dead_code)]
pub const CREATE_NO_WINDOW: u32 = 0x0800_0000;

/// Hide the console of a command being built.
///
/// Implemented for both the std and the tokio `Command`, because the engine
/// uses both and a helper that covers only one of them is a helper somebody
/// will forget to use.
pub trait HideConsole {
    fn hide_console(&mut self) -> &mut Self;
}

impl HideConsole for std::process::Command {
    #[cfg(windows)]
    fn hide_console(&mut self) -> &mut Self {
        use std::os::windows::process::CommandExt;
        self.creation_flags(CREATE_NO_WINDOW)
    }

    #[cfg(not(windows))]
    fn hide_console(&mut self) -> &mut Self {
        self
    }
}

impl HideConsole for tokio::process::Command {
    #[cfg(windows)]
    fn hide_console(&mut self) -> &mut Self {
        self.creation_flags(CREATE_NO_WINDOW)
    }

    #[cfg(not(windows))]
    fn hide_console(&mut self) -> &mut Self {
        self
    }
}
