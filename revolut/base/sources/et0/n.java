package et0;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import au0.b2;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import ms0.k3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends LinearLayout {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f129073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ShapeableImageView f129074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UIKitTextView f129075c;
    public final UIKitTextView d;
    public k3 e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setModel(@NotNull m model) {
        Intrinsics.checkNotNullParameter(model, "model");
        zi0.c.g(this.f129074b, model.f129070a);
        kli.a.b(this.f129075c, model.f129071b, ty0.f.f275450a);
        kli.a.b(this.d, model.f129072c, ty0.f.f275450a);
        Float f4 = model.d;
        if (f4 == null) {
            k3 k3Var = this.e;
            if (k3Var != null) {
                k3Var.setVisibility(8);
                return;
            }
            return;
        }
        k3 k3Var2 = this.e;
        if (k3Var2 == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            k3Var2 = new k3(context, null, 6, 0);
            Context context2 = k3Var2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iK = kli.a.k(context2, 40.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iK, iK);
            layoutParams.gravity = 17;
            k3Var2.setLayoutParams(layoutParams);
            this.f129073a.addView(k3Var2);
            this.e = k3Var2;
        }
        k3Var2.setProgress(f4.floatValue());
        k3Var2.setOnClickListener(new b2(model, 23));
        k3Var2.setVisibility(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
        setGravity(16);
        int iK = kli.a.k(context, 4.0f);
        setPaddingRelative(iK, 0, iK, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f129073a = frameLayout;
        ShapeableImageView shapeableImageView = new ShapeableImageView(context);
        shapeableImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        shapeableImageView.setShapeAppearanceModel(ShapeAppearanceModel.builder().setAllCornerSizes(kli.a.k(context, 16.0f)).build());
        this.f129074b = shapeableImageView;
        int iK2 = kli.a.k(context, 68.0f);
        frameLayout.addView(shapeableImageView, new FrameLayout.LayoutParams(iK2, iK2));
        addView(frameLayout, new LinearLayout.LayoutParams(-2, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        UIKitTextView uIKitTextView = new UIKitTextView(context, null, R$attr.internal_textAppearanceEmphasis1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        uIKitTextView.setEllipsize(truncateAt);
        uIKitTextView.setMaxLines(1);
        uIKitTextView.setTextAlignment(5);
        uIKitTextView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
        this.f129075c = uIKitTextView;
        UIKitTextView uIKitTextView2 = new UIKitTextView(context, null, R$attr.internal_textAppearanceBody2);
        uIKitTextView2.setEllipsize(truncateAt);
        uIKitTextView2.setMaxLines(1);
        uIKitTextView2.setTextAlignment(5);
        uIKitTextView2.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        this.d = uIKitTextView2;
        linearLayout.addView(uIKitTextView, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(uIKitTextView2, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(kli.a.k(context, 12.0f));
        layoutParams.setMarginEnd(kli.a.k(context, 4.0f));
        addView(linearLayout, layoutParams);
    }

    public /* synthetic */ n(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
