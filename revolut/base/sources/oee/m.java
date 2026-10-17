package oee;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nee.d f224589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l93.f f224590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uz2.b f224591c;
    public final l93.e d;
    public final ang.f e;
    public final yf.c f;

    public m(nee.d state, l93.f cardsInteractor, fk3.a configurationInteractor, uz2.b replaceCardInteractor, l93.e changeAddressAllowanceInteractor, ang.f userInteractor, yf.c supportInteractor) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(replaceCardInteractor, "replaceCardInteractor");
        Intrinsics.checkNotNullParameter(changeAddressAllowanceInteractor, "changeAddressAllowanceInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(supportInteractor, "supportInteractor");
        this.f224589a = state;
        this.f224590b = cardsInteractor;
        this.f224591c = replaceCardInteractor;
        this.d = changeAddressAllowanceInteractor;
        this.e = userInteractor;
        this.f = supportInteractor;
    }

    public final ufm.i a() {
        d0 d0VarFirstOrError = m70.a.g(((ha3.m) this.d).b(l93.c.RETAIL), null, new ob2.a(17), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        d0 d0VarB = b();
        oc8.e eVar = new oc8.e(9, new obg.q(19));
        d0VarB.getClass();
        ufm.i iVar = new ufm.i(d0VarB, eVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(w.I0(d0VarFirstOrError, iVar, this.e.f(false)), new oc8.e(10, new obg.q(20)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }

    public final d0 b() {
        d0 d0VarFirstOrError = this.f224589a.f214489a.c(te0.s.f270018a).distinctUntilChanged().flatMapSingle(new oc8.e(8, new k(this, 0))).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }
}
