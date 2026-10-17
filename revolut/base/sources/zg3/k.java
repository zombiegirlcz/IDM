package zg3;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class k implements b {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f322062c = {null, yhm.j.c(yhm.k.PUBLICATION, new zc0.m(21))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f322064b;

    public /* synthetic */ k(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(c.f322054a.getDescriptor(), i, 3);
            throw null;
        }
        this.f322063a = str;
        this.f322064b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f322063a, kVar.f322063a) && Intrinsics.f(this.f322064b, kVar.f322064b);
    }

    public final int hashCode() {
        return this.f322064b.hashCode() + (this.f322063a.hashCode() * 31);
    }
}
