package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import aw0.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.internal.views.CutoutLottieAnimationView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$Contextual;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ix0.h0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002CDB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010'\u001a\u00020\u000eH\u0001¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010)J\r\u0010,\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u0004\u0018\u00010+¢\u0006\u0004\b.\u0010-J\u000f\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101R\"\u00109\u001a\u0002028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0016\u0010A\u001a\u0004\u0018\u00010>8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006E"}, d2 = {"Lcom/revolut/core/ui_kit/views/ImageWithAnimatedBackgroundView;", "Landroid/widget/FrameLayout;", "", "Lxv0/m;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/views/ImageWithAnimatedBackgroundView$Model;", "model", "", "setModel", "(Lcom/revolut/core/ui_kit/views/ImageWithAnimatedBackgroundView$Model;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/models/LottieImage;", "backgroundAnimationImage", "setBackgroundAnimationImage$ui_kit_components_release", "(Lcom/revolut/core/ui_kit_core/displayers/image/models/LottieImage;)V", "setBackgroundAnimationImage", "Landroid/widget/ImageView$ScaleType;", "scaleType", "setImageScaleType$ui_kit_components_release", "(Landroid/widget/ImageView$ScaleType;)V", "setImageScaleType", "", "enabled", "setReflectiveOuterBorderEnabled$ui_kit_components_release", "(Z)V", "setReflectiveOuterBorderEnabled", "Law0/v1;", "colorScheme", "setReflectiveSurfaceColorScheme$ui_kit_components_release", "(Law0/v1;)V", "setReflectiveSurfaceColorScheme", "setAnimationDebugBounds$ui_kit_components_release", "()V", "setAnimationDebugBounds", "getUnclippedWidth", "()I", "getUnclippedHeight", "Lix0/h0;", "getCutoutImageCutoutReceiver", "()Lix0/h0;", "getBackgroundAnimationCutoutReceiver", "Lcom/revolut/core/ui_kit/internal/views/CutoutLottieAnimationView;", "getOrCreateBackgroundAnimationView", "()Lcom/revolut/core/ui_kit/internal/views/CutoutLottieAnimationView;", "Lxv0/i;", "g", "Lxv0/i;", "getItemRenderState", "()Lxv0/i;", "setItemRenderState", "(Lxv0/i;)V", "itemRenderState", "Landroid/view/View;", "getRenderView", "()Landroid/view/View;", "renderView", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "getCurrentImage$ui_kit_components_release", "()Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "currentImage", "Companion", "Model", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ImageWithAnimatedBackgroundView extends FrameLayout implements xv0.m {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f58648h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CutoutLottieAnimationView f58649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RoundedBackgroundDrawable f58650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f58651c;
    public Integer d;
    public Integer e;
    public final CutoutImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public xv0.i itemRenderState;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/views/ImageWithAnimatedBackgroundView$Model;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Model> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Image f58653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LottieImage f58654b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Model((Image) parcel.readParcelable(Model.class.getClassLoader()), (LottieImage) parcel.readParcelable(Model.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Model[i];
            }
        }

        public Model(Image image, LottieImage lottieImage) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.f58653a = image;
            this.f58654b = lottieImage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f58653a, model.f58653a) && Intrinsics.f(this.f58654b, model.f58654b);
        }

        public final int hashCode() {
            int iHashCode = this.f58653a.hashCode() * 31;
            LottieImage lottieImage = this.f58654b;
            return iHashCode + (lottieImage == null ? 0 : lottieImage.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f58653a, i);
            dest.writeParcelable(this.f58654b, i);
        }
    }

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageWithAnimatedBackgroundView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final CutoutLottieAnimationView getOrCreateBackgroundAnimationView() {
        CutoutLottieAnimationView cutoutLottieAnimationView = this.f58649a;
        if (cutoutLottieAnimationView != null) {
            return cutoutLottieAnimationView;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CutoutLottieAnimationView cutoutLottieAnimationView2 = new CutoutLottieAnimationView(context, null, 6, 0);
        cutoutLottieAnimationView2.setId(R$id.uikit_imageWithAnimatedBackgroundView_backgroundAnimation);
        addView(cutoutLottieAnimationView2, 0, new FrameLayout.LayoutParams(-1, -1));
        this.f58649a = cutoutLottieAnimationView2;
        return cutoutLottieAnimationView2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Drawable drawable, Image image) {
        Integer num = this.d;
        if (num != null) {
            int iIntValue = num.intValue();
            Integer num2 = this.e;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                if (drawable instanceof yy0.m) {
                    UserAvatarImage userAvatarImage = image instanceof UserAvatarImage ? (UserAvatarImage) image : null;
                    if ((userAvatarImage != null ? userAvatarImage.f60045b : null) instanceof StylableContactImage$Contextual) {
                        RoundedBackgroundDrawable roundedBackgroundDrawable = this.f58650b;
                        roundedBackgroundDrawable.d(iIntValue2, iIntValue);
                        ((yy0.m) drawable).a(iIntValue2);
                        this.f.setBackground(roundedBackgroundDrawable);
                    }
                }
            }
        }
    }

    public final h0 getBackgroundAnimationCutoutReceiver() {
        return this.f58649a;
    }

    public final Image getCurrentImage$ui_kit_components_release() {
        return or0.u.k(this).Q().d(this.f);
    }

    @NotNull
    public final h0 getCutoutImageCutoutReceiver() {
        return this.f;
    }

    @Override // xv0.m
    @NotNull
    public xv0.i getItemRenderState() {
        return this.itemRenderState;
    }

    @Override // xv0.m
    @NotNull
    public View getRenderView() {
        return this.f;
    }

    public int getUnclippedHeight() {
        return (int) ((getMeasuredHeight() * 0.25f * 2) + getMeasuredHeight());
    }

    public int getUnclippedWidth() {
        return (int) ((getMeasuredWidth() * 0.25f * 2) + getMeasuredWidth());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        CutoutLottieAnimationView cutoutLottieAnimationView = this.f58649a;
        if (cutoutLottieAnimationView == null) {
            return;
        }
        int unclippedWidth = getUnclippedWidth();
        int unclippedHeight = getUnclippedHeight();
        float measuredWidth = (getMeasuredWidth() - unclippedWidth) * 0.5f;
        if (getLayoutDirection() == 1) {
            measuredWidth = -measuredWidth;
        }
        cutoutLottieAnimationView.offsetLeftAndRight(rim.d.c(measuredWidth));
        cutoutLottieAnimationView.offsetTopAndBottom(rim.d.c((getMeasuredHeight() - unclippedHeight) * 0.5f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        CutoutLottieAnimationView cutoutLottieAnimationView = this.f58649a;
        if (cutoutLottieAnimationView == null) {
            return;
        }
        cutoutLottieAnimationView.measure(View.MeasureSpec.makeMeasureSpec(getUnclippedWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getUnclippedHeight(), 1073741824));
    }

    public final void setAnimationDebugBounds$ui_kit_components_release() {
        CutoutLottieAnimationView cutoutLottieAnimationView = this.f58649a;
        if (cutoutLottieAnimationView != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Color.Solid solid = new Color.Solid(R$attr.uikit_colorTransparent);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            cutoutLottieAnimationView.setBackground(dr0.l.h(context, BitmapDescriptorFactory.HUE_RED, solid, kli.a.k(context2, 1.0f), new Color.Solid(R$attr.uikit_colorRed)));
        }
    }

    public final void setBackgroundAnimationImage$ui_kit_components_release(LottieImage backgroundAnimationImage) {
        CutoutLottieAnimationView cutoutLottieAnimationView = this.f58649a;
        if (cutoutLottieAnimationView != null) {
            cutoutLottieAnimationView.setVisibility(backgroundAnimationImage != null ? 0 : 8);
        }
        if (backgroundAnimationImage == null) {
            return;
        }
        yy0.f.e(or0.u.k(this).Q(), backgroundAnimationImage, getOrCreateBackgroundAnimationView(), null, null, 12);
    }

    public final void setImageScaleType$ui_kit_components_release(@NotNull ImageView.ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.f.setScaleType(scaleType);
    }

    @Override // xv0.m
    public void setItemRenderState(@NotNull xv0.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.itemRenderState = iVar;
    }

    public final void setModel(Model model) {
        this.f.setVisibility(model != null ? 0 : 8);
        CutoutLottieAnimationView cutoutLottieAnimationView = this.f58649a;
        if (cutoutLottieAnimationView != null) {
            cutoutLottieAnimationView.setVisibility(model != null ? 0 : 8);
        }
        if (model == null) {
            return;
        }
        setBackgroundAnimationImage$ui_kit_components_release(model.f58654b);
        yy0.f.e(or0.u.k(this).Q(), model.f58653a, this.f, null, null, 12);
    }

    public final void setReflectiveOuterBorderEnabled$ui_kit_components_release(boolean enabled) {
        this.f58650b.q(enabled);
    }

    public final void setReflectiveSurfaceColorScheme$ui_kit_components_release(@NotNull v1 colorScheme) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.f58650b.a(colorScheme);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageWithAnimatedBackgroundView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageWithAnimatedBackgroundView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        RoundedBackgroundDrawable roundedBackgroundDrawableB = RoundedBackgroundDrawable.Companion.b(RoundedBackgroundDrawable.INSTANCE, context, 0, 6);
        this.f58650b = roundedBackgroundDrawableB;
        this.f58651c = roundedBackgroundDrawableB.getD();
        AttributeSet attributeSet2 = null;
        CutoutImageView cutoutImageView = new CutoutImageView(context, attributeSet2, 6, 0);
        cutoutImageView.setId(R$id.uikit_imageWithAnimatedBackgroundView_image);
        addView(cutoutImageView, new FrameLayout.LayoutParams(-1, -1));
        this.f = cutoutImageView;
        if (isInEditMode()) {
            cutoutImageView.setImageResource(R$drawable.internal_circle_gradient_grey);
        }
        this.itemRenderState = xv0.g.f309150a;
    }

    public /* synthetic */ ImageWithAnimatedBackgroundView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
