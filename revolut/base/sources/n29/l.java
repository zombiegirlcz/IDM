package n29;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class l implements s {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f211478g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f211480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f211481c;
    public final h d;
    public final v e;
    public final List f;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f211478g = new Lazy[]{null, null, null, yhm.j.c(kVar, new n08.b(15)), null, yhm.j.c(kVar, new n08.b(16))};
    }

    public /* synthetic */ l(int i, String str, String str2, String str3, h hVar, v vVar, List list) {
        if (63 != (i & 63)) {
            j1.f(j.f211475a.getDescriptor(), i, 63);
            throw null;
        }
        this.f211479a = str;
        this.f211480b = str2;
        this.f211481c = str3;
        this.d = hVar;
        this.e = vVar;
        this.f = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f211479a, lVar.f211479a) && Intrinsics.f(this.f211480b, lVar.f211480b) && Intrinsics.f(this.f211481c, lVar.f211481c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f211479a.hashCode() * 31, 31, this.f211480b);
        String str = this.f211481c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        h hVar = this.d;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        v vVar = this.e;
        return this.f.hashCode() + ((iHashCode2 + (vVar != null ? vVar.hashCode() : 0)) * 31);
    }

    public l(String header, String title, String str, h hVar, v vVar, ArrayList items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f211479a = header;
        this.f211480b = title;
        this.f211481c = str;
        this.d = hVar;
        this.e = vVar;
        this.f = items;
    }
}
