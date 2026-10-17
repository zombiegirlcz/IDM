package r60;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.view.ComponentActivity;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import cr0.h;
import efm.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qp5.x;
import r38.m;
import rp0.o;
import rp0.p0;
import rp0.u0;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends yji.d implements b, a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f251627c;
    public final p0 d;
    public final j60.d e;
    public ifm.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Function0 f251628g;

    public d(com.revolut.kompot.navigable.a controller, p0 displayer, j60.d dialogHostFinder) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(displayer, "displayer");
        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
        this.f251627c = controller;
        this.d = displayer;
        this.e = dialogHostFinder;
    }

    @Override // yji.d
    public final boolean I() {
        h state;
        BottomExpandableDialogView bottomExpandableDialogViewC;
        o oVar = this.d.f256147a.f;
        if (oVar == null || (bottomExpandableDialogViewC = oVar.c()) == null || (state = bottomExpandableDialogViewC.getState()) == null) {
            state = h.HIDDEN;
        }
        if (state == h.HIDDEN) {
            return false;
        }
        Q();
        return true;
    }

    @Override // yji.d
    public final void M() {
        r rVarH = this.d.f256147a.h();
        m mVar = new m(this, 13);
        r rVarOnErrorResumeNext = rVarH.onErrorResumeNext(new pak.h(new x(new BreadcrumbException(), 11), (char) 0));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o9h.d(15, mVar), new o9h.d(15, c.f251626a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        this.f = cVarSubscribe;
    }

    @Override // yji.d
    public final void N() {
        ifm.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public final void Q() {
        this.d.a();
    }

    public final void R(u0 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.d.g(model);
    }

    @Override // yji.d
    public final void onCreate() {
        com.revolut.kompot.navigable.a aVar = this.f251627c;
        Activity activityM2 = aVar.m2();
        Intrinsics.i(activityM2, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        ComponentActivity activity = (ComponentActivity) activityM2;
        ViewGroup parentView = this.e.b(aVar);
        p0 p0Var = this.d;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(parentView, "promptParentView");
        rp0.m mVar = p0Var.f256147a;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        mki.c cVar = mVar.e;
        if (cVar != null) {
            LifecycleOwner lifecycleOwner = mVar.d;
            if (lifecycleOwner == null) {
                Intrinsics.r("lifecycleOwner");
                throw null;
            }
            lifecycleOwner.getLifecycle().removeObserver(cVar);
        }
        mVar.e = null;
        o oVar = mVar.f;
        if (oVar != null) {
            mVar.f = null;
            oVar.b();
        }
        mVar.f256118b = parentView;
        mVar.d = activity;
        mVar.f256119c = activity;
    }
}
