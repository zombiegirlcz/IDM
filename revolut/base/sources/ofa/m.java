package ofa;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class m implements g0 {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f224778a;

    public /* synthetic */ m(int i, l lVar) {
        if (1 == (i & 1)) {
            this.f224778a = lVar;
        } else {
            j1.f(f.f224769a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f224778a, ((m) obj2).f224778a);
    }

    public final int hashCode() {
        return this.f224778a.hashCode();
    }
}
