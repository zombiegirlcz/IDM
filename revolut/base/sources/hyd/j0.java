package hyd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156808b;

    public /* synthetic */ j0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(h0.f156802a.getDescriptor(), i, 3);
            throw null;
        }
        this.f156807a = str;
        this.f156808b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f156807a, j0Var.f156807a) && Intrinsics.f(this.f156808b, j0Var.f156808b);
    }

    public final int hashCode() {
        return this.f156808b.hashCode() + (this.f156807a.hashCode() * 31);
    }
}
