package jq9;

import com.revolut.feature.push_to_card.api.data.CardOwnerWithStats;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardOwnerWithStats f177510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f177511c;
    public final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(CardOwnerWithStats cardOwner, b paymentItem, int i, int i2) {
        super(0);
        i = (i2 & 4) != 0 ? 0 : i;
        Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        this.f177510b = cardOwner;
        this.f177511c = paymentItem;
        this.d = i;
    }

    @Override // jq9.k
    public final String a() {
        return this.f177510b.f81495a.a();
    }

    @Override // jq9.k
    public final b c() {
        return this.f177511c;
    }

    @Override // jq9.k
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f177510b.equals(nVar.f177510b) && Intrinsics.f(this.f177511c, nVar.f177511c) && this.d == nVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + j6.a.b(this.d, (this.f177511c.hashCode() + (this.f177510b.hashCode() * 31)) * 31, 31);
    }
}
