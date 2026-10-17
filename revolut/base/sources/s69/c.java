package s69;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f260157c;
    public final Instant d;
    public final String e;
    public final b f;

    public c(String id10, String title, String description, Instant timestamp, String detailsDeeplink, b bVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(detailsDeeplink, "detailsDeeplink");
        this.f260155a = id10;
        this.f260156b = title;
        this.f260157c = description;
        this.d = timestamp;
        this.e = detailsDeeplink;
        this.f = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f260155a, cVar.f260155a) && Intrinsics.f(this.f260156b, cVar.f260156b) && Intrinsics.f(this.f260157c, cVar.f260157c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(t61.a.g(this.d, p.a.c(p.a.c(this.f260155a.hashCode() * 31, 31, this.f260156b), 31, this.f260157c), 31), 31, this.e);
        b bVar = this.f;
        return iC + (bVar == null ? 0 : bVar.f260154a.hashCode());
    }
}
