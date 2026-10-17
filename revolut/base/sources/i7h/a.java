package i7h;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public abstract void a(String str);

    public abstract void b(String str);

    public abstract d c(String str);

    public abstract List d(String str);

    public void e(String portfolioId, ArrayList recurringOrders) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(recurringOrders, "recurringOrders");
        b(portfolioId);
        g(recurringOrders);
    }

    public abstract void f(d dVar);

    public abstract void g(ArrayList arrayList);
}
