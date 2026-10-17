package fna;

import akg.n;
import av8.o;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.profile.api.ProfileApi$Toggles$ProfileInsuranceDocumentsEntryPoint;
import com.revolut.feature.retail.savings.api.SavingsApi$Toggles;
import com.revolut.feature.statements.api.models.AnnualStatementDateRange;
import com.revolut.feature.teen.accounts.api.TeenAccountsApi$Toggles$TeenGuardianHub;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import cxe.u;
import e7l.g;
import efm.r;
import etj.l;
import fg8.y;
import fjd.g0;
import g48.r0;
import jhi.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pcd.j;
import rnb.w;
import tzg.m;
import uyd.h0;
import vkm.q0;
import vkm.v1;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f136575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f136576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l61.a f136577c;
    public final zxd.c d;
    public final vxd.c e;
    public final r0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n8b.a f136578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f136579h;
    public final elb.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f136580j;
    public final am2.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gr6.a f136581l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final hc5.a f136582m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y91.b f136583n;
    public final pre.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xqe.b f136584p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final iw7.a f136585q;

    public h(gte.a featureToggleInteractor, ang.f userInteractor, l61.a userCompanyInteractor, zxd.c statementsInteractor, vxd.c statementsFeatureChecker, r0 jointAccountsInteractor, n8b.a countryInteractor, w savingsVaultInteractor, elb.b savingsFeatureConfigInteractor, m wealthAccountsInteractor, am2.a profileTypeInteractor, gr6.a freelancerAccountDetailsInteractor, hc5.a cryptoAccountInteractor, y91.b accountsProductFeatureChecker, pre.c termsInteractor, xqe.b teenProfileInteractor, iw7.a embeddedInsuranceInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(statementsFeatureChecker, "statementsFeatureChecker");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(savingsFeatureConfigInteractor, "savingsFeatureConfigInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(profileTypeInteractor, "profileTypeInteractor");
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(cryptoAccountInteractor, "cryptoAccountInteractor");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(teenProfileInteractor, "teenProfileInteractor");
        Intrinsics.checkNotNullParameter(embeddedInsuranceInteractor, "embeddedInsuranceInteractor");
        this.f136575a = featureToggleInteractor;
        this.f136576b = userInteractor;
        this.f136577c = userCompanyInteractor;
        this.d = statementsInteractor;
        this.e = statementsFeatureChecker;
        this.f = jointAccountsInteractor;
        this.f136578g = countryInteractor;
        this.f136579h = savingsVaultInteractor;
        this.i = savingsFeatureConfigInteractor;
        this.f136580j = wealthAccountsInteractor;
        this.k = profileTypeInteractor;
        this.f136581l = freelancerAccountDetailsInteractor;
        this.f136582m = cryptoAccountInteractor;
        this.f136583n = accountsProductFeatureChecker;
        this.o = termsInteractor;
        this.f136584p = teenProfileInteractor;
        this.f136585q = embeddedInsuranceInteractor;
    }

    public static r c(r rVar, Object obj2) {
        r map = rVar.map(new fjj.b(new o(obj2, 18), 6));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final n a(AccountId accountId) {
        Flow flowI;
        Flow flowV;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        String strA = b.a(accountId);
        y91.b bVar = this.f136583n;
        boolean zA = bVar.a("STATEMENTS.annual_financial_summary");
        zxd.c cVar = this.d;
        if (zA) {
            w4l.f fVar = ((h0) ((ryd.w) cVar).f258357a).E;
            if (strA == null) {
                strA = null;
            }
            flowI = rd0.e.b(nim.a.w(c(fVar.f(new uyd.j(strA), true), f0.f322471a), new fkh.f(20)));
        } else {
            flowI = zi0.c.i(Boolean.FALSE);
        }
        String strA2 = b.a(accountId);
        if (bVar.a("STATEMENTS.annual_statement")) {
            flowV = nim.a.v(rd0.e.b(c(((h0) ((ryd.w) cVar).f258357a).f284201t.f(new uyd.d(strA2 != null ? strA2 : null), true), new AnnualStatementDateRange(0, 0))), new d(this, 1));
        } else {
            flowV = new go.g(new Data(Boolean.FALSE, null, false, 6, null), 2);
        }
        return nim.a.v(u0.m(flowI, flowV), new y(this, accountId, 21));
    }

    public final n b() {
        vkm.d dVar;
        k kVar;
        zhm.h0 h0Var;
        v1 v1Var;
        jte.d dVar2;
        k kVar2;
        w4l.j jVar;
        v1 v1Var2;
        Flow gVar;
        Flow gVar2;
        r0 r0Var = this.f;
        w4l.h hVar = w4l.h.f294642c;
        u uVarH = r0Var.h(hVar);
        pcd.e eVar = new pcd.e(j.d.f234867a);
        w wVar = this.f136579h;
        Flow flowD = wVar.d(eVar);
        SavingsApi$Toggles.JointAccountsSavings jointAccountsSavings = SavingsApi$Toggles.JointAccountsSavings.f83075c;
        jte.d dVar3 = (jte.d) this.f136575a;
        n nVarV = nim.a.v(u0.m(flowD, dVar3.c(jointAccountsSavings) ? wVar.d(new pcd.e(j.c.f234866a)) : new go.g(new Data(f0.f322471a, null, false, 6, null), 2)), new fkh.f(17));
        zhm.h0 h0Var2 = zhm.h0.f322473a;
        q0 q0VarN = rd0.e.n(nVarV, h0Var2);
        f0 f0Var = f0.f322471a;
        k kVarS = n14.k.s(q0VarN, f0Var);
        elb.b bVar = this.i;
        w4l.j jVar2 = w4l.j.f294644c;
        u uVarA = bVar.a(jVar2);
        Continuation continuation = null;
        v1 v1Var3 = new v1(new l(this, continuation, 23));
        k kVarS2 = n14.k.s(rd0.e.n(boh.f.e(rd0.e.b(this.k.a()), new d(this, 0)), h0Var2), new xzg.r0(f0Var, new TradingLegalEntityInformation(null)));
        v1 v1Var4 = new v1(new g0(this, continuation, 8));
        v1 v1Var5 = new v1(new g(this, null));
        u uVarY = nim.a.y(rd0.e.n(nim.a.v(this.f136582m.a(hVar), new fkh.f(18)), h0Var2), new fkh.f(19));
        et6.g gVar3 = (et6.g) this.f136581l;
        q0 q0VarN2 = rd0.e.n(nim.a.v(u0.m(gVar3.e(hVar), gVar3.d(hVar)), new fkh.f(14)), h0Var2);
        Boolean bool = Boolean.FALSE;
        k kVarS3 = n14.k.s(q0VarN2, bool);
        vkm.d dVarB = rd0.e.b(c(nim.a.w(hng.g.b(((ang.b) this.f136577c).f7765a), new fkh.f(15)), bool));
        if (dVar3.c(TeenAccountsApi$Toggles$TeenGuardianHub.f90321c)) {
            gVar = n14.k.s(rd0.e.n(nim.a.v(this.f136584p.b(hVar), new fkh.f(21)), h0Var2), f0Var);
            dVar = dVarB;
            kVar = kVarS2;
            h0Var = h0Var2;
            v1Var = v1Var4;
            dVar2 = dVar3;
            kVar2 = kVarS3;
            jVar = jVar2;
            v1Var2 = v1Var5;
        } else {
            dVar = dVarB;
            kVar = kVarS2;
            h0Var = h0Var2;
            v1Var = v1Var4;
            dVar2 = dVar3;
            kVar2 = kVarS3;
            jVar = jVar2;
            v1Var2 = v1Var5;
            gVar = new go.g(new Data(f0Var, null, false, 6, null), 2);
        }
        k kVarU = nim.a.u(new f(this, null), u0.j(u0.i(uVarH, kVarS, uVarA), u0.i(v1Var3, kVar, v1Var), u0.i(v1Var2, uVarY, kVar2), u0.m(dVar, gVar)));
        if (dVar2.c(ProfileApi$Toggles$ProfileInsuranceDocumentsEntryPoint.f81318c)) {
            kw7.h hVar2 = (kw7.h) ((kw7.a) this.f136585q).f190297a;
            gVar2 = n14.k.s(rd0.e.n(nim.a.v(nim.a.v(boh.f.e(nim.a.v(rd0.e.b(((ik3.c) hVar2.f190304a).l(g.a.f123406a, jVar)), new kvg.j(12)), new kv7.g(hVar2, 6)), new kvg.j(9)), new fkh.f(22)), h0Var), f0Var);
        } else {
            gVar2 = new go.g(new Data(f0Var, null, false, 6, null), 2);
        }
        int i = 17;
        return nim.a.v(u0.m(kVarU, gVar2), new fjd.w(new fk4.r(i), i));
    }
}
