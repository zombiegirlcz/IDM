package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import aw0.d0;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yp0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/UiKitMediaView;", "Lcom/revolut/core/ui_kit/internal/views/LazyInflatableCachedView;", "Ljz0/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lyp0/q;", "option", "", "setGlyphDisplayOption", "(Lyp0/q;)V", "", "size", "setVideoPlayerSize", "(Ljava/lang/Float;)V", "Law0/d0;", "aspectRatio", "setSizeAspectRatio", "(Law0/d0;)V", "Landroid/widget/ImageView$ScaleType;", "scaleType", "setImageScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "Loz0/b;", "setVideoScaleType", "(Loz0/b;)V", "Lcom/revolut/core/ui_kit_core/displayers/video/models/VideoShutter;", "shutter", "setVideoShutter", "(Lcom/revolut/core/ui_kit_core/displayers/video/models/VideoShutter;)V", "Lxt0/a;", "k", "Lxt0/a;", "getExternalMediaRegistry", "()Lxt0/a;", "setExternalMediaRegistry", "(Lxt0/a;)V", "externalMediaRegistry", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UiKitMediaView extends LazyInflatableCachedView implements jz0.e {
    public ImageView.ScaleType e;
    public oz0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Float f56475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d0 f56476h;
    public VideoShutter i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q f56477j;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public xt0.a externalMediaRegistry;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UiKitMediaView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void d() {
        View childAt;
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i);
            Intrinsics.h(childAt);
            if (childAt instanceof LottieAnimationView) {
                break;
            } else {
                i++;
            }
        }
        LottieAnimationView lottieAnimationView = childAt instanceof LottieAnimationView ? (LottieAnimationView) childAt : null;
        if (lottieAnimationView != null) {
            rd0.e.r(lottieAnimationView, this.f56477j);
        }
    }

    public final void e() {
        View childAt;
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i);
            Intrinsics.h(childAt);
            if (childAt instanceof ImageView) {
                break;
            } else {
                i++;
            }
        }
        ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
        ImageView.ScaleType scaleType = this.e;
        if (scaleType == null || imageView == null) {
            return;
        }
        imageView.setScaleType(scaleType);
    }

    public final void f() {
        View childAt;
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i);
            Intrinsics.h(childAt);
            if (childAt instanceof UiKitPlayerView) {
                break;
            } else {
                i++;
            }
        }
        if (childAt != null) {
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Float f = this.f56475g;
            if (f == null) {
                layoutParams.width = -1;
                layoutParams.height = -1;
                return;
            }
            Context context = childAt.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            layoutParams.width = kli.a.k(context, f.floatValue());
            Context context2 = childAt.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            layoutParams.height = kli.a.k(context2, f.floatValue());
        }
    }

    public final void g() {
        View childAt;
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i);
            Intrinsics.h(childAt);
            if (childAt instanceof UiKitPlayerView) {
                break;
            } else {
                i++;
            }
        }
        UiKitPlayerView uiKitPlayerView = childAt instanceof UiKitPlayerView ? (UiKitPlayerView) childAt : null;
        oz0.b bVar = this.f;
        if (bVar == null || uiKitPlayerView == null) {
            return;
        }
        uiKitPlayerView.setScaleType(bVar);
    }

    public final xt0.a getExternalMediaRegistry() {
        return this.externalMediaRegistry;
    }

    public final void h() {
        View childAt;
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i);
            Intrinsics.h(childAt);
            if (childAt instanceof UiKitPlayerView) {
                break;
            } else {
                i++;
            }
        }
        UiKitPlayerView uiKitPlayerView = childAt instanceof UiKitPlayerView ? (UiKitPlayerView) childAt : null;
        VideoShutter videoShutter = this.i;
        if (videoShutter == null || uiKitPlayerView == null) {
            return;
        }
        uiKitPlayerView.setShutter(videoShutter);
    }

    public final LottieAnimationView i() {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) a(R$layout.internal_uikit_media_image);
        e();
        d();
        return lottieAnimationView;
    }

    public final UiKitPlayerView j() {
        View childAt;
        UiKitPlayerView uiKitPlayerView = (UiKitPlayerView) a(R$layout.internal_uikit_media_video);
        f();
        g();
        h();
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i);
            Intrinsics.h(childAt);
            if (childAt instanceof UiKitPlayerView) {
                break;
            }
            i++;
        }
        UiKitPlayerView uiKitPlayerView2 = childAt instanceof UiKitPlayerView ? (UiKitPlayerView) childAt : null;
        if (uiKitPlayerView2 != null) {
            uiKitPlayerView2.setExternalMediaRegistry(this.externalMediaRegistry);
        }
        return uiKitPlayerView;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f56476h == null) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float fA = r0.a() / r0.b();
        int paddingLeft = (int) (((size - getPaddingLeft()) - getPaddingRight()) * fA);
        if (paddingLeft <= size2 || size2 == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        } else {
            i = View.MeasureSpec.makeMeasureSpec((int) (((size2 - getPaddingTop()) - getPaddingBottom()) / fA), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public final void setExternalMediaRegistry(xt0.a aVar) {
        this.externalMediaRegistry = aVar;
    }

    public final void setGlyphDisplayOption(@NotNull q option) {
        Intrinsics.checkNotNullParameter(option, "option");
        this.f56477j = option;
        d();
    }

    public final void setImageScaleType(@NotNull ImageView.ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.e = scaleType;
        e();
    }

    public final void setSizeAspectRatio(d0 aspectRatio) {
        if (Intrinsics.f(this.f56476h, aspectRatio)) {
            return;
        }
        this.f56476h = aspectRatio;
        requestLayout();
    }

    public final void setVideoPlayerSize(Float size) {
        this.f56475g = size;
        f();
    }

    public final void setVideoScaleType(@NotNull oz0.b scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.f = scaleType;
        g();
    }

    public final void setVideoShutter(@NotNull VideoShutter shutter) {
        Intrinsics.checkNotNullParameter(shutter, "shutter");
        this.i = shutter;
        h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UiKitMediaView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiKitMediaView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ UiKitMediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
