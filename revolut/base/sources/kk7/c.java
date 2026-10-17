package kk7;

import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import e4m.e;
import t80.e;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements e {
    public static t80.c a() {
        b.Companion.getClass();
        return new t80.c(new e.a("CFACInsurance_Claims"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}
