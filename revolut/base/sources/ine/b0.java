package ine;

import ch.qos.logback.core.net.SyslogConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class b0 implements e4m.e {
    public static xe0.e a(je0.d mapper, xe0.f storageFactory, yk0.a databaseSessionProvider) {
        a0.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.g(storageFactory, databaseSessionProvider, "tax_residency", mapper, 0, null, false, SyslogConstants.LOG_CLOCK);
    }
}
