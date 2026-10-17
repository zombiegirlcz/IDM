package s7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class c0 {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t7g.o f260693b;

    public /* synthetic */ c0(int i, String str, t7g.o oVar) {
        if (3 != (i & 3)) {
            qlm.j1.f(a0.f260682a.getDescriptor(), i, 3);
            throw null;
        }
        this.f260692a = str;
        this.f260693b = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f260692a, c0Var.f260692a) && Intrinsics.f(this.f260693b, c0Var.f260693b);
    }

    public final int hashCode() {
        return this.f260693b.hashCode() + (this.f260692a.hashCode() * 31);
    }
}
