package rea;

import atg.v;
import com.revolut.core.model.account.AccountId;
import efm.d0;
import et6.h1;
import java.util.ArrayList;
import java.util.List;
import jid.z;
import kotlin.jvm.internal.Intrinsics;
import pfm.r;
import r4k.x;
import te0.w;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements eda.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z71.a f253578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f253579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f253580c;
    public final fk3.b d;
    public final z e;

    public m(z71.a revolutBankAccountsRepository, wsg.n walletInteractor, h1 freelancerInteractor, fk3.b configurationRepository, z delistedPocketsInteractor) {
        Intrinsics.checkNotNullParameter(revolutBankAccountsRepository, "revolutBankAccountsRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(delistedPocketsInteractor, "delistedPocketsInteractor");
        this.f253578a = revolutBankAccountsRepository;
        this.f253579b = walletInteractor;
        this.f253580c = freelancerInteractor;
        this.d = configurationRepository;
        this.e = delistedPocketsInteractor;
    }

    public final ufm.i b(AccountId accountId, io3.l pocketType, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        int i = k.f253577a[pocketType.ordinal()];
        z zVar = this.e;
        if (i == 1) {
            d0 d0VarJ = zVar.j(accountId);
            f0 f0Var = f0.f322471a;
            ufm.i iVar = new ufm.i(ue0.e.F(d0VarJ, new eda.a(f0Var, f0Var)), new rbf.c(new qz9.o(this, 17, currency, accountId), 23), 0);
            Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
            return iVar;
        }
        if (i != 2) {
            throw new IllegalArgumentException("Unable to create pocket of type: " + pocketType);
        }
        d0 d0VarJ2 = zVar.j(AccountId.Personal.f51414a);
        f0 f0Var2 = f0.f322471a;
        ufm.i iVar2 = new ufm.i(ue0.e.F(d0VarJ2, new eda.a(f0Var2, f0Var2)), new rbf.c(new x(this, currency, 29), 22), 0);
        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
        return iVar2;
    }

    public final r c(AccountId accountId, io3.d pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        io3.k kVar = pocket.f;
        String id10 = pocket.f163145a;
        if (kVar == io3.k.DELISTED) {
            return w.g0(this.e.u(pocket, false));
        }
        j31.g gVar = (j31.g) this.f253578a;
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        efm.b bVarDeactivatePocket = gVar.f170930a.deactivatePocket(id10);
        qsg.b bVar = gVar.e;
        xi0.a aVar = xi0.b.Companion;
        String str = pocket.f163147c;
        aVar.getClass();
        xi0.b currency = xi0.a.a(str);
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        pfm.h hVar = new pfm.h(new aed.d((v) bVar, accountId, null, currency, 2), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        pfm.a aVarE = bVarDeactivatePocket.e(w.g0(hVar));
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        pfm.a aVarE2 = aVarE.e(gVar.f.g(new j31.d(accountId, io3.l.CURRENT), true));
        Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
        r rVarG0 = w.g0(aVarE2);
        wsg.n nVar = this.f253579b;
        pfm.a aVarE3 = rVarG0.e(nVar.i0(accountId));
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        d0 d0VarFirstOrError = nim.a.w(osg.b.g(nVar, w4l.h.f294642c, null, null, null, null, null, accountId, 32), new wb3.k(id10, 27)).firstOrError();
        wp5.x xVar = new wp5.x(new wsg.f(nVar, id10, accountId, 1), 21);
        d0VarFirstOrError.getClass();
        pfm.a aVar2 = new pfm.a(d0VarFirstOrError, xVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        pfm.a aVarE4 = aVarE3.e(aVar2);
        Intrinsics.checkNotNullExpressionValue(aVarE4, "andThen(...)");
        return w.g0(aVarE4);
    }

    public final r d(AccountId accountId, io3.d pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        if (pocket.f == io3.k.DELISTED) {
            return w.g0(this.e.u(pocket, true));
        }
        r rVarD = ((j31.g) this.f253578a).d(accountId, pocket);
        wsg.n nVar = this.f253579b;
        pfm.a aVarE = rVarD.e(nVar.i0(accountId));
        String id10 = pocket.f163145a;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        d0 d0VarFirstOrError = nim.a.w(osg.b.g(nVar, w4l.h.f294642c, null, null, null, null, null, accountId, 32), new wb3.k(id10, 24)).firstOrError();
        wp5.x xVar = new wp5.x(new wsg.f(nVar, id10, accountId, 0), 14);
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(d0VarFirstOrError, xVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        pfm.a aVarE2 = aVarE.e(aVar);
        Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
        return w.g0(aVarE2);
    }

    public final pfm.a e(AccountId accountId, io3.l pocketType, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        xi0.b.Companion.getClass();
        d0 d0VarR = osg.b.r(this.f253579b, xi0.a.a(currency), pocketType, io3.i.INTERNAL, accountId, 20);
        j jVar = new j(new i(this, accountId, 3), 1);
        d0VarR.getClass();
        pfm.a aVar = new pfm.a(d0VarR, jVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final ArrayList f() {
        List listH = osg.b.h(this.f253579b, io3.l.CURRENT, io3.i.INTERNAL, 26);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listH) {
            io3.k[] elements = {io3.k.INACTIVE, io3.k.ACTIVE};
            Intrinsics.checkNotNullParameter(elements, "elements");
            if (kotlin.collections.d.y0(elements).contains(((io3.d) obj2).f)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final ufm.i g(AccountId accountId, io3.l pocketType, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        d0 d0VarR = osg.b.r(this.f253579b, currency, pocketType, io3.i.INTERNAL, accountId, 20);
        rbf.c cVar = new rbf.c(new rd3.m(19), 26);
        d0VarR.getClass();
        ufm.i iVar = new ufm.i(d0VarR, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.D(iVar, new q2k.b((Object) this, (Object) currency, (Object) pocketType, (Object) accountId, false, 15));
    }

    public final d0 h(AccountId accountId, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return this.f253579b.z(accountId, id10);
    }

    public final pfm.a i(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return this.f253579b.i0(accountId);
    }
}
