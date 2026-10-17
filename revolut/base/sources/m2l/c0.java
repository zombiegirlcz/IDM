package m2l;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class c0 {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f202190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f202191b;

    public /* synthetic */ c0(int i, u uVar, u uVar2) {
        if (3 != (i & 3)) {
            j1.f(a0.f202188a.getDescriptor(), i, 3);
            throw null;
        }
        this.f202190a = uVar;
        this.f202191b = uVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f202190a, c0Var.f202190a) && Intrinsics.f(this.f202191b, c0Var.f202191b);
    }

    public final int hashCode() {
        return this.f202191b.hashCode() + (this.f202190a.hashCode() * 31);
    }

    public c0(u actual, u reference) {
        Intrinsics.checkNotNullParameter(actual, "actual");
        Intrinsics.checkNotNullParameter(reference, "reference");
        this.f202190a = actual;
        this.f202191b = reference;
    }
}
