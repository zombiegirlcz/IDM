package o45;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class m0 extends j0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f222080c = {yhm.j.c(yhm.k.PUBLICATION, new o23.b(15))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f222081b;

    public /* synthetic */ m0(int i, List list) {
        if (1 == (i & 1)) {
            this.f222081b = list;
        } else {
            qlm.j1.f(k0.f222074a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m0) && Intrinsics.f(this.f222081b, ((m0) obj2).f222081b);
    }

    public final int hashCode() {
        return this.f222081b.hashCode();
    }

    public m0(ArrayList policies) {
        Intrinsics.checkNotNullParameter(policies, "policies");
        this.f222081b = policies;
    }
}
