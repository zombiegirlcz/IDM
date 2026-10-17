package gr2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class s0 {

    @NotNull
    public static final r0 Companion = new r0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145867b;

    public /* synthetic */ s0(int i, String str, String str2) {
        if (2 != (i & 2)) {
            j1.f(q0.f145862a.getDescriptor(), i, 2);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f145866a = null;
        } else {
            this.f145866a = str;
        }
        this.f145867b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f145866a, s0Var.f145866a) && Intrinsics.f(this.f145867b, s0Var.f145867b);
    }

    public final int hashCode() {
        String str = this.f145866a;
        return this.f145867b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
