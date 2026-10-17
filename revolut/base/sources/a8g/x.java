package a8g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f2244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f2245b;

    public /* synthetic */ x(int i, jo3.a aVar, jo3.a aVar2) {
        if (3 != (i & 3)) {
            j1.f(v.f2243a.getDescriptor(), i, 3);
            throw null;
        }
        this.f2244a = aVar;
        this.f2245b = aVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f2244a, xVar.f2244a) && Intrinsics.f(this.f2245b, xVar.f2245b);
    }

    public final int hashCode() {
        return this.f2245b.hashCode() + (this.f2244a.hashCode() * 31);
    }
}
