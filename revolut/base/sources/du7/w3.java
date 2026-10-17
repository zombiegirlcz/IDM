package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class w3 {

    @NotNull
    public static final v3 Companion = new v3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117893c;
    public final k3 d;

    public /* synthetic */ w3(int i, String str, String str2, String str3, k3 k3Var) {
        if (15 != (i & 15)) {
            qlm.j1.f(j3.f117725a.getDescriptor(), i, 15);
            throw null;
        }
        this.f117891a = str;
        this.f117892b = str2;
        this.f117893c = str3;
        this.d = k3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj2;
        return Intrinsics.f(this.f117891a, w3Var.f117891a) && Intrinsics.f(this.f117892b, w3Var.f117892b) && Intrinsics.f(this.f117893c, w3Var.f117893c) && Intrinsics.f(this.d, w3Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f117891a.hashCode() * 31;
        String str = this.f117892b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f117893c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        k3 k3Var = this.d;
        return iHashCode3 + (k3Var != null ? k3Var.hashCode() : 0);
    }
}
