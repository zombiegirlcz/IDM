package com.revolut.core.ui_kit.background;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import cr0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ny0.h;
import or0.u;
import org.jetbrains.annotations.NotNull;
import pij.d1;
import pjg.i;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/revolut/core/ui_kit/background/VideoBackgroundView;", "Landroid/widget/FrameLayout;", "Lny0/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit_core/displayers/video/models/UrlVideo;", "video", "", "setVideoResource", "(Lcom/revolut/core/ui_kit_core/displayers/video/models/UrlVideo;)V", "", "videoUrl", "videoUrlDark", "", "repeat", "Loz0/c;", "transparencyMode", "setVideoBackground", "(Ljava/lang/String;Ljava/lang/String;ZLoz0/c;)V", "fitsReadableArea", "Z", "getFitsReadableArea", "()Z", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VideoBackgroundView extends FrameLayout implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f51501c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiKitPlayerView f51502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UrlVideo f51503b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoBackgroundView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(View view, boolean z) {
        view.animate().cancel();
        if (z == (view.getVisibility() == 0)) {
            return;
        }
        view.setAlpha(z ? 0.0f : 1.0f);
        view.animate().alpha(z ? 1.0f : 0.0f).setDuration(300L).setListener(new j(view, z)).start();
    }

    public static /* synthetic */ void setVideoBackground$default(VideoBackgroundView videoBackgroundView, String str, String str2, boolean z, oz0.c cVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            cVar = oz0.c.DISABLED;
        }
        videoBackgroundView.setVideoBackground(str, str2, z, cVar);
    }

    private final void setVideoResource(UrlVideo video) {
        this.f51503b = video;
        u.k(this).V().a(video, this.f51502a, null);
    }

    @Override // ny0.h
    /* JADX INFO: renamed from: getFitsReadableArea */
    public boolean getF51506a() {
        return false;
    }

    public final void setVideoBackground(@NotNull String videoUrl, String videoUrlDark, boolean repeat, @NotNull oz0.c transparencyMode) {
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(transparencyMode, "transparencyMode");
        UrlVideo urlVideo = new UrlVideo(videoUrl, videoUrlDark == null ? videoUrl : videoUrlDark, repeat, oz0.b.CENTER_CROP, false, transparencyMode, 48);
        if (!urlVideo.equals(this.f51503b)) {
            setVideoResource(urlVideo);
        }
        this.f51502a.i();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoBackgroundView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoBackgroundView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        UiKitPlayerView uiKitPlayerView = new UiKitPlayerView(context, null, 6, 0);
        uiKitPlayerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        uiKitPlayerView.setVisibility(4);
        this.f51502a = uiKitPlayerView;
        addView(uiKitPlayerView);
        uiKitPlayerView.setRepeat(true);
        o70.a.f(uiKitPlayerView.f57715r).subscribe(new i(new d1(this, 24), 17));
    }

    public /* synthetic */ VideoBackgroundView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
