package egb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f125599c;

    public /* synthetic */ j0(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(h0.f125593a.getDescriptor(), i, 7);
            throw null;
        }
        this.f125597a = str;
        this.f125598b = str2;
        this.f125599c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f125597a, j0Var.f125597a) && Intrinsics.f(this.f125598b, j0Var.f125598b) && Intrinsics.f(this.f125599c, j0Var.f125599c);
    }

    public final int hashCode() {
        return this.f125599c.hashCode() + p.a.c(this.f125597a.hashCode() * 31, 31, this.f125598b);
    }
}
