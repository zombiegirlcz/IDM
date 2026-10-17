package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class o4 {

    @NotNull
    public static final k4 Companion = new k4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n4 f153243b;

    public /* synthetic */ o4(int i, String str, n4 n4Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(j4.f153160a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153242a = str;
        this.f153243b = n4Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o4)) {
            return false;
        }
        o4 o4Var = (o4) obj2;
        return Intrinsics.f(this.f153242a, o4Var.f153242a) && Intrinsics.f(this.f153243b, o4Var.f153243b);
    }

    public final int hashCode() {
        int iHashCode = this.f153242a.hashCode() * 31;
        n4 n4Var = this.f153243b;
        return iHashCode + (n4Var == null ? 0 : n4Var.hashCode());
    }
}
