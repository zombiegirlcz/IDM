package hhd;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f152392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f152394c;
    public final List d;
    public final String e;

    public h(String str, String query, Map selectedItems, List pagerItems, List list) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f152392a = pagerItems;
        this.f152393b = str;
        this.f152394c = selectedItems;
        this.d = list;
        this.e = query;
    }

    public static h a(h hVar, ArrayList arrayList, String str, LinkedHashMap linkedHashMap, List list, String str2, int i) {
        List list2 = arrayList;
        if ((i & 1) != 0) {
            list2 = hVar.f152392a;
        }
        List pagerItems = list2;
        if ((i & 2) != 0) {
            str = hVar.f152393b;
        }
        String str3 = str;
        Map map = linkedHashMap;
        if ((i & 4) != 0) {
            map = hVar.f152394c;
        }
        Map selectedItems = map;
        if ((i & 8) != 0) {
            list = hVar.d;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            str2 = hVar.e;
        }
        String query = str2;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        Intrinsics.checkNotNullParameter(query, "query");
        return new h(str3, query, selectedItems, pagerItems, list3);
    }

    @Override // oki.a
    public final List W() {
        return this.f152392a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f152392a, hVar.f152392a) && Intrinsics.f(this.f152393b, hVar.f152393b) && Intrinsics.f(this.f152394c, hVar.f152394c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f152392a.hashCode() * 31;
        String str = this.f152393b;
        int iE = p.a.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f152394c);
        List list = this.d;
        return this.e.hashCode() + ((iE + (list != null ? list.hashCode() : 0)) * 31);
    }

    @Override // oki.a
    public final String z() {
        return this.f152393b;
    }
}
