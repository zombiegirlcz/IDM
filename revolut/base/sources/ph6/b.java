package ph6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f236220c;
    public final d d;
    public final e e;
    public final String f;

    public b(String id10, String title, String str, d institutionSection, e permissionsSection, String expiration) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(institutionSection, "institutionSection");
        Intrinsics.checkNotNullParameter(permissionsSection, "permissionsSection");
        Intrinsics.checkNotNullParameter(expiration, "expiration");
        this.f236218a = id10;
        this.f236219b = title;
        this.f236220c = str;
        this.d = institutionSection;
        this.e = permissionsSection;
        this.f = expiration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f236218a, bVar.f236218a) && Intrinsics.f(this.f236219b, bVar.f236219b) && Intrinsics.f(this.f236220c, bVar.f236220c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f236218a.hashCode() * 31, 31, this.f236219b);
        String str = this.f236220c;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31);
    }
}
