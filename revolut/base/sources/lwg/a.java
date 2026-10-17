package lwg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f200459c;

    public a(String ref2, String symbol, String description) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f200457a = ref2;
        this.f200458b = symbol;
        this.f200459c = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f200457a, aVar.f200457a) && Intrinsics.f(this.f200458b, aVar.f200458b) && Intrinsics.f(this.f200459c, aVar.f200459c);
    }

    public final int hashCode() {
        return this.f200459c.hashCode() + p.a.c(this.f200457a.hashCode() * 31, 31, this.f200458b);
    }
}
