package hn4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lhn4/g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getJourneyType", "journeyType", "b", "getRepaymentStrategy", "repaymentStrategy", "c", "getSourcePocketId", "sourcePocketId", "Ljo3/a;", "d", "Ljo3/a;", "getExpectedTotal", "()Ljo3/a;", "expectedTotal", "", "e", "Ljava/lang/Boolean;", "getSkipRepayment", "()Ljava/lang/Boolean;", "skipRepayment", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("journeyType")
    @NotNull
    private final String journeyType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaymentStrategy")
    private final String repaymentStrategy;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("sourcePocketId")
    private final String sourcePocketId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("expectedTotal")
    private final jo3.a expectedTotal;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("skipRepayment")
    private final Boolean skipRepayment;

    public g(String journeyType, String str, String str2, jo3.a aVar, Boolean bool) {
        Intrinsics.checkNotNullParameter(journeyType, "journeyType");
        this.journeyType = journeyType;
        this.repaymentStrategy = str;
        this.sourcePocketId = str2;
        this.expectedTotal = aVar;
        this.skipRepayment = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.journeyType, gVar.journeyType) && Intrinsics.f(this.repaymentStrategy, gVar.repaymentStrategy) && Intrinsics.f(this.sourcePocketId, gVar.sourcePocketId) && Intrinsics.f(this.expectedTotal, gVar.expectedTotal) && Intrinsics.f(this.skipRepayment, gVar.skipRepayment);
    }

    public final int hashCode() {
        int iHashCode = this.journeyType.hashCode() * 31;
        String str = this.repaymentStrategy;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sourcePocketId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        jo3.a aVar = this.expectedTotal;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Boolean bool = this.skipRepayment;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }
}
