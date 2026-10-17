package o9l;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R.\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010.\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001c\u00104\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u0010:\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001c\u0010@\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010C\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010=\u001a\u0004\bB\u0010?R\u001c\u0010F\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010\u0006\u001a\u0004\bE\u0010\u0004R\u001c\u0010I\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\bH\u0010\u0004R(\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010%\u001a\u0004\bK\u0010'R\u001c\u0010O\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010\u0006\u001a\u0004\bN\u0010\u0004R\u001c\u0010R\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010\u0006\u001a\u0004\bQ\u0010\u0004R\u001c\u0010X\u001a\u0004\u0018\u00010S8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001c\u0010[\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010\u0006\u001a\u0004\bZ\u0010\u0004R\u001c\u0010^\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010\u0006\u001a\u0004\b]\u0010\u0004R\u001c\u0010a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010\u0006\u001a\u0004\b`\u0010\u0004¨\u0006b"}, d2 = {"Lo9l/a0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getStartDate", "startDate", "b", "getSpeed", "speed", "c", "getPeriod", "period", "d", "getSourceCurrency", "sourceCurrency", "e", "getCurrency", "currency", "", "f", "Ljava/lang/Long;", "getAmount", "()Ljava/lang/Long;", "amount", "g", "getTitle", "title", "h", "getDescription", "description", "", "", "Lo9l/y;", "i", "Ljava/util/Map;", "getReferenceFields", "()Ljava/util/Map;", "referenceFields", "Lo9l/z;", "j", "Lo9l/z;", "getUltimateDebtor", "()Lo9l/z;", "ultimateDebtor", "Libl/d;", "k", "Libl/d;", "getTransferReason", "()Libl/d;", "transferReason", "Lgsf/r;", "l", "Lgsf/r;", "getReasons", "()Lgsf/r;", "reasons", "", "m", "Ljava/lang/Integer;", "getWeekDay", "()Ljava/lang/Integer;", "weekDay", "n", "getMonthDay", "monthDay", "o", "getGifUrl", "gifUrl", "p", "getChargeBearer", "chargeBearer", "q", "getAdditionalInputs", "additionalInputs", "r", "getSide", "side", "s", "getPaymentSchemeEndToEndId", "paymentSchemeEndToEndId", "Lo9l/s;", "t", "Lo9l/s;", "getEndCriteria", "()Lo9l/s;", "endCriteria", "u", "getPocketId", "pocketId", "v", "getSenderId", "senderId", "w", "getSenderType", "senderType", "feature_shared_recurring_payments_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("startDate")
    private final String startDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("speed")
    private final String speed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("period")
    private final String period;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("sourceCurrency")
    private final String sourceCurrency;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("currency")
    private final String currency;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("amount")
    private final Long amount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    private final String title;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("referenceFields")
    private final Map<String, List<y>> referenceFields;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("ultimateDebtor")
    private final z ultimateDebtor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("reason")
    private final ibl.d transferReason;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("reasons")
    private final gsf.r reasons;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("weekDay")
    private final Integer weekDay;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("monthDay")
    private final Integer monthDay;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("gif")
    private final String gifUrl;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("chargeBearer")
    private final String chargeBearer;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("additionalInputs")
    private final Map<String, String> additionalInputs;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("side")
    private final String side;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentSchemeEndToEndId")
    private final String paymentSchemeEndToEndId;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("endCriteria")
    private final s endCriteria;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("sender")
    private final String senderId;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("senderType")
    private final String senderType;

    public a0(String str, String str2, String str3, String str4, String str5, Long l2, String str6, String str7, Map map, z zVar, ibl.d dVar, gsf.r rVar, Integer num, Integer num2, String str8, String str9, Map map2, String str10, String str11, s sVar, String str12, String str13, String str14) {
        this.startDate = str;
        this.speed = str2;
        this.period = str3;
        this.sourceCurrency = str4;
        this.currency = str5;
        this.amount = l2;
        this.title = str6;
        this.description = str7;
        this.referenceFields = map;
        this.ultimateDebtor = zVar;
        this.transferReason = dVar;
        this.reasons = rVar;
        this.weekDay = num;
        this.monthDay = num2;
        this.gifUrl = str8;
        this.chargeBearer = str9;
        this.additionalInputs = map2;
        this.side = str10;
        this.paymentSchemeEndToEndId = str11;
        this.endCriteria = sVar;
        this.pocketId = str12;
        this.senderId = str13;
        this.senderType = str14;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.startDate, a0Var.startDate) && Intrinsics.f(this.speed, a0Var.speed) && Intrinsics.f(this.period, a0Var.period) && Intrinsics.f(this.sourceCurrency, a0Var.sourceCurrency) && Intrinsics.f(this.currency, a0Var.currency) && Intrinsics.f(this.amount, a0Var.amount) && Intrinsics.f(this.title, a0Var.title) && Intrinsics.f(this.description, a0Var.description) && Intrinsics.f(this.referenceFields, a0Var.referenceFields) && Intrinsics.f(this.ultimateDebtor, a0Var.ultimateDebtor) && Intrinsics.f(this.transferReason, a0Var.transferReason) && Intrinsics.f(this.reasons, a0Var.reasons) && Intrinsics.f(this.weekDay, a0Var.weekDay) && Intrinsics.f(this.monthDay, a0Var.monthDay) && Intrinsics.f(this.gifUrl, a0Var.gifUrl) && Intrinsics.f(this.chargeBearer, a0Var.chargeBearer) && Intrinsics.f(this.additionalInputs, a0Var.additionalInputs) && Intrinsics.f(this.side, a0Var.side) && Intrinsics.f(this.paymentSchemeEndToEndId, a0Var.paymentSchemeEndToEndId) && Intrinsics.f(this.endCriteria, a0Var.endCriteria) && Intrinsics.f(this.pocketId, a0Var.pocketId) && Intrinsics.f(this.senderId, a0Var.senderId) && Intrinsics.f(this.senderType, a0Var.senderType);
    }

    public final int hashCode() {
        String str = this.startDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.speed;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.period;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sourceCurrency;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currency;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l2 = this.amount;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str6 = this.title;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.description;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, List<y>> map = this.referenceFields;
        int iHashCode9 = (iHashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        z zVar = this.ultimateDebtor;
        int iHashCode10 = (iHashCode9 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        ibl.d dVar = this.transferReason;
        int iHashCode11 = (iHashCode10 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        gsf.r rVar = this.reasons;
        int iHashCode12 = (iHashCode11 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        Integer num = this.weekDay;
        int iHashCode13 = (iHashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.monthDay;
        int iHashCode14 = (iHashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str8 = this.gifUrl;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.chargeBearer;
        int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Map<String, String> map2 = this.additionalInputs;
        int iHashCode17 = (iHashCode16 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str10 = this.side;
        int iHashCode18 = (iHashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.paymentSchemeEndToEndId;
        int iHashCode19 = (iHashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31;
        s sVar = this.endCriteria;
        int iHashCode20 = (iHashCode19 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        String str12 = this.pocketId;
        int iHashCode21 = (iHashCode20 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.senderId;
        int iHashCode22 = (iHashCode21 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.senderType;
        return iHashCode22 + (str14 != null ? str14.hashCode() : 0);
    }
}
