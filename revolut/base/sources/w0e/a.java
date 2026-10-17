package w0e;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public abstract void a();

    public void b(ArrayList transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        a();
        d(transactions);
    }

    public abstract List c();

    public abstract void d(ArrayList arrayList);
}
