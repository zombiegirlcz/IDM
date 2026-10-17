package s7h;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import s77.x;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class l {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f260833g = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new x(24)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f260835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.a f260836c;
    public final Long d;
    public final List e;
    public final h f;

    public /* synthetic */ l(int i, String str, jo3.a aVar, jo3.a aVar2, Long l2, List list, h hVar) {
        if (63 != (i & 63)) {
            j1.f(a.f260824a.getDescriptor(), i, 63);
            throw null;
        }
        this.f260834a = str;
        this.f260835b = aVar;
        this.f260836c = aVar2;
        this.d = l2;
        this.e = list;
        this.f = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f260834a, lVar.f260834a) && Intrinsics.f(this.f260835b, lVar.f260835b) && Intrinsics.f(this.f260836c, lVar.f260836c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f260834a.hashCode() * 31;
        jo3.a aVar = this.f260835b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.f260836c;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        h hVar = this.f;
        return iHashCode5 + (hVar != null ? hVar.hashCode() : 0);
    }

    public l(String status, jo3.a aVar, jo3.a aVar2, Long l2, ArrayList arrayList, h hVar) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f260834a = status;
        this.f260835b = aVar;
        this.f260836c = aVar2;
        this.d = l2;
        this.e = arrayList;
        this.f = hVar;
    }
}
