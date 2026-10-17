package fp1;

import cf9.g;
import com.revolut.feature.pay_bills_taxes.api.PayBillsAndTaxesApi$Toggles;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f137035b;

    public /* synthetic */ a(d dVar, int i) {
        this.f137034a = i;
        this.f137035b = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f137034a) {
            case 0:
                return Boolean.valueOf(this.f137035b.c(cf9.e.f23656c));
            case 1:
                return Boolean.valueOf(((jte.d) this.f137035b.f137040c).c(PayBillsAndTaxesApi$Toggles.NzBills.f78661c));
            case 2:
                return Boolean.valueOf(this.f137035b.c(cf9.d.f23655c));
            case 3:
                return Boolean.valueOf(((jte.d) this.f137035b.f137040c).c(PayBillsAndTaxesApi$Toggles.UaeBills.f78664c));
            case 4:
                return Boolean.valueOf(this.f137035b.c(g.f23658c));
            default:
                return Boolean.valueOf(this.f137035b.c(cf9.b.f23653c));
        }
    }
}
