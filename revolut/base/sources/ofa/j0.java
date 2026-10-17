package ofa;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f224773b = {yhm.j.c(yhm.k.PUBLICATION, new n(9))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f224774a;

    public /* synthetic */ j0(int i, List list) {
        if (1 == (i & 1)) {
            this.f224774a = list;
        } else {
            j1.f(h0.f224772a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j0) && Intrinsics.f(this.f224774a, ((j0) obj2).f224774a);
    }

    public final int hashCode() {
        return this.f224774a.hashCode();
    }
}
