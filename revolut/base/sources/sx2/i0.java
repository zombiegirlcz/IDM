package sx2;

import com.revolut.core.model.account.AccountId;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i0 extends com.revolut.feature.card_design.impl.card_design.carousel.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f266296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f266297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f266298c;
    public final e93.d d;

    public i0(hha.d currentPlan, ArrayList availablePlans, AccountId accountId, e93.d cardDesign) {
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        Intrinsics.checkNotNullParameter(availablePlans, "availablePlans");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        this.f266296a = currentPlan;
        this.f266297b = availablePlans;
        this.f266298c = accountId;
        this.d = cardDesign;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return this.f266296a.equals(i0Var.f266296a) && this.f266297b.equals(i0Var.f266297b) && Intrinsics.f(this.f266298c, i0Var.f266298c) && Intrinsics.f(this.d, i0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h30.l.b(this.f266298c, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f266297b, this.f266296a.hashCode() * 31, 31), 31);
    }
}
