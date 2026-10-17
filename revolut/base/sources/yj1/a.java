package yj1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f314373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f314374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f314375c;
    public final String d;
    public final String e;

    public a(String id10, String typeId, String title, String subtitle, String assistantQuery) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(typeId, "typeId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(assistantQuery, "assistantQuery");
        this.f314373a = id10;
        this.f314374b = typeId;
        this.f314375c = title;
        this.d = subtitle;
        this.e = assistantQuery;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f314373a, aVar.f314373a) && Intrinsics.f(this.f314374b, aVar.f314374b) && Intrinsics.f(this.f314375c, aVar.f314375c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f314373a.hashCode() * 31, 31, this.f314374b), 31, this.f314375c), 31, this.d);
    }
}
