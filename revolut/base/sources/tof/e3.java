package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f272728c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f3 f272729g;

    public e3(String str, String str2, String str3, String str4, String str5, String str6, f3 f3Var) {
        this.f272726a = str;
        this.f272727b = str2;
        this.f272728c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f272729g = f3Var;
    }

    public final String a() {
        return this.f272727b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj2;
        return Intrinsics.f(this.f272726a, e3Var.f272726a) && Intrinsics.f(this.f272727b, e3Var.f272727b) && Intrinsics.f(this.f272728c, e3Var.f272728c) && Intrinsics.f(this.d, e3Var.d) && Intrinsics.f(this.e, e3Var.e) && Intrinsics.f(this.f, e3Var.f) && Intrinsics.f(this.f272729g, e3Var.f272729g);
    }

    public final String getEmail() {
        return this.e;
    }

    public final String getId() {
        return this.f272726a;
    }

    public final String getName() {
        return this.f272728c;
    }

    public final String getPhone() {
        return this.d;
    }

    public final int hashCode() {
        String str = this.f272726a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f272727b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f272728c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        f3 f3Var = this.f272729g;
        return iHashCode6 + (f3Var != null ? f3Var.hashCode() : 0);
    }
}
