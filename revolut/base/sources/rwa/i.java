package rwa;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class i {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f257869c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f257870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f257871b;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f257869c = new Lazy[]{yhm.j.c(kVar, new rr4.a(21)), yhm.j.c(kVar, new rr4.a(22))};
    }

    public /* synthetic */ i(List list, int i, List list2) {
        if (3 != (i & 3)) {
            j1.f(a.f257862a.getDescriptor(), i, 3);
            throw null;
        }
        this.f257870a = list;
        this.f257871b = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f257870a, iVar.f257870a) && Intrinsics.f(this.f257871b, iVar.f257871b);
    }

    public final int hashCode() {
        return this.f257871b.hashCode() + (this.f257870a.hashCode() * 31);
    }
}
