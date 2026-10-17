package e7l;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f123408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f123409b;

    public h(xi0.b currency, LocalDate launchDate) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(launchDate, "launchDate");
        this.f123408a = currency;
        this.f123409b = launchDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f123408a, hVar.f123408a) && Intrinsics.f(this.f123409b, hVar.f123409b);
    }

    public final int hashCode() {
        return this.f123409b.hashCode() + (this.f123408a.hashCode() * 31);
    }
}
