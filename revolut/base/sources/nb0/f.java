package nb0;

import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import t80.e;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements e4m.e {
    public static t80.c a() {
        e.Companion.getClass();
        return new t80.c(new e.a("FormWizard"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}
