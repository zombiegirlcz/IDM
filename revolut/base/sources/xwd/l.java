package xwd;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f309354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f309355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f309356c;
    public final k d;
    public final dj0.d e;
    public final yqi.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f309357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f309358h;

    public l(long j2, xi0.b displayCurrency, xi0.b stakingCurrency, k inputAmounts, dj0.d stakingPocketBalance, yqi.b bVar, String requestId, int i) {
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        Intrinsics.checkNotNullParameter(stakingCurrency, "stakingCurrency");
        Intrinsics.checkNotNullParameter(inputAmounts, "inputAmounts");
        Intrinsics.checkNotNullParameter(stakingPocketBalance, "stakingPocketBalance");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.f309354a = j2;
        this.f309355b = displayCurrency;
        this.f309356c = stakingCurrency;
        this.d = inputAmounts;
        this.e = stakingPocketBalance;
        this.f = bVar;
        this.f309357g = requestId;
        this.f309358h = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f309354a == lVar.f309354a && Intrinsics.f(this.f309355b, lVar.f309355b) && Intrinsics.f(this.f309356c, lVar.f309356c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f309357g, lVar.f309357g) && this.f309358h == lVar.f309358h;
    }

    public final int hashCode() {
        int iC = v7.c((this.d.hashCode() + h30.l.j(this.f309356c, h30.l.j(this.f309355b, Long.hashCode(this.f309354a) * 31, 31), 31)) * 31, 31, this.e);
        yqi.b bVar = this.f;
        return Integer.hashCode(this.f309358h) + p.a.c((iC + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f309357g);
    }
}
