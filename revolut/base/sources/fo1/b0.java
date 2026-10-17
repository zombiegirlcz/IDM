package fo1;

import com.revolut.chat.data.repository.chat.AgentInfo;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.core.ui.api.navigation.qr.QrFlowInputData;
import com.revolut.feature.cashback.impl.network.CashbackStatusService;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.models.CreditOnboardingClosePayload;
import com.revolut.feature.on_hold.accounts.impl.network.BlockedFundsService;
import com.revolut.feature.pix.api.model.PortabilityRequestArgsModel;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowName;
import ft4.i0;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.z1;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class b0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f136738w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f136738w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b0((e0) this.f136738w, continuation, 0);
            case 1:
                return new b0((com.revolut.feature.payment.counterparty.impl.screen.profile.a) this.f136738w, continuation, 1);
            case 2:
                return new b0((fol.d) this.f136738w, continuation, 2);
            case 3:
                return new b0((fq3.j) this.f136738w, continuation, 3);
            case 4:
                return new b0((fr8.r) this.f136738w, continuation, 4);
            case 5:
                return new b0((i0) this.f136738w, continuation, 5);
            case 6:
                return new b0((com.revolut.feature.security_hub.impl.ui.transactions_limits.a) this.f136738w, continuation, 6);
            case 7:
                return new b0((fwi.a) this.f136738w, continuation, 7);
            case 8:
                return new b0((fx6.i) this.f136738w, continuation, 8);
            case 9:
                return new b0((com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c) this.f136738w, continuation, 9);
            case 10:
                return new b0((fze.k) this.f136738w, continuation, 10);
            case 11:
                return new b0((com.revolut.feature.topup_screen.impl.mcy.b) this.f136738w, continuation, 11);
            case 12:
                return new b0((g17.h) this.f136738w, continuation, 12);
            case 13:
                return new b0((g3e.r) this.f136738w, continuation, 13);
            case 14:
                return new b0((g40.l) this.f136738w, continuation, 14);
            case 15:
                return new b0((com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c) this.f136738w, continuation, 15);
            case 16:
                return new b0((com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.a) this.f136738w, continuation, 16);
            case 17:
                return new b0((g82.g) this.f136738w, continuation, 17);
            case 18:
                return new b0((g89.a) this.f136738w, continuation, 18);
            case 19:
                return new b0((g8c.l) this.f136738w, continuation, 19);
            case 20:
                return new b0((g99.h) this.f136738w, continuation, 20);
            case 21:
                return new b0((gaa.j) this.f136738w, continuation, 21);
            case 22:
                return new b0((gaf.k) this.f136738w, continuation, 22);
            case 23:
                return new b0((gc2.c) this.f136738w, continuation, 23);
            case 24:
                return new b0((gc6.o) this.f136738w, continuation, 24);
            case 25:
                return new b0((gca.m) this.f136738w, continuation, 25);
            case 26:
                return new b0((gcg.e0) this.f136738w, continuation, 26);
            case 27:
                return new b0((gd3.k) this.f136738w, continuation, 27);
            case 28:
                return new b0((gdk.g) this.f136738w, continuation, 28);
            default:
                return new b0((ge6.l) this.f136738w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        Object objQ;
        Object learnMoreDeeplink;
        gaa.e eVar;
        Object objB2;
        Object objB3;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    e0 e0Var = (e0) this.f136738w;
                    a0 a0Var = new a0(e0Var, null);
                    this.v = 1;
                    if (e0Var.p2(this, a0Var) == aVar) {
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
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.payment.counterparty.impl.screen.profile.a aVar3 = (com.revolut.feature.payment.counterparty.impl.screen.profile.a) this.f136738w;
                e94.g gVar = new e94.g(aVar3, null, 22);
                this.v = 1;
                Object objP2 = aVar3.p2(this, gVar);
                return objP2 == aVar2 ? aVar2 : objP2;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                fol.d dVar = (fol.d) this.f136738w;
                e94.g gVar2 = new e94.g(dVar, null, 23);
                this.v = 1;
                Object objB4 = pu7.a.B(dVar.k, "delete_passkey", gVar2, this);
                return objB4 == aVar4 ? aVar4 : objB4;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                fq3.j jVar = (fq3.j) this.f136738w;
                dq3.a aVar6 = jVar.f137182j;
                CreditOnboardingClosePayload creditOnboardingClosePayload = (CreditOnboardingClosePayload) jVar.f137181h.f66219b;
                CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = creditOnboardingClosePayload.f66907a;
                boolean z = creditOnboardingClosePayload.f66909c;
                this.v = 1;
                Object objA = ((ow3.c) aVar6).a(creditApplicationPluginFlowContract$Configuration, z, this);
                return objA == aVar5 ? aVar5 : objA;
            case 4:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    pfm.a aVarM0 = ((fr8.r) this.f136738w).f137434q.m0(false);
                    this.v = 1;
                    if (nim.a.a(aVarM0, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                i0 i0Var = (i0) this.f136738w;
                e94.g gVar3 = new e94.g(i0Var, null, 24);
                this.v = 1;
                Object objB5 = pu7.a.B(i0Var.k, "credit_card_reload_instalment_availability", gVar3, this);
                return objB5 == aVar8 ? aVar8 : objB5;
            case 6:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.security_hub.impl.ui.transactions_limits.a aVar10 = (com.revolut.feature.security_hub.impl.ui.transactions_limits.a) this.f136738w;
                    fwc.u uVar = new fwc.u(aVar10, null, 1);
                    this.v = 1;
                    if (aVar10.p2(this, uVar) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                fwi.a aVar12 = (fwi.a) this.f136738w;
                this.v = 1;
                FeatureCommand featureCommandA = aVar12.a();
                return featureCommandA == aVar11 ? aVar11 : featureCommandA;
            case 8:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                fx6.i iVar = (fx6.i) this.f136738w;
                fx6.h hVar = new fx6.h(iVar, null, 1);
                this.v = 1;
                Object objB6 = pu7.a.B(iVar.k, "set annual inbound volume", hVar, this);
                return objB6 == aVar13 ? aVar13 : objB6;
            case 9:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c cVar = (com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c) this.f136738w;
                e94.g gVar4 = new e94.g(cVar, null, 25);
                this.v = 1;
                Object objB7 = pu7.a.B(cVar.k, "update_invoice_schedule", gVar4, this);
                return objB7 == aVar14 ? aVar14 : objB7;
            case 10:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    fze.k kVar = (fze.k) this.f136738w;
                    this.v = 1;
                    if (kVar.invoke(this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.topup_screen.impl.mcy.b bVar = (com.revolut.feature.topup_screen.impl.mcy.b) this.f136738w;
                    com.revolut.feature.topup_screen.impl.mcy.a aVar17 = new com.revolut.feature.topup_screen.impl.mcy.a(bVar, null);
                    this.v = 1;
                    if (com.revolut.feature.topup_screen.impl.mcy.b.J2(bVar, aVar17, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                g17.h hVar2 = (g17.h) this.f136738w;
                com.revolut.feature.freelancer.impl.ui.prompt.post_activation.a aVar19 = new com.revolut.feature.freelancer.impl.ui.prompt.post_activation.a(hVar2, null);
                this.v = 1;
                Object objB8 = pu7.a.B(hVar2.k, "issue_virtual_card", aVar19, this);
                return objB8 == aVar18 ? aVar18 : objB8;
            case 13:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    g3e.r rVar = (g3e.r) this.f136738w;
                    g3e.f fVar = rVar.o;
                    ihm.f events = rVar.u;
                    g3e.i iVar2 = (g3e.i) fVar;
                    iVar2.getClass();
                    Intrinsics.checkNotNullParameter(events, "events");
                    efm.r rVarMerge = efm.r.merge(rd0.e.c(vkm.q.q(vkm.q.h(iVar2.f140275b.f139981a)), kotlin.coroutines.g.f186406a), iVar2.e.map(new g1i.i0(13, new g3e.g(iVar2, 0))));
                    Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
                    efm.b bVarSwitchMapCompletable = rVarMerge.switchMapCompletable(new g1i.i0(14, new g0f.f(iVar2, events, 26)));
                    Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
                    this.v = 1;
                    if (nim.a.a(bVarSwitchMapCompletable, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                g40.l lVar = (g40.l) this.f136738w;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarD = lVar.f140316p.d(lVar.f140318r.f140311a.f50997a);
                    this.v = 1;
                    objB = nim.a.b(d0VarD, this);
                    if (objB == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                lVar.x2(new g40.k((AgentInfo) objB, 0));
                return Unit.f186387a;
            case 15:
                com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c cVar2 = (com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c) this.f136738w;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    v5a.g gVar5 = cVar2.f80265p;
                    this.v = 1;
                    if (gVar5.a(this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                cVar2.I2(true);
                return Unit.f186387a;
            case 16:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.a aVar24 = (com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.a) this.f136738w;
                    a54.g gVar6 = new a54.g(aVar24, null, 21);
                    this.v = 1;
                    if (aVar24.p2(this, gVar6) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                g82.g gVar7 = (g82.g) this.f136738w;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    ack.n nVar = new ack.n(15);
                    e94.g gVar8 = new e94.g(gVar7, null, 27);
                    this.v = 1;
                    objQ = n14.k.Q(gVar7, null, null, nVar, gVar8, this, 2);
                    if (objQ == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objQ = obj2;
                }
                nii.e eVar2 = (nii.e) objQ;
                gVar7.s1();
                if (eVar2 instanceof nii.c) {
                    gVar7.C2(g82.b.f141242a);
                } else {
                    if (!(eVar2 instanceof nii.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar7.C2(new g82.c((QrFlowInputData) ((nii.d) eVar2).f216133a));
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    BlockedFundsService blockedFundsService = ((g89.a) this.f136738w).f141299a;
                    this.v = 1;
                    learnMoreDeeplink = blockedFundsService.getLearnMoreDeeplink(this);
                    if (learnMoreDeeplink == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    learnMoreDeeplink = obj2;
                }
                return ((f89.a) learnMoreDeeplink).getDeeplink();
            case 19:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    g8c.l lVar2 = (g8c.l) this.f136738w;
                    g8c.k kVar2 = new g8c.k(lVar2, null);
                    this.v = 1;
                    if (lVar2.p2(this, kVar2) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    g99.h hVar3 = (g99.h) this.f136738w;
                    z1 z1Var = hVar3.f.f109830b;
                    g99.d dVar2 = new g99.d(hVar3, 1);
                    this.v = 1;
                    z1Var.getClass();
                    if (z1.m(z1Var, dVar2, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                throw new KotlinNothingValueException();
            case 21:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    gaa.j jVar2 = (gaa.j) this.f136738w;
                    j60.a aVar30 = jVar2.f142125p;
                    gaa.d dVar3 = jVar2.f142126q;
                    PortabilityRequestArgsModel inputData = jVar2.o.f80641b;
                    dVar3.getClass();
                    Intrinsics.checkNotNullParameter(inputData, "inputData");
                    if (inputData instanceof PortabilityRequestArgsModel.DifferentOwnership) {
                        String str = ((PortabilityRequestArgsModel.DifferentOwnership) inputData).f80481b;
                        eVar = new gaa.e(zhm.v.l(str), str == null ? R$string.pix_request_ownership_title : R$string.pix_request_ownership_title_with_institution, R$string.pix_request_ownership_subtitle, R$string.pix_request_ownership_button_primary_action);
                    } else {
                        if (!(inputData instanceof PortabilityRequestArgsModel.SameOwnership)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String str2 = ((PortabilityRequestArgsModel.SameOwnership) inputData).f80483b;
                        eVar = new gaa.e(zhm.v.l(str2), str2 == null ? R$string.pix_request_portability_title : R$string.pix_request_portability_title_with_institution, R$string.pix_request_portability_subtitle, R$string.pix_request_portability_button_primary_action);
                    }
                    rp0.t tVar = new rp0.t(new TextLocalisedClause(eVar.f142116a, eVar.f142117b, null, 12), new TextLocalisedClause(eVar.f142118c, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new rp0.v("HEADER_ICON_ID", com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), 24);
                    List listK = zhm.v.k(new LargeActionButtonDelegate.Model("REQUEST_MIGRATION_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(eVar.d, null, null, 14), false, null, null, null, null, 1000), new LargeActionButtonDelegate.Model("CANCEL_MIGRATION_BUTTON_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.pix_request_portability_button_cancel, null, null, 14), false, null, null, R$attr.uikit_dp16, 0, 0, 0, 7664));
                    int i106 = R$attr.uikit_dp16;
                    yp0.b.q(listK, 0, i106, i106, i106, 1);
                    efm.b bVarG = aVar30.G(new rp0.y(listK, tVar, rp0.l.WINDOW, null, null, null, 1016));
                    this.v = 1;
                    if (nim.a.a(bVarG, this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 != 0) {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                gaf.k kVar3 = (gaf.k) this.f136738w;
                e94.g gVar9 = new e94.g(kVar3, null, 29);
                this.v = 1;
                Object objB9 = pu7.a.B(kVar3.k, "IsaTransferReviewSubmitScreenModel_submit", gVar9, this);
                return objB9 == aVar31 ? aVar31 : objB9;
            case 23:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    fn2.c cVar3 = ((gc2.c) this.f136738w).f142316c;
                    this.v = 1;
                    if (cVar3.l(true, this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                gc6.o oVar = (gc6.o) this.f136738w;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarFirstOrError = m70.a.g(aa6.c.a(oVar.f142360p.f112804a, false), null, null, 3).firstOrError();
                    Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                    this.v = 1;
                    objB2 = nim.a.b(d0VarFirstOrError, this);
                    if (objB2 == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB2 = obj2;
                }
                List list = (List) objB2;
                ua6.a aVar34 = oVar.f142362r;
                Intrinsics.h(list);
                return oVar.C1(new BridgeDestination(aVar34.b(list)));
            case 25:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    gca.m mVar = (gca.m) this.f136738w;
                    gca.l lVar3 = new gca.l(mVar, null, 0);
                    this.v = 1;
                    if (mVar.p2(this, lVar3) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                gcg.e0 e0Var2 = (gcg.e0) this.f136738w;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarFirstOrError2 = e0Var2.f142440p.g().firstOrError();
                    Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError2, "firstOrError(...)");
                    this.v = 1;
                    objB3 = nim.a.b(d0VarFirstOrError2, this);
                    if (objB3 == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB3 = obj2;
                }
                List list2 = (List) objB3;
                Intrinsics.h(list2);
                e0Var2.C2(new gcg.l(list2));
                return Unit.f186387a;
            case 27:
                gd3.k kVar4 = (gd3.k) this.f136738w;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    CashbackStatusService cashbackStatusService = kVar4.f143062a;
                    this.v = 1;
                    if (cashbackStatusService.postCloseCashback(this) == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i112 != 1) {
                        if (i112 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                x4l.c cVar4 = kVar4.d;
                Unit unit = Unit.f186387a;
                this.v = 2;
                if (cVar4.d(unit, true, this) == aVar37) {
                    return aVar37;
                }
                return Unit.f186387a;
            case 28:
                gdk.g gVar10 = (gdk.g) this.f136738w;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    vkm.y yVarD = rd0.e.d(rd0.e.b(gVar10.d.a()), h0.f322473a);
                    blj.t tVar2 = new blj.t(gVar10, 5);
                    this.v = 1;
                    if (yVarD.collect(tVar2, this) == aVar38) {
                        return aVar38;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 != 0) {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                jvh.a aVar40 = ((ge6.l) this.f136738w).f143242c;
                WorkflowName workflowName = new WorkflowName("REPORT_ACCOUNT_TAKEOVER_ATTEMPT");
                this.v = 1;
                Object objA2 = aVar40.a(workflowName, this);
                return objA2 == aVar39 ? aVar39 : objA2;
        }
    }
}
