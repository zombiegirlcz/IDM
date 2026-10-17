package chc;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f24161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f24162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f24163c;
    public final List d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, null, yhm.j.c(kVar, new cbh.b(22)), yhm.j.c(kVar, new cbh.b(23))};
    }

    public /* synthetic */ k(int i, jo3.a aVar, jo3.a aVar2, List list, List list2) {
        if (15 != (i & 15)) {
            j1.f(i.f24160a.getDescriptor(), i, 15);
            throw null;
        }
        this.f24161a = aVar;
        this.f24162b = aVar2;
        this.f24163c = list;
        this.d = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f24161a, kVar.f24161a) && Intrinsics.f(this.f24162b, kVar.f24162b) && Intrinsics.f(this.f24163c, kVar.f24163c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        jo3.a aVar = this.f24161a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        jo3.a aVar2 = this.f24162b;
        int iD = p.a.d((iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31, this.f24163c);
        List list = this.d;
        return iD + (list != null ? list.hashCode() : 0);
    }

    public k(jo3.a aVar, jo3.a aVar2, ArrayList types, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(types, "types");
        this.f24161a = aVar;
        this.f24162b = aVar2;
        this.f24163c = types;
        this.d = arrayList;
    }
}
