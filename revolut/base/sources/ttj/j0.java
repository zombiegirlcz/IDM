package ttj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274356b;

    public /* synthetic */ j0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(h0.f274349a.getDescriptor(), i, 3);
            throw null;
        }
        this.f274355a = str;
        this.f274356b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f274355a, j0Var.f274355a) && Intrinsics.f(this.f274356b, j0Var.f274356b);
    }

    public final int hashCode() {
        return this.f274356b.hashCode() + (this.f274355a.hashCode() * 31);
    }
}
