package tk9;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f271923a;

    public k(DateTime date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f271923a = date;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f271923a, ((k) obj2).f271923a);
    }

    public final int hashCode() {
        return this.f271923a.hashCode();
    }
}
