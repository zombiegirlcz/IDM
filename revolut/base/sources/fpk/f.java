package fpk;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f137129c;
    public final String d;
    public final Boolean e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f137130g;

    public f(String from, String to6, String rate, String str, Boolean bool, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(rate, "rate");
        this.f137127a = from;
        this.f137128b = to6;
        this.f137129c = rate;
        this.d = str;
        this.e = bool;
        this.f = dateTime;
        this.f137130g = dateTime2;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f137127a;
    }

    public final String c() {
        return this.f137129c;
    }

    public final String d() {
        return this.f137128b;
    }

    public final DateTime e() {
        return this.f137130g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f137127a, fVar.f137127a) && Intrinsics.f(this.f137128b, fVar.f137128b) && Intrinsics.f(this.f137129c, fVar.f137129c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f137130g, fVar.f137130g);
    }

    public final DateTime f() {
        return this.f;
    }

    public final Boolean g() {
        return this.e;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f137127a.hashCode() * 31, 31, this.f137128b), 31, this.f137129c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        DateTime dateTime = this.f;
        int iHashCode3 = (iHashCode2 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f137130g;
        return iHashCode3 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }
}
