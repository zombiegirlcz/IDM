package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class c3 {

    @NotNull
    public static final b3 Companion = new b3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117624c;
    public final t2 d;

    public /* synthetic */ c3(int i, String str, String str2, String str3, t2 t2Var) {
        if (15 != (i & 15)) {
            qlm.j1.f(s2.f117837a.getDescriptor(), i, 15);
            throw null;
        }
        this.f117622a = str;
        this.f117623b = str2;
        this.f117624c = str3;
        this.d = t2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj2;
        return Intrinsics.f(this.f117622a, c3Var.f117622a) && Intrinsics.f(this.f117623b, c3Var.f117623b) && Intrinsics.f(this.f117624c, c3Var.f117624c) && Intrinsics.f(this.d, c3Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f117622a.hashCode() * 31;
        String str = this.f117623b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f117624c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        t2 t2Var = this.d;
        return iHashCode3 + (t2Var != null ? t2Var.hashCode() : 0);
    }
}
