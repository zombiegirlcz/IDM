package mn1;

import com.revolut.feature.apm.bills.core.api.model.search.boleto.BillSearchBoletoResult;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class b0 extends oki.h implements dli.b {

    @NotNull
    public static final u Companion = new u();
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wo1.b f207329p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xua.a f207330q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wj0.a f207331r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r f207332s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final dva.a f207333t;
    public final gn1.b u;
    public final l2j.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final cli.y f207334w;

    public b0(i inputData, wo1.b interactor, xua.a recurringPaymentInteractor, wj0.a idempotencyKeyHolder, r dialogProvider, dva.a hiddenPaymentsInteractor, gn1.b balanceInteractor, l2j.a currencyChooserFlowFactory, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(hiddenPaymentsInteractor, "hiddenPaymentsInteractor");
        Intrinsics.checkNotNullParameter(balanceInteractor, "balanceInteractor");
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f207329p = interactor;
        this.f207330q = recurringPaymentInteractor;
        this.f207331r = idempotencyKeyHolder;
        this.f207332s = dialogProvider;
        this.f207333t = hiddenPaymentsInteractor;
        this.u = balanceInteractor;
        this.v = currencyChooserFlowFactory;
        this.f207334w = mra.d.b(this, new h((BillSearchBoletoResult) inputData.f207340b.getValue(), (TransferScheduleData) inputData.f207339a.getValue(), inputData.f207341c, inputData.d, inputData.e, null, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        this.f207331r.a("BILL_PAYMENT_IDEMPOTENCY_KEY");
        Continuation continuation = null;
        l2(new mci.e(this, continuation, 13), new yi5.b(26));
        i iVar = this.o;
        yji.l.a1(this, iVar.f207339a, null, null, new v(this, continuation, 0), 3);
        yji.l.a1(this, iVar.f207340b, null, null, new v(this, continuation, 1), 3);
        String str = ((BillSearchBoletoResult) iVar.f207340b.getValue()).f61436n;
        if (str != null) {
            xua.a aVar = this.f207330q;
            vkm.d dVarB = rd0.e.b(m70.a.g(xua.a.a(aVar, null, 3), null, null, 3));
            yua.q qVar = (yua.q) aVar;
            yji.l.a1(this, yh5.b.e(dVarB, rd0.e.b(m70.a.g(qVar.i(qVar.s(false, qua.w.f249340a, false), new ypg.h(23)), null, null, 3)), this.f207333t.a()), null, null, new lhk.a0(this, str, continuation, 12), 3);
        }
    }

    public final void I2(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        if (iHashCode == -2110068596) {
            if (listId.equals("ID_FEES_TAG")) {
                C2(j.f207342a);
            }
        } else if (iHashCode == -1890119929) {
            if (listId.equals("ID_PAYMENT_FROM")) {
                l2(new w(this, null), new yi5.b(26));
            }
        } else if (iHashCode == -38949968 && listId.equals("ID_SCHEDULED_ON_TAG")) {
            C2(new l(((h) ((j2) this.f207334w.f22677a).getValue()).f207336b));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f207334w;
    }
}
