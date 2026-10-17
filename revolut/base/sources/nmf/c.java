package nmf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, nl4.c.class, "<init>", "<init>(Lcom/revolut/feature/transactions/models/Transaction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        a3 p0 = (a3) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new nl4.c(p0);
    }
}
