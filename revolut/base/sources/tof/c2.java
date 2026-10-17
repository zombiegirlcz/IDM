package tof;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;

/* JADX INFO: loaded from: classes8.dex */
public final class c2 extends h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f272658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f272659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f272660c;
    public final DateTime d;
    public final LocalTime e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f272661g;

    public c2(f2 status, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, LocalTime localTime, String str, String str2) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f272658a = status;
        this.f272659b = dateTime;
        this.f272660c = dateTime2;
        this.d = dateTime3;
        this.e = localTime;
        this.f = str;
        this.f272661g = str2;
    }

    @Override // tof.h2
    public final DateTime a() {
        return this.f272660c;
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
        if (!(obj2 instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj2;
        return this.f272658a == c2Var.f272658a && Intrinsics.f(this.f272659b, c2Var.f272659b) && Intrinsics.f(this.f272660c, c2Var.f272660c) && Intrinsics.f(this.d, c2Var.d) && Intrinsics.f(this.e, c2Var.e) && Intrinsics.f(this.f, c2Var.f) && Intrinsics.f(this.f272661g, c2Var.f272661g);
    }

    @Override // tof.h2
    public final String f() {
        return this.f272661g;
    }

    @Override // tof.h2
    public final f2 h() {
        return this.f272658a;
    }

    public final int hashCode() {
        int iHashCode = this.f272658a.hashCode() * 31;
        DateTime dateTime = this.f272659b;
        int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f272660c;
        int iHashCode3 = (iHashCode2 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.d;
        int iHashCode4 = (iHashCode3 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        LocalTime localTime = this.e;
        int iHashCode5 = (iHashCode4 + (localTime == null ? 0 : localTime.hashCode())) * 31;
        String str = this.f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f272661g;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // tof.h2
    public final DateTime i() {
        return this.f272659b;
    }
}
