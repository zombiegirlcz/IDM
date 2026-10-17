package jv0;

import android.content.Context;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.collect.ImmutableList;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import java.util.ArrayList;
import java.util.Iterator;
import jv0.m;
import kotlin.jvm.internal.Intrinsics;
import nn3.z;

/* JADX INFO: loaded from: classes19.dex */
public final class i implements Player.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f178744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UiKitPlayerView f178745b;

    public i(UiKitPlayerView uiKitPlayerView) {
        this.f178745b = uiKitPlayerView;
    }

    public final void a() {
        this.f178744a = false;
        ExoPlayer exoPlayer = this.f178745b.f57712n;
        if (exoPlayer != null) {
            exoPlayer.removeListener(this);
        }
    }

    public final void b() {
        ExoPlayer exoPlayer;
        if (this.f178744a || (exoPlayer = this.f178745b.f57712n) == null) {
            return;
        }
        exoPlayer.addListener(this);
        this.f178744a = true;
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onCues(CueGroup cueGroup) {
        Intrinsics.checkNotNullParameter(cueGroup, "cueGroup");
        ihm.f fVar = this.f178745b.f57715r;
        ImmutableList<Cue> cues = cueGroup.cues;
        Intrinsics.checkNotNullExpressionValue(cues, "cues");
        ArrayList arrayList = new ArrayList();
        Iterator<Cue> it8 = cues.iterator();
        while (it8.hasNext()) {
            CharSequence charSequence = it8.next().text;
            if (charSequence != null) {
                arrayList.add(charSequence);
            }
        }
        fVar.onNext(new r(arrayList));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onEvents(Player player, Player.Events events) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(events, "events");
        if (events.containsAny(4, 5, 7, 11, 0)) {
            boolean z = player.getPlaybackState() == 3 || player.getPlaybackState() == 2;
            if (player.isPlaying() || z) {
                this.f178745b.f57715r.onNext(m.c.f178753a);
            }
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onIsPlayingChanged(boolean z) {
        UiKitPlayerView uiKitPlayerView = this.f178745b;
        uiKitPlayerView.f57715r.onNext(new o(z, uiKitPlayerView.getContentPosition(), uiKitPlayerView.getContentDuration()));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        this.f178745b.f57715r.onNext(new l(z));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i) throws Throwable {
        z zVar;
        UiKitPlayerView uiKitPlayerView = this.f178745b;
        ihm.f fVar = uiKitPlayerView.f57715r;
        x xVar = uiKitPlayerView.f57707g;
        if (i == 2 && xVar != null && (zVar = jo0.m.f176852j) != null) {
            Context context = uiKitPlayerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            zVar.invoke(new lx0.h(xVar.a(context)));
        }
        fVar.onNext(new n(i == 2));
        if (uiKitPlayerView.i || i != 4) {
            return;
        }
        fVar.onNext(new p(false));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        UiKitPlayerView uiKitPlayerView = this.f178745b;
        jz0.c cVar = uiKitPlayerView.f57720y;
        uiKitPlayerView.f57720y = null;
        if (cVar != null) {
            cVar.e();
        }
        uiKitPlayerView.f57715r.onNext(new q(UiKitPlayerView.a(uiKitPlayerView, error)));
        UiKitPlayerView.c(uiKitPlayerView);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerErrorChanged(PlaybackException playbackException) {
        UiKitPlayerView uiKitPlayerView = this.f178745b;
        jz0.c cVar = uiKitPlayerView.f57720y;
        uiKitPlayerView.f57720y = null;
        if (cVar != null) {
            cVar.e();
        }
        uiKitPlayerView.f57715r.onNext(new q(playbackException != null ? UiKitPlayerView.a(uiKitPlayerView, playbackException) : null));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPositionDiscontinuity(Player.PositionInfo oldPosition, Player.PositionInfo newPosition, int i) {
        Intrinsics.checkNotNullParameter(oldPosition, "oldPosition");
        Intrinsics.checkNotNullParameter(newPosition, "newPosition");
        UiKitPlayerView uiKitPlayerView = this.f178745b;
        if (uiKitPlayerView.i && i == 0) {
            uiKitPlayerView.f57715r.onNext(new p(true));
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onRenderedFirstFrame() {
        UiKitPlayerView uiKitPlayerView = this.f178745b;
        TextureView textureView = uiKitPlayerView.v;
        if (uiKitPlayerView.getShutterImageView().getVisibility() == 0) {
            uiKitPlayerView.getShutterImageView().animate().alpha(BitmapDescriptorFactory.HUE_RED).withEndAction(new h(uiKitPlayerView, 1));
        }
        if (textureView.getAlpha() != 1.0f) {
            textureView.animate().alpha(1.0f).withEndAction(new h(uiKitPlayerView, 2));
        }
        jz0.c cVar = uiKitPlayerView.f57720y;
        uiKitPlayerView.f57720y = null;
        if (cVar != null) {
            cVar.b();
        }
        uiKitPlayerView.f57715r.onNext(m.a.f178751a);
        x xVar = uiKitPlayerView.f57707g;
        textureView.setOpaque((xVar != null ? xVar.b() : null) == oz0.c.DISABLED);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTracksChanged(Tracks tracks) {
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        UiKitPlayerView uiKitPlayerView = this.f178745b;
        g gVar = uiKitPlayerView.o;
        if (gVar != null) {
            gVar.e(uiKitPlayerView.f57714q);
        }
        uiKitPlayerView.f57715r.onNext(m.b.f178752a);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVideoSizeChanged(VideoSize videoSize) {
        Intrinsics.checkNotNullParameter(videoSize, "videoSize");
        UiKitPlayerView uiKitPlayerView = this.f178745b;
        ExoPlayer exoPlayer = uiKitPlayerView.f57712n;
        if (exoPlayer == null || Intrinsics.f(videoSize, VideoSize.UNKNOWN) || exoPlayer.getPlaybackState() == 1) {
            return;
        }
        int i = videoSize.width;
        int i2 = videoSize.height;
        uiKitPlayerView.u.setAspectRatio(uiKitPlayerView.f57719x.c((i <= 0 || i2 <= 0) ? BitmapDescriptorFactory.HUE_RED : (i * videoSize.pixelWidthHeightRatio) / i2));
    }
}
