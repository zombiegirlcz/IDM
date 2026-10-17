package com.revolut.core.ui_kit_core.displayers.sound;

import com.revolut.core.ui_kit_core.displayers.sound.Sound;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class b {
    public static final Sound.UrlSound a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Sound.UrlSound(p.a.p("https://assets.revolut.com/mobile/uikit/sound_effects/", name, ".mp3"));
    }
}
