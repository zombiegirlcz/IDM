package naf;

import aw0.n6;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.data.model.Data;
import com.revolut.feature.address.common.impl.flow.screen.select.SelectAddressScreen;
import com.revolut.feature.atm.impl.ui.redesign.limits.AtmWithdrawalLimitsBottomSheetController;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.CalculatorScreen;
import com.revolut.feature.crypto.exchange.fees.impl.model.CryptoExchangeFeesFacade;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsConfigurations;
import com.revolut.feature.tab.crypto.impl.portfolio.CryptoPortfolioScreen;
import com.revolut.feature.trusted_merchants.impl.ui.TrustedMerchantsFlowContract$MerchantsContent;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.see_all.InstrumentsCollectionFiltersSeeAllController;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.portfolio_updates.PortfolioUpdatesScreen;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.portfolio_updates.PortfolioUpdatesScreenContract$Action;
import com.revolut.feature_retail_user_declarations.terms_review.screen.ReadTermsController;
import com.revolut.kompot.common.ExternalDestination;
import dej.d4;
import java.io.File;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import kfj.d5;
import kfj.i0;
import kfj.q3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kp0.w0;
import nci.q;
import nci.r;
import nfj.a0;
import nfj.b0;
import nfj.d0;
import nfj.e0;
import nfj.n;
import nfj.p;
import nfj.s2;
import nfj.u;
import nfj.v2;
import nfj.w2;
import nfj.y0;
import nfj.z0;
import nk9.o;
import nm9.m;
import tj2.f;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f213895w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f213895w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j((k) this.f213895w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            case 1:
                j jVar2 = new j((com.revolut.feature.donations.impl.ui.kompot.flow.overview.b) this.f213895w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
            case 2:
                j jVar3 = new j((InstrumentsCollectionFiltersSeeAllController) this.f213895w, continuation, 2);
                jVar3.v = obj2;
                return jVar3;
            case 3:
                j jVar4 = new j((ReadTermsController) this.f213895w, continuation, 3);
                jVar4.v = obj2;
                return jVar4;
            case 4:
                j jVar5 = new j((r) this.f213895w, continuation, 4);
                jVar5.v = obj2;
                return jVar5;
            case 5:
                j jVar6 = new j((com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a) this.f213895w, continuation, 5);
                jVar6.v = obj2;
                return jVar6;
            case 6:
                j jVar7 = new j((CalculatorScreen) this.f213895w, continuation, 6);
                jVar7.v = obj2;
                return jVar7;
            case 7:
                j jVar8 = new j((com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.c) this.f213895w, continuation, 7);
                jVar8.v = obj2;
                return jVar8;
            case 8:
                j jVar9 = new j((nf5.d) this.f213895w, continuation, 8);
                jVar9.v = obj2;
                return jVar9;
            case 9:
                j jVar10 = new j((p) this.f213895w, continuation, 9);
                jVar10.v = obj2;
                return jVar10;
            case 10:
                j jVar11 = new j((u) this.f213895w, continuation, 10);
                jVar11.v = obj2;
                return jVar11;
            case 11:
                j jVar12 = new j((b0) this.f213895w, continuation, 11);
                jVar12.v = obj2;
                return jVar12;
            case 12:
                j jVar13 = new j((e0) this.f213895w, continuation, 12);
                jVar13.v = obj2;
                return jVar13;
            case 13:
                j jVar14 = new j((z0) this.f213895w, continuation, 13);
                jVar14.v = obj2;
                return jVar14;
            case 14:
                j jVar15 = new j((s2) this.f213895w, continuation, 14);
                jVar15.v = obj2;
                return jVar15;
            case 15:
                j jVar16 = new j((w2) this.f213895w, continuation, 15);
                jVar16.v = obj2;
                return jVar16;
            case 16:
                j jVar17 = new j((com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.a) this.f213895w, continuation, 16);
                jVar17.v = obj2;
                return jVar17;
            case 17:
                j jVar18 = new j((PortfolioUpdatesScreen) this.f213895w, continuation, 17);
                jVar18.v = obj2;
                return jVar18;
            case 18:
                j jVar19 = new j((ngh.h) this.f213895w, continuation, 18);
                jVar19.v = obj2;
                return jVar19;
            case 19:
                j jVar20 = new j((nhc.i) this.f213895w, continuation, 19);
                jVar20.v = obj2;
                return jVar20;
            case 20:
                return new j((NavBarWithToolbar) this.v, (SelectAddressScreen) this.f213895w, continuation, 20);
            case 21:
                j jVar21 = new j((CryptoPortfolioScreen) this.f213895w, continuation, 21);
                jVar21.v = obj2;
                return jVar21;
            case 22:
                j jVar22 = new j((com.revolut.feature.trusted_merchants.impl.ui.kompot.list.a) this.f213895w, continuation, 22);
                jVar22.v = obj2;
                return jVar22;
            case 23:
                j jVar23 = new j((AtmWithdrawalLimitsBottomSheetController) this.f213895w, continuation, 23);
                jVar23.v = obj2;
                return jVar23;
            case 24:
                j jVar24 = new j((com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.b) this.f213895w, continuation, 24);
                jVar24.v = obj2;
                return jVar24;
            case 25:
                j jVar25 = new j((nk6.j) this.f213895w, continuation, 25);
                jVar25.v = obj2;
                return jVar25;
            case 26:
                j jVar26 = new j((o) this.f213895w, continuation, 26);
                jVar26.v = obj2;
                return jVar26;
            case 27:
                return new j((nli.e) this.v, (File) this.f213895w, continuation, 27);
            case 28:
                j jVar27 = new j((nm6.j) this.f213895w, continuation, 28);
                jVar27.v = obj2;
                return jVar27;
            default:
                j jVar28 = new j((m) this.f213895w, continuation, 29);
                jVar28.v = obj2;
                return jVar28;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v45, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v60, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v68, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 20;
        int i3 = 1;
        Object obj3 = this.f213895w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVar = (k) obj3;
                kVar.H2(kVar.f213899s, new lsl.d(list, 25));
                return Unit.f186387a;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.donations.impl.ui.kompot.flow.overview.b bVar = (com.revolut.feature.donations.impl.ui.kompot.flow.overview.b) obj3;
                bVar.H2(bVar.f72024t, new mtl.k(data, 29));
                return Unit.f186387a;
            case 2:
                String query = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nch.e eVarE3 = ((InstrumentsCollectionFiltersSeeAllController) obj3).R2();
                Intrinsics.h(query);
                nch.k kVar2 = (nch.k) eVarE3;
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                kVar2.H2(kVar2.f214195q, new nc1.j(kVar2, query, i3));
                return Unit.f186387a;
            case 3:
                String url2 = (String) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nci.l lVarE3 = ((ReadTermsController) obj3).R2();
                Intrinsics.h(url2);
                r rVar = (r) lVarE3;
                rVar.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                rVar.C1(new ExternalDestination.Browser(url2, null));
                return Unit.f186387a;
            case 4:
                Data data2 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar2 = (r) obj3;
                rVar2.H2(rVar2.f214217s, new q(data2, 0));
                return Unit.f186387a;
            case 5:
                ty0.a aVar6 = (ty0.a) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a aVar8 = (com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a) obj3;
                zd4.b bVar2 = aVar8.f67914r;
                String str = aVar6.f275445a;
                bVar2.getClass();
                aVar8.C1(zd4.b.a(str));
                return Unit.f186387a;
            case 6:
                ty0.a aVar9 = (ty0.a) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nf4.j jVarE3 = ((CalculatorScreen) obj3).d();
                Intrinsics.h(aVar9);
                c8g.c.o(jVarE3, aVar9);
                return Unit.f186387a;
            case 7:
                Data data3 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.c) obj3).I2(data3);
                return Unit.f186387a;
            case 8:
                List list2 = (List) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return p.a.j(CryptoExchangeFeesFacade.class, KTypeProjection.INSTANCE, List.class, ((nf5.d) obj3).f214832a, String.valueOf(list2.hashCode()));
            case 9:
                n nVar = (n) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVar = (p) obj3;
                List list3 = (List) p.a.j(kfj.o.class, KTypeProjection.INSTANCE, List.class, pVar.f215013c, pVar.c(nVar));
                if (list3 != null) {
                    return jb3.l.B(list3);
                }
                return null;
            case 10:
                List list4 = (List) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = ((u) obj3).f215049c;
                String strB = u.b(list4);
                Type type = u.f;
                Intrinsics.checkNotNullExpressionValue(type, "access$getEventsDtoType$cp(...)");
                List list5 = (List) cVar.T2(strB, type);
                if (list5 != null) {
                    return knm.b.N(list5);
                }
                return null;
            case 11:
                a0 a0Var = (a0) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                kfj.a0 a0Var2 = (kfj.a0) j6.a.k(kfj.a0.class, ((b0) obj3).f214920c, a0Var.f214914c);
                if (a0Var2 != null) {
                    return ofj.e.a(a0Var2);
                }
                return null;
            case 12:
                d0 d0Var = (d0) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list6 = (List) p.a.j(i0.class, KTypeProjection.INSTANCE, List.class, ((e0) obj3).f214937c, e0.a(d0Var));
                if (list6 != null) {
                    return w0.i(list6);
                }
                return null;
            case 13:
                y0 y0Var = (y0) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar2 = ((z0) obj3).f215079c;
                String strA = z0.a(y0Var);
                z0.Companion.getClass();
                List list7 = (List) cVar2.T2(strA, z0.f);
                if (list7 != null) {
                    return ofj.l.a(list7);
                }
                return null;
            case 14:
                String str2 = (String) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar3 = ((s2) obj3).f215040c;
                String strQ = j6.a.q("SUBSCRIPTION_KEY", str2);
                s2.Companion.getClass();
                q3 q3Var = (q3) cVar3.T2(strQ, s2.i);
                if (q3Var != null) {
                    return ofj.p.d(q3Var);
                }
                return null;
            case 15:
                d4 d4Var = (d4) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar4 = ((w2) obj3).f215065c;
                if (v2.f215062a[d4Var.ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                d5 d5Var = (d5) cVar4.T2("ESIM_WIDGETS_CONFIG_KEY_type=HOME_SCREEN", w2.e);
                if (d5Var != null) {
                    return n14.k.z(d5Var);
                }
                return null;
            case 16:
                Data data4 = (Data) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.a aVar21 = (com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.a) obj3;
                aVar21.H2(aVar21.f94254q, new q(data4, 4));
                return Unit.f186387a;
            case 17:
                PortfolioUpdatesScreenContract$Action action = (PortfolioUpdatesScreenContract$Action) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ngh.h) ((PortfolioUpdatesScreen) obj3).L.getValue()).getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                return Unit.f186387a;
            case 18:
                Data data5 = (Data) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ngh.h hVar = (ngh.h) obj3;
                hVar.H2(hVar.f215171q, new q(data5, 5));
                return Unit.f186387a;
            case 19:
                nhc.e eVar = (nhc.e) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                chc.n nVar2 = (chc.n) j6.a.k(chc.n.class, ((nhc.i) obj3).f215413b, eVar.a());
                if (nVar2 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(nVar2, "<this>");
                chc.m mVar = nVar2.f24172a;
                RentAndBillsConfigurations.Configuration configurationA = mVar != null ? dhc.a.a(mVar) : null;
                chc.m mVar2 = nVar2.f24173b;
                return new RentAndBillsConfigurations(configurationA, mVar2 != null ? dhc.a.a(mVar2) : null);
            case 20:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.v;
                Intrinsics.h(navBarWithToolbar);
                Intrinsics.checkNotNullParameter(navBarWithToolbar, "<this>");
                e0m.e.d(navBarWithToolbar);
                ((SelectAddressScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 21:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nje.e eVar2 = (nje.e) ((CryptoPortfolioScreen) obj3).f89788o0.getValue();
                Intrinsics.h(clickData);
                nje.n nVar3 = (nje.n) eVar2;
                nVar3.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                nVar3.f216468q.Z2(clickData);
                return Unit.f186387a;
            case 22:
                TrustedMerchantsFlowContract$MerchantsContent trustedMerchantsFlowContract$MerchantsContent = (TrustedMerchantsFlowContract$MerchantsContent) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.trusted_merchants.impl.ui.kompot.list.a aVar28 = (com.revolut.feature.trusted_merchants.impl.ui.kompot.list.a) obj3;
                aVar28.H2(aVar28.f94432p, new nfj.l(trustedMerchantsFlowContract$MerchantsContent, i2));
                return Unit.f186387a;
            case 23:
                n6 n6Var = (n6) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nk2.e eVar3 = (nk2.e) ((AtmWithdrawalLimitsBottomSheetController) obj3).S.getValue();
                String tag2 = n6Var.f;
                nk2.d dVar = (nk2.d) eVar3;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(tag2, "tag");
                if (Intrinsics.f(tag2, "MONTHLY_LIMIT_BUTTON_TAG")) {
                    Data data6 = ((nk2.f) ((j2) dVar.f216631s.f22677a).getValue()).f216634c;
                    if (data6 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    c93.p pVar2 = (c93.p) zi0.c.I(data6);
                    c93.r rVar3 = pVar2.f22295a;
                    int i5 = nk2.b.f216625b[rVar3.ordinal()];
                    if (i5 == 1) {
                        Map map = pVar2.f;
                        if (map == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        dVar.C2(new tj2.d(map));
                    } else {
                        if (i5 != 2) {
                            throw new IllegalArgumentException("Unexpected state: " + rVar3);
                        }
                        String str3 = pVar2.e;
                        if (str3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        dVar.C2(new tj2.e(str3));
                    }
                } else if (Intrinsics.f(tag2, "UPDATE_DAILY_LIMIT_BUTTON_TAG")) {
                    dVar.C2(f.a.f271603a);
                }
                return Unit.f186387a;
            case 24:
                Data data7 = (Data) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.b bVar3 = (com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.b) obj3;
                bVar3.H2(bVar3.f68643s, new q(data7, 16));
                return Unit.f186387a;
            case 25:
                Data data8 = (Data) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nk6.j jVar = (nk6.j) obj3;
                jVar.H2(jVar.f216664p, new q(data8, 17));
                return Unit.f186387a;
            case 26:
                Data data9 = (Data) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((o) obj3).x2(new q(data9, 18));
                return Unit.f186387a;
            case 27:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zk0.b bVar4 = ((nli.e) this.v).f217145a;
                String absolutePath = ((File) obj3).getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                ((a80.h) bVar4).d(absolutePath);
                return Unit.f186387a;
            case 28:
                Data data10 = (Data) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nm6.j jVar2 = (nm6.j) obj3;
                jVar2.H2(jVar2.f217193r, new q(data10, 19));
                return Unit.f186387a;
            default:
                Data data11 = (Data) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVar3 = (m) obj3;
                mVar3.H2(mVar3.f217230r, new q(data11, i2));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f213895w = obj2;
    }
}
