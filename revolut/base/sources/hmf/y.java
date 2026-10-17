package hmf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class y extends kotlin.jvm.internal.q implements Function1 {
    public static final y f = new y();

    public y() {
        super(1, nl4.c.class, "<init>", "<init>(Lcom/revolut/feature/transactions/models/Transaction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        a3 p0 = (a3) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new nl4.c(p0);
    }
}
