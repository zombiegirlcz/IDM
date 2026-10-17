package okg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transactions.api.kompot.TransactionListApi$Toggles$UnifiedTransactionList;
import f1h.e;
import jxa.l;
import kotlin.jvm.internal.Intrinsics;
import ks0.n;
import mkg.f;
import oai.s;
import rkg.d;
import thf.i;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jhf.a f226041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final djf.c f226042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yah.a f226043c;
    public final ite.a d;
    public final c4f.a e;
    public final h9h.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gjf.a f226044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f226045h;
    public final s i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s f226046j;
    public final s k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s f226047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s f226048m;

    public a(djf.c cVar, gjf.a aVar, ite.a aVar2, jhf.a aVar3, yah.a aVar4, h9h.a aVar5, c4f.a aVar6) {
        this.f226041a = aVar3;
        this.f226042b = cVar;
        this.f226043c = aVar4;
        this.d = aVar2;
        this.e = aVar6;
        this.f = aVar5;
        this.f226044g = aVar;
        int i = 10;
        this.f226045h = new s(this, 0, i);
        this.i = new s(this, 1, i);
        this.f226046j = new s(this, 2, i);
        this.k = new s(this, 3, i);
        this.f226047l = new s(this, 4, i);
        this.f226048m = new s(this, 5, i);
    }

    public final d a() {
        return f();
    }

    public final n b() {
        return new n(d());
    }

    public final l c() {
        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) this.f226041a).c();
        vc.s.j(aVarC);
        return new l(aVarC, 1);
    }

    public final jkg.d d() {
        gte.a featureToggleInteractor = this.d.b();
        vc.s.j(featureToggleInteractor);
        c.Companion.getClass();
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        s legacyAdapter = this.f226047l;
        Intrinsics.checkNotNullParameter(legacyAdapter, "legacyAdapter");
        s unifiedImpl = this.f226048m;
        Intrinsics.checkNotNullParameter(unifiedImpl, "unifiedImpl");
        return ((jte.d) featureToggleInteractor).c(TransactionListApi$Toggles$UnifiedTransactionList.f91964c) ? (jkg.d) unifiedImpl.get() : (jkg.d) legacyAdapter.get();
    }

    public final ImmutableSet e() {
        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) this.f226041a).c();
        vc.s.j(aVarC);
        f fVar = new f(aVarC);
        y2f.a aVarB = this.e.b();
        vc.s.j(aVarB);
        return ImmutableSet.of((mkg.c) fVar, new mkg.c(aVarB, this.f.A()));
    }

    public final d f() {
        djf.c cVar = this.f226042b;
        thf.l lVarF = cVar.f();
        vc.s.j(lVarF);
        i iVar = (i) cVar.O.get();
        vc.s.j(iVar);
        e eVar = (e) this.f226043c.f312023c.get();
        vc.s.j(eVar);
        return new d(lVarF, iVar, eVar);
    }
}
