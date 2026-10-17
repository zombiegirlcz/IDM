package ikf;

import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.data.model.Data;
import com.revolut.domain.models.transactions.ThreeDSTransaction;
import com.revolut.feature.apm.core.impl.data.network.onboarding.ApmOnboardingService;
import com.revolut.feature.apm.core.impl.data.network.payment_authorisations.ApmPaymentAuthorisationsAmendmentService;
import com.revolut.feature.apm.core.impl.data.network.settings.ApmSettingsService;
import com.revolut.feature.apm.core.impl.data.network.transfer.ApmTransferService;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentInfo;
import com.revolut.feature.checkout.add_money_methods.api.model.AddMoneyMethod;
import com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType;
import com.revolut.feature.junior_wallet.impl.services.JuniorWalletService;
import com.revolut.feature.profile.impl.ui.documents_redesigned.CurrencySelectionResult;
import com.revolut.feature.user.checklist.impl.data.service.AdoptionJourneyService;
import com.revolut.feature.user.checklist.impl.data.service.UserChecklistService;
import fmg.n0;
import fmg.p;
import fmg.s;
import ipb.k;
import iqf.l;
import isl.m;
import iuj.a0;
import iv5.o;
import ix6.h0;
import iz1.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import r10.t;
import retrofit2.Response;
import skm.e0;
import skm.k0;
import tof.a3;
import vkm.j2;
import vkm.q0;
import y7a.v;
import y7a.w;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f161947w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f161948x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(ivh.c cVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 23;
        this.f161947w = cVar;
        this.f161948x = (gim.i) function1;
    }

    /* JADX WARN: Type inference failed for: r1v43, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g((h) this.f161947w, (String) this.f161948x, continuation, 0);
            case 1:
                return new g((t) this.f161947w, (bc1.a) this.f161948x, continuation, 1);
            case 2:
                return new g((img.d) this.f161948x, continuation, 2);
            case 3:
                return new g((img.d) this.f161947w, (String) this.f161948x, continuation, 3);
            case 4:
                return new g((img.g) this.f161948x, continuation, 4);
            case 5:
                g gVar = new g((com.revolut.feature.wealth.ui.impl.trade_redesign.screen.a) this.f161948x, continuation, 5);
                gVar.f161947w = obj2;
                return gVar;
            case 6:
                return new g((in0.d) this.f161948x, continuation, 6);
            case 7:
                return new g((Function1) this.f161947w, (v) this.f161948x, continuation, 7);
            case 8:
                return new g((inh.h) this.f161947w, (inh.e) this.f161948x, continuation, 8);
            case 9:
                return new g((k) this.f161947w, (String) this.f161948x, continuation, 9);
            case 10:
                g gVar2 = new g((l) this.f161948x, continuation, 10);
                gVar2.f161947w = obj2;
                return gVar2;
            case 11:
                return new g((com.revolut.feature.credit.card.impl.ui.direct_debit.b) this.f161947w, (String) this.f161948x, continuation, 11);
            case 12:
                g gVar3 = new g((ird.b) this.f161948x, continuation, 12);
                gVar3.f161947w = obj2;
                return gVar3;
            case 13:
                return new g((com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b) this.f161947w, (a3) this.f161948x, continuation, 13);
            case 14:
                return new g((is8.a) this.f161947w, (cs8.a) this.f161948x, continuation, 14);
            case 15:
                return new g((com.revolut.feature.three_ds_verification.impl.ui.sceen.d) this.f161947w, (ThreeDSTransaction) this.f161948x, continuation, 15);
            case 16:
                return new g((com.revolut.feature.three_ds_verification.impl.ui.sceen.d) this.f161947w, (AddMoneyMethod) this.f161948x, continuation, 16);
            case 17:
                g gVar4 = new g((q0) this.f161948x, continuation, 17);
                gVar4.f161947w = obj2;
                return gVar4;
            case 18:
                return new g((m) this.f161947w, (isl.f) this.f161948x, continuation, 18);
            case 19:
                return new g((a0) this.f161947w, (String) this.f161948x, continuation, 19);
            case 20:
                return new g((a0) this.f161947w, this.f161948x, continuation, 20);
            case 21:
                return new g((PopupMenuItem) this.f161947w, (o) this.f161948x, continuation, 21);
            case 22:
                return new g((iv7.i) this.f161947w, (String) this.f161948x, continuation, 22);
            case 23:
                return new g((ivh.c) this.f161947w, (Function1) this.f161948x, continuation);
            case 24:
                return new g((iwj.a) this.f161948x, continuation, 24);
            case 25:
                return new g((com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g) this.f161947w, (h0) this.f161948x, continuation, 25);
            case 26:
                return new g((iz1.h) this.f161947w, (dx1.b) this.f161948x, continuation, 26);
            case 27:
                return new g((iz1.j) this.f161947w, (ApmPaymentAuthorisationPaymentMethod) this.f161948x, continuation, 27);
            case 28:
                return new g((iz1.m) this.f161947w, (String) this.f161948x, continuation, 28);
            default:
                return new g((q) this.f161947w, (t02.f) this.f161948x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v60, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayList;
        Object adoptionJourney;
        Object userChecklist;
        img.g gVar;
        Object objA;
        Set set;
        Object objX;
        Object objB;
        iwj.a aVar;
        Object objPostDeregister;
        Object pendingAmendments;
        Object settings;
        Object objPostInitiatePayment;
        int i = 3;
        int i2 = 2;
        boolean z = false;
        z = false;
        ApmPaymentInfo apmPaymentInfo = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        int i3 = 1;
        switch (this.u) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                h hVar = (h) this.f161947w;
                f fVar = new f(hVar, (String) this.f161948x, objArr == true ? 1 : 0, i3);
                this.v = 1;
                Object objB2 = pu7.a.B(hVar.e, "CLICK_TASK_ID", fVar, this);
                return objB2 == aVar2 ? aVar2 : objB2;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (do3.q.J(this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1 && i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                do {
                    iki.d[] dVarArr = (iki.d[]) ((t) this.f161947w).f250857a;
                    arrayList = new ArrayList();
                    for (int i21 = 0; i21 < 2; i21++) {
                        iki.d dVar = dVarArr[i21];
                        dVar.getClass();
                        mki.j.a("NavActionsScheduler");
                        zhm.a0.x(d0.d1(dVar.f161979b), arrayList);
                    }
                    if (arrayList.isEmpty()) {
                        ((bc1.a) this.f161948x).invoke();
                        return Unit.f186387a;
                    }
                    this.v = 2;
                } while (e0.z(arrayList, this) != aVar3);
                return aVar3;
            case 2:
                img.d dVar2 = (img.d) this.f161948x;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    AdoptionJourneyService adoptionJourneyService = dVar2.f162445a;
                    this.v = 1;
                    adoptionJourney = adoptionJourneyService.getAdoptionJourney(this);
                    if (adoptionJourney == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj3 = this.f161947w;
                        yhm.o.b(obj2);
                        return obj3;
                    }
                    yhm.o.b(obj2);
                    adoptionJourney = obj2;
                }
                x4l.c cVar = dVar2.d;
                Unit unit = Unit.f186387a;
                this.f161947w = adoptionJourney;
                this.v = 2;
                return cVar.f(unit, (p) adoptionJourney, this) == aVar4 ? aVar4 : adoptionJourney;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                try {
                    if (i32 == 0) {
                        yhm.o.b(obj2);
                        AdoptionJourneyService adoptionJourneyService2 = ((img.d) this.f161947w).f162445a;
                        s sVar = new s((String) this.f161948x);
                        this.v = 1;
                        if (adoptionJourneyService2.sendStepCompletion(sVar, this) == aVar5) {
                            return aVar5;
                        }
                    } else {
                        if (i32 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    break;
                } catch (Throwable th10) {
                    if (!tj0.a.a(th10)) {
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "AdoptionJourneyRepositoryImpl", null, th10, h0Var);
                    }
                }
                return Unit.f186387a;
            case 4:
                img.g gVar2 = (img.g) this.f161948x;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    UserChecklistService userChecklistService = gVar2.f162449a;
                    this.f161947w = gVar2;
                    this.v = 1;
                    userChecklist = userChecklistService.getUserChecklist(this);
                    if (userChecklist == aVar6) {
                        return aVar6;
                    }
                    gVar = gVar2;
                } else {
                    if (i33 != 1) {
                        if (i33 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        n0 n0Var = (n0) this.f161947w;
                        yhm.o.b(obj2);
                        return n0Var;
                    }
                    img.g gVar3 = (img.g) this.f161947w;
                    yhm.o.b(obj2);
                    gVar = gVar3;
                    userChecklist = obj2;
                }
                n0 n0VarF = img.g.f(gVar, (Response) userChecklist);
                x4l.c cVar2 = gVar2.e;
                Unit unit2 = Unit.f186387a;
                this.f161947w = n0VarF;
                this.v = 2;
                return cVar2.f(unit2, n0VarF, this) == aVar6 ? aVar6 : n0VarF;
            case 5:
                vmh.g gVar4 = (vmh.g) this.f161947w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    if (gVar4.f290586b == vmh.f.STRATEGIES) {
                        dlc.h hVar2 = ((com.revolut.feature.wealth.ui.impl.trade_redesign.screen.a) this.f161948x).E;
                        this.f161947w = null;
                        this.v = 1;
                        if (hVar2.Z2(this) == aVar7) {
                            return aVar7;
                        }
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                in0.d dVar3 = (in0.d) this.f161948x;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    Set set2 = fn0.a.f136505a;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it8 = set2.iterator();
                    while (it8.hasNext()) {
                        String str = ((gn0.c) it8.next()).f144897c;
                        gn0.f fVar2 = str != null ? new gn0.f(str) : null;
                        if (fVar2 != null) {
                            arrayList2.add(fVar2);
                        }
                    }
                    Set setI1 = d0.i1(arrayList2);
                    b70.e eVar = dVar3.f162575b;
                    this.f161947w = setI1;
                    this.v = 1;
                    objA = eVar.a();
                    if (objA == aVar8) {
                        return aVar8;
                    }
                    set = setI1;
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    set = (Set) this.f161947w;
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                Set set3 = (Set) objA;
                if (set3.isEmpty()) {
                    return Boolean.FALSE;
                }
                Set set4 = set3;
                if (!(set4 instanceof Collection) || !set4.isEmpty()) {
                    Iterator it9 = set4.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            ArrayList<String> arrayListC = dVar3.f162576c.c((String) it9.next());
                            gn0.d dVar4 = gn0.f.Companion;
                            ArrayList arrayList3 = new ArrayList();
                            for (String str2 : arrayListC) {
                                dVar4.getClass();
                                String strA = gn0.d.a(str2);
                                gn0.f fVar3 = strA != null ? new gn0.f(strA) : null;
                                if (fVar3 != null) {
                                    arrayList3.add(fVar3);
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                Iterator it10 = arrayList3.iterator();
                                while (it10.hasNext()) {
                                    if (!set.contains(new gn0.f(((gn0.f) it10.next()).f144900a))) {
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (k0.b(200L, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Function1 function1 = (Function1) this.f161947w;
                w wVar = ((v) this.f161948x).f311454a;
                Intrinsics.i(wVar, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.documents_redesigned.CurrencySelectionResult");
                function1.invoke(((CurrencySelectionResult) wVar).f81408a);
                return Unit.f186387a;
            case 8:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                inh.h hVar3 = (inh.h) this.f161947w;
                inh.g gVar5 = new inh.g(hVar3, (inh.e) this.f161948x, objArr2 == true ? 1 : 0, z ? 1 : 0);
                this.v = 1;
                Object objB3 = pu7.a.B(hVar3.e, "open-earnings-event-details", gVar5, this);
                return objB3 == aVar10 ? aVar10 : objB3;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                k kVar = (k) this.f161947w;
                inh.g gVar6 = new inh.g(kVar, (String) this.f161948x, objArr3 == true ? 1 : 0, i3);
                this.v = 1;
                Object objB4 = pu7.a.B(kVar.k, "Url handling", gVar6, this);
                return objB4 == aVar11 ? aVar11 : objB4;
            case 10:
                FlowCollector flowCollector = (FlowCollector) this.f161947w;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    String str3 = ((iqf.a) ((j2) ((l) this.f161948x).f167835p.f22677a).getValue()).d;
                    this.f161947w = null;
                    this.v = 1;
                    if (flowCollector.emit(str3, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 != 0) {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.direct_debit.b bVar = (com.revolut.feature.credit.card.impl.ui.direct_debit.b) this.f161947w;
                com.revolut.feature.credit.card.impl.ui.direct_debit.a aVar14 = new com.revolut.feature.credit.card.impl.ui.direct_debit.a(bVar, (String) this.f161948x, null);
                this.v = 1;
                Object objB5 = pu7.a.B(bVar.k, "CLABE validation", aVar14, this);
                return objB5 == aVar13 ? aVar13 : objB5;
            case 12:
                n8b.a aVar15 = ((ird.b) this.f161948x).f168041a;
                FlowCollector flowCollector2 = (FlowCollector) this.f161947w;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    List<String> listA = ((o8b.c) aVar15).a();
                    ArrayList arrayList4 = new ArrayList(zhm.w.t(listA, 10));
                    for (String str4 : listA) {
                        arrayList4.add(new ird.a(((o8b.c) aVar15).b(str4), str4));
                    }
                    Data dataP = zi0.c.P(arrayList4, false, null, 3);
                    this.f161947w = null;
                    this.v = 1;
                    if (flowCollector2.emit(dataP, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b bVar2 = (com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b) this.f161947w;
                    is2.l lVar = new is2.l(bVar2, (a3) this.f161948x, objArr4 == true ? 1 : 0, i3);
                    this.v = 1;
                    if (bVar2.p2(this, lVar) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    JuniorWalletService juniorWalletService = ((is8.a) this.f161947w).f168167a;
                    cs8.a aVar19 = (cs8.a) this.f161948x;
                    Intrinsics.checkNotNullParameter(aVar19, "<this>");
                    String str5 = aVar19.f108452a;
                    dj0.d dVar5 = aVar19.f108453b;
                    hs8.a aVar20 = new hs8.a(dVar5.f115082a, str5, dVar5.f115083b.f306286a, aVar19.f108454c, aVar19.d);
                    this.v = 1;
                    if (juniorWalletService.withdrawMoney(aVar20, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar6 = (com.revolut.feature.three_ds_verification.impl.ui.sceen.d) this.f161947w;
                    ise.q qVar = new ise.q(dVar6, (ThreeDSTransaction) this.f161948x, objArr5 == true ? 1 : 0, i2);
                    this.v = 1;
                    if (dVar6.p2(this, qVar) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    j2 j2Var = ((com.revolut.feature.three_ds_verification.impl.ui.sceen.d) this.f161947w).K;
                    Data dataP2 = zi0.c.P((AddMoneyMethod) this.f161948x, false, null, 3);
                    this.v = 1;
                    j2Var.getClass();
                    j2Var.g(null, dataP2);
                    if (Unit.f186387a == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = (FlowCollector) this.f161947w;
                    q0 q0Var = (q0) this.f161948x;
                    img.c cVar3 = new img.c(flowCollector3, 22);
                    this.f161947w = null;
                    this.v = 1;
                    if (q0Var.collect(cVar3, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 != 0) {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                m mVar = (m) this.f161947w;
                ah1.m mVar2 = new ah1.m(mVar, (isl.f) this.f161948x, objArr6 == true ? 1 : 0, 20);
                this.v = 1;
                Object objB6 = pu7.a.B(mVar.e, "on_term_description_click", mVar2, this);
                return objB6 == aVar24 ? aVar24 : objB6;
            case 19:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 != 0) {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                a0 a0Var = (a0) this.f161947w;
                inh.g gVar7 = new inh.g(a0Var, (String) this.f161948x, objArr7 == true ? 1 : 0, i2);
                this.v = 1;
                Object objP2 = a0Var.p2(this, gVar7);
                return objP2 == aVar25 ? aVar25 : objP2;
            case 20:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 != 0) {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                a0 a0Var2 = (a0) this.f161947w;
                inh.g gVar8 = new inh.g(a0Var2, this.f161948x, objArr8 == true ? 1 : 0, i);
                this.v = 1;
                Object objP22 = a0Var2.p2(this, gVar8);
                return objP22 == aVar26 ? aVar26 : objP22;
            case 21:
                PopupMenuItem popupMenuItem = (PopupMenuItem) this.f161947w;
                o oVar = (o) this.f161948x;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                switch (this.v) {
                    case 0:
                        yhm.o.b(obj2);
                        String f55135b = popupMenuItem.getF53150a();
                        switch (f55135b.hashCode()) {
                            case 161167939:
                                if (f55135b.equals("CRYPTO_INVESTMENTS_POPUP_MENU_ITEM_LIMIT_VARIANT_1_ID")) {
                                    st5.b bVar3 = st5.b.ONE;
                                    Object f55137g = popupMenuItem.getF();
                                    this.v = 3;
                                    if (o.f3(oVar, bVar3, f55137g, this) == aVar27) {
                                        return aVar27;
                                    }
                                }
                                return Unit.f186387a;
                            case 161197730:
                                if (f55135b.equals("CRYPTO_INVESTMENTS_POPUP_MENU_ITEM_LIMIT_VARIANT_2_ID")) {
                                    st5.b bVar4 = st5.b.TWO;
                                    Object f55137g2 = popupMenuItem.getF();
                                    this.v = 4;
                                    if (o.f3(oVar, bVar4, f55137g2, this) == aVar27) {
                                        return aVar27;
                                    }
                                }
                                return Unit.f186387a;
                            case 161227521:
                                if (f55135b.equals("CRYPTO_INVESTMENTS_POPUP_MENU_ITEM_LIMIT_VARIANT_3_ID")) {
                                    st5.b bVar5 = st5.b.THREE;
                                    Object f55137g3 = popupMenuItem.getF();
                                    this.v = 5;
                                    if (o.f3(oVar, bVar5, f55137g3, this) == aVar27) {
                                        return aVar27;
                                    }
                                }
                                return Unit.f186387a;
                            case 161287103:
                                if (f55135b.equals("CRYPTO_INVESTMENTS_POPUP_MENU_ITEM_LIMIT_VARIANT_5_ID")) {
                                    st5.b bVar6 = st5.b.FIVE;
                                    Object f55137g4 = popupMenuItem.getF();
                                    this.v = 6;
                                    if (o.f3(oVar, bVar6, f55137g4, this) == aVar27) {
                                        return aVar27;
                                    }
                                }
                                return Unit.f186387a;
                            case 699860001:
                                if (f55135b.equals("CRYPTO_INVESTMENTS_POPUP_MENU_ITEM_LIMIT_VARIANT_10_ID")) {
                                    st5.b bVar7 = st5.b.TEN;
                                    Object f55137g5 = popupMenuItem.getF();
                                    this.v = 7;
                                    if (o.f3(oVar, bVar7, f55137g5, this) == aVar27) {
                                        return aVar27;
                                    }
                                }
                                return Unit.f186387a;
                            case 1586107456:
                                if (f55135b.equals("CRYPTO_INVESTMENTS_POPUP_MENU_ITEM_SORT_ID")) {
                                    Flow flowC = oVar.o.c();
                                    this.v = 1;
                                    objX = vkm.q.x(flowC, this);
                                    if (objX == aVar27) {
                                        return aVar27;
                                    }
                                    j60.a aVar28 = oVar.f168746m;
                                    oVar.f168747n.getClass();
                                    aVar28.i(gv5.e.a((CryptoInvestmentsSortingType) objX));
                                }
                                return Unit.f186387a;
                            case 1766673843:
                                if (f55135b.equals("CRYPTO_INVESTMENTS_POPUP_MENU_ITEM_LIMIT_VARIANT_UNLIMITED_ID")) {
                                    st5.b bVar8 = st5.b.NO_LIMIT;
                                    Object f55137g6 = popupMenuItem.getF();
                                    this.v = 2;
                                    if (o.f3(oVar, bVar8, f55137g6, this) == aVar27) {
                                        return aVar27;
                                    }
                                }
                                return Unit.f186387a;
                            default:
                                return Unit.f186387a;
                        }
                    case 1:
                        yhm.o.b(obj2);
                        objX = obj2;
                        j60.a aVar282 = oVar.f168746m;
                        oVar.f168747n.getClass();
                        aVar282.i(gv5.e.a((CryptoInvestmentsSortingType) objX));
                        return Unit.f186387a;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            case 22:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    iv7.i iVar = (iv7.i) this.f161947w;
                    f9i.c cVar4 = new f9i.c(new f9i.e((String) this.f161948x, false));
                    this.v = 1;
                    if (iVar.G1(cVar4, this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    ivh.c cVar5 = (ivh.c) this.f161947w;
                    boe.k kVar2 = new boe.k(9, null, (gim.i) this.f161948x);
                    this.v = 1;
                    if (cVar5.Y2(this, kVar2) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    iwj.a aVar32 = (iwj.a) this.f161948x;
                    ufm.c cVarB = ((z39.b) aVar32.f169171b).b();
                    this.f161947w = aVar32;
                    this.v = 1;
                    objB = nim.a.b(cVarB, this);
                    if (objB == aVar31) {
                        return aVar31;
                    }
                    aVar = aVar32;
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (iwj.a) this.f161947w;
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                Intrinsics.checkNotNullExpressionValue(objB, "await(...)");
                aVar.i = ((Boolean) objB).booleanValue();
                return Unit.f186387a;
            case 25:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    j2 j2Var2 = ((com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g) this.f161947w).f73854x;
                    h0 h0Var2 = (h0) this.f161948x;
                    this.v = 1;
                    j2Var2.getClass();
                    j2Var2.g(null, h0Var2);
                    if (Unit.f186387a == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    ApmOnboardingService apmOnboardingService = ((iz1.h) this.f161947w).f169829a;
                    String id10 = ((dx1.b) this.f161948x).getId();
                    this.v = 1;
                    objPostDeregister = apmOnboardingService.postDeregister(id10, this);
                    if (objPostDeregister == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objPostDeregister = obj2;
                }
                bz1.a aVar35 = (bz1.a) objPostDeregister;
                Intrinsics.checkNotNullParameter(aVar35, "<this>");
                String status = aVar35.getStatus();
                if (Intrinsics.f(status, "INACTIVATING")) {
                    return i02.a.f157278a;
                }
                if (Intrinsics.f(status, "NOT_REGISTERED")) {
                    return i02.b.f157279a;
                }
                throw new IllegalArgumentException(j6.a.q("Unknown APM user deregistration result: ", aVar35.getStatus()));
            case 27:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    ApmPaymentAuthorisationsAmendmentService apmPaymentAuthorisationsAmendmentService = ((iz1.j) this.f161947w).f169835a;
                    String strName = ((ApmPaymentAuthorisationPaymentMethod) this.f161948x).name();
                    this.v = 1;
                    pendingAmendments = apmPaymentAuthorisationsAmendmentService.getPendingAmendments(strName, this);
                    if (pendingAmendments == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    pendingAmendments = obj2;
                }
                dz1.o oVar2 = (dz1.o) pendingAmendments;
                Intrinsics.checkNotNullParameter(oVar2, "<this>");
                List recurringPaymentsAmendments = oVar2.getRecurringPaymentsAmendments();
                ArrayList arrayList5 = new ArrayList(zhm.w.t(recurringPaymentsAmendments, 10));
                Iterator it11 = recurringPaymentsAmendments.iterator();
                while (it11.hasNext()) {
                    arrayList5.add(cz1.b.a((dz1.a) it11.next()));
                }
                return arrayList5;
            case 28:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    ApmSettingsService apmSettingsService = ((iz1.m) this.f161947w).f169839a;
                    String str6 = (String) this.f161948x;
                    this.v = 1;
                    settings = apmSettingsService.getSettings(str6, this);
                    if (settings == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    settings = obj2;
                }
                return ue8.c.U((fz1.g) settings);
            default:
                t02.f fVar4 = (t02.f) this.f161948x;
                q qVar2 = (q) this.f161947w;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    ApmTransferService apmTransferService = qVar2.f169844a;
                    hz1.e eVarL = mif.a.L(fVar4);
                    wj0.b bVar9 = qVar2.e;
                    this.v = 1;
                    objPostInitiatePayment = apmTransferService.postInitiatePayment(eVarL, bVar9, this);
                    if (objPostInitiatePayment == aVar38) {
                        return aVar38;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objPostInitiatePayment = obj2;
                }
                hz1.g gVar9 = (hz1.g) ((Map) objPostInitiatePayment).get(fVar4.f266857b.getMethod());
                if (gVar9 != null) {
                    Intrinsics.checkNotNullParameter(gVar9, "<this>");
                    apmPaymentInfo = new ApmPaymentInfo(gVar9.getPaymentIntentId(), gVar9.getBeneficiaryId(), gVar9.getRecipientName());
                }
                if (apmPaymentInfo != null) {
                    return apmPaymentInfo;
                }
                throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f161947w = obj2;
        this.f161948x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f161948x = obj2;
    }
}
