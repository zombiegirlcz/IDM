package dqc;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116933a;

    public /* synthetic */ f(int i, String str) {
        if (1 == (i & 1)) {
            this.f116933a = str;
        } else {
            j1.f(d.f116932a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f116933a, ((f) obj2).f116933a);
    }

    public final int hashCode() {
        return this.f116933a.hashCode();
    }
}
