package o18;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f221342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f221343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f221344c;
    public final String d;
    public final String e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f221345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f221346h;

    public a(String id10, b type, String typeId, String title, String subtitle, Instant expirationDate, String ref2, String assistantQuery) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(typeId, "typeId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(assistantQuery, "assistantQuery");
        this.f221342a = id10;
        this.f221343b = type;
        this.f221344c = typeId;
        this.d = title;
        this.e = subtitle;
        this.f = expirationDate;
        this.f221345g = ref2;
        this.f221346h = assistantQuery;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f221342a, aVar.f221342a) && this.f221343b == aVar.f221343b && Intrinsics.f(this.f221344c, aVar.f221344c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f221345g, aVar.f221345g) && Intrinsics.f(this.f221346h, aVar.f221346h);
    }

    public final int hashCode() {
        return this.f221346h.hashCode() + p.a.c(r6.b.c(p.a.c(p.a.c(p.a.c((this.f221343b.hashCode() + (this.f221342a.hashCode() * 31)) * 31, 31, this.f221344c), 31, this.d), 31, this.e), 31, this.f), 31, this.f221345g);
    }
}
