package q3f;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f241959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f241960c;

    public a(String portfolioId, DateTime from, DateTime to6) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f241958a = portfolioId;
        this.f241959b = from;
        this.f241960c = to6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f241958a, aVar.f241958a) && Intrinsics.f(this.f241959b, aVar.f241959b) && Intrinsics.f(this.f241960c, aVar.f241960c);
    }

    public final int hashCode() {
        return this.f241960c.hashCode() + m72.b.f(this.f241959b, this.f241958a.hashCode() * 31, 31);
    }
}
