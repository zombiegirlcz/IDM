package jv0;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.revolut.core.ui_kit.internal.views.UIKitImageView;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.video.models.UriVideo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends FrameLayout {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UiKitPlayerView f178737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UriVideo f178738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UIKitImageView f178739c;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setContent(@NotNull Image image, UriVideo uriVideo) {
        UiKitPlayerView uiKitPlayerView;
        Intrinsics.checkNotNullParameter(image, "image");
        yy0.f.e(or0.u.k(this).Q(), image, this.f178739c, null, null, 12);
        UiKitPlayerView uiKitPlayerView2 = this.f178737a;
        if (uiKitPlayerView2 != null) {
            if (uriVideo == null) {
                if (uiKitPlayerView2 != null) {
                    uiKitPlayerView2.h();
                    uiKitPlayerView2.setVisibility(8);
                }
            } else if (!Intrinsics.f(this.f178738b, uriVideo) && (uiKitPlayerView = this.f178737a) != null) {
                Uri uri2 = uriVideo.f60085a;
                oz0.c transparencyMode = uriVideo.f60088g;
                Intrinsics.checkNotNullParameter(uri2, "uri");
                Intrinsics.checkNotNullParameter(transparencyMode, "transparencyMode");
                uiKitPlayerView.j(new v(uri2, transparencyMode), null);
                uiKitPlayerView.setVisibility(0);
                uiKitPlayerView.i();
            }
        }
        this.f178738b = uriVideo;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        UIKitImageView uIKitImageView = new UIKitImageView(context, null, 6, 0);
        uIKitImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        uIKitImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f178739c = uIKitImageView;
        addView(uIKitImageView);
        setForeground(new ColorDrawable(io0.a.d(0.6f, -16777216)));
    }

    public /* synthetic */ e(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
