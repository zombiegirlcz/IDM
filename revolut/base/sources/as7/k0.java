package as7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class k0 {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f8850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f8851b;

    public /* synthetic */ k0(int i, a0 a0Var, f fVar) {
        if (3 != (i & 3)) {
            j1.f(w.f8875a.getDescriptor(), i, 3);
            throw null;
        }
        this.f8850a = a0Var;
        this.f8851b = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f8850a, k0Var.f8850a) && Intrinsics.f(this.f8851b, k0Var.f8851b);
    }

    public final int hashCode() {
        int iHashCode = this.f8850a.hashCode() * 31;
        f fVar = this.f8851b;
        return iHashCode + (fVar == null ? 0 : fVar.f8834a.hashCode());
    }

    public k0(a0 screenContent, f fVar) {
        Intrinsics.checkNotNullParameter(screenContent, "screenContent");
        this.f8850a = screenContent;
        this.f8851b = fVar;
    }
}
