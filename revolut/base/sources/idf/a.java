package idf;

import aii.e;
import bfl.g;
import com.revolut.data.database.models.openbanking.d;
import k4l.r0;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f160481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f160482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f160483c;

    public a(g tradeSide, r0 orderType, n instrument) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f160481a = tradeSide;
        this.f160482b = orderType;
        this.f160483c = instrument;
    }

    public final n b() {
        return this.f160483c;
    }

    public final r0 c() {
        return this.f160482b;
    }

    public final g d() {
        return this.f160481a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f160481a == aVar.f160481a && this.f160482b == aVar.f160482b && Intrinsics.f(this.f160483c, aVar.f160483c);
    }

    public final int hashCode() {
        return this.f160483c.hashCode() + d.f(this.f160482b, this.f160481a.hashCode() * 31, 31);
    }
}
