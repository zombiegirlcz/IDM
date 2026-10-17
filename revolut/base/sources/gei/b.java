package gei;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f143302a;

    public b(DateTime dateTime) {
        this.f143302a = dateTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f143302a, ((b) obj2).f143302a);
    }

    public final int hashCode() {
        DateTime dateTime = this.f143302a;
        if (dateTime == null) {
            return 0;
        }
        return dateTime.hashCode();
    }
}
