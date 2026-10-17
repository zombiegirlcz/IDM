package slm;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes13.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f264273a = new ConcurrentHashMap(16);

    public final Object a(SerialDescriptor descriptor, qf.b key) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) this.f264273a.get(descriptor);
        Object obj2 = map != null ? map.get(key) : null;
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }
}
