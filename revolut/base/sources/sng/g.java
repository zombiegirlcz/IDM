package sng;

import ch.qos.logback.core.net.SyslogConstants;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends f {
    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof g);
    }

    public final int hashCode() {
        return Integer.hashCode(SyslogConstants.LOG_CLOCK);
    }
}
