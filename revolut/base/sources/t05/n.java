package t05;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f266923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f266924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f266925c;
    public final Data d;

    public n(Data details, Data insights, Data creditScore, Data activeApplications) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(insights, "insights");
        Intrinsics.checkNotNullParameter(creditScore, "creditScore");
        Intrinsics.checkNotNullParameter(activeApplications, "activeApplications");
        this.f266923a = details;
        this.f266924b = insights;
        this.f266925c = creditScore;
        this.d = activeApplications;
    }

    public static n a(n nVar, Data details, Data insights, Data creditScore, Data activeApplications, int i) {
        if ((i & 1) != 0) {
            details = nVar.f266923a;
        }
        if ((i & 2) != 0) {
            insights = nVar.f266924b;
        }
        if ((i & 4) != 0) {
            creditScore = nVar.f266925c;
        }
        if ((i & 8) != 0) {
            activeApplications = nVar.d;
        }
        nVar.getClass();
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(insights, "insights");
        Intrinsics.checkNotNullParameter(creditScore, "creditScore");
        Intrinsics.checkNotNullParameter(activeApplications, "activeApplications");
        return new n(details, insights, creditScore, activeApplications);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f266923a, nVar.f266923a) && Intrinsics.f(this.f266924b, nVar.f266924b) && Intrinsics.f(this.f266925c, nVar.f266925c) && Intrinsics.f(this.d, nVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f266925c, kii.e.c(this.f266924b, this.f266923a.hashCode() * 31, 31), 31);
    }
}
