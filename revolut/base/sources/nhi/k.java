package nhi;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes13.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1 f215504a = q.b(16, 1, ukm.f.DROP_OLDEST);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CopyOnWriteArrayList f215505b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CopyOnWriteArrayList f215506c = new CopyOnWriteArrayList();
    public static final CopyOnWriteArrayList d = new CopyOnWriteArrayList();

    private k() {
    }

    public static void a(xji.a callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        f215505b.add(callbacks);
    }

    public static void b(xji.a callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        f215505b.remove(callbacks);
    }
}
