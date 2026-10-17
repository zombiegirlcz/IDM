package bia;

import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rr6.m;
import yt8.i;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f15456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f15457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FreelancerAccountOnboardingState f15458c;
    public final boolean d;
    public final i e;
    public final boolean f;

    public b(dj0.d totalBalanceInBaseCurrency, m currentCashbackRate, FreelancerAccountOnboardingState accountDetails, boolean z, i kycStatus, boolean z3) {
        Intrinsics.checkNotNullParameter(totalBalanceInBaseCurrency, "totalBalanceInBaseCurrency");
        Intrinsics.checkNotNullParameter(currentCashbackRate, "currentCashbackRate");
        Intrinsics.checkNotNullParameter(accountDetails, "accountDetails");
        Intrinsics.checkNotNullParameter(kycStatus, "kycStatus");
        this.f15456a = totalBalanceInBaseCurrency;
        this.f15457b = currentCashbackRate;
        this.f15458c = accountDetails;
        this.d = z;
        this.e = kycStatus;
        this.f = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f15456a, bVar.f15456a) && Intrinsics.f(this.f15457b, bVar.f15457b) && Intrinsics.f(this.f15458c, bVar.f15458c) && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + j6.a.c((this.f15458c.hashCode() + ((this.f15457b.hashCode() + (this.f15456a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31);
    }
}
