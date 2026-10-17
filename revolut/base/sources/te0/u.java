package te0;

import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f270022a;

    public u(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f270022a = storage;
    }

    public final t a(Object obj2, String key, Type type) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(obj2, "default");
        return new t(this.f270022a, j6.a.q("app_fields_", key), type, obj2);
    }
}
