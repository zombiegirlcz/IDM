package tof;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;

/* JADX INFO: loaded from: classes8.dex */
public final class z1 extends h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f273189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f273190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f273191c;
    public final DateTime d;
    public final LocalTime e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f273192g;

    public z1(f2 status, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, LocalTime localTime, String str, String str2) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f273189a = status;
        this.f273190b = dateTime;
        this.f273191c = dateTime2;
        this.d = dateTime3;
        this.e = localTime;
        this.f = str;
        this.f273192g = str2;
    }

    @Override // tof.h2
    public final DateTime a() {
        return this.f273191c;
    }

    @Override // tof.h2
    public final DateTime b() {
        return this.d;
    }

    @Override // tof.h2
    public final LocalTime d() {
        return this.e;
    }

    @Override // tof.h2
    public final String e() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj2;
        return this.f273189a == z1Var.f273189a && Intrinsics.f(this.f273190b, z1Var.f273190b) && Intrinsics.f(this.f273191c, z1Var.f273191c) && Intrinsics.f(this.d, z1Var.d) && Intrinsics.f(this.e, z1Var.e) && Intrinsics.f(this.f, z1Var.f) && Intrinsics.f(this.f273192g, z1Var.f273192g);
    }

    @Override // tof.h2
    public final String f() {
        return this.f273192g;
    }

    @Override // tof.h2
    public final f2 h() {
        return this.f273189a;
    }

    public final int hashCode() {
        int iHashCode = this.f273189a.hashCode() * 31;
        DateTime dateTime = this.f273190b;
        int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f273191c;
        int iHashCode3 = (iHashCode2 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.d;
        int iHashCode4 = (iHashCode3 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        LocalTime localTime = this.e;
        int iHashCode5 = (iHashCode4 + (localTime == null ? 0 : localTime.hashCode())) * 31;
        String str = this.f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f273192g;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // tof.h2
    public final DateTime i() {
        return this.f273190b;
    }
}
