package ds7;

import ds7.d;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();
    public static final Lazy[] e = {null, null, null, j.c(k.PUBLICATION, new a(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117270c;
    public final d d;

    public /* synthetic */ g(int i, String str, String str2, String str3, d dVar) {
        if (15 != (i & 15)) {
            j1.f(c.f117262a.getDescriptor(), i, 15);
            throw null;
        }
        this.f117268a = str;
        this.f117269b = str2;
        this.f117270c = str3;
        this.d = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f117268a, gVar.f117268a) && Intrinsics.f(this.f117269b, gVar.f117269b) && Intrinsics.f(this.f117270c, gVar.f117270c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        String str = this.f117268a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f117269b);
        String str2 = this.f117270c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        d dVar = this.d;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    public g(String str, String title, String str2, d.b bVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f117268a = str;
        this.f117269b = title;
        this.f117270c = str2;
        this.d = bVar;
    }
}
