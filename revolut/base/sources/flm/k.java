package flm;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cfm.c f136015a = new cfm.c("STATE_REG", 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cfm.c f136016b = new cfm.c("STATE_COMPLETED", 3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final cfm.c f136017c = new cfm.c("STATE_CANCELLED", 3);
    public static final cfm.c d = new cfm.c("NO_RESULT", 3);
    public static final cfm.c e = new cfm.c("PARAM_CLAUSE_0", 3);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h hVar, long j2, Function1 function1) {
        b bVar = new b(j2);
        a aVar = a.f;
        u0.f(3, aVar);
        f fVar = new f(hVar, bVar, aVar, j.f136014a, e, (gim.i) function1, null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.f;
        hVar.i(fVar, false);
    }
}
