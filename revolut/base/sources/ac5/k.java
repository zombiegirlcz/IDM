package ac5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0018"}, d2 = {"Lac5/k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "Lac5/x;", "b", "Lac5/x;", "getDay", "()Lac5/x;", "day", "Lac5/j;", "c", "Lac5/j;", "getAmount", "()Lac5/j;", "amount", "d", "getSourcePocketId", "sourcePocketId", "feature_credit_card_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("day")
    @NotNull
    private final x day;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final j amount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("sourcePocketId")
    private final String sourcePocketId;

    public k(String type, x day, j amount, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(day, "day");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.type = type;
        this.day = day;
        this.amount = amount;
        this.sourcePocketId = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.type, kVar.type) && Intrinsics.f(this.day, kVar.day) && Intrinsics.f(this.amount, kVar.amount) && Intrinsics.f(this.sourcePocketId, kVar.sourcePocketId);
    }

    public final int hashCode() {
        int iHashCode = (this.amount.hashCode() + ((this.day.hashCode() + (this.type.hashCode() * 31)) * 31)) * 31;
        String str = this.sourcePocketId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
