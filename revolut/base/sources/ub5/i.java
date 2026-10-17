package ub5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Lub5/i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "sourceId", "sourceCurrency", "c", "sourceState", "feature_credit_card_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("sourceId")
    private final String sourceId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("sourceCurrency")
    private final String sourceCurrency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("sourceState")
    private final String sourceState;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getSourceCurrency() {
        return this.sourceCurrency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSourceState() {
        return this.sourceState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.sourceId, iVar.sourceId) && Intrinsics.f(this.sourceCurrency, iVar.sourceCurrency) && Intrinsics.f(this.sourceState, iVar.sourceState);
    }

    public final int hashCode() {
        String str = this.sourceId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sourceCurrency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sourceState;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
