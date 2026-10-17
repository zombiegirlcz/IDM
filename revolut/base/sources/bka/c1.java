package bka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class c1 implements n0 {

    @NotNull
    public static final y0 Companion = new y0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f16304a;

    public /* synthetic */ c1(int i, b1 b1Var) {
        if (1 == (i & 1)) {
            this.f16304a = b1Var;
        } else {
            j1.f(u0.f16340a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c1) && Intrinsics.f(this.f16304a, ((c1) obj2).f16304a);
    }

    public final int hashCode() {
        return this.f16304a.hashCode();
    }

    public c1(b1 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f16304a = content;
    }
}
