package j1m;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class c implements Serializable {
    public c() {
        TimeUnit unit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
    }

    public final long a(TimeUnit toUnit) {
        Intrinsics.checkNotNullParameter(toUnit, "toUnit");
        return toUnit.convert(1800L, TimeUnit.SECONDS);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && c.class.equals(obj2.getClass())) {
            c cVar = obj2 instanceof c ? (c) obj2 : null;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long jA = a(timeUnit);
            Long lValueOf = cVar != null ? Long.valueOf(cVar.a(timeUnit)) : null;
            if (lValueOf != null && jA == lValueOf.longValue()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) 1800) * 31) + TimeUnit.SECONDS.hashCode();
    }

    public final String toString() {
        return "TimeMeasure{value=1800, unit=" + TimeUnit.SECONDS + CoreConstants.CURLY_RIGHT;
    }
}
