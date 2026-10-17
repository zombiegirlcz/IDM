package h1k;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f148591a;

    public f(DateTime date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f148591a = date;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f148591a, ((f) obj2).f148591a);
    }

    public final int hashCode() {
        return this.f148591a.hashCode();
    }
}
