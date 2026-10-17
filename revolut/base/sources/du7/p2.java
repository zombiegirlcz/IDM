package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class p2 {

    @NotNull
    public static final v1 Companion = new v1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117807c;
    public final o2 d;
    public final b2 e;
    public final y1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b7 f117808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h2 f117809h;

    public /* synthetic */ p2(int i, String str, String str2, String str3, o2 o2Var, b2 b2Var, y1 y1Var, b7 b7Var, h2 h2Var) {
        if (255 != (i & 255)) {
            qlm.j1.f(u1.f117863a.getDescriptor(), i, 255);
            throw null;
        }
        this.f117805a = str;
        this.f117806b = str2;
        this.f117807c = str3;
        this.d = o2Var;
        this.e = b2Var;
        this.f = y1Var;
        this.f117808g = b7Var;
        this.f117809h = h2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj2;
        return Intrinsics.f(this.f117805a, p2Var.f117805a) && Intrinsics.f(this.f117806b, p2Var.f117806b) && Intrinsics.f(this.f117807c, p2Var.f117807c) && Intrinsics.f(this.d, p2Var.d) && Intrinsics.f(this.e, p2Var.e) && Intrinsics.f(this.f, p2Var.f) && Intrinsics.f(this.f117808g, p2Var.f117808g) && Intrinsics.f(this.f117809h, p2Var.f117809h);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f117805a.hashCode() * 31, 31, this.f117806b);
        String str = this.f117807c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        o2 o2Var = this.d;
        int iHashCode2 = (iHashCode + (o2Var == null ? 0 : o2Var.f117792a.hashCode())) * 31;
        b2 b2Var = this.e;
        int iHashCode3 = (iHashCode2 + (b2Var == null ? 0 : b2Var.hashCode())) * 31;
        y1 y1Var = this.f;
        int iHashCode4 = (iHashCode3 + (y1Var == null ? 0 : y1Var.f117912a.hashCode())) * 31;
        b7 b7Var = this.f117808g;
        int iHashCode5 = (iHashCode4 + (b7Var == null ? 0 : b7Var.hashCode())) * 31;
        h2 h2Var = this.f117809h;
        return iHashCode5 + (h2Var != null ? h2Var.hashCode() : 0);
    }
}
