package au6;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j1 extends kotlin.jvm.internal.q implements Function1 {
    public static final j1 f = new j1();

    public j1() {
        super(1, ft6.h.class, "toDomain", "toDomain(Lcom/revolut/feature/freelancer/impl/network/models/invoices/InvoiceDto;)Lcom/revolut/feature/freelancer/common/models/invoices/FreelancerInvoice;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        qt6.b p0 = (qt6.b) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ft6.h.e(p0);
    }
}
