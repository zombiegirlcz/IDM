package bii;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.o;
import com.revolut.kompot.common.ModalDestination;
import hli.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lki.h;
import lki.i;
import lki.j;
import lki.k;
import lki.l;
import lki.m;
import lki.n;
import lki.p;
import lki.q;
import lki.r;
import lki.s;
import mx0.ba;
import mx0.ca;
import mx0.da;
import mx0.ea;
import mx0.fa;
import mx0.ga;
import mx0.ha;
import mx0.ia;
import mx0.ja;
import mx0.ka;
import r10.t;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f15503a;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f15503a = new o(context, null, 6, 0);
    }

    @Override // lki.r
    public final void a(s onTransitionEnd) {
        Intrinsics.checkNotNullParameter(onTransitionEnd, "onTransitionEnd");
        o oVar = this.f15503a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(onTransitionEnd, "onTransitionEnd");
        Context context = oVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (jq0.a.a(context)) {
            oVar.f59578s.a(onTransitionEnd);
        } else {
            oVar.f59578s.b();
            onTransitionEnd.invoke();
        }
    }

    @Override // lki.r
    public final void b() {
        o oVar = this.f15503a;
        ViewParent parent = oVar.getParent();
        e eVar = parent instanceof e ? (e) parent : null;
        WindowInsets latestAppliedInsets = eVar != null ? eVar.getLatestAppliedInsets() : null;
        if (latestAppliedInsets != null) {
            ViewCompat.dispatchApplyWindowInsets(oVar, WindowInsetsCompat.toWindowInsetsCompat(latestAppliedInsets));
        }
        oVar.f59578s.b();
    }

    @Override // lki.r
    public final void c(vt3.a aVar) {
        this.f15503a.setOnDismissListener(aVar);
    }

    @Override // lki.r
    public final void d(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        o oVar = this.f15503a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getId() == -1) {
            view.setId(R$id.internal_modalContainer_content);
        }
        oVar.f59571j = Integer.valueOf(view.getId());
        FrameLayout frameLayout = new FrameLayout(oVar.getContext());
        frameLayout.setId(R$id.internal_modalContainer_contentWrapper);
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        oVar.f59576q = frameLayout;
        oVar.f59572l.addView(frameLayout, 0, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // lki.r
    public final r e(ModalDestination.Style incomingStyle, t navActionsSchedulerObserver) {
        Intrinsics.checkNotNullParameter(incomingStyle, "style");
        Intrinsics.checkNotNullParameter(navActionsSchedulerObserver, "navActionsSchedulerObserver");
        o oVar = this.f15503a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(incomingStyle, "incomingStyle");
        if (oVar.f59578s.c(incomingStyle)) {
            return new b(oVar, navActionsSchedulerObserver);
        }
        return null;
    }

    @Override // lki.r
    public final void f(q value) {
        ka faVar;
        ka kaVar;
        da caVar;
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.equals(m.f196466a)) {
            kaVar = ga.f209720a;
        } else if (value.equals(lki.o.f196468a)) {
            kaVar = ia.f209759a;
        } else if (value.equals(p.f196469a)) {
            kaVar = ja.f209785a;
        } else {
            if (value instanceof k) {
                j jVar = ((k) value).f196464a;
                if (jVar instanceof i) {
                    i iVar = (i) jVar;
                    caVar = new ca(iVar.f196461a, iVar.f196462b, iVar.f196463c);
                } else {
                    if (!jVar.equals(h.f196460a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    caVar = ba.f209616a;
                }
                faVar = new ea(caVar);
            } else if (value.equals(n.f196467a)) {
                kaVar = ha.f209736a;
            } else {
                if (!(value instanceof l)) {
                    throw new NoWhenBranchMatchedException();
                }
                faVar = new fa(((l) value).f196465a);
            }
            kaVar = faVar;
        }
        this.f15503a.setStyle(kaVar);
    }

    @Override // lki.r
    public final void g(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        o oVar = this.f15503a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        FrameLayout frameLayout = oVar.f59576q;
        if (frameLayout != null) {
            frameLayout.removeView(view);
        }
        oVar.f59572l.removeView(oVar.f59576q);
        oVar.f59576q = null;
        oVar.f59571j = null;
    }

    @Override // lki.r
    public final View getView() {
        return this.f15503a;
    }

    @Override // lki.r
    public final void h(s onTransitionEnd) {
        Intrinsics.checkNotNullParameter(onTransitionEnd, "onTransitionEnd");
        o oVar = this.f15503a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(onTransitionEnd, "onTransitionEnd");
        oVar.f59581x.d(oVar);
        mhd.b bVar = new mhd.b(oVar, onTransitionEnd, 26);
        Context context = oVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (jq0.a.a(context)) {
            oVar.f59578s.l(bVar);
        } else {
            oVar.f59578s.e();
            bVar.invoke();
        }
    }
}
