package ms0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yv0.g;

/* JADX INFO: loaded from: classes19.dex */
public final class c2 extends ViewGroup {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f208205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f208206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f208207c;
    public final LinearLayout d;
    public final ImageView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UIKitTextView f208208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f208209h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f208210j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f208211l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final GradientDrawable f208212m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d2 f208213n;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c2(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final float getAnchorU() {
        if (getMeasuredWidth() == 0) {
            return 0.5f;
        }
        FrameLayout frameLayout = this.f208205a;
        return ((frameLayout.getMeasuredWidth() / 2.0f) + frameLayout.getLeft()) / getMeasuredWidth();
    }

    public final float getAnchorV() {
        if (getMeasuredHeight() == 0) {
            return 1.0f;
        }
        int bottom = this.f208205a.getBottom();
        return Math.max(bottom, this.f208208g.getVisibility() == 0 ? r1.getBottom() : 0) / getMeasuredHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        FrameLayout frameLayout = this.f208205a;
        int measuredWidth = frameLayout.getMeasuredWidth();
        int measuredHeight = frameLayout.getMeasuredHeight();
        UIKitTextView uIKitTextView = this.f208208g;
        int measuredWidth2 = uIKitTextView.getMeasuredWidth();
        LinearLayout linearLayout = this.d;
        int measuredWidth3 = linearLayout.getVisibility() == 0 ? linearLayout.getMeasuredWidth() : 0;
        int measuredHeight2 = linearLayout.getMeasuredHeight();
        boolean z3 = getLayoutDirection() == 1;
        int i6 = this.f208209h;
        int i21 = z3 ? ((measuredWidth / 2) - i6) - measuredWidth3 : (-(measuredWidth / 2)) + i6;
        int i22 = measuredWidth / 2;
        int i32 = -i22;
        int i33 = measuredWidth2 / 2;
        int i43 = -i33;
        if (linearLayout.getVisibility() != 0) {
            i21 = 0;
        }
        int iAbs = Math.abs(Math.min(i32, Math.min(i43, i21)));
        int i59 = this.i;
        int iMax = Math.max(0, measuredHeight2 - i59);
        int i66 = iAbs - i22;
        Rect rect = rr0.c.f256608a;
        rr0.c.d(frameLayout, i66, iMax);
        if (linearLayout.getVisibility() == 0) {
            rr0.c.d(linearLayout, z3 ? ((i66 + measuredWidth) - i6) - measuredWidth3 : i66 + i6, (iMax - measuredHeight2) + i59);
        }
        if (uIKitTextView.getVisibility() == 0) {
            rr0.c.d(uIKitTextView, iAbs - i33, iMax + measuredHeight + this.f208210j);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        FrameLayout frameLayout = this.f208205a;
        measureChild(frameLayout, i, i2);
        LinearLayout linearLayout = this.d;
        measureChild(linearLayout, i, i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f208211l, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        UIKitTextView uIKitTextView = this.f208208g;
        uIKitTextView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = frameLayout.getMeasuredWidth();
        int measuredHeight = frameLayout.getMeasuredHeight();
        int measuredWidth2 = linearLayout.getVisibility() == 0 ? linearLayout.getMeasuredWidth() : 0;
        int measuredHeight2 = linearLayout.getVisibility() == 0 ? linearLayout.getMeasuredHeight() : 0;
        int measuredWidth3 = uIKitTextView.getVisibility() == 0 ? uIKitTextView.getMeasuredWidth() : 0;
        int measuredHeight3 = uIKitTextView.getVisibility() == 0 ? uIKitTextView.getMeasuredHeight() : 0;
        int i3 = measuredWidth / 2;
        int i5 = linearLayout.getVisibility() == 0 ? (-i3) + this.f208209h + measuredWidth2 : 0;
        int iMax = Math.max(i3, measuredWidth3 / 2);
        setMeasuredDimension(View.resolveSize(Math.max(iMax, i5) + iMax, i), View.resolveSize(Math.max(0, measuredHeight3 + this.f208210j) + Math.max(0, measuredHeight2 - this.i) + measuredHeight + this.k, i2));
    }

    public final void setContent(@NotNull d2 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model, this.f208213n)) {
            return;
        }
        d2 d2Var = this.f208213n;
        Color.Solid solid = new Color.Solid(R$attr.uikit_colorForeground);
        this.f208213n = model;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iC = io0.a.c(context, model.f208222b);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iC2 = io0.a.c(context2, solid);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int iC3 = io0.a.c(context3, model.f208223c);
        float f = model.f ? 1.1f : 1.0f;
        FrameLayout frameLayout = this.f208205a;
        if (frameLayout.getScaleX() != f) {
            frameLayout.setScaleX(f);
            frameLayout.setScaleY(f);
        }
        rd0.e.q(this.f208206b, Integer.valueOf(iC));
        UIKitTextView uIKitTextView = this.f208208g;
        uIKitTextView.setTextColor(iC2);
        Clause clause = model.d;
        ty0.f fVar = ty0.f.f275450a;
        kli.a.b(uIKitTextView, clause, fVar);
        if (!Intrinsics.f(d2Var != null ? d2Var.f208221a : null, model.f208221a)) {
            this.f208207c.setImageTintList(ColorStateList.valueOf(iC3));
            yy0.f.e(or0.u.k(this).Q(), model.f208221a, this.f208207c, null, null, 12);
        }
        yv0.f fVar2 = model.e;
        LinearLayout linearLayout = this.d;
        if (fVar2 == null) {
            linearLayout.setVisibility(8);
        } else {
            yv0.d dVar = fVar2.d;
            linearLayout.setVisibility(0);
            if (!Intrinsics.f(d2Var != null ? d2Var.e : null, fVar2) || !Intrinsics.f(d2Var.e.d, dVar)) {
                yv0.g gVar = fVar2.f317067b;
                boolean z = gVar instanceof yv0.h;
                GradientDrawable gradientDrawable = this.f208212m;
                if (z) {
                    Context context4 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    int iC4 = io0.a.c(context4, ((yv0.h) gVar).f317070a);
                    gradientDrawable.setColors(new int[]{iC4, iC4});
                } else {
                    if (!(gVar instanceof g.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
                    List listK = zhm.v.k(Integer.valueOf(R$attr.uikit_colorPurple), Integer.valueOf(R$attr.uikit_colorIndigo));
                    ArrayList arrayList = new ArrayList(zhm.w.t(listK, 10));
                    Iterator it8 = listK.iterator();
                    while (it8.hasNext()) {
                        int iIntValue = ((Number) it8.next()).intValue();
                        Context context5 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                        arrayList.add(Integer.valueOf(kli.a.s(iIntValue, context5)));
                    }
                    gradientDrawable.setColors(zhm.d0.c1(arrayList));
                }
                linearLayout.setBackground(gradientDrawable);
                Context context6 = getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                int iC5 = io0.a.c(context6, fVar2.f317068c);
                TextView textView = this.f;
                textView.setTextColor(iC5);
                kli.a.b(textView, fVar2.f317066a, fVar);
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iC5);
                ImageView imageView = this.e;
                imageView.setImageTintList(colorStateListValueOf);
                if (dVar != null) {
                    yy0.f.e(or0.u.k(this).Q(), dVar.getImage(), this.e, null, null, 12);
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c2(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f208209h = kli.a.k(context, 24.0f);
        this.i = kli.a.k(context, 15.0f);
        this.f208210j = -kli.a.k(context, 2.0f);
        this.k = kli.a.k(context, 10.0f);
        this.f208211l = kli.a.k(context, 100.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(99.0f);
        this.f208212m = gradientDrawable;
        LayoutInflater.from(context).inflate(R$layout.internal_view_map_pin, (ViewGroup) this, true);
        View childAt = getChildAt(0);
        Intrinsics.i(childAt, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) childAt;
        this.f208205a = frameLayout;
        View viewFindViewById = frameLayout.findViewById(R$id.pin_background);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f208206b = (ImageView) viewFindViewById;
        View viewFindViewById2 = frameLayout.findViewById(R$id.pin_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f208207c = (ImageView) viewFindViewById2;
        LayoutInflater.from(context).inflate(R$layout.internal_view_map_pin_tooltip, (ViewGroup) this, true);
        View childAt2 = getChildAt(1);
        Intrinsics.i(childAt2, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) childAt2;
        this.d = linearLayout;
        View viewFindViewById3 = linearLayout.findViewById(R$id.tooltip_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.e = (ImageView) viewFindViewById3;
        View viewFindViewById4 = linearLayout.findViewById(R$id.tooltip_value);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f = (TextView) viewFindViewById4;
        UIKitTextView uIKitTextView = new UIKitTextView(context, null, 6, 0);
        uIKitTextView.setTextAppearance(context, R$attr.internal_textAppearanceEmphasis4);
        uIKitTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        uIKitTextView.setEllipsize(TextUtils.TruncateAt.END);
        uIKitTextView.setGravity(1);
        uIKitTextView.setMaxLines(2);
        uIKitTextView.setIncludeFontPadding(true);
        this.f208208g = uIKitTextView;
        addView(uIKitTextView);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public /* synthetic */ c2(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
