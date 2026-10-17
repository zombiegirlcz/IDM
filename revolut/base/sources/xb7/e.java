package xb7;

import kotlin.jvm.internal.Intrinsics;
import xe0.f;

/* JADX INFO: loaded from: classes21.dex */
public abstract class e implements e4m.e {
    public static xe0.e a(je0.d mapper, f storageFactory, yk0.a databaseSessionProvider) {
        c.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return f.f(storageFactory, databaseSessionProvider, "nps_surveys", mapper, 0, null, 56);
    }
}
