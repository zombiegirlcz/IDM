package ald;

import amh.x;
import android.nfc.Tag;
import androidx.room.util.DBUtil;
import ara.s;
import atg.v;
import au6.c3;
import au6.e0;
import au6.m3;
import au6.r3;
import au6.s1;
import au6.y1;
import au6.y3;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrder$Id;
import com.revolut.feature.freelancer.common.models.vat_reminders.FreelancerVatReminder;
import com.revolut.feature.freelancer.impl.network.services.AcquiringOrdersService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerBrandingService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerProTrackService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerTaxPocketsService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerTaxProfileService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerVatReminderService;
import com.revolut.feature.pricingplans.models.documents.PricingPlanDocument;
import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerInfoState;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.SetBudgetsFlowContract$InputData;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.models.CategoryBudgetEditingInfo;
import efm.d0;
import java.io.File;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import le.u1;
import okhttp3.MultipartBody$Part;
import okhttp3.RequestBody;
import retrofit2.HttpException;
import retrofit2.Response;
import rp0.y;
import skm.p0;
import ulm.a1;
import ulm.b1;
import ulm.e1;
import ulm.k1;
import ulm.p1;
import vkm.j2;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f6233w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f6234x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f6233w = obj2;
        this.f6234x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l((r) this.f6234x, continuation, 0);
                lVar.f6233w = obj2;
                return lVar;
            case 1:
                l lVar2 = new l((x) this.f6234x, continuation, 1);
                lVar2.f6233w = obj2;
                return lVar2;
            case 2:
                return new l((amk.h) this.f6233w, (PricingPlanDocument) this.f6234x, continuation, 2);
            case 3:
                return new l((aok.c) this.f6233w, (aok.h) this.f6234x, continuation, 3);
            case 4:
                return new l((com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.a) this.f6233w, (y) this.f6234x, continuation, 4);
            case 5:
                return new l((com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a) this.f6233w, (Tag) this.f6234x, continuation, 5);
            case 6:
                return new l((arb.g) this.f6233w, (String) this.f6234x, continuation, 6);
            case 7:
                return new l((are.b) this.f6233w, (String) this.f6234x, continuation, 7);
            case 8:
                return new l((arf.l) this.f6233w, (kse.a) this.f6234x, continuation, 8);
            case 9:
                return new l((com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b) this.f6233w, (CategoryBudgetEditingInfo) this.f6234x, continuation, 9);
            case 10:
                return new l((com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b) this.f6233w, (asj.c) this.f6234x, continuation, 10);
            case 11:
                return new l((at1.j) this.f6233w, (yo7.p) this.f6234x, continuation, 11);
            case 12:
                l lVar3 = new l((ate.e) this.f6234x, continuation, 12);
                lVar3.f6233w = obj2;
                return lVar3;
            case 13:
                return new l((v) this.f6233w, (fo3.g) this.f6234x, continuation, 13);
            case 14:
                return new l((au6.f) this.f6234x, continuation, 14);
            case 15:
                return new l((au6.v) this.f6233w, (String) this.f6234x, continuation, 15);
            case 16:
                l lVar4 = new l((au6.v) this.f6234x, continuation, 16);
                lVar4.f6233w = obj2;
                return lVar4;
            case 17:
                return new l((e0) this.f6233w, (String) this.f6234x, continuation, 17);
            case 18:
                return new l((e0) this.f6233w, (k6d.i) this.f6234x, continuation, 18);
            case 19:
                return new l((e0) this.f6233w, (File) this.f6234x, continuation, 19);
            case 20:
                return new l((s1) this.f6233w, (tt6.a) this.f6234x, continuation, 20);
            case 21:
                return new l((y1) this.f6233w, (bs6.a) this.f6234x, continuation, 21);
            case 22:
                return new l((c3) this.f6233w, (String) this.f6234x, continuation, 22);
            case 23:
                return new l((m3) this.f6234x, continuation, 23);
            case 24:
                return new l((m3) this.f6233w, (es6.g) this.f6234x, continuation, 24);
            case 25:
                return new l((r3) this.f6233w, (ds6.c) this.f6234x, continuation, 25);
            case 26:
                return new l((y3) this.f6233w, (fs6.c) this.f6234x, continuation, 26);
            case 27:
                return new l((y3) this.f6233w, (String) this.f6234x, continuation, 27);
            case 28:
                return new l((auj.n) this.f6233w, (ArrayList) this.f6234x, continuation, 28);
            default:
                return new l((auj.n) this.f6233w, (String) this.f6234x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objM;
        Object objCloseTeenAccount;
        Object objB;
        Object objA;
        Object imageData;
        Object objUpdateBrandingSettings;
        Object objUploadImage;
        Object objAuthorise;
        Object objCompleteTaxCalendarEvent;
        Object taxPockets;
        Object objUpdateTaxPocket;
        Object objCreateTaxProfile;
        Object objCreateVatReminder;
        Object vatReminder;
        Object obj3;
        int i = this.u;
        int i2 = 0;
        boolean z = false;
        boolean z3 = false;
        boolean z4 = false;
        Object obj4 = this.f6234x;
        switch (i) {
            case 0:
                SlotContext slotContext = (SlotContext) this.f6233w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    x4l.c cVar = ((r) obj4).i;
                    this.f6233w = null;
                    this.v = 1;
                    if (cVar.e(slotContext, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                FlowCollector flowCollector = (FlowCollector) this.f6233w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    ylh.a aVar3 = ((amh.h) ((j2) ((x) obj4).f6432x.f22677a).getValue()).f6402c;
                    if (aVar3 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    this.f6233w = null;
                    this.v = 1;
                    if (flowCollector.emit(aVar3, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                amk.h hVar = (amk.h) this.f6233w;
                a2j.c cVar2 = new a2j.c(hVar, (PricingPlanDocument) obj4, z ? 1 : 0, 22);
                this.v = 1;
                Object objP2 = hVar.p2(this, cVar2);
                return objP2 == aVar4 ? aVar4 : objP2;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                wli.x xVar = ((aok.c) this.f6233w).f8005n;
                String str = ((aok.i) ((aok.h) obj4)).f8011a;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, str, null, null, this, 6);
                return objX1 == aVar5 ? aVar5 : objX1;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    efm.b bVarG = ((com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.a) this.f6233w).f83395q.G((y) obj4);
                    this.v = 1;
                    if (nim.a.a(bVarG, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a aVar7 = (com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a) this.f6233w;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objM = aVar7.f81581r.m((Tag) obj4, this);
                    if (objM == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objM = obj2;
                }
                String str2 = (String) objM;
                if (str2 == null) {
                    return Unit.f186387a;
                }
                aVar7.H2(aVar7.f81586y, new s(CardOwnerInfoState.a(aVar7.I2(), false, str2, null, null, fqa.a.NFC, 13), 1));
                return Unit.f186387a;
            case 6:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (arb.g.a((arb.g) this.f6233w, (String) obj4, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objCloseTeenAccount = ((are.b) this.f6233w).f8690a.closeTeenAccount((String) obj4, this);
                    if (objCloseTeenAccount == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objCloseTeenAccount = obj2;
                }
                return new tqe.b(((zqe.c) objCloseTeenAccount).f324469a);
            case 8:
                kse.a aVar11 = (kse.a) obj4;
                arf.l lVar = (arf.l) this.f6233w;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    lVar.s1();
                    lVar.f8704q.getClass();
                    d0 d0VarS1 = lg0.b.s1(lVar.f8707t, opf.l.a(aVar11), null, null, 6);
                    this.v = 1;
                    objB = nim.a.b(d0VarS1, this);
                    if (objB == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                if (!((Boolean) objB).booleanValue()) {
                    IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Troubleshooter Recall Transfer ticket navigation for ", aVar11.f189436a));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
            case 9:
                com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b bVar = (com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b) this.f6233w;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 != 0) {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                CategoryBudgetEditingInfo categoryBudgetEditingInfo = (CategoryBudgetEditingInfo) obj4;
                ufm.i iVarA = ((grj.i) bVar.u).a(bVar.f101543t.getF101537b(), categoryBudgetEditingInfo.f101549c, v13.d.t(categoryBudgetEditingInfo.f101547a));
                this.v = 1;
                Object objB2 = nim.a.b(iVarA, this);
                return objB2 == aVar13 ? aVar13 : objB2;
            case 10:
                com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b bVar2 = (com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b) this.f6233w;
                SetBudgetsFlowContract$InputData setBudgetsFlowContract$InputData = bVar2.f101543t;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    tzi.a aVar15 = bVar2.f101544w;
                    uzi.b budgetingCycle = ((asj.a) ((asj.c) obj4)).f8934a;
                    String strQ2 = com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b.Q2(setBudgetsFlowContract$InputData);
                    isj.c cVar3 = (isj.c) aVar15;
                    cVar3.getClass();
                    Intrinsics.checkNotNullParameter(budgetingCycle, "budgetingCycle");
                    pfm.a aVar16 = new pfm.a(cVar3.b(strQ2), new ir9.a(new a26.s(cVar3, budgetingCycle, 19), 20), 4);
                    Intrinsics.checkNotNullExpressionValue(aVar16, "flatMapCompletable(...)");
                    this.v = 1;
                    if (nim.a.a(aVar16, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i74 != 1) {
                        if (i74 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                pfm.h hVarE = ((grj.i) bVar2.u).e(setBudgetsFlowContract$InputData.getF101537b(), true);
                this.v = 2;
                if (nim.a.a(hVarE, this) == aVar14) {
                    return aVar14;
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (at1.j.Z2((at1.j) this.f6233w, false, "BIZUM_REG_CONFIRMATION_CTA_BUTTON_TAG", (yo7.p) obj4, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                ate.e eVar = (ate.e) obj4;
                FlowCollector flowCollector2 = (FlowCollector) this.f6233w;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    yse.e eVar2 = eVar.f9038b;
                    v0b.b bVarH = ta6.a.h(eVar2.e, eVar2.a(), eVar.f9038b.d, new ate.b(eVar, z3 ? 1 : 0, i2));
                    this.f6233w = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, bVarH, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    atg.i iVar = ((v) this.f6233w).e;
                    this.v = 1;
                    if (((atg.h) iVar).a((fo3.g) obj4, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                au6.f fVar = (au6.f) obj4;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objA = au6.f.a(fVar, this);
                    if (objA == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i100 != 1) {
                        if (i100 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj5 = this.f6233w;
                        yhm.o.b(obj2);
                        return obj5;
                    }
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                x4l.c cVar4 = fVar.f;
                Unit unit = Unit.f186387a;
                this.f6233w = objA;
                this.v = 2;
                return cVar4.f(unit, (FreelancerAccountOnboardingState) objA, this) == aVar20 ? aVar20 : objA;
            case 15:
                String str3 = (String) obj4;
                au6.v vVar = (au6.v) this.f6233w;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    AcquiringOrdersService acquiringOrdersService = vVar.f9634a;
                    this.v = 1;
                    if (acquiringOrdersService.cancelOrder(str3, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i101 != 1) {
                        if (i101 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                x4l.c cVar5 = vVar.f9640l;
                AcquiringOrder$Id acquiringOrder$Id = new AcquiringOrder$Id(str3);
                this.v = 2;
                if (cVar5.d(acquiringOrder$Id, true, this) == aVar21) {
                    return aVar21;
                }
                return Unit.f186387a;
            case 16:
                FlowCollector flowCollector3 = (FlowCollector) this.f6233w;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    skm.r rVar = ((au6.v) obj4).i;
                    this.f6233w = flowCollector3;
                    this.v = 1;
                    if (rVar.y(this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i102 != 1) {
                        if (i102 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                Boolean bool = Boolean.TRUE;
                this.f6233w = null;
                this.v = 2;
                if (flowCollector3.emit(bool, this) == aVar22) {
                    return aVar22;
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    imageData = ((e0) this.f6233w).f9517a.getImageData((String) obj4, this);
                    if (imageData == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    imageData = obj2;
                }
                return ft6.f.a((nt6.a) imageData);
            case 18:
                k6d.i iVar2 = (k6d.i) obj4;
                String str4 = iVar2.i;
                String str5 = iVar2.f181694h;
                k6d.b bVar3 = iVar2.f181692c;
                String str6 = iVar2.f181691b;
                k6d.a aVar24 = iVar2.f181690a;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    FreelancerBrandingService freelancerBrandingService = ((e0) this.f6233w).f9517a;
                    Object obj6 = ft6.f.f137943a;
                    Intrinsics.checkNotNullParameter(iVar2, "<this>");
                    nt6.c cVar6 = new nt6.c(aVar24.name(), str6, bVar3.name(), iVar2.e, iVar2.f181693g, str5, str4);
                    this.v = 1;
                    objUpdateBrandingSettings = freelancerBrandingService.updateBrandingSettings(cVar6, this);
                    if (objUpdateBrandingSettings == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objUpdateBrandingSettings = obj2;
                }
                if (((Response) objUpdateBrandingSettings).code() == 204) {
                    return Unit.f186387a;
                }
                boolean z6 = iVar2.d;
                boolean z11 = iVar2.e;
                boolean z12 = iVar2.f;
                boolean z29 = iVar2.f181693g;
                StringBuilder sb6 = new StringBuilder("Error while update branding settings appearanceMode=");
                sb6.append(aVar24);
                sb6.append(", color=");
                sb6.append(str6);
                sb6.append(", font=");
                sb6.append(bVar3);
                sb6.append(", showFullAddress=");
                sb6.append(z6);
                sb6.append(", showWebsite=");
                t61.a.y(sb6, z11, ", showPhoneNumber=", z12, ", showEmail=");
                sb6.append(z29);
                sb6.append(", backgroundImageId=");
                sb6.append(str5);
                sb6.append(", logoImageId=");
                sb6.append(str4);
                throw new IllegalStateException(sb6.toString().toString());
            case 19:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    FreelancerBrandingService freelancerBrandingService2 = ((e0) this.f6233w).f9517a;
                    e1 e1Var = MultipartBody$Part.Companion;
                    p1 p1Var = RequestBody.Companion;
                    b1.Companion.getClass();
                    b1 b1VarB = a1.b("image/jpeg");
                    p1Var.getClass();
                    k1 k1VarA = p1.a((File) obj4, b1VarB);
                    e1Var.getClass();
                    List<MultipartBody$Part> listC = u.c(e1.c("file", "", k1VarA));
                    this.v = 1;
                    objUploadImage = freelancerBrandingService2.uploadImage(listC, this);
                    if (objUploadImage == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objUploadImage = obj2;
                }
                return ((nt6.d) objUploadImage).getId();
            case 20:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objAuthorise = ((s1) this.f6233w).f9617a.authorise((tt6.a) obj4, this);
                    if (objAuthorise == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objAuthorise = obj2;
                }
                return new yr6.a(((tt6.b) objAuthorise).getRedirectUri());
            case 21:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    FreelancerProTrackService freelancerProTrackService = ((y1) this.f6233w).f9664a;
                    com.revolut.feature.freelancer.impl.network.models.x xVar2 = new com.revolut.feature.freelancer.impl.network.models.x(((bs6.a) obj4).name());
                    this.v = 1;
                    if (freelancerProTrackService.completeProTrack(xVar2, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objCompleteTaxCalendarEvent = ((c3) this.f6233w).f9507c.completeTaxCalendarEvent((String) obj4, this);
                    if (objCompleteTaxCalendarEvent == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objCompleteTaxCalendarEvent = obj2;
                }
                hx7.e.g((Response) objCompleteTaxCalendarEvent);
                return Unit.f186387a;
            case 23:
                m3 m3Var = (m3) obj4;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    FreelancerTaxPocketsService freelancerTaxPocketsService = m3Var.f9573a;
                    this.v = 1;
                    taxPockets = freelancerTaxPocketsService.getTaxPockets(this);
                    if (taxPockets == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i109 != 1) {
                        if (i109 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ArrayList arrayList = (ArrayList) this.f6233w;
                        yhm.o.b(obj2);
                        return arrayList;
                    }
                    yhm.o.b(obj2);
                    taxPockets = obj2;
                }
                Iterable iterable = (Iterable) taxPockets;
                ArrayList arrayList2 = new ArrayList(w.t(iterable, 10));
                Iterator it8 = iterable.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(bu6.g.a((xt6.a) it8.next()));
                }
                x4l.c cVar7 = m3Var.d;
                Unit unit2 = Unit.f186387a;
                this.f6233w = arrayList2;
                this.v = 2;
                return cVar7.f(unit2, arrayList2, this) == aVar30 ? aVar30 : arrayList2;
            case 24:
                m3 m3Var2 = (m3) this.f6233w;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    FreelancerTaxPocketsService freelancerTaxPocketsService2 = m3Var2.f9573a;
                    es6.g gVar = (es6.g) obj4;
                    String str7 = gVar.f128873a;
                    Object obj7 = bu6.g.f18689a;
                    Intrinsics.checkNotNullParameter(gVar, "<this>");
                    xt6.d dVar = new xt6.d(u1.h(gVar.f128874b, bu6.g.f18690b), gVar.f128875c);
                    this.v = 1;
                    objUpdateTaxPocket = freelancerTaxPocketsService2.updateTaxPocket(str7, dVar, this);
                    if (objUpdateTaxPocket == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i110 != 1) {
                        if (i110 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objUpdateTaxPocket = obj2;
                }
                Response response = (Response) objUpdateTaxPocket;
                if (!response.isSuccessful()) {
                    throw new HttpException(response);
                }
                x4l.c cVar8 = m3Var2.d;
                Unit unit3 = Unit.f186387a;
                this.v = 2;
                if (cVar8.d(unit3, true, this) == aVar31) {
                    return aVar31;
                }
                return Unit.f186387a;
            case 25:
                r3 r3Var = (r3) this.f6233w;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    FreelancerTaxProfileService freelancerTaxProfileService = r3Var.f9613b;
                    ds6.c cVar9 = (ds6.c) obj4;
                    Intrinsics.checkNotNullParameter(cVar9, "<this>");
                    wt6.f fVar2 = new wt6.f(cVar9.f117228a.name(), bu6.f.i(cVar9.f117229b));
                    this.v = 1;
                    objCreateTaxProfile = freelancerTaxProfileService.createTaxProfile(fVar2, this);
                    if (objCreateTaxProfile == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i111 != 1) {
                        if (i111 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objCreateTaxProfile = obj2;
                }
                String id10 = ((wt6.h) objCreateTaxProfile).getId();
                this.v = 2;
                Object objD = r3Var.f.d(id10, true, this);
                if (objD != aVar32) {
                    objD = Unit.f186387a;
                }
                if (objD == aVar32) {
                    return aVar32;
                }
                return Unit.f186387a;
            case 26:
                y3 y3Var = (y3) this.f6233w;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    FreelancerVatReminderService freelancerVatReminderService = y3Var.f9667a;
                    fs6.c cVar10 = (fs6.c) obj4;
                    Intrinsics.checkNotNullParameter(cVar10, "<this>");
                    String strName = cVar10.f137599a.name();
                    Month month = cVar10.f137600b;
                    yt6.a aVar34 = new yt6.a(strName, month != null ? Integer.valueOf(month.getValue()) : null);
                    this.v = 1;
                    objCreateVatReminder = freelancerVatReminderService.createVatReminder(aVar34, this);
                    if (objCreateVatReminder != aVar33) {
                    }
                    return aVar33;
                }
                if (i112 != 1) {
                    if (i112 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                objCreateVatReminder = obj2;
                String id11 = ((yt6.d) objCreateVatReminder).getId();
                this.v = 2;
                Object objA2 = y3.a(y3Var, id11, this);
                if (objA2 != aVar33) {
                    return objA2;
                }
                return aVar33;
            case 27:
                y3 y3Var2 = (y3) this.f6233w;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    vatReminder = y3Var2.f9667a.getVatReminder((String) obj4, this);
                    obj3 = aVar35;
                    if (vatReminder != aVar35) {
                    }
                    return obj3;
                }
                if (i113 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                vatReminder = obj2;
                FreelancerVatReminder freelancerVatReminderC = bu6.h.c((yt6.b) vatReminder);
                os6.e eVar3 = y3Var2.d;
                ps6.j jVarD = bu6.h.d(freelancerVatReminderC);
                eVar3.getClass();
                ((Long) DBUtil.performBlocking(eVar3.f229249a, false, true, new ood.k(eVar3, jVarD, 26))).getClass();
                x4l.c cVar11 = y3Var2.f;
                Unit unit4 = Unit.f186387a;
                List list = (List) DBUtil.performBlocking(y3Var2.d.f229249a, true, false, new or4.h(24));
                ArrayList arrayList3 = new ArrayList(w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(bu6.h.b((ps6.j) it9.next()));
                }
                cVar11.g(unit4, arrayList3);
                obj3 = freelancerVatReminderC;
                return obj3;
            case 28:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 != 0) {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                stj.h hVar2 = ((auj.n) this.f6233w).f9853q;
                this.v = 1;
                mtj.q qVar = (mtj.q) hVar2.f265610a;
                qVar.getClass();
                mpd.p pVar = new mpd.p((ArrayList) obj4, qVar, z4 ? 1 : 0, 7);
                p0 p0Var = p0.f264001a;
                Object objJ = skm.e0.J(elm.f.f127540b, pVar, this);
                return objJ == aVar36 ? aVar36 : objJ;
            default:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((auj.n) this.f6233w).f9853q.b((String) obj4, null, this) == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f6234x = obj2;
    }
}
