package il9;

import ip0.v7;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class i extends c {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f162184h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f162186c;
    public final Map d;
    public final Map e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f162187g;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f162184h = new Lazy[]{null, null, yhm.j.c(kVar, new igb.j(27)), yhm.j.c(kVar, new igb.j(28)), yhm.j.c(kVar, new igb.j(29)), null};
    }

    public /* synthetic */ i(int i, String str, dj0.d dVar, Map map, Map map2, b bVar, String str2) {
        if (63 != (i & 63)) {
            j1.f(g.f162183a.getDescriptor(), i, 63);
            throw null;
        }
        this.f162185b = str;
        this.f162186c = dVar;
        this.d = map;
        this.e = map2;
        this.f = bVar;
        this.f162187g = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f162185b, iVar.f162185b) && Intrinsics.f(this.f162186c, iVar.f162186c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && this.f == iVar.f && Intrinsics.f(this.f162187g, iVar.f162187g);
    }

    public final int hashCode() {
        int iC = v7.c(this.f162185b.hashCode() * 31, 31, this.f162186c);
        Map map = this.d;
        int iHashCode = (this.f.hashCode() + p.a.e((iC + (map == null ? 0 : map.hashCode())) * 31, 31, this.e)) * 31;
        String str = this.f162187g;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
