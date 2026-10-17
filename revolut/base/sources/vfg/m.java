package vfg;

import androidx.recyclerview.widget.LinearLayoutManager;
import aw0.n6;
import cli.y;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.data.model.Data;
import com.revolut.feature.alipay.impl.ui.qr.AlipayPlusQrFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.create.InstalmentFlowContract$IneligibilityDialogType;
import com.revolut.feature.crypto.convert.disclaimer.api.footer.CryptoConvertFooterDisclaimerDelegate$ClickTextParcel;
import com.revolut.feature.crypto.tfr.validation.impl.dob.DateOfBirthScreen;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.CryptoSendConfirmationController;
import com.revolut.feature.insurance.api.models.cfac.CFACClaim;
import com.revolut.feature.insurance.impl.ui.cfac.CFACInsuranceFlowContract$Step;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_details.CFACClaimDetailsScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claims_list.CFACClaimsListScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.delivery.DeviceDeliveryScreen;
import com.revolut.feature.retail.trading.advanced.charts.impl.screen.closeinvestments.cfd.CfdClosePositionsSelectorController;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.employer_details.EmployerDetailsScreen;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.employer_details.EmployerDetailsScreenContract$ModalStep;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.TransactionsScreen;
import com.revolut.feature.us_send_checks.impl.ui.recipient.SendChecksRecipientScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.otp.input.flow.push.bottom_dialog.OtpPushBottomSheet;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.business_details.EsimMobilePlanDynamicFormBusinessDetailsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.specific_portability_date_picker.EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.FamilyPlanFlowContract$State;
import hfg.l0;
import ip0.vd;
import java.time.LocalDate;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import ll4.u;
import mjf.b0;
import nii.l1;
import nii.n1;
import ql4.f0;
import ql4.g0;
import ql4.j0;
import ql4.k0;
import ql4.m0;
import ql4.n0;
import tof.i1;
import vch.s0;
import vge.o1;
import vge.t2;
import vge.t3;
import vge.y2;
import vkm.j2;
import vo8.i0;
import vq5.w;
import vr4.v;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f288627w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f288627w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m mVar = new m((o) this.f288627w, continuation, 0);
                mVar.v = obj2;
                return mVar;
            case 1:
                return new m((vgc.p) this.v, (w4l.k) this.f288627w, continuation, 1);
            case 2:
                m mVar2 = new m((o1) this.f288627w, continuation, 2);
                mVar2.v = obj2;
                return mVar2;
            case 3:
                m mVar3 = new m((t3) this.f288627w, continuation, 3);
                mVar3.v = obj2;
                return mVar3;
            case 4:
                return new m((LinearLayoutManager) this.v, (TransactionsScreen) this.f288627w, continuation, 4);
            case 5:
                m mVar4 = new m((com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d) this.f288627w, continuation, 5);
                mVar4.v = obj2;
                return mVar4;
            case 6:
                m mVar5 = new m((AlipayPlusQrFlow) this.f288627w, continuation, 6);
                mVar5.v = obj2;
                return mVar5;
            case 7:
                m mVar6 = new m((CFACClaimsListScreen) this.f288627w, continuation, 7);
                mVar6.v = obj2;
                return mVar6;
            case 8:
                m mVar7 = new m((vk7.h) this.f288627w, continuation, 8);
                mVar7.v = obj2;
                return mVar7;
            case 9:
                m mVar8 = new m((EsimMobilePlanDynamicFormBusinessDetailsScreen) this.f288627w, continuation, 9);
                mVar8.v = obj2;
                return mVar8;
            case 10:
                return new m((com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.a) this.v, (String) this.f288627w, continuation, 10);
            case 11:
                m mVar9 = new m((SendChecksRecipientScreen) this.f288627w, continuation, 11);
                mVar9.v = obj2;
                return mVar9;
            case 12:
                m mVar10 = new m((EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen) this.f288627w, continuation, 12);
                mVar10.v = obj2;
                return mVar10;
            case 13:
                m mVar11 = new m((vlk.s) this.f288627w, continuation, 13);
                mVar11.v = obj2;
                return mVar11;
            case 14:
                m mVar12 = new m((DateOfBirthScreen) this.f288627w, continuation, 14);
                mVar12.v = obj2;
                return mVar12;
            case 15:
                m mVar13 = new m((vmh.h) this.f288627w, continuation, 15);
                mVar13.v = obj2;
                return mVar13;
            case 16:
                m mVar14 = new m((vmj.j) this.f288627w, continuation, 16);
                mVar14.v = obj2;
                return mVar14;
            case 17:
                m mVar15 = new m((com.revolut.sso.impl.ui.email.enter_email.a) this.f288627w, continuation, 17);
                mVar15.v = obj2;
                return mVar15;
            case 18:
                m mVar16 = new m((vne.i) this.f288627w, continuation, 18);
                mVar16.v = obj2;
                return mVar16;
            case 19:
                m mVar17 = new m((OtpPushBottomSheet) this.f288627w, continuation, 19);
                mVar17.v = obj2;
                return mVar17;
            case 20:
                m mVar18 = new m((vni.f) this.f288627w, continuation, 20);
                mVar18.v = obj2;
                return mVar18;
            case 21:
                m mVar19 = new m((vob.i) this.f288627w, continuation, 21);
                mVar19.v = obj2;
                return mVar19;
            case 22:
                return new m((vpb.b) this.v, (rpb.n) this.f288627w, continuation, 22);
            case 23:
                m mVar20 = new m((CryptoSendConfirmationController) this.f288627w, continuation, 23);
                mVar20.v = obj2;
                return mVar20;
            case 24:
                m mVar21 = new m((DeviceDeliveryScreen) this.f288627w, continuation, 24);
                mVar21.v = obj2;
                return mVar21;
            case 25:
                m mVar22 = new m((vq7.j) this.f288627w, continuation, 25);
                mVar22.v = obj2;
                return mVar22;
            case 26:
                m mVar23 = new m((EmployerDetailsScreen) this.f288627w, continuation, 26);
                mVar23.v = obj2;
                return mVar23;
            case 27:
                m mVar24 = new m((com.revolut.feature.credit.card.impl.ui.instalment.create.b) this.f288627w, continuation, 27);
                mVar24.v = obj2;
                return mVar24;
            case 28:
                m mVar25 = new m((CfdClosePositionsSelectorController) this.f288627w, continuation, 28);
                mVar25.v = obj2;
                return mVar25;
            default:
                m mVar26 = new m((vrb.l) this.f288627w, continuation, 29);
                mVar26.v = obj2;
                return mVar26;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((m) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((m) create((Integer) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((m) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((m) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((m) create((CFACClaim) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((m) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((m) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((m) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((m) create((vd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((m) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((m) create((vmh.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((m) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((m) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((m) create((xni.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((m) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((m) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((m) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((m) create((vf0.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((m) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v120, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v146, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v51, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v75, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TermsScope termsScope;
        int i = this.u;
        final int i2 = 1;
        final int i3 = 0;
        int i5 = 26;
        int i6 = 6;
        int i21 = 2;
        int i22 = 19;
        utilizationLimit = null;
        utilizationLimit = null;
        utilizationLimit = null;
        utilizationLimit = null;
        Object utilizationLimit = null;
        productAccountDescriptor$Value = null;
        ProductAccountDescriptor$Value productAccountDescriptor$Value = null;
        Object obj3 = this.f288627w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!data.getLoading()) {
                    ihm.f fVar = ((o) obj3).d;
                    od0.h hVar = od0.i.Companion;
                    l0 l0Var = (l0) data.getContent();
                     = l0Var != null ? l0Var.f151865c : 0;
                    hVar.getClass();
                    fVar.onNext(od0.h.a());
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vgc.p pVar = (vgc.p) this.v;
                vgc.n nVar = vgc.p.Companion;
                pVar.getClass();
                if (Intrinsics.f((w4l.k) obj3, w4l.i.f294643c)) {
                    ((b0) pVar.f288838c).t(i1.f272794a);
                }
                return Unit.f186387a;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object content = data2.getContent();
                if (content != null) {
                    ((t2) ((o1) obj3).f288963a).q(content, "ACCOUNTS_CONTENT_CACHE_KEY");
                }
                return Unit.f186387a;
            case 3:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Pair pair = (Pair) data3.component1();
                data3.getError();
                data3.getLoading();
                ProductAccountDescriptor$Value productAccountDescriptor$Value2 = pair != null ? (ProductAccountDescriptor$Value) pair.f186385a : null;
                y2 y2Var = ((t3) obj3).d;
                boolean z = productAccountDescriptor$Value2 instanceof ProductAccountDescriptor$Value.Main;
                y2Var.f289065c.setValue(productAccountDescriptor$Value2);
                j2 j2Var = y2Var.d;
                if (productAccountDescriptor$Value2 != null && z) {
                    productAccountDescriptor$Value = productAccountDescriptor$Value2;
                }
                j2Var.setValue(productAccountDescriptor$Value);
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.v;
                if (linearLayoutManager != null) {
                    KProperty[] kPropertyArr = TransactionsScreen.Z;
                    ((TransactionsScreen) obj3).f3(linearLayoutManager);
                }
                return Unit.f186387a;
            case 5:
                final com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d dVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.d) obj3;
                n1 n1Var = (n1) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    if (((FamilyPlanFlowContract$State) ((j2) dVar.f103018y.f22677a).getValue()).f102981a) {
                        dVar.f103016w.Z2(new Function0() { // from class: vgk.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i3) {
                                    case 0:
                                        oki.h.D2(dVar.z);
                                        break;
                                    default:
                                        oki.h.D2(dVar.z);
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        });
                    } else {
                        dVar.v.Z2(new Function0() { // from class: vgk.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i2) {
                                    case 0:
                                        oki.h.D2(dVar.z);
                                        break;
                                    default:
                                        oki.h.D2(dVar.z);
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        });
                    }
                }
                return Unit.f186387a;
            case 6:
                String str = (String) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vk1.g gVarE3 = ((AlipayPlusQrFlow) obj3).e3();
                Intrinsics.h(str);
                ((com.revolut.feature.alipay.impl.ui.qr.a) gVarE3).I2(new vk1.e(str));
                return Unit.f186387a;
            case 7:
                CFACClaim cFACClaim = (CFACClaim) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vk7.f fVar2 = (vk7.f) ((CFACClaimsListScreen) obj3).Z.getValue();
                String selectedClaimId = cFACClaim.f74932a.f74959a;
                vk7.h hVar2 = (vk7.h) fVar2;
                hVar2.getClass();
                Intrinsics.checkNotNullParameter(selectedClaimId, "selectedClaimId");
                hVar2.v2(new vk7.e(new CFACInsuranceFlowContract$Step.ClaimDetails(new CFACClaimDetailsScreenContract$InputData(selectedClaimId))));
                return Unit.f186387a;
            case 8:
                Data data4 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((vk7.h) obj3).x2(new s0(data4, i22));
                return Unit.f186387a;
            case 9:
                ty0.a aVar10 = (ty0.a) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vkj.h hVarE3 = ((EsimMobilePlanDynamicFormBusinessDetailsScreen) obj3).d();
                Object obj4 = aVar10.d;
                vkj.n nVar2 = (vkj.n) hVarE3;
                nVar2.getClass();
                EsimDescriptorValue.Link link = obj4 instanceof EsimDescriptorValue.Link ? (EsimDescriptorValue.Link) obj4 : null;
                if (link != null) {
                    nVar2.l2(new vkj.k(nVar2, link, null), new yi5.b(i5));
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.a aVar13 = (com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.a) this.v;
                String str2 = (String) obj3;
                BridgeDestination bridgeDestinationA = aVar13.o.a(str2);
                if (bridgeDestinationA == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Failed to provide destination for url: ".concat(str2));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else {
                    aVar13.C1(bridgeDestinationA);
                }
                return Unit.f186387a;
            case 11:
                g6 g6Var = (g6) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vlg.k kVarE3 = ((SendChecksRecipientScreen) obj3).R2();
                String tabTypeId = g6Var.f54199a;
                vlg.s sVar = (vlg.s) kVarE3;
                sVar.getClass();
                Intrinsics.checkNotNullParameter(tabTypeId, "tabTypeId");
                sVar.H2(sVar.f290446q, new vb2.r(tabTypeId, 12));
                return Unit.f186387a;
            case 12:
                vd vdVar = (vd) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vlj.e eVar = (vlj.e) ((EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreen) obj3).Q.getValue();
                LocalDate date = vdVar.f166807b;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(date, "date");
                eVar.C2(new vlj.c(date));
                return Unit.f186387a;
            case 13:
                Data data5 = (Data) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vlk.s sVar2 = (vlk.s) obj3;
                sVar2.H2(sVar2.f290497r, new vgk.f(data5, sVar2, 13));
                return Unit.f186387a;
            case 14:
                od0.i iVar = (od0.i) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vm5.j jVar = (vm5.j) ((DateOfBirthScreen) obj3).O.getValue();
                LocalDate localDate = (LocalDate) iVar.f224257a;
                y yVar = jVar.o;
                if (localDate == null || localDate.getYear() < 1000) {
                    jVar.H2(yVar, new vjk.b(22));
                } else {
                    jVar.H2(yVar, new t5g.h(i6, localDate));
                }
                return Unit.f186387a;
            case 15:
                vmh.e eVar2 = (vmh.e) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((vmh.h) obj3).d.Z2(eVar2.f290584a);
                return Unit.f186387a;
            case 16:
                Data data6 = (Data) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vmj.j jVar2 = (vmj.j) obj3;
                jVar2.H2(jVar2.f290613s, new s0(data6, 24));
                return Unit.f186387a;
            case 17:
                n1 n1Var2 = (n1) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var2 instanceof l1) {
                    com.revolut.sso.impl.ui.email.enter_email.a aVar21 = (com.revolut.sso.impl.ui.email.enter_email.a) obj3;
                    String email = ((vml.f) ((j2) aVar21.f106532q.f22677a).getValue()).f290620a;
                    Intrinsics.checkNotNullParameter(email, "email");
                    aVar21.C2(new vml.g(email));
                }
                return Unit.f186387a;
            case 18:
                Data data7 = (Data) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vne.i iVar2 = (vne.i) obj3;
                iVar2.H2(iVar2.f290805s, new vgk.f(data7, iVar2, 17));
                return Unit.f186387a;
            case 19:
                String code = (String) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vni.f fVar3 = (vni.f) ((OtpPushBottomSheet) obj3).T.getValue();
                Intrinsics.h(code);
                fVar3.getClass();
                Intrinsics.checkNotNullParameter(code, "code");
                y yVar2 = fVar3.f290818q;
                fVar3.H2(yVar2, new a31.i(code, gj7.b.c((xni.a) ((j2) yVar2.f22677a).getValue(), fVar3.o, code), i22));
                return Unit.f186387a;
            case 20:
                vni.f fVar4 = (vni.f) obj3;
                y yVar3 = fVar4.f290818q;
                xni.e eVar3 = (xni.e) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (eVar3 instanceof xni.b) {
                    fVar4.H2(yVar3, new a31.i("", ((vni.b) ((j2) yVar3.f22677a).getValue()).f290813b, i22));
                } else if (eVar3 instanceof xni.c) {
                    fVar4.C2(vni.d.f290816a);
                } else {
                    if (!(eVar3 instanceof xni.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fVar4.H2(yVar3, new a31.i(fVar4.o.f98526a, ((vni.b) ((j2) yVar3.f22677a).getValue()).f290813b, i22));
                }
                return Unit.f186387a;
            case 21:
                Data data8 = (Data) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vob.i iVar3 = (vob.i) obj3;
                iVar3.H2(iVar3.f290942s, new i0(data8, i21));
                return Unit.f186387a;
            case 22:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vpb.b bVar = (vpb.b) this.v;
                rpb.n account = (rpb.n) obj3;
                ((rpb.a) bVar.f291146a).getClass();
                Intrinsics.checkNotNullParameter(account, "account");
                yld.d dVar2 = yld.d.EARNINGS;
                rpb.o.Companion.getClass();
                bVar.f291147b.b(new fc7.d(new AnalyticsFeatureConfig.SavingsAnalyticsDetails(dVar2, rpb.m.a(account)).f98274b));
                return Unit.f186387a;
            case 23:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vq5.f fVarE3 = ((CryptoSendConfirmationController) obj3).d();
                Intrinsics.h(clickData);
                com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a aVar28 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a) fVarE3;
                aVar28.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Continuation continuation = null;
                if (clickData.d instanceof CryptoConvertFooterDisclaimerDelegate$ClickTextParcel) {
                    aVar28.n2(new vnl.o(aVar28, clickData, continuation, i21), new whi.b(i6));
                } else {
                    String str3 = clickData.f275445a;
                    if (Intrinsics.f(str3, "PERSONAL_TERMS_CLICK_ID")) {
                        TermsScope.INSTANCE.getClass();
                        termsScope = TermsScope.S;
                    } else if (Intrinsics.f(str3, "CRYPTOCURRENCY_TERMS_CLICK_ID")) {
                        TermsScope.INSTANCE.getClass();
                        termsScope = TermsScope.o;
                    }
                    TermsScope termsScope2 = termsScope;
                    do3.n nVar3 = (do3.n) ((vq5.g) ((j2) aVar28.D.f22677a).getValue()).i.getContent();
                    if (nVar3 != null) {
                        aVar28.n2(new w(aVar28, termsScope2, do3.q.y(nVar3), continuation, 0), new whi.b(i6));
                    }
                }
                return Unit.f186387a;
            case 24:
                ty0.a aVar29 = (ty0.a) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((vq7.j) ((vq7.h) ((DeviceDeliveryScreen) obj3).f75676a0.getValue())).y2(aVar29.d, aVar29.f275445a);
                return Unit.f186387a;
            case 25:
                Data data9 = (Data) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((vq7.j) obj3).x2(new i0(data9, 8));
                return Unit.f186387a;
            case 26:
                ty0.a data10 = (ty0.a) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vqc.j jVarE3 = ((EmployerDetailsScreen) obj3).R2();
                Intrinsics.h(data10);
                com.revolut.feature.salary_switch.impl.ui.brazil.screen.employer_details.a aVar33 = (com.revolut.feature.salary_switch.impl.ui.brazil.screen.employer_details.a) jVarE3;
                aVar33.getClass();
                Intrinsics.checkNotNullParameter(data10, "data");
                if (Intrinsics.f(data10.f275445a, "CNPJ_HELP_CLAUSE_ID")) {
                    oki.h.v2(aVar33.f85290q, EmployerDetailsScreenContract$ModalStep.Help.f85288a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
            case 27:
                vf0.h hVar3 = (vf0.h) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar = (u) hVar3.f288433a;
                od0.i iVar4 = (od0.i) hVar3.f288434b;
                wi0.b bVar2 = (wi0.b) hVar3.f288435c;
                v vVar = (v) hVar3.d;
                od0.h hVar4 = od0.i.Companion;
                ql4.e eVar4 = (ql4.e) iVar4.f224257a;
                n0 n0Var = eVar4 != null ? eVar4.f : null;
                Long l2 = uVar.o;
                dj0.d dVar3 = new dj0.d(l2 != null ? l2.longValue() : 0L, uVar.f196542m);
                if (n0Var instanceof k0) {
                    utilizationLimit = new InstalmentFlowContract$IneligibilityDialogType.OverduePlans(dVar3, bVar2);
                } else if (n0Var instanceof ql4.l0) {
                    utilizationLimit = new InstalmentFlowContract$IneligibilityDialogType.RestrictedInstalmentPlans(dVar3);
                } else if (n0Var instanceof ql4.h0) {
                    utilizationLimit = new InstalmentFlowContract$IneligibilityDialogType.ActiveForbearance(((ql4.h0) n0Var).f247126a);
                } else if (n0Var instanceof g0) {
                    g0 g0Var = (g0) n0Var;
                    utilizationLimit = new InstalmentFlowContract$IneligibilityDialogType.UtilizationLimit(g0Var.f247122a, g0Var.f247123b);
                } else if (!(n0Var instanceof j0) && !(n0Var instanceof f0) && !(n0Var instanceof ql4.i0) && !(n0Var instanceof m0) && n0Var != null) {
                    throw new NoWhenBranchMatchedException();
                }
                hVar4.getClass();
                return new Pair(vVar, od0.h.a(utilizationLimit));
            case 28:
                n6 model = (n6) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vrb.l lVar = (vrb.l) ((vrb.b) ((CfdClosePositionsSelectorController) obj3).T.getValue());
                lVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj5 = model.k;
                vrb.a aVar36 = obj5 instanceof vrb.a ? (vrb.a) obj5 : null;
                if (aVar36 != null) {
                    lVar.l2(new w(lVar, aVar36, , i21), new yi5.b(i5));
                }
                return Unit.f186387a;
            default:
                Data data11 = (Data) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vrb.l lVar2 = (vrb.l) obj3;
                lVar2.H2(lVar2.f291562w, new i0(data11, 9));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f288627w = obj2;
    }
}
