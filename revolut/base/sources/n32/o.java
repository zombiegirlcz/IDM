package n32;

import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import t80.e;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements e4m.e {
    public static t80.c a() {
        m.Companion.getClass();
        return new t80.c(new e.a("APM"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}
