package jsk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f178187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f178188b;

    public f(Data accountPurposeValue, Data canChangeInvestmentGoal) {
        Intrinsics.checkNotNullParameter(accountPurposeValue, "accountPurposeValue");
        Intrinsics.checkNotNullParameter(canChangeInvestmentGoal, "canChangeInvestmentGoal");
        this.f178187a = accountPurposeValue;
        this.f178188b = canChangeInvestmentGoal;
    }

    public static f a(f fVar, Data accountPurposeValue, Data canChangeInvestmentGoal, int i) {
        if ((i & 1) != 0) {
            accountPurposeValue = fVar.f178187a;
        }
        if ((i & 2) != 0) {
            canChangeInvestmentGoal = fVar.f178188b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(accountPurposeValue, "accountPurposeValue");
        Intrinsics.checkNotNullParameter(canChangeInvestmentGoal, "canChangeInvestmentGoal");
        return new f(accountPurposeValue, canChangeInvestmentGoal);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f178187a, fVar.f178187a) && Intrinsics.f(this.f178188b, fVar.f178188b);
    }

    public final int hashCode() {
        return this.f178188b.hashCode() + (this.f178187a.hashCode() * 31);
    }
}
