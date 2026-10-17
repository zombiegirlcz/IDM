package zok;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import stj.k;
import vc.s;
import vtc.h0;
import yok.l;
import yok.m;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements pla.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xmg.a f324064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e79.a f324065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f324066c;
    public final rtj.g d;
    public final ite.a e;
    public final rk0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ei5.d f324067g;

    public a(rk0.c cVar, ei5.d dVar, ite.a aVar, e79.a aVar2, rtj.g gVar, h0 h0Var, xmg.a aVar3) {
        this.f324064a = aVar3;
        this.f324065b = aVar2;
        this.f324066c = h0Var;
        this.d = gVar;
        this.e = aVar;
        this.f = cVar;
        this.f324067g = dVar;
    }

    @Override // pla.a
    public final rul.e a() {
        xmg.a aVar = this.f324064a;
        return new rul.e(aVar.e(), aVar.d());
    }

    @Override // pla.a
    public final kd6.a d() {
        l61.a aVarB = this.f324064a.b();
        s.j(aVarB);
        return new kd6.a(aVarB, 1);
    }

    @Override // pla.a
    public final smd.s e() {
        l61.a userCompanyInteractor = this.f324064a.b();
        s.j(userCompanyInteractor);
        gte.a featureToggleInteractor = this.e.b();
        s.j(featureToggleInteractor);
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        smd.s sVar = new smd.s();
        sVar.f264432a = userCompanyInteractor;
        sVar.f264433b = featureToggleInteractor;
        return sVar;
    }

    @Override // pla.a
    public final m f() {
        return new m();
    }

    @Override // pla.a
    public final Set g() {
        gte.a aVarB = this.e.b();
        s.j(aVarB);
        mk0.a personalisationStorage = this.f.a();
        s.j(personalisationStorage);
        i.Companion.getClass();
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        yok.b bVar = new yok.b(aVarB, new qie.f(personalisationStorage));
        ji5.m mVarE = this.f324067g.e();
        s.j(mVarE);
        return ImmutableSet.of((yok.d) bVar, new yok.d(mVarE));
    }

    @Override // pla.a
    public final l h() {
        return new l();
    }

    @Override // pla.a
    public final utk.f j() {
        r69.a aVarA = this.f324065b.a();
        s.j(aVarA);
        uvl.c cVarA = this.f324066c.a();
        k kVar = (k) this.d.o.get();
        s.j(kVar);
        return new utk.f(aVarA, cVarA, kVar);
    }
}
