package hj0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152631c;
    public final c d;

    public d(String id10, String title, String key, c contentLink) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contentLink, "contentLink");
        this.f152629a = id10;
        this.f152630b = title;
        this.f152631c = key;
        this.d = contentLink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f152629a, dVar.f152629a) && Intrinsics.f(this.f152630b, dVar.f152630b) && Intrinsics.f(this.f152631c, dVar.f152631c) && Intrinsics.f(this.d, dVar.d);
    }

    @Override // hj0.f
    public final String getId() {
        return this.f152629a;
    }

    @Override // hj0.f
    public final String getKey() {
        return this.f152631c;
    }

    @Override // hj0.f
    public final String getTitle() {
        return this.f152630b;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f152629a.hashCode() * 31, 31, this.f152630b), 31, this.f152631c);
    }
}
