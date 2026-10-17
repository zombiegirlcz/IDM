package lbf;

import java.time.Period;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Period f193672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f193673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f193674c;

    public e(Period duration, ZonedDateTime zonedDateTime, String str) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.f193672a = duration;
        this.f193673b = zonedDateTime;
        this.f193674c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f193672a, eVar.f193672a) && Intrinsics.f(this.f193673b, eVar.f193673b) && Intrinsics.f(this.f193674c, eVar.f193674c);
    }

    public final int hashCode() {
        int iHashCode = this.f193672a.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.f193673b;
        int iHashCode2 = (iHashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        String str = this.f193674c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
