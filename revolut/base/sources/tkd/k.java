package tkd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f271943a;

    public /* synthetic */ k(int i, l lVar) {
        if (1 == (i & 1)) {
            this.f271943a = lVar;
        } else {
            j1.f(i.f271942a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final l a() {
        return this.f271943a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f271943a, ((k) obj2).f271943a);
    }

    public final int hashCode() {
        return this.f271943a.hashCode();
    }
}
