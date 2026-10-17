package ukm;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.q implements Function3 {
    public static final l f = new l(3, q.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        q qVar = (q) obj2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = q.d;
        qVar.getClass();
        if (obj4 == s.f280832l) {
            x xVar = z.Companion;
            Throwable thS = qVar.s();
            xVar.getClass();
            obj4 = new w(thS);
        } else {
            z.Companion.getClass();
        }
        return new z(obj4);
    }
}
