package q3f;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f241962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f241963c;

    public b(String portfolioId, DateTime from, DateTime to6) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f241961a = portfolioId;
        this.f241962b = from;
        this.f241963c = to6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f241961a, bVar.f241961a) && Intrinsics.f(this.f241962b, bVar.f241962b) && Intrinsics.f(this.f241963c, bVar.f241963c);
    }

    public final int hashCode() {
        return this.f241963c.hashCode() + m72.b.f(this.f241962b, this.f241961a.hashCode() * 31, 31);
    }
}
