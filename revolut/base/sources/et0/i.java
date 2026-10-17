package et0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import au0.b2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ms0.k3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends UIKitFrameLayout {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f129036y = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f129037h;
    public TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k3 f129038j;
    public Image k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f129039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f129040m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f129041n;
    public float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f129042p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f129043q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Path f129044r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RectF f129045s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float[] f129046t;
    public final MaterialShapeDrawable u;
    public final int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f129047w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final RippleDrawable f129048x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setCornerRadius$default(i iVar, float f, float f4, float f5, float f6, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f4 = 0.0f;
        }
        if ((i & 4) != 0) {
            f5 = 0.0f;
        }
        if ((i & 8) != 0) {
            f6 = 0.0f;
        }
        iVar.setCornerRadius(f, f4, f5, f6);
    }

    public static /* synthetic */ void setImage$default(i iVar, Image image, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = false;
        }
        iVar.setImage(image, z);
    }

    public final void c() {
        Path path = this.f129044r;
        path.reset();
        RectF rectF = this.f129045s;
        if (rectF.width() <= BitmapDescriptorFactory.HUE_RED || rectF.height() <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        path.addRoundRect(rectF, this.f129046t, Path.Direction.CW);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int iSave = canvas.save();
        canvas.clipPath(this.f129044r);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        this.f129045s.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i, i2);
        c();
    }

    public final void setCornerRadius(float f, float f4, float f5, float f6) {
        if (this.f129041n == f && this.o == f4 && this.f129042p == f5 && this.f129043q == f6) {
            return;
        }
        this.f129041n = f;
        this.o = f4;
        this.f129042p = f5;
        this.f129043q = f6;
        float[] fArr = this.f129046t;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f4;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f5;
        fArr[6] = f6;
        fArr[7] = f6;
        this.u.setShapeAppearanceModel(ShapeAppearanceModel.builder().setTopLeftCornerSize(this.f129041n).setTopRightCornerSize(this.o).setBottomRightCornerSize(this.f129042p).setBottomLeftCornerSize(this.f129043q).build());
        c();
        invalidate();
    }

    public final void setCounter(int i) {
        if (this.f129039l == i) {
            return;
        }
        this.f129039l = i;
        if (i <= 0) {
            TextView textView = this.i;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView2 = this.i;
        if (textView2 == null) {
            textView2 = new TextView(getContext(), null, R$attr.internal_textAppearanceBody3, 0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            textView2.setLayoutParams(layoutParams);
            Context context = textView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView2.setTextColor(kli.a.s(R$attr.uikit_colorWhite, context));
            Context context2 = textView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iK = kli.a.k(context2, 5.0f);
            Context context3 = textView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            int iK2 = kli.a.k(context3, 8.0f);
            textView2.setPadding(iK2, iK, iK2, iK);
            ShapeAppearanceModel.Builder builder = ShapeAppearanceModel.builder();
            Intrinsics.checkNotNullExpressionValue(textView2.getContext(), "getContext(...)");
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(builder.setAllCornerSizes(kli.a.k(r5, 16.0f)).build());
            Context context4 = textView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorGroupedBackground_40, context4)));
            textView2.setBackground(materialShapeDrawable);
            addView(textView2);
            this.i = textView2;
        }
        textView2.setText("+" + i);
        textView2.setVisibility(0);
    }

    public final void setImage(Image image, boolean z) {
        if (!Intrinsics.f(this.k, image) || z) {
            this.k = image;
            zi0.c.g(this.f129037h, image);
        }
    }

    public final void setLoading(Float f, boolean z, @NotNull Function0<Unit> onCancelLoading) {
        Intrinsics.checkNotNullParameter(onCancelLoading, "onCancelLoading");
        boolean z3 = f != null && f.floatValue() < 1.0f;
        if (z3) {
            k3 k3Var = this.f129038j;
            AttributeSet attributeSet = null;
            if (k3Var == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                k3Var = new k3(context, attributeSet, 6, i);
                k3Var.setId(View.generateViewId());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                k3Var.setLayoutParams(layoutParams);
                addView(k3Var);
                this.f129038j = k3Var;
            }
            k3Var.setProgress(f.floatValue());
            k3Var.setStopIconVisible(z);
            if (z) {
                k3Var.setOnClickListener(new b2(onCancelLoading, 22));
            } else {
                k3Var.setOnClickListener(null);
                k3Var.setClickable(false);
            }
        }
        k3 k3Var2 = this.f129038j;
        if (k3Var2 != null) {
            k3Var2.setVisibility(z3 ? 0 : 8);
        }
    }

    public final void setOverlay(boolean z) {
        if (this.f129040m == z) {
            return;
        }
        this.f129040m = z;
        int i = z ? this.f129047w : this.v;
        RippleDrawable rippleDrawable = this.f129048x;
        Drawable drawable = rippleDrawable.getDrawable(0);
        Intrinsics.i(drawable, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
        ((ColorDrawable) drawable).setColor(i);
        rippleDrawable.invalidateSelf();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f129037h = imageView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f129044r = new Path();
        this.f129045s = new RectF();
        this.f129046t = new float[8];
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(new ShapeAppearanceModel());
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(0));
        this.u = materialShapeDrawable;
        int iS = kli.a.s(R$attr.uikit_colorGreyTone5, context);
        this.v = iS;
        this.f129047w = kli.a.s(R$attr.uikit_colorBlack_70, context);
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(kli.a.s(R$attr.uikit_colorGreyTone10, context)), new ColorDrawable(iS), null);
        this.f129048x = rippleDrawable;
        setBackground(materialShapeDrawable);
        addView(imageView);
        imageView2.setImageDrawable(rippleDrawable);
        addView(imageView2);
        imageView2.setOnClickListener(new b2(this, 21));
    }

    public /* synthetic */ i(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
