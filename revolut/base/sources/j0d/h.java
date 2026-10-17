package j0d;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f170002b = {yhm.j.c(yhm.k.PUBLICATION, new iw4.b(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f170003a;

    public /* synthetic */ h(int i, List list) {
        if (1 == (i & 1)) {
            this.f170003a = list;
        } else {
            j1.f(f.f170001a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f170003a, ((h) obj2).f170003a);
    }

    public final int hashCode() {
        return this.f170003a.hashCode();
    }
}
