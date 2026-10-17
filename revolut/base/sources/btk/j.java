package btk;

import aw0.o9;
import buf.a1;
import bvb.r;
import bwb.p;
import c17.s;
import c2d.t;
import c64.b0;
import cli.y;
import com.revolut.chat.data.network.TranscriptApi;
import com.revolut.core.chaosmanagement.domain.model.ChaosManagementNewsItem;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.joint.impl.data.network.JointService;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan;
import com.revolut.feature.rev_points.giftcards.impl.data.network.exception.PendingPurchaseResponseException;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreenContract$ModalStep;
import cv3.u;
import ft3.h1;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kp0.w0;
import n38.x;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import q6i.g0;
import rp0.d0;
import rp0.d2;
import skm.k0;
import vkm.j2;
import zh9.u0;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f18636w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f18637x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, Continuation continuation) {
        super(i, continuation);
        this.u = 4;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j((k) this.f18636w, (f) this.f18637x, continuation, 0);
            case 1:
                return new j((bu4.m) this.f18636w, (dj0.d) this.f18637x, continuation, 1);
            case 2:
                j jVar = new j((a1) this.f18637x, continuation, 2);
                jVar.f18636w = obj2;
                return jVar;
            case 3:
                return new j((r) this.f18636w, (rub.i) this.f18637x, continuation, 3);
            case 4:
                j jVar2 = new j(2, continuation);
                jVar2.f18637x = obj2;
                return jVar2;
            case 5:
                return new j((com.revolut.feature.kyc.impl.screens.documentid_input.b) this.f18636w, (TermsScope) this.f18637x, continuation, 5);
            case 6:
                return new j((by6.k) this.f18636w, (Set) this.f18637x, continuation, 6);
            case 7:
                j jVar3 = new j((com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a) this.f18637x, continuation, 7);
                jVar3.f18636w = obj2;
                return jVar3;
            case 8:
                return new j((com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.b) this.f18636w, (ArrayList) this.f18637x, continuation, 8);
            case 9:
                return new j((s) this.f18636w, (String) this.f18637x, continuation, 9);
            case 10:
                return new j((s) this.f18636w, (aii.m) this.f18637x, continuation, 10);
            case 11:
                return new j((com.revolut.feature.card_order_new.impl.kompot.c) this.f18636w, (Address) this.f18637x, continuation, 11);
            case 12:
                j jVar4 = new j((t) this.f18637x, continuation, 12);
                jVar4.f18636w = obj2;
                return jVar4;
            case 13:
                return new j((c2f.l) this.f18636w, (String) this.f18637x, continuation, 13);
            case 14:
                return new j((c30.h) this.f18636w, (UUID) this.f18637x, continuation, 14);
            case 15:
                return new j((c34.e) this.f18636w, (h1) this.f18637x, continuation, 15);
            case 16:
                return new j((c44.a) this.f18636w, (String) this.f18637x, continuation, 16);
            case 17:
                return new j((zm3.a) this.f18636w, (c48.g) this.f18637x, continuation, 17);
            case 18:
                return new j((c48.g) this.f18636w, (x) this.f18637x, continuation, 18);
            case 19:
                return new j((com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) this.f18636w, (ChaosManagementNewsItem) this.f18637x, continuation, 19);
            case 20:
                return new j((com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) this.f18636w, (PopupMenuItem) this.f18637x, continuation, 20);
            case 21:
                return new j((com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) this.f18636w, (g5a.r) this.f18637x, continuation, 21);
            case 22:
                return new j((c64.e) this.f18636w, (c64.l) this.f18637x, continuation, 22);
            case 23:
                j jVar5 = new j((b0) this.f18637x, continuation, 23);
                jVar5.f18636w = obj2;
                return jVar5;
            case 24:
                return new j((com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f) this.f18637x, continuation, 24);
            case 25:
                j jVar6 = new j((com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f) this.f18637x, continuation, 25);
                jVar6.f18636w = obj2;
                return jVar6;
            case 26:
                j jVar7 = new j((c6b.n) this.f18637x, continuation, 26);
                jVar7.f18636w = obj2;
                return jVar7;
            case 27:
                return new j((c7b.t) this.f18636w, (CobrandedCardsPlan) this.f18637x, continuation, 27);
            case 28:
                return new j((com.revolut.feature_move_money.impl.automation.screen.c) this.f18636w, (MoveMoneyAutomationScreenContract$ModalStep) this.f18637x, continuation, 28);
            default:
                j jVar8 = new j((com.revolut.feature_move_money.impl.automation.screen.c) this.f18637x, continuation, 29);
                jVar8.f18636w = obj2;
                return jVar8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((j) create((ManualTransferData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((j) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((j) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((j) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((j) create((ax4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((j) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object transcriptLink;
        Object objConfirmOutstandingDebts;
        Object objSubmitPlanSubscription;
        Object userInvitationEligibilityByPhone;
        Object userInvitationEligibilityByCode;
        z38.d dVar;
        Object objC;
        com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f fVar;
        Object objA;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                k kVar = (k) this.f18636w;
                a41.s sVar = new a41.s(kVar, (f) this.f18637x, (Continuation) null, 21);
                this.v = 1;
                Object objB = pu7.a.B(kVar.e, "navigate-to-investment-plan-order", sVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    bu4.m mVar = (bu4.m) this.f18636w;
                    b94.s sVar2 = new b94.s(mVar, (dj0.d) this.f18637x, null, 22);
                    this.v = 1;
                    if (u0.b0(mVar.X(), "id_generate_boleto", sVar2, this) == aVar2) {
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
                ManualTransferData manualTransferData = (ManualTransferData) this.f18636w;
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
                a1 a1Var = (a1) this.f18637x;
                buf.n nVar = a1Var.C;
                String str = manualTransferData.f92455a.f92241b.f306286a;
                String str2 = a1Var.F.f18784a.getF92449a().f115083b.f306286a;
                this.f18636w = null;
                this.v = 1;
                Object objA2 = nVar.a(str, str2, this);
                return objA2 == aVar3 ? aVar3 : objA2;
            case 3:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    r rVar = (r) this.f18636w;
                    rub.i iVar = (rub.i) this.f18637x;
                    this.v = 1;
                    Object objB0 = u0.b0(rVar.X(), "DEACTIVATE_BUTTON_LOADING_ID", new b94.s(rVar, iVar, null, 24), this);
                    if (objB0 != obj3) {
                        objB0 = Unit.f186387a;
                    }
                    if (objB0 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                Throwable th10 = (Throwable) this.f18637x;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Boolean bool = (Boolean) this.f18636w;
                    yhm.o.b(obj2);
                    return bool;
                }
                yhm.o.b(obj2);
                boolean z = th10 instanceof PendingPurchaseResponseException;
                Boolean boolValueOf = Boolean.valueOf(z);
                if (z) {
                    long j2 = p.f19303l;
                    this.f18637x = null;
                    this.f18636w = boolValueOf;
                    this.v = 1;
                    if (k0.c(j2, this) == aVar4) {
                        return aVar4;
                    }
                }
                return boolValueOf;
            case 5:
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
                com.revolut.feature.kyc.impl.screens.documentid_input.b bVar = (com.revolut.feature.kyc.impl.screens.documentid_input.b) this.f18636w;
                b94.s sVar3 = new b94.s(bVar, (TermsScope) this.f18637x, null, 26);
                this.v = 1;
                Object objP2 = bVar.p2(this, sVar3);
                return objP2 == aVar5 ? aVar5 : objP2;
            case 6:
                by6.k kVar2 = (by6.k) this.f18636w;
                y yVar = kVar2.f19757q;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    dy6.e eVar = kVar2.o;
                    FreelancerInvoiceSettings freelancerInvoiceSettings = ((by6.f) zi0.c.I(((by6.g) ((j2) yVar.f22677a).getValue()).f19748b)).e;
                    FreelancerInvoice freelancerInvoice = ((by6.f) zi0.c.I(((by6.g) ((j2) yVar.f22677a).getValue()).f19748b)).d;
                    Set set = (Set) this.f18637x;
                    this.v = 1;
                    if (eVar.l(set, freelancerInvoice, freelancerInvoiceSettings, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                yhm.r rVar2 = (yhm.r) this.f18636w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                Data data = (Data) rVar2.f314201a;
                fzg.e eVar2 = (fzg.e) rVar2.f314202b;
                Pair pair = (Pair) rVar2.f314203c;
                com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a aVar8 = (com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a) this.f18637x;
                ou5.b bVar2 = aVar8.o;
                WidgetisedAnalyticsType widgetisedAnalyticsType = ((bzg.k) ((j2) aVar8.f95123w.f22677a).getValue()).f19990a;
                this.f18636w = null;
                this.v = 1;
                Object objM = bVar2.m(data, eVar2, pair, this);
                return objM == aVar7 ? aVar7 : objM;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.b bVar3 = (com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.b) this.f18636w;
                c0l.f fVar2 = new c0l.f((ArrayList) this.f18637x, bVar3, (Continuation) null);
                this.v = 1;
                Object objB2 = pu7.a.B(bVar3.k, "uploadDocumentsAndNavigateNext", fVar2, this);
                return objB2 == aVar9 ? aVar9 : objB2;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    j2 j2Var = ((s) this.f18636w).f20410t;
                    String str3 = (String) this.f18637x;
                    this.v = 1;
                    j2Var.setValue(str3);
                    if (Unit.f186387a == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    s sVar4 = (s) this.f18636w;
                    j60.a aVar12 = sVar4.f20406p;
                    c17.a aVar13 = sVar4.o;
                    String website = ((e17.b) ((aii.m) this.f18637x)).f121898b;
                    aVar13.getClass();
                    Intrinsics.checkNotNullParameter(website, "website");
                    efm.b bVarG = aVar12.G(d0.b(new TextLocalisedClause(R$string.freelancer_business_website_editing_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_business_website_editing_confirmation_subtitle, v.k(new TextLocalisedClause(R$string.freelancer_business_website_editing_confirmation_action_update, null, null, 14), new TextClause(website, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new d2("ITEM_ID_UPDATE_WEBSITE_UPDATE_BUTTON", new TextLocalisedClause(R$string.freelancer_business_website_editing_confirmation_action_cancel, null, null, 14), null, 60), new d2("ITEM_ID_CANCEL_WEBSITE_UPDATE_BUTTON", new TextLocalisedClause(R$string.freelancer_business_website_editing_confirmation_action_update, null, null, 14), null, 60), null, 240));
                    this.v = 1;
                    if (nim.a.a(bVarG, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.card_order_new.impl.kompot.c cVar = (com.revolut.feature.card_order_new.impl.kompot.c) this.f18636w;
                    com.revolut.feature.card_order_new.impl.kompot.a aVar15 = new com.revolut.feature.card_order_new.impl.kompot.a(cVar, (Address) this.f18637x, null);
                    this.v = 1;
                    if (cVar.p2(this, aVar15) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                FlowCollector flowCollector = (FlowCollector) this.f18636w;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    Boolean boolValueOf2 = Boolean.valueOf(((t) this.f18637x).f20739a.a());
                    this.f18636w = null;
                    this.v = 1;
                    if (flowCollector.emit(boolValueOf2, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                c2f.l lVar = (c2f.l) this.f18636w;
                c2f.k kVar3 = new c2f.k(lVar, (String) this.f18637x, null, 1);
                this.v = 1;
                Object objB3 = pu7.a.B(lVar.k, "REGISTER_TAX_ID_ACCOUNT_TASK_ID", kVar3, this);
                return objB3 == aVar17 ? aVar17 : objB3;
            case 14:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    TranscriptApi transcriptApi = ((c30.h) this.f18636w).f20848a;
                    UUID uuid = (UUID) this.f18637x;
                    this.v = 1;
                    transcriptLink = transcriptApi.getTranscriptLink(uuid, this);
                    if (transcriptLink == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    transcriptLink = obj2;
                }
                return ((n20.e) transcriptLink).getUrl();
            case 15:
                c34.e eVar3 = (c34.e) this.f18636w;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    CreditPluginsService creditPluginsService = eVar3.f20873b;
                    String str4 = ((h1) this.f18637x).f137835a;
                    this.v = 1;
                    objConfirmOutstandingDebts = creditPluginsService.confirmOutstandingDebts(str4, this);
                    if (objConfirmOutstandingDebts == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objConfirmOutstandingDebts = obj2;
                }
                return eVar3.f20872a.p((tt3.a) objConfirmOutstandingDebts);
            case 16:
                c44.a aVar20 = (c44.a) this.f18636w;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    CreditPluginsService creditPluginsService2 = aVar20.f21077b;
                    String str5 = (String) this.f18637x;
                    this.v = 1;
                    objSubmitPlanSubscription = creditPluginsService2.submitPlanSubscription(str5, this);
                    if (objSubmitPlanSubscription == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objSubmitPlanSubscription = obj2;
                }
                return aVar20.f21076a.p((tt3.a) objSubmitPlanSubscription);
            case 17:
                c48.g gVar = (c48.g) this.f18637x;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    d58.a aVar23 = d58.f.Companion;
                    zm3.a aVar24 = (zm3.a) this.f18636w;
                    aVar23.getClass();
                    d58.c cVarA = d58.a.a(aVar24);
                    if (cVarA instanceof d58.d) {
                        JointService jointService = gVar.e;
                        String str6 = ((d58.d) cVarA).f111397a;
                        this.v = 1;
                        userInvitationEligibilityByCode = jointService.getUserInvitationEligibilityByCode(str6, this);
                        if (userInvitationEligibilityByCode == aVar22) {
                            return aVar22;
                        }
                        dVar = (z38.d) userInvitationEligibilityByCode;
                    } else {
                        if (!(cVarA instanceof d58.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        JointService jointService2 = gVar.e;
                        String str7 = ((d58.e) cVarA).f111399a;
                        this.v = 2;
                        userInvitationEligibilityByPhone = jointService2.getUserInvitationEligibilityByPhone(str7, this);
                        if (userInvitationEligibilityByPhone == aVar22) {
                            return aVar22;
                        }
                        dVar = (z38.d) userInvitationEligibilityByPhone;
                    }
                } else if (i101 == 1) {
                    yhm.o.b(obj2);
                    userInvitationEligibilityByCode = obj2;
                    dVar = (z38.d) userInvitationEligibilityByCode;
                } else {
                    if (i101 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    userInvitationEligibilityByPhone = obj2;
                    dVar = (z38.d) userInvitationEligibilityByPhone;
                }
                b48.b bVar4 = gVar.f21109b;
                return b48.b.c(dVar).f211957a;
            case 18:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    JointService jointService3 = ((c48.g) this.f18636w).e;
                    x xVar = (x) this.f18637x;
                    Intrinsics.checkNotNullParameter(xVar, "<this>");
                    z38.h hVar = new z38.h(xVar.f211964a, xVar.f211965b, xVar.f211966c);
                    this.v = 1;
                    if (jointService3.sendMcyInvitation(hVar, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 != 0) {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar3 = (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) this.f18636w;
                b94.s sVar5 = new b94.s((ChaosManagementNewsItem) this.f18637x, fVar3, null, 27);
                this.v = 1;
                Object objB4 = pu7.a.B(fVar3.k, "handleBannerClickedAction", sVar5, this);
                return objB4 == aVar26 ? aVar26 : objB4;
            case 20:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar4 = (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) this.f18636w;
                b94.s sVar6 = new b94.s((PopupMenuItem) this.f18637x, fVar4, null, 29);
                this.v = 1;
                Object objB5 = pu7.a.B(fVar4.k, "onPopupItemClick", sVar6, this);
                return objB5 == aVar27 ? aVar27 : objB5;
            case 21:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 != 0) {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar5 = (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) this.f18636w;
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.e eVar4 = new com.revolut.feature.payments.who_to_transfer.impl.ui.chats.e((g5a.r) this.f18637x, fVar5, null);
                this.v = 1;
                Object objB6 = pu7.a.B(fVar5.k, "onSwipeActionClicked", eVar4, this);
                return objB6 == aVar28 ? aVar28 : objB6;
            case 22:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 != 0) {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                c64.e eVar5 = (c64.e) this.f18636w;
                c64.d dVar2 = new c64.d(eVar5, (c64.l) this.f18637x, null, 0);
                this.v = 1;
                Object objB7 = pu7.a.B(eVar5.k, "submit calculator data", dVar2, this);
                return objB7 == aVar29 ? aVar29 : objB7;
            case 23:
                b0 b0Var = (b0) this.f18637x;
                ax4.b bVar5 = (ax4.b) this.f18636w;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    b0Var.H2(b0Var.f21614x, new ah4.f(bVar5, 1));
                    j2 j2Var2 = b0Var.f21615y;
                    u uVarL = w0.l(bVar5);
                    this.f18636w = null;
                    this.v = 1;
                    j2Var2.getClass();
                    j2Var2.g(null, uVarL);
                    if (Unit.f186387a == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f fVar6 = (com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f) this.f18637x;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    i68.e eVar6 = fVar6.f76652x;
                    String str8 = fVar6.o.f76633a.f77103j;
                    this.f18636w = fVar6;
                    this.v = 1;
                    objC = u68.b.c(((i68.i) eVar6).f158890c, str8, null, null, this, 6);
                    if (objC == aVar31) {
                        return aVar31;
                    }
                    fVar = fVar6;
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f fVar7 = (com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f) this.f18636w;
                    yhm.o.b(obj2);
                    fVar = fVar7;
                    objC = obj2;
                }
                fVar.C1((aii.u) objC);
                oki.h.D2(fVar6.E);
                return Unit.f186387a;
            case 25:
                com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f fVar8 = (com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f) this.f18637x;
                n1 n1Var = (n1) this.f18636w;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    if (n1Var instanceof l1) {
                        this.f18636w = null;
                        this.v = 1;
                        Object objP22 = fVar8.p2(this, new c68.n(fVar8, null));
                        if (objP22 != aVar32) {
                            objP22 = Unit.f186387a;
                        }
                        if (objP22 == aVar32) {
                            return aVar32;
                        }
                    } else {
                        if (!(n1Var instanceof j1) && !(n1Var instanceof k1) && !(n1Var instanceof m1)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fVar8.T2();
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                Data data2 = (Data) this.f18636w;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    q5b.a aVar34 = ((c6b.n) this.f18637x).f21771b;
                    this.f18636w = null;
                    this.v = 1;
                    if (((c6b.e) aVar34).a(data2, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    c7b.t tVar = (c7b.t) this.f18636w;
                    a41.s sVar7 = new a41.s(tVar, (CobrandedCardsPlan) this.f18637x, (Continuation) null, 24);
                    this.v = 1;
                    if (tVar.p2(this, sVar7) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature_move_money.impl.automation.screen.c cVar2 = (com.revolut.feature_move_money.impl.automation.screen.c) this.f18636w;
                    com.revolut.feature_move_money.impl.automation.screen.b bVar6 = new com.revolut.feature_move_money.impl.automation.screen.b(cVar2, (MoveMoneyAutomationScreenContract$ModalStep) this.f18637x, null);
                    this.v = 1;
                    if (cVar2.p2(this, bVar6) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                Pair pair2 = (Pair) this.f18636w;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    c7i.p pVar = (c7i.p) pair2.f186385a;
                    c7i.f fVar9 = (c7i.f) pair2.f186386b;
                    AccountWrapper accountWrapperA = pVar.f22020a.a();
                    AccountWrapper accountWrapperA2 = pVar.f22021b.a();
                    if (accountWrapperA == null || accountWrapperA2 == null) {
                        return null;
                    }
                    j7i.a aVarS = oi0.d.s(accountWrapperA, accountWrapperA2, fVar9);
                    AccountWrapper accountWrapper = aVarS.f171918a;
                    AccountWrapper accountWrapper2 = aVarS.f171919b;
                    g0 g0Var = ((com.revolut.feature_move_money.impl.automation.screen.c) this.f18637x).A;
                    this.f18636w = null;
                    this.v = 1;
                    objA = g0Var.a(accountWrapper, accountWrapper2, this);
                    if (objA == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                return (Clause) objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f18636w = obj2;
        this.f18637x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f18637x = obj2;
    }
}
