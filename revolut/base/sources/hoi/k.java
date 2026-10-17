package hoi;

import android.animation.ValueAnimator;
import android.graphics.BitmapShader;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import hoi.n;
import ix0.i1;
import java.util.ArrayList;
import java.util.List;
import joi.w;
import joi.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f154329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f154330c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k(Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f154328a = i;
        this.f154329b = obj2;
        this.f154330c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        int iC;
        int iC2;
        int i;
        List list;
        int i2;
        boolean z;
        switch (this.f154328a) {
            case 0:
                p pVar = (p) this.f154329b;
                String sectionKey = (String) this.f154330c;
                n transition = (n) this.d;
                w revealClip = (w) this.e;
                Intrinsics.checkNotNullParameter(animation, "animation");
                x xVar = pVar.e;
                Object animatedValue = animation.getAnimatedValue();
                Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue = ((Float) animatedValue).floatValue();
                r10.f fVar = xVar.f177143a;
                Intrinsics.checkNotNullParameter(sectionKey, "sectionKey");
                Intrinsics.checkNotNullParameter(transition, "transition");
                Intrinsics.checkNotNullParameter(revealClip, "revealClip");
                float f = 1.0f - fFloatValue;
                int i3 = revealClip.d;
                int i5 = revealClip.f177142h;
                int i6 = revealClip.e;
                n.c cVar = n.c.f154336c;
                if (transition.equals(cVar)) {
                    iC = i3;
                } else {
                    if (!transition.equals(n.a.f154335c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iC = rim.d.c(i1.c(f, i3, i6));
                }
                int i21 = revealClip.f;
                int i22 = revealClip.f177141g;
                if (transition.equals(cVar)) {
                    iC2 = rim.d.c(i22 * fFloatValue) + i3;
                } else {
                    if (!transition.equals(n.a.f154335c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iC2 = rim.d.c(i1.c(f, i21, i6));
                }
                View view = revealClip.f177139b;
                if (view == null || !fVar.b0(view, sectionKey)) {
                    view = null;
                }
                int height = iC - (view != null ? view.getHeight() : i5 * 2);
                int i32 = iC2 - iC;
                int i33 = 0;
                if (i32 < 0) {
                    i32 = 0;
                }
                qv0.c cVar2 = revealClip.i;
                if (view != null && (cVar2 instanceof qv0.a)) {
                    if (i32 <= i5) {
                        float f4 = i5;
                        view.setClipToOutline(true);
                        iv0.s.Companion.getClass();
                        Intrinsics.checkNotNullParameter(view, "view");
                        ViewOutlineProvider outlineProvider = view.getOutlineProvider();
                        iv0.s sVar = outlineProvider instanceof iv0.s ? (iv0.s) outlineProvider : new iv0.s(f4, true);
                        sVar.f168696a = f4;
                        sVar.e.set(0, 0, 0, 0);
                        int height2 = view.getHeight() + i32;
                        int width = view.getWidth();
                        sVar.f168698c = height2;
                        sVar.d = width;
                        view.setOutlineProvider(sVar);
                        view.invalidateOutline();
                    } else {
                        r10.f.c(view, cVar2);
                    }
                }
                List list2 = revealClip.f177138a;
                float f5 = i5;
                ArrayList arrayList = revealClip.f177140c;
                int iC3 = iC2 - rim.d.c(2 * f5);
                int size = list2.size();
                int i43 = 0;
                while (i43 < size) {
                    View view2 = ((RecyclerView.ViewHolder) list2.get(i43)).itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                    int top = iC - view2.getTop();
                    int top2 = iC2 - view2.getTop();
                    int iG = kotlin.ranges.f.g(top, i33, view2.getHeight());
                    int iG2 = kotlin.ranges.f.g(top2, i33, view2.getHeight());
                    int i59 = iG < iG2 ? 1 : i33;
                    boolean z3 = view2.getBottom() > iC3 && view2.getTop() < iC2;
                    int i66 = iC2;
                    view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    view2.setAlpha(1.0f);
                    if (i59 == 0) {
                        joi.s sVar2 = (joi.s) arrayList.get(i43);
                        view2.setClipToOutline(sVar2 != null ? sVar2.f177128b : false);
                        view2.setOutlineProvider(sVar2 != null ? sVar2.f177129c : null);
                        view2.invalidateOutline();
                        joi.s sVar3 = (joi.s) arrayList.get(i43);
                        int width2 = view2.getWidth();
                        sVar3.getClass();
                        Intrinsics.checkNotNullParameter(view2, "view");
                        Rect rect = sVar3.e;
                        rect.set(0, 0, width2, 0);
                        view2.setClipBounds(rect);
                    } else if (top > 0 || top2 < view2.getHeight() || z3) {
                        int top3 = height - view2.getTop();
                        int top4 = i66 - view2.getTop();
                        joi.s sVar4 = (joi.s) arrayList.get(i43);
                        iv0.s sVar5 = sVar4.d;
                        sVar5.f168696a = f5;
                        i = height;
                        list = list2;
                        i2 = 0;
                        sVar5.e.set(0, top3, 0, 0);
                        int width3 = view2.getWidth();
                        sVar5.f168698c = top4;
                        sVar5.d = width3;
                        int width4 = view2.getWidth();
                        Intrinsics.checkNotNullParameter(view2, "view");
                        Rect rect2 = sVar4.e;
                        rect2.set(0, iG, width4, iG2);
                        view2.setClipBounds(rect2);
                        z = true;
                        view2.setClipToOutline(true);
                        view2.setOutlineProvider(sVar5);
                        view2.invalidateOutline();
                        i43++;
                        i33 = i2;
                        height = i;
                        iC2 = i66;
                        list2 = list;
                    } else {
                        joi.s sVar6 = (joi.s) arrayList.get(i43);
                        view2.setClipToOutline(sVar6 != null ? sVar6.f177128b : false);
                        view2.setOutlineProvider(sVar6 != null ? sVar6.f177129c : null);
                        view2.invalidateOutline();
                        view2.setClipBounds(sVar6 != null ? sVar6.f177127a : null);
                    }
                    i = height;
                    list = list2;
                    z = true;
                    i2 = 0;
                    i43++;
                    i33 = i2;
                    height = i;
                    iC2 = i66;
                    list2 = list;
                }
                return;
            default:
                xp0.g gVar = (xp0.g) this.f154329b;
                xp0.f fVar2 = (xp0.f) this.f154330c;
                View view3 = (View) this.d;
                BitmapShader bitmapShader = (BitmapShader) this.e;
                float fFloatValue2 = ((Float) z9h.n.g(animation, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                fVar2.a(view3, bitmapShader, fFloatValue2, (gVar.a() * fFloatValue2) / 1000.0f, gVar);
                return;
        }
    }
}
