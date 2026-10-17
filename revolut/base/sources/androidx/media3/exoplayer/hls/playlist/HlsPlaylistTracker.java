package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public interface HlsPlaylistTracker {

    public interface Factory {
    }

    public interface PlaylistEventListener {
        void onPlaylistChanged();

        boolean onPlaylistError(Uri uri2, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z);
    }

    public static final class PlaylistResetException extends IOException {

        /* JADX INFO: renamed from: url, reason: collision with root package name */
        public final Uri f7546url;

        public PlaylistResetException(Uri uri2) {
            this.f7546url = uri2;
        }
    }

    public static final class PlaylistStuckException extends IOException {

        /* JADX INFO: renamed from: url, reason: collision with root package name */
        public final Uri f7547url;

        public PlaylistStuckException(Uri uri2) {
            this.f7547url = uri2;
        }
    }

    public interface PrimaryPlaylistListener {
        void onPrimaryPlaylistRefreshed(HlsMediaPlaylist hlsMediaPlaylist);
    }

    void addListener(PlaylistEventListener playlistEventListener);

    void deactivatePlaylistForPlayback(Uri uri2);

    boolean excludeMediaPlaylist(Uri uri2, long j2);

    long getInitialStartTimeUs();

    HlsMultivariantPlaylist getMultivariantPlaylist();

    HlsMediaPlaylist getPlaylistSnapshot(Uri uri2, boolean z);

    boolean isLive();

    boolean isSnapshotValid(Uri uri2);

    void maybeThrowPlaylistRefreshError(Uri uri2) throws IOException;

    void maybeThrowPrimaryPlaylistRefreshError() throws IOException;

    void refreshPlaylist(Uri uri2);

    void removeListener(PlaylistEventListener playlistEventListener);

    void start(Uri uri2, MediaSourceEventListener.EventDispatcher eventDispatcher, PrimaryPlaylistListener primaryPlaylistListener);

    void stop();
}
