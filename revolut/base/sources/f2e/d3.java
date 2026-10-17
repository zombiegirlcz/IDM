package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class d3 {

    @NotNull
    public static final c3 Companion = new c3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a5 f131568a;

    public /* synthetic */ d3(int i, a5 a5Var) {
        if (1 == (i & 1)) {
            this.f131568a = a5Var;
        } else {
            qlm.j1.f(b3.f131545a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d3) && Intrinsics.f(this.f131568a, ((d3) obj2).f131568a);
    }

    public final int hashCode() {
        a5 a5Var = this.f131568a;
        if (a5Var == null) {
            return 0;
        }
        return a5Var.hashCode();
    }

    public d3(a5 a5Var) {
        this.f131568a = a5Var;
    }
}
