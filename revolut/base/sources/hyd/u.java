package hyd;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f156832b = {yhm.j.c(yhm.k.PUBLICATION, new hul.c(20))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f156833a;

    public /* synthetic */ u(int i, List list) {
        if (1 == (i & 1)) {
            this.f156833a = list;
        } else {
            j1.f(s.f156827a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f156833a, ((u) obj2).f156833a);
    }

    public final int hashCode() {
        return this.f156833a.hashCode();
    }
}
