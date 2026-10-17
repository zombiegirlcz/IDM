package wsj;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import t11.b2;

/* JADX INFO: loaded from: classes11.dex */
public abstract class e extends b2 {
    public void a(String walletId, ArrayList incomeSorters) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(incomeSorters, "incomeSorters");
        d(walletId);
        insertAll(incomeSorters);
    }

    public abstract List b();

    public abstract void c();

    public abstract void d(String str);

    public abstract void insertAll(List list);
}
