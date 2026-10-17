package sul;

import k4l.r0;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bfl.g f265792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f265793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f265794c;

    public d(bfl.g tradeSide, r0 orderType, n instrument) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f265792a = tradeSide;
        this.f265793b = orderType;
        this.f265794c = instrument;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f265792a == dVar.f265792a && this.f265793b == dVar.f265793b && Intrinsics.f(this.f265794c, dVar.f265794c);
    }

    public final int hashCode() {
        return this.f265794c.hashCode() + com.revolut.data.database.models.openbanking.d.f(this.f265793b, this.f265792a.hashCode() * 31, 31);
    }
}
