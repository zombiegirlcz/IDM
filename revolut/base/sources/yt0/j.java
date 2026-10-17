package yt0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout;
import com.revolut.core.ui_kit.internal.views.linearlayout.UIKitLinearLayout;
import ix0.i1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.ba;
import mx0.ca;
import mx0.da;
import mx0.w5;

/* JADX INFO: loaded from: classes19.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.core.ui_kit.views.o f316567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final da f316568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iv0.s f316569c;
    public final int d;
    public float e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f316570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ValueAnimator f316571h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public tp4.d f316572j;
    public final yo7.p k;

    public j(com.revolut.core.ui_kit.views.o modalView, da mode, iv0.s outlineProvider, int i) {
        Intrinsics.checkNotNullParameter(modalView, "modalView");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(outlineProvider, "outlineProvider");
        this.f316567a = modalView;
        this.f316568b = mode;
        this.f316569c = outlineProvider;
        this.d = i;
        this.i = new Object();
        this.k = new yo7.p(this, 21);
    }

    public final void a(boolean z, boolean z3) {
        float f;
        com.revolut.core.ui_kit.views.o oVar = this.f316567a;
        if (!oVar.getContentContainer$ui_kit_components_release().isLaidOut()) {
            this.f316572j = new tp4.d(this, z, z3);
            return;
        }
        this.f316572j = null;
        rr0.o oVar2 = z ? rr0.o.POPUP : rr0.o.BOTTOM_SHEET;
        float f4 = this.f;
        float fFloatValue = BitmapDescriptorFactory.HUE_RED;
        float f5 = z ? 1.0f : 0.0f;
        float f6 = this.f316569c.f168696a;
        Context context = oVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iB = rr0.q.b(context, oVar2);
        ks0.j jVar = ks0.l.Companion;
        UIKitLinearLayout frame$ui_kit_components_release = oVar.getFrame$ui_kit_components_release();
        Intrinsics.checkNotNullExpressionValue(frame$ui_kit_components_release, "<get-frame>(...)");
        jVar.getClass();
        ks0.l lVarA = ks0.j.a(frame$ui_kit_components_release);
        Context context2 = oVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        float fA = rr0.q.a(oVar.getContentContainer$ui_kit_components_release().getWidth(), context2);
        Object obj2 = this.i;
        Float fB = lVarA.b(obj2);
        float fFloatValue2 = fB != null ? fB.floatValue() : 1.0f;
        if (z) {
            f = fA;
        } else {
            f = fA;
            fA = 1.0f;
        }
        float height = (-(f - 1.0f)) * oVar.getHeight();
        float f32 = -this.d;
        Float fC = lVarA.c(obj2);
        if (fC != null) {
            fFloatValue = fC.floatValue();
        }
        if (!z) {
            height = f32;
        }
        i iVar = new i(fFloatValue, height, fFloatValue2, fA, lVarA, this, f4, f5, f6, iB);
        ValueAnimator valueAnimator = this.f316571h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f316571h = null;
        if (!z3) {
            iVar.invoke(Float.valueOf(1.0f));
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new w5(iVar, 19));
        valueAnimatorOfFloat.addListener(new vt0.f(this, 6));
        valueAnimatorOfFloat.start();
        this.f316571h = valueAnimatorOfFloat;
    }

    public final void b(float f) {
        com.revolut.core.ui_kit.views.o oVar = this.f316567a;
        UIKitFrameLayout contentContainer$ui_kit_components_release = oVar.getContentContainer$ui_kit_components_release();
        if (contentContainer$ui_kit_components_release.getWidth() <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        Context context = oVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        contentContainer$ui_kit_components_release.setScaleX(i1.b(1.0f, rr0.q.a(contentContainer$ui_kit_components_release.getWidth(), context), f));
        e();
    }

    public final void c(float f, int i) {
        boolean z = this.f316568b instanceof ba;
        iv0.s sVar = this.f316569c;
        if (z) {
            i += rim.d.c(i1.b(-this.f316570g, sVar.f168696a, this.f));
        }
        Rect rect = sVar.e;
        int i2 = rect.bottom;
        com.revolut.core.ui_kit.views.o oVar = this.f316567a;
        if (i2 != i) {
            rect.bottom = i;
            oVar.getContentContainer$ui_kit_components_release().invalidateOutline();
        }
        List<View> footerViews = oVar.getFooterViews();
        int size = footerViews.size();
        for (int i3 = 0; i3 < size; i3++) {
            footerViews.get(i3).setTranslationY(f);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean d() {
        return ((Boolean) jo0.g.k.getValue()).booleanValue() && (this.f316568b instanceof ca);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void e() {
        int iG;
        if (((Boolean) jo0.g.k.getValue()).booleanValue()) {
            com.revolut.core.ui_kit.views.o oVar = this.f316567a;
            if (oVar.getHeightTransitionInfo$ui_kit_components_release().f108182a > 0) {
                c(oVar.getFrame$ui_kit_components_release().getHeight() - r1.f108183b, 0);
                return;
            }
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(oVar.getFrame$ui_kit_components_release());
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
            int peekHeight = bottomSheetBehaviorFrom.getPeekHeight();
            if (peekHeight != 0) {
                int height = oVar.getFrame$ui_kit_components_release().getHeight();
                int bottom = oVar.getFrame$ui_kit_components_release().getBottom() - height;
                int i = height - peekHeight;
                if (i < 0) {
                    i = 0;
                }
                iG = kotlin.ranges.f.g(bottom, 0, i);
            } else {
                iG = 0;
            }
            boolean zD = d();
            int i2 = this.d;
            c(r0 - (d() ? (int) ((1.0f - this.e) * i2) : 0), ((-iG) - (zD ? (int) ((1.0f - this.e) * (this.f316570g + i2)) : 0)) + (d() ? (int) (this.e * this.f316569c.f168696a) : 0));
        }
    }
}
