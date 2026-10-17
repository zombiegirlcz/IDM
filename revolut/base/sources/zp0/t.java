package zp0;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f324143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f324144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f324145c;

    public t(Date date, String rawValue, boolean z) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        this.f324143a = date;
        this.f324144b = rawValue;
        this.f324145c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f324143a, tVar.f324143a) && Intrinsics.f(this.f324144b, tVar.f324144b) && this.f324145c == tVar.f324145c;
    }

    public final int hashCode() {
        Date date = this.f324143a;
        return Boolean.hashCode(this.f324145c) + p.a.c((date == null ? 0 : date.hashCode()) * 31, 31, this.f324144b);
    }
}
