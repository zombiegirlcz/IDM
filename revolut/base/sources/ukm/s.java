package ukm;

import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes14.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f280826a = new a0(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f280827b = zkm.g.g(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f280828c = zkm.g.g(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final cfm.c d = new cfm.c("BUFFERED", 3);
    public static final cfm.c e = new cfm.c("SHOULD_BUFFER", 3);
    public static final cfm.c f = new cfm.c("S_RESUMING_BY_RCV", 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final cfm.c f280829g = new cfm.c("RESUMING_BY_EB", 3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final cfm.c f280830h = new cfm.c("POISONED", 3);
    public static final cfm.c i = new cfm.c("DONE_RCV", 3);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final cfm.c f280831j = new cfm.c("INTERRUPTED_SEND", 3);
    public static final cfm.c k = new cfm.c("INTERRUPTED_RCV", 3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final cfm.c f280832l = new cfm.c("CHANNEL_CLOSED", 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final cfm.c f280833m = new cfm.c("SUSPEND", 3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final cfm.c f280834n = new cfm.c("SUSPEND_NO_WAITER", 3);
    public static final cfm.c o = new cfm.c("FAILED", 3);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final cfm.c f280835p = new cfm.c("NO_RECEIVE_RESULT", 3);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final cfm.c f280836q = new cfm.c("CLOSE_HANDLER_CLOSED", 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final cfm.c f280837r = new cfm.c("CLOSE_HANDLER_INVOKED", 3);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final cfm.c f280838s = new cfm.c("NO_CLOSE_CAUSE", 3);

    public static final boolean a(CancellableContinuation cancellableContinuation, Object obj2, Function3 function3) {
        cfm.c cVarQ = cancellableContinuation.q(obj2, function3);
        if (cVarQ == null) {
            return false;
        }
        cancellableContinuation.m(cVarQ);
        return true;
    }
}
