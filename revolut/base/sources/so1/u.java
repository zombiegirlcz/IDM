package so1;

import com.revolut.feature.apm.bills.bpay.api.R$string;
import nii.m0;
import nii.t1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class u implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f264690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a f264691b;

    public /* synthetic */ u(com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a aVar, int i) {
        this.f264690a = i;
        this.f264691b = aVar;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) {
        switch (this.f264690a) {
            case 0:
                int i = R$string.pay_bills_taxes_country_au_success_title;
                cli.y yVar = this.f264691b.f61244x;
                break;
            case 1:
                break;
            default:
                break;
        }
        return com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a.J2(this.f264691b);
    }
}
