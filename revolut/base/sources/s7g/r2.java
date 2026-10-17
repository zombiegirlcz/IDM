package s7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class r2 {

    @NotNull
    public static final q2 Companion = new q2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f260792c;
    public final String d;
    public final String e;
    public final b2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p1 f260793g;

    public /* synthetic */ r2(int i, String str, String str2, String str3, String str4, String str5, b2 b2Var, p1 p1Var) {
        if (1 != (i & 1)) {
            qlm.j1.f(p2.f260783a.getDescriptor(), i, 1);
            throw null;
        }
        this.f260790a = str;
        if ((i & 2) == 0) {
            this.f260791b = null;
        } else {
            this.f260791b = str2;
        }
        if ((i & 4) == 0) {
            this.f260792c = null;
        } else {
            this.f260792c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = b2Var;
        }
        if ((i & 64) == 0) {
            this.f260793g = null;
        } else {
            this.f260793g = p1Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj2;
        return Intrinsics.f(this.f260790a, r2Var.f260790a) && Intrinsics.f(this.f260791b, r2Var.f260791b) && Intrinsics.f(this.f260792c, r2Var.f260792c) && Intrinsics.f(this.d, r2Var.d) && Intrinsics.f(this.e, r2Var.e) && Intrinsics.f(this.f, r2Var.f) && Intrinsics.f(this.f260793g, r2Var.f260793g);
    }

    public final int hashCode() {
        int iHashCode = this.f260790a.hashCode() * 31;
        String str = this.f260791b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f260792c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        b2 b2Var = this.f;
        int iHashCode6 = (iHashCode5 + (b2Var == null ? 0 : b2Var.hashCode())) * 31;
        p1 p1Var = this.f260793g;
        return iHashCode6 + (p1Var != null ? p1Var.hashCode() : 0);
    }

    public r2(String reference, String str, String str2, String str3, String str4, b2 b2Var, p1 p1Var) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        this.f260790a = reference;
        this.f260791b = str;
        this.f260792c = str2;
        this.d = str3;
        this.e = str4;
        this.f = b2Var;
        this.f260793g = p1Var;
    }
}
