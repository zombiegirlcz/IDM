package bka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class l0 implements n0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f16325a;

    public /* synthetic */ l0(int i, g0 g0Var) {
        if (1 == (i & 1)) {
            this.f16325a = g0Var;
        } else {
            j1.f(c0.f16303a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l0) && Intrinsics.f(this.f16325a, ((l0) obj2).f16325a);
    }

    public final int hashCode() {
        return this.f16325a.hashCode();
    }

    public l0(g0 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f16325a = content;
    }
}
