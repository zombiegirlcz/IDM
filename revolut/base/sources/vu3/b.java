package vu3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f292204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f292205c;
    public final String d;
    public final e e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f292206g;

    public b(String id10, l media, String title, String str, e eVar, List items, i iVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f292203a = id10;
        this.f292204b = media;
        this.f292205c = title;
        this.d = str;
        this.e = eVar;
        this.f = items;
        this.f292206g = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f292203a, bVar.f292203a) && Intrinsics.f(this.f292204b, bVar.f292204b) && Intrinsics.f(this.f292205c, bVar.f292205c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f292206g, bVar.f292206g);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f292204b.hashCode() + (this.f292203a.hashCode() * 31)) * 31, 31, this.f292205c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        e eVar = this.e;
        int iD = p.a.d((iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, this.f);
        i iVar = this.f292206g;
        return iD + (iVar != null ? iVar.hashCode() : 0);
    }
}
