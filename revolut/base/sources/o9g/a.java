package o9g;

import ffi.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f223270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f223271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dgi.e f223272c;
    public final List d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f223273g;

    public a(e eVar, List list, dgi.e eVar2, ArrayList arrayList, String str, boolean z, List suggestions) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.f223270a = eVar;
        this.f223271b = list;
        this.f223272c = eVar2;
        this.d = arrayList;
        this.e = str;
        this.f = z;
        this.f223273g = suggestions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f223270a, aVar.f223270a) && Intrinsics.f(this.f223271b, aVar.f223271b) && Intrinsics.f(this.f223272c, aVar.f223272c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f && Intrinsics.f(this.f223273g, aVar.f223273g);
    }

    public final int hashCode() {
        e eVar = this.f223270a;
        int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        List list = this.f223271b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        dgi.e eVar2 = this.f223272c;
        int iHashCode3 = (iHashCode2 + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.e;
        return this.f223273g.hashCode() + j6.a.c((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }
}
