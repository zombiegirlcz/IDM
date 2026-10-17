package tof;

import java.io.Serializable;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;

/* JADX INFO: loaded from: classes8.dex */
public abstract class h2 implements Serializable {
    private h2() {
    }

    public DateTime a() {
        return null;
    }

    public DateTime b() {
        return null;
    }

    public final DateTime c() {
        DateTime dateTimeB = b();
        if (dateTimeB == null) {
            return null;
        }
        return dateTimeB.plus(d() != null ? r1.getMillisOfDay() : 0L);
    }

    public LocalTime d() {
        return null;
    }

    public String e() {
        return null;
    }

    public String f() {
        return null;
    }

    public abstract f2 h();

    public DateTime i() {
        return null;
    }
}
