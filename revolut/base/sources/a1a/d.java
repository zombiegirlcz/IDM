package a1a;

import a09.o;
import a09.p;
import com.revolut.feature.payments.splitbill.impl.data.recurringsplit.RecurringSplitService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecurringSplitService f576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1a.a f578c;
    public final x4l.c d;

    public d(RecurringSplitService recurringSplitService, j memoryCache, b1a.a recurringSplitDao) {
        Intrinsics.checkNotNullParameter(recurringSplitService, "recurringSplitService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(recurringSplitDao, "recurringSplitDao");
        this.f576a = recurringSplitService;
        this.f577b = memoryCache;
        this.f578c = recurringSplitDao;
        Continuation continuation = null;
        int i = 6;
        this.d = new x4l.c(new o(this, continuation, 2), new a0.c(this, i), new a09.b(this, i), new a07.d(this, continuation, 3), new p(this, continuation, 1));
    }
}
