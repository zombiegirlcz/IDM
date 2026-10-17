package lh9;

import cli.y;
import com.revolut.feature.apm.bills.core.api.model.BillFieldV2;
import com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.details.section_details.SectionDetailsScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.details.section_details.SectionDetailsScreenContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.review.FormReviewScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lfg.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends oki.h implements n {
    public final wo1.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x02.b f195190p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x02.d f195191q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final FormReviewScreenContract$InputData f195192r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f195193s;

    public r(wo1.b billsInteractor, x02.b quoteInteractor, x02.d quoteRouter, FormReviewScreenContract$InputData inputData, s stateMapper) {
        Intrinsics.checkNotNullParameter(billsInteractor, "billsInteractor");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(quoteRouter, "quoteRouter");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = billsInteractor;
        this.f195190p = quoteInteractor;
        this.f195191q = quoteRouter;
        this.f195192r = inputData;
        this.f195193s = mra.d.b(this, new i(inputData.f78788b.f61340c, inputData.f78789c, null, inputData.d, inputData.e), stateMapper, null, false, 12);
    }

    public final void I2(Object obj2) {
        if (obj2 instanceof BillFieldV2.BillFieldSubform) {
            BillFieldV2.BillFieldSubform billFieldSubform = (BillFieldV2.BillFieldSubform) obj2;
            C1(new com.revolut.kompot.common.b(new SectionDetailsScreen(new SectionDetailsScreenContract$InputData(billFieldSubform.f61265a, billFieldSubform.f61266b)), (ModalDestination.Style) null, 6));
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        FormReviewScreenContract$InputData formReviewScreenContract$InputData = this.f195192r;
        yji.l.b1(this, new d0(((q12.f) this.f195190p).c(new ApmQuoteDirection.Outgoing(oh9.b.a(formReviewScreenContract$InputData.f78787a)), formReviewScreenContract$InputData.f78789c), 1), null, new le8.d(this, (Continuation) null, 6), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f195193s;
    }
}
