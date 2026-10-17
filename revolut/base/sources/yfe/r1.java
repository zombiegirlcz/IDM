package yfe;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class r1 implements s1 {

    @NotNull
    public static final q1 Companion = new q1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f313300b = {yhm.j.c(yhm.k.PUBLICATION, new yfd.c(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3 f313301a;

    public /* synthetic */ r1(int i, b3 b3Var) {
        if (1 == (i & 1)) {
            this.f313301a = b3Var;
        } else {
            qlm.j1.f(p1.f313292a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r1) && Intrinsics.f(this.f313301a, ((r1) obj2).f313301a);
    }

    public final int hashCode() {
        return this.f313301a.hashCode();
    }

    public r1(b3 subproduct) {
        Intrinsics.checkNotNullParameter(subproduct, "subproduct");
        this.f313301a = subproduct;
    }
}
