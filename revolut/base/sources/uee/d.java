package uee;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.model.account.AccountId;
import efm.d0;
import efm.k;
import g3e.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qr0.i;
import rfm.j;
import rfm.w;
import rfm.x;
import sri.m;
import t33.r;
import tfm.i3;
import ue0.e;
import wsg.n;
import xce.f;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends pri.b implements a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yf.c f279347h;
    public final n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f279348j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final uce.c f279349l;

    public d(yf.c supportInteractor, n walletInteractor, m navigator, String str, uce.c neverReceivedCardMode) {
        Intrinsics.checkNotNullParameter(supportInteractor, "supportInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(neverReceivedCardMode, "neverReceivedCardMode");
        this.f279347h = supportInteractor;
        this.i = walletInteractor;
        this.f279348j = navigator;
        this.k = str;
        this.f279349l = neverReceivedCardMode;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        k xVar;
        b view = (b) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        String str = this.k;
        if (str != null) {
            xVar = k.g(str);
        } else {
            f0 userActions = f0.f322471a;
            yf.c cVar = this.f279347h;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(userActions, "userActions");
            f fVar = (f) cVar.b;
            Intrinsics.checkNotNullParameter(userActions, "userActions");
            d0 d0VarFirstOrError = m70.a.g(fVar.f304122g.f(userActions, true), null, new xce.d(0), 1).firstOrError();
            Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
            xVar = new x(new rfm.m(new j(e.I(d0VarFirstOrError, h0.f322473a, new h(26)), new ubj.c(14, new ud3.m(21)), 2), new ubj.c(15, new ud3.m(22)), 1));
        }
        w wVarH = o70.a.h(te0.w.D0(xVar, this.i.E(AccountId.Personal.f51414a).w()));
        ud3.n nVar = new ud3.n(this, 6);
        tyl.a aVar2 = new tyl.a(this, 17);
        Function1 function1K = K();
        rfm.m mVar = new rfm.m(wVarH, new i(new r(new BreadcrumbException(), 27), (byte) 0), 2);
        Intrinsics.checkNotNullExpressionValue(mVar, "onErrorResumeNext(...)");
        rfm.b bVar = new rfm.b(new m3l.d(25, nVar), new m3l.d(25, function1K), new i3(aVar2));
        mVar.i(bVar);
        Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
        te0.w.j0(this.f239031a, bVar);
    }
}
