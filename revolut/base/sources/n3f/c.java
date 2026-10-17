package n3f;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\n\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\u000f\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u001c\u0010\"¨\u0006%"}, d2 = {"Ln3f/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "side", "", "b", "Z", "h", "()Z", "isAutoTopUp", "c", "f", "symbol", "Ldfl/f;", "d", "Ldfl/f;", "()Ldfl/f;", "correctionType", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "amountGuaranteed", "j", "isSpareChange", "g", "i", "isFromIncomeSorter", "localisedDescription", "Ln3f/b;", "Ln3f/b;", "()Ln3f/b;", "fromAccount", "toAccount", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("side")
    @NotNull
    private final String side;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("isAutoTopUp")
    private final boolean isAutoTopUp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("symbol")
    private final String symbol;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("correctionType")
    private final dfl.f correctionType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("amountGuaranteed")
    private final Boolean amountGuaranteed;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("isSpareChange")
    private final Boolean isSpareChange;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("isFromIncomeSorter")
    private final Boolean isFromIncomeSorter;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("localisedDescription")
    private final String localisedDescription;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("fromAccount")
    private final b fromAccount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("toAccount")
    private final b toAccount;

    public c(String side, boolean z, String str, dfl.f fVar, Boolean bool, Boolean bool2, Boolean bool3, String str2, b bVar, b bVar2) {
        Intrinsics.checkNotNullParameter(side, "side");
        this.side = side;
        this.isAutoTopUp = z;
        this.symbol = str;
        this.correctionType = fVar;
        this.amountGuaranteed = bool;
        this.isSpareChange = bool2;
        this.isFromIncomeSorter = bool3;
        this.localisedDescription = str2;
        this.fromAccount = bVar;
        this.toAccount = bVar2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getAmountGuaranteed() {
        return this.amountGuaranteed;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final dfl.f getCorrectionType() {
        return this.correctionType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getFromAccount() {
        return this.fromAccount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLocalisedDescription() {
        return this.localisedDescription;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.side, cVar.side) && this.isAutoTopUp == cVar.isAutoTopUp && Intrinsics.f(this.symbol, cVar.symbol) && this.correctionType == cVar.correctionType && Intrinsics.f(this.amountGuaranteed, cVar.amountGuaranteed) && Intrinsics.f(this.isSpareChange, cVar.isSpareChange) && Intrinsics.f(this.isFromIncomeSorter, cVar.isFromIncomeSorter) && Intrinsics.f(this.localisedDescription, cVar.localisedDescription) && Intrinsics.f(this.fromAccount, cVar.fromAccount) && Intrinsics.f(this.toAccount, cVar.toAccount);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b getToAccount() {
        return this.toAccount;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsAutoTopUp() {
        return this.isAutoTopUp;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.side.hashCode() * 31, 31, this.isAutoTopUp);
        String str = this.symbol;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        dfl.f fVar = this.correctionType;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Boolean bool = this.amountGuaranteed;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isSpareChange;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isFromIncomeSorter;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.localisedDescription;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        b bVar = this.fromAccount;
        int iHashCode7 = (iHashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.toAccount;
        return iHashCode7 + (bVar2 != null ? bVar2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getIsFromIncomeSorter() {
        return this.isFromIncomeSorter;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getIsSpareChange() {
        return this.isSpareChange;
    }
}
