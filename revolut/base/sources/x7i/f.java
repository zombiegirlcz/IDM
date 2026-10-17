package x7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountWrapper f303216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountWrapper f303217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j8l.l f303218c;

    public f(AccountWrapper sourceAccount, AccountWrapper targetAccount, j8l.l moveResult) {
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
        Intrinsics.checkNotNullParameter(moveResult, "moveResult");
        this.f303216a = sourceAccount;
        this.f303217b = targetAccount;
        this.f303218c = moveResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f303216a, fVar.f303216a) && Intrinsics.f(this.f303217b, fVar.f303217b) && Intrinsics.f(this.f303218c, fVar.f303218c);
    }

    public final int hashCode() {
        return this.f303218c.hashCode() + ((this.f303217b.hashCode() + (this.f303216a.hashCode() * 31)) * 31);
    }
}
