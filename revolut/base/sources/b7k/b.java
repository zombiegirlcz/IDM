package b7k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestDirection;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.models.recipients.ApmRecipientSettings;
import com.revolut.feature.apm.core.models.recipients.ApmRecipientSettingsValue;
import com.revolut.feature.payments.money_request.api.model.MoneyRequestAction;
import com.revolut.retail.feature.payments.money_request.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m3j.h;
import org.jetbrains.annotations.NotNull;
import thf.m;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wv9.e f13065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f13066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z80.b f13067c;
    public final c3j.b d;
    public final h e;

    public b(wv9.e moneyRequestSplitBillMapper, m transactionTextResourcesMapper, z80.b phoneToolsProvider, c3j.b bankInformationProvider, h beneficiaryAccountFieldsMapper) {
        Intrinsics.checkNotNullParameter(moneyRequestSplitBillMapper, "moneyRequestSplitBillMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(bankInformationProvider, "bankInformationProvider");
        Intrinsics.checkNotNullParameter(beneficiaryAccountFieldsMapper, "beneficiaryAccountFieldsMapper");
        this.f13065a = moneyRequestSplitBillMapper;
        this.f13066b = transactionTextResourcesMapper;
        this.f13067c = phoneToolsProvider;
        this.d = bankInformationProvider;
        this.e = beneficiaryAccountFieldsMapper;
    }

    public static ArrayList a(MoneyRequest moneyRequest, xv9.c cVar) {
        Iterable<MoneyRequestAction> iterableK;
        MoneyRequestAction.ApmSettings apmSettings;
        ApmRecipientSettingsValue.BlockIncomingMoneyRequests blockIncomingMoneyRequests;
        ActionsView.Item item;
        ApmRecipient apmRecipient;
        ApmRecipientSettings f62151h;
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        Intrinsics.checkNotNullParameter(moneyRequest, "<this>");
        if (com.revolut.domain.models.moneyrequest.b.f(moneyRequest)) {
            iterableK = f0.f322471a;
        } else {
            boolean zB = com.revolut.domain.models.moneyrequest.b.b(moneyRequest);
            MoneyRequestAction.Approve approve = MoneyRequestAction.Approve.f79592b;
            if (zB) {
                iterableK = u.c(approve);
            } else if (moneyRequest.f60322n != MoneyRequestDirection.INCOMING) {
                boolean zC = com.revolut.domain.models.moneyrequest.b.c(moneyRequest);
                MoneyRequestAction.Cancel cancel = MoneyRequestAction.Cancel.f79593b;
                iterableK = zC ? v.k(MoneyRequestAction.SharePaymentLink.f79596b, cancel) : com.revolut.domain.models.moneyrequest.b.e(moneyRequest) ? v.k(MoneyRequestAction.Remind.f79595b, cancel) : u.c(cancel);
            } else if (cVar != null) {
                Intrinsics.checkNotNullParameter(cVar, "<this>");
                if (cVar instanceof xv9.a) {
                    ApmRecipientSettings f62151h2 = ((xv9.a) cVar).f309224a.getF62151h();
                    if (f62151h2 != null && (blockIncomingMoneyRequests = f62151h2.f62114a) != null) {
                        apmSettings = new MoneyRequestAction.ApmSettings(blockIncomingMoneyRequests);
                    }
                    MoneyRequestAction[] elements = {approve, MoneyRequestAction.Reject.f79594b, apmSettings};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    iterableK = kotlin.collections.d.L(elements);
                } else if (!(cVar instanceof xv9.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                apmSettings = null;
                MoneyRequestAction[] elements2 = {approve, MoneyRequestAction.Reject.f79594b, apmSettings};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                iterableK = kotlin.collections.d.L(elements2);
            } else {
                apmSettings = null;
                MoneyRequestAction[] elements22 = {approve, MoneyRequestAction.Reject.f79594b, apmSettings};
                Intrinsics.checkNotNullParameter(elements22, "elements");
                iterableK = kotlin.collections.d.L(elements22);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (MoneyRequestAction moneyRequestAction : iterableK) {
            if (moneyRequestAction instanceof MoneyRequestAction.Approve) {
                item = new ActionsView.Item(moneyRequestAction.f79590a, mx0.d.ACCENT, false, null, null, new TextLocalisedClause(R$string.money_request_details_send_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, moneyRequestAction, null, 24476);
            } else if (moneyRequestAction instanceof MoneyRequestAction.SharePaymentLink) {
                item = new ActionsView.Item(moneyRequestAction.f79590a, mx0.d.ACCENT, false, null, null, new TextLocalisedClause(R$string.payment_link_request_action_share, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_share, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, moneyRequestAction, null, 24476);
            } else if (moneyRequestAction instanceof MoneyRequestAction.Remind) {
                item = new ActionsView.Item(moneyRequestAction.f79590a, mx0.d.ACCENT, false, null, null, new TextLocalisedClause(R$string.money_request_details_remind_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_bell_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, moneyRequestAction, null, 24476);
            } else if (moneyRequestAction instanceof MoneyRequestAction.Cancel) {
                item = new ActionsView.Item(moneyRequestAction.f79590a, mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.money_request_details_cancel_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, moneyRequestAction, null, 24476);
            } else if (moneyRequestAction instanceof MoneyRequestAction.Reject) {
                item = new ActionsView.Item(moneyRequestAction.f79590a, mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.money_request_details_decline_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, moneyRequestAction, null, 24476);
            } else {
                if (!(moneyRequestAction instanceof MoneyRequestAction.ApmSettings)) {
                    throw new NoWhenBranchMatchedException();
                }
                xv9.a aVar = cVar instanceof xv9.a ? (xv9.a) cVar : null;
                ApmRecipientSettingsValue.BlockIncomingMoneyRequests blockIncomingMoneyRequests2 = (aVar == null || (apmRecipient = aVar.f309224a) == null || (f62151h = apmRecipient.getF62151h()) == null) ? null : f62151h.f62114a;
                if (aVar == null || blockIncomingMoneyRequests2 == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Can't have");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    item = null;
                } else {
                    item = new ActionsView.Item("APM_SETTINGS", mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(blockIncomingMoneyRequests2.f62115a ? com.revolut.feature.apm.core.api.R$string.moneyRequest_details_action_unblock : com.revolut.feature.apm.core.api.R$string.moneyRequest_details_action_block, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_reverted, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, new MoneyRequestAction.ApmSettings(blockIncomingMoneyRequests2), null, 24476);
                }
            }
            if (item != null) {
                arrayList.add(item);
            }
        }
        return arrayList;
    }
}
