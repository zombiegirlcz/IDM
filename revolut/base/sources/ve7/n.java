package ve7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f288143b = {yhm.j.c(yhm.k.PUBLICATION, new i(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f288144a;

    public /* synthetic */ n(int i, List list) {
        if (1 == (i & 1)) {
            this.f288144a = list;
        } else {
            j1.f(l.f288142a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f288144a, ((n) obj2).f288144a);
    }

    public final int hashCode() {
        return this.f288144a.hashCode();
    }
}
