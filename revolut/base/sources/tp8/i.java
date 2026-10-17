package tp8;

import aii.r;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZonedDateTime f273317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dp8.d f273318b;

    public i(ZonedDateTime startDate, dp8.d frequency) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        this.f273317a = startDate;
        this.f273318b = frequency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f273317a, iVar.f273317a) && this.f273318b == iVar.f273318b;
    }

    public final int hashCode() {
        return this.f273318b.hashCode() + (this.f273317a.hashCode() * 31);
    }
}
