package j0d;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class q {

    @NotNull
    public static final m Companion = new m();
    public static final Lazy[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f170014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f170015c;
    public final String d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f170016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f170017h;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        i = new Lazy[]{null, yhm.j.c(kVar, new iw4.b(23)), null, null, null, null, null, yhm.j.c(kVar, new iw4.b(24))};
    }

    public /* synthetic */ q(int i2, String str, b bVar, p pVar, String str2, boolean z, boolean z3, String str3, List list) {
        if (255 != (i2 & 255)) {
            j1.f(l.f170008a.getDescriptor(), i2, 255);
            throw null;
        }
        this.f170013a = str;
        this.f170014b = bVar;
        this.f170015c = pVar;
        this.d = str2;
        this.e = z;
        this.f = z3;
        this.f170016g = str3;
        this.f170017h = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f170013a, qVar.f170013a) && this.f170014b == qVar.f170014b && Intrinsics.f(this.f170015c, qVar.f170015c) && Intrinsics.f(this.d, qVar.d) && this.e == qVar.e && this.f == qVar.f && Intrinsics.f(this.f170016g, qVar.f170016g) && Intrinsics.f(this.f170017h, qVar.f170017h);
    }

    public final int hashCode() {
        int iHashCode = (this.f170015c.hashCode() + ((this.f170014b.hashCode() + (this.f170013a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int iC = j6.a.c(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        String str2 = this.f170016g;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f170017h;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
