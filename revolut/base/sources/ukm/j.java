package ukm;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.q implements Function3 {
    public static final j f = new j(3, q.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) throws Throwable {
        q qVar = (q) obj2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = q.d;
        qVar.getClass();
        if (obj4 != s.f280832l) {
            return obj4;
        }
        throw qVar.t();
    }
}
