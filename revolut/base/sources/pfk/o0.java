package pfk;

import aw0.n6;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.dashboard.WaitingListV3DashboardScreen;
import com.revolut.feature.credit.health.api.navigation.CreditHealthNavigationDestination;
import com.revolut.feature.crypto.onboarding.impl.ui.fca.screen.learn.CryptoFcaLearnScreen;
import com.revolut.feature.crypto.onboarding.impl.ui.fca.screen.learn.CryptoFcaLearnScreenContract$Parcel$Link;
import com.revolut.feature.insurance.impl.ui.cfac.claim.bottom_sheet.screen.CFACInsuranceBottomSheetScreen;
import com.revolut.feature.retail.savings.api.documents.models.TaxForm;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.SavingsProductSelectionContract$ModalStep;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.SavingsProductSelectionScreen;
import com.revolut.feature.retail.savings.impl.documents.presentation.tax_form.TaxFormsScreen;
import com.revolut.feature.salary_switch.api.navigation.SalarySwitchDestination;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import com.revolut.feature.wealth.ui.impl.trades.HoldingTradeDetailsController;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.BrowserCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPortingSteps;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import com.revolut.sso.impl.ui.phone.enter_phone.EnterPhoneScreen;
import ip0.f6;
import ip0.vd;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import skm.a2;
import vkm.j2;
import yhm.m;
import zlc.c;

/* JADX INFO: loaded from: classes11.dex */
public final class o0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f235662w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f235662w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o0 o0Var = new o0((p0) this.f235662w, continuation, 0);
                o0Var.v = obj2;
                return o0Var;
            case 1:
                o0 o0Var2 = new o0((ph9.b) this.f235662w, continuation, 1);
                o0Var2.v = obj2;
                return o0Var2;
            case 2:
                o0 o0Var3 = new o0((phc.j) this.f235662w, continuation, 2);
                o0Var3.v = obj2;
                return o0Var3;
            case 3:
                o0 o0Var4 = new o0((bhl.a) this.f235662w, continuation, 3);
                o0Var4.v = obj2;
                return o0Var4;
            case 4:
                o0 o0Var5 = new o0((CryptoFcaLearnScreen) this.f235662w, continuation, 4);
                o0Var5.v = obj2;
                return o0Var5;
            case 5:
                o0 o0Var6 = new o0((pi5.f) this.f235662w, continuation, 5);
                o0Var6.v = obj2;
                return o0Var6;
            case 6:
                return new o0((String) this.v, (com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d) this.f235662w, continuation);
            case 7:
                o0 o0Var7 = new o0((pj3.r) this.f235662w, continuation, 7);
                o0Var7.v = obj2;
                return o0Var7;
            case 8:
                o0 o0Var8 = new o0((WaitingListV3DashboardScreen) this.f235662w, continuation, 8);
                o0Var8.v = obj2;
                return o0Var8;
            case 9:
                o0 o0Var9 = new o0((pj4.k) this.f235662w, continuation, 9);
                o0Var9.v = obj2;
                return o0Var9;
            case 10:
                o0 o0Var10 = new o0((CFACInsuranceBottomSheetScreen) this.f235662w, continuation, 10);
                o0Var10.v = obj2;
                return o0Var10;
            case 11:
                o0 o0Var11 = new o0((pk9.k) this.f235662w, continuation, 11);
                o0Var11.v = obj2;
                return o0Var11;
            case 12:
                o0 o0Var12 = new o0((pkh.k) this.f235662w, continuation, 12);
                o0Var12.v = obj2;
                return o0Var12;
            case 13:
                o0 o0Var13 = new o0((plc.b) this.f235662w, continuation, 13);
                o0Var13.v = obj2;
                return o0Var13;
            case 14:
                o0 o0Var14 = new o0((frk.b) this.f235662w, continuation, 14);
                o0Var14.v = obj2;
                return o0Var14;
            case 15:
                o0 o0Var15 = new o0((plc.f) this.f235662w, continuation, 15);
                o0Var15.v = obj2;
                return o0Var15;
            case 16:
                o0 o0Var16 = new o0((plc.g) this.f235662w, continuation, 16);
                o0Var16.v = obj2;
                return o0Var16;
            case 17:
                o0 o0Var17 = new o0((EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen) this.f235662w, continuation, 17);
                o0Var17.v = obj2;
                return o0Var17;
            case 18:
                o0 o0Var18 = new o0((pm9.f) this.f235662w, continuation, 18);
                o0Var18.v = obj2;
                return o0Var18;
            case 19:
                o0 o0Var19 = new o0((SavingsProductSelectionScreen) this.f235662w, continuation, 19);
                o0Var19.v = obj2;
                return o0Var19;
            case 20:
                o0 o0Var20 = new o0((com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.a) this.f235662w, continuation, 20);
                o0Var20.v = obj2;
                return o0Var20;
            case 21:
                o0 o0Var21 = new o0((TaxFormsScreen) this.f235662w, continuation, 21);
                o0Var21.v = obj2;
                return o0Var21;
            case 22:
                o0 o0Var22 = new o0((pnb.h) this.f235662w, continuation, 22);
                o0Var22.v = obj2;
                return o0Var22;
            case 23:
                o0 o0Var23 = new o0((HoldingTradeDetailsController) this.f235662w, continuation, 23);
                o0Var23.v = obj2;
                return o0Var23;
            case 24:
                o0 o0Var24 = new o0((pnj.h) this.f235662w, continuation, 24);
                o0Var24.v = obj2;
                return o0Var24;
            case 25:
                o0 o0Var25 = new o0((com.revolut.feature.payments.air.widget.impl.ui.chat.b) this.f235662w, continuation, 25);
                o0Var25.v = obj2;
                return o0Var25;
            case 26:
                o0 o0Var26 = new o0((EnterPhoneScreen) this.f235662w, continuation, 26);
                o0Var26.v = obj2;
                return o0Var26;
            case 27:
                o0 o0Var27 = new o0((com.revolut.feature.credit.card.impl.ui.additional_cards.management.a) this.f235662w, continuation, 27);
                o0Var27.v = obj2;
                return o0Var27;
            case 28:
                o0 o0Var28 = new o0((pp6.k) this.f235662w, continuation, 28);
                o0Var28.v = obj2;
                return o0Var28;
            default:
                o0 o0Var29 = new o0((ppe.g) this.f235662w, continuation, 29);
                o0Var29.v = obj2;
                return o0Var29;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws Throwable {
        switch (this.u) {
            case 0:
                return ((o0) create((v0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((o0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((o0) create((cgc.o) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((o0) create((phl.k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((o0) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((o0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((o0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((o0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((o0) create((au3.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((o0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((o0) create((vd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((o0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((o0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((o0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((o0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((o0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                ((o0) create(null, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
            case 17:
                return ((o0) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((o0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((o0) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((o0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((o0) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((o0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((o0) create((f6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((o0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((o0) create((po9.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((o0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((o0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((o0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v66, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        pi5.d dVar;
        xdh.c cVar;
        alc.m mVar;
        Data data;
        int i = this.u;
        int i2 = 26;
        int i3 = 15;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        int i5 = 29;
        int i6 = 25;
        int i21 = 6;
        int i22 = 7;
        int i32 = 2;
        int i33 = 1;
        PortfolioGoal portfolioGoal = null;
        Object obj3 = this.f235662w;
        switch (i) {
            case 0:
                v0 v0Var = (v0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xe0.e eVar = ((p0) obj3).f235670c;
                String strA = v0Var.a();
                p0.Companion.getClass();
                gfk.g0 g0Var = (gfk.g0) eVar.T2(strA, p0.u);
                if (g0Var != null) {
                    return kp0.w0.y(g0Var);
                }
                return null;
            case 1:
                n1 n1Var = (n1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ph9.b) obj3).Z2(n1Var, new pgk.d(i3));
                return Unit.f186387a;
            case 2:
                cgc.o oVar = (cgc.o) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) ((phc.j) obj3).e.T2(j6.a.q("PERK_LIST_CACHE_KEY", oVar.name()), phc.j.u);
                if (list != null) {
                    return czi.c.N(list);
                }
                return null;
            case 3:
                phl.k kVar = (phl.k) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ehl.c cVarC = ((bhl.a) obj3).c(kVar.f236359a, kVar.f236360b);
                if (cVarC != null) {
                    return ihl.c.c(cVarC);
                }
                return null;
            case 4:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pi5.f fVar = (pi5.f) ((CryptoFcaLearnScreen) obj3).Q.getValue();
                Intrinsics.h(clickData);
                fVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj4 = clickData.d;
                cryptoFcaLearnScreenContract$Parcel$Link = obj4 instanceof CryptoFcaLearnScreenContract$Parcel$Link ? (CryptoFcaLearnScreenContract$Parcel$Link) obj4 : 0;
                if (cryptoFcaLearnScreenContract$Parcel$Link != 0 && (dVar = cryptoFcaLearnScreenContract$Parcel$Link.f70894a) != null) {
                    fVar.C1(new BridgeDestination(new BrowserCommand(((f80.b) fVar.o).f(dVar.a()))));
                }
                return Unit.f186387a;
            case 5:
                Data data2 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pi5.f fVar2 = (pi5.f) obj3;
                fVar2.H2(fVar2.f236428r, new ox5.m0(data2, i5));
                return Unit.f186387a;
            case 6:
                com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d dVar2 = (com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d) obj3;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str = (String) this.v;
                if (str == null) {
                    oki.h.D2(dVar2.f72523w);
                } else {
                    dVar2.C2(new pi6.m(str));
                }
                return Unit.f186387a;
            case 7:
                pj3.r rVar = (pj3.r) obj3;
                cli.y yVar = rVar.v;
                Data data3 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                hj3.a aVar9 = (hj3.a) data3.getContent();
                if (aVar9 == null || aVar9.equals(rVar.u)) {
                    rVar.H2(yVar, new pig.u(data3, 14));
                } else {
                    fj3.f fVar3 = rVar.o.f65945b;
                    int i43 = pj3.p.f236645a[fVar3.ordinal()];
                    if (i43 == 1) {
                        ArrayList arrayList = aVar9.f;
                        if (arrayList.isEmpty()) {
                            fVar3 = fj3.f.LIGHT;
                        } else {
                            Iterator it8 = arrayList.iterator();
                            while (it8.hasNext()) {
                                if (((hj3.g) it8.next()).e.f152655a == null) {
                                    fVar3 = fj3.f.DARK;
                                }
                            }
                            fVar3 = fj3.f.LIGHT;
                        }
                    } else if (i43 != 2 && i43 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rVar.u = aVar9;
                    rVar.H2(yVar, new pj3.b(data3, fVar3, i33));
                    a2 a2Var = rVar.f236654t;
                    Continuation continuation = null;
                    if (a2Var != null) {
                        a2Var.f(null);
                    }
                    rVar.f236654t = rVar.l2(new of6.d(rVar, aVar9, fVar3, continuation, 16), new yi5.b(i2));
                }
                return Unit.f186387a;
            case 8:
                au3.h action = (au3.h) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pj4.k kVarE3 = ((WaitingListV3DashboardScreen) obj3).R2();
                kVarE3.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                if (action instanceof au3.f) {
                    kVarE3.l2(new pdi.j(kVarE3, ((au3.f) action).f9475a, cryptoFcaLearnScreenContract$Parcel$Link, 16), new yi5.b(i2));
                    Unit unit = Unit.f186387a;
                } else if (action instanceof au3.e) {
                    kVarE3.C1(CreditHealthNavigationDestination.f69955b);
                } else {
                    if (!(action instanceof au3.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVarE3.C1(zh9.u0.b(zh9.u0.f(new SalarySwitchDestination(null, null))));
                }
                return Unit.f186387a;
            case 9:
                Data data4 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pj4.k kVar2 = (pj4.k) obj3;
                kVar2.H2(kVar2.f236675t, new pig.u(data4, i3));
                return Unit.f186387a;
            case 10:
                vd data5 = (vd) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pj7.m mVarM3 = ((CFACInsuranceBottomSheetScreen) obj3).d();
                Intrinsics.h(data5);
                pj7.o oVar2 = (pj7.o) mVarM3;
                oVar2.getClass();
                Intrinsics.checkNotNullParameter(data5, "data");
                LocalDate localDate = data5.f166807b;
                wj7.o.Companion.getClass();
                ZoneId zoneId = wj7.h.f297977b;
                Intrinsics.checkNotNullExpressionValue(zoneId, "<get-UTC_TIME_ZONE>(...)");
                oVar2.H2(oVar2.f236689p, new nxc.a(ebm.a.O(localDate, zoneId), i33));
                return Unit.f186387a;
            case 11:
                Data data6 = (Data) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pk9.k kVar3 = (pk9.k) obj3;
                kVar3.H2(kVar3.f236950q, new pig.u(data6, 18));
                return Unit.f186387a;
            case 12:
                Data data7 = (Data) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pkh.k kVar4 = (pkh.k) obj3;
                kVar4.H2(kVar4.f237194q, new pig.u(data7, 19));
                return Unit.f186387a;
            case 13:
                String str2 = (String) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                plc.b bVar = (plc.b) obj3;
                ue0.c cVar2 = bVar.f237324c;
                String strQ = j6.a.q("BENCHMARKS_", str2);
                Type type = bVar.d;
                Intrinsics.checkNotNullExpressionValue(type, "access$getBENCHMARKS_TYPE$p(...)");
                List list2 = (List) cVar2.T2(strQ, type);
                if (list2 != null) {
                    return d9.t0.u(list2);
                }
                return null;
            case 14:
                String str3 = (String) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ulc.a aVar17 = (ulc.a) j6.a.k(ulc.a.class, ((frk.b) obj3).f137489b, frk.b.a(str3));
                if (aVar17 != null) {
                    return ulc.b.a(aVar17);
                }
                return null;
            case 15:
                String str4 = (String) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zlc.c entity = (zlc.c) j6.a.k(zlc.c.class, ((plc.f) obj3).f237333b, str4);
                if (entity == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(entity, "entity");
                String portfolioId = entity.getPortfolioId();
                int i59 = ylc.a.f314686c[entity.getState().ordinal()];
                if (i59 == 1) {
                    cVar = xdh.c.CREATED;
                } else if (i59 == 2) {
                    cVar = xdh.c.ACTIVE;
                } else if (i59 == 3) {
                    cVar = xdh.c.SUSPENDED;
                } else if (i59 == 4) {
                    cVar = xdh.c.OFFBOARDING;
                } else {
                    if (i59 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar = xdh.c.TERMINATED;
                }
                xdh.c cVar3 = cVar;
                String name = entity.getName();
                String iconName = entity.getIconName();
                String portfolioTemplate = entity.getPortfolioTemplate();
                String recommendedTemplate = entity.getRecommendedTemplate();
                LocalDate canChangeTemplateSince = entity.getCanChangeTemplateSince();
                String newTemplate = entity.getNewTemplate();
                String baseCurrency = entity.getBaseCurrency();
                xi0.b.Companion.getClass();
                xi0.b bVarA = xi0.a.a(baseCurrency);
                List<c.b> ongoingRebalanceTypes = entity.getOngoingRebalanceTypes();
                ArrayList arrayList2 = new ArrayList(zhm.w.t(ongoingRebalanceTypes, 10));
                for (c.b bVar2 : ongoingRebalanceTypes) {
                    Intrinsics.checkNotNullParameter(bVar2, "<this>");
                    int i66 = ylc.a.f[bVar2.ordinal()];
                    if (i66 == 1) {
                        mVar = alc.m.PORTFOLIO_TEMPLATE_CHANGE;
                    } else if (i66 == 2) {
                        mVar = alc.m.PORTFOLIO_TEMPLATE_ALLOCATION_CHANGE;
                    } else if (i66 == 3) {
                        mVar = alc.m.WITHDRAWAL;
                    } else if (i66 == 4) {
                        mVar = alc.m.FUNDING;
                    } else {
                        if (i66 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mVar = alc.m.INITIAL_FUNDING;
                    }
                    arrayList2.add(mVar);
                }
                Boolean initialTopupPerformed = entity.getInitialTopupPerformed();
                boolean zBooleanValue = initialTopupPerformed != null ? initialTopupPerformed.booleanValue() : false;
                jo3.b plannedInitialDeposit = entity.getPlannedInitialDeposit();
                dj0.d dVarV = plannedInitialDeposit != null ? hx7.a.v(plannedInitialDeposit) : null;
                jo3.b plannedRecurringDeposit = entity.getPlannedRecurringDeposit();
                dj0.d dVarV2 = plannedRecurringDeposit != null ? hx7.a.v(plannedRecurringDeposit) : null;
                c.a goal = entity.getGoal();
                if (goal != null) {
                    Intrinsics.checkNotNullParameter(goal, "<this>");
                    dj0.d dVarV3 = hx7.a.v(goal.getTargetAmount());
                    YearMonth yearMonth = YearMonth.parse(goal.getTargetDate());
                    Intrinsics.checkNotNullExpressionValue(yearMonth, "parse(...)");
                    portfolioGoal = new PortfolioGoal(dVarV3, yearMonth);
                }
                return new alc.n(portfolioId, cVar3, name, iconName, portfolioTemplate, recommendedTemplate, canChangeTemplateSince, newTemplate, bVarA, arrayList2, zBooleanValue, dVarV, dVarV2, portfolioGoal);
            case 16:
                if (this.v != null) {
                    throw new ClassCastException();
                }
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                throw new NoWhenBranchMatchedException();
            case 17:
                ty0.a aVar20 = (ty0.a) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                plj.i iVarE3 = ((EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen) obj3).d();
                Object obj5 = aVar20.d;
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b bVar3 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b) iVarE3;
                bVar3.getClass();
                EsimDescriptorValue esimDescriptorValue = obj5 instanceof EsimDescriptorValue ? (EsimDescriptorValue) obj5 : null;
                if (esimDescriptorValue != null) {
                    if (esimDescriptorValue instanceof EsimDescriptorValue.Action) {
                        Enum r06 = ((EsimDescriptorValue.Action) esimDescriptorValue).f100252a;
                        if (!(r06 instanceof dej.s0)) {
                            r06 = null;
                        }
                        dej.s0 s0Var = (dej.s0) r06;
                        int i74 = s0Var == null ? -1 : plj.n.f237433a[s0Var.ordinal()];
                        if (i74 != -1) {
                            if (i74 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            EsimCheckoutPortingSteps esimCheckoutPortingSteps = bVar3.o.d;
                            if (esimCheckoutPortingSteps == null) {
                                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b.I2("PortingProgress is null");
                            } else {
                                com.revolut.kompot.navigable.vc.modal.a aVar22 = bVar3.f101356q;
                                TextClause textClause = new TextClause(esimCheckoutPortingSteps.f100193a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                                String str5 = esimCheckoutPortingSteps.f100194b;
                                oki.h.v2(aVar22, new EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep.TrackPortabilityStatus(textClause, str5 != null ? new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, esimCheckoutPortingSteps.f100195c), bottom_dialog);
                            }
                        }
                    } else if (!(esimDescriptorValue instanceof EsimDescriptorValue.Link)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f186387a;
            case 18:
                Data data8 = (Data) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pm9.f fVar4 = (pm9.f) obj3;
                fVar4.H2(fVar4.f237490q, new pig.u(data8, 20));
                return Unit.f186387a;
            case 19:
                n6 model = (n6) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pmb.g gVarE3 = ((SavingsProductSelectionScreen) obj3).R2();
                Intrinsics.h(model);
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.a aVar25 = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.a) gVarE3;
                cli.y yVar2 = aVar25.u;
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj6 = model.k;
                if (obj6 == pmb.f.NEXT_CTA) {
                    j2 j2Var = (j2) yVar2.f22677a;
                    j2 j2Var2 = (j2) yVar2.f22677a;
                    if (((pmb.d) j2Var.getValue()).f237531c > 0) {
                        pmb.c cVar4 = (pmb.c) ((pmb.d) j2Var2.getValue()).f237529a.getContent();
                        if (cVar4 != null) {
                            hha.d dVar3 = (hha.d) zhm.d0.e0(((pmb.d) j2Var2.getValue()).f237531c, zhm.d0.d1(cVar4.f237526a.keySet()));
                            if (dVar3 != null) {
                                List listC = zhm.u.c(dVar3.f152287a);
                                hha.u.Companion.getClass();
                                aVar25.C1(new BridgeDestination(new FeatureCommand(new PricingPlanFeatureConfig.DashboardByPlans(hha.u.B, listC, null, null, false, xfa.b.BASE_SAVINGS_PITCH, 172))));
                            }
                        }
                    } else {
                        SavingsProductData savingsProductData = ((pmb.d) j2Var2.getValue()).f237530b;
                        if (savingsProductData == null) {
                            throw new IllegalStateException("SelectedProduct should not be null");
                        }
                        aVar25.C2(new pmb.e(savingsProductData.f86683a.f86618b, savingsProductData));
                    }
                } else if (obj6 == pmb.f.ADDITIONAL_CTA) {
                    SavingsProductData savingsProductData2 = ((pmb.d) ((j2) yVar2.f22677a).getValue()).f237530b;
                    if (savingsProductData2 == null) {
                        throw new IllegalStateException("SelectedProduct should not be null");
                    }
                    oki.h.v2(aVar25.v, new SavingsProductSelectionContract$ModalStep.SavingsCalculator(savingsProductData2.f86683a), bottom_dialog);
                }
                return Unit.f186387a;
            case 20:
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.a aVar26 = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.a) obj3;
                cli.y yVar3 = aVar26.u;
                Data data9 = (Data) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                try {
                    Object content = data9.getContent();
                    data = new Data(content != null ? (pmb.c) ((Pair) content).f186386b : null, data9.getError(), data9.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data9.getLoading());
                }
                if (!Intrinsics.f(((pmb.d) ((j2) yVar3.f22677a).getValue()).f237529a.getContent(), data.getContent())) {
                    aVar26.H2(yVar3, new pj9.n(i6));
                }
                aVar26.H2(yVar3, new m9d.w0(data, data9, i22));
                return Unit.f186387a;
            case 21:
                Object obj7 = this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pnb.h hVar = (pnb.h) ((TaxFormsScreen) obj3).R.getValue();
                Object f52064j = ((qv0.p) obj7).getF55256g();
                String listId = ((koi.j) obj7).getF55254b();
                hVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (f52064j instanceof TaxForm) {
                    hVar.n2(new pdi.j(hVar, (TaxForm) f52064j, cryptoFcaLearnScreenContract$Parcel$Link, i5), new whi.b(i21));
                } else if (Intrinsics.f(listId, "ERROR_STATE_ID")) {
                    hVar.f237685p.a();
                }
                return Unit.f186387a;
            case 22:
                Data data10 = (Data) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pnb.h hVar2 = (pnb.h) obj3;
                hVar2.H2(hVar2.f237686q, new pig.u(data10, 28));
                return Unit.f186387a;
            case 23:
                f6 f6Var = (f6) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth.ui.impl.trades.b) ((HoldingTradeDetailsController) obj3).R2()).accept(new pnh.f(f6Var.f164196a));
                return Unit.f186387a;
            case 24:
                Pair pair = (Pair) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((pnj.h) obj3).x2(new m9d.w0((Data) pair.f186385a, (Data) pair.f186386b, 9));
                return Unit.f186387a;
            case 25:
                po9.t tVar = (po9.t) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.payments.air.widget.impl.ui.chat.b) obj3).f3(new po9.l(tVar, i32));
                return Unit.f186387a;
            case 26:
                String code = (String) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pol.f fVarE3 = ((EnterPhoneScreen) obj3).d();
                Intrinsics.h(code);
                com.revolut.sso.impl.ui.phone.enter_phone.a aVar34 = (com.revolut.sso.impl.ui.phone.enter_phone.a) fVarE3;
                aVar34.getClass();
                Intrinsics.checkNotNullParameter(code, "code");
                StringBuilder sb6 = new StringBuilder();
                int length = code.length();
                for (int i92 = 0; i92 < length; i92++) {
                    char cCharAt = code.charAt(i92);
                    if (Character.isDigit(cCharAt)) {
                        sb6.append(cCharAt);
                    }
                }
                Integer numM = kotlin.text.z.m(sb6.toString());
                if (numM != null) {
                    int iIntValue = numM.intValue();
                    wi0.b bVarD = aVar34.f106673r.d(iIntValue);
                    fj0.b.Companion.getClass();
                    Serializable serializableA = fj0.a.a(iIntValue);
                    m.Companion companion = yhm.m.INSTANCE;
                    if (serializableA instanceof yhm.n) {
                        serializableA = null;
                    }
                    fj0.b bVar4 = (fj0.b) serializableA;
                    if (bVar4 == null) {
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "Revolut SSO", "Can't update country code:\nCountry code is " + bVarD.f297794a + "\nCountry phone code is " + bVar4, null, h0Var);
                    } else {
                        aVar34.H2(aVar34.u, new om4.l0(aVar34, i6, bVarD, bVar4));
                    }
                } else {
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "Revolut SSO", "Can't update country code:\nPhone code is ".concat(code), null, h0Var2);
                }
                return Unit.f186387a;
            case 27:
                Data data11 = (Data) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.additional_cards.management.a aVar36 = (com.revolut.feature.credit.card.impl.ui.additional_cards.management.a) obj3;
                aVar36.H2(aVar36.f69037t, new pnh.d0(data11, i21));
                return Unit.f186387a;
            case 28:
                Data data12 = (Data) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pp6.k kVar5 = (pp6.k) obj3;
                kVar5.H2(kVar5.f238290s, new pnh.d0(data12, i22));
                return Unit.f186387a;
            default:
                n1 n1Var2 = (n1) this.v;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((n1Var2 instanceof l1) || (n1Var2 instanceof k1)) {
                    ((ppe.g) obj3).invoke();
                } else {
                    if (!(n1Var2 instanceof m1) && !(n1Var2 instanceof j1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hx7.e.n(new IllegalArgumentException(com.revolut.data.database.models.openbanking.d.s("Unexpected dialog result ", n1Var2)));
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(String str, com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = 6;
        this.v = str;
        this.f235662w = dVar;
    }
}
