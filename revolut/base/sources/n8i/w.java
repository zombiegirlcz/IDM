package n8i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountWrapper f213478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountWrapper f213479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f213480c;

    public w(AccountWrapper targetAccount, AccountWrapper sourceAccount, dj0.d inputAmount) {
        Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(inputAmount, "inputAmount");
        this.f213478a = targetAccount;
        this.f213479b = sourceAccount;
        this.f213480c = inputAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f213478a, wVar.f213478a) && Intrinsics.f(this.f213479b, wVar.f213479b) && Intrinsics.f(this.f213480c, wVar.f213480c);
    }

    public final int hashCode() {
        return this.f213480c.hashCode() + ((this.f213479b.hashCode() + (this.f213478a.hashCode() * 31)) * 31);
    }
}
