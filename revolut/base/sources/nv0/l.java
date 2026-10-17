package nv0;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.widget.TextViewCompat;
import aw0.lb;
import com.revolut.core.ui_kit.internal.drawables.WalletWidgetFooterBackgroundDrawable;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit_resources.R$attr;
import iv0.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class l extends ViewGroup implements jr0.i {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f219363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f219364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f219365c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f219366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f219367h;
    public gu0.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final UIKitTextView f219368j;
    public final FrameLayout k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fp0.p f219369l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UIKitTextView f219370m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final UIKitTextView f219371n;
    public final LinearLayout o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f219372p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f219373q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f219374r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n f219375s;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static i b(lb lbVar) {
        int i = o.f219382a[lbVar.f.ordinal()];
        if (i == 1) {
            return h.f219352a;
        }
        if (i == 2) {
            return f.f219350a;
        }
        if (i == 3) {
            return g.f219351a;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static /* synthetic */ void getEmptyContainer$annotations() {
    }

    private static /* synthetic */ void getEmptySubtitle$annotations() {
    }

    private static /* synthetic */ void getEmptyTitle$annotations() {
    }

    private static /* synthetic */ void getFooter$annotations() {
    }

    private static /* synthetic */ void getFooterLabel$annotations() {
    }

    @Override // jr0.i
    public final void Q() {
        gu0.a aVar = this.i;
        if (aVar != null) {
            aVar.cancel();
        }
        this.i = null;
        super.Q();
    }

    public final WalletWidgetFooterBackgroundDrawable a() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorPopoverBackground, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        float fK = kli.a.k(context2, 18.0f);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        float fK2 = kli.a.k(context3, 10.0f);
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        return new WalletWidgetFooterBackgroundDrawable(iS, this.f219363a, fK, fK2, kli.a.k(r5, 6.0f));
    }

    @NotNull
    public final View getFooterClickTarget() {
        return this.k;
    }

    @Override // jr0.i
    @NotNull
    public jr0.g getGlowHighlightManager() {
        jr0.g.Companion.getClass();
        return jr0.f.a(this);
    }

    @NotNull
    public final List<View> getStackClickTargets() {
        return this.f219373q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        int i6 = i3 - i;
        int i21 = i5 - i2;
        int i22 = i21 - this.e;
        this.k.layout(0, i22, i6, i21);
        if (this.f219374r) {
            int i32 = this.f219367h;
            LinearLayout linearLayout = this.o;
            int measuredHeight = (i22 - linearLayout.getMeasuredHeight()) / 2;
            linearLayout.layout(i32, measuredHeight, i6 - i32, linearLayout.getMeasuredHeight() + measuredHeight);
            return;
        }
        int i33 = this.f219364b;
        int i43 = i6 - i33;
        ArrayList arrayList = this.f219372p;
        int size = arrayList.size();
        for (int i59 = 0; i59 < size; i59++) {
            m mVar = (m) arrayList.get(i59);
            int i66 = (this.f219365c * i59) + this.f;
            nv0.a aVar = mVar.f219377b;
            if (aVar != null) {
                aVar.layout(i33 + 16, i66 - this.d, i43 - 16, i21);
            }
            mVar.f219376a.layout(i33, i66, i43, i21);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMax;
        int size = View.MeasureSpec.getSize(i);
        boolean z = this.f219374r;
        int i3 = this.e;
        int i5 = this.f219365c;
        int i6 = this.f;
        if (z) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - (this.f219367h * 2), 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            LinearLayout linearLayout = this.o;
            linearLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(i6 + i5, linearLayout.getMeasuredHeight() + (this.f219366g * 2)) + i3;
        } else {
            int i21 = size - (this.f219364b * 2);
            ArrayList arrayList = this.f219372p;
            int size2 = (arrayList.size() * i5) + i6 + i3;
            int size3 = arrayList.size();
            for (int i22 = 0; i22 < size3; i22++) {
                m mVar = (m) arrayList.get(i22);
                int i32 = (i5 * i22) + i6;
                mVar.f219376a.measure(View.MeasureSpec.makeMeasureSpec(i21, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - i32, 1073741824));
                nv0.a aVar = mVar.f219377b;
                if (aVar != null) {
                    aVar.measure(View.MeasureSpec.makeMeasureSpec(i21, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - (i32 - this.d), 1073741824));
                }
            }
            iMax = size2;
        }
        this.k.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        setMeasuredDimension(size, iMax);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0245 A[LOOP:1: B:86:0x0243->B:87:0x0245, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0267  */
    /* JADX WARN: Type inference failed for: r4v15, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setModel(@org.jetbrains.annotations.NotNull nv0.n r29) {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nv0.l.setModel(nv0.n):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        float fV = kli.a.v(R$attr.uikit_box_corner_radius, context);
        this.f219363a = fV;
        this.f219364b = kli.a.k(context, 16.0f);
        this.f219365c = kli.a.k(context, 70.0f);
        this.d = kli.a.k(context, 4.0f);
        this.e = kli.a.k(context, 64.0f);
        this.f = kli.a.k(context, 16.0f);
        this.f219366g = kli.a.k(context, 24.0f);
        this.f219367h = kli.a.k(context, 16.0f);
        UIKitTextView uIKitTextView = new UIKitTextView(context, null, 6, 0);
        TextViewCompat.setTextAppearance(uIKitTextView, kli.a.x(R$attr.internal_textAppearanceEmphasis2, context));
        uIKitTextView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
        uIKitTextView.setGravity(17);
        this.f219368j = uIKitTextView;
        FrameLayout frameLayout = new FrameLayout(context);
        WalletWidgetFooterBackgroundDrawable walletWidgetFooterBackgroundDrawableA = a();
        WalletWidgetFooterBackgroundDrawable walletWidgetFooterBackgroundDrawableA2 = a();
        fp0.h hVar = fp0.h.f137024a;
        frameLayout.setBackground(dr0.l.f(context, hVar, walletWidgetFooterBackgroundDrawableA, null, walletWidgetFooterBackgroundDrawableA2, 8));
        frameLayout.setOutlineProvider(new s(fV, true));
        frameLayout.setElevation(kli.a.l(context, 6.0f));
        frameLayout.setClickable(true);
        frameLayout.setFocusable(true);
        pd.b.h(frameLayout, true);
        frameLayout.addView(uIKitTextView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.k = frameLayout;
        fp0.m mVar = fp0.p.Companion;
        gp0.g gVar = new gp0.g(hVar);
        mVar.getClass();
        this.f219369l = fp0.m.a(frameLayout, gVar);
        UIKitTextView uIKitTextView2 = new UIKitTextView(context, null, 6, 0);
        TextViewCompat.setTextAppearance(uIKitTextView2, kli.a.x(R$attr.internal_textAppearanceHeading3, context));
        uIKitTextView2.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
        uIKitTextView2.setGravity(17);
        this.f219370m = uIKitTextView2;
        UIKitTextView uIKitTextView3 = new UIKitTextView(context, null, 6, 0);
        TextViewCompat.setTextAppearance(uIKitTextView3, kli.a.x(R$attr.internal_textAppearanceBody2, context));
        uIKitTextView3.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        uIKitTextView3.setGravity(17);
        this.f219371n = uIKitTextView3;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(uIKitTextView2, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = kli.a.k(context, 4.0f);
        Unit unit = Unit.f186387a;
        linearLayout.addView(uIKitTextView3, layoutParams);
        this.o = linearLayout;
        this.f219372p = new ArrayList();
        this.f219373q = new ArrayList();
        this.f219374r = true;
        setClipToOutline(true);
        setOutlineProvider(new s(fV, true));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fV);
        gradientDrawable.setColor(kli.a.s(R$attr.uikit_colorWidgetBackground_70, context));
        setBackground(gradientDrawable);
        addView(linearLayout);
        addView(frameLayout);
    }

    public /* synthetic */ l(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
