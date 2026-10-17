package ix6;

import ahe.w0;
import android.os.Parcelable;
import aw0.o9;
import c24.j;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.data.network.models.transfer.mapper.TransferReasonsValuesDtoMapperKt;
import com.revolut.feature.apm.core.impl.data.network.settings.ApmSettingsService;
import com.revolut.feature.apm.core.impl.data.network.transfer.ApmTransferService;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentDraftRequest;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentInfo;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.donations.impl.R$string;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.DonationSchedule;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceItemPayload;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import com.revolut.feature.security_hub.impl.repository.LimitValue;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.statements.api.models.StatementsFormat;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.impl.income_sorter.network.IncomeSorterService;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import ft3.h1;
import imk.p0;
import j54.r0;
import j54.v0;
import j54.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nii.j1;
import nii.n1;
import nii.u1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import retrofit2.Response;
import skm.a2;
import tof.q6;
import vkm.v1;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f169398w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f169399x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f169400y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ahe.t tVar, Continuation continuation) {
        super(2, continuation);
        this.u = 17;
        this.f169399x = tVar;
    }

    private final Object b(Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) this.f169400y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            k01.e eVar = (k01.e) this.f169398w;
            jid.z zVar = new jid.z((k01.l) this.f169399x, coroutineScope);
            this.f169400y = null;
            this.v = 1;
            obj2 = eVar.a(zVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return (k01.n) obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l0((com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g) this.f169398w, this.f169400y, (FreelancerInvoice) this.f169399x, continuation, 0);
            case 1:
                return new l0((com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g) this.f169398w, (FreelancerInvoice) this.f169399x, (String) this.f169400y, continuation);
            case 2:
                return new l0((iz1.m) this.f169398w, (String) this.f169400y, (o02.f) this.f169399x, continuation, 2);
            case 3:
                return new l0((iz1.n) this.f169398w, (String) this.f169400y, (ApmPaymentDraftRequest) this.f169399x, continuation, 3);
            case 4:
                return new l0((iz1.q) this.f169398w, (String) this.f169400y, (TransferReasonsValues) this.f169399x, continuation, 4);
            case 5:
                return new l0((iz1.q) this.f169398w, (String) this.f169400y, (t02.f) this.f169399x, continuation, 5);
            case 6:
                return new l0((j44.a) this.f169398w, (ez3.q) this.f169400y, (h1) this.f169399x, continuation, 6);
            case 7:
                return new l0((j4c.u) this.f169400y, (d3c.e) this.f169399x, continuation, 7);
            case 8:
                return new l0((r0) this.f169398w, (h54.o) this.f169400y, (c84.p) this.f169399x, continuation, 8);
            case 9:
                return new l0((y0) this.f169398w, (String) this.f169400y, (til.r) this.f169399x, continuation, 9);
            case 10:
                return new l0((com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.a) this.f169398w, (String) this.f169400y, (String) this.f169399x, continuation, 10);
            case 11:
                l0 l0Var = new l0(this.f169398w, this.f169399x, false, continuation, 11);
                l0Var.f169400y = obj2;
                return l0Var;
            case 12:
                return new l0((jc6.s) this.f169398w, (dj0.d) this.f169400y, (ba6.l) this.f169399x, continuation, 12);
            case 13:
                return new l0((com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.d) this.f169398w, (String) this.f169400y, (xy3.x) this.f169399x, continuation, 13);
            case 14:
                return new l0((com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.c) this.f169398w, (bz3.e) this.f169400y, (List) this.f169399x, continuation, 14);
            case 15:
                return new l0((jh6.g) this.f169398w, (String) this.f169400y, (dj0.d) this.f169399x, continuation, 15);
            case 16:
                return new l0((jh9.p) this.f169398w, (PaymentData) this.f169400y, (TransferScheduleData) this.f169399x, continuation, 16);
            case 17:
                l0 l0Var2 = new l0((ahe.t) this.f169399x, continuation);
                l0Var2.f169400y = obj2;
                return l0Var2;
            case 18:
                return new l0((com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.a) this.f169398w, (String) this.f169400y, (LinkedHashSet) this.f169399x, continuation, 18);
            case 19:
                return new l0((jik.i) this.f169398w, (Function0) this.f169400y, (jik.m) this.f169399x, continuation, 19);
            case 20:
                return new l0((jm8.b) this.f169400y, (String) this.f169399x, continuation, 20);
            case 21:
                l0 l0Var3 = new l0(this.f169398w, this.f169399x, false, continuation, 21);
                l0Var3.f169400y = obj2;
                return l0Var3;
            case 22:
                return new l0((com.revolut.feature.credit.card.impl.ui.direct_debit_selection.a) this.f169398w, (String) this.f169400y, (String) this.f169399x, continuation, 22);
            case 23:
                return new l0((jtj.n) this.f169398w, (String) this.f169400y, (String) this.f169399x, continuation, 23);
            case 24:
                return new l0((com.revolut.feature.security_hub.impl.ui.transactions_limits_change.a) this.f169398w, (String) this.f169400y, (Boolean) this.f169399x, continuation, 24);
            case 25:
                return new l0((com.revolut.feature.security_hub.impl.ui.transactions_limits_change.a) this.f169398w, (LimitValue) this.f169400y, (OutboundTransactionLimit) this.f169399x, continuation, 25);
            case 26:
                l0 l0Var4 = new l0(this.f169398w, this.f169399x, false, continuation, 26);
                l0Var4.f169400y = obj2;
                return l0Var4;
            case 27:
                return new l0((jyk.r) this.f169398w, (String) this.f169400y, (List) this.f169399x, continuation, 27);
            case 28:
                l0 l0Var5 = new l0(this.f169398w, this.f169399x, false, continuation, 28);
                l0Var5.f169400y = obj2;
                return l0Var5;
            default:
                l0 l0Var6 = new l0(this.f169398w, this.f169399x, false, continuation, 29);
                l0Var6.f169400y = obj2;
                return l0Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((l0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((l0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((l0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v28 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objUpdateSettings;
        fz1.f dVar;
        Object objPostPayDraftPayment;
        Object objPostConfirmPayment;
        Object objPatchPayment;
        c24.j jVar;
        Object objSubmitSolicitorSelection;
        Object objA;
        j4c.u uVar;
        Object objY2;
        char c2;
        fim.a aVar;
        int i;
        int dayOfMonth;
        pfm.h hVar;
        int i2;
        int dayOfMonth2;
        int i3;
        Continuation continuation;
        Clause clauseW;
        a2 a2Var;
        Object objX;
        Object objY22;
        Object objNotify;
        jm8.b bVar;
        l0 l0Var = this;
        int i5 = l0Var.u;
        int i6 = 0;
        int i21 = 10;
        ApmPaymentInfo apmPaymentInfo = null;
        Object obj3 = l0Var.f169399x;
        switch (i5) {
            case 0:
                Object obj4 = l0Var.f169400y;
                com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar = (com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g) l0Var.f169398w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i22 = l0Var.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                String strQ = j6.a.q("remove_invoice_item_", ((FreelancerInvoiceItemPayload) obj4).f73393a);
                g84.u uVar2 = new g84.u(gVar, (FreelancerInvoice) obj3, obj4, null, 28);
                l0Var.v = 1;
                Object objB = pu7.a.B(gVar.k, strQ, uVar2, l0Var);
                return objB == aVar2 ? aVar2 : objB;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i32 = l0Var.v;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar2 = (com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g) l0Var.f169398w;
                n0 n0Var = new n0(gVar2, (FreelancerInvoice) obj3, (String) l0Var.f169400y, (Continuation) null);
                l0Var.v = 1;
                Object objP2 = gVar2.p2(l0Var, n0Var);
                return objP2 == aVar3 ? aVar3 : objP2;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i33 = l0Var.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    ApmSettingsService apmSettingsService = ((iz1.m) l0Var.f169398w).f169839a;
                    String str = (String) l0Var.f169400y;
                    o02.f fVar = (o02.f) obj3;
                    Intrinsics.checkNotNullParameter(fVar, "<this>");
                    List<o02.e> list = fVar.f221102a;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                    for (o02.e eVar : list) {
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        o02.c cVar = eVar.f221101b;
                        o02.d dVar2 = eVar.f221100a;
                        if (cVar instanceof o02.a) {
                            dVar = new fz1.b(dVar2.a(), ((o02.a) cVar).f221098a);
                        } else {
                            if (!(cVar instanceof o02.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dVar = new fz1.d(dVar2.a(), ((o02.b) cVar).f221099a);
                        }
                        arrayList.add(dVar);
                    }
                    fz1.g gVar3 = new fz1.g(arrayList);
                    l0Var.v = 1;
                    objUpdateSettings = apmSettingsService.updateSettings(str, gVar3, l0Var);
                    if (objUpdateSettings == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objUpdateSettings = obj2;
                }
                return ue8.c.U((fz1.g) objUpdateSettings);
            case 3:
                iz1.n nVar = (iz1.n) l0Var.f169398w;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i43 = l0Var.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    ApmTransferService apmTransferService = nVar.f169840a;
                    String str2 = (String) l0Var.f169400y;
                    ApmPaymentDraftRequest apmPaymentDraftRequest = (ApmPaymentDraftRequest) obj3;
                    Intrinsics.checkNotNullParameter(apmPaymentDraftRequest, "<this>");
                    hz1.f fVar2 = new hz1.f(oc.c.B(apmPaymentDraftRequest.f62202b), mo3.a.p(apmPaymentDraftRequest.f62203c), apmPaymentDraftRequest.d);
                    wj0.b bVar2 = nVar.f169841b;
                    l0Var.v = 1;
                    objPostPayDraftPayment = apmTransferService.postPayDraftPayment(str2, fVar2, bVar2, l0Var);
                    if (objPostPayDraftPayment == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objPostPayDraftPayment = obj2;
                }
                hz1.c cVar2 = (hz1.c) objPostPayDraftPayment;
                Intrinsics.checkNotNullParameter(cVar2, "<this>");
                return new k71.c(cVar2.getTransactionId());
            case 4:
                iz1.q qVar = (iz1.q) l0Var.f169398w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i59 = l0Var.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    pfm.a aVarR = qVar.f169846c.r(qVar.e);
                    l0Var.v = 1;
                    if (nim.a.a(aVarR, l0Var) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i59 != 1) {
                        if (i59 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objPostConfirmPayment = obj2;
                        hz1.b bVar3 = (hz1.b) objPostConfirmPayment;
                        Intrinsics.checkNotNullParameter(bVar3, "<this>");
                        return new k71.c(bVar3.getTransactionId());
                    }
                    yhm.o.b(obj2);
                }
                ApmTransferService apmTransferService2 = qVar.f169844a;
                String str3 = (String) l0Var.f169400y;
                TransferReasonsValues transferReasonsValues = (TransferReasonsValues) obj3;
                hz1.a aVar7 = new hz1.a(transferReasonsValues != null ? TransferReasonsValuesDtoMapperKt.toDto(transferReasonsValues) : 0);
                wj0.b bVar4 = qVar.e;
                l0Var.v = 2;
                objPostConfirmPayment = apmTransferService2.postConfirmPayment(str3, aVar7, bVar4, l0Var);
                if (objPostConfirmPayment == aVar6) {
                    return aVar6;
                }
                hz1.b bVar32 = (hz1.b) objPostConfirmPayment;
                Intrinsics.checkNotNullParameter(bVar32, "<this>");
                return new k71.c(bVar32.getTransactionId());
            case 5:
                t02.f fVar3 = (t02.f) obj3;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i66 = l0Var.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    ApmTransferService apmTransferService3 = ((iz1.q) l0Var.f169398w).f169844a;
                    String str4 = (String) l0Var.f169400y;
                    hz1.e eVarL = mif.a.L(fVar3);
                    l0Var.v = 1;
                    objPatchPayment = apmTransferService3.patchPayment(str4, eVarL, l0Var);
                    if (objPatchPayment == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objPatchPayment = obj2;
                }
                hz1.g gVar4 = (hz1.g) ((Map) objPatchPayment).get(fVar3.f266857b.getMethod());
                if (gVar4 != null) {
                    Intrinsics.checkNotNullParameter(gVar4, "<this>");
                    apmPaymentInfo = new ApmPaymentInfo(gVar4.getPaymentIntentId(), gVar4.getBeneficiaryId(), gVar4.getRecipientName());
                }
                if (apmPaymentInfo != null) {
                    return apmPaymentInfo;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 6:
                j44.a aVar9 = (j44.a) l0Var.f169398w;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i74 = l0Var.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    c24.k kVar = aVar9.d;
                    ez3.q domain = (ez3.q) l0Var.f169400y;
                    Intrinsics.checkNotNullParameter(domain, "domain");
                    if (domain instanceof ez3.o) {
                        ez3.o oVar = (ez3.o) domain;
                        j.Companion aVar11 = c24.j.INSTANCE;
                        j.b customDetails = new j.b(oVar.f130910a, oVar.f130911b, oVar.f130912c, oVar.d, oo3.a.d(oVar.e));
                        aVar11.getClass();
                        Intrinsics.checkNotNullParameter(customDetails, "customDetails");
                        jVar = new c24.j(null, customDetails);
                    } else {
                        if (!(domain instanceof ez3.p)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        j.Companion aVar12 = c24.j.INSTANCE;
                        String partnerId = ((ez3.p) domain).f130913a;
                        aVar12.getClass();
                        Intrinsics.checkNotNullParameter(partnerId, "partnerId");
                        jVar = new c24.j(partnerId, null);
                    }
                    CreditPluginsService creditPluginsService = aVar9.f171290a;
                    String str5 = ((h1) obj3).f137835a;
                    l0Var.v = 1;
                    objSubmitSolicitorSelection = creditPluginsService.submitSolicitorSelection(str5, jVar, l0Var);
                    if (objSubmitSolicitorSelection == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objSubmitSolicitorSelection = obj2;
                }
                return aVar9.f171291b.p((tt3.a) objSubmitSolicitorSelection);
            case 7:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i92 = l0Var.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    j4c.u uVar3 = (j4c.u) l0Var.f169400y;
                    opj.b bVar5 = uVar3.f171366w;
                    d3c.e eVar2 = (d3c.e) obj3;
                    byte[] bArr = eVar2.f111013b;
                    String str6 = eVar2.f111012a;
                    l0Var.f169398w = uVar3;
                    l0Var.v = 1;
                    objA = bVar5.a(bArr, str6, l0Var);
                    if (objA == aVar13) {
                        return aVar13;
                    }
                    uVar = uVar3;
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uVar = (j4c.u) l0Var.f169398w;
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                uVar.C1((aii.u) objA);
                return Unit.f186387a;
            case 8:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i96 = l0Var.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    r0 r0Var = (r0) l0Var.f169398w;
                    inh.g gVar5 = new inh.g((h54.o) l0Var.f169400y, (c84.p) obj3, rVar, 7);
                    l0Var.v = 1;
                    if (r0Var.Y2(l0Var, gVar5) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i99 = l0Var.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    y0 y0Var = (y0) l0Var.f169398w;
                    v0 v0Var = new v0(y0Var, (String) l0Var.f169400y, (til.r) obj3, (Continuation) null, 0);
                    l0Var.v = 1;
                    if (y0Var.Y2(l0Var, v0Var) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i100 = l0Var.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.a aVar17 = (com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.a) l0Var.f169398w;
                v0 v0Var2 = new v0(aVar17, (String) l0Var.f169400y, (String) obj3, (Continuation) null, 1);
                l0Var.v = 1;
                Object objB2 = pu7.a.B(aVar17.k, "delete debt", v0Var2, l0Var);
                return objB2 == aVar16 ? aVar16 : objB2;
            case 11:
                jc6.s sVar = (jc6.s) l0Var.f169398w;
                n1 n1Var = (n1) l0Var.f169400y;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i101 = l0Var.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    if (n1Var instanceof j1) {
                        l0Var.f169400y = null;
                        l0Var.v = 1;
                        objY2 = jc6.s.y2(sVar, l0Var);
                        if (objY2 == aVar18) {
                            return aVar18;
                        }
                    }
                    sVar.v2(aii.q.f5292a);
                    return Unit.f186387a;
                }
                if (i101 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                objY2 = obj2;
                jc6.k kVar2 = (jc6.k) objY2;
                if (kVar2 != null) {
                    nd.o oVar2 = sVar.B;
                    f01.c cVar3 = sVar.C;
                    String string = cVar3.b(new TextLocalisedClause(R$string.donations_common_share, null, null, 14)).toString();
                    String string2 = cVar3.b(new TextLocalisedClause(R$string.charity_donation_success_no_amount_share_message, zhm.v.k(((ba6.l) obj3).f13939b, kVar2.f172718b), null, 12)).toString();
                    oVar2.getClass();
                    sVar.C1(new BridgeDestination(nd.o.i(string, string2)));
                }
                sVar.v2(aii.q.f5292a);
                return Unit.f186387a;
            case 12:
                ba6.l lVar = (ba6.l) obj3;
                jc6.s sVar2 = (jc6.s) l0Var.f169398w;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i102 = l0Var.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    ((jc6.c) sVar2.A).getClass();
                    sVar2.X1(new nii.y0("DONATION_LOADING_VIEW_ID", new nii.c0(null, null, null, false, null, false, false, null, 1919), false, 4));
                    dj0.d money = (dj0.d) l0Var.f169400y;
                    l0Var.v = 1;
                    aa6.c cVar4 = sVar2.f172732s;
                    String recurringDonationId = ((jc6.j) sVar2.t2()).f172716g;
                    c2 = 1;
                    if (recurringDonationId != null) {
                        DonationSchedule donationSchedule = ((jc6.j) sVar2.t2()).f172713a;
                        String charityId = lVar.f13938a;
                        String charityName = lVar.f13939b;
                        aVar = aVar19;
                        long jB = jli.b.b(donationSchedule.f72099b);
                        Period period = donationSchedule.f72098a;
                        sa6.t tVar = (sa6.t) cVar4;
                        tVar.getClass();
                        Intrinsics.checkNotNullParameter(recurringDonationId, "recurringDonationId");
                        Intrinsics.checkNotNullParameter(charityId, "charityId");
                        Intrinsics.checkNotNullParameter(charityName, "charityName");
                        Intrinsics.checkNotNullParameter(money, "money");
                        Intrinsics.checkNotNullParameter(period, "period");
                        LocalDate localDate = new LocalDate(jB);
                        xua.a aVar20 = tVar.f261346b;
                        ibd.e eVar3 = new ibd.e(recurringDonationId, period, ibd.h.INTERNAL_CHARITY, DateTime.now(), new LocalDate(jB), null, null, null, null, null, null, YearClass.CLASS_2016);
                        ibd.f fVar4 = ibd.f.ACTIVE;
                        String str7 = money.f115083b.f306286a;
                        long j2 = money.f115082a;
                        if (Intrinsics.f(period, jli.e.f175843c)) {
                            dayOfMonth2 = localDate.getDayOfWeek();
                        } else if (Intrinsics.f(period, jli.e.f175845h)) {
                            dayOfMonth2 = localDate.getDayOfMonth();
                        } else {
                            i2 = 1;
                            ufm.i iVar = new ufm.i(((yua.q) aVar20).y(new qua.p(eVar3, fVar4, charityId, null, null, null, null, null, str7, Long.valueOf(j2), charityName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, i2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1800, 33554429), null, null, null), new sa6.a(new sa6.p(tVar, 2), 8), 0);
                            Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                            hVar = new pfm.h(iVar, 4);
                            Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
                        }
                        i2 = dayOfMonth2;
                        ufm.i iVar2 = new ufm.i(((yua.q) aVar20).y(new qua.p(eVar3, fVar4, charityId, null, null, null, null, null, str7, Long.valueOf(j2), charityName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, i2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1800, 33554429), null, null, null), new sa6.a(new sa6.p(tVar, 2), 8), 0);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                        hVar = new pfm.h(iVar2, 4);
                        Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
                    } else {
                        aVar = aVar19;
                        DonationSchedule donationSchedule2 = ((jc6.j) sVar2.t2()).f172713a;
                        String charityId2 = lVar.f13938a;
                        String charityName2 = lVar.f13939b;
                        long jB2 = jli.b.b(donationSchedule2.f72099b);
                        Period period2 = donationSchedule2.f72098a;
                        sa6.t tVar2 = (sa6.t) cVar4;
                        tVar2.getClass();
                        Intrinsics.checkNotNullParameter(charityId2, "charityId");
                        Intrinsics.checkNotNullParameter(charityName2, "charityName");
                        Intrinsics.checkNotNullParameter(money, "money");
                        Intrinsics.checkNotNullParameter(period2, "period");
                        LocalDate localDate2 = new LocalDate(jB2);
                        xua.a aVar21 = tVar2.f261346b;
                        ibd.e eVar4 = new ibd.e("", period2, ibd.h.INTERNAL_CHARITY, DateTime.now(), localDate2, null, null, null, null, null, null, YearClass.CLASS_2016);
                        ibd.f fVar5 = ibd.f.ACTIVE;
                        String str8 = money.f115083b.f306286a;
                        long j3 = money.f115082a;
                        if (Intrinsics.f(period2, jli.e.f175843c)) {
                            dayOfMonth = localDate2.getDayOfWeek();
                        } else if (Intrinsics.f(period2, jli.e.f175845h)) {
                            dayOfMonth = localDate2.getDayOfMonth();
                        } else {
                            i = 1;
                            pfm.h hVar2 = new pfm.h(xua.a.c(aVar21, new qua.p(eVar4, fVar5, charityId2, null, null, null, null, null, str8, Long.valueOf(j3), charityName2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, i, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1800, 33554429), null, null, null, null, null, 62), 4);
                            Intrinsics.checkNotNullExpressionValue(hVar2, "ignoreElement(...)");
                            hVar = hVar2;
                        }
                        i = dayOfMonth;
                        pfm.h hVar22 = new pfm.h(xua.a.c(aVar21, new qua.p(eVar4, fVar5, charityId2, null, null, null, null, null, str8, Long.valueOf(j3), charityName2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, i, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1800, 33554429), null, null, null, null, null, 62), 4);
                        Intrinsics.checkNotNullExpressionValue(hVar22, "ignoreElement(...)");
                        hVar = hVar22;
                    }
                    efm.b bVarH = hVar.e(sVar2.f172731r.k0(AccountId.Personal.f51414a)).e(((mjf.b0) sVar2.f172734w).g(new q6[0])).h(sjg.a.b(sVar2.v));
                    Intrinsics.checkNotNullExpressionValue(bVarH, "compose(...)");
                    l0Var = this;
                    Object objA2 = nim.a.a(bVarH, l0Var);
                    fim.a aVar22 = aVar;
                    Object obj5 = objA2;
                    if (objA2 != aVar22) {
                        obj5 = Unit.f186387a;
                    }
                    if (obj5 == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    c2 = 1;
                }
                jc6.b bVar6 = sVar2.A;
                String charityName3 = lVar.f13939b;
                dj0.d money2 = (dj0.d) l0Var.f169400y;
                DonationSchedule donationSchedule3 = ((jc6.j) sVar2.t2()).f172713a;
                ba6.l lVar2 = (ba6.l) ((jc6.j) sVar2.t2()).f172714b.getContent();
                boolean z = lVar2 != null ? lVar2.k : false;
                ((jc6.c) bVar6).getClass();
                Intrinsics.checkNotNullParameter(charityName3, "charityName");
                Intrinsics.checkNotNullParameter(money2, "money");
                Intrinsics.checkNotNullParameter(donationSchedule3, "donationSchedule");
                Period period3 = donationSchedule3.f72098a;
                if (Intrinsics.f(period3, jli.e.f175841a)) {
                    i3 = R$string.donations_recurring_payments_daily_success_title;
                } else if (Intrinsics.f(period3, jli.e.f175843c) || Intrinsics.f(period3, jli.e.d)) {
                    i3 = R$string.donations_recurring_payments_weekly_success_title;
                } else {
                    if (!Intrinsics.f(period3, jli.e.f175845h)) {
                        throw new IllegalStateException("Recurring donation period must always be selected");
                    }
                    i3 = R$string.donations_recurring_payments_monthly_success_title;
                }
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i3, zhm.v.k(new MoneyClause(money2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), charityName3), null, 12);
                LocalDate localDate3 = donationSchedule3.f72099b;
                TextLocalisedClause textLocalisedClause2 = localDate3 != null ? new TextLocalisedClause(R$string.donations_recurring_payments_success_subtitle, zhm.v.k(new MoneyClause(money2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TimeClause(jli.b.b(localDate3), TimeClause.Format.DateEditable.f57960b, null, null, 12)), null, 12) : new TextLocalisedClause(R$string.charity_donation_success_subtitle, null, null, 14);
                if (z) {
                    continuation = null;
                    clauseW = yoj.b.w(new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.charity_donation_success_share_with_your_friends, null, new Click(30, (Integer) null, (Object) null, "DONATION_SHARE_LINK_ID", false), 10));
                } else {
                    continuation = null;
                    clauseW = null;
                }
                Clause[] elements = new Clause[2];
                elements[0] = textLocalisedClause2;
                elements[c2] = clauseW;
                Intrinsics.checkNotNullParameter(elements, "elements");
                return yji.l.a1(sVar2, sVar2.X1(new nii.y0("DONATION_SUCCESS_STATUS_VIEW_ID", new nii.j0((Clause) textLocalisedClause, (Clause) new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092), false, 4)), null, null, new l0((Object) sVar2, (Object) lVar, false, continuation, 11), 3);
            case 13:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i103 = l0Var.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.d dVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.d) l0Var.f169398w;
                    v0 v0Var3 = new v0(dVar3, (String) l0Var.f169400y, (xy3.x) obj3, (Continuation) null, 2);
                    l0Var.v = 1;
                    if (dVar3.p2(l0Var, v0Var3) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i104 = l0Var.v;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.c cVar5 = (com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.flow.c) l0Var.f169398w;
                afa.u uVar4 = new afa.u(cVar5, (bz3.e) l0Var.f169400y, (List) obj3, (Continuation) null, 29);
                l0Var.v = 1;
                Object objB3 = pu7.a.B(cVar5.k, "upload_photos", uVar4, l0Var);
                return objB3 == aVar24 ? aVar24 : objB3;
            case 15:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i105 = l0Var.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    jh6.g gVar6 = (jh6.g) l0Var.f169398w;
                    v0 v0Var4 = new v0(gVar6, (String) l0Var.f169400y, (dj0.d) obj3, (Continuation) null, 3);
                    l0Var.v = 1;
                    if (gVar6.p2(l0Var, v0Var4) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i106 = l0Var.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    jh9.p pVar = (jh9.p) l0Var.f169398w;
                    v0 v0Var5 = new v0(pVar, (PaymentData) l0Var.f169400y, (TransferScheduleData) obj3, (Continuation) null, 4);
                    l0Var.v = 1;
                    if (u0.b0(pVar.X(), "FORM_AMOUNT_SCREEN_BUTTON_LOADING_TAG", v0Var5, l0Var) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                ahe.t tVar3 = (ahe.t) obj3;
                CoroutineScope coroutineScope = (CoroutineScope) l0Var.f169400y;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i107 = l0Var.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    a2 a2VarC = skm.e0.C(coroutineScope, null, null, new p0(tVar3, rVar, 29), 3);
                    try {
                        w0 w0Var = (w0) tVar3;
                        w0Var.getClass();
                        zfd.e eVarW = zi0.c.w(new v1(new ahe.j0(w0Var, rVar, i6)));
                        l0Var.f169400y = null;
                        l0Var.f169398w = a2VarC;
                        l0Var.v = 1;
                        objX = vkm.q.x(eVarW, l0Var);
                        if (objX == aVar27) {
                            return aVar27;
                        }
                        a2Var = a2VarC;
                    } catch (Throwable th10) {
                        th = th10;
                        a2Var = a2VarC;
                        a2Var.f(null);
                        throw th;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a2Var = (a2) l0Var.f169398w;
                    try {
                        yhm.o.b(obj2);
                        objX = obj2;
                    } catch (Throwable th11) {
                        th = th11;
                        a2Var.f(null);
                        throw th;
                    }
                }
                Data data = (Data) objX;
                a2Var.f(null);
                return data;
            case 18:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i108 = l0Var.v;
                if (i108 != 0) {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.a aVar29 = (com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.a) l0Var.f169398w;
                ji6.d dVar4 = new ji6.d(aVar29, (String) l0Var.f169400y, (LinkedHashSet) obj3, null);
                l0Var.v = 1;
                Object objP22 = aVar29.p2(l0Var, dVar4);
                return objP22 == aVar28 ? aVar28 : objP22;
            case 19:
                Function0 function0 = (Function0) l0Var.f169400y;
                jik.i iVar3 = (jik.i) l0Var.f169398w;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i109 = l0Var.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    inh.g gVar7 = new inh.g(iVar3, (jik.m) obj3, rVar, 17);
                    l0Var.v = 1;
                    objY22 = iVar3.Y2(l0Var, gVar7);
                    if (objY22 == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objY22 = obj2;
                }
                PromptMarketingScreen promptMarketingScreen = (PromptMarketingScreen) objY22;
                if (promptMarketingScreen != null) {
                    iVar3.N2(promptMarketingScreen, ModalDestination.Style.POPUP.f98311a, new ac1.b(i21, function0));
                } else {
                    function0.invoke();
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i110 = l0Var.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    jm8.b bVar7 = (jm8.b) l0Var.f169400y;
                    l0Var.f169398w = bVar7;
                    l0Var.v = 1;
                    objNotify = bVar7.f176489a.notify((String) obj3, l0Var);
                    if (objNotify == aVar31) {
                        return aVar31;
                    }
                    bVar = bVar7;
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (jm8.b) l0Var.f169398w;
                    yhm.o.b(obj2);
                    objNotify = obj2;
                }
                jm8.b.a(bVar, (Response) objNotify);
                return Unit.f186387a;
            case 21:
                CoroutineScope coroutineScope2 = (CoroutineScope) l0Var.f169400y;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i111 = l0Var.v;
                if (i111 != 0) {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                List list2 = (List) l0Var.f169398w;
                jr1.e eVar5 = (jr1.e) obj3;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(skm.e0.g(coroutineScope2, null, null, new jec.p(eVar5, (TermsScope) it8.next(), rVar, 27), 3));
                }
                l0Var.f169400y = null;
                l0Var.v = 1;
                Object objH = skm.e0.h(arrayList2, l0Var);
                return objH == aVar32 ? aVar32 : objH;
            case 22:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i112 = l0Var.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.direct_debit_selection.a aVar34 = (com.revolut.feature.credit.card.impl.ui.direct_debit_selection.a) l0Var.f169398w;
                bld.k kVar3 = new bld.k(aVar34, (String) l0Var.f169400y, (String) obj3, null);
                l0Var.v = 1;
                Object objB4 = pu7.a.B(aVar34.k, "account confirmation", kVar3, l0Var);
                return objB4 == aVar33 ? aVar33 : objB4;
            case 23:
                jtj.n nVar2 = (jtj.n) l0Var.f169398w;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i113 = l0Var.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    IncomeSorterService incomeSorterService = nVar2.f178523c;
                    String str9 = (String) l0Var.f169400y;
                    l0Var.v = 1;
                    if (incomeSorterService.deleteIncomeSorter(str9, l0Var) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i113 != 1) {
                        if (i113 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                l0Var.v = 2;
                if (nVar2.d.d((String) obj3, false, l0Var) == aVar35) {
                    return aVar35;
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i114 = l0Var.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.security_hub.impl.ui.transactions_limits_change.a aVar37 = (com.revolut.feature.security_hub.impl.ui.transactions_limits_change.a) l0Var.f169398w;
                    jwc.q qVar2 = new jwc.q(aVar37, (String) l0Var.f169400y, (Boolean) obj3, null, 1);
                    l0Var.v = 1;
                    if (aVar37.p2(l0Var, qVar2) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i115 = l0Var.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.security_hub.impl.ui.transactions_limits_change.a aVar39 = (com.revolut.feature.security_hub.impl.ui.transactions_limits_change.a) l0Var.f169398w;
                    jwc.r rVar = new jwc.r(aVar39, (LimitValue) l0Var.f169400y, (OutboundTransactionLimit) obj3, null, 1);
                    l0Var.v = 1;
                    if (aVar39.p2(l0Var, rVar) == aVar38) {
                        return aVar38;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                jyb.c cVar6 = (jyb.c) l0Var.f169398w;
                FlowCollector flowCollector = (FlowCollector) l0Var.f169400y;
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                int i116 = l0Var.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    if (((nyb.b0) cVar6.f179359l).b()) {
                        Flow flowQ = vkm.q.q(mo3.a.g(vkm.q.B(new jkc.g(cVar6, rVar, 24), vkm.q.P(new iyg.b0((Flow) obj3, i21), 1)), null, null, 3));
                        i52.l lVar3 = new i52.l(flowCollector, cVar6, 23);
                        l0Var.f169400y = null;
                        l0Var.v = 1;
                        if (flowQ.collect(lVar3, l0Var) == aVar40) {
                            return aVar40;
                        }
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                int i117 = l0Var.v;
                if (i117 != 0) {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                l0Var.v = 1;
                Object objB5 = ((jyk.r) l0Var.f169398w).f.b(l0Var, (String) l0Var.f169400y, (List) obj3);
                return objB5 == aVar41 ? aVar41 : objB5;
            case 28:
                return b(obj2);
            default:
                String str10 = (String) l0Var.f169400y;
                fim.a aVar42 = fim.a.COROUTINE_SUSPENDED;
                int i118 = l0Var.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    l0Var.f169400y = null;
                    l0Var.v = 1;
                    if (com.revolut.feature.statements.impl.ui.savings.a.I2((com.revolut.feature.statements.impl.ui.savings.a) l0Var.f169398w, str10, (StatementsFormat) obj3, l0Var) == aVar42) {
                        return aVar42;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar, FreelancerInvoice freelancerInvoice, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f169398w = gVar;
        this.f169399x = freelancerInvoice;
        this.f169400y = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f169398w = obj2;
        this.f169400y = obj3;
        this.f169399x = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f169400y = obj2;
        this.f169399x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj2, Object obj3, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f169398w = obj2;
        this.f169399x = obj3;
    }
}
