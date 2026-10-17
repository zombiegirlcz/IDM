package zh9;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pair f322246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f322247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f322248c;

    public a(Pair feeRate, xi0.b currency, boolean z) {
        Intrinsics.checkNotNullParameter(feeRate, "feeRate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f322246a = feeRate;
        this.f322247b = currency;
        this.f322248c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f322246a, aVar.f322246a) && Intrinsics.f(this.f322247b, aVar.f322247b) && this.f322248c == aVar.f322248c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f322248c) + h30.l.j(this.f322247b, this.f322246a.hashCode() * 31, 31);
    }
}
