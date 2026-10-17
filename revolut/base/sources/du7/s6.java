package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class s6 {

    @NotNull
    public static final r6 Companion = new r6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m6 f117843c;

    public /* synthetic */ s6(int i, String str, String str2, m6 m6Var) {
        if (7 != (i & 7)) {
            qlm.j1.f(q6.f117822a.getDescriptor(), i, 7);
            throw null;
        }
        this.f117841a = str;
        this.f117842b = str2;
        this.f117843c = m6Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s6)) {
            return false;
        }
        s6 s6Var = (s6) obj2;
        return Intrinsics.f(this.f117841a, s6Var.f117841a) && Intrinsics.f(this.f117842b, s6Var.f117842b) && Intrinsics.f(this.f117843c, s6Var.f117843c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f117841a.hashCode() * 31, 31, this.f117842b);
        m6 m6Var = this.f117843c;
        return iC + (m6Var == null ? 0 : m6Var.hashCode());
    }
}
