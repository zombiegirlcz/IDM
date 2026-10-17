package om0;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        TimeUnit timeUnit = TimeUnit.MINUTES;
        return true;
    }

    public final int hashCode() {
        return TimeUnit.MINUTES.hashCode() + (Long.hashCode(5L) * 31);
    }
}
