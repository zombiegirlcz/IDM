package skm;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class p1 extends kotlin.jvm.internal.q implements Function3 {
    public static final p1 f = new p1(3, r1.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) throws Throwable {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r1.f264005a;
        ((r1) obj2).getClass();
        if (obj4 instanceof u) {
            throw ((u) obj4).f264012a;
        }
        return obj4;
    }
}
