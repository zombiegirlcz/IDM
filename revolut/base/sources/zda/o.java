package zda;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f321402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f321403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f321404c;
    public final String d;
    public final List e;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f = new Lazy[]{yhm.j.c(kVar, new zc0.m(11)), null, null, null, yhm.j.c(kVar, new zc0.m(12))};
    }

    public /* synthetic */ o(int i, List list, x xVar, String str, String str2, List list2) {
        if (15 != (i & 15)) {
            j1.f(m.f321398a.getDescriptor(), i, 15);
            throw null;
        }
        this.f321402a = list;
        this.f321403b = xVar;
        this.f321404c = str;
        this.d = str2;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f321402a, oVar.f321402a) && Intrinsics.f(this.f321403b, oVar.f321403b) && Intrinsics.f(this.f321404c, oVar.f321404c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f321403b.hashCode() + (this.f321402a.hashCode() * 31)) * 31;
        String str = this.f321404c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.e;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public o(ArrayList accounts, x countries, String str, String str2, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(countries, "countries");
        this.f321402a = accounts;
        this.f321403b = countries;
        this.f321404c = str;
        this.d = str2;
        this.e = arrayList;
    }
}
