package nxa;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class s0 {

    @NotNull
    public static final q0 Companion = new q0();
    public static final Lazy[] e = {yhm.j.c(yhm.k.PUBLICATION, new nwf.b(5)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f220521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f220522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f220523c;
    public final String d;

    public /* synthetic */ s0(int i, r0 r0Var, String str, String str2, String str3) {
        if (11 != (i & 11)) {
            j1.f(p0.f220513a.getDescriptor(), i, 11);
            throw null;
        }
        this.f220521a = r0Var;
        this.f220522b = str;
        if ((i & 4) == 0) {
            this.f220523c = null;
        } else {
            this.f220523c = str2;
        }
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return this.f220521a == s0Var.f220521a && Intrinsics.f(this.f220522b, s0Var.f220522b) && Intrinsics.f(this.f220523c, s0Var.f220523c) && Intrinsics.f(this.d, s0Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f220521a.hashCode() * 31, 31, this.f220522b);
        String str = this.f220523c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
