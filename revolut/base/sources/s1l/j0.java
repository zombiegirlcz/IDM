package s1l;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f259183b;

    public /* synthetic */ j0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(h0.f259180a.getDescriptor(), i, 3);
            throw null;
        }
        this.f259182a = str;
        this.f259183b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f259182a, j0Var.f259182a) && Intrinsics.f(this.f259183b, j0Var.f259183b);
    }

    public final int hashCode() {
        return this.f259183b.hashCode() + (this.f259182a.hashCode() * 31);
    }

    public j0(String label, String action) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f259182a = label;
        this.f259183b = action;
    }
}
