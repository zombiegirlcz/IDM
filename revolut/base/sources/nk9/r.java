package nk9;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f216774a;

    public r(DateTime date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f216774a = date;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f216774a, ((r) obj2).f216774a);
    }

    public final int hashCode() {
        return this.f216774a.hashCode();
    }
}
