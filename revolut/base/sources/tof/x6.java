package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x6 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f273163c;
    public final e3 d;
    public final c3 e;

    public x6(String str, String str2, String str3, e3 e3Var, c3 c3Var) {
        this.f273161a = str;
        this.f273162b = str2;
        this.f273163c = str3;
        this.d = e3Var;
        this.e = c3Var;
    }

    public final c3 a() {
        return this.e;
    }

    public final e3 b() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x6)) {
            return false;
        }
        x6 x6Var = (x6) obj2;
        return Intrinsics.f(this.f273161a, x6Var.f273161a) && Intrinsics.f(this.f273162b, x6Var.f273162b) && Intrinsics.f(this.f273163c, x6Var.f273163c) && Intrinsics.f(this.d, x6Var.d) && Intrinsics.f(this.e, x6Var.e);
    }

    public final int hashCode() {
        String str = this.f273161a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f273162b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f273163c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        e3 e3Var = this.d;
        int iHashCode4 = (iHashCode3 + (e3Var == null ? 0 : e3Var.hashCode())) * 31;
        c3 c3Var = this.e;
        return iHashCode4 + (c3Var != null ? c3Var.hashCode() : 0);
    }
}
