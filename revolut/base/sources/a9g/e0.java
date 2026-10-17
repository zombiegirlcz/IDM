package a9g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2477c;
    public final List d;
    public final h0 e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0 f2478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d0 f2479h;
    public final String i;

    public e0(String id10, String bookingId, String name, List images, h0 startingPrice, String description, a0 cancellationPolicy, d0 destination, String currency) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(startingPrice, "startingPrice");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(cancellationPolicy, "cancellationPolicy");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f2475a = id10;
        this.f2476b = bookingId;
        this.f2477c = name;
        this.d = images;
        this.e = startingPrice;
        this.f = description;
        this.f2478g = cancellationPolicy;
        this.f2479h = destination;
        this.i = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f2475a, e0Var.f2475a) && Intrinsics.f(this.f2476b, e0Var.f2476b) && Intrinsics.f(this.f2477c, e0Var.f2477c) && Intrinsics.f(this.d, e0Var.d) && Intrinsics.f(this.e, e0Var.e) && Intrinsics.f(this.f, e0Var.f) && Intrinsics.f(this.f2478g, e0Var.f2478g) && Intrinsics.f(this.f2479h, e0Var.f2479h) && Intrinsics.f(this.i, e0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.f2479h.hashCode() + ((this.f2478g.hashCode() + p.a.c((this.e.hashCode() + p.a.d(p.a.c(p.a.c(this.f2475a.hashCode() * 31, 31, this.f2476b), 31, this.f2477c), 31, this.d)) * 31, 31, this.f)) * 31)) * 31);
    }
}
