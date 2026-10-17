package ll6;

import com.revolut.biometric_verification.impl.data.service.BiometricVerificationScansService;
import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.domain.joint_account.JointAccountData;
import com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.CassAccountSwitchingFlowContract$Step;
import com.revolut.feature.insurance_car.impl.data.network.InsuranceCarService;
import com.revolut.feature.junior_tasks.api.models.JuniorTaskTaxBreakdownType;
import com.revolut.feature.junior_tasks.api.models.JuniorTasksTransferSummary;
import com.revolut.feature.junior_tasks.api.models.JuniorTasksTransferTaxBreakdown;
import com.revolut.feature.junior_tasks.api.models.JuniorTasksTransferTaxes;
import com.revolut.feature.junior_tasks.impl.services.JuniorTasksRewardsQuoteService;
import com.revolut.feature.payments.bills_chooser.impl.data.ItemizationScanBillService;
import com.revolut.feature.payments.profile.impl.data.network.passes.DigitalPassService;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.toggles.models.PublicExperimentDefinition;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import d9.t0;
import fmg.n0;
import hl7.b9;
import hl7.g5;
import hl7.q9;
import hl7.v2;
import hl7.y2;
import j54.v0;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kl.c0;
import kl7.i0;
import kl7.x1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import ljl.n1;
import ll7.e0;
import ll7.p;
import ll7.u;
import lmg.m;
import lnk.n;
import lv4.b0;
import maa.r;
import mlk.a0;
import okhttp3.MultipartBody$Part;
import okhttp3.RequestBody;
import retrofit2.Response;
import skm.p0;
import svi.s;
import ulm.a1;
import ulm.b1;
import ulm.e1;
import ulm.k1;
import ulm.p1;
import wp5.y;
import yhm.o;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f196588w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f196589x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(com.revolut.feature.slot_manager.impl.ui.screen.checklist.a aVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 7;
        this.f196588w = aVar;
        this.f196589x = (gim.i) function1;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i((com.revolut.feature.external_accounts.impl.ui.consents_kompot.consent_details.a) this.f196589x, continuation, 0);
                iVar.f196588w = obj2;
                return iVar;
            case 1:
                return new i((p) this.f196588w, (String) this.f196589x, continuation, 1);
            case 2:
                return new i((u) this.f196588w, (String) this.f196589x, continuation, 2);
            case 3:
                return new i((u) this.f196588w, (x1) this.f196589x, continuation, 3);
            case 4:
                return new i((e0) this.f196588w, (ml7.c) this.f196589x, continuation, 4);
            case 5:
                return new i((ll9.f) this.f196588w, (e60.l) this.f196589x, continuation, 5);
            case 6:
                return new i((ll9.f) this.f196588w, (File) this.f196589x, continuation, 6);
            case 7:
                return new i((com.revolut.feature.slot_manager.impl.ui.screen.checklist.a) this.f196588w, (Function1) this.f196589x, continuation);
            case 8:
                return new i((llh.i) this.f196588w, (sih.b) this.f196589x, continuation, 8);
            case 9:
                return new i((lm1.j) this.f196588w, (String) this.f196589x, continuation, 9);
            case 10:
                return new i((com.revolut.feature.contacts.impl.ui_kompot.add_contact.a) this.f196588w, (lm3.a) this.f196589x, continuation, 10);
            case 11:
                i iVar2 = new i((m) this.f196589x, continuation, 11);
                iVar2.f196588w = obj2;
                return iVar2;
            case 12:
                return new i((com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c) this.f196588w, (String) this.f196589x, continuation, 12);
            case 13:
                return new i((n) this.f196588w, (TermsScope) this.f196589x, continuation, 13);
            case 14:
                return new i((loa.l) this.f196588w, (PublicExperimentDefinition) this.f196589x, continuation, 14);
            case 15:
                return new i((com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b) this.f196588w, (wn2.d) this.f196589x, continuation, 15);
            case 16:
                return new i((c0) this.f196588w, (ArrayList) this.f196589x, continuation, 16);
            case 17:
                return new i((lp9.b) this.f196588w, (String) this.f196589x, continuation, 17);
            case 18:
                return new i((lp9.b) this.f196588w, (File) this.f196589x, continuation, 18);
            case 19:
                return new i((com.revolut.feature.transfer.core.impl.ui.reason.flow_v2.a) this.f196588w, (krf.c) this.f196589x, continuation, 19);
            case 20:
                return new i((lr.a) this.f196588w, (String) this.f196589x, continuation, 20);
            case 21:
                return new i((xr.b) this.f196588w, (lr.c) this.f196589x, continuation, 21);
            case 22:
                return new i((lsl.f) this.f196588w, (ChargeBreakdown) this.f196589x, continuation, 22);
            case 23:
                return new i((com.revolut.feature.workflow.engine.rfi.impl.ui.documents.a) this.f196588w, (File) this.f196589x, continuation, 23);
            case 24:
                return new i((b0) this.f196588w, (ssi.k) this.f196589x, continuation, 24);
            case 25:
                i iVar3 = new i((lvf.c) this.f196589x, continuation, 25);
                iVar3.f196588w = obj2;
                return iVar3;
            case 26:
                return new i((kye.e) this.f196588w, (String) this.f196589x, continuation, 26);
            case 27:
                i iVar4 = new i((d7e.b) this.f196589x, continuation, 27);
                iVar4.f196588w = obj2;
                return iVar4;
            case 28:
                return new i((lyi.m) this.f196588w, (s) this.f196589x, continuation, 28);
            default:
                i iVar5 = new i((com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.c) this.f196589x, continuation, 29);
                iVar5.f196588w = obj2;
                return iVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v9, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objV;
        Object reservation;
        Object drivingScoreDataPointsHistory;
        Object objA;
        Object objB;
        Object objQuoteForTasks;
        Object objUploadDeferredSelfie;
        Object digitalGooglePass;
        Object objI;
        Long l2;
        int i = this.u;
        int i2 = 24;
        int i3 = 14;
        JuniorTasksTransferTaxes juniorTasksTransferTaxes = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object obj3 = this.f196589x;
        int i5 = 1;
        switch (i) {
            case 0:
                fi6.d dVar = (fi6.d) this.f196588w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    r10.a aVar2 = ((com.revolut.feature.external_accounts.impl.ui.consents_kompot.consent_details.a) obj3).f72776q;
                    Intrinsics.h(dVar);
                    this.f196588w = dVar;
                    this.v = 1;
                    objV = aVar2.V(dVar, this);
                    if (objV == aVar) {
                        return aVar;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objV = obj2;
                }
                return new Pair(dVar, (Map) objV);
            case 1:
                String str = (String) obj3;
                p pVar = (p) this.f196588w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    g5 g5Var = new g5(y.u(pVar.f196650b, "toString(...)"));
                    InsuranceCarService insuranceCarService = pVar.f196649a;
                    this.v = 1;
                    if (insuranceCarService.confirmMta(str, g5Var, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i21 != 1) {
                        if (i21 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return obj2;
                    }
                    o.b(obj2);
                }
                n1 n1Var = new n1(25);
                this.v = 2;
                pVar.getClass();
                lb0.b0 b0Var = new lb0.b0(n1Var, pVar, str, (Continuation) null, 18);
                p0 p0Var = p0.f264001a;
                Object objJ = skm.e0.J(elm.f.f127540b, b0Var, this);
                return objJ == aVar3 ? aVar3 : objJ;
            case 2:
                u uVar = (u) this.f196588w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    reservation = uVar.f196659a.getReservation((String) obj3, this);
                    if (reservation == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    reservation = obj2;
                }
                return t0.v((q9) reservation, uVar.f196661c);
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    o.b(obj2);
                    InsuranceCarService insuranceCarService2 = ((u) this.f196588w).f196659a;
                    x1 x1Var = (x1) obj3;
                    Intrinsics.checkNotNullParameter(x1Var, "<this>");
                    String string = x1Var.f185403a.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    b9 b9Var = new b9(string, x1Var.f185404b);
                    this.v = 1;
                    if (insuranceCarService2.setPolicyRenewalReminder(b9Var, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    o.b(obj2);
                    InsuranceCarService insuranceCarService3 = ((e0) this.f196588w).f196609a;
                    ml7.c cVar = (ml7.c) obj3;
                    String str2 = cVar.f206643a;
                    String code = cVar.f206644b.getCode();
                    this.v = 1;
                    drivingScoreDataPointsHistory = insuranceCarService3.getDrivingScoreDataPointsHistory(str2, code, this);
                    if (drivingScoreDataPointsHistory == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    drivingScoreDataPointsHistory = obj2;
                }
                List list = ((y2) drivingScoreDataPointsHistory).f153373a;
                Intrinsics.checkNotNullParameter(list, "<this>");
                List<v2> list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                for (v2 v2Var : list2) {
                    Intrinsics.checkNotNullParameter(v2Var, "<this>");
                    arrayList.add(new i0(v2Var.f153335a, v2Var.f153336b));
                }
                return arrayList;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    o.b(obj2);
                    ll9.f fVar = (ll9.f) this.f196588w;
                    File fileB = ((e60.m) ((e60.l) obj3)).b();
                    this.v = 1;
                    if (ll9.f.c3(fVar, fileB, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                ll9.f fVar2 = (ll9.f) this.f196588w;
                v0 v0Var = new v0((Object) fVar2, obj3, (Continuation) (objArr == true ? 1 : 0), i2);
                this.v = 1;
                Object objB2 = pu7.a.B(fVar2.e, "onImageSelected", v0Var, this);
                return objB2 == aVar8 ? aVar8 : objB2;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 != 0) {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.slot_manager.impl.ui.screen.checklist.a aVar10 = (com.revolut.feature.slot_manager.impl.ui.screen.checklist.a) this.f196588w;
                boe.k kVar = new boe.k(14, null, (gim.i) obj3);
                this.v = 1;
                Object objB3 = pu7.a.B(aVar10.k, "executeEvent", kVar, this);
                return objB3 == aVar9 ? aVar9 : objB3;
            case 8:
                llh.i iVar = (llh.i) this.f196588w;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    objA = nlh.b.a((sih.b) obj3);
                    if (objA == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objA = obj2;
                }
                KompotDestination kompotDestination = (KompotDestination) objA;
                return kompotDestination != null ? com.revolut.retail.core.navigation.a.c(iVar.c(), new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) kompotDestination, false, (Integer) null, 0, 61))) : iVar.c();
            case 9:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    o.b(obj2);
                    String query = (String) obj3;
                    mm1.c cVar2 = (mm1.c) ((lm1.j) this.f196588w).o;
                    cVar2.getClass();
                    Intrinsics.checkNotNullParameter(query, "query");
                    mm1.d dVar2 = new mm1.d(0, query);
                    cVar2.d.onNext(new lk0.g(zhm.u.c(new lk0.e(f0.f322471a, dVar2, true, null, null, 24))));
                    m84.e eVar = new m84.e(cVar2, i2);
                    Intrinsics.checkNotNullParameter(query, "query");
                    efm.b bVarB = new lk0.d(eVar, new r(cVar2, 13), new ml3.y(cVar2, 8), dVar2, new mll.h(query, i5), new a0(9), yk0.d.a()).b(cVar2.f207126c);
                    this.v = 1;
                    if (nim.a.a(bVarB, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.contacts.impl.ui_kompot.add_contact.a aVar14 = (com.revolut.feature.contacts.impl.ui_kompot.add_contact.a) this.f196588w;
                lm3.m mVar = new lm3.m(aVar14, (lm3.a) obj3, objArr2 == true ? 1 : 0, i5);
                this.v = 1;
                Object objB4 = pu7.a.B(aVar14.k, "SINGLE_TASK_ADD", mVar, this);
                return objB4 == aVar13 ? aVar13 : objB4;
            case 11:
                n0 n0Var = (n0) this.f196588w;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 != 0) {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                k7i.i iVar2 = ((m) obj3).f197058c;
                this.f196588w = null;
                this.v = 1;
                Object objO = iVar2.o(n0Var, this);
                return objO == aVar15 ? aVar15 : objO;
            case 12:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                lg0.a aVar17 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX1 = lg0.b.x1(((com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c) this.f196588w).f101458r, (String) obj3, aVar17, null, this, 4);
                return objX1 == aVar16 ? aVar16 : objX1;
            case 13:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 != 0) {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                n nVar = (n) this.f196588w;
                v0 v0Var2 = new v0((Object) nVar, obj3, (Continuation) (objArr3 == true ? 1 : 0), 26);
                this.v = 1;
                Object objP2 = nVar.p2(this, v0Var2);
                return objP2 == aVar18 ? aVar18 : objP2;
            case 14:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                loa.l lVar = (loa.l) this.f196588w;
                lai.d dVar3 = new lai.d(lVar, (PublicExperimentDefinition) obj3, objArr4 == true ? 1 : 0, i3);
                this.v = 1;
                Object objB5 = pu7.a.B(lVar.k, "update_toggle", dVar3, this);
                return objB5 == aVar19 ? aVar19 : objB5;
            case 15:
                wn2.d dVar4 = (wn2.d) obj3;
                com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b bVar = (com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.b) this.f196588w;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    o.b(obj2);
                    smd.s sVar = bVar.f64006p;
                    this.v = 1;
                    objB = sVar.B(this);
                    if (objB == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB = obj2;
                }
                JointAccountData jointAccountData = (JointAccountData) objB;
                if (jointAccountData == null) {
                    oki.h.t2(bVar, bVar.f64010t, new CassAccountSwitchingFlowContract$Step.SourceAccountForm(dVar4, wn2.a.PERSONAL), true, null, false, 12);
                } else {
                    oki.h.t2(bVar, bVar.f64010t, new CassAccountSwitchingFlowContract$Step.TargetAccountSelection(dVar4, jointAccountData), true, null, false, 12);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    o.b(obj2);
                    JuniorTasksRewardsQuoteService juniorTasksRewardsQuoteService = (JuniorTasksRewardsQuoteService) ((c0) this.f196588w).f185148b;
                    jp8.a aVar22 = new jp8.a((ArrayList) obj3);
                    this.v = 1;
                    objQuoteForTasks = juniorTasksRewardsQuoteService.quoteForTasks(aVar22, this);
                    if (objQuoteForTasks == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objQuoteForTasks = obj2;
                }
                jp8.h hVar = (jp8.h) objQuoteForTasks;
                Intrinsics.checkNotNullParameter(hVar, "<this>");
                dj0.d dVarO = mo3.a.o(hVar.f177224a);
                jp8.n nVar2 = hVar.f177225b;
                if (nVar2 != null) {
                    dj0.d dVarO2 = mo3.a.o(nVar2.f177231a);
                    List<jp8.k> list3 = nVar2.f177232b;
                    ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                    for (jp8.k kVar2 : list3) {
                        JuniorTaskTaxBreakdownType.Companion companion = JuniorTaskTaxBreakdownType.INSTANCE;
                        String type = kVar2.f177228b;
                        companion.getClass();
                        Intrinsics.checkNotNullParameter(type, "type");
                        arrayList2.add(new JuniorTasksTransferTaxBreakdown(mo3.a.o(kVar2.f177227a), Intrinsics.f(type, "consumption.gmf") ? JuniorTaskTaxBreakdownType.Gmf.f77347a : new JuniorTaskTaxBreakdownType.Unknown(type)));
                    }
                    juniorTasksTransferTaxes = new JuniorTasksTransferTaxes(dVarO2, arrayList2);
                }
                return new JuniorTasksTransferSummary(dVarO, juniorTasksTransferTaxes);
            case 17:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 != 0) {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.v = 1;
                Object taskResult = ((lp9.b) this.f196588w).f198960a.getTaskResult((String) obj3, this);
                return taskResult == aVar23 ? aVar23 : taskResult;
            case 18:
                lp9.b bVar2 = (lp9.b) this.f196588w;
                File file = (File) obj3;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 != 0) {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                String strJ = ((a80.h) bVar2.f198961b).j(file);
                if (strJ == null) {
                    strJ = "application/octet-stream";
                }
                p1 p1Var = RequestBody.Companion;
                b1.Companion.getClass();
                b1 b1VarB = a1.b(strJ);
                p1Var.getClass();
                k1 k1VarA = p1.a(file, b1VarB);
                e1 e1Var = MultipartBody$Part.Companion;
                String name = file.getName();
                e1Var.getClass();
                MultipartBody$Part multipartBody$PartC = e1.c("file", name, k1VarA);
                ItemizationScanBillService itemizationScanBillService = bVar2.f198960a;
                this.v = 1;
                Object objSubmitFile = itemizationScanBillService.submitFile(multipartBody$PartC, this);
                return objSubmitFile == aVar24 ? aVar24 : objSubmitFile;
            case 19:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    o.b(obj2);
                    com.revolut.feature.transfer.core.impl.ui.reason.flow_v2.a aVar26 = (com.revolut.feature.transfer.core.impl.ui.reason.flow_v2.a) this.f196588w;
                    lai.d dVar5 = new lai.d(aVar26, (krf.c) obj3, objArr5 == true ? 1 : 0, 15);
                    this.v = 1;
                    if (aVar26.p2(this, dVar5) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    o.b(obj2);
                    zq.c cVarH = ((lr.a) this.f196588w).f199335a.h();
                    ar.b bVar3 = new ar.b((String) obj3);
                    this.v = 1;
                    if (cVarH.c(bVar3, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                lr.c cVar3 = (lr.c) obj3;
                xr.b bVar4 = (xr.b) this.f196588w;
                File file2 = bVar4.f308185a;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    o.b(obj2);
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.INFO, "[UPLOAD_WORKER]", j6.a.q("Uploading file ", file2.getAbsolutePath()), null, null, 16);
                    if (!file2.exists()) {
                        rd0.d.a(rd0.c.ERROR, null, null, new FileNotFoundException(a0.d.r(file2.getName(), " not found. File expected to be present")), h0.f322473a);
                        return xr.a.FILE_ABSENT;
                    }
                    p1 p1Var2 = RequestBody.Companion;
                    b1.Companion.getClass();
                    b1 b1VarA = a1.a("image/jpeg");
                    p1Var2.getClass();
                    k1 k1VarA2 = p1.a(file2, b1VarA);
                    e1 e1Var2 = MultipartBody$Part.Companion;
                    String name2 = file2.getName();
                    e1Var2.getClass();
                    MultipartBody$Part multipartBody$PartC2 = e1.c("scan", name2, k1VarA2);
                    MultipartBody$Part multipartBody$PartB = e1.b("scanInfo", cVar3.f199338b.c(kr.j.Companion.serializer(), new kr.j(new kr.g(bVar4.f308186b))));
                    BiometricVerificationScansService biometricVerificationScansService = cVar3.f199337a;
                    String str3 = bVar4.f308187c;
                    this.v = 1;
                    objUploadDeferredSelfie = biometricVerificationScansService.uploadDeferredSelfie(str3, multipartBody$PartC2, multipartBody$PartB, this);
                    if (objUploadDeferredSelfie == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objUploadDeferredSelfie = obj2;
                }
                int iCode = ((Response) objUploadDeferredSelfie).code();
                return iCode != 200 ? iCode != 401 ? xr.a.NETWORK_ERROR : xr.a.UPDATE_TOKEN : xr.a.SUCCESS;
            case 22:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 != 0) {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                lsl.f fVar3 = (lsl.f) this.f196588w;
                lai.d dVar6 = new lai.d(fVar3, (ChargeBreakdown) obj3, objArr6 == true ? 1 : 0, 17);
                this.v = 1;
                Object objB6 = pu7.a.B(fVar3.e, "showFeeBreakdownDialog", dVar6, this);
                return objB6 == aVar29 ? aVar29 : objB6;
            case 23:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    o.b(obj2);
                    com.revolut.feature.workflow.engine.rfi.impl.ui.documents.a aVar31 = (com.revolut.feature.workflow.engine.rfi.impl.ui.documents.a) this.f196588w;
                    lai.d dVar7 = new lai.d((File) obj3, aVar31, objArr7 == true ? 1 : 0, 18);
                    this.v = 1;
                    if (aVar31.p2(this, dVar7) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (((b0) this.f196588w).f200289t.Z2((ssi.k) obj3, this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                FlowCollector flowCollector = (FlowCollector) this.f196588w;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    o.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((lvf.c) obj3).f200375n.c("android.permission.ACCESS_COARSE_LOCATION"));
                    this.f196588w = null;
                    this.v = 1;
                    if (flowCollector.emit(boolValueOf, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    o.b(obj2);
                    DigitalPassService digitalPassService = (DigitalPassService) ((kye.e) this.f196588w).f190729b;
                    kw9.b bVar5 = new kw9.b((String) obj3);
                    this.v = 1;
                    digitalGooglePass = digitalPassService.getDigitalGooglePass(bVar5, this);
                    if (digitalGooglePass == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    digitalGooglePass = obj2;
                }
                return new iw9.a(((kw9.a) digitalGooglePass).getJwtToken());
            case 27:
                d7e.b bVar6 = (d7e.b) obj3;
                FlowCollector flowCollector2 = (FlowCollector) this.f196588w;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    o.b(obj2);
                    efm.k kVarC = bVar6.f111937a.d.c();
                    this.f196588w = flowCollector2;
                    this.v = 1;
                    objI = nim.a.i(kVarC, this);
                    if (objI == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i115 != 1) {
                        if (i115 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                    objI = obj2;
                }
                do3.n nVar3 = (do3.n) objI;
                Data data = (nVar3 == null || (l2 = nVar3.f116418q) == null) ? new Data(null, new IllegalStateException("User account creation date is not available"), false, 5, null) : new Data(oc.c.I(l2.longValue()), null, false, 6, null);
                this.f196588w = null;
                this.v = 2;
                if (flowCollector2.emit(data, this) == aVar35) {
                    return aVar35;
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 != 0) {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                lyi.m mVar2 = (lyi.m) this.f196588w;
                lai.d dVar8 = new lai.d(mVar2, (s) obj3, objArr8 == true ? 1 : 0, 20);
                this.v = 1;
                Object objB0 = u0.b0(mVar2.X(), "TAG_LOADING_BUTTON_CONFIRM", dVar8, this);
                return objB0 == aVar36 ? aVar36 : objB0;
            default:
                CoroutineScope coroutineScope = (CoroutineScope) this.f196588w;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    o.b(obj2);
                    com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.c cVar4 = (com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.c) obj3;
                    com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.b bVar7 = new com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.b(cVar4, coroutineScope, null);
                    this.f196588w = null;
                    this.v = 1;
                    if (cVar4.p2(this, bVar7) == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f196588w = obj2;
        this.f196589x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f196589x = obj2;
    }
}
