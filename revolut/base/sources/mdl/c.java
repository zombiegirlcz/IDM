package mdl;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001a\u0010$\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b\r\u0010#R \u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015R\u001c\u0010,\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u001c\u0010-\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b&\u0010+¨\u0006."}, d2 = {"Lmdl/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "j", "state", "Ljo3/a;", "c", "Ljo3/a;", "()Ljo3/a;", "balance", "", "Lhdl/e;", "d", "Ljava/util/List;", "()Ljava/util/List;", "holdings", "Lndl/a;", "Lndl/a;", "g", "()Lndl/a;", "kyc", "Lmdl/d;", "f", "Lmdl/d;", "()Lmdl/d;", "info", "Lmdl/a;", "Lmdl/a;", "()Lmdl/a;", "disclosures", "Lhdl/c;", "h", "assetsTypes", "Lorg/joda/time/DateTime;", "i", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "onboardedDate", "offboardedDate", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("balance")
    private final jo3.a balance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("holdings")
    @NotNull
    private final List<hdl.e> holdings;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("kyc")
    @NotNull
    private final ndl.a kyc;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("info")
    @NotNull
    private final d info;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("disclosures")
    @NotNull
    private final a disclosures;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("assetTypes")
    @NotNull
    private final List<hdl.c> assetsTypes;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("onboardedDate")
    private final DateTime onboardedDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("offboardedDate")
    private final DateTime offboardedDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAssetsTypes() {
        return this.assetsTypes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getBalance() {
        return this.balance;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getDisclosures() {
        return this.disclosures;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getHoldings() {
        return this.holdings;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.state, cVar.state) && Intrinsics.f(this.balance, cVar.balance) && Intrinsics.f(this.holdings, cVar.holdings) && Intrinsics.f(this.kyc, cVar.kyc) && Intrinsics.f(this.info, cVar.info) && Intrinsics.f(this.disclosures, cVar.disclosures) && Intrinsics.f(this.assetsTypes, cVar.assetsTypes) && Intrinsics.f(this.onboardedDate, cVar.onboardedDate) && Intrinsics.f(this.offboardedDate, cVar.offboardedDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final d getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ndl.a getKyc() {
        return this.kyc;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final DateTime getOffboardedDate() {
        return this.offboardedDate;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.state);
        jo3.a aVar = this.balance;
        int iD = p.a.d((this.disclosures.hashCode() + ((this.info.hashCode() + ((this.kyc.hashCode() + p.a.d((iC + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.holdings)) * 31)) * 31)) * 31, 31, this.assetsTypes);
        DateTime dateTime = this.onboardedDate;
        int iHashCode = (iD + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.offboardedDate;
        return iHashCode + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final DateTime getOnboardedDate() {
        return this.onboardedDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getState() {
        return this.state;
    }
}
