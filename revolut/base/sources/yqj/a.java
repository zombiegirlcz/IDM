package yqj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import t11.b2;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a extends b2 {
    public abstract void a(String str);

    public abstract int b(String str);

    public abstract List c(String str);

    public abstract void d(arj.a aVar);

    public abstract void e(List list);

    public void f(String walletId, List list) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(list, "list");
        a(walletId);
        e(list);
    }
}
