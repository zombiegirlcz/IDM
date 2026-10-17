package x1e;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();
    public static final Lazy[] f = {null, null, yhm.j.c(yhm.k.PUBLICATION, new wyc.u(29)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f302370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f302371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f302372c;
    public final String d;
    public final String e;

    public /* synthetic */ f(int i, String str, String str2, String str3, String str4, List list) {
        if (7 != (i & 7)) {
            j1.f(d.f302369a.getDescriptor(), i, 7);
            throw null;
        }
        this.f302370a = str;
        this.f302371b = str2;
        this.f302372c = list;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f302370a, fVar.f302370a) && Intrinsics.f(this.f302371b, fVar.f302371b) && Intrinsics.f(this.f302372c, fVar.f302372c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.f302370a.hashCode() * 31, 31, this.f302371b), 31, this.f302372c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
