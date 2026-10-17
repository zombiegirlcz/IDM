package o45;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class i0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222064b;

    public /* synthetic */ i0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(g0.f222060a.getDescriptor(), i, 3);
            throw null;
        }
        this.f222063a = str;
        this.f222064b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f222063a, i0Var.f222063a) && Intrinsics.f(this.f222064b, i0Var.f222064b);
    }

    public final int hashCode() {
        return this.f222064b.hashCode() + (this.f222063a.hashCode() * 31);
    }

    public i0(String id10, String state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f222063a = id10;
        this.f222064b = state;
    }
}
