package du7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class b0 {

    @NotNull
    public static final v Companion = new v();
    public static final Lazy[] f = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new ds7.a(15)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z4 f117606c;
    public final List d;
    public final b7 e;

    public /* synthetic */ b0(int i, String str, String str2, z4 z4Var, List list, b7 b7Var) {
        if (31 != (i & 31)) {
            qlm.j1.f(u.f117858a.getDescriptor(), i, 31);
            throw null;
        }
        this.f117604a = str;
        this.f117605b = str2;
        this.f117606c = z4Var;
        this.d = list;
        this.e = b7Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f117604a, b0Var.f117604a) && Intrinsics.f(this.f117605b, b0Var.f117605b) && Intrinsics.f(this.f117606c, b0Var.f117606c) && Intrinsics.f(this.d, b0Var.d) && Intrinsics.f(this.e, b0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f117604a.hashCode() * 31;
        String str = this.f117605b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        z4 z4Var = this.f117606c;
        int iHashCode3 = (iHashCode2 + (z4Var == null ? 0 : z4Var.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        b7 b7Var = this.e;
        return iHashCode4 + (b7Var != null ? b7Var.hashCode() : 0);
    }
}
