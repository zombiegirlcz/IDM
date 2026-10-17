package wkm;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Continuation[] f298303a = new Continuation[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cfm.c f298304b = new cfm.c("NULL", 3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final cfm.c f298305c = new cfm.c("UNINITIALIZED", 3);
    public static final cfm.c d = new cfm.c("DONE", 3);

    public static /* synthetic */ Flow a(q qVar, CoroutineContext coroutineContext, int i, ukm.f fVar, int i2) {
        if ((i2 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f186406a;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            fVar = ukm.f.SUSPEND;
        }
        return qVar.f(coroutineContext, i, fVar);
    }
}
