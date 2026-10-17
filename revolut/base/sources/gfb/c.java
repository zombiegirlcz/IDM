package gfb;

import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes6.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f143385c;
    public final Map d;

    static {
        k kVar = k.PUBLICATION;
        e = new Lazy[]{null, null, j.c(kVar, new gaa.b(14)), j.c(kVar, new gaa.b(15))};
    }

    public /* synthetic */ c(int i, String str, String str2, List list, Map map) {
        if (1 != (i & 1)) {
            j1.f(a.f143382a.getDescriptor(), i, 1);
            throw null;
        }
        this.f143383a = str;
        if ((i & 2) == 0) {
            this.f143384b = null;
        } else {
            this.f143384b = str2;
        }
        if ((i & 4) == 0) {
            this.f143385c = null;
        } else {
            this.f143385c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = map;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f143383a, cVar.f143383a) && Intrinsics.f(this.f143384b, cVar.f143384b) && Intrinsics.f(this.f143385c, cVar.f143385c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f143383a.hashCode() * 31;
        String str = this.f143384b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f143385c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.d;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }
}
