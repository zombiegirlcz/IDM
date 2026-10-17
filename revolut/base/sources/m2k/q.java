package m2k;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R.\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010+\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u00101\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\b3\u0010\u0004R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\u0004R\u001c\u0010=\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010C\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010F\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010\u0006\u001a\u0004\bE\u0010\u0004R(\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010\"\u001a\u0004\bH\u0010$R\u001c\u0010O\u001a\u0004\u0018\u00010J8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001c\u0010R\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010\u0006\u001a\u0004\bQ\u0010\u0004R\u001c\u0010U\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010\u0006\u001a\u0004\bT\u0010\u0004R\u001c\u0010X\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010\u0006\u001a\u0004\bW\u0010\u0004R\u001c\u0010^\u001a\u0004\u0018\u00010Y8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]¨\u0006_"}, d2 = {"Lm2k/q;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getBeneficiaryId", "beneficiaryId", "Lm2k/p;", "b", "Lm2k/p;", "getFundingSource", "()Lm2k/p;", "fundingSource", "c", "getSourceCurrency", "sourceCurrency", "d", "getTargetCurrency", "targetCurrency", "", "e", "J", "getTargetAmount", "()J", "targetAmount", "f", "getNote", "note", "", "", "Lm2k/x;", "g", "Ljava/util/Map;", "getReferenceFields", "()Ljava/util/Map;", "referenceFields", "Lm2k/b0;", "h", "Lm2k/b0;", "getUltimateDebtor", "()Lm2k/b0;", "ultimateDebtor", "Lm2k/t;", "i", "Lm2k/t;", "getType", "()Lm2k/t;", "type", "j", "getTransferAppSource", "transferAppSource", "k", "getPaymentWidgetId", "paymentWidgetId", "Libl/d;", "l", "Libl/d;", "getTransferReasonEmbedded", "()Libl/d;", "transferReasonEmbedded", "Lgsf/r;", "m", "Lgsf/r;", "getReasons", "()Lgsf/r;", "reasons", "n", "getChargeBearer", "chargeBearer", "o", "getAdditionalInputs", "additionalInputs", "Lkq2/o;", "p", "Lkq2/o;", "getStraightThroughTransferMethod", "()Lkq2/o;", "straightThroughTransferMethod", "q", "getApmProvider", "apmProvider", "r", "getCopConfirmationId", "copConfirmationId", "s", "getTaxCalendarEventId", "taxCalendarEventId", "", "t", "Ljava/lang/Integer;", "getNumberOfInstalments", "()Ljava/lang/Integer;", "numberOfInstalments", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("beneficiaryId")
    @NotNull
    private final String beneficiaryId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fundingSource")
    private final p fundingSource;

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
    @lg.b("referenceFields")
    private final Map<String, List<x>> referenceFields;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("ultimateDebtor")
    private final b0 ultimateDebtor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("type")
    private final t type;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferAppSource")
    private final String transferAppSource;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("paymentWidgetId")
    private final String paymentWidgetId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("reason")
    private final ibl.d transferReasonEmbedded;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("reasons")
    private final gsf.r reasons;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("chargeBearer")
    private final String chargeBearer;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("additionalInputs")
    private final Map<String, String> additionalInputs;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("throughTransferFundedBy")
    private final kq2.o straightThroughTransferMethod;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("apmProvider")
    private final String apmProvider;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("copConfirmationId")
    private final String copConfirmationId;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("taxCalendarEventId")
    private final String taxCalendarEventId;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("numberOfInstalments")
    private final Integer numberOfInstalments;

    public q(String beneficiaryId, p pVar, String sourceCurrency, String targetCurrency, long j2, String str, Map map, b0 b0Var, t tVar, String str2, String str3, ibl.d dVar, gsf.r rVar, String str4, Map map2, kq2.o oVar, String str5, String str6, String str7, Integer num) {
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        this.beneficiaryId = beneficiaryId;
        this.fundingSource = pVar;
        this.sourceCurrency = sourceCurrency;
        this.targetCurrency = targetCurrency;
        this.targetAmount = j2;
        this.note = str;
        this.referenceFields = map;
        this.ultimateDebtor = b0Var;
        this.type = tVar;
        this.transferAppSource = str2;
        this.paymentWidgetId = str3;
        this.transferReasonEmbedded = dVar;
        this.reasons = rVar;
        this.chargeBearer = str4;
        this.additionalInputs = map2;
        this.straightThroughTransferMethod = oVar;
        this.apmProvider = str5;
        this.copConfirmationId = str6;
        this.taxCalendarEventId = str7;
        this.numberOfInstalments = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.beneficiaryId, qVar.beneficiaryId) && Intrinsics.f(this.fundingSource, qVar.fundingSource) && Intrinsics.f(this.sourceCurrency, qVar.sourceCurrency) && Intrinsics.f(this.targetCurrency, qVar.targetCurrency) && this.targetAmount == qVar.targetAmount && Intrinsics.f(this.note, qVar.note) && Intrinsics.f(this.referenceFields, qVar.referenceFields) && Intrinsics.f(this.ultimateDebtor, qVar.ultimateDebtor) && this.type == qVar.type && Intrinsics.f(this.transferAppSource, qVar.transferAppSource) && Intrinsics.f(this.paymentWidgetId, qVar.paymentWidgetId) && Intrinsics.f(this.transferReasonEmbedded, qVar.transferReasonEmbedded) && Intrinsics.f(this.reasons, qVar.reasons) && Intrinsics.f(this.chargeBearer, qVar.chargeBearer) && Intrinsics.f(this.additionalInputs, qVar.additionalInputs) && this.straightThroughTransferMethod == qVar.straightThroughTransferMethod && Intrinsics.f(this.apmProvider, qVar.apmProvider) && Intrinsics.f(this.copConfirmationId, qVar.copConfirmationId) && Intrinsics.f(this.taxCalendarEventId, qVar.taxCalendarEventId) && Intrinsics.f(this.numberOfInstalments, qVar.numberOfInstalments);
    }

    public final int hashCode() {
        int iHashCode = this.beneficiaryId.hashCode() * 31;
        p pVar = this.fundingSource;
        int iC = a0.d.c(p.a.c(p.a.c((iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31, 31, this.sourceCurrency), 31, this.targetCurrency), 31, this.targetAmount);
        String str = this.note;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, List<x>> map = this.referenceFields;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        b0 b0Var = this.ultimateDebtor;
        int iHashCode4 = (iHashCode3 + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        t tVar = this.type;
        int iHashCode5 = (iHashCode4 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        String str2 = this.transferAppSource;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentWidgetId;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ibl.d dVar = this.transferReasonEmbedded;
        int iHashCode8 = (iHashCode7 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        gsf.r rVar = this.reasons;
        int iHashCode9 = (iHashCode8 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        String str4 = this.chargeBearer;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, String> map2 = this.additionalInputs;
        int iHashCode11 = (iHashCode10 + (map2 == null ? 0 : map2.hashCode())) * 31;
        kq2.o oVar = this.straightThroughTransferMethod;
        int iHashCode12 = (iHashCode11 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str5 = this.apmProvider;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.copConfirmationId;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.taxCalendarEventId;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.numberOfInstalments;
        return iHashCode15 + (num != null ? num.hashCode() : 0);
    }
}
