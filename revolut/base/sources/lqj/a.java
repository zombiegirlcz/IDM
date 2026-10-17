package lqj;

import efm.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import t11.b2;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a extends b2 {
    public abstract r a(long j2, long j3, ArrayList arrayList);

    public abstract r b(long j2, ArrayList arrayList);

    public abstract r c(long j2, List list);

    public abstract Long d();

    public abstract void e();

    public abstract void f(Long l2, long j2);

    public void g(long j2, long j3, ArrayList balanceHistoryEntities) {
        Intrinsics.checkNotNullParameter(balanceHistoryEntities, "balanceHistoryEntities");
        f(Long.valueOf(j2), j3);
        insertAll(balanceHistoryEntities);
    }

    public abstract void insertAll(List list);
}
