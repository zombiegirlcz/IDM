package nnd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class w0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccount.Linked f217602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f217603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f217604c;

    public w0(AnalyticsAccount.Linked analyticsAccount, dj0.d dVar, dj0.d dVar2) {
        Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
        this.f217602a = analyticsAccount;
        this.f217603b = dVar;
        this.f217604c = dVar2;
    }

    @Override // nnd.c1
    public final AnalyticsAccount a() {
        return this.f217602a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return Intrinsics.f(this.f217602a, w0Var.f217602a) && Intrinsics.f(this.f217603b, w0Var.f217603b) && Intrinsics.f(this.f217604c, w0Var.f217604c);
    }

    public final int hashCode() {
        int iHashCode = this.f217602a.hashCode() * 31;
        dj0.d dVar = this.f217603b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.f217604c;
        return iHashCode2 + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
