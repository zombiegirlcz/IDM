package j60;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.core.app.ComponentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.d0;
import efm.r;
import fmc.z;
import ip0.v7;
import iyi.i;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rnd.k;
import rp0.m;
import rp0.o;
import rp0.y;
import ufm.f;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends yji.d implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f171651c;
    public final m d;
    public final d e;
    public ifm.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Function0 f171652g;

    public c(com.revolut.kompot.navigable.a controller, m dialogDisplayer, d dialogHostFinder) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
        this.f171651c = controller;
        this.d = dialogDisplayer;
        this.e = dialogHostFinder;
    }

    @Override // j60.a
    public final void A(y model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.d.m(model);
    }

    @Override // j60.a
    public final r C() {
        r map = this.d.f256126p.map(new rof.e(12, new k(28)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // j60.a
    public final r E() {
        return this.d.f();
    }

    @Override // j60.a
    public final r F() {
        m mVar = this.d;
        r map = mVar.o.map(new rof.e(15, new rp0.k(mVar, 3)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r map2 = map.map(new j4e.c(7, new j3f.d(17)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return map2;
    }

    @Override // j60.a
    public final efm.b G(y model) {
        Intrinsics.checkNotNullParameter(model, "model");
        d0 d0VarFirstOrError = this.d.h().firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return v7.x(new f(o70.a.i(d0VarFirstOrError), new j4e.c(6, new j4h.m(this, model, 7)), 3), "ignoreElement(...)");
    }

    @Override // yji.d
    public final boolean I() {
        if (!this.d.a()) {
            return false;
        }
        a.v(this, false, null, 3);
        return true;
    }

    @Override // yji.d
    public final void M() {
        r rVarH = this.d.h();
        i iVar = new i(this, 20);
        r rVarOnErrorResumeNext = rVarH.onErrorResumeNext(new z(new j2i.c(new BreadcrumbException(), 1)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a08.r(27, iVar), new a08.r(27, b.f171650a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        this.f = cVarSubscribe;
    }

    @Override // yji.d
    public final void N() {
        this.f171652g = null;
        ifm.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f = null;
    }

    @Override // j60.a
    public final void d(List adapterDelegates) {
        Intrinsics.checkNotNullParameter(adapterDelegates, "adapterDelegates");
        this.d.i(new d4h.a(adapterDelegates, 4));
    }

    @Override // j60.a
    public final void i(y model) {
        Intrinsics.checkNotNullParameter(model, "model");
        kli.c.c(this.f171651c.D2(), false);
        this.d.l(model, false);
    }

    @Override // j60.a
    public final boolean j() {
        return this.d.a();
    }

    @Override // j60.a
    public final void l(boolean z, Function0 doOnHide) {
        Intrinsics.checkNotNullParameter(doOnHide, "doOnHide");
        this.f171652g = doOnHide;
        this.d.b(z);
    }

    @Override // yji.d
    public final void onCreate() {
        com.revolut.kompot.navigable.a aVar = this.f171651c;
        Activity activityM2 = aVar.m2();
        Intrinsics.i(activityM2, "null cannot be cast to non-null type androidx.core.app.ComponentActivity");
        ComponentActivity activity = (ComponentActivity) activityM2;
        ViewGroup parentView = this.e.b(aVar);
        m mVar = this.d;
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

    @Override // j60.a
    public final r t() {
        return this.d.h();
    }

    @Override // j60.a
    public final void x(y model) {
        Intrinsics.checkNotNullParameter(model, "model");
        kli.c.c(this.f171651c.D2(), false);
        this.d.l(model, true);
    }
}
