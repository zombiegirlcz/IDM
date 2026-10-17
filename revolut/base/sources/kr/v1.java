package kr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class v1 {

    @NotNull
    public static final u1 Companion = new u1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f188592a;

    public /* synthetic */ v1(int i, s1 s1Var) {
        if (1 == (i & 1)) {
            this.f188592a = s1Var;
        } else {
            qlm.j1.f(t1.f188583a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v1) && Intrinsics.f(this.f188592a, ((v1) obj2).f188592a);
    }

    public final int hashCode() {
        return this.f188592a.f188577a.hashCode();
    }

    public v1(s1 qualityNet) {
        Intrinsics.checkNotNullParameter(qualityNet, "qualityNet");
        this.f188592a = qualityNet;
    }
}
