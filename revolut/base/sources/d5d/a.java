package d5d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111408c;
    public final String d;
    public final String e;
    public final b f;

    public a(String id10, String type, String title, String body, String assistantQuery, b bVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(assistantQuery, "assistantQuery");
        this.f111406a = id10;
        this.f111407b = type;
        this.f111408c = title;
        this.d = body;
        this.e = assistantQuery;
        this.f = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f111406a, aVar.f111406a) && Intrinsics.f(this.f111407b, aVar.f111407b) && Intrinsics.f(this.f111408c, aVar.f111408c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.f111406a.hashCode() * 31, 31, this.f111407b), 31, this.f111408c), 31, this.d), 31, this.e);
        b bVar = this.f;
        return iC + (bVar == null ? 0 : bVar.hashCode());
    }
}
