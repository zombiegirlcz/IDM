package jr;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class s {

    @NotNull
    public static final r Companion = new r();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f177836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f177837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f177838c;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        d = new Lazy[]{yhm.j.c(kVar, new jp9.l(11)), yhm.j.c(kVar, new jp9.l(12)), null};
    }

    public /* synthetic */ s(int i, List list, List list2, p pVar) {
        if (1 != (i & 1)) {
            qlm.j1.f(q.f177826a.getDescriptor(), i, 1);
            throw null;
        }
        this.f177836a = list;
        if ((i & 2) == 0) {
            this.f177837b = null;
        } else {
            this.f177837b = list2;
        }
        if ((i & 4) == 0) {
            this.f177838c = null;
        } else {
            this.f177838c = pVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f177836a, sVar.f177836a) && Intrinsics.f(this.f177837b, sVar.f177837b) && Intrinsics.f(this.f177838c, sVar.f177838c);
    }

    public final int hashCode() {
        int iHashCode = this.f177836a.hashCode() * 31;
        List list = this.f177837b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        p pVar = this.f177838c;
        return iHashCode2 + (pVar != null ? pVar.hashCode() : 0);
    }
}
