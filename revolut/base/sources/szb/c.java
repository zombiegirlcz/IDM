package szb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f266784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f266785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f266786c;
    public final boolean d;
    public final Data e;
    public final boolean f;

    public c() {
        this(0);
    }

    public static c a(c cVar, Data data, boolean z, Data data2, boolean z3, Data data3, boolean z4, int i) {
        if ((i & 1) != 0) {
            data = cVar.f266784a;
        }
        Data isTransactionsUsageAvailable = data;
        if ((i & 2) != 0) {
            z = cVar.f266785b;
        }
        boolean z6 = z;
        if ((i & 4) != 0) {
            data2 = cVar.f266786c;
        }
        Data isRevolutProductsUsageAvailable = data2;
        if ((i & 8) != 0) {
            z3 = cVar.d;
        }
        boolean z11 = z3;
        if ((i & 16) != 0) {
            data3 = cVar.e;
        }
        Data isRevpointsProfileUsageAvailable = data3;
        if ((i & 32) != 0) {
            z4 = cVar.f;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(isTransactionsUsageAvailable, "isTransactionsUsageAvailable");
        Intrinsics.checkNotNullParameter(isRevolutProductsUsageAvailable, "isRevolutProductsUsageAvailable");
        Intrinsics.checkNotNullParameter(isRevpointsProfileUsageAvailable, "isRevpointsProfileUsageAvailable");
        return new c(isTransactionsUsageAvailable, z6, isRevolutProductsUsageAvailable, z11, isRevpointsProfileUsageAvailable, z4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f266784a, cVar.f266784a) && this.f266785b == cVar.f266785b && Intrinsics.f(this.f266786c, cVar.f266786c) && this.d == cVar.d && Intrinsics.f(this.e, cVar.e) && this.f == cVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + kii.e.c(this.e, j6.a.c(kii.e.c(this.f266786c, j6.a.c(this.f266784a.hashCode() * 31, 31, this.f266785b), 31), 31, this.d), 31);
    }

    public c(Data isTransactionsUsageAvailable, boolean z, Data isRevolutProductsUsageAvailable, boolean z3, Data isRevpointsProfileUsageAvailable, boolean z4) {
        Intrinsics.checkNotNullParameter(isTransactionsUsageAvailable, "isTransactionsUsageAvailable");
        Intrinsics.checkNotNullParameter(isRevolutProductsUsageAvailable, "isRevolutProductsUsageAvailable");
        Intrinsics.checkNotNullParameter(isRevpointsProfileUsageAvailable, "isRevpointsProfileUsageAvailable");
        this.f266784a = isTransactionsUsageAvailable;
        this.f266785b = z;
        this.f266786c = isRevolutProductsUsageAvailable;
        this.d = z3;
        this.e = isRevpointsProfileUsageAvailable;
        this.f = z4;
    }

    public /* synthetic */ c(int i) {
        this(new Data(null, null, false, 7, null), false, new Data(null, null, false, 7, null), false, new Data(null, null, false, 7, null), false);
    }
}
