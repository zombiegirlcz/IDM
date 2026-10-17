package xid;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f306322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f306323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f306324c;
    public final Double d;
    public final List e;
    public final long f;

    public c(boolean z, Data auction, Data pointsBalance, Double d, List bidOptions, long j2) {
        Intrinsics.checkNotNullParameter(auction, "auction");
        Intrinsics.checkNotNullParameter(pointsBalance, "pointsBalance");
        Intrinsics.checkNotNullParameter(bidOptions, "bidOptions");
        this.f306322a = z;
        this.f306323b = auction;
        this.f306324c = pointsBalance;
        this.d = d;
        this.e = bidOptions;
        this.f = j2;
    }

    public static c a(c cVar, Data data, Data pointsBalance, Double d, List bidOptions, long j2, int i) {
        Data auction = data;
        boolean z = cVar.f306322a;
        if ((i & 2) != 0) {
            auction = cVar.f306323b;
        }
        if ((i & 4) != 0) {
            pointsBalance = cVar.f306324c;
        }
        if ((i & 8) != 0) {
            d = cVar.d;
        }
        if ((i & 16) != 0) {
            bidOptions = cVar.e;
        }
        if ((i & 32) != 0) {
            j2 = cVar.f;
        }
        long j3 = j2;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(auction, "auction");
        Intrinsics.checkNotNullParameter(pointsBalance, "pointsBalance");
        Intrinsics.checkNotNullParameter(bidOptions, "bidOptions");
        List list = bidOptions;
        Double d5 = d;
        return new c(z, auction, pointsBalance, d5, list, j3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f306322a == cVar.f306322a && Intrinsics.f(this.f306323b, cVar.f306323b) && Intrinsics.f(this.f306324c, cVar.f306324c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && this.f == cVar.f;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f306324c, kii.e.c(this.f306323b, Boolean.hashCode(this.f306322a) * 31, 31), 31);
        Double d = this.d;
        return Long.hashCode(this.f) + p.a.d((iC + (d == null ? 0 : d.hashCode())) * 31, 31, this.e);
    }
}
