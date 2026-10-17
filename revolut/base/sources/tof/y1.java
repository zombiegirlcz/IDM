package tof;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;

/* JADX INFO: loaded from: classes8.dex */
public final class y1 extends h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f273173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f273174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f273175c;
    public final DateTime d;
    public final LocalTime e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f273176g;

    public y1(f2 status, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, LocalTime localTime, String str, String str2) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f273173a = status;
        this.f273174b = dateTime;
        this.f273175c = dateTime2;
        this.d = dateTime3;
        this.e = localTime;
        this.f = str;
        this.f273176g = str2;
    }

    @Override // tof.h2
    public final DateTime a() {
        return this.f273175c;
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
        if (!(obj2 instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj2;
        return this.f273173a == y1Var.f273173a && Intrinsics.f(this.f273174b, y1Var.f273174b) && Intrinsics.f(this.f273175c, y1Var.f273175c) && Intrinsics.f(this.d, y1Var.d) && Intrinsics.f(this.e, y1Var.e) && Intrinsics.f(this.f, y1Var.f) && Intrinsics.f(this.f273176g, y1Var.f273176g);
    }

    @Override // tof.h2
    public final String f() {
        return this.f273176g;
    }

    @Override // tof.h2
    public final f2 h() {
        return this.f273173a;
    }

    public final int hashCode() {
        int iHashCode = this.f273173a.hashCode() * 31;
        DateTime dateTime = this.f273174b;
        int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f273175c;
        int iHashCode3 = (iHashCode2 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.d;
        int iHashCode4 = (iHashCode3 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        LocalTime localTime = this.e;
        int iHashCode5 = (iHashCode4 + (localTime == null ? 0 : localTime.hashCode())) * 31;
        String str = this.f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f273176g;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // tof.h2
    public final DateTime i() {
        return this.f273174b;
    }
}
