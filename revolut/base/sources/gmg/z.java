package gmg;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class z {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f144850b = {yhm.j.c(yhm.k.PUBLICATION, new gla.k(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f144851a;

    public /* synthetic */ z(int i, List list) {
        if (1 == (i & 1)) {
            this.f144851a = list;
        } else {
            j1.f(l.f144832a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f144851a, ((z) obj2).f144851a);
    }

    public final int hashCode() {
        return this.f144851a.hashCode();
    }
}
