package tof;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public final class u8 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f273106a;

    public u8(DateTime createdDate) {
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        this.f273106a = createdDate;
    }

    public final DateTime a() {
        return this.f273106a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u8) && Intrinsics.f(this.f273106a, ((u8) obj2).f273106a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f273106a.hashCode() * 31);
    }
}
