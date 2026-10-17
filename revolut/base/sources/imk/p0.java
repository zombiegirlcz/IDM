package imk;

import ahe.w0;
import com.revolut.data.model.Data;
import com.revolut.feature.add.new_product.api.declaration.AddNewProductDestination;
import com.revolut.feature.apm.core.impl.data.network.consent.ApmConsentsService;
import com.revolut.feature.apm.core.impl.data.network.transfer.ApmTransferService;
import com.revolut.feature.apm.core.models.recipients.QvikContact;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentDraft;
import com.revolut.feature.feedback.api.domain.TagsFeedback;
import com.revolut.feature_travel_hotels_models.location.Coordinates;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import et6.h1;
import fxf.d;
import hz1.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import rl0.b;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class p0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f162540w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f162540w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p0((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g) this.f162540w, continuation, 0);
            case 1:
                return new p0((in1.s) this.f162540w, continuation, 1);
            case 2:
                return new p0((com.revolut.feature.credit.card.impl.ui.direct_debit.b) this.f162540w, continuation, 2);
            case 3:
                return new p0((com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b) this.f162540w, continuation, 3);
            case 4:
                return new p0((com.revolut.feature.sca_prompt.impl.flow.b) this.f162540w, continuation, 4);
            case 5:
                return new p0((isl.m) this.f162540w, continuation, 5);
            case 6:
                return new p0((itg.b) this.f162540w, continuation, 6);
            case 7:
                return new p0((com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.a) this.f162540w, continuation, 7);
            case 8:
                return new p0((com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g) this.f162540w, continuation, 8);
            case 9:
                return new p0((iz1.b) this.f162540w, continuation, 9);
            case 10:
                return new p0((iz1.n) this.f162540w, continuation, 10);
            case 11:
                return new p0((com.revolut.feature_crypto_picker.impl.ui.picker.a) this.f162540w, continuation, 11);
            case 12:
                return new p0((com.revolut.feature.travel.experiences.impl.ui.flow.home.b) this.f162540w, continuation, 12);
            case 13:
                return new p0((j1k.f) this.f162540w, continuation, 13);
            case 14:
                return new p0((j2g.y) this.f162540w, continuation, 14);
            case 15:
                return new p0((j50.o) this.f162540w, continuation, 15);
            case 16:
                return new p0((com.revolut.feature.card_personalisation.generation.impl.ui.generation.a) this.f162540w, continuation, 16);
            case 17:
                return new p0((com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d) this.f162540w, continuation, 17);
            case 18:
                return new p0((com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.a) this.f162540w, continuation, 18);
            case 19:
                return new p0((j8k.d) this.f162540w, continuation, 19);
            case 20:
                return new p0((com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.a) this.f162540w, continuation, 20);
            case 21:
                return new p0((com.revolut.feature.apm.payid.impl.flow.a) this.f162540w, continuation, 21);
            case 22:
                return new p0((com.revolut.feature.onboarding.impl.onboarding.biometric.d) this.f162540w, continuation, 22);
            case 23:
                return new p0((jc7.e) this.f162540w, continuation, 23);
            case 24:
                return new p0((com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.summary.a) this.f162540w, continuation, 24);
            case 25:
                return new p0((com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.c) this.f162540w, continuation, 25);
            case 26:
                return new p0((com.revolut.feature.apm.swish.impl.ui.a) this.f162540w, continuation, 26);
            case 27:
                return new p0((jh9.p) this.f162540w, continuation, 27);
            case 28:
                return new p0((jhe.t) this.f162540w, continuation, 28);
            default:
                return new p0((ahe.t) this.f162540w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((p0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v29, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        efm.h0 h0VarM;
        iy1.h hVarI;
        Coordinates coordinates;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    rul.e eVar = ((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g) this.f162540w).z;
                    this.v = 1;
                    if (eVar.i(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    in1.s sVar = (in1.s) this.f162540w;
                    in1.p pVar = new in1.p(sVar, null);
                    this.v = 1;
                    if (sVar.p2(this, pVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.direct_debit.b bVar = (com.revolut.feature.credit.card.impl.ui.direct_debit.b) this.f162540w;
                ir4.d dVar = new ir4.d(bVar, null, 1);
                this.v = 1;
                Object objB = pu7.a.B(bVar.k, "Confirm autopay", dVar, this);
                return objB == aVar3 ? aVar3 : objB;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b bVar2 = (com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b) this.f162540w;
                com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.a aVar5 = new com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.a(bVar2, null);
                this.v = 1;
                Object objP2 = bVar2.p2(this, aVar5);
                return objP2 == aVar4 ? aVar4 : objP2;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.sca_prompt.impl.flow.b bVar3 = (com.revolut.feature.sca_prompt.impl.flow.b) this.f162540w;
                    gca.l lVar = new gca.l(bVar3, null, 29);
                    this.v = 1;
                    if (bVar3.p2(this, lVar) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                isl.m mVar = (isl.m) this.f162540w;
                isl.k kVar = new isl.k(mVar, null, 1);
                this.v = 1;
                Object objB2 = pu7.a.B(mVar.e, "show_price_details_dialog", kVar, this);
                return objB2 == aVar7 ? aVar7 : objB2;
            case 6:
                itg.b bVar4 = (itg.b) this.f162540w;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    mp.p pVar2 = bVar4.f168380l;
                    pVar2.getClass();
                    if (od0.a.e() || od0.a.i()) {
                        h0VarM = efm.d0.m(etg.a.NOTHING);
                        Intrinsics.checkNotNullExpressionValue(h0VarM, "just(...)");
                    } else {
                        mm0.o oVarD = ((cn0.g) ((zm0.c) pVar2.d)).d();
                        if (oVarD instanceof mm0.n) {
                            rl0.b bVar5 = ((mm0.n) oVarD).f207116c;
                            if (bVar5 instanceof rl0.a) {
                                h0VarM = new ufm.i(new ufm.i(((ang.f) pVar2.f207709b).f(false), new hp5.b(new hm3.b(pVar2, ((rl0.a) bVar5).f254906a, 26), 23), 1), new hp5.b(new hqk.a(19), 24), 1);
                                Intrinsics.checkNotNullExpressionValue(h0VarM, "map(...)");
                            } else {
                                if (!(bVar5 instanceof b.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h0VarM = efm.d0.m(etg.a.NOTHING);
                                Intrinsics.checkNotNullExpressionValue(h0VarM, "just(...)");
                            }
                        } else {
                            h0VarM = efm.d0.m(etg.a.NOTHING);
                            Intrinsics.checkNotNullExpressionValue(h0VarM, "just(...)");
                        }
                    }
                    this.v = 1;
                    obj2 = nim.a.b(h0VarM, this);
                    if (obj2 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                etg.a aVar9 = (etg.a) obj2;
                boolean z = bVar4.f168382n;
                if (!z && aVar9 == etg.a.SHOW_PROMPT) {
                    bVar4.Z2();
                } else if (z) {
                    bVar4.f168382n = false;
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    y08.a aVar11 = ((com.revolut.retail.feature.stockdetails.impl.ui.screens.feed.a) this.f162540w).o;
                    this.v = 1;
                    if (aVar11.Z2(false, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    h1 h1Var = ((com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g) this.f162540w).f73848p;
                    this.v = 1;
                    if (h1Var.d(this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                Object arrayList = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    ApmConsentsService apmConsentsService = ((iz1.b) this.f162540w).f169821a;
                    this.v = 1;
                    obj2 = apmConsentsService.getConsents(this);
                    if (obj2 != arrayList) {
                    }
                    return arrayList;
                }
                if (i43 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                Iterable iterable = (Iterable) obj2;
                arrayList = new ArrayList(zhm.w.t(iterable, 10));
                Iterator it8 = iterable.iterator();
                while (it8.hasNext()) {
                    arrayList.add(io3.h.C((yy1.a) it8.next()));
                }
                return arrayList;
            case 10:
                Object arrayList2 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    ApmTransferService apmTransferService = ((iz1.n) this.f162540w).f169840a;
                    this.v = 1;
                    obj2 = apmTransferService.getDrafts("GIRO_QVIK", this);
                    if (obj2 != arrayList2) {
                    }
                    return arrayList2;
                }
                if (i59 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                Iterable<hz1.d> iterable2 = (Iterable) obj2;
                arrayList2 = new ArrayList(zhm.w.t(iterable2, 10));
                for (hz1.d dVar2 : iterable2) {
                    Intrinsics.checkNotNullParameter(dVar2, "<this>");
                    Object paymentMethod = ApmPaymentMethod.GIRO_QVIK.f62170a;
                    Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                    String id10 = dVar2.getId();
                    dj0.d dVarO = mo3.a.o(dVar2.getPaymentAmount());
                    String description = dVar2.getDescription();
                    d.a details = dVar2.getDetails();
                    Intrinsics.checkNotNullParameter(details, "<this>");
                    Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                    qx1.a recipient = details.getRecipient();
                    Intrinsics.checkNotNullParameter(recipient, "<this>");
                    Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                    QvikContact qvikContactB = null;
                    if (paymentMethod.equals(ApmPaymentMethod.GIRO_ALIAS.f62169a)) {
                        iy1.h hVarI2 = qx1.b.i(recipient);
                        if (hVarI2 != null) {
                            qvikContactB = mx1.k.b(hVarI2, null);
                        }
                    } else if (paymentMethod.equals(paymentMethod) && (hVarI = qx1.b.i(recipient)) != null) {
                        qvikContactB = mx1.k.b(hVarI, null);
                    }
                    if (qvikContactB == null) {
                        throw new IllegalStateException("Can't generate recipient from " + details.getRecipient());
                    }
                    String callbackUrl = details.getCallbackUrl();
                    Long validTillDate = details.getValidTillDate();
                    List modifiableFields = details.getModifiableFields();
                    arrayList2.add(new ApmPaymentDraft(id10, dVarO, description, new ApmPaymentDraft.Details(callbackUrl, validTillDate, new ApmPaymentDraft.FieldSettings(modifiableFields.contains("amount"), modifiableFields.contains("reference")), qvikContactB)));
                }
                return arrayList2;
            case 11:
                com.revolut.feature_crypto_picker.impl.ui.picker.a aVar13 = (com.revolut.feature_crypto_picker.impl.ui.picker.a) this.f162540w;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarC = ((gi5.d) aVar13.f96814t).c(null);
                    this.v = 1;
                    obj2 = nim.a.b(d0VarC, this);
                    if (obj2 == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar13.H2(aVar13.u, new bke.o((sh5.c) obj2, 8));
                return Unit.f186387a;
            case 12:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.travel.experiences.impl.ui.flow.home.b bVar6 = (com.revolut.feature.travel.experiences.impl.ui.flow.home.b) this.f162540w;
                    com.revolut.feature.travel.experiences.impl.ui.flow.home.a aVar16 = new com.revolut.feature.travel.experiences.impl.ui.flow.home.a(bVar6, null);
                    this.v = 1;
                    if (bVar6.p2(this, aVar16) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                j1k.f fVar = (j1k.f) this.f162540w;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    if (fVar.f170628p.f101872b.f101803a == rzj.g.STOCKS) {
                        efm.d0 d0VarH = fVar.f170630r.h();
                        this.v = 1;
                        obj2 = nim.a.b(d0VarH, this);
                        if (obj2 == aVar17) {
                            return aVar17;
                        }
                    }
                    return Unit.f186387a;
                }
                if (i92 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                fVar.x2(new i1e.p((n0h.b) obj2, 1));
                return Unit.f186387a;
            case 14:
                j2g.y yVar = (j2g.y) this.f162540w;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                Continuation continuation = null;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    ufm.f fVar2 = new ufm.f(exf.c.a(yVar.f170889s, null, 3), new ivb.i(new j2g.p(yVar, 0), 20), 2);
                    Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSubscribe(...)");
                    this.v = 1;
                    obj2 = nim.a.b(fVar2, this);
                    if (obj2 == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                fxf.d dVar3 = (fxf.d) obj2;
                hyf.b bVar7 = yVar.f170887q;
                Integer num = new Integer(5);
                if (dVar3 instanceof fxf.c) {
                    fxf.c cVar = (fxf.c) dVar3;
                    coordinates = new Coordinates(cVar.f138815a, cVar.f138816b, null);
                } else {
                    if (!(dVar3 instanceof d.a) && !(dVar3 instanceof d.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    coordinates = null;
                }
                myf.z params = new myf.z(num, coordinates);
                c1g.u uVar = (c1g.u) bVar7;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                m0g.g gVar = (m0g.g) uVar.f20509a;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return yji.l.a1(yVar, rd0.e.b(gVar.k.e(params, loadingStrategy)), null, null, new j2g.o(yVar, continuation, 3), 3);
            case 15:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                Continuation continuation2 = null;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    vkm.d dVarA = dp6.a.a(((j50.o) this.f162540w).f171448l, yo6.d.AIR_MESSAGE);
                    ie6.q qVar = new ie6.q(2, 3, continuation2);
                    this.v = 1;
                    obj2 = vkm.q.y(dVarA, qVar, this);
                    if (obj2 == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                TagsFeedback tagsFeedback = (TagsFeedback) ((Data) obj2).getContent();
                if (tagsFeedback != null) {
                    return tagsFeedback.f73137c;
                }
                return null;
            case 16:
                com.revolut.feature.card_personalisation.generation.impl.ui.generation.a aVar20 = (com.revolut.feature.card_personalisation.generation.impl.ui.generation.a) this.f162540w;
                cli.y yVar2 = aVar20.f65320y;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (skm.k0.b(100L, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                j53.l lVar2 = (j53.l) ((j2) yVar2.f22677a).getValue();
                if (lVar2 instanceof j53.i) {
                    aVar20.H2(yVar2, new j53.o((j53.i) lVar2, 1));
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    j54.v vVar = ((com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d) this.f162540w).f67115q;
                    this.v = 1;
                    if (j54.v.r(vVar, null, null, this, 3) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.a aVar23 = (com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.a) this.f162540w;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    vkm.y yVarD = rd0.e.d(nim.a.u(new iz1.p(aVar23, null, 17), rd0.e.b(aVar23.f70476p.b(aVar23.o.f70473a, w4l.h.f294642c))), zhm.h0.f322473a);
                    blj.t tVar = new blj.t(aVar23, 9);
                    this.v = 1;
                    if (yVarD.collect(tVar, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    j8k.d dVar4 = (j8k.d) this.f162540w;
                    iyi.j jVar = new iyi.j(dVar4, null, 4);
                    this.v = 1;
                    if (dVar4.p2(this, jVar) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.a aVar27 = (com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.a) this.f162540w;
                j94.k kVar2 = new j94.k(aVar27, null, 1);
                this.v = 1;
                Object objB3 = pu7.a.B(aVar27.k, "confirm debt", kVar2, this);
                return objB3 == aVar26 ? aVar26 : objB3;
            case 21:
                com.revolut.feature.apm.payid.impl.flow.a aVar28 = (com.revolut.feature.apm.payid.impl.flow.a) this.f162540w;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    a3b.h hVar = new a3b.h(aVar28, 26);
                    ack.n nVar = new ack.n(19);
                    ja2.d dVar5 = new ja2.d(aVar28, null, 1);
                    this.v = 1;
                    obj2 = n14.k.P(aVar28.X(), null, hVar, nVar, dVar5, this);
                    if (obj2 == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                nii.e eVar2 = (nii.e) obj2;
                if (eVar2 instanceof nii.c) {
                    oki.h.D2(aVar28.f62708r);
                } else if (!(eVar2 instanceof nii.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.onboarding.impl.onboarding.biometric.d dVar6 = (com.revolut.feature.onboarding.impl.onboarding.biometric.d) this.f162540w;
                    com.revolut.feature.onboarding.impl.onboarding.biometric.c cVar2 = new com.revolut.feature.onboarding.impl.onboarding.biometric.c(dVar6, null);
                    this.v = 1;
                    if (dVar6.p2(this, cVar2) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                jc7.e eVar3 = (jc7.e) this.f162540w;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = new AddNewProductDestination((qf1.c) null, 3);
                    if (obj2 == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                eVar3.e.b(new fc7.d((KompotDestination) obj2));
                return Unit.f186387a;
            case 24:
                com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.summary.a aVar32 = (com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.summary.a) this.f162540w;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    iuf.y yVar3 = new iuf.y(aVar32, 2);
                    iyi.j jVar2 = new iyi.j(aVar32, null, 6);
                    this.v = 1;
                    obj2 = n14.k.V(aVar32, null, null, yVar3, jVar2, this, 3);
                    if (obj2 == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                if (((nii.h) obj2) instanceof nii.g) {
                    aVar32.C2(jcj.j.f172830a);
                }
                return Unit.f186387a;
            case 25:
                com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.c cVar3 = (com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.c) this.f162540w;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    iyi.j jVar3 = new iyi.j(cVar3, null, 8);
                    this.v = 1;
                    if (u0.b0(cVar3.X(), "LOADING_TAG_OPT_OUT", jVar3, this) == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                oki.h.D2(cVar3.f102566r);
                return Unit.f186387a;
            case 26:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 != 0) {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                wli.x xVar = ((com.revolut.feature.apm.swish.impl.ui.a) this.f162540w).f62918q;
                lg0.a aVar36 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, "https://app.swish.nu", aVar36, null, this, 4);
                return objX1 == aVar35 ? aVar35 : objX1;
            case 27:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    jh9.p pVar3 = (jh9.p) this.f162540w;
                    jh9.n nVar2 = new jh9.n(pVar3, null);
                    this.v = 1;
                    if (pVar3.p2(this, nVar2) == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    ahe.t tVar2 = ((jhe.t) this.f162540w).f174234a;
                    this.v = 1;
                    Object objSend = ((w0) tVar2).f5053t.send(sfe.a.RELOAD, this);
                    if (objSend != aVar38) {
                        objSend = Unit.f186387a;
                    }
                    if (objSend == aVar38) {
                        return aVar38;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    ahe.t tVar3 = (ahe.t) this.f162540w;
                    this.v = 1;
                    if (((w0) tVar3).e(this) == aVar39) {
                        return aVar39;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
