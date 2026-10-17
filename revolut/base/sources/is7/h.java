package is7;

import is7.d;
import is7.g;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h {

    @NotNull
    public static final f Companion = new f();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f168166c;
    public final g d;

    static {
        k kVar = k.PUBLICATION;
        e = new Lazy[]{null, null, j.c(kVar, new b(0)), j.c(kVar, new b(1))};
    }

    public /* synthetic */ h(int i, String str, String str2, d dVar, g gVar) {
        if (15 != (i & 15)) {
            j1.f(c.f168155a.getDescriptor(), i, 15);
            throw null;
        }
        this.f168164a = str;
        this.f168165b = str2;
        this.f168166c = dVar;
        this.d = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f168164a, hVar.f168164a) && Intrinsics.f(this.f168165b, hVar.f168165b) && Intrinsics.f(this.f168166c, hVar.f168166c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f168164a.hashCode() * 31, 31, this.f168165b);
        d dVar = this.f168166c;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        g gVar = this.d;
        return iHashCode + (gVar != null ? gVar.hashCode() : 0);
    }

    public h(String title, String value, d.b bVar, g.a aVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f168164a = title;
        this.f168165b = value;
        this.f168166c = bVar;
        this.d = aVar;
    }
}
