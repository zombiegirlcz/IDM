package m2j;

import a08.p0;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.defi.accounts.api.DeFiAccountsApi$Toggles$CryptoDeFiAccount;
import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData$AdditionalConfig$IgnoreHiddenAccountsFiltering;
import et6.h1;
import et6.i2;
import g48.r0;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import om4.x2;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements i1j.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f202045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kdh.b f202046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final su9.c f202047c;

    public j(q internalInteractor, kdh.b balancesSortInteractor, su9.c hiddenBalancesInteractor) {
        Intrinsics.checkNotNullParameter(internalInteractor, "internalInteractor");
        Intrinsics.checkNotNullParameter(balancesSortInteractor, "balancesSortInteractor");
        Intrinsics.checkNotNullParameter(hiddenBalancesInteractor, "hiddenBalancesInteractor");
        this.f202045a = internalInteractor;
        this.f202046b = balancesSortInteractor;
        this.f202047c = hiddenBalancesInteractor;
    }

    public static void c(aim.e eVar, c cVar) {
        if (cVar instanceof b) {
            eVar.add(((b) cVar).f202014a);
        } else if (!Intrinsics.f(cVar, a.f202010a)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static efm.r d(efm.r rVar) {
        efm.r rVarFilter = rVar.filter(new m1i.j0(new m2g.c(7), 10));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Data data = new Data(a.f202010a, null, false, 6, null);
        efm.r rVarDefaultIfEmpty = rVarFilter.materialize().publish(new p0(26, new b8d.d0(data, 4))).dematerialize(new p0(26, h.f202039a)).defaultIfEmpty(data);
        Intrinsics.checkNotNullExpressionValue(rVarDefaultIfEmpty, "defaultIfEmpty(...)");
        return rVarDefaultIfEmpty;
    }

    public final efm.r e(BalancesInteractor$InputData inputData, i1j.a aVar) {
        efm.r rVar;
        kotlin.coroutines.g gVar;
        String str;
        efm.r rVarC;
        efm.r rVar2;
        efm.r rVarJust;
        efm.r rVar3;
        String str2;
        efm.r rVar4;
        efm.r rVarW;
        efm.r rVarW2;
        z zVar;
        a aVar2;
        efm.r rVar5;
        String str3;
        efm.r rVar6;
        efm.r rVarH;
        kotlin.coroutines.g gVar2;
        String str4;
        efm.r rVar7;
        efm.r rVar8;
        a aVar3;
        efm.r rVar9;
        efm.r rVar10;
        efm.r rVarH2;
        efm.r rVarH3;
        efm.r rVarJ;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        q qVar = this.f202045a;
        efm.r rVarE = qVar.e(inputData);
        BalancesInteractor$InputData.RegisteredIdentity registeredIdentity = inputData.f99396g;
        efm.r rVarD = d(rVarE);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        n2j.e eVar = qVar.f202079s;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Set set = inputData.f99395c;
        boolean zContains = set.contains(k1j.a.REV_POINTS);
        int i = 9;
        a aVar4 = a.f202010a;
        efm.r rVarH4 = kli.a.h(rVarD, d(!zContains ? zi0.c.j(aVar4) : nim.a.w(eVar.f211564a.c(false), new n1.y(eVar, i))));
        r0 r0Var = qVar.e;
        w4l.h loadingStrategy = w4l.h.f294642c;
        cxe.u uVarH = r0Var.h(loadingStrategy);
        kotlin.coroutines.g gVar3 = kotlin.coroutines.g.f186406a;
        efm.r rVarFilter = nim.a.w(rd0.e.c(uVarH, gVar3), new m2g.c(10)).filter(new m1i.j0(new m2g.c(3), i));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        od0.i.Companion.getClass();
        Data data = new Data(od0.i.f224256b, null, false, 6, null);
        efm.r rVarDefaultIfEmpty = rVarFilter.materialize().publish(new p0(26, new b8d.d0(data, 5))).dematerialize(new p0(26, i.f202042a)).defaultIfEmpty(data);
        Intrinsics.checkNotNullExpressionValue(rVarDefaultIfEmpty, "defaultIfEmpty(...)");
        efm.r rVarR = pd.b.r(rVarDefaultIfEmpty, new li8.n(this, 12, inputData, aVar));
        efm.r rVarD2 = d(qVar.h(inputData, loadingStrategy, aVar));
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (set.contains(k1j.a.CREDIT_CARDS)) {
            rVar = rVarD2;
            gVar = gVar3;
            str = "just(...)";
            rVarC = rd0.e.c(nim.a.v(((x2) qVar.d).m(loadingStrategy), new l(qVar, inputData, 3)), gVar);
        } else {
            gVar = gVar3;
            rVar = rVarD2;
            str = "just(...)";
            rVarC = efm.r.just(new Data(aVar4, null, false, 6, null));
            Intrinsics.checkNotNullExpressionValue(rVarC, str);
        }
        efm.r rVarD3 = d(rVarC);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        int i2 = 4;
        if (set.contains(k1j.a.PRO)) {
            h1 h1Var = qVar.f;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            rVarJust = nim.a.w(rd0.e.c(((i2) h1Var.e).c(loadingStrategy), gVar), new l(qVar, inputData, i2));
            rVar2 = rVarD3;
        } else {
            rVar2 = rVarD3;
            rVarJust = efm.r.just(new Data(aVar4, null, false, 6, null));
            Intrinsics.h(rVarJust);
        }
        efm.r rVarD4 = d(rVarJust);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        int i3 = 13;
        sfm.b bVar = new sfm.b(qVar.d(inputData, k1j.a.PRO_VAULTS, aVar), new m1i.j0(new li8.n(qVar, i3, aVar, inputData), i3), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        efm.r rVarD5 = d(nim.a.w(bVar, new m2g.c(qVar, 14)));
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (set.contains(k1j.a.EXTERNAL_POCKETS)) {
            rVar3 = rVarD5;
            str2 = "flatMapObservable(...)";
            rVar4 = rVarD4;
            if (inputData.f99393a == k1j.d.RETAIL) {
                rVarW = nim.a.w(qVar.f202069c.V(), new m2g.c(9));
            } else {
                efm.r rVarJust2 = efm.r.just(new Data(zhm.f0.f322471a, null, false, 6, null));
                Intrinsics.checkNotNullExpressionValue(rVarJust2, str);
                rVarW = rVarJust2;
            }
            rVarW2 = nim.a.w(rVarW, new m(qVar, inputData, 5));
        } else {
            rVar3 = rVarD5;
            str2 = "flatMapObservable(...)";
            rVar4 = rVarD4;
            rVarW2 = efm.r.just(new Data(aVar4, null, false, 6, null));
            Intrinsics.checkNotNullExpressionValue(rVarW2, str);
        }
        efm.r rVarD6 = d(rVarW2);
        efm.r rVarD7 = d(qVar.f(inputData, w4l.j.f294644c));
        z zVar2 = qVar.o;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (set.contains(k1j.a.YOUTH_POCKETS)) {
            Intrinsics.checkNotNullParameter(registeredIdentity, "registeredIdentity");
            zVar = zVar2;
            efm.r rVarSwitchMap = zVar2.b().switchMap(new m1i.j0(new u(zVar2, registeredIdentity, 2), 26));
            Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
            rVarH = nim.a.w(rVarSwitchMap, new m(qVar, inputData, 0));
            rVar5 = rVarD6;
            str3 = "registeredIdentity";
            rVar6 = rVarD7;
            aVar2 = aVar4;
        } else {
            zVar = zVar2;
            aVar2 = aVar4;
            rVar5 = rVarD6;
            str3 = "registeredIdentity";
            rVar6 = rVarD7;
            rVarH = te0.w.h(new Data(aVar2, null, false, 6, null));
        }
        efm.r rVarD8 = d(rVarH);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        a aVar5 = aVar2;
        sfm.b bVar2 = new sfm.b(qVar.d(inputData, k1j.a.YOUTH_VAULTS, aVar), new m1i.j0(new l(qVar, inputData, 2), 14), 2);
        String str5 = str2;
        Intrinsics.checkNotNullExpressionValue(bVar2, str5);
        efm.r rVarD9 = d(bVar2);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (set.contains(k1j.a.YOUTH_SAVINGS)) {
            Intrinsics.checkNotNullParameter(registeredIdentity, str3);
            efm.r rVarSwitchMap2 = zVar.b().switchMap(new m1i.j0(new u(zVar, registeredIdentity, 0), 22));
            Intrinsics.checkNotNullExpressionValue(rVarSwitchMap2, "switchMap(...)");
            rVarH2 = nim.a.w(rVarSwitchMap2, new m(qVar, inputData, 1));
            gVar2 = gVar;
            str4 = str5;
            rVar7 = rVarR;
            rVar8 = rVarD8;
            aVar3 = aVar5;
            rVar9 = rVarH4;
            rVar10 = rVarD9;
        } else {
            gVar2 = gVar;
            str4 = str5;
            rVar7 = rVarR;
            rVar8 = rVarD8;
            aVar3 = aVar5;
            rVar9 = rVarH4;
            rVar10 = rVarD9;
            rVarH2 = te0.w.h(new Data(aVar3, null, false, 6, null));
        }
        efm.r i5 = nim.a.w(kli.a.i(rVar8, rVar10, d(rVarH2)), new m2g.c(this, 5));
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (set.contains(k1j.a.TEEN_POCKETS)) {
            j0 j0Var = qVar.f202076p;
            Intrinsics.checkNotNullParameter(registeredIdentity, str3);
            efm.r rVarFromCallable = efm.r.fromCallable(new h4d.d(j0Var, 20));
            Intrinsics.checkNotNullExpressionValue(rVarFromCallable, "fromCallable(...)");
            efm.r rVarSwitchMap3 = rVarFromCallable.switchMap(new m1i.j0(new g0(j0Var, registeredIdentity, 0), 28));
            Intrinsics.checkNotNullExpressionValue(rVarSwitchMap3, "switchMap(...)");
            rVarH3 = nim.a.w(rVarSwitchMap3, new m(qVar, inputData, 2));
        } else {
            rVarH3 = te0.w.h(new Data(aVar3, null, false, 6, null));
        }
        efm.r rVarD10 = d(rVarH3);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        sfm.b bVar3 = new sfm.b(qVar.d(inputData, k1j.a.TEEN_VAULTS, aVar), new m1i.j0(new l(qVar, inputData, 0), 11), 2);
        Intrinsics.checkNotNullExpressionValue(bVar3, str4);
        efm.r j2 = nim.a.w(kli.a.h(rVarD10, d(bVar3)), new m2g.c(this, 4));
        efm.r k = d(qVar.g(inputData, AccountId.Personal.f51414a));
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        k1j.a aVar6 = k1j.a.SPOT_MARGIN_COLLATERAL;
        int i6 = n2j.b.f;
        efm.r rVarD11 = d(!set.contains(aVar6) ? zi0.c.j(aVar3) : zi0.c.j(aVar3));
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        k1j.a aVar7 = k1j.a.FUTURES_COLLATERAL;
        int i21 = n2j.a.f;
        efm.r l2 = nim.a.w(mif.a.d(rVarD11, d(!set.contains(aVar7) ? zi0.c.j(aVar3) : zi0.c.j(aVar3))), new m2g.c(this, 6));
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        n2j.c cVar = qVar.f202080t;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (set.contains(k1j.a.DEFI)) {
            rVarJ = !((jte.d) cVar.f211561c).c(DeFiAccountsApi$Toggles$CryptoDeFiAccount.f71633c) ? zi0.c.j(aVar3) : rd0.e.c(nim.a.v(boh.f.e(k18.c.G(cVar.f211559a), new n1.y(cVar, 8)), new n1j.t(cVar)), gVar2);
        } else {
            rVarJ = zi0.c.j(aVar3);
        }
        efm.r m3 = d(rVarJ);
        efm.r a7 = rVar9;
        Intrinsics.checkNotNullParameter(a7, "a");
        efm.r b4 = rVar7;
        Intrinsics.checkNotNullParameter(b4, "b");
        efm.r c2 = rVar;
        Intrinsics.checkNotNullParameter(c2, "c");
        efm.r d = rVar2;
        Intrinsics.checkNotNullParameter(d, "d");
        efm.r e = rVar4;
        Intrinsics.checkNotNullParameter(e, "e");
        efm.r f = rVar3;
        Intrinsics.checkNotNullParameter(f, "f");
        efm.r g3 = rVar5;
        Intrinsics.checkNotNullParameter(g3, "g");
        efm.r h2 = rVar6;
        Intrinsics.checkNotNullParameter(h2, "h");
        Intrinsics.checkNotNullParameter(i5, "i");
        Intrinsics.checkNotNullParameter(j2, "j");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNullParameter(l2, "l");
        Intrinsics.checkNotNullParameter(m3, "m");
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        efm.r f4 = rVar3;
        Intrinsics.checkNotNullParameter(f4, "f");
        efm.r g5 = rVar5;
        Intrinsics.checkNotNullParameter(g5, "g");
        Intrinsics.checkNotNullParameter(h2, "h");
        Intrinsics.checkNotNullParameter(i5, "i");
        Intrinsics.checkNotNullParameter(j2, "j");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNullParameter(l2, "l");
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(e, "e");
        efm.r f5 = rVar3;
        Intrinsics.checkNotNullParameter(f5, "f");
        efm.r g6 = rVar5;
        Intrinsics.checkNotNullParameter(g6, "g");
        Intrinsics.checkNotNullParameter(h2, "h");
        Intrinsics.checkNotNullParameter(i5, "i");
        Intrinsics.checkNotNullParameter(j2, "j");
        Intrinsics.checkNotNullParameter(k, "k");
        efm.r rVarW3 = nim.a.w(nim.a.w(kli.a.h(nim.a.w(kli.a.h(nim.a.w(kli.a.h(mif.a.k(a7, b4, c2, d, e, f5, g6, h2, i5, j2), k), new vea.n(15)), l2), new vea.n(14)), m3), new vea.n(23)), new m2g.c(this, 2));
        return inputData.f99397h.contains(BalancesInteractor$InputData$AdditionalConfig$IgnoreHiddenAccountsFiltering.f99398a) ? rVarW3 : pd.b.r(rVarW3, new e(this, 1));
    }
}
