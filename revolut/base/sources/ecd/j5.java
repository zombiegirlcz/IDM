package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class j5 {

    @NotNull
    public static final i5 Companion = new i5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m5 f124597b;

    public /* synthetic */ j5(int i, String str, m5 m5Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(h5.f124567a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124596a = str;
        this.f124597b = m5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j5)) {
            return false;
        }
        j5 j5Var = (j5) obj2;
        return Intrinsics.f(this.f124596a, j5Var.f124596a) && Intrinsics.f(this.f124597b, j5Var.f124597b);
    }

    public final int hashCode() {
        String str = this.f124596a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        m5 m5Var = this.f124597b;
        return iHashCode + (m5Var != null ? m5Var.f124621a.hashCode() : 0);
    }

    public j5(String str, m5 m5Var) {
        this.f124596a = str;
        this.f124597b = m5Var;
    }
}
