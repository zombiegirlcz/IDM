package v6f;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f286374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f286375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f286376c;

    public e() {
        this(0);
    }

    public static e a(e eVar, Data portfolioBalance, Data totalContribution, Data performance, int i) {
        if ((i & 1) != 0) {
            portfolioBalance = eVar.f286374a;
        }
        if ((i & 2) != 0) {
            totalContribution = eVar.f286375b;
        }
        if ((i & 4) != 0) {
            performance = eVar.f286376c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(portfolioBalance, "portfolioBalance");
        Intrinsics.checkNotNullParameter(totalContribution, "totalContribution");
        Intrinsics.checkNotNullParameter(performance, "performance");
        return new e(portfolioBalance, totalContribution, performance);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f286374a, eVar.f286374a) && Intrinsics.f(this.f286375b, eVar.f286375b) && Intrinsics.f(this.f286376c, eVar.f286376c);
    }

    public final int hashCode() {
        return this.f286376c.hashCode() + kii.e.c(this.f286375b, this.f286374a.hashCode() * 31, 31);
    }

    public e(Data portfolioBalance, Data totalContribution, Data performance) {
        Intrinsics.checkNotNullParameter(portfolioBalance, "portfolioBalance");
        Intrinsics.checkNotNullParameter(totalContribution, "totalContribution");
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.f286374a = portfolioBalance;
        this.f286375b = totalContribution;
        this.f286376c = performance;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null));
    }
}
