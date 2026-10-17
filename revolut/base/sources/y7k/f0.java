package y7k;

import nii.t1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f0 implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a f311547b;

    public /* synthetic */ f0(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar, int i) {
        this.f311546a = i;
        this.f311547b = aVar;
    }

    @Override // nii.p1
    public final nii.m0 a(Object obj2) {
        n8k.k kVar = (n8k.k) obj2;
        switch (this.f311546a) {
            case 0:
                if (kVar == null) {
                    return null;
                }
                com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar = this.f311547b;
                return ((n8k.g) aVar.f102213w).b3(kVar, aVar.N2());
            default:
                if (kVar == null) {
                    return null;
                }
                com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar2 = this.f311547b;
                return ((n8k.g) aVar2.f102213w).b3(kVar, aVar2.N2());
        }
    }
}
