package fr2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f137377c;
    public final List d;
    public final g e;
    public final List f;

    public b(String title, String str, List list, List list2, g gVar, List list3) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f137375a = title;
        this.f137376b = str;
        this.f137377c = list;
        this.d = list2;
        this.e = gVar;
        this.f = list3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f137375a, bVar.f137375a) && Intrinsics.f(this.f137376b, bVar.f137376b) && Intrinsics.f(this.f137377c, bVar.f137377c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f137375a.hashCode() * 31;
        String str = this.f137376b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f137377c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        g gVar = this.e;
        int iHashCode5 = (iHashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        List list3 = this.f;
        return iHashCode5 + (list3 != null ? list3.hashCode() : 0);
    }
}
