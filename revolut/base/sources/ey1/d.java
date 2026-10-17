package ey1;

import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public abstract class d implements e4m.e {
    public static xe0.e a(je0.d mapper, yk0.a databaseSessionProvider, xe0.f storageFactory) {
        c.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "apm_contacts_discovery", mapper, 1, f0.f322471a, 32);
    }
}
