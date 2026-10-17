package s7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260750a;

    public /* synthetic */ k(int i, String str) {
        if (1 == (i & 1)) {
            this.f260750a = str;
        } else {
            qlm.j1.f(i.f260737a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f260750a, ((k) obj2).f260750a);
    }

    public final int hashCode() {
        return this.f260750a.hashCode();
    }
}
