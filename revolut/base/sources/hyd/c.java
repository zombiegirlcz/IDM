package hyd;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f156790b = {yhm.j.c(yhm.k.PUBLICATION, new hul.c(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f156791a;

    public /* synthetic */ c(int i, List list) {
        if (1 == (i & 1)) {
            this.f156791a = list;
        } else {
            j1.f(a.f156785a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f156791a, ((c) obj2).f156791a);
    }

    public final int hashCode() {
        return this.f156791a.hashCode();
    }
}
