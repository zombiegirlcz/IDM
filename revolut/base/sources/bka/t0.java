package bka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class t0 implements n0 {

    @NotNull
    public static final p0 Companion = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f16339a;

    public /* synthetic */ t0(int i, s0 s0Var) {
        if (1 == (i & 1)) {
            this.f16339a = s0Var;
        } else {
            j1.f(o0.f16328a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t0) && Intrinsics.f(this.f16339a, ((t0) obj2).f16339a);
    }

    public final int hashCode() {
        return this.f16339a.f16337a.hashCode();
    }

    public t0(s0 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f16339a = content;
    }
}
