package j19;

import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class k1 {

    @NotNull
    public static final i1 Companion = new i1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f170218b = {yhm.j.c(yhm.k.PUBLICATION, new j18.j(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f170219a;

    public /* synthetic */ k1(int i, j1 j1Var) {
        if (1 == (i & 1)) {
            this.f170219a = j1Var;
        } else {
            qlm.j1.f(h1.f170209a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k1) && this.f170219a == ((k1) obj2).f170219a;
    }

    public final int hashCode() {
        return this.f170219a.hashCode();
    }
}
