package qo4;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u0012"}, d2 = {"Lqo4/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getToPocketId", "toPocketId", "Ljo3/a;", "b", "Ljo3/a;", "getMoney", "()Ljo3/a;", "money", "c", "getExpectedCollateralBalance", "expectedCollateralBalance", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("toPocketId")
    @NotNull
    private final String toPocketId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("money")
    @NotNull
    private final jo3.a money;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("expectedCollateralBalance")
    @NotNull
    private final jo3.a expectedCollateralBalance;

    public c(jo3.a money, jo3.a expectedCollateralBalance, String toPocketId) {
        Intrinsics.checkNotNullParameter(toPocketId, "toPocketId");
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(expectedCollateralBalance, "expectedCollateralBalance");
        this.toPocketId = toPocketId;
        this.money = money;
        this.expectedCollateralBalance = expectedCollateralBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.toPocketId, cVar.toPocketId) && Intrinsics.f(this.money, cVar.money) && Intrinsics.f(this.expectedCollateralBalance, cVar.expectedCollateralBalance);
    }

    public final int hashCode() {
        return this.expectedCollateralBalance.hashCode() + v7.j(this.money, this.toPocketId.hashCode() * 31, 31);
    }
}
