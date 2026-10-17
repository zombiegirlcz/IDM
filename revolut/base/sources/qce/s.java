package qce;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f244763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qua.p f244764c;

    public /* synthetic */ s(o0 o0Var, qua.p pVar, int i) {
        this.f244762a = i;
        this.f244763b = o0Var;
        this.f244764c = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f244762a) {
            case 0:
                PaymentCounterpartyInfo paymentCounterparty = (PaymentCounterpartyInfo) obj2;
                Intrinsics.checkNotNullParameter(paymentCounterparty, "paymentCounterparty");
                return ((rae.d) this.f244763b.f244747n).b(this.f244764c, paymentCounterparty);
            case 1:
                f5j.a beneficiary = (f5j.a) obj2;
                Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                o0 o0Var = this.f244763b;
                z8e.a aVar = o0Var.f244747n;
                sce.g gVar = (sce.g) ((sce.f) o0Var.f244743h).e;
                return ((rae.d) aVar).f(this.f244764c, beneficiary, (AccountId) gVar.f261744c.getValue(gVar, sce.g.e[1]).get()).x();
            default:
                zm3.l contact = (zm3.l) obj2;
                Intrinsics.checkNotNullParameter(contact, "contact");
                return ((rae.d) this.f244763b.f244747n).l(contact, this.f244764c);
        }
    }
}
