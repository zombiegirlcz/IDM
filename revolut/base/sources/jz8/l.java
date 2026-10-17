package jz8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f179637a;

    public /* synthetic */ l(int i, z0 z0Var) {
        if (1 == (i & 1)) {
            this.f179637a = z0Var;
        } else {
            j1.f(j.f179634a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f179637a, ((l) obj2).f179637a);
    }

    public final int hashCode() {
        return this.f179637a.hashCode();
    }

    public l(z0 reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f179637a = reward;
    }
}
