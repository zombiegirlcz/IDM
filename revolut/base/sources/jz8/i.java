package jz8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f179624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f179625c;
    public final String d;
    public final u09.l e;
    public final u09.k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u09.v f179626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f179627h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f179628j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f179629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f179630m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f179631n;
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Boolean f179632p;

    public i(String id10, String title, z0 reward, String thumbnail, u09.l state, u09.k kVar, u09.v domain, String description, int i, List lessonsProgress, boolean z, List list, String str, l lVar, List list2, Boolean bool) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(lessonsProgress, "lessonsProgress");
        this.f179623a = id10;
        this.f179624b = title;
        this.f179625c = reward;
        this.d = thumbnail;
        this.e = state;
        this.f = kVar;
        this.f179626g = domain;
        this.f179627h = description;
        this.i = i;
        this.f179628j = lessonsProgress;
        this.k = z;
        this.f179629l = list;
        this.f179630m = str;
        this.f179631n = lVar;
        this.o = list2;
        this.f179632p = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f179623a, iVar.f179623a) && Intrinsics.f(this.f179624b, iVar.f179624b) && Intrinsics.f(this.f179625c, iVar.f179625c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e && this.f == iVar.f && this.f179626g == iVar.f179626g && Intrinsics.f(this.f179627h, iVar.f179627h) && this.i == iVar.i && Intrinsics.f(this.f179628j, iVar.f179628j) && this.k == iVar.k && Intrinsics.f(this.f179629l, iVar.f179629l) && Intrinsics.f(this.f179630m, iVar.f179630m) && Intrinsics.f(this.f179631n, iVar.f179631n) && Intrinsics.f(this.o, iVar.o) && Intrinsics.f(this.f179632p, iVar.f179632p);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + p.a.c((this.f179625c.hashCode() + p.a.c(this.f179623a.hashCode() * 31, 31, this.f179624b)) * 31, 31, this.d)) * 31;
        u09.k kVar = this.f;
        int iC = j6.a.c(p.a.d(j6.a.b(this.i, p.a.c((this.f179626g.hashCode() + ((iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31)) * 31, 31, this.f179627h), 31), 31, this.f179628j), 31, this.k);
        List list = this.f179629l;
        int iHashCode2 = (iC + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f179630m;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        l lVar = this.f179631n;
        int iHashCode4 = (iHashCode3 + (lVar == null ? 0 : lVar.f179637a.hashCode())) * 31;
        List list2 = this.o;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.f179632p;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }
}
