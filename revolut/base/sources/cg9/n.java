package cg9;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.core.api.model.BillFieldV2;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.details.FormDetailsScreenContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.details.section_details.SectionDetailsScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.details.section_details.SectionDetailsScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends oki.h implements h {

    @NotNull
    public static final j Companion = new j();
    public final wo1.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wj0.a f23882p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f23883q;

    public n(wo1.b billsInteractor, wj0.a idempotencyKeyHolder, FormDetailsScreenContract$InputData inputData, q stateMapper) {
        Intrinsics.checkNotNullParameter(billsInteractor, "billsInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = billsInteractor;
        this.f23882p = idempotencyKeyHolder;
        this.f23883q = mra.d.b(this, new f(new Data(null, null, true, 3, null), inputData.f78704a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        this.f23882p.a("BILL_COPY_IDEMPOTENCY_KEY");
        l2(new bv4.h(this, null, 19), new yi5.b(26));
    }

    public final void I2(Object obj2) {
        if (obj2 instanceof BillFieldV2.BillFieldSubform) {
            BillFieldV2.BillFieldSubform billFieldSubform = (BillFieldV2.BillFieldSubform) obj2;
            C1(new com.revolut.kompot.common.b(new SectionDetailsScreen(new SectionDetailsScreenContract$InputData(billFieldSubform.f61265a, billFieldSubform.f61266b)), (ModalDestination.Style) null, 6));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f23883q;
    }
}
