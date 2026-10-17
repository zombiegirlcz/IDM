package xag;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f303876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f303877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f303878c;

    public c() {
        this(0);
    }

    public static c a(a freeCancellationFilter, a payAtPropertyFilter, List amenities) {
        Intrinsics.checkNotNullParameter(freeCancellationFilter, "freeCancellationFilter");
        Intrinsics.checkNotNullParameter(payAtPropertyFilter, "payAtPropertyFilter");
        Intrinsics.checkNotNullParameter(amenities, "amenities");
        return new c(freeCancellationFilter, payAtPropertyFilter, amenities);
    }

    public static /* synthetic */ c b(c cVar, a aVar, a aVar2, List list, int i) {
        if ((i & 1) != 0) {
            aVar = cVar.f303876a;
        }
        if ((i & 2) != 0) {
            aVar2 = cVar.f303877b;
        }
        if ((i & 4) != 0) {
            list = cVar.f303878c;
        }
        cVar.getClass();
        return a(aVar, aVar2, list);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f303876a == cVar.f303876a && this.f303877b == cVar.f303877b && Intrinsics.f(this.f303878c, cVar.f303878c);
    }

    public final int hashCode() {
        return this.f303878c.hashCode() + ((this.f303877b.hashCode() + (this.f303876a.hashCode() * 31)) * 31);
    }

    public c(a freeCancellationFilter, a payAtPropertyFilter, List amenities) {
        Intrinsics.checkNotNullParameter(freeCancellationFilter, "freeCancellationFilter");
        Intrinsics.checkNotNullParameter(payAtPropertyFilter, "payAtPropertyFilter");
        Intrinsics.checkNotNullParameter(amenities, "amenities");
        this.f303876a = freeCancellationFilter;
        this.f303877b = payAtPropertyFilter;
        this.f303878c = amenities;
    }

    public c(int i) {
        this(a.UNAVAILABLE, a.HIDDEN, f0.f322471a);
    }
}
