package hdf;

import aii.e;
import bfl.g;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import k4l.r0;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f151425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f151426c;
    public final boolean d;
    public final Amount e;

    public a(String securityRef, g tradeSide, r0 orderType, boolean z, Amount amount) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.f151424a = securityRef;
        this.f151425b = tradeSide;
        this.f151426c = orderType;
        this.d = z;
        this.e = amount;
    }

    public final r0 b() {
        return this.f151426c;
    }

    public final String c() {
        return this.f151424a;
    }

    public final Amount d() {
        return this.e;
    }

    public final g e() {
        return this.f151425b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f151424a, aVar.f151424a) && this.f151425b == aVar.f151425b && this.f151426c == aVar.f151426c && this.d == aVar.d && Intrinsics.f(this.e, aVar.e);
    }

    public final boolean f() {
        return this.d;
    }

    public final int hashCode() {
        int iC = j6.a.c(d.f(this.f151426c, y.b(this.f151425b, this.f151424a.hashCode() * 31, 31), 31), 31, this.d);
        Amount amount = this.e;
        return iC + (amount == null ? 0 : amount.hashCode());
    }
}
