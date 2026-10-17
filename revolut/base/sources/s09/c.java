package s09;

import android.os.Parcelable;
import cc7.l;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.manage_details.ManageCoBorrowerDetailsParcel;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.FinancialEvidenceFlowContract$Step;
import com.revolut.feature.hyper_text.model.HyperTextTarget;
import com.revolut.feature.retail.main_screen.container.models.action_payload.AppUpdateActionExtensionPayload;
import com.revolut.feature.retail.main_screen.container.models.action_payload.SeasonalThemeUpdateActionPayload;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData;
import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import com.revolut.feature.subscriptions.impl.payment_balance_picker.PaymentBalancePickerScreenContract$SelectedBalanceInfo;
import com.revolut.feature.tab.credit.api.TabCreditApi$Toggles$CreditHub;
import com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreenContract$Mode;
import com.revolut.retail.common.ui.R$string;
import et6.l0;
import ft3.h1;
import i6f.v;
import ip0.um0;
import java.net.URI;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kp0.w0;
import n8a.s;
import nii.c0;
import nii.y0;
import nii.z;
import rsl.p;
import s4f.x;
import s57.m;
import sa2.r;
import sa6.j0;
import sbb.t;
import sfe.n;
import skm.e0;
import skm.p0;
import vkm.j2;
import vkm.q;
import yhm.o;
import zh9.u0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f258900w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f258901x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f258900w = obj2;
        this.f258901x = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v17, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c((d) this.f258900w, (URI) this.f258901x, continuation, 0);
            case 1:
                return new c((com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.a) this.f258900w, (p) this.f258901x, continuation, 1);
            case 2:
                return new c((com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e) this.f258900w, (um0) this.f258901x, continuation, 2);
            case 3:
                c cVar = new c((s25.d) this.f258901x, continuation, 3);
                cVar.f258900w = obj2;
                return cVar;
            case 4:
                return new c((com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.a) this.f258900w, (f5j.a) this.f258901x, continuation, 4);
            case 5:
                return new c((s36.h) this.f258900w, (xi0.b) this.f258901x, continuation, 5);
            case 6:
                c cVar2 = new c((s38.h) this.f258901x, continuation, 6);
                cVar2.f258900w = obj2;
                return cVar2;
            case 7:
                return new c((s38.j) this.f258900w, (n) this.f258901x, continuation, 7);
            case 8:
                return new c((s38.n) this.f258900w, (Function1) this.f258901x, continuation);
            case 9:
                return new c((x) this.f258900w, (Set) this.f258901x, continuation, 9);
            case 10:
                return new c((Function1) this.f258900w, (s4i.h) this.f258901x, continuation);
            case 11:
                return new c((com.revolut.feature.credit.application.plugins.impl.ui.banner.a) this.f258900w, (rv3.b) this.f258901x, continuation, 11);
            case 12:
                return new c((com.revolut.feature.credit.application.plugins.impl.ui.banner.a) this.f258900w, (hs3.i) this.f258901x, continuation, 12);
            case 13:
                c cVar3 = new c((m) this.f258901x, continuation, 13);
                cVar3.f258900w = obj2;
                return cVar3;
            case 14:
                return new c((b1e.a) this.f258900w, (BackendFlow) this.f258901x, continuation, 14);
            case 15:
                return new c((s6b.m) this.f258900w, (HyperTextTarget) this.f258901x, continuation, 15);
            case 16:
                return new c((com.revolut.feature.shared.branding.impl.ui.settings.a) this.f258900w, (k6d.h) this.f258901x, continuation, 16);
            case 17:
                return new c((com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.a) this.f258900w, (v) this.f258901x, continuation, 17);
            case 18:
                return new c((com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.b) this.f258900w, (ty0.a) this.f258901x, continuation, 18);
            case 19:
                c cVar4 = new c((l) this.f258901x, continuation, 19);
                cVar4.f258900w = obj2;
                return cVar4;
            case 20:
                return new c((s85.k) this.f258900w, (koi.j) this.f258901x, continuation, 20);
            case 21:
                return new c((ryc.a) this.f258900w, (String) this.f258901x, continuation, 21);
            case 22:
                return new c((s8c.e) this.f258900w, (ShippingContact) this.f258901x, continuation, 22);
            case 23:
                return new c((r) this.f258900w, (String) this.f258901x, continuation, 23);
            case 24:
                return new c((j0) this.f258900w, (String) this.f258901x, continuation, 24);
            case 25:
                return new c((com.revolut.feature.subscriptions.impl.payment_balance_picker.b) this.f258900w, (PaymentBalancePickerScreenContract$SelectedBalanceInfo) this.f258901x, continuation, 25);
            case 26:
                return new c((com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e) this.f258900w, (FinancialEvidenceFlowContract$Step) this.f258901x, continuation, 26);
            case 27:
                return new c((sbb.m) this.f258900w, (MainScreenContainerActionData) this.f258901x, continuation, 27);
            case 28:
                c cVar5 = new c((c84.c) this.f258901x, continuation, 28);
                cVar5.f258900w = obj2;
                return cVar5;
            default:
                return new c((MainScreenContainerActionData) this.f258900w, (sbb.x) this.f258901x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((c) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((c) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((c) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v53, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r9v9, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objB;
        Object objH;
        Object value;
        s8c.b accountDetailsUpdateState;
        Object objV;
        Object objO;
        t tVar;
        int i = this.u;
        int i2 = 2;
        Continuation continuation = null;
        Object obj3 = this.f258901x;
        switch (i) {
            case 0:
                URI uri2 = (URI) obj3;
                d dVar = (d) this.f258900w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                try {
                    if (i3 == 0) {
                        o.b(obj2);
                        dVar.getClass();
                        String path = uri2.getPath();
                        List listN0 = path != null ? d0.n0(path, new String[]{"/"}, 0, 6) : null;
                        if (listN0 == null) {
                            listN0 = f0.f322471a;
                        }
                        if (Intrinsics.f(zhm.d0.e0(1, listN0), "learn") && Intrinsics.f(zhm.d0.e0(3, listN0), "glossary-terms") && zhm.d0.e0(4, listN0) != null) {
                            String path2 = uri2.getPath();
                            List listN02 = path2 != null ? d0.n0(path2, new String[]{"/"}, 0, 6) : null;
                            if (listN02 == null) {
                                listN02 = f0.f322471a;
                            }
                            String str = (String) listN02.get(4);
                            this.v = 1;
                            if (d.Z2(dVar, str, this) == aVar) {
                            }
                        } else {
                            wli.x xVar = dVar.f258902l;
                            String string = uri2.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            efm.d0 d0VarS1 = lg0.b.s1(xVar, string, lg0.a.OPEN_BROWSER, null, 4);
                            this.v = 2;
                            Object objB2 = nim.a.b(d0VarS1, this);
                            if (objB2 != aVar) {
                                return objB2;
                            }
                        }
                        return aVar;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return obj2;
                    }
                    o.b(obj2);
                    return Unit.f186387a;
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    return Unit.f186387a;
                }
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    j2 j2Var = ((com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.a) this.f258900w).f101854p;
                    Object objInvoke = ((p) obj3).invoke(j2Var.getValue());
                    this.v = 1;
                    j2Var.getClass();
                    j2Var.g(null, objInvoke);
                    if (Unit.f186387a == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e eVar = (com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e) this.f258900w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    TravelExperiencesCancellationScreenContract$Mode travelExperiencesCancellationScreenContract$Mode = ((s1g.g) eVar.t2()).f259135a;
                    if (!(travelExperiencesCancellationScreenContract$Mode instanceof TravelExperiencesCancellationScreenContract$Mode.BookingCancellation)) {
                        if (travelExperiencesCancellationScreenContract$Mode instanceof TravelExperiencesCancellationScreenContract$Mode.ExperiencePreview) {
                            throw new IllegalStateException("Cancellation action is not allowed in experience preview mode.");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    r25.a aVar4 = new r25.a(eVar, (um0) obj3, continuation, 20);
                    this.v = 1;
                    objB = pu7.a.B(eVar.k, "CANCEL_BOOKING_TASK", aVar4, this);
                    if (objB == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB = obj2;
                }
                return (Job) objB;
            case 3:
                FlowCollector flowCollector = (FlowCollector) this.f258900w;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((jte.d) ((s25.d) obj3).f259252a).c(TabCreditApi$Toggles$CreditHub.f89767c));
                    this.f258900w = null;
                    this.v = 1;
                    if (flowCollector.emit(boolValueOf, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.a aVar7 = (com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.a) this.f258900w;
                s2k.c cVar = new s2k.c(aVar7, (f5j.a) obj3, null);
                this.v = 1;
                Object objP2 = aVar7.p2(this, cVar);
                return objP2 == aVar6 ? aVar6 : objP2;
            case 5:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                m2j.j jVar = ((s36.h) this.f258900w).f259432b;
                s36.h.Companion.getClass();
                jhi.b bVarG = mo3.a.g(rd0.e.b(i1j.e.b(jVar, s36.h.e, (xi0.b) obj3, null, 4)), null, new s20.c(7), 1);
                this.v = 1;
                Object objX = q.x(bVarG, this);
                return objX == aVar8 ? aVar8 : objX;
            case 6:
                Object obj4 = this.f258900w;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    o.b(obj2);
                    oqk.k kVar = ((s38.h) obj3).f259459q;
                    this.f258900w = null;
                    this.v = 1;
                    if (kVar.b3(obj4, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                oqk.k kVar2 = ((s38.j) this.f258900w).f259467m;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    o.b(obj2);
                    ssi.k kVarC3 = kVar2.c3(((n) obj3).f262423b);
                    if (kVarC3 != null) {
                        this.v = 1;
                        if (kVar2.Z2(kVarC3, this) == aVar10) {
                            return aVar10;
                        }
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                s38.n nVar = (s38.n) this.f258900w;
                r25.a aVar12 = new r25.a(nVar, (Function1) obj3, (Continuation) null);
                this.v = 1;
                Object objB3 = pu7.a.B(nVar.e, "ELIGIBILITY_CHECK", aVar12, this);
                return objB3 == aVar11 ? aVar11 : objB3;
            case 9:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    o.b(obj2);
                    efm.b bVarQ = ((ael.k) ((x) this.f258900w).f259874t).q(zhm.d0.d1((Set) obj3));
                    this.v = 1;
                    if (nim.a.a(bVarQ, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                s4i.h hVar = (s4i.h) obj3;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                try {
                    if (i74 == 0) {
                        o.b(obj2);
                        ?? r2 = (gim.i) this.f258900w;
                        this.v = 1;
                        if (r2.invoke(this) == aVar14) {
                            return aVar14;
                        }
                    } else {
                        if (i74 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    hVar.f259891y--;
                    hVar.L2();
                    return Unit.f186387a;
                } catch (Throwable th10) {
                    hVar.f259891y--;
                    hVar.L2();
                    throw th10;
                }
            case 11:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.banner.a aVar16 = (com.revolut.feature.credit.application.plugins.impl.ui.banner.a) this.f258900w;
                s54.c cVar2 = new s54.c(aVar16, (rv3.b) obj3, (Continuation) null);
                this.v = 1;
                Object objB4 = pu7.a.B(aVar16.k, "handleAction", cVar2, this);
                return objB4 == aVar15 ? aVar15 : objB4;
            case 12:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.banner.a aVar18 = (com.revolut.feature.credit.application.plugins.impl.ui.banner.a) this.f258900w;
                    r25.a aVar19 = new r25.a(aVar18, (hs3.i) obj3, continuation, 25);
                    this.v = 1;
                    if (aVar18.p2(this, aVar19) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                FlowCollector flowCollector2 = (FlowCollector) this.f258900w;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    o.b(obj2);
                    gr6.e eVar2 = ((m) obj3).f260032b;
                    this.f258900w = flowCollector2;
                    this.v = 1;
                    objH = ((l0) eVar2).h(this);
                    if (objH == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i99 != 1) {
                        if (i99 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                    objH = obj2;
                }
                Boolean bool = (Boolean) objH;
                bool.booleanValue();
                this.f258900w = null;
                this.v = 2;
                if (flowCollector2.emit(bool, this) == aVar20) {
                    return aVar20;
                }
                return Unit.f186387a;
            case 14:
                b1e.a aVar21 = (b1e.a) this.f258900w;
                p54.e eVar3 = (p54.e) aVar21.f11797c;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                pw3.b bVar = (pw3.b) aVar21.f11796b;
                h1 h1VarF = w0.F((CreditApplicationPluginFlowContract$Configuration) eVar3.n0().get());
                String str2 = ((ManageCoBorrowerDetailsParcel) ((od0.i) eVar3.a().get()).c()).f67238a;
                this.v = 1;
                t24.f fVar = bVar.f240318a;
                fVar.getClass();
                sxe.g gVar = new sxe.g((Object) fVar, (Parcelable) obj3, (Object) h1VarF, str2, (Continuation) null, 2);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, gVar, this);
                return objJ == aVar22 ? aVar22 : objJ;
            case 15:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 != 0) {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                s6b.m mVar = (s6b.m) this.f258900w;
                s6b.l lVar = new s6b.l(mVar, (HyperTextTarget) obj3, null);
                this.v = 1;
                Object objP22 = mVar.p2(this, lVar);
                return objP22 == aVar23 ? aVar23 : objP22;
            case 16:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    o.b(obj2);
                    com.revolut.feature.shared.branding.impl.ui.settings.a aVar25 = (com.revolut.feature.shared.branding.impl.ui.settings.a) this.f258900w;
                    s6d.t tVar2 = new s6d.t(aVar25, (k6d.h) obj3, null);
                    this.v = 1;
                    if (aVar25.p2(this, tVar2) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 != 0) {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.a aVar27 = (com.revolut.feature.trading.managed_portfolios.impl.ui.details.flow.a) this.f258900w;
                s6f.f fVar2 = new s6f.f((v) obj3, aVar27, null);
                this.v = 1;
                Object objP23 = aVar27.p2(this, fVar2);
                return objP23 == aVar26 ? aVar26 : objP23;
            case 18:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.b bVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.constructor.b) this.f258900w;
                r25.a aVar29 = new r25.a(bVar2, (ty0.a) obj3, continuation, 26);
                this.v = 1;
                Object objB5 = pu7.a.B(bVar2.k, "handleDeeplink", aVar29, this);
                return objB5 == aVar28 ? aVar28 : objB5;
            case 19:
                Object obj5 = this.f258900w;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    o.b(obj2);
                    oqk.k kVar3 = (oqk.k) ((l) obj3).f22957n;
                    this.f258900w = null;
                    this.v = 1;
                    if (kVar3.b3(obj5, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 != 0) {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                s85.k kVar4 = (s85.k) this.f258900w;
                r25.a aVar32 = new r25.a(kVar4, (koi.j) obj3, continuation, 27);
                this.v = 1;
                Object objB6 = pu7.a.B(kVar4.k, "handleClick", aVar32, this);
                return objB6 == aVar31 ? aVar31 : objB6;
            case 21:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    o.b(obj2);
                    s sVar = (s) ((ryc.a) this.f258900w).f258289a;
                    this.v = 1;
                    sVar.getClass();
                    n8a.q qVar = new n8a.q(sVar, (String) obj3, continuation, i2);
                    p0 p0Var2 = p0.f264001a;
                    if (e0.J(elm.f.f127540b, qVar, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                s8c.e eVar4 = (s8c.e) this.f258900w;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (eVar4.f260969l.b((ShippingContact) obj3, this) == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                j2 j2Var2 = eVar4.f260970m;
                do {
                    value = j2Var2.getValue();
                    ((s8c.d) value).getClass();
                    accountDetailsUpdateState = s8c.b.f260967a;
                    Intrinsics.checkNotNullParameter(accountDetailsUpdateState, "accountDetailsUpdateState");
                } while (!j2Var2.h(value, new s8c.d(accountDetailsUpdateState)));
                return Unit.f186387a;
            case 23:
                r rVar = (r) this.f258900w;
                y yVar = rVar.f261286r;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    o.b(obj2);
                    rVar.X1(new y0(null, new c0(null, null, null, false, null, false, false, null, 2047), false, 5));
                    Alias alias = ((sa2.d) ((j2) yVar.f22677a).getValue()).f261268a;
                    this.v = 1;
                    objV = rVar.f261285q.v(alias, (String) obj3, this);
                    if (objV == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i109 != 1) {
                        if (i109 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                    objV = obj2;
                }
                rVar.s1();
                if (nz8.d.l((zz1.e) objV)) {
                    this.v = 2;
                    if (r.I2(rVar, this) == aVar35) {
                        return aVar35;
                    }
                } else {
                    rVar.H2(yVar, new s8h.h(14));
                    rVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5));
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 != 0) {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.v = 1;
                Object objA = j0.a((j0) this.f258900w, (String) obj3, this);
                return objA == aVar36 ? aVar36 : objA;
            case 25:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    o.b(obj2);
                    com.revolut.feature.subscriptions.impl.payment_balance_picker.b bVar3 = (com.revolut.feature.subscriptions.impl.payment_balance_picker.b) this.f258900w;
                    r25.a aVar38 = new r25.a(bVar3, (PaymentBalancePickerScreenContract$SelectedBalanceInfo) obj3, continuation, 29);
                    this.v = 1;
                    if (u0.b0(bVar3.X(), "PAYMENT_BALANCE_PICKER_BUTTON_TAG", aVar38, this) == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e eVar5 = (com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e) this.f258900w;
                    com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.c cVar3 = new com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.c(eVar5, (FinancialEvidenceFlowContract$Step) obj3, null);
                    this.v = 1;
                    if (eVar5.p2(this, cVar3) == aVar39) {
                        return aVar39;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    o.b(obj2);
                    cq.g gVar2 = ((sbb.m) this.f258900w).f261553l;
                    Parcelable parcelable = ((MainScreenContainerActionData) obj3).f83422b;
                    if (parcelable == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    zp.a type = ((AppUpdateActionExtensionPayload) parcelable).f82754a;
                    gVar2.getClass();
                    Intrinsics.checkNotNullParameter(type, "type");
                    pfm.h hVar2 = new pfm.h(new abf.c(gVar2, type, 17), 0);
                    Intrinsics.checkNotNullExpressionValue(hVar2, "create(...)");
                    this.v = 1;
                    if (nim.a.a(hVar2, this) == aVar40) {
                        return aVar40;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                String str3 = (String) this.f258900w;
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    o.b(obj2);
                    if (str3 != null) {
                        efm.d0 d0VarS12 = lg0.b.s1((wli.x) ((c84.c) obj3).f22078n, str3, null, null, 6);
                        this.f258900w = null;
                        this.v = 1;
                        if (nim.a.b(d0VarS12, this) == aVar41) {
                            return aVar41;
                        }
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar42 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    o.b(obj2);
                    int i116 = sbb.v.f261560a[sbb.x.f261563m.ordinal()];
                    if (i116 != 1) {
                        if (i116 == 2) {
                            tVar = sbb.x.f261563m;
                        } else {
                            if (i116 != 3 && i116 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            tVar = t.Default;
                        }
                        sbb.x.f261563m = tVar;
                        return Unit.f186387a;
                    }
                    Parcelable parcelable2 = ((MainScreenContainerActionData) this.f258900w).f83422b;
                    if (parcelable2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    String str4 = ((SeasonalThemeUpdateActionPayload) parcelable2).f82759a;
                    ekg.g gVar3 = ((sbb.x) obj3).f261564l;
                    this.v = 1;
                    objO = gVar3.o(str4, this);
                    if (objO == aVar42) {
                        return aVar42;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objO = obj2;
                }
                tVar = ((Boolean) objO).booleanValue() ? t.ThemeUpdateScheduled : t.Default;
                sbb.x.f261563m = tVar;
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f258901x = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Function1 function1, s4i.h hVar, Continuation continuation) {
        super(2, continuation);
        this.u = 10;
        this.f258900w = (gim.i) function1;
        this.f258901x = hVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(s38.n nVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 8;
        this.f258900w = nVar;
        this.f258901x = (gim.i) function1;
    }
}
