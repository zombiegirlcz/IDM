package n3f;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\t\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u001c\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0016R\u001c\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u000f\u0010\u001fR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004¨\u0006#"}, d2 = {"Ln3f/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "feeType", "b", "j", "transactionId", "c", "assetType", "", "d", "Ljava/lang/Long;", "i", "()Ljava/lang/Long;", "startedAt", "", "Z", "()Z", "autoTopup", "f", "description", "g", "h", "spareChange", "Ln3f/p;", "Ln3f/p;", "()Ln3f/p;", "exchangedValue", "rate", "forMonth", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("feeType")
    @NotNull
    private final String feeType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionId")
    @NotNull
    private final String transactionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("assetType")
    @NotNull
    private final String assetType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("startedAt")
    private final Long startedAt;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("autoTopup")
    private final boolean autoTopup;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("spareChange")
    private final boolean spareChange;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("exchangedValue")
    private final p exchangedValue;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("rate")
    private final String rate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("forMonth")
    private final String forMonth;

    public m(String feeType, String transactionId, String assetType, Long l2, boolean z, String description, boolean z3, p pVar, String str, String str2) {
        Intrinsics.checkNotNullParameter(feeType, "feeType");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(description, "description");
        this.feeType = feeType;
        this.transactionId = transactionId;
        this.assetType = assetType;
        this.startedAt = l2;
        this.autoTopup = z;
        this.description = description;
        this.spareChange = z3;
        this.exchangedValue = pVar;
        this.rate = str;
        this.forMonth = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAssetType() {
        return this.assetType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAutoTopup() {
        return this.autoTopup;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final p getExchangedValue() {
        return this.exchangedValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFeeType() {
        return this.feeType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.feeType, mVar.feeType) && Intrinsics.f(this.transactionId, mVar.transactionId) && Intrinsics.f(this.assetType, mVar.assetType) && Intrinsics.f(this.startedAt, mVar.startedAt) && this.autoTopup == mVar.autoTopup && Intrinsics.f(this.description, mVar.description) && this.spareChange == mVar.spareChange && Intrinsics.f(this.exchangedValue, mVar.exchangedValue) && Intrinsics.f(this.rate, mVar.rate) && Intrinsics.f(this.forMonth, mVar.forMonth);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getForMonth() {
        return this.forMonth;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getRate() {
        return this.rate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getSpareChange() {
        return this.spareChange;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.feeType.hashCode() * 31, 31, this.transactionId), 31, this.assetType);
        Long l2 = this.startedAt;
        int iC2 = j6.a.c(p.a.c(j6.a.c((iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.autoTopup), 31, this.description), 31, this.spareChange);
        p pVar = this.exchangedValue;
        int iHashCode = (iC2 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str = this.rate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.forMonth;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getStartedAt() {
        return this.startedAt;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }
}
