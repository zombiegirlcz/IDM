package tp8;

import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZonedDateTime f273313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dp8.d f273314b;

    public e(ZonedDateTime startDate, dp8.d frequency) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        this.f273313a = startDate;
        this.f273314b = frequency;
    }

    public static e a(e eVar, ZonedDateTime startDate, dp8.d frequency, int i) {
        if ((i & 1) != 0) {
            startDate = eVar.f273313a;
        }
        if ((i & 2) != 0) {
            frequency = eVar.f273314b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        return new e(startDate, frequency);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f273313a, eVar.f273313a) && this.f273314b == eVar.f273314b;
    }

    public final int hashCode() {
        return this.f273314b.hashCode() + (this.f273313a.hashCode() * 31);
    }
}
