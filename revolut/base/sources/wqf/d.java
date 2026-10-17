package wqf;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.transfer.core.api.cancellation.TransferCancellationInputData;
import com.revolut.retail.common.ui.R$string;
import efm.r;
import ip0.tm0;
import ip0.um0;
import jki.g;
import jki.h;
import jki.i;
import jki.j;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import mjf.u;
import rp0.t;
import rp0.y;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TransferCancellationInputData f299448p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f299449q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final uhf.d f299450r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final u f299451s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final xqf.a f299452t;
    public final j u;
    public boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TransferCancellationInputData inputData, j60.a bottomExpandableDialog, uhf.d dialogMapper, u recallableInteractor, xqf.a dialogResultMapper, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(recallableInteractor, "recallableInteractor");
        Intrinsics.checkNotNullParameter(dialogResultMapper, "dialogResultMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f299448p = inputData;
        this.f299449q = bottomExpandableDialog;
        this.f299450r = dialogMapper;
        this.f299451s = recallableInteractor;
        this.f299452t = dialogResultMapper;
        this.u = j.f175191a;
    }

    @Override // yji.l
    public final void I1() {
        ((hjf.e) this.f299450r).getClass();
        y yVar = new y(zhm.u.c(new um0("ID_CONFIRM_RECALL", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.common_action_not_now, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transactionUI_transaction_details_bank_transfer_cancellation_button_action_confirm, null, null, 14), false, "TRANSACTION_CANCEL_PRIMARY_BUTTON_TAG", null, 40), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008)), new t(new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transactionUI_transaction_details_bank_transfer_cancellation_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.transactions.impl.R$string.transactionUI_transaction_details_bank_transfer_cancellation_description, null, null, 14), null, 28), null, null, null, null, 1020);
        j60.a aVar = this.f299449q;
        aVar.x(yVar);
        r rVarSkip = aVar.t().skip(1L);
        Intrinsics.checkNotNullExpressionValue(rVarSkip, "skip(...)");
        l.a1(this, rd0.e.b(rVarSkip), null, null, new wka.e(this, null, 16), 3);
    }

    @Override // jki.g
    public final i r2() {
        return this.u;
    }
}
