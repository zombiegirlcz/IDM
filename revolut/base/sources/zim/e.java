package zim;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class e extends le.u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f322625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f322626b;

    public e(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f322625a = compute;
        this.f322626b = new ConcurrentHashMap();
    }

    public final Object y(Class key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f322626b;
        Object obj2 = concurrentHashMap.get(key);
        if (obj2 != null) {
            return obj2;
        }
        Object objInvoke = this.f322625a.invoke(key);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(key, objInvoke);
        return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
    }
}
