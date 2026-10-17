package uha;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class b0 implements qf1.d {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f280164b;

    public /* synthetic */ b0(int i, String str, a0 a0Var) {
        if (3 != (i & 3)) {
            j1.f(l.f280174a.getDescriptor(), i, 3);
            throw null;
        }
        this.f280163a = str;
        this.f280164b = a0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f280163a, b0Var.f280163a) && Intrinsics.f(this.f280164b, b0Var.f280164b);
    }

    public final int hashCode() {
        return this.f280164b.hashCode() + (this.f280163a.hashCode() * 31);
    }

    public b0(String itemId, a0 subaccount) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(subaccount, "subaccount");
        this.f280163a = itemId;
        this.f280164b = subaccount;
    }
}
