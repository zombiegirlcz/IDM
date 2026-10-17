package x8j;

import com.revolut.feature.staking.api.model.StakingAvailability;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f303458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3.d f303459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StakingAvailability f303460c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f303461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f303462h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f303463j;
    public final long k;

    public m(xi0.b pocketCurrency, io3.d dVar, StakingAvailability stakingAvailability, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, long j2) {
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        this.f303458a = pocketCurrency;
        this.f303459b = dVar;
        this.f303460c = stakingAvailability;
        this.d = z;
        this.e = z3;
        this.f = z4;
        this.f303461g = z6;
        this.f303462h = z11;
        this.i = z12;
        this.f303463j = z29;
        this.k = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f303458a, mVar.f303458a) && Intrinsics.f(this.f303459b, mVar.f303459b) && Intrinsics.f(this.f303460c, mVar.f303460c) && this.d == mVar.d && this.e == mVar.e && this.f == mVar.f && this.f303461g == mVar.f303461g && this.f303462h == mVar.f303462h && this.i == mVar.i && this.f303463j == mVar.f303463j && this.k == mVar.k;
    }

    public final int hashCode() {
        int iHashCode = this.f303458a.hashCode() * 31;
        io3.d dVar = this.f303459b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        StakingAvailability stakingAvailability = this.f303460c;
        return Long.hashCode(this.k) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c((iHashCode2 + (stakingAvailability != null ? stakingAvailability.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f303461g), 31, this.f303462h), 31, this.i), 31, this.f303463j);
    }
}
