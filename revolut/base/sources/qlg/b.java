package qlg;

import ibl.d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq2.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\u0004R\u001c\u00102\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R(\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u0001038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lqlg/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getBeneficiaryId", "beneficiaryId", "b", "getSourcePocketId", "sourcePocketId", "c", "getSourceCurrency", "sourceCurrency", "d", "getTargetCurrency", "targetCurrency", "", "e", "J", "getTargetAmount", "()J", "targetAmount", "f", "getNote", "note", "Lqlg/c;", "g", "Lqlg/c;", "getType", "()Lqlg/c;", "type", "h", "getTransferAppSource", "transferAppSource", "Libl/d;", "i", "Libl/d;", "getTransferReasonEmbedded", "()Libl/d;", "transferReasonEmbedded", "j", "getChargeBearer", "chargeBearer", "Lkq2/o;", "k", "Lkq2/o;", "getStraightThroughTransferMethod", "()Lkq2/o;", "straightThroughTransferMethod", "", "l", "Ljava/util/Map;", "getAdditionalInputs", "()Ljava/util/Map;", "additionalInputs", "feature_retail_us_send_checks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("beneficiaryId")
    @NotNull
    private final String beneficiaryId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("sourcePocketId")
    private final String sourcePocketId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("sourceCurrency")
    @NotNull
    private final String sourceCurrency;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String targetCurrency;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("amount")
    private final long targetAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("description")
    private final String note;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    private final c type;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferAppSource")
    private final String transferAppSource;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("reason")
    private final d transferReasonEmbedded;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("chargeBearer")
    private final String chargeBearer;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("throughRemittanceFundedBy")
    private final o straightThroughTransferMethod;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("additionalInputs")
    private final Map<String, String> additionalInputs;

    public b(String beneficiaryId, String str, String sourceCurrency, String targetCurrency, long j2, String str2, c cVar, String str3, d dVar, String str4, o oVar, Map map) {
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        this.beneficiaryId = beneficiaryId;
        this.sourcePocketId = str;
        this.sourceCurrency = sourceCurrency;
        this.targetCurrency = targetCurrency;
        this.targetAmount = j2;
        this.note = str2;
        this.type = cVar;
        this.transferAppSource = str3;
        this.transferReasonEmbedded = dVar;
        this.chargeBearer = str4;
        this.straightThroughTransferMethod = oVar;
        this.additionalInputs = map;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.beneficiaryId, bVar.beneficiaryId) && Intrinsics.f(this.sourcePocketId, bVar.sourcePocketId) && Intrinsics.f(this.sourceCurrency, bVar.sourceCurrency) && Intrinsics.f(this.targetCurrency, bVar.targetCurrency) && this.targetAmount == bVar.targetAmount && Intrinsics.f(this.note, bVar.note) && this.type == bVar.type && Intrinsics.f(this.transferAppSource, bVar.transferAppSource) && Intrinsics.f(this.transferReasonEmbedded, bVar.transferReasonEmbedded) && Intrinsics.f(this.chargeBearer, bVar.chargeBearer) && this.straightThroughTransferMethod == bVar.straightThroughTransferMethod && Intrinsics.f(this.additionalInputs, bVar.additionalInputs);
    }

    public final int hashCode() {
        int iHashCode = this.beneficiaryId.hashCode() * 31;
        String str = this.sourcePocketId;
        int iC = a0.d.c(p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.sourceCurrency), 31, this.targetCurrency), 31, this.targetAmount);
        String str2 = this.note;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        c cVar = this.type;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str3 = this.transferAppSource;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        d dVar = this.transferReasonEmbedded;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str4 = this.chargeBearer;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        o oVar = this.straightThroughTransferMethod;
        int iHashCode7 = (iHashCode6 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        Map<String, String> map = this.additionalInputs;
        return iHashCode7 + (map != null ? map.hashCode() : 0);
    }
}
