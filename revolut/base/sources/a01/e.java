package a01;

import a15.h;
import a15.m;
import a2f.p;
import a2g.r;
import a6b.g;
import aee.q;
import ael.k;
import ael.l0;
import ael.n0;
import ael.q0;
import af4.s;
import af4.t;
import af4.u;
import ag1.l;
import ag1.o;
import ahe.w0;
import aj6.x;
import android.graphics.BitmapFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.multibanco.impl.data.network.MultibancoPendingPaymentService;
import com.revolut.feature.apm.multibanco.impl.data.network.MultibancoWithdrawalService;
import com.revolut.feature.hidden_accounts.impl.network.HiddenAccountsService;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.impl.ui.screen.details.TravelExperiencesDetailsScreenContract$InputData;
import com.revolut.feature.wealth.ui.impl.accounts.screen.get_started_onboarding.WealthAccountsGetStartedOnboardingScreen;
import e72.j;
import gim.i;
import i9g.v;
import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.k0;
import skm.p0;
import t20.n;
import vkm.j2;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f102w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f102w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e((f) this.f102w, continuation, 0);
            case 1:
                return new e((m) this.f102w, continuation, 1);
            case 2:
                return new e((a19.f) this.f102w, continuation, 2);
            case 3:
                return new e((a20.a) this.f102w, continuation, 3);
            case 4:
                return new e((a2c.e) this.f102w, continuation, 4);
            case 5:
                return new e((p) this.f102w, continuation, 5);
            case 6:
                return new e((r) this.f102w, continuation, 6);
            case 7:
                return new e((a5h.f) this.f102w, continuation, 7);
            case 8:
                return new e((com.revolut.feature.masav.impl.ui.c) this.f102w, continuation, 8);
            case 9:
                return new e((g) this.f102w, continuation, 9);
            case 10:
                return new e((a72.f) this.f102w, continuation, 10);
            case 11:
                return new e((a72.m) this.f102w, continuation, 11);
            case 12:
                return new e((com.revolut.feature_move_money.impl.automation.flow.b) this.f102w, continuation, 12);
            case 13:
                return new e((com.revolut.feature.revolutpay.impl.external.ui.flow.root.a) this.f102w, continuation, 13);
            case 14:
                return new e((com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.b) this.f102w, continuation, 14);
            case 15:
                return new e((zjh.c) this.f102w, continuation, 15);
            case 16:
                return new e((com.revolut.feature_retail_user_declarations.email.verification_screen.a) this.f102w, continuation, 16);
            case 17:
                return new e((zq.a) this.f102w, continuation, 17);
            case 18:
                return new e((com.revolut.feature.pockets.impl.details_v2.flow.b) this.f102w, continuation, 18);
            case 19:
                return new e((q) this.f102w, continuation, 19);
            case 20:
                return new e((q0) this.f102w, continuation, 20);
            case 21:
                return new e((af1.g) this.f102w, continuation, 21);
            case 22:
                return new e((u) this.f102w, continuation, 22);
            case 23:
                return new e((afa.f) this.f102w, continuation, 23);
            case 24:
                return new e((com.revolut.feature.pockets.impl.ui.pockets_list.c) this.f102w, continuation, 24);
            case 25:
                return new e((afg.i) this.f102w, continuation, 25);
            case 26:
                return new e((o) this.f102w, continuation, 26);
            case 27:
                return new e((w0) this.f102w, continuation, 27);
            case 28:
                return new e((x) this.f102w, continuation, 28);
            default:
                return new e((WealthAccountsGetStartedOnboardingScreen) this.f102w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v53, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v151, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objD;
        Object objA;
        l71.d dVar;
        nyf.a aVar;
        Object objB;
        Object pendingPayments;
        Object withdrawalConfig;
        Object objS2;
        Object objP2;
        Object objB2;
        Object objA2;
        Object objValueOf;
        Object objC;
        Object objB3;
        int i = this.u;
        int i2 = 23;
        int i3 = 7;
        int i5 = 2;
        boolean z = false;
        z = false;
        z = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z6 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z29 = false;
        boolean z31 = false;
        boolean z41 = false;
        boolean z49 = false;
        Object obj3 = this.f102w;
        int i6 = 1;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (k0.b(900000L, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                ((f) obj3).b();
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    m mVar = (m) obj3;
                    r05.f fVar = mVar.o;
                    LocalDate localDate = ((h) ((j2) mVar.f542q.f22677a).getValue()).f535b;
                    this.v = 1;
                    Object objD2 = fVar.f250704a.e.d(localDate, false, this);
                    if (objD2 != aVar3) {
                        objD2 = Unit.f186387a;
                    }
                    if (objD2 != aVar3) {
                        objD2 = Unit.f186387a;
                    }
                    if (objD2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                a19.c cVar = ((a19.f) obj3).f564a;
                this.v = 1;
                ArrayList arrayListB = cVar.b();
                return arrayListB == aVar4 ? aVar4 : arrayListB;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    t20.d dVar2 = ((a20.a) obj3).d;
                    this.v = 1;
                    objD = ((n) dVar2).d(this);
                    if (objD == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objD = obj2;
                }
                t20.c cVar2 = (t20.c) objD;
                if (cVar2 != null) {
                    return cVar2.f267387a;
                }
                return null;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    vkm.q0 q0VarN = rd0.e.n(rd0.e.b(hng.g.b(((ang.b) ((a2c.e) obj3).f731a).f7765a)), h0.f322473a);
                    a2c.c cVar3 = new a2c.c(i5, z ? 1 : 0, z3 ? 1 : 0);
                    this.v = 1;
                    objA = vkm.q.A(q0VarN, cVar3, this);
                    if (objA == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                Data data = (Data) objA;
                if (data != null && (dVar = (l71.d) data.getContent()) != null && l71.f.e(dVar)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (p.I2((p) obj3, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                r rVar = (r) obj3;
                TravelExperiencesDetailsScreenContract$InputData travelExperiencesDetailsScreenContract$InputData = rVar.f852p;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    TravelExperienceDatesSelection travelExperienceDatesSelection = travelExperiencesDetailsScreenContract$InputData.f93060b;
                    if (travelExperienceDatesSelection instanceof TravelExperienceDatesSelection.SingleDateSelection) {
                        aVar = new nyf.a(((TravelExperienceDatesSelection.SingleDateSelection) travelExperienceDatesSelection).f92909a.toLocalDate(), null);
                    } else if (travelExperienceDatesSelection instanceof TravelExperienceDatesSelection.RangeDateSelection) {
                        TravelExperienceDatesSelection.RangeDateSelection rangeDateSelection = (TravelExperienceDatesSelection.RangeDateSelection) travelExperienceDatesSelection;
                        aVar = new nyf.a(rangeDateSelection.f92907a.toLocalDate(), rangeDateSelection.f92908b.toLocalDate());
                    } else {
                        aVar = new nyf.a(null, null);
                    }
                    r10.f fVar2 = rVar.f855s;
                    nyf.b bVar = new nyf.b(travelExperiencesDetailsScreenContract$InputData.f93059a, aVar);
                    this.v = 1;
                    l0g.e eVar = (l0g.e) fVar2.b;
                    eVar.getClass();
                    kq5.d dVar3 = new kq5.d(eVar, bVar, z4 ? 1 : 0, i2);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, dVar3, this);
                    Object obj4 = objJ;
                    if (objJ != aVar8) {
                        obj4 = Unit.f186387a;
                    }
                    if (obj4 != aVar8) {
                        obj4 = Unit.f186387a;
                    }
                    if (obj4 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                a5h.f fVar3 = (a5h.f) obj3;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    ufm.i iVarE = ((k) fVar3.o).e(fVar3.f1399l.f180739a);
                    this.v = 1;
                    objB = nim.a.b(iVarE, this);
                    if (objB == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                nel.n nVar = (nel.n) objB;
                if (io3.h.i(nVar.f214597c) || io3.h.o(nVar.f214597c)) {
                    yji.n.l2(fVar3, vkm.q.Q(fVar3.f1402p.a(), new a32.b((Continuation) (z6 ? 1 : 0), (Object) fVar3, (Object) nVar, i6)), null, null, 7);
                    return Unit.f186387a;
                }
                hx7.e.n(new IllegalArgumentException(j6.a.q("Ratings widget was called with not Bond nor Structured Note instrument. Instrument ref: ", nVar.f214596b)));
                return Unit.f186387a;
            case 8:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.masav.impl.ui.c cVar4 = (com.revolut.feature.masav.impl.ui.c) obj3;
                    com.revolut.feature.masav.impl.ui.b bVar2 = new com.revolut.feature.masav.impl.ui.b(cVar4, null);
                    this.v = 1;
                    if (cVar4.p2(this, bVar2) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                q5b.c cVar5 = ((g) obj3).f1596c;
                this.v = 1;
                Object objB4 = ((c6b.p) cVar5).b(this);
                return objB4 == aVar11 ? aVar11 : objB4;
            case 10:
                Object arrayList = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    MultibancoPendingPaymentService multibancoPendingPaymentService = ((a72.f) obj3).f1756a;
                    this.v = 1;
                    pendingPayments = multibancoPendingPaymentService.getPendingPayments(this);
                    if (pendingPayments != arrayList) {
                    }
                    return arrayList;
                }
                if (i99 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                pendingPayments = obj2;
                Iterable<e72.e> iterable = (Iterable) pendingPayments;
                arrayList = new ArrayList(w.t(iterable, 10));
                for (e72.e eVar2 : iterable) {
                    Intrinsics.checkNotNullParameter(eVar2, "<this>");
                    arrayList.add(new h02.c(eVar2.getId(), eVar2.getPin(), eVar2.getOperationIdentifier(), eVar2.getMerchantName(), eVar2.getRevolutCardId(), eVar2.getServiceCardNumber(), mo3.a.o(eVar2.getAmount()), z92.f.t(eVar2.getPurchasedDate()), z92.f.t(eVar2.getExpirationDate())));
                }
                return arrayList;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    MultibancoWithdrawalService multibancoWithdrawalService = ((a72.m) obj3).f1762a;
                    this.v = 1;
                    withdrawalConfig = multibancoWithdrawalService.getWithdrawalConfig(this);
                    if (withdrawalConfig == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    withdrawalConfig = obj2;
                }
                j jVar = (j) withdrawalConfig;
                Intrinsics.checkNotNullParameter(jVar, "<this>");
                return new h02.g(jVar.getMultiplier(), new dj0.d(jVar.getMultiplier(), w62.a.f295373a), mo3.a.o(jVar.getMax()));
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature_move_money.impl.automation.flow.b bVar3 = (com.revolut.feature_move_money.impl.automation.flow.b) obj3;
                    com.revolut.feature_move_money.impl.automation.flow.a aVar14 = new com.revolut.feature_move_money.impl.automation.flow.a(bVar3, null);
                    this.v = 1;
                    if (bVar3.p2(this, aVar14) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.revolutpay.impl.external.ui.flow.root.a aVar16 = (com.revolut.feature.revolutpay.impl.external.ui.flow.root.a) obj3;
                    this.v = 1;
                    int i103 = a8c.n.f2170a[aVar16.z.ordinal()];
                    if (i103 == 1) {
                        objS2 = aVar16.S2(this);
                        if (objS2 != aVar15) {
                            objS2 = Unit.f186387a;
                        }
                    } else {
                        if (i103 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objS2 = aVar16.T2(this);
                        if (objS2 != aVar15) {
                            objS2 = Unit.f186387a;
                        }
                    }
                    if (objS2 == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.b bVar4 = (com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.b) obj3;
                    com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.a aVar18 = new com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.a(bVar4, null);
                    this.v = 1;
                    if (bVar4.p2(this, aVar18) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    HiddenAccountsService hiddenAccountsService = (HiddenAccountsService) ((zjh.c) obj3).f322830b;
                    this.v = 1;
                    if (hiddenAccountsService.unhideSecretAccounts(this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                com.revolut.feature_retail_user_declarations.email.verification_screen.a aVar20 = (com.revolut.feature_retail_user_declarations.email.verification_screen.a) obj3;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    a3i.q qVar = new a3i.q(aVar20, z11 ? 1 : 0, i6);
                    this.v = 1;
                    objP2 = aVar20.p2(this, qVar);
                    if (objP2 == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objP2 = obj2;
                }
                zlg.f fVar4 = (zlg.f) objP2;
                if (fVar4 instanceof zlg.e) {
                    aVar20.H2(aVar20.u, new abi.n((zlg.e) fVar4, 0));
                    aVar20.J2();
                } else {
                    if (!Intrinsics.f(fVar4, zlg.d.f323253a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar20.C2(abi.c.f2967a);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 != 0) {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                jhi.b bVarG = mo3.a.g(((ao.h) ((zq.a) obj3).f324336c).q(vd8.i.d), null, new a9d.p(17), 1);
                this.v = 1;
                Object objX = vkm.q.x(bVarG, this);
                return objX == aVar22 ? aVar22 : objX;
            case 18:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.pockets.impl.details_v2.flow.b bVar5 = (com.revolut.feature.pockets.impl.details_v2.flow.b) obj3;
                    com.revolut.feature.pockets.impl.details_v2.flow.a aVar24 = new com.revolut.feature.pockets.impl.details_v2.flow.a(bVar5, null);
                    this.v = 1;
                    if (bVar5.p2(this, aVar24) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 != 0) {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                q qVar2 = (q) obj3;
                aee.p pVar = new aee.p(qVar2, null);
                this.v = 1;
                Object objP22 = qVar2.p2(this, pVar);
                return objP22 == aVar25 ? aVar25 : objP22;
            case 20:
                q0 q0Var = (q0) obj3;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    vkm.q0 q0Var2 = new vkm.q0(new t38.e(new n0(null, null, false, false), i2, vkm.q.q(new a3i.i(q0Var.p(w4l.h.f294642c, cfl.g.f23742a, cfl.m.f23746a), q0Var, 6)), new l0(3, q0Var, q0.class, "reduceGiaReloadState", "reduceGiaReloadState(Lcom/revolut/shared/feature/wealth/domain/impl/domain/interactors/TradingAccountsInteractorImpl$GiaReloadState;Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount;)Lcom/revolut/shared/feature/wealth/domain/impl/domain/interactors/TradingAccountsInteractorImpl$GiaReloadState;", 4, 0)), new ad4.c(q0Var, z29 ? 1 : 0, i3), i6);
                    a2c.c cVar6 = new a2c.c(i5, 5, z12 ? 1 : 0);
                    this.v = 1;
                    if (vkm.q.A(q0Var2, cVar6, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                af1.g gVar = (af1.g) obj3;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    int iK = kli.a.k(gVar.f3825r.f22265a, 260.0f);
                    ufm.c cVarM = fkg.a.m(gVar.f3824q, gVar.f3823p.f60832a.f60688a, new h90.a(iK, iK), null, 28);
                    this.v = 1;
                    objB2 = nim.a.b(cVarM, this);
                    if (objB2 == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB2 = obj2;
                }
                gVar.x2(new af1.f((i80.a) objB2, z ? 1 : 0));
                return Unit.f186387a;
            case 22:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                u uVar = (u) obj3;
                s sVar = new s(uVar, z31 ? 1 : 0, i5);
                this.v = 1;
                Object objB5 = pu7.a.B(uVar.k, "accept valuation", sVar, this);
                return objB5 == aVar28 ? aVar28 : objB5;
            case 23:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 != 0) {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                j2 j2Var = ((afa.f) obj3).d;
                afa.e eVar3 = new afa.e(i5, z ? 1 : 0, z41 ? 1 : 0);
                this.v = 1;
                Object objY = vkm.q.y(j2Var, eVar3, this);
                return objY == aVar29 ? aVar29 : objY;
            case 24:
                com.revolut.feature.pockets.impl.ui.pockets_list.c cVar7 = (com.revolut.feature.pockets.impl.ui.pockets_list.c) obj3;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    rfb.b bVar6 = cVar7.C;
                    this.v = 1;
                    objA2 = bVar6.a(rfb.c.f253750a, this);
                    if (objA2 == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA2 = obj2;
                }
                cVar7.H2(cVar7.D, new t(zi0.c.P(objA2, false, null, 3), 3));
                return Unit.f186387a;
            case 25:
                afg.i iVar = (afg.i) obj3;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    p8g.c cVar8 = iVar.f4062r;
                    this.v = 1;
                    objValueOf = Boolean.valueOf(((v) cVar8).b());
                    if (objValueOf == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objValueOf = obj2;
                }
                iVar.H2(iVar.f4064t, new a2g.p(((Boolean) objValueOf).booleanValue(), i3));
                return Unit.f186387a;
            case 26:
                o oVar = (o) obj3;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    tf1.o oVar2 = oVar.f4770p;
                    qf1.e eVar4 = oVar.o.f4751a;
                    this.v = 1;
                    objC = oVar2.c(eVar4, this);
                    if (objC == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objC = obj2;
                }
                oVar.H2(oVar.f4772r, new l((Clause) objC, z ? 1 : 0));
                return Unit.f186387a;
            case 27:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 != 0) {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objB6 = w0.b((w0) obj3, this);
                return objB6 == aVar33 ? aVar33 : objB6;
            case 28:
                x xVar = (x) obj3;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    ufm.n nVarA = ((mg6.c) xVar.f5433r).a(xVar.o.f5414a);
                    this.v = 1;
                    objB3 = nim.a.b(nVarA, this);
                    if (objB3 == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB3 = obj2;
                }
                x61.f fVar5 = (x61.f) objB3;
                String str = fVar5.f303016a;
                byte[] bArr = fVar5.f303017b;
                xVar.H2(xVar.u, new aj6.v(new ei6.d(str, bArr != null ? BitmapFactory.decodeByteArray(bArr, 0, bArr.length) : null), z ? 1 : 0));
                return Unit.f186387a;
            default:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    ajh.g gVar2 = (ajh.g) ((WealthAccountsGetStartedOnboardingScreen) obj3).Q.getValue();
                    this.v = 1;
                    ajh.l lVar = (ajh.l) gVar2;
                    lVar.getClass();
                    if (pu7.a.B(lVar.k, "WealthAccountsGetStartedOnboardingScreenModel_onNavigationButtonClick", new a54.g(lVar, z49 ? 1 : 0, i5), this) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
