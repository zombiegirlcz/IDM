package te0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j extends f {
    public j() {
    }

    @Override // te0.f
    public final e a(Object obj2, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(obj2, "default");
        return new i(key, obj2);
    }

    @Override // te0.f
    public final e b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new i(key);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Object obj2) {
        super(obj2);
        Intrinsics.checkNotNullParameter(obj2, "default");
    }
}
