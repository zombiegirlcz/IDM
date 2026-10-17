package fg8;

import com.revolut.feature.junior.account_activation.api.navigation.JuniorAccountActivationFeatureConfig;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_referrals.api.JuniorReferralsApi$Toggles$JuniorReferralsRevamp;
import com.revolut.feature.junior_settings.api.JuniorSettingsApi$Toggles$BlankCardDeliveryConsent;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kl.t1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f134921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jf0.c f134922c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ e(m mVar, jf0.c cVar, boolean z, int i) {
        this.f134920a = i;
        this.f134921b = mVar;
        this.f134922c = cVar;
        this.d = z;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        jf0.c cVar;
        pfm.a aVar;
        String lowerCase;
        mh8.h hVar;
        int i = this.f134920a;
        int i2 = 24;
        final boolean z = this.d;
        jf0.c deeplink = this.f134922c;
        m mVar = this.f134921b;
        int i3 = 14;
        int i5 = 3;
        int i6 = 2;
        final int i21 = 1;
        final int i22 = 0;
        int i32 = 4;
        switch (i) {
            case 0:
                m mVar2 = this.f134921b;
                wsg.n nVar = mVar2.f134952h;
                jf0.c deeplink2 = this.f134922c;
                String str = deeplink2.f173627a;
                Boolean juniorAccountsEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(juniorAccountsEnabled, "juniorAccountsEnabled");
                boolean zBooleanValue = juniorAccountsEnabled.booleanValue();
                boolean z3 = this.d;
                if (!zBooleanValue) {
                    Regex regex = d0m.b.f110450a;
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(p.a.p("Junior deeplink ", d0m.b.a(str), " can't be handled because youth.wallets product is not enabled"));
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, unsupportedOperationException, h0Var);
                } else {
                    hp8.b bVar = mVar2.f;
                    lp8.a aVar2 = bVar.f154514a;
                    ao.h hVar2 = mVar2.f134949b;
                    List listH = deeplink2.h();
                    String str2 = (String) zhm.d0.e0(2, listH);
                    String juniorId = (String) zhm.d0.e0(3, listH);
                    String str3 = (String) zhm.d0.e0(4, listH);
                    String str4 = (String) zhm.d0.e0(5, listH);
                    if (str2 != null) {
                        int iHashCode = str2.hashCode();
                        w4l.j jVar = w4l.j.f294644c;
                        switch (iHashCode) {
                            case -2137146394:
                                if (!str2.equals("accounts")) {
                                    cVar = deeplink2;
                                } else {
                                    String str5 = (String) zhm.d0.e0(6, listH);
                                    if (juniorId != null && juniorId.length() != 0) {
                                        int i33 = 23;
                                        if (!juniorId.equals("create")) {
                                            boolean zEquals = juniorId.equals("any");
                                            w4l.h loadingStrategy = w4l.h.f294642c;
                                            if (!zEquals) {
                                                int i43 = 13;
                                                if (!Intrinsics.f(str3, "tasks")) {
                                                    if (!Intrinsics.f(str3, "savings")) {
                                                        if (Intrinsics.f(str3, "app-link") && Intrinsics.f(str4, "share")) {
                                                            r rVar = mVar2.o;
                                                            Intrinsics.checkNotNullParameter(deeplink2, "deeplink");
                                                        } else {
                                                            int i59 = 28;
                                                            if (Intrinsics.f(str3, "invitation") && Intrinsics.f(str4, "create")) {
                                                                m0 m0Var = mVar2.f134957p;
                                                                Intrinsics.checkNotNullParameter(deeplink2, "deeplink");
                                                            } else if (Intrinsics.f(str3, "co-parenting") && Intrinsics.f(str4, "invite")) {
                                                                ufm.i iVarB = mVar2.b(juniorId);
                                                                efm.d0 d0VarFirstOrError = hVar2.o().firstOrError();
                                                                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                                                                pfm.a aVar3 = new pfm.a(te0.w.H0(iVarB, d0VarFirstOrError), new ffk.l(16, new a09.z(mVar2, juniorId, z3, 26)), 4);
                                                                Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
                                                            } else if (Intrinsics.f(str3, "cards") && Intrinsics.f(str4, "order")) {
                                                                efm.d0 d0VarFirstOrError2 = m70.a.g(nVar.a0(juniorId, true), null, new fci.e0(19), 1).firstOrError();
                                                                ufm.i iVarB2 = mVar2.b(juniorId);
                                                                Intrinsics.h(d0VarFirstOrError2);
                                                                pfm.a aVar4 = new pfm.a(te0.w.H0(iVarB2, d0VarFirstOrError2), new ffk.l(15, new f(mVar2, juniorId, 6)), 4);
                                                                Intrinsics.checkNotNullExpressionValue(aVar4, "flatMapCompletable(...)");
                                                            } else if (!Intrinsics.f(str3, "card-requests")) {
                                                                if (Intrinsics.f(str3, "terminate")) {
                                                                    efm.d0 d0VarFirstOrError3 = m70.a.g(osg.b.a(nVar, juniorId, false, 4), null, new fci.e0(16), 1).firstOrError();
                                                                    ffk.l lVar = new ffk.l(5, new f(mVar2, juniorId, 0));
                                                                    d0VarFirstOrError3.getClass();
                                                                    aVar = new pfm.a(d0VarFirstOrError3, lVar, 4);
                                                                    Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                                                                } else if (Intrinsics.f(str3, "referrals") && Intrinsics.f(str4, "toggle")) {
                                                                    final t0 t0Var = mVar2.k;
                                                                    Intrinsics.checkNotNullParameter(deeplink2, "deeplink");
                                                                    final String strE = deeplink2.e(3);
                                                                    final int i66 = 0;
                                                                    final int i74 = 1;
                                                                    efm.d0 d0VarFirstOrError4 = m70.a.g(pd.b.r(kli.a.h(rd0.e.c(hj8.a.a(t0Var.f135000b, strE, jVar), kotlin.coroutines.g.f186406a), osg.b.a(t0Var.f135001c, strE, false, 4)), new Function1() { // from class: fg8.o0
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj3) {
                                                                            switch (i66) {
                                                                                case 0:
                                                                                    Pair pair = (Pair) obj3;
                                                                                    Intrinsics.checkNotNullParameter(pair, "<destruct>");
                                                                                    JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) pair.f186385a;
                                                                                    psg.a aVar5 = (psg.a) pair.f186386b;
                                                                                    t0 t0Var2 = t0Var;
                                                                                    boolean zC = ((jte.d) t0Var2.e).c(JuniorReferralsApi$Toggles$JuniorReferralsRevamp.f77156c);
                                                                                    String juniorId2 = strE;
                                                                                    if (!zC) {
                                                                                        return pd.b.s(t0Var2.f134999a.b(juniorId2, false), new p0(t0Var2, juniorId2, juniorBankingProfile, aVar5, 1));
                                                                                    }
                                                                                    pfm.h hVarN = pd.b.n(skm.p0.f264003c, new r0(t0Var2, juniorId2, null, 1));
                                                                                    t1 t1Var = t0Var2.f;
                                                                                    Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                                                                                    un8.h hVar3 = (un8.h) ((un8.c) t1Var.f185240b);
                                                                                    hVar3.getClass();
                                                                                    Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                                                                                    sfm.b bVarG = hVarN.g(hVar3.e.f(juniorId2, false));
                                                                                    Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
                                                                                    return pd.b.r(bVarG, new p0(t0Var2, juniorId2, juniorBankingProfile, aVar5, 0));
                                                                                default:
                                                                                    Throwable it8 = (Throwable) obj3;
                                                                                    Intrinsics.checkNotNullParameter(it8, "it");
                                                                                    return te0.w.o0(skm.p0.f264003c, new r0(t0Var, strE, null, 0));
                                                                            }
                                                                        }
                                                                    }), null, new i0(4), 1).firstOrError();
                                                                    Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError4, "firstOrError(...)");
                                                                    pfm.a aVar5 = new pfm.a(ue0.e.D(d0VarFirstOrError4, new Function1() { // from class: fg8.o0
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj3) {
                                                                            switch (i74) {
                                                                                case 0:
                                                                                    Pair pair = (Pair) obj3;
                                                                                    Intrinsics.checkNotNullParameter(pair, "<destruct>");
                                                                                    JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) pair.f186385a;
                                                                                    psg.a aVar52 = (psg.a) pair.f186386b;
                                                                                    t0 t0Var2 = t0Var;
                                                                                    boolean zC = ((jte.d) t0Var2.e).c(JuniorReferralsApi$Toggles$JuniorReferralsRevamp.f77156c);
                                                                                    String juniorId2 = strE;
                                                                                    if (!zC) {
                                                                                        return pd.b.s(t0Var2.f134999a.b(juniorId2, false), new p0(t0Var2, juniorId2, juniorBankingProfile, aVar52, 1));
                                                                                    }
                                                                                    pfm.h hVarN = pd.b.n(skm.p0.f264003c, new r0(t0Var2, juniorId2, null, 1));
                                                                                    t1 t1Var = t0Var2.f;
                                                                                    Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                                                                                    un8.h hVar3 = (un8.h) ((un8.c) t1Var.f185240b);
                                                                                    hVar3.getClass();
                                                                                    Intrinsics.checkNotNullParameter(juniorId2, "juniorId");
                                                                                    sfm.b bVarG = hVarN.g(hVar3.e.f(juniorId2, false));
                                                                                    Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
                                                                                    return pd.b.r(bVarG, new p0(t0Var2, juniorId2, juniorBankingProfile, aVar52, 0));
                                                                                default:
                                                                                    Throwable it8 = (Throwable) obj3;
                                                                                    Intrinsics.checkNotNullParameter(it8, "it");
                                                                                    return te0.w.o0(skm.p0.f264003c, new r0(t0Var, strE, null, 0));
                                                                            }
                                                                        }
                                                                    }), new e0(5, new fca.d(t0Var, 17)), 4);
                                                                    Intrinsics.checkNotNullExpressionValue(aVar5, "flatMapCompletable(...)");
                                                                } else {
                                                                    int i92 = 29;
                                                                    if (!Intrinsics.f(str3, "consent-prompts")) {
                                                                        Continuation continuation = null;
                                                                        if (Intrinsics.f(str3, "allowance") && Intrinsics.f(str4, "create")) {
                                                                            q qVar = mVar2.f134959r;
                                                                            Intrinsics.checkNotNullParameter(deeplink2, "deeplink");
                                                                            String strE2 = deeplink2.e(3);
                                                                            int i96 = 0;
                                                                            efm.d0 d0VarFirstOrError5 = m70.a.g(pd.b.r(rd0.e.c(qVar.d.a(strE2, loadingStrategy), kotlin.coroutines.g.f186406a), new n(qVar, strE2, i96)), null, new fci.e0(23), 1).firstOrError();
                                                                            ffk.l lVar2 = new ffk.l(26, new o(qVar, strE2, z3, i96));
                                                                            d0VarFirstOrError5.getClass();
                                                                            pfm.a aVar6 = new pfm.a(d0VarFirstOrError5, lVar2, 4);
                                                                            Intrinsics.checkNotNullExpressionValue(aVar6, "flatMapCompletable(...)");
                                                                        } else if (Intrinsics.f(str3, "partnerships") && Intrinsics.f(str4, "explore")) {
                                                                            mp.p pVar = mVar2.f134960s;
                                                                            Intrinsics.checkNotNullParameter(deeplink2, "deeplink");
                                                                            String strE3 = deeplink2.e(3);
                                                                            skm.p0 p0Var = skm.p0.f264001a;
                                                                            pfm.h hVarN = pd.b.n(elm.f.f127540b, new esa.i(pVar, strE3, continuation, i92));
                                                                            efm.d0 d0VarFirstOrError6 = m70.a.g(rd0.e.c(((om8.c) pVar.f207710c).a(strE3, loadingStrategy), kotlin.coroutines.g.f186406a), null, new i0(3), 1).firstOrError();
                                                                            e0 e0Var = new e0(4, new a09.z(pVar, strE3, z3, 27));
                                                                            d0VarFirstOrError6.getClass();
                                                                            pfm.a aVarE = hVarN.e(new pfm.a(d0VarFirstOrError6, e0Var, 4));
                                                                            Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                                                                        }
                                                                    } else if (!zhm.d0.T(zhm.v.k("personal-data-management", "payment-links", "blank-card-delivery"), str4)) {
                                                                        Continuation continuation2 = null;
                                                                        g0 g0Var = mVar2.f134954l;
                                                                        Intrinsics.checkNotNullParameter(deeplink2, "deeplink");
                                                                        String strE4 = deeplink2.e(3);
                                                                        if (!kotlin.text.d0.W(strE4)) {
                                                                            int i99 = 0;
                                                                            pfm.a aVar7 = new pfm.a(te0.w.o0(skm.p0.f264003c, new etj.l(g0Var, deeplink2, strE4, continuation2, 18)), new e0(i99, new d0(g0Var, strE4, i99)), 4);
                                                                            Intrinsics.checkNotNullExpressionValue(aVar7, "flatMapCompletable(...)");
                                                                        } else {
                                                                            pfm.n nVarN = efm.b.n(new IllegalArgumentException(j6.a.q("Cannot get juniorId from the deeplink ", a0.d.s("uri=", deeplink2.f173629c, ", originalUri=", str))));
                                                                            Intrinsics.checkNotNullExpressionValue(nVarN, "error(...)");
                                                                        }
                                                                    } else {
                                                                        c0 c0Var = mVar2.f134955m;
                                                                        te8.z zVar = c0Var.f134913c;
                                                                        Intrinsics.checkNotNullParameter(deeplink2, "deeplink");
                                                                        String strE5 = deeplink2.e(3);
                                                                        String strE6 = deeplink2.e(5);
                                                                        if (kotlin.text.d0.W(strE5)) {
                                                                            pfm.n nVarN2 = efm.b.n(new IllegalArgumentException(j6.a.q("Cannot get juniorId from the deeplink: ", d0m.b.a(str))));
                                                                            Intrinsics.checkNotNullExpressionValue(nVarN2, "error(...)");
                                                                        } else if (!Intrinsics.f(strE6, "personal-data-management")) {
                                                                            if (!Intrinsics.f(strE6, "payment-links")) {
                                                                                if (Intrinsics.f(strE6, "blank-card-delivery")) {
                                                                                    if (((jte.d) c0Var.d).c(JuniorSettingsApi$Toggles$BlankCardDeliveryConsent.f77250c)) {
                                                                                        pfm.h hVar3 = new pfm.h(new w(strE5, z3, c0Var), 2);
                                                                                        Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
                                                                                    }
                                                                                }
                                                                                pfm.n nVarN3 = efm.b.n(new UnsupportedOperationException(j6.a.q("Consent request deeplink is not available for juniorId = ", kotlin.text.f0.U0(4, strE5))));
                                                                                Intrinsics.checkNotNullExpressionValue(nVarN3, "error(...)");
                                                                            } else {
                                                                                int i100 = 28;
                                                                                ufm.i iVar = new ufm.i(ue0.e.v(te8.z.c(zVar)).f(m70.a.h(te8.z.b(zVar, strE5, false, 4), new et6.a(22), null, new fci.e0(i100), 2).firstOrError()), new ffk.l(i100, new y(c0Var, strE5, 0)), 0);
                                                                                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                                                                                aVar = new pfm.a(ue0.e.F(iVar, c0.a(null)), new ffk.l(i92, new z(c0Var, 0)), 4);
                                                                                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                                                                            }
                                                                            break;
                                                                        } else if (!Intrinsics.f((String) deeplink2.d.get("action"), "approve")) {
                                                                            Continuation continuation3 = null;
                                                                            pfm.h hVarN2 = pd.b.n(skm.p0.f264003c, new b0(c0Var, continuation3, 1));
                                                                            kd8.x xVar = c0Var.f134912b;
                                                                            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                                                                            efm.d0 d0VarFirstOrError7 = m70.a.h(zi0.c.J(rd0.e.c(vkm.q.Q(new ae8.c(bla.b.b(xVar.f182860b, "YOUTH"), 13), new a67.c(continuation3, xVar, loadingStrategy, xc8.d.PERSONAL_DATA_PROCESSING, 26)), kotlin.coroutines.g.f186406a)), new aqb.w(c0Var, strE5, z3), null, new fci.e0(i92), 2).firstOrError();
                                                                            Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError7, "firstOrError(...)");
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            } else {
                                                                v vVar = mVar2.f134963x;
                                                                Intrinsics.checkNotNullParameter(deeplink2, "deeplink");
                                                                List listH2 = deeplink2.h();
                                                                String str6 = (String) zhm.d0.e0(3, listH2);
                                                                String str7 = (String) zhm.d0.e0(5, listH2);
                                                                String str8 = (String) zhm.d0.e0(6, listH2);
                                                                if (str6 == null || str7 == null || !Intrinsics.f(str8, "review")) {
                                                                    pfm.n nVarN4 = efm.b.n(new UnsupportedOperationException(p.a.p("Junior deeplink ", str, " is not supported")));
                                                                    Intrinsics.checkNotNullExpressionValue(nVarN4, "error(...)");
                                                                }
                                                            }
                                                        }
                                                    } else if (Intrinsics.f(str4, "create")) {
                                                        efm.d0 d0VarFirstOrError8 = m70.a.g(nVar.Z(juniorId, loadingStrategy), null, new fci.e0(17), 1).firstOrError();
                                                        ufm.i iVar2 = new ufm.i(te0.w.o0(skm.p0.f264003c, new k(mVar2, juniorId, null, 1)), new ffk.l(9, new f(mVar2, juniorId, 2)), 0);
                                                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                                                        Intrinsics.h(d0VarFirstOrError8);
                                                        pfm.a aVar8 = new pfm.a(te0.w.H0(iVar2, d0VarFirstOrError8), new ffk.l(10, new f(mVar2, juniorId, 3)), 4);
                                                        Intrinsics.checkNotNullExpressionValue(aVar8, "flatMapCompletable(...)");
                                                    } else if (Intrinsics.f(str4, "invite") && str5 != null) {
                                                        pfm.a aVar9 = new pfm.a(te0.w.o0(skm.p0.f264003c, new k(mVar2, juniorId, null, 0)), new ffk.l(11, new eed.i(mVar2, 16, juniorId, str5)), 4);
                                                        Intrinsics.checkNotNullExpressionValue(aVar9, "flatMapCompletable(...)");
                                                    } else if (Intrinsics.f(str4, "deposits")) {
                                                        pfm.a aVar10 = new pfm.a(te0.w.o0(skm.p0.f264003c, new k(mVar2, juniorId, null, 2)), new ffk.l(12, new f(mVar2, juniorId, 4)), 4);
                                                        Intrinsics.checkNotNullExpressionValue(aVar10, "flatMapCompletable(...)");
                                                    }
                                                } else if (!Intrinsics.f(str4, "create")) {
                                                    ufm.i iVarB3 = mVar2.b(juniorId);
                                                    Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                                                    rfm.f0 f0VarF = ue0.e.v(((lp8.e) aVar2).c(juniorId)).f(m70.a.g(bVar.a(juniorId, false), null, new fci.e0(18), 1).firstOrError());
                                                    Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
                                                    pfm.a aVar11 = new pfm.a(te0.w.H0(iVarB3, f0VarF), new ffk.l(i43, new f(mVar2, juniorId, 5)), 4);
                                                    Intrinsics.checkNotNullExpressionValue(aVar11, "flatMapCompletable(...)");
                                                } else {
                                                    ufm.i iVarB4 = mVar2.b(juniorId);
                                                    pfm.a aVarL = m.l(nVar.f0(true));
                                                    Unit unit = Unit.f186387a;
                                                    pfm.z zVarD = aVarL.D(unit);
                                                    Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
                                                    pfm.z zVarD2 = m.l(rd0.e.c(te8.e.b(mVar2.e, w4l.i.f294643c), kotlin.coroutines.g.f186406a)).D(unit);
                                                    Intrinsics.checkNotNullExpressionValue(zVarD2, "toSingleDefault(...)");
                                                    pfm.z zVarD3 = m.l(((lp8.e) aVar2).e.f("ALL_TASKS", true)).D(unit);
                                                    Intrinsics.checkNotNullExpressionValue(zVarD3, "toSingleDefault(...)");
                                                    pfm.a aVar12 = new pfm.a(te0.w.J0(iVarB4, zVarD, zVarD2, zVarD3), new ffk.l(6, new f(mVar2, juniorId, 1)), 4);
                                                    Intrinsics.checkNotNullExpressionValue(aVar12, "flatMapCompletable(...)");
                                                }
                                            } else {
                                                efm.d0 d0VarFirstOrError9 = m70.a.g(rd0.e.c(((nj8.n) mVar2.d).k(null, loadingStrategy), skm.p0.f264003c), null, null, 3).firstOrError();
                                                ffk.l lVar3 = new ffk.l(14, new fca.d(mVar2, 15));
                                                d0VarFirstOrError9.getClass();
                                                pfm.a aVar13 = new pfm.a(d0VarFirstOrError9, lVar3, 4);
                                                Intrinsics.checkNotNullExpressionValue(aVar13, "flatMapCompletable(...)");
                                            }
                                        } else {
                                            efm.d0 d0VarC = mVar2.c();
                                            ffk.l lVar4 = new ffk.l(i33, new e(mVar2, deeplink2, z3, 1));
                                            d0VarC.getClass();
                                            pfm.a aVar14 = new pfm.a(d0VarC, lVar4, 4);
                                            Intrinsics.checkNotNullExpressionValue(aVar14, "flatMapCompletable(...)");
                                        }
                                    }
                                }
                                break;
                            case -1655974669:
                                int i101 = 2;
                                if (!str2.equals("activate")) {
                                    cVar = deeplink2;
                                } else {
                                    efm.d0 d0VarC2 = mVar2.c();
                                    ffk.l lVar5 = new ffk.l(24, new e(mVar2, deeplink2, z3, i101));
                                    d0VarC2.getClass();
                                    pfm.a aVar15 = new pfm.a(d0VarC2, lVar5, 4);
                                    Intrinsics.checkNotNullExpressionValue(aVar15, "flatMapCompletable(...)");
                                }
                                break;
                            case -568245351:
                                if (!str2.equals("consents")) {
                                    cVar = deeplink2;
                                } else {
                                    zjh.f fVar = mVar2.f134958q;
                                    Intrinsics.checkNotNullParameter(deeplink2, "deeplink");
                                    pfm.h hVar4 = new pfm.h(new a08.d(fVar, 19), 2);
                                    Intrinsics.checkNotNullExpressionValue(hVar4, "fromAction(...)");
                                }
                                break;
                            case -181653801:
                                if (!str2.equals("co-parenting")) {
                                    cVar = deeplink2;
                                } else if (Intrinsics.f(juniorId, "invitations") && str3 != null && Intrinsics.f(str4, "review")) {
                                    efm.d0 d0VarFirstOrError10 = hVar2.o().firstOrError();
                                    ffk.l lVar6 = new ffk.l(7, new ard.t(mVar2, str3, deeplink2, z3, 7));
                                    d0VarFirstOrError10.getClass();
                                    pfm.a aVar16 = new pfm.a(d0VarFirstOrError10, lVar6, 4);
                                    Intrinsics.checkNotNullExpressionValue(aVar16, "flatMapCompletable(...)");
                                }
                                break;
                            case 595284846:
                                if (!str2.equals("graduation")) {
                                    cVar = deeplink2;
                                } else {
                                    l0 l0Var = mVar2.f134956n;
                                    Intrinsics.checkNotNullParameter(deeplink2, "deeplink");
                                    if (Intrinsics.f((String) zhm.d0.e0(3, deeplink2.h()), "details")) {
                                        int i102 = 1;
                                        sfm.b bVarG = pd.b.n(skm.p0.f264003c, new ewa.d(l0Var, null, 16)).g(rd0.e.c(l0Var.f134946b.m(jVar, true), kotlin.coroutines.g.f186406a));
                                        Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
                                        efm.d0 d0VarFirstOrError11 = m70.a.g(zi0.c.J(bVarG), null, new i0(0), 1).firstOrError();
                                        e0 e0Var2 = new e0(i102, new y(l0Var, deeplink2, i102));
                                        d0VarFirstOrError11.getClass();
                                        pfm.a aVar17 = new pfm.a(d0VarFirstOrError11, e0Var2, 4);
                                        Intrinsics.checkNotNullExpressionValue(aVar17, "flatMapCompletable(...)");
                                    }
                                }
                                break;
                            default:
                                cVar = deeplink2;
                                break;
                        }
                    } else {
                        cVar = deeplink2;
                    }
                }
                break;
            case 1:
                lf8.c featureFlags = (lf8.c) obj2;
                Intrinsics.checkNotNullParameter(featureFlags, "featureFlags");
                if (featureFlags.f194666a) {
                    HashMap map = deeplink.d;
                    String str9 = (String) map.get("onboardingProductArticle");
                    if (str9 != null) {
                        lowerCase = str9.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    } else {
                        lowerCase = null;
                    }
                    Locale locale = Locale.ROOT;
                    String lowerCase2 = "once".toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    if (Intrinsics.f(lowerCase, lowerCase2)) {
                        hVar = mh8.h.Once;
                    } else {
                        String lowerCase3 = "skip".toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                        if (Intrinsics.f(lowerCase, lowerCase3)) {
                            hVar = mh8.h.Skip;
                        } else {
                            String lowerCase4 = "always".toLowerCase(locale);
                            Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                            hVar = Intrinsics.f(lowerCase, lowerCase4) ? mh8.h.Always : (Boolean.parseBoolean((String) map.get("forceSkipProductArticle")) || Boolean.parseBoolean((String) map.get("forceSkipStories"))) ? mh8.h.Skip : mh8.h.Once;
                        }
                    }
                }
                break;
            default:
                lf8.c featureFlags2 = (lf8.c) obj2;
                Intrinsics.checkNotNullParameter(featureFlags2, "featureFlags");
                if (featureFlags2.f194666a) {
                    final d dVar = mVar.f134948a;
                    Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                    String str10 = (String) zhm.d0.e0(3, deeplink.h());
                    if (Intrinsics.f(str10, "country-mismatch")) {
                        pfm.n nVar2 = new pfm.n(new Callable() { // from class: fg8.a
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                switch (i21) {
                                    case 0:
                                        dVar.f134915b.c(d.a(vhi.c.c(JuniorAccountActivationFeatureConfig.CompanyMismatchDestination.f76621a, yhi.b.POPUP, null, false, 12), z));
                                        break;
                                    default:
                                        dVar.f134915b.c(d.a(vhi.c.c(JuniorAccountActivationFeatureConfig.CountryMismatchDestination.f76622a, yhi.b.POPUP, null, false, 12), z));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, i21);
                        Intrinsics.checkNotNullExpressionValue(nVar2, "fromCallable(...)");
                    } else if (Intrinsics.f(str10, "company-mismatch")) {
                        pfm.n nVar3 = new pfm.n(new Callable() { // from class: fg8.a
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                switch (i22) {
                                    case 0:
                                        dVar.f134915b.c(d.a(vhi.c.c(JuniorAccountActivationFeatureConfig.CompanyMismatchDestination.f76621a, yhi.b.POPUP, null, false, 12), z));
                                        break;
                                    default:
                                        dVar.f134915b.c(d.a(vhi.c.c(JuniorAccountActivationFeatureConfig.CountryMismatchDestination.f76622a, yhi.b.POPUP, null, false, 12), z));
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        }, i21);
                        Intrinsics.checkNotNullExpressionValue(nVar3, "fromCallable(...)");
                    }
                }
                break;
        }
        return mVar.d(h0.a(), z);
    }
}
