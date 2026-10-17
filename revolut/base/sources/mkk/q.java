package mkk;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import au0.x3;
import aw0.l6;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.collateral_move_money.CollateralMoveMoneyScreen;
import com.revolut.feature.crypto.tfr.validation.api.model.MeshEvent;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.fee_breakdown_dialog.CryptoFeeBreakdownDialogController;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.fee_breakdown_dialog.CryptoFeeBreakdownDialogControllerContract$Step;
import com.revolut.feature.freelancer.impl.ui.dialog.single_choice.FreelancerSingleChoiceScreen;
import com.revolut.feature.freelancer.impl.ui.dialog.single_choice.FreelancerSingleChoiceScreenContract$MenuItem;
import com.revolut.feature.pay_with_photo.impl.ui.preview.PayWithPhotoPreviewController;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.status.SalarySwitchStatusController;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.subscriptions.api.navigation.SubscriptionsFlowDestination;
import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$Destination;
import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$Disclaimers;
import com.revolut.feature.trading_orders.api.ui.list.InvestOrdersListFeatureContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.api.trips.models.Trip;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features.PlanCancelFeaturesScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.features.PlanCancelFeaturesScreenContract$CardSubscriptionsParcel;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.technicals.TechnicalInsightsController;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.technicals.TechnicalInsightsControllerContract$ModalStep;
import com.revolut.sso.api.models.BankIdEvidence;
import com.revolut.trading.orders.ui.invest.list.screen.InvestOrdersListScreen;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import ml3.y;
import mlk.h0;
import mlk.x;
import mu8.e;
import nii.l1;
import nii.m1;
import nii.n1;
import ood.w0;
import t80.m;
import yhm.m;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f206497w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f206497w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q((com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b) this.f206497w, continuation, 0);
                qVar.v = obj2;
                return qVar;
            case 1:
                q qVar2 = new q((PayWithPhotoPreviewController) this.f206497w, continuation, 1);
                qVar2.v = obj2;
                return qVar2;
            case 2:
                q qVar3 = new q((PlanCancelFeaturesScreen) this.f206497w, continuation, 2);
                qVar3.v = obj2;
                return qVar3;
            case 3:
                return new q((com.revolut.sso.impl.ui.combined_authentication.flow.c) this.v, (BankIdEvidence) this.f206497w, continuation, 3);
            case 4:
                q qVar4 = new q((mm5.o) this.f206497w, continuation, 4);
                qVar4.v = obj2;
                return qVar4;
            case 5:
                q qVar5 = new q((com.revolut.feature.profile.impl.ui.close_account.c) this.f206497w, continuation, 5);
                qVar5.v = obj2;
                return qVar5;
            case 6:
                q qVar6 = new q((mo8.h) this.f206497w, continuation, 6);
                qVar6.v = obj2;
                return qVar6;
            case 7:
                q qVar7 = new q((Trip) this.f206497w, continuation, 7);
                qVar7.v = obj2;
                return qVar7;
            case 8:
                q qVar8 = new q((com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input.a) this.f206497w, continuation, 8);
                qVar8.v = obj2;
                return qVar8;
            case 9:
                q qVar9 = new q((CollateralMoveMoneyScreen) this.f206497w, continuation, 9);
                qVar9.v = obj2;
                return qVar9;
            case 10:
                q qVar10 = new q((CryptoFeeBreakdownDialogController) this.f206497w, continuation, 10);
                qVar10.v = obj2;
                return qVar10;
            case 11:
                q qVar11 = new q((mqc.k) this.f206497w, continuation, 11);
                qVar11.v = obj2;
                return qVar11;
            case 12:
                q qVar12 = new q(continuation, (mqd.o) this.f206497w);
                qVar12.v = obj2;
                return qVar12;
            case 13:
                return new q((byte[]) this.v, (x3) this.f206497w, continuation, 13);
            case 14:
                q qVar13 = new q((mr4.g) this.f206497w, continuation, 14);
                qVar13.v = obj2;
                return qVar13;
            case 15:
                q qVar14 = new q((SalarySwitchStatusController) this.f206497w, continuation, 15);
                qVar14.v = obj2;
                return qVar14;
            case 16:
                q qVar15 = new q((mtc.m) this.f206497w, continuation, 16);
                qVar15.v = obj2;
                return qVar15;
            case 17:
                q qVar16 = new q((com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a) this.f206497w, continuation, 17);
                qVar16.v = obj2;
                return qVar16;
            case 18:
                q qVar17 = new q((InvestOrdersListScreen) this.f206497w, continuation, 18);
                qVar17.v = obj2;
                return qVar17;
            case 19:
                q qVar18 = new q((mu4.g) this.f206497w, continuation, 19);
                qVar18.v = obj2;
                return qVar18;
            case 20:
                q qVar19 = new q((mu8.l) this.f206497w, continuation, 20);
                qVar19.v = obj2;
                return qVar19;
            case 21:
                q qVar20 = new q((TechnicalInsightsController) this.f206497w, continuation, 21);
                qVar20.v = obj2;
                return qVar20;
            case 22:
                q qVar21 = new q((mul.j) this.f206497w, continuation, 22);
                qVar21.v = obj2;
                return qVar21;
            case 23:
                q qVar22 = new q((mv.c) this.f206497w, continuation, 23);
                qVar22.v = obj2;
                return qVar22;
            case 24:
                q qVar23 = new q((mv2.o) this.f206497w, continuation, 24);
                qVar23.v = obj2;
                return qVar23;
            case 25:
                q qVar24 = new q((mv7.j) this.f206497w, continuation, 25);
                qVar24.v = obj2;
                return qVar24;
            case 26:
                return new q((dii.g) this.v, (com.revolut.feature.security_hub.impl.ui.street_mode.edit_trusted_location.a) this.f206497w, continuation, 26);
            case 27:
                q qVar25 = new q((FreelancerSingleChoiceScreen) this.f206497w, continuation, 27);
                qVar25.v = obj2;
                return qVar25;
            case 28:
                q qVar26 = new q((mw7.c) this.f206497w, continuation, 28);
                qVar26.v = obj2;
                return qVar26;
            default:
                return new q((eq0.a) this.v, (l6) this.f206497w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((q) create((e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((q) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((q) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((q) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((q) create((MeshEvent) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((q) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((q) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((q) create((w0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((q) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((q) create((mq5.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((q) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((q) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((q) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((q) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((q) create((e60.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((q) create((muk.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((q) create((gv.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((q) create((t61.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((q) create((lw0.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((q) create((mw7.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r9v103, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v129, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v88, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws IOException {
        FlowStep breakdownDetail;
        Object objA;
        FlowStep flowStep;
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        int i2 = 6;
        boolean z = false;
        z = false;
        int i3 = 1;
        Continuation continuation = null;
        Object obj3 = this.f206497w;
        switch (i) {
            case 0:
                e eVar = (e) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b bVar = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b) obj3;
                bVar.H2(bVar.f103416w, new m98.k(eVar, 29));
                return Unit.f186387a;
            case 1:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ml9.f fVar = (ml9.f) ((PayWithPhotoPreviewController) obj3).O.getValue();
                Intrinsics.h(clickData);
                fVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                fVar.C2(new al9.f(clickData));
                return Unit.f186387a;
            case 2:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarE3 = ((PlanCancelFeaturesScreen) obj3).d();
                Intrinsics.h(clickData2);
                h0 h0Var = (h0) xVarE3;
                h0Var.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                Object obj4 = clickData2.d;
                if (obj4 instanceof PlanCancelFeaturesScreenContract$CardSubscriptionsParcel) {
                    h0Var.C1(new SubscriptionsFlowDestination(new SubscriptionsFlowDestination.StartType.CardSubscriptionList(((PlanCancelFeaturesScreenContract$CardSubscriptionsParcel) obj4).f103508a, b9e.d.None)));
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.sso.impl.ui.combined_authentication.flow.c cVar = (com.revolut.sso.impl.ui.combined_authentication.flow.c) this.v;
                tll.t tVar = cVar.F;
                mll.g startStep = new mll.g(cVar, (BankIdEvidence) obj3, z ? 1 : 0);
                tVar.getClass();
                Intrinsics.checkNotNullParameter(startStep, "startStep");
                Job job2 = tVar.f272121b;
                if (job2 == null || !job2.d()) {
                    tVar.f272121b = (Job) startStep.invoke();
                }
                return Unit.f186387a;
            case 4:
                MeshEvent meshEvent = (MeshEvent) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mm5.o oVar = (mm5.o) obj3;
                oVar.H2(oVar.u, new y(meshEvent, 11));
                return Unit.f186387a;
            case 5:
                com.revolut.feature.profile.impl.ui.close_account.c cVar2 = (com.revolut.feature.profile.impl.ui.close_account.c) obj3;
                n1 n1Var = (n1) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    oki.h.D2(cVar2.u);
                } else if (n1Var instanceof m1) {
                    String str = cVar2.o.f81353b;
                    if (str == null) {
                        cVar2.I2();
                    } else {
                        cVar2.l2(new com.revolut.feature.profile.impl.ui.close_account.b(cVar2, str, null), new mma.c(cVar2, i3));
                    }
                }
                return Unit.f186387a;
            case 6:
                Pair pair = (Pair) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mo8.h hVar = (mo8.h) obj3;
                hVar.H2(hVar.f207567s, new m9d.w0((Data) pair.f186385a, (Data) pair.f186386b, i3));
                return Unit.f186387a;
            case 7:
                w0 w0Var = (w0) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List listA = w0Var.a();
                Trip trip = (Trip) obj3;
                if (!(listA instanceof Collection) || !listA.isEmpty()) {
                    Iterator it8 = listA.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            if (Intrinsics.f(((Trip) it8.next()).f99263a, trip.f99263a)) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 8:
                Data data = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input.a aVar10 = (com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input.a) obj3;
                aVar10.H2(aVar10.f75622q, new me7.h(data, 21));
                return Unit.f186387a;
            case 9:
                String id10 = (String) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mq4.i iVarE3 = ((CollateralMoveMoneyScreen) obj3).d();
                Intrinsics.h(id10);
                mq4.x xVar = (mq4.x) iVarE3;
                xVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (Intrinsics.f(id10, "skip_menu_item_id")) {
                    xVar.C2(zl4.c.f323180a);
                }
                return Unit.f186387a;
            case 10:
                mq5.g explanation = (mq5.g) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.crypto.withdraw.impl.ui_v3.fee_breakdown_dialog.a aVar13 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.fee_breakdown_dialog.a) ((mq5.h) ((CryptoFeeBreakdownDialogController) obj3).U.getValue());
                aVar13.getClass();
                Intrinsics.checkNotNullParameter(explanation, "explanation");
                if (explanation instanceof mq5.d) {
                    breakdownDetail = new CryptoFeeBreakdownDialogControllerContract$Step.BreakdownDetail(((mq5.d) explanation).f207888a);
                } else if (Intrinsics.f(explanation, mq5.e.f207889a)) {
                    breakdownDetail = CryptoFeeBreakdownDialogControllerContract$Step.NetworkFee.f71301a;
                } else {
                    if (!Intrinsics.f(explanation, mq5.f.f207890a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    breakdownDetail = CryptoFeeBreakdownDialogControllerContract$Step.ServiceFee.f71302a;
                }
                oki.h.v2(aVar13.f71307t, breakdownDetail, bottom_dialog);
                return Unit.f186387a;
            case 11:
                String str2 = (String) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return j6.a.k(bqc.j.class, ((mqc.k) obj3).d, str2);
            case 12:
                Pair pair2 = (Pair) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVar = (yhm.r) pair2.f186385a;
                Pair pair3 = (Pair) pair2.f186386b;
                Object obj5 = rVar.f314201a;
                Object obj6 = rVar.f314202b;
                Object obj7 = rVar.f314203c;
                Object obj8 = pair3.f186385a;
                List list = (List) pair3.f186386b;
                mqd.m mVar = (mqd.m) obj8;
                List list2 = (List) obj7;
                od0.i iVar = (od0.i) obj6;
                od0.i iVar2 = (od0.i) obj5;
                aim.e eVarB = zhm.u.b();
                if (iVar2.d()) {
                    eVarB.add(new mqd.g((SavingsProductData) iVar2.c()));
                }
                if (list2.contains(SubaccountType.Personal.f88963a)) {
                    eVarB.add(mqd.f.f207980a);
                }
                if (((jte.d) ((mqd.o) obj3).f207990g).c(AnalyticsFeatureApi$Toggles.AnalyticsIncomeSorterJointSavingsAndPockets.f87385c) && (mVar instanceof mqd.j) && list2.contains(SubaccountType.Joint.f88961a)) {
                    eVarB.add(new mqd.d(((mqd.j) mVar).f207982a));
                }
                if ((mVar instanceof mqd.j) && iVar.d()) {
                    eVarB.add(new mqd.c((SavingsProductData) iVar.c(), ((mqd.j) mVar).f207982a));
                }
                eVarB.addAll(list);
                if (mVar instanceof mqd.k) {
                    eVarB.add(mqd.b.f207974a);
                }
                return zhm.u.a(eVarB);
            case 13:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                byte[] bArr = (byte[]) this.v;
                if (bArr == null) {
                    return null;
                }
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    objA = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    break;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                boolean z3 = objA instanceof yhm.n;
                Object obj9 = objA;
                if (z3) {
                    obj9 = null;
                }
                Bitmap bitmap = (Bitmap) obj9;
                if (bitmap == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(bitmap, "<this>");
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                Bitmap bitmapCreateBitmap = bitmap.getWidth() >= bitmap.getHeight() ? Bitmap.createBitmap(bitmap, (bitmap.getWidth() / 2) - (bitmap.getHeight() / 2), 0, bitmap.getHeight(), bitmap.getHeight()) : Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() / 2) - (bitmap.getWidth() / 2), bitmap.getWidth(), bitmap.getWidth());
                Intrinsics.h(bitmapCreateBitmap);
                if (!bitmap.equals(bitmapCreateBitmap)) {
                    bitmap.recycle();
                }
                int width = bitmapCreateBitmap.getWidth();
                int i5 = ((x3) obj3).f9432b;
                if (width > i5) {
                    bitmapCreateBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, i5, i5, true);
                }
                String strA = do3.q.A(bitmapCreateBitmap);
                bitmapCreateBitmap.recycle();
                return strA;
            case 14:
                Data data2 = (Data) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mr4.g gVar = (mr4.g) obj3;
                gVar.H2(gVar.f208057s, new me7.h(data2, 24));
                mr4.a aVar18 = (mr4.a) data2.getContent();
                if (aVar18 != null && aVar18.f208048b.isEmpty()) {
                    IllegalStateException illegalStateException = new IllegalStateException("Display amount options cannot be empty");
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                    gVar.B2();
                }
                return Unit.f186387a;
            case 15:
                ty0.a aVar19 = (ty0.a) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mrc.b bVarD3 = ((SalarySwitchStatusController) obj3).d();
                String linkId = aVar19.f275445a;
                mrc.l lVar = (mrc.l) bVarD3;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(linkId, "linkId");
                if (Intrinsics.f(linkId, "TRY_AGAIN_LINK_CLICK_ID")) {
                    lVar.C2(mrc.c.f208101a);
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Unknown link id ", linkId));
                    zhm.h0 h0Var3 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var3);
                }
                return Unit.f186387a;
            case 16:
                Data data3 = (Data) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mtc.m mVar2 = (mtc.m) obj3;
                mVar2.H2(mVar2.f208817r, new me7.h(data3, 27));
                if (!data3.getLoading() && (data3.getContent() instanceof itc.b)) {
                    mVar2.n2(new mtc.l(mVar2, continuation, z ? 1 : 0), new whi.b(i2));
                }
                return Unit.f186387a;
            case 17:
                Data data4 = (Data) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a aVar23 = (com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.document_selection.a) obj3;
                aVar23.H2(aVar23.f96434t, new me7.h(data4, aVar23));
                return Unit.f186387a;
            case 18:
                Object obj10 = this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mtl.d dVar = (mtl.d) ((InvestOrdersListScreen) obj3).O.getValue();
                String listId = ((koi.j) obj10).getF52222a();
                Object k = ((qv0.p) obj10).getF55191g();
                mtl.p pVar = (mtl.p) dVar;
                pVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (Intrinsics.f(listId, "LIST_ID_GO_TO_RECURRING_BUY")) {
                    pVar.C1(new InvestOrdersListFeatureContract$Destination(new InvestOrdersListFeatureContract$InputData.RecurringOrders(pVar.u.e(ptl.b.INCLUDE_ONLY_RECURRING_BUYS), new InvestOrdersListFeatureContract$InputData.RecurringOrders.DisplayOptions(k instanceof mtl.c ? new InvestOrdersListFeatureContract$InputData.RecurringOrders.PlusActionNavBarButton.StartSecurityOrder(((mtl.c) k).f208915a) : k instanceof mtl.b ? new InvestOrdersListFeatureContract$InputData.RecurringOrders.PlusActionNavBarButton.StartCommodityOrder(((mtl.b) k).f208914a) : InvestOrdersListFeatureContract$InputData.RecurringOrders.PlusActionNavBarButton.OpenRecurringBuys.f91761a, InvestOrdersListFeatureContract$Disclaimers.None.f91750a))));
                } else if (Intrinsics.f(listId, "ERROR_STATE_ID")) {
                    pVar.n2(new mtl.l(pVar, continuation, z ? 1 : 0), new whi.b(i2));
                }
                return Unit.f186387a;
            case 19:
                Data data5 = (Data) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mu4.g gVar2 = (mu4.g) obj3;
                gVar2.H2(gVar2.f208959r, new mtl.k(data5, 5));
                return Unit.f186387a;
            case 20:
                e60.l lVar2 = (e60.l) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mu8.l lVar3 = (mu8.l) obj3;
                Intrinsics.h(lVar2);
                if (lVar2 instanceof e60.m) {
                    lVar3.n2(new mpd.p(lVar3, lVar2, continuation, 10), new whi.b(i2));
                } else if (lVar2 instanceof e60.j) {
                    t80.m mVar3 = ((e60.j) lVar2).f122857a;
                    if (mVar3 instanceof t80.n) {
                        lVar3.C2(e.a.f209004a);
                    } else if (!mVar3.equals(m.a.f268767a)) {
                        lVar3.C2(e.b.f209005a);
                    }
                }
                return Unit.f186387a;
            case 21:
                muk.j parcel = (muk.j) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.technicals.a aVar28 = (com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.technicals.a) ((muk.g) ((TechnicalInsightsController) obj3).R.getValue());
                aVar28.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (Intrinsics.f(parcel, muk.h.f209044a)) {
                    flowStep = TechnicalInsightsControllerContract$ModalStep.MovingAveragesDetails.f103868a;
                } else {
                    if (!Intrinsics.f(parcel, muk.i.f209045a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    flowStep = TechnicalInsightsControllerContract$ModalStep.OscillatorsDetails.f103869a;
                }
                oki.h.v2(aVar28.u, flowStep, bottom_dialog);
                return Unit.f186387a;
            case 22:
                Data data6 = (Data) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mul.j jVar = (mul.j) obj3;
                jVar.H2(jVar.f209061s, new mtl.k(data6, 8));
                return Unit.f186387a;
            case 23:
                dv.m mVar4 = ((mv.c) obj3).f209067b;
                gv.d dVar2 = (gv.d) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((dVar2 instanceof gv.a) || (dVar2 instanceof gv.b)) {
                    ((lv.c) mVar4).f200270a.setInvertedColors(false);
                } else {
                    if (!(dVar2 instanceof gv.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((lv.c) mVar4).f200270a.setInvertedColors(true);
                }
                return Unit.f186387a;
            case 24:
                t61.g gVar3 = (t61.g) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mv2.o oVar2 = (mv2.o) obj3;
                oVar2.H2(oVar2.f209108r, new kv2.j(gVar3, 1));
                return Unit.f186387a;
            case 25:
                Data data7 = (Data) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mv7.j jVar2 = (mv7.j) obj3;
                jVar2.H2(jVar2.f209166s, new mtl.k(data7, 9));
                return Unit.f186387a;
            case 26:
                com.revolut.feature.security_hub.impl.ui.street_mode.edit_trusted_location.a aVar33 = (com.revolut.feature.security_hub.impl.ui.street_mode.edit_trusted_location.a) obj3;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (((dii.g) this.v) instanceof dii.e) {
                    aVar33.A1(new mci.e(aVar33, continuation, 22), new yi5.b(25));
                } else {
                    aVar33.B2();
                }
                return Unit.f186387a;
            case 27:
                lw0.l menuItem = (lw0.l) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.dialog.single_choice.a aVar36 = (com.revolut.feature.freelancer.impl.ui.dialog.single_choice.a) ((mw6.f) ((FreelancerSingleChoiceScreen) obj3).T.getValue());
                aVar36.getClass();
                Intrinsics.checkNotNullParameter(menuItem, "menuItem");
                if (Intrinsics.f(menuItem.a(), "ITEM_ID_MENU_ADD_NEW")) {
                    FreelancerSingleChoiceScreenContract$MenuItem.AddNew item = FreelancerSingleChoiceScreenContract$MenuItem.AddNew.f73776a;
                    Intrinsics.checkNotNullParameter(item, "item");
                    aVar36.C2(new mw6.d());
                }
                return Unit.f186387a;
            case 28:
                mw7.b bVar2 = (mw7.b) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return j6.a.k(com.revolut.feature.insurance_home.impl.data.model.f.class, ((mw7.c) obj3).f209405c, bVar2.a());
            default:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eq0.a aVar39 = (eq0.a) this.v;
                if (aVar39 != null) {
                    aVar39.f((l6) obj3);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f206497w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Continuation continuation, mqd.o oVar) {
        super(2, continuation);
        this.u = 12;
        this.f206497w = oVar;
    }
}
