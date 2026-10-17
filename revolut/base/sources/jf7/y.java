package jf7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class y implements l1 {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f173723c = {null, yhm.j.c(yhm.k.PUBLICATION, new ja3.b(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f173725b;

    public /* synthetic */ y(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(t.f173710a.getDescriptor(), i, 3);
            throw null;
        }
        this.f173724a = str;
        this.f173725b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f173724a, yVar.f173724a) && Intrinsics.f(this.f173725b, yVar.f173725b);
    }

    public final int hashCode() {
        return this.f173725b.hashCode() + (this.f173724a.hashCode() * 31);
    }
}
