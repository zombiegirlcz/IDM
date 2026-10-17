package bka;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f16310b = {yhm.j.c(yhm.k.PUBLICATION, new bi2.g(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16311a;

    public /* synthetic */ g(int i, List list) {
        if (1 == (i & 1)) {
            this.f16311a = list;
        } else {
            j1.f(e.f16307a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f16311a, ((g) obj2).f16311a);
    }

    public final int hashCode() {
        return this.f16311a.hashCode();
    }

    public g(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f16311a = items;
    }
}
