package fkd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135772b;

    public /* synthetic */ j0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(h0.f135767a.getDescriptor(), i, 3);
            throw null;
        }
        this.f135771a = str;
        this.f135772b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f135771a, j0Var.f135771a) && Intrinsics.f(this.f135772b, j0Var.f135772b);
    }

    public final int hashCode() {
        return this.f135772b.hashCode() + (this.f135771a.hashCode() * 31);
    }
}
