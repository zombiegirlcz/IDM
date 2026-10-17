package fci;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class u extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f133815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f133816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f133817c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, a0 content) {
        Image image;
        FrameLayout.LayoutParams layoutParams;
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(content, "content");
        ImageView imageView = new ImageView(context);
        this.f133815a = imageView;
        setImportantForAccessibility(2);
        setClipToOutline(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(kli.a.k(context, 20.0f));
        gradientDrawable.setColor(kli.a.s(R$attr.uikit_colorBlack, context));
        setBackground(gradientDrawable);
        boolean z = content instanceof z;
        if (z) {
            setElevation(kli.a.k(context, 6.0f));
            setOutlineAmbientShadowColor(-16777216);
            setOutlineSpotShadowColor(-16777216);
        }
        boolean z3 = content instanceof y;
        if (z3) {
            image = ((y) content).f133826a;
        } else {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            image = ((z) content).f133829a;
        }
        Image image2 = image;
        this.f133817c = z3 ? new t(kli.a.k(context, 100.0f), kli.a.k(context, 132.0f)) : new t(kli.a.k(context, 100.0f), kli.a.k(context, 112.0f));
        imageView.setScaleType(z3 ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.CENTER_INSIDE);
        if (z3) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        } else {
            layoutParams = new FrameLayout.LayoutParams(kli.a.k(context, 40.0f), kli.a.k(context, 40.0f));
            layoutParams.gravity = 17;
        }
        addView(imageView, layoutParams);
        if (image2 != null) {
            yy0.f.e(jh.d.f(context).Q(), image2, imageView, null, null, 12);
        }
    }

    public final void setSnapshot(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageBitmap(bitmap);
        this.f133816b = imageView;
        addView(imageView, 1, new FrameLayout.LayoutParams(-1, -1));
        this.f133815a.setAlpha(BitmapDescriptorFactory.HUE_RED);
    }
}
