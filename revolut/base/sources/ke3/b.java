package ke3;

import kotlin.jvm.internal.Intrinsics;
import xe0.f;

/* JADX INFO: loaded from: classes21.dex */
public abstract class b implements e4m.e {
    public static xe0.e a(je0.d mapper, yk0.a databaseSessionProvider, f storageFactory) {
        a.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "categorisation", mapper, 0, null, 56);
    }
}
