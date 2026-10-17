package zfd;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.wero.impl.ui.home.payment_area.WeroPaymentAreaScreen;
import com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.MandateSetupBottomSheetController;
import com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.ReviewAccountLinkingDetailsScreen;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.robo.impl.ui.screen.transaction_details.RoboTransactionDetailsController;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests.SalaryRequestsScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import e60.l;
import fnc.a0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import skm.p0;
import tnb.g0;
import znd.u0;
import znd.v0;
import zs9.z;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f321943w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.bank_account_switching.impl.ui.review.b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 21;
        this.v = bVar;
        this.f321943w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s((com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10.a) this.f321943w, continuation, 0);
                sVar.v = obj2;
                return sVar;
            case 1:
                s sVar2 = new s((MandateSetupBottomSheetController) this.f321943w, continuation, 1);
                sVar2.v = obj2;
                return sVar2;
            case 2:
                s sVar3 = new s((com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.b) this.f321943w, continuation, 2);
                sVar3.v = obj2;
                return sVar3;
            case 3:
                s sVar4 = new s((com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.b) this.f321943w, continuation, 3);
                sVar4.v = obj2;
                return sVar4;
            case 4:
                s sVar5 = new s((com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.invitation.e) this.f321943w, continuation, 4);
                sVar5.v = obj2;
                return sVar5;
            case 5:
                s sVar6 = new s((WeroPaymentAreaScreen) this.f321943w, continuation, 5);
                sVar6.v = obj2;
                return sVar6;
            case 6:
                s sVar7 = new s((zhb.k) this.f321943w, continuation, 6);
                sVar7.v = obj2;
                return sVar7;
            case 7:
                s sVar8 = new s((zhf.g) this.f321943w, continuation, 7);
                sVar8.v = obj2;
                return sVar8;
            case 8:
                s sVar9 = new s((com.revolut.feature.external_accounts.impl.ui.brazil.linked_accounts.a) this.f321943w, continuation, 8);
                sVar9.v = obj2;
                return sVar9;
            case 9:
                s sVar10 = new s((com.revolut.feature.pay_later.impl.ui.paymentoptions.options.a) this.f321943w, continuation, 9);
                sVar10.v = obj2;
                return sVar10;
            case 10:
                s sVar11 = new s((com.revolut.feature.alipay.impl.ui.qr.showcode.a) this.f321943w, continuation, 10);
                sVar11.v = obj2;
                return sVar11;
            case 11:
                s sVar12 = new s((com.revolut.feature.apm.aani.impl.ui.settings.a) this.f321943w, continuation, 11);
                sVar12.v = obj2;
                return sVar12;
            case 12:
                s sVar13 = new s((zlb.o) this.f321943w, continuation, 12);
                sVar13.v = obj2;
                return sVar13;
            case 13:
                s sVar14 = new s((zll.b) this.f321943w, continuation, 13);
                sVar14.v = obj2;
                return sVar14;
            case 14:
                s sVar15 = new s((zm2.j) this.f321943w, continuation, 14);
                sVar15.v = obj2;
                return sVar15;
            case 15:
                s sVar16 = new s((zmd.o) this.f321943w, continuation, 15);
                sVar16.v = obj2;
                return sVar16;
            case 16:
                s sVar17 = new s((ReviewAccountLinkingDetailsScreen) this.f321943w, continuation, 16);
                sVar17.v = obj2;
                return sVar17;
            case 17:
                s sVar18 = new s((com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.c) this.f321943w, continuation, 17);
                sVar18.v = obj2;
                return sVar18;
            case 18:
                s sVar19 = new s((RoboTransactionDetailsController) this.f321943w, continuation, 18);
                sVar19.v = obj2;
                return sVar19;
            case 19:
                s sVar20 = new s((znc.n) this.f321943w, continuation, 19);
                sVar20.v = obj2;
                return sVar20;
            case 20:
                s sVar21 = new s((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b) this.f321943w, continuation, 20);
                sVar21.v = obj2;
                return sVar21;
            case 21:
                return new s((com.revolut.feature.bank_account_switching.impl.ui.review.b) this.v, (String) this.f321943w, continuation);
            case 22:
                s sVar22 = new s((zoc.f) this.f321943w, continuation, 22);
                sVar22.v = obj2;
                return sVar22;
            case 23:
                s sVar23 = new s((zp2.i) this.f321943w, continuation, 23);
                sVar23.v = obj2;
                return sVar23;
            case 24:
                s sVar24 = new s((SalaryRequestsScreen) this.f321943w, continuation, 24);
                sVar24.v = obj2;
                return sVar24;
            case 25:
                s sVar25 = new s((com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests.a) this.f321943w, continuation, 25);
                sVar25.v = obj2;
                return sVar25;
            case 26:
                s sVar26 = new s((zqf.k) this.f321943w, continuation, 26);
                sVar26.v = obj2;
                return sVar26;
            case 27:
                s sVar27 = new s((z) this.f321943w, continuation, 27);
                sVar27.v = obj2;
                return sVar27;
            case 28:
                s sVar28 = new s((zsk.e) this.f321943w, continuation, 28);
                sVar28.v = obj2;
                return sVar28;
            default:
                s sVar29 = new s((zt2.c) this.f321943w, continuation, 29);
                sVar29.v = obj2;
                return sVar29;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((s) create((ce9.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((s) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((s) create((e7l.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((s) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((s) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((s) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((s) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((s) create((zhf.k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((s) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((s) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((s) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((s) create((glc.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((s) create((znd.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((s) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((s) create((alc.n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((s) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((s) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((s) create((e60.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((s) create((st2.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r15v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v56, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        int i2 = 3;
        int i3 = 2;
        int i5 = 4;
        int i6 = 0;
        Object obj3 = this.f321943w;
        switch (i) {
            case 0:
                ce9.p pVar = (ce9.p) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10.a) obj3).x2(new aff.m(pVar, 3));
                return Unit.f186387a;
            case 1:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zg6.b bVarM3 = ((MandateSetupBottomSheetController) obj3).h3();
                String url2 = aVar2.f275445a;
                com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.b bVar = (com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.b) bVarM3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                BridgeDestination bridgeDestinationA = bVar.f72432r.a(url2);
                if (bridgeDestinationA != null) {
                    bVar.C1(bridgeDestinationA);
                }
                return Unit.f186387a;
            case 2:
                e7l.f fVar = (e7l.f) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.b bVar2 = (com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.b) obj3;
                Intrinsics.h(fVar);
                ch6.n nVarA = ((ch6.p) bVar2.f72431q).a(bVar2.o.f72426b, fVar);
                if (nVarA != null) {
                    bVar2.H2(bVar2.u, new zf5.n(nVarA, fVar, i5));
                }
                return Unit.f186387a;
            case 3:
                n1 n1Var = (n1) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.b bVar3 = (com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.b) obj3;
                    bVar3.getClass();
                    bVar3.n2(new zah.f(bVar3, continuation, i5), new zg7.c(bVar3, i3));
                }
                return Unit.f186387a;
            case 4:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.invitation.e eVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.invitation.e) obj3;
                n1 n1Var2 = (n1) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var2 instanceof l1) {
                    eVar.C1(new BridgeDestination(eVar.f103032p.d()));
                } else {
                    oki.h.D2(eVar.v);
                }
                return Unit.f186387a;
            case 5:
                String str = (String) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zh2.c cVar = (zh2.c) ((WeroPaymentAreaScreen) obj3).P.getValue();
                Intrinsics.h(str);
                ((zh2.e) cVar).I2(str);
                return Unit.f186387a;
            case 6:
                String str2 = (String) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zhb.k kVar = (zhb.k) obj3;
                kVar.H2(kVar.f322391r, new zf5.n(str2, kVar, 9));
                return Unit.f186387a;
            case 7:
                zhf.k kVar2 = (zhf.k) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((zhf.g) obj3).f3(new zhf.f(kVar2, i6));
                return Unit.f186387a;
            case 8:
                Data data = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.brazil.linked_accounts.a aVar11 = (com.revolut.feature.external_accounts.impl.ui.brazil.linked_accounts.a) obj3;
                aVar11.H2(aVar11.f72649q, new zd3.h(data, 11));
                return Unit.f186387a;
            case 9:
                Data data2 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.pay_later.impl.ui.paymentoptions.options.a aVar13 = (com.revolut.feature.pay_later.impl.ui.paymentoptions.options.a) obj3;
                aVar13.H2(aVar13.f78890r, new zd3.h(data2, 12));
                return Unit.f186387a;
            case 10:
                Data data3 = (Data) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.alipay.impl.ui.qr.showcode.a aVar15 = (com.revolut.feature.alipay.impl.ui.qr.showcode.a) obj3;
                aVar15.H2(aVar15.f61082q, new zd3.h(data3, 19));
                return Unit.f186387a;
            case 11:
                Data data4 = (Data) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.apm.aani.impl.ui.settings.a aVar17 = (com.revolut.feature.apm.aani.impl.ui.settings.a) obj3;
                aVar17.H2(aVar17.f61141p, new zf5.n(aVar17, data4));
                return Unit.f186387a;
            case 12:
                Data data5 = (Data) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zlb.o oVar = (zlb.o) obj3;
                oVar.H2(oVar.f323225s, new zf5.n(data5, oVar, 18));
                return Unit.f186387a;
            case 13:
                zll.b bVar4 = (zll.b) obj3;
                n1 n1Var3 = (n1) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((n1Var3 instanceof j1) || (n1Var3 instanceof k1) || (n1Var3 instanceof m1)) {
                    oki.h.D2(bVar4.s());
                } else {
                    if (!(n1Var3 instanceof l1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((rqk.k) bVar4.o).getClass();
                    bVar4.C1(new ChatFlowDestination(new ChatTarget.Messages(new ChatFeed.Support(null, null, null, 7), null, null, 6), false));
                }
                return Unit.f186387a;
            case 14:
                n1 n1Var4 = (n1) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var4 instanceof l1) {
                    ((zm2.j) obj3).B2();
                }
                return Unit.f186387a;
            case 15:
                Data data6 = (Data) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zmd.o oVar2 = (zmd.o) obj3;
                oVar2.H2(oVar2.f323476t, new zd3.h(data6, 21));
                return Unit.f186387a;
            case 16:
                ty0.a aVar22 = (ty0.a) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zn6.k kVarE3 = ((ReviewAccountLinkingDetailsScreen) obj3).R2();
                String url3 = aVar22.f275445a;
                com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.c cVar2 = (com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.c) kVarE3;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(url3, "url");
                BridgeDestination bridgeDestinationA2 = cVar2.f73062r.a(url3);
                if (bridgeDestinationA2 != null) {
                    cVar2.C1(bridgeDestinationA2);
                }
                return Unit.f186387a;
            case 17:
                Data data7 = (Data) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.c cVar3 = (com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.c) obj3;
                cVar3.H2(cVar3.f73063s, new zf5.n(data7, (oh6.e) data7.getContent(), 26));
                return Unit.f186387a;
            case 18:
                glc.h parcel = (glc.h) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                znc.n nVar = (znc.n) ((RoboTransactionDetailsController) obj3).R.getValue();
                nVar.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                nVar.f323705q.invoke(parcel);
                return Unit.f186387a;
            case 19:
                Data data8 = (Data) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                znc.n nVar2 = (znc.n) obj3;
                nVar2.H2(nVar2.f323706r, new znc.m(data8, i6));
                return Unit.f186387a;
            case 20:
                znd.a aVar27 = (znd.a) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b bVar5 = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b) obj3;
                bVar5.H2(bVar5.N, new v0(aVar27, 0));
                return Unit.f186387a;
            case 21:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.bank_account_switching.impl.ui.review.b) this.v).C2(new zo2.e((String) obj3));
                return Unit.f186387a;
            case 22:
                alc.n nVar3 = (alc.n) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rul.e eVar2 = ((zoc.f) obj3).e;
                xi0.b portfolioBaseCurrency = nVar3.i;
                Intrinsics.checkNotNullParameter(portfolioBaseCurrency, "portfolioBaseCurrency");
                wsg.n nVar4 = (wsg.n) eVar2.f257629a;
                return nim.a.v(nim.a.v(rd0.e.b(kli.a.i(nim.a.w(osg.b.e(nVar4, false, io3.l.CURRENT, io3.k.ACTIVE, null, null, null, null, SyslogConstants.LOG_CLOCK), new u0(5)), nVar4.W(AccountId.Personal.f51414a), rd0.e.c(((g0) eVar2.f257630b).h(), p0.f264003c))), new vgc.b(eVar2, portfolioBaseCurrency, 22)), new a0(nVar3, i3));
            case 23:
                n1 n1Var5 = (n1) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var5 instanceof l1) {
                    ((zp2.i) obj3).C2(zp2.f.f324165a);
                }
                return Unit.f186387a;
            case 24:
                String listId = (String) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zqc.h hVarE3 = ((SalaryRequestsScreen) obj3).d();
                Intrinsics.h(listId);
                com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests.a aVar33 = (com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests.a) hVarE3;
                aVar33.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("SALARY_REQUEST_MENU_HELP_ID")) {
                    aVar33.f85296p.getClass();
                    aVar33.C1(new BridgeDestination(gc0.c.f(new FaqFeatureConfig.Starter("76db7691-ab94-4c80-b444-03a99f6b6366", 2))));
                }
                return Unit.f186387a;
            case 25:
                Data data9 = (Data) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests.a aVar35 = (com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests.a) obj3;
                aVar35.H2(aVar35.f85297q, new znc.m(data9, i2));
                return Unit.f186387a;
            case 26:
                Data data10 = (Data) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((zqf.k) obj3).x2(new znc.m(data10, i5));
                return Unit.f186387a;
            case 27:
                e60.l lVar = (e60.l) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (lVar instanceof e60.m) {
                    ((z) obj3).x2(new b22.j(((e60.m) lVar).b(), 14));
                } else {
                    if (!(lVar instanceof l.a) && !(lVar instanceof e60.j) && !(lVar instanceof e60.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.INFO, "PaymentsGroupsCustomization", "MediaPicker.observeMediaPickerResult() returned unsupported result: " + lVar, null, null, 16);
                }
                return Unit.f186387a;
            case 28:
                Data data11 = (Data) this.v;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zsk.e eVar3 = (zsk.e) obj3;
                eVar3.X2(eVar3.f324950n, new znc.m(data11, 8));
                return Unit.f186387a;
            default:
                st2.c cVar4 = (st2.c) this.v;
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((zt2.c) obj3).i.setValue(cVar4);
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f321943w = obj2;
    }
}
