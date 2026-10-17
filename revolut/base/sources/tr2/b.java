package tr2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class b implements e4m.e {
    public static xe0.e a(je0.d mapper, xe0.f storageFactory, yk0.a databaseSecurityProvider) {
        a.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSecurityProvider, "databaseSecurityProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSecurityProvider, "blocked_merchants", mapper, 0, null, 56);
    }
}
