package vu0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.ProgressSwitcher;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class w extends ProgressSwitcher implements o, rr0.d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f292178q = R$attr.internal_textAppearanceEmphasis2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatImageView f292179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final UIKitTextView f292180h;
    public final LinearLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final rr0.g f292181j;
    public final iv0.s k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f292182l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f292183m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f292184n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fp0.p f292185p;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@NotNull Context context) {
        super(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        rr0.g gVarB = vc.s.b(this, false);
        this.f292181j = gVarB;
        fp0.m mVar = fp0.p.Companion;
        gp0.g gVar = new gp0.g(0);
        mVar.getClass();
        this.f292185p = fp0.m.a(this, gVar);
        setFocusable(true);
        setClickable(true);
        gVarB.i = false;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.internal_swipe_icon_view);
        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f292179g = appCompatImageView;
        UIKitTextView uIKitTextView = new UIKitTextView(context, null, 6, 0);
        uIKitTextView.setId(R$id.internal_swipe_text_view);
        jb3.l.e(uIKitTextView, f292178q);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = kli.a.k(context, 2.0f);
        layoutParams.setMarginStart(kli.a.k(context, 8.0f));
        layoutParams.setMarginEnd(kli.a.k(context, 8.0f));
        uIKitTextView.setLayoutParams(layoutParams);
        uIKitTextView.setGravity(17);
        uIKitTextView.setMaxLines(1);
        uIKitTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.f292180h = uIKitTextView;
        linearLayout.addView(appCompatImageView);
        linearLayout.addView(uIKitTextView);
        this.i = linearLayout;
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        setProgressSize(kli.a.k(context, 24.0f));
        setProgressTintAttr(R$attr.uikit_colorOnAccentNeutral);
        setClipToOutline(true);
        iv0.s sVar = new iv0.s(kli.a.k(context, qv0.h.EXTRA_LARGE.a()), true);
        this.k = sVar;
        setOutlineProvider(sVar);
    }

    @Override // vu0.o
    public final void O(n side, float f, float f4, float f5, boolean z) {
        Intrinsics.checkNotNullParameter(side, "side");
        int i = x.f292186a[side.ordinal()];
        if (i == 1) {
            setLeftCornerProgress$ui_kit_components_release(f4);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            setRightCornerProgress$ui_kit_components_release(f4);
        }
        setContentTranslationX$ui_kit_components_release(f5);
    }

    @Override // vu0.o
    public final efm.r R() {
        return this.f292181j.u;
    }

    @Override // sy0.a
    public final rr0.f V() {
        return this.f292181j.V();
    }

    @Override // vu0.o
    public final void b0() {
    }

    @Override // vu0.o
    @NotNull
    public fp0.p getClickHandler() {
        return this.f292185p;
    }

    @Override // vu0.o
    @NotNull
    public View getView() {
        return this;
    }

    @Override // vu0.o
    public final boolean l() {
        return false;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        gq0.g.b(info);
    }

    public final void setContentTranslationX$ui_kit_components_release(float f) {
        this.i.setTranslationX(f);
        AppCompatImageView progressView = getProgressView();
        if (progressView != null) {
            progressView.setTranslationX(f);
        }
    }

    public final void setLeftCornerProgress$ui_kit_components_release(float f) {
        iv0.s sVar = this.k;
        int i = -((int) (sVar.f168696a * f));
        Rect rect = sVar.e;
        if (rect.left != i) {
            rect.left = i;
            invalidateOutline();
        }
    }

    @Override // vu0.o
    public void setModel(@NotNull m model) {
        Intrinsics.checkNotNullParameter(model, "model");
        SwipeToActionDelegate.SwipeAction swipeAction = model.f292172a;
        Image image = swipeAction.f53506b;
        Clause clause = swipeAction.f53507c;
        int i = model.f292173b;
        int i2 = model.f292174c;
        yy0.f fVarQ = or0.u.k(this).Q();
        AppCompatImageView appCompatImageView = this.f292179g;
        yy0.f.e(fVarQ, image, appCompatImageView, null, null, 12);
        UIKitTextView uIKitTextView = this.f292180h;
        kli.a.b(uIKitTextView, clause, ty0.f.f275450a);
        if (!this.f292183m || this.f292182l != i) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iS = kli.a.s(R$attr.uikit_colorBlack_10, context);
            setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[]{R.attr.state_focused}, new int[]{R.attr.state_activated}, new int[0]}, new int[]{iS, iS, iS, i}), new ColorDrawable(i), null));
            this.f292182l = i;
            this.f292183m = true;
        }
        if (this.o && this.f292184n == i2) {
            return;
        }
        uIKitTextView.setTextColor(i2);
        appCompatImageView.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
        setProgressTintColor(i2);
        this.f292184n = i2;
        this.o = true;
    }

    public final void setRightCornerProgress$ui_kit_components_release(float f) {
        iv0.s sVar = this.k;
        int i = (int) (sVar.f168696a * f);
        Rect rect = sVar.e;
        if (rect.right != i) {
            rect.right = i;
            invalidateOutline();
        }
    }
}
