package rn8;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f255530b = {j.c(k.PUBLICATION, new rm0.k(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f255531a;

    public /* synthetic */ i(int i, List list) {
        if (1 == (i & 1)) {
            this.f255531a = list;
        } else {
            j1.f(g.f255529a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f255531a, ((i) obj2).f255531a);
    }

    public final int hashCode() {
        List list = this.f255531a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public i(ArrayList arrayList) {
        this.f255531a = arrayList;
    }
}
