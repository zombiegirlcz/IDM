package dp5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f116725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f116726b;

    public /* synthetic */ a0(int i, jo3.a aVar, x xVar) {
        if (3 != (i & 3)) {
            qlm.j1.f(y.f116825a.getDescriptor(), i, 3);
            throw null;
        }
        this.f116725a = aVar;
        this.f116726b = xVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f116725a, a0Var.f116725a) && Intrinsics.f(this.f116726b, a0Var.f116726b);
    }

    public final int hashCode() {
        jo3.a aVar = this.f116725a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        x xVar = this.f116726b;
        return iHashCode + (xVar != null ? xVar.hashCode() : 0);
    }
}
