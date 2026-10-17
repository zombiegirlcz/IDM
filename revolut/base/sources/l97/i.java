package l97;

import aw0.l8;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements cli.j, cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f193060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f193061c;
    public final String d;
    public final List e;
    public final l8 f;

    public i(String query, List hints, String str, String str2, List items, l8 l8Var) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(hints, "hints");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f193059a = query;
        this.f193060b = hints;
        this.f193061c = str;
        this.d = str2;
        this.e = items;
        this.f = l8Var;
    }

    public static i n(i iVar, String str, ArrayList arrayList, String str2, String str3, List list, l8 l8Var, int i) {
        if ((i & 1) != 0) {
            str = iVar.f193059a;
        }
        String query = str;
        List list2 = arrayList;
        if ((i & 2) != 0) {
            list2 = iVar.f193060b;
        }
        List hints = list2;
        if ((i & 4) != 0) {
            str2 = iVar.f193061c;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = iVar.d;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            list = iVar.e;
        }
        List items = list;
        if ((i & 32) != 0) {
            l8Var = iVar.f;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(hints, "hints");
        Intrinsics.checkNotNullParameter(items, "items");
        return new i(query, hints, str4, str5, items, l8Var);
    }

    @Override // cli.p
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f193059a, iVar.f193059a) && Intrinsics.f(this.f193060b, iVar.f193060b) && Intrinsics.f(this.f193061c, iVar.f193061c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f193059a.hashCode() * 31, 31, this.f193060b);
        String str = this.f193061c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iD2 = p.a.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        l8 l8Var = this.f;
        return iD2 + (l8Var != null ? l8Var.hashCode() : 0);
    }
}
