package fdl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class h1 {

    @NotNull
    public static final g1 Companion = new g1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f134144b;

    public /* synthetic */ h1(int i, String str, jo3.a aVar) {
        if (3 != (i & 3)) {
            qlm.j1.f(f1.f134095a.getDescriptor(), i, 3);
            throw null;
        }
        this.f134143a = str;
        this.f134144b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj2;
        return Intrinsics.f(this.f134143a, h1Var.f134143a) && Intrinsics.f(this.f134144b, h1Var.f134144b);
    }

    public final int hashCode() {
        return this.f134144b.hashCode() + (this.f134143a.hashCode() * 31);
    }
}
