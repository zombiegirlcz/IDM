package e5a;

import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import t80.e;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements e4m.e {
    public static t80.c a() {
        d.Companion.getClass();
        return new t80.c(new e.a("chat_transfer_profile"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}
