package ojf;

import com.revolut.domain.interactors.transactions.Priority;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mhf.f;
import mhf.j;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import tof.i7;
import tof.ob;
import tof.pb;
import tof.q7;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements f {

    @NotNull
    public static final a Companion = new a();
    public static final Priority.HIGH e = new Priority.HIGH("Transactions List screen - transactions");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f225773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sjf.e f225774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xmf.b f225775c;
    public final j d;

    public e(com.revolut.domain.interactors.transactions.a transactionsInteractor, sjf.e transactionsPerformanceTracker, xmf.b transactionsSearchEngine, j transactionsSearchIndexInteractor) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionsPerformanceTracker, "transactionsPerformanceTracker");
        Intrinsics.checkNotNullParameter(transactionsSearchEngine, "transactionsSearchEngine");
        Intrinsics.checkNotNullParameter(transactionsSearchIndexInteractor, "transactionsSearchIndexInteractor");
        this.f225773a = transactionsInteractor;
        this.f225774b = transactionsPerformanceTracker;
        this.f225775c = transactionsSearchEngine;
        this.d = transactionsSearchIndexInteractor;
    }

    public static q7 a(b bVar, i7 i7Var, long j2, boolean z) {
        int i = c.f225769a[bVar.ordinal()];
        if (i == 1) {
            i7.c cVar = i7.Companion;
            i7[] i7VarArr = {i7Var, new ob(new DateTime(j2), false)};
            cVar.getClass();
            return i7.c.a(i7VarArr);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        i7.c cVar2 = i7.Companion;
        i7[] i7VarArr2 = {i7Var, new pb(new DateTime(j2), !z)};
        cVar2.getClass();
        return i7.c.a(i7VarArr2);
    }
}
