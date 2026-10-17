package pj8;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f236692b = {j.c(k.PUBLICATION, new pgk.d(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f236693a;

    public /* synthetic */ c(int i, List list) {
        if (1 == (i & 1)) {
            this.f236693a = list;
        } else {
            j1.f(a.f236691a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f236693a, ((c) obj2).f236693a);
    }

    public final int hashCode() {
        return this.f236693a.hashCode();
    }
}
