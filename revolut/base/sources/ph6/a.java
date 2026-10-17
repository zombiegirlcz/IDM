package ph6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f236217c;
    public final io3.b d;

    public a(io3.b logo, String id10, String title, String description) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(logo, "logo");
        this.f236215a = id10;
        this.f236216b = title;
        this.f236217c = description;
        this.d = logo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f236215a, aVar.f236215a) && Intrinsics.f(this.f236216b, aVar.f236216b) && Intrinsics.f(this.f236217c, aVar.f236217c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f236215a.hashCode() * 31, 31, this.f236216b), 31, this.f236217c);
    }
}
