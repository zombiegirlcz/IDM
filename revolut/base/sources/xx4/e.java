package xx4;

import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f309397a;

    public e(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f309397a = storage;
    }

    public final Object a(c key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String key2 = key.getKey();
        Type type = key.e().getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return this.f309397a.T2(key2, type);
    }

    public final void b(c key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        String key2 = key.getKey();
        Type type = key.e().getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        this.f309397a.G(value, key2, type);
    }
}
