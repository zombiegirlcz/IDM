package vlm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes14.dex */
public final class a extends uc0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f290502a = new a();

    @Override // uc0.b
    public final Object h(KClass key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    public final String toString() {
        return "{}";
    }

    @Override // uc0.b
    public final uc0.b u(KClass key, Object obj2) {
        Intrinsics.checkNotNullParameter(key, "key");
        return obj2 != null ? new c(key, obj2, this) : this;
    }
}
