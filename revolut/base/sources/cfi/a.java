package cfi;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23694c;
    public final List d;
    public final i e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f23695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f23696h;

    public a(String id10, String bookingId, String name, List images, i startingPrice, String description, d cancellationPolicy, g destination) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(startingPrice, "startingPrice");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(cancellationPolicy, "cancellationPolicy");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f23692a = id10;
        this.f23693b = bookingId;
        this.f23694c = name;
        this.d = images;
        this.e = startingPrice;
        this.f = description;
        this.f23695g = cancellationPolicy;
        this.f23696h = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f23692a, aVar.f23692a) && Intrinsics.f(this.f23693b, aVar.f23693b) && Intrinsics.f(this.f23694c, aVar.f23694c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f23695g, aVar.f23695g) && Intrinsics.f(this.f23696h, aVar.f23696h);
    }

    public final int hashCode() {
        return this.f23696h.hashCode() + ((this.f23695g.hashCode() + p.a.c((this.e.hashCode() + p.a.d(p.a.c(p.a.c(this.f23692a.hashCode() * 31, 31, this.f23693b), 31, this.f23694c), 31, this.d)) * 31, 31, this.f)) * 31);
    }
}
