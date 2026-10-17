package ehl;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes12.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iel.l f126268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f126270c;
    public final DateTime d;
    public final DateTime e;

    public n(iel.l holiday, String name, boolean z, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(holiday, "holiday");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f126268a = holiday;
        this.f126269b = name;
        this.f126270c = z;
        this.d = dateTime;
        this.e = dateTime2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f126268a == nVar.f126268a && Intrinsics.f(this.f126269b, nVar.f126269b) && this.f126270c == nVar.f126270c && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.f126268a.hashCode() * 31, 31, this.f126269b), 31, this.f126270c);
        DateTime dateTime = this.d;
        int iHashCode = (iC + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.e;
        return iHashCode + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }
}
