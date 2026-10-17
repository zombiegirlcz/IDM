package w3k;

import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.NewTicketContext;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.domain.model.Transcript;
import com.revolut.chat.domain.model.TranscriptIdentifier;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.chat_core.R$string;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alerts.SharedAlertsScreen;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.detail.TroubleshooterDetailScreenContract$InputData;
import com.revolut.feature_market_data_api.models.OrderQuoteParamsVariant;
import com.revolut.feature_market_data_api.navigation.Breakdown;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.RemittanceFlowContract$State;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import d2k.m;
import do3.q;
import efm.r;
import elf.g1;
import ft3.h1;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import jq9.t;
import jq9.v;
import jq9.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import le.u1;
import nii.l1;
import nii.n1;
import org.bouncycastle.asn1.BERTags;
import rp0.a1;
import skm.p0;
import v30.b1;
import v30.c1;
import v30.d1;
import v30.y0;
import v30.z0;
import vc2.s;
import vq5.w;
import vy5.c0;
import w4i.d0;
import w4k.k;
import w50.o;
import w56.p;
import w75.l;
import wba.e0;
import wdb.n;
import wed.f0;
import wf6.m0;
import wff.x;
import xg6.b0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f294425w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f294426x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(ServerError serverError, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 19;
        this.f294425w = serverError;
        this.f294426x = (gim.i) function1;
    }

    /* JADX WARN: Type inference failed for: r1v39, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i((com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c) this.f294425w, (y) this.f294426x, continuation, 0);
            case 1:
                return new i((com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c) this.f294425w, (t) this.f294426x, continuation, 1);
            case 2:
                return new i((com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c) this.f294425w, (m) this.f294426x, continuation, 2);
            case 3:
                return new i((w4d.f) this.f294425w, (g6) this.f294426x, continuation, 3);
            case 4:
                i iVar = new i((d0) this.f294426x, continuation, 4);
                iVar.f294425w = obj2;
                return iVar;
            case 5:
                return new i((k) this.f294425w, (kq2.b) this.f294426x, continuation, 5);
            case 6:
                return new i((o) this.f294425w, (Transcript) this.f294426x, continuation, 6);
            case 7:
                i iVar2 = new i((o) this.f294426x, continuation, 7);
                iVar2.f294425w = obj2;
                return iVar2;
            case 8:
                i iVar3 = new i((w54.d) this.f294426x, continuation, 8);
                iVar3.f294425w = obj2;
                return iVar3;
            case 9:
                return new i((p) this.f294425w, (i56.e) this.f294426x, continuation, 9);
            case 10:
                return new i((com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b) this.f294425w, (h1) this.f294426x, continuation, 10);
            case 11:
                return new i((com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b) this.f294425w, (it3.d) this.f294426x, continuation, 11);
            case 12:
                return new i((l) this.f294425w, (koi.j) this.f294426x, continuation, 12);
            case 13:
                return new i((com.revolut.feature.retail.global_accounts.impl.onboarding.ui.a) this.f294425w, (String) this.f294426x, continuation, 13);
            case 14:
                i iVar4 = new i((w9j.e) this.f294426x, continuation, 14);
                iVar4.f294425w = obj2;
                return iVar4;
            case 15:
                i iVar5 = new i((ie.a) this.f294426x, continuation, 15);
                iVar5.f294425w = obj2;
                return iVar5;
            case 16:
                return new i((wa4.e) this.f294425w, (t61.g) this.f294426x, continuation, 16);
            case 17:
                return new i((wae.d) this.f294425w, (qua.p) this.f294426x, continuation, 17);
            case 18:
                return new i((e0) this.f294425w, (TransferScheduleData) this.f294426x, continuation, 18);
            case 19:
                return new i((ServerError) this.f294425w, (Function1) this.f294426x, continuation);
            case 20:
                return new i((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a) this.f294425w, (TermsScope) this.f294426x, continuation, 20);
            case 21:
                return new i((wc0.a) this.f294425w, (String) this.f294426x, continuation, 21);
            case 22:
                return new i((n) this.f294425w, (String) this.f294426x, continuation, 22);
            case 23:
                i iVar6 = new i((SharedAlertsScreen) this.f294426x, continuation, 23);
                iVar6.f294425w = obj2;
                return iVar6;
            case 24:
                return new i((f0) this.f294425w, (Function1) this.f294426x, continuation, 24);
            case 25:
                return new i((f0) this.f294425w, (ty0.a) this.f294426x, continuation, 25);
            case 26:
                return new i((wf4.h) this.f294425w, (cv3.h) this.f294426x, continuation, 26);
            case 27:
                return new i((wf6.m) this.f294425w, (jf0.c) this.f294426x, continuation, 27);
            case 28:
                return new i((m0) this.f294425w, (String) this.f294426x, continuation, 28);
            default:
                i iVar7 = new i((x) this.f294426x, continuation, 29);
                iVar7.f294425w = obj2;
                return iVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((i) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((i) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((i) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((i) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((i) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((i) create((h93.f0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((i) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((i) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((ep6.m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r15v21, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        Object objB;
        Flow flowU;
        Object objJ;
        Object objA2;
        go.g gVar;
        Object objJ2;
        Object objP;
        Object objB2;
        Object objI;
        int i = this.u;
        int i2 = 28;
        int i3 = 25;
        int i5 = 19;
        int i6 = 7;
        int i21 = 8;
        int i22 = 26;
        int i32 = 4;
        int i33 = 0;
        int i43 = 2;
        Continuation continuation = null;
        Object obj3 = this.f294426x;
        int i59 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c cVar = (com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c) this.f294425w;
                    com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.b bVar = new com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.b(cVar, (y) obj3, null);
                    this.v = 1;
                    if (cVar.p2(this, bVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                t tVar = (t) obj3;
                com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c cVar2 = (com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c) this.f294425w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                int i92 = 17;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    RemittanceTransferData remittanceTransferDataT2 = cVar2.T2();
                    RemittanceRouteId remittanceRouteId = remittanceTransferDataT2.f102054j;
                    if ((remittanceRouteId instanceof RemittanceRouteId.Internal) || (remittanceRouteId instanceof RemittanceRouteId.CARD)) {
                        cVar2.l2(new w(cVar2, tVar, continuation, i92), new yi5.b(i22));
                        return Unit.f186387a;
                    }
                    if (!(remittanceRouteId instanceof RemittanceRouteId.BANK) && !(remittanceRouteId instanceof RemittanceRouteId.MobileWallet)) {
                        if (remittanceRouteId instanceof RemittanceRouteId.UNKNOWN) {
                            throw new IllegalStateException("UNKNOWN route selected for Additional Info");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    v vVar = tVar instanceof v ? (v) tVar : null;
                    if (vVar == null) {
                        throw new IllegalArgumentException(j6.a.q("Remittance Bank transfer couldn't continue because selectedRecipientType=", o0.f186429a.b(tVar.getClass()).m()).toString());
                    }
                    d dVar = cVar2.u;
                    f5j.a aVar3 = vVar.f177523a;
                    this.v = 1;
                    objA = dVar.a(aVar3, remittanceTransferDataT2, this);
                    if (objA == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                krf.b bVar2 = ((krf.a) objA).f188856a;
                cVar2.L2(RemittanceFlowContract$State.a((RemittanceFlowContract$State) cVar2.A2().f98429a, null, null, bVar2, null, 11));
                if (bVar2 == null) {
                    cVar2.l2(new w(cVar2, tVar, continuation, i92), new yi5.b(i22));
                } else {
                    cVar2.P2(((v) tVar).f177523a, false);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c cVar3 = (com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c) this.f294425w;
                    g1 g1Var = new g1((m) obj3, cVar3, continuation, 10);
                    this.v = 1;
                    if (cVar3.p2(this, g1Var) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 != 0) {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                w4d.f fVar = (w4d.f) this.f294425w;
                w4d.e eVar = new w4d.e(fVar, (g6) obj3, continuation, i59);
                this.v = 1;
                Object objP2 = fVar.p2(this, eVar);
                return objP2 == aVar5 ? aVar5 : objP2;
            case 4:
                d0 d0Var = (d0) obj3;
                FlowCollector flowCollector = (FlowCollector) this.f294425w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                try {
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var);
                    w4i.m mVar = new w4i.m(new Data(null, e2, false, 5, null));
                    this.f294425w = null;
                    this.v = 2;
                    if (flowCollector.emit(mVar, this) == aVar6) {
                        return aVar6;
                    }
                }
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    efm.d0 d0VarF = d0Var.f294572q.f(false);
                    this.f294425w = flowCollector;
                    this.v = 1;
                    objB = nim.a.b(d0VarF, this);
                    if (objB == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i100 != 1) {
                        if (i100 == 2) {
                            yhm.o.b(obj2);
                            return Unit.f186387a;
                        }
                        if (i100 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                Intrinsics.checkNotNullExpressionValue(objB, "await(...)");
                wi0.b bVarY = q.y((do3.n) objB);
                w4i.c cVar4 = d0Var.o;
                Breakdown.Transaction transaction = cVar4.d;
                o7.b bVar3 = cVar4.f294567a;
                OrderQuoteParamsVariant orderQuoteParamsVariant = transaction.f97051b;
                if (orderQuoteParamsVariant instanceof OrderQuoteParamsVariant.Legacy) {
                    flowU = o7.b.s(bVar3, ((OrderQuoteParamsVariant.Legacy) orderQuoteParamsVariant).f97018a);
                } else {
                    if (!(orderQuoteParamsVariant instanceof OrderQuoteParamsVariant.Migrated)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    flowU = o7.b.u(bVar3, ((OrderQuoteParamsVariant.Migrated) orderQuoteParamsVariant).f97019a);
                }
                Flow flowE = boh.f.e(new vkm.y(new w4i.a(cVar4, null), flowU), new w38.v(d0Var, bVarY, i6));
                this.f294425w = null;
                this.v = 3;
                vkm.q.w(flowCollector);
                Object objCollect = flowE.collect(new c0(flowCollector, i3), this);
                if (objCollect != aVar6) {
                    objCollect = Unit.f186387a;
                }
                if (objCollect != aVar6) {
                    objCollect = Unit.f186387a;
                }
                if (objCollect == aVar6) {
                    return aVar6;
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 != 0) {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                agf.b bVar4 = ((k) this.f294425w).f294620b;
                String str = ((kq2.b) obj3).f188296a;
                this.v = 1;
                Object objC = ((cgf.b) bVar4).c(str, this);
                return objC == aVar7 ? aVar7 : objC;
            case 6:
                o oVar = (o) this.f294425w;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                try {
                    if (i102 == 0) {
                        yhm.o.b(obj2);
                        t1j.b bVar5 = oVar.f294665l;
                        UUID uuid = ((Transcript) obj3).f51073a;
                        this.v = 1;
                        c30.h hVar = (c30.h) bVar5.f267380b;
                        hVar.getClass();
                        p0 p0Var = p0.f264001a;
                        objJ = skm.e0.J(elm.f.f127540b, new btk.j(hVar, uuid, continuation, 14), this);
                        if (objJ == aVar8) {
                            return aVar8;
                        }
                    } else {
                        if (i102 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objJ = obj2;
                    }
                    oVar.f294666m.Z2((String) objJ);
                    break;
                } catch (Exception e4) {
                    o.c3(oVar, e4);
                }
                return Unit.f186387a;
            case 7:
                o oVar2 = (o) obj3;
                t1j.b bVar6 = oVar2.f294665l;
                Pair pair = (Pair) this.f294425w;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    d1 d1Var = (d1) pair.f186385a;
                    TranscriptIdentifier transcriptIdentifier = (TranscriptIdentifier) pair.f186386b;
                    if (d1Var instanceof z0) {
                        oVar2.d3(new ShotDialogDisplayer$Configuration("shot_generated_pdf", new TextLocalisedClause(R$string.chat_transcript_generating_pdf_success_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.chat_transcript_action_open, null, null, 14), a1.INDEFINITE, null, ((z0) d1Var).f285841a, 160));
                        this.f294425w = null;
                        this.v = 1;
                        if (bVar6.h(transcriptIdentifier) == aVar9) {
                            return aVar9;
                        }
                    } else if (d1Var instanceof c1) {
                        oVar2.d3(new ShotDialogDisplayer$Configuration("shot_scheduled_pdf", new TextLocalisedClause(R$string.chat_transcript_generating_pdf, null, null, 14), new AnimatedResourceImage(R$drawable.uikit_icn_48_loading_anim, 10, (Clause) null, (Integer) null), new TextLocalisedClause(R$string.chat_dialog_pdf_transcription_generating_cancel, null, null, 14), a1.INDEFINITE, null, null, BERTags.FLAGS));
                    } else if (d1Var instanceof y0) {
                        o.c3(oVar2, ((y0) d1Var).f285838a);
                        this.f294425w = null;
                        this.v = 2;
                        if (bVar6.h(transcriptIdentifier) == aVar9) {
                            return aVar9;
                        }
                    } else if (!Intrinsics.f(d1Var, b1.f285760a)) {
                        if (!Intrinsics.f(d1Var, v30.a1.f285758a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ShotDialogDisplayer$Configuration shotDialogDisplayer$Configuration = oVar2.f294668p;
                        if (Intrinsics.f(shotDialogDisplayer$Configuration != null ? shotDialogDisplayer$Configuration.f55716a : null, "shot_scheduled_pdf") && oVar2.f294668p != null) {
                            oVar2.f294668p = null;
                            oVar2.f294667n.c();
                        }
                    }
                } else {
                    if (i103 != 1 && i103 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                FlowCollector flowCollector2 = (FlowCollector) this.f294425w;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    Data dataP = zi0.c.P(((ik3.c) ((w54.d) obj3).f294692b).g(), false, null, 3);
                    this.f294425w = null;
                    this.v = 1;
                    if (flowCollector2.emit(dataP, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    p pVar = (p) this.f294425w;
                    s sVar = new s(pVar, (i56.e) obj3, continuation, i2);
                    this.v = 1;
                    if (pVar.p2(this, sVar) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b bVar7 = (com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b) this.f294425w;
                    s sVar2 = new s(bVar7, (h1) obj3, continuation, 29);
                    this.v = 1;
                    if (bVar7.p2(this, sVar2) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b bVar8 = (com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b) this.f294425w;
                    w64.d dVar2 = new w64.d(bVar8, (it3.d) obj3, continuation, i33);
                    this.v = 1;
                    if (bVar8.p2(this, dVar2) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 != 0) {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                l lVar = (l) this.f294425w;
                w75.j jVar = new w75.j(lVar, (koi.j) obj3, continuation, i59);
                this.v = 1;
                Object objB3 = pu7.a.B(lVar.k, "handleClick", jVar, this);
                return objB3 == aVar14 ? aVar14 : objB3;
            case 13:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 != 0) {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.retail.global_accounts.impl.onboarding.ui.a aVar16 = (com.revolut.feature.retail.global_accounts.impl.onboarding.ui.a) this.f294425w;
                w64.d dVar3 = new w64.d(aVar16, (String) obj3, continuation, i32);
                this.v = 1;
                Object objP22 = aVar16.p2(this, dVar3);
                return objP22 == aVar15 ? aVar15 : objP22;
            case 14:
                w9j.e eVar2 = (w9j.e) obj3;
                FlowCollector flowCollector3 = (FlowCollector) this.f294425w;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    ow5.b bVar9 = eVar2.e;
                    this.f294425w = flowCollector3;
                    this.v = 1;
                    objA2 = bVar9.a(this);
                    if (objA2 == aVar17) {
                        return aVar17;
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
                    objA2 = obj2;
                }
                if (!((Boolean) objA2).booleanValue()) {
                    r rVarW = nim.a.w(hng.g.b(((ang.b) eVar2.f295745a).f7765a), new w6h.f(13));
                    efm.d0 d0VarF2 = eVar2.f295746b.f(false);
                    w9j.c cVar5 = w9j.c.f;
                    r map = new ufm.i(d0VarF2, new vf0.q(i5), 1).x().map(new w38.w(3, w9j.d.f295744a));
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    vkm.d dVarB = rd0.e.b(m70.a.g(nim.a.w(u1.e(rVarW, map, rd0.e.c(eVar2.f295747c.a(w4l.h.f294642c), kotlin.coroutines.g.f186406a)), new w3c.n(eVar2, 16)), null, new w6b.a(15), 1));
                    this.f294425w = null;
                    this.v = 2;
                    if (vkm.q.u(flowCollector3, dVarB, this) == aVar17) {
                        return aVar17;
                    }
                }
                return Unit.f186387a;
            case 15:
                h93.f0 f0Var = (h93.f0) this.f294425w;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                try {
                    if (i111 == 0) {
                        yhm.o.b(obj2);
                        ya3.a aVar19 = f0Var.d ? ya3.a.DISPOSABLE : f0Var.f150112c ? ya3.a.VIRTUAL : ya3.a.PHYSICAL;
                        mp.r rVar = (mp.r) ((ie.a) obj3).f;
                        this.f294425w = null;
                        this.v = 1;
                        a1a.a aVar20 = new a1a.a(rVar, aVar19, continuation, i2);
                        p0 p0Var2 = p0.f264001a;
                        objJ2 = skm.e0.J(elm.f.f127540b, aVar20, this);
                        if (objJ2 == aVar18) {
                            return aVar18;
                        }
                    } else {
                        if (i111 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objJ2 = obj2;
                    }
                    gVar = new go.g(new Data(Optional.of((List) objJ2), null, false, 6, null), 2);
                    break;
                } catch (Exception e5) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e5, h0Var2);
                    gVar = new go.g(new Data(Optional.empty(), null, false, 6, null), 2);
                }
                return gVar;
            case 16:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                wa4.e eVar3 = (wa4.e) this.f294425w;
                wa4.d dVar4 = new wa4.d(eVar3, (t61.g) obj3, continuation, i59);
                this.v = 1;
                Object objB4 = pu7.a.B(eVar3.k, "Emergency payment add new card", dVar4, this);
                return objB4 == aVar21 ? aVar21 : objB4;
            case 17:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    wae.d dVar5 = (wae.d) this.f294425w;
                    wae.b bVar10 = new wae.b(dVar5, (qua.p) obj3, continuation, i59);
                    this.v = 1;
                    if (dVar5.Y2(this, bVar10) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                e0 e0Var = (e0) this.f294425w;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    dx6.m mVar2 = new dx6.m(e0Var.f296071s, i21);
                    up4.h hVar2 = new up4.h(9);
                    wba.d0 d0Var2 = new wba.d0(e0Var, continuation, i32);
                    this.v = 1;
                    objP = n14.k.P(e0Var.X(), null, mVar2, hVar2, d0Var2, this);
                    if (objP == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objP = obj2;
                }
                nii.e eVar4 = (nii.e) objP;
                TransferScheduleData transferScheduleData = (TransferScheduleData) obj3;
                if (eVar4 instanceof nii.d) {
                    PixQrCodeDecodeData pixQrCodeDecodeData = (PixQrCodeDecodeData) ((nii.d) eVar4).f216133a;
                    e0Var.H2(e0Var.f296072t, new in1.q(transferScheduleData, i43));
                    e0Var.C2(new wba.o(pixQrCodeDecodeData));
                    Unit unit = Unit.f186387a;
                } else {
                    if (!(eVar4 instanceof nii.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((nii.c) eVar4).f216124b instanceof l1) {
                        e0Var.C2(wba.j.f296081a);
                    }
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    if (((ServerError) this.f294425w).f51362a != 22713006) {
                        this.v = 1;
                        if (((gim.i) obj3).invoke(this) == aVar24) {
                            return aVar24;
                        }
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a aVar25 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a) this.f294425w;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    ufm.i iVarC = ((rre.d) aVar25.C).c((TermsScope) obj3, null);
                    this.v = 1;
                    objB2 = nim.a.b(iVarC, this);
                    if (objB2 == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB2 = obj2;
                }
                NaviCommand naviCommand = (NaviCommand) objB2;
                Intrinsics.h(naviCommand);
                return aVar25.C1(new BridgeDestination(naviCommand));
            case 21:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
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
                Object objX1 = lg0.b.x1(((wc0.a) this.f294425w).f296311b, (String) obj3, null, null, this, 6);
                return objX1 == aVar27 ? aVar27 : objX1;
            case 22:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 != 0) {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objB5 = n.b((n) this.f294425w, (String) obj3, this);
                return objB5 == aVar28 ? aVar28 : objB5;
            case 23:
                ty0.a aVar29 = (ty0.a) this.f294425w;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    wed.q qVarI3 = ((SharedAlertsScreen) obj3).i3();
                    Intrinsics.h(aVar29);
                    this.f294425w = null;
                    this.v = 1;
                    f0 f0Var2 = (f0) qVarI3;
                    f0Var2.getClass();
                    f0Var2.l2(new i(f0Var2, aVar29, continuation, i3), new yi5.b(i22));
                    if (Unit.f186387a == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 != 0) {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                f0 f0Var3 = (f0) this.f294425w;
                w64.d dVar6 = new w64.d(f0Var3, (Function1) obj3, continuation, 6);
                this.v = 1;
                Object objB6 = pu7.a.B(f0Var3.k, "loadAssetTypeOrder", dVar6, this);
                return objB6 == aVar31 ? aVar31 : objB6;
            case 25:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 != 0) {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                f0 f0Var4 = (f0) this.f294425w;
                mcg.j jVar2 = new mcg.j(f0Var4, (ty0.a) obj3, continuation, i5);
                this.v = 1;
                Object objB7 = pu7.a.B(f0Var4.k, "onClauseClick", jVar2, this);
                return objB7 == aVar32 ? aVar32 : objB7;
            case 26:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i122 = this.v;
                if (i122 == 0) {
                    yhm.o.b(obj2);
                    wf4.h hVar3 = (wf4.h) this.f294425w;
                    w64.d dVar7 = new w64.d(hVar3, (cv3.h) obj3, continuation, i6);
                    this.v = 1;
                    if (hVar3.p2(this, dVar7) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i122 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                wf6.m mVar3 = (wf6.m) this.f294425w;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i123 = this.v;
                if (i123 == 0) {
                    yhm.o.b(obj2);
                    efm.k kVarB = mVar3.b((jf0.c) obj3);
                    this.v = 1;
                    objI = nim.a.i(kVarB, this);
                    if (objI == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i123 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objI = obj2;
                }
                NaviCommand naviCommand2 = (NaviCommand) objI;
                if (naviCommand2 != null) {
                    mVar3.f296997a.c(naviCommand2);
                }
                return Boolean.TRUE;
            case 28:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i124 = this.v;
                if (i124 != 0) {
                    if (i124 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                b0 b0Var = ((m0) this.f294425w).f296999a;
                this.v = 1;
                b0Var.getClass();
                wo2.l lVar2 = new wo2.l(b0Var, (String) obj3, continuation, i21);
                p0 p0Var3 = p0.f264001a;
                Object objJ3 = skm.e0.J(elm.f.f127540b, lVar2, this);
                return objJ3 == aVar35 ? aVar35 : objJ3;
            default:
                ep6.m mVar4 = (ep6.m) this.f294425w;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i125 = this.v;
                if (i125 == 0) {
                    yhm.o.b(obj2);
                    if (mVar4 instanceof ep6.i) {
                        x xVar = (x) obj3;
                        this.f294425w = null;
                        this.v = 1;
                        TroubleshooterDetailScreenContract$InputData troubleshooterDetailScreenContract$InputData = xVar.f297108r;
                        xVar.C1(new ChatFlowDestination(new ChatTarget.Messages(new ChatFeed.Support(null, null, new TicketCreationContext(troubleshooterDetailScreenContract$InputData.f91886c, (List) null, (List) null, new NewTicketContext.Transaction(troubleshooterDetailScreenContract$InputData.f91884a), 22), 3), v30.t.DEFAULT, null, 4), true));
                        if (Unit.f186387a == aVar36) {
                            return aVar36;
                        }
                    } else if (!(mVar4 instanceof ep6.j) && !(mVar4 instanceof ep6.l) && !(mVar4 instanceof ep6.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    if (i125 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f294425w = obj2;
        this.f294426x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f294426x = obj2;
    }
}
