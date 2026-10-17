package w7g;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import w5b.b6;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f295542b = {yhm.j.c(yhm.k.PUBLICATION, new b6(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f295543a;

    public /* synthetic */ r(int i, List list) {
        if (1 == (i & 1)) {
            this.f295543a = list;
        } else {
            j1.f(p.f295541a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f295543a, ((r) obj2).f295543a);
    }

    public final int hashCode() {
        return this.f295543a.hashCode();
    }
}
