package xbc;

import h30.l;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f304040c;
    public final ZonedDateTime d;
    public final ZonedDateTime e;
    public final h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f304041g;

    public g(String airportIataCode, String str, String str2, ZonedDateTime scheduledTime, ZonedDateTime actualTime, h status, f fVar) {
        Intrinsics.checkNotNullParameter(airportIataCode, "airportIataCode");
        Intrinsics.checkNotNullParameter(scheduledTime, "scheduledTime");
        Intrinsics.checkNotNullParameter(actualTime, "actualTime");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f304038a = airportIataCode;
        this.f304039b = str;
        this.f304040c = str2;
        this.d = scheduledTime;
        this.e = actualTime;
        this.f = status;
        this.f304041g = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f304038a, gVar.f304038a) && Intrinsics.f(this.f304039b, gVar.f304039b) && Intrinsics.f(this.f304040c, gVar.f304040c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f == gVar.f && this.f304041g == gVar.f304041g;
    }

    public final int hashCode() {
        int iHashCode = this.f304038a.hashCode() * 31;
        String str = this.f304039b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f304040c;
        int iHashCode3 = (this.f.hashCode() + l.h(this.e, l.h(this.d, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31)) * 31;
        f fVar = this.f304041g;
        return iHashCode3 + (fVar != null ? fVar.hashCode() : 0);
    }
}
