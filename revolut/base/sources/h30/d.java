package h30;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class d implements e4m.e {
    public static xe0.e a(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        c.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "chat_repository_storage", mapper, 0, null, 56);
    }
}
