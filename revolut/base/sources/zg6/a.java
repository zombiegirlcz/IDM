package zg6;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f322075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f322076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f322077c;

    public a(dj0.d maxPerTransfer, dj0.d maxPerMonth, dj0.d upperLimit) {
        Intrinsics.checkNotNullParameter(maxPerTransfer, "maxPerTransfer");
        Intrinsics.checkNotNullParameter(maxPerMonth, "maxPerMonth");
        Intrinsics.checkNotNullParameter(upperLimit, "upperLimit");
        this.f322075a = maxPerTransfer;
        this.f322076b = maxPerMonth;
        this.f322077c = upperLimit;
    }

    public static a a(a aVar, dj0.d maxPerTransfer, dj0.d maxPerMonth, int i) {
        if ((i & 1) != 0) {
            maxPerTransfer = aVar.f322075a;
        }
        if ((i & 2) != 0) {
            maxPerMonth = aVar.f322076b;
        }
        dj0.d upperLimit = aVar.f322077c;
        Intrinsics.checkNotNullParameter(maxPerTransfer, "maxPerTransfer");
        Intrinsics.checkNotNullParameter(maxPerMonth, "maxPerMonth");
        Intrinsics.checkNotNullParameter(upperLimit, "upperLimit");
        return new a(maxPerTransfer, maxPerMonth, upperLimit);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f322075a, aVar.f322075a) && Intrinsics.f(this.f322076b, aVar.f322076b) && Intrinsics.f(this.f322077c, aVar.f322077c);
    }

    public final int hashCode() {
        return this.f322077c.hashCode() + v7.c(this.f322075a.hashCode() * 31, 31, this.f322076b);
    }
}
