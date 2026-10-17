package o9l;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001a\u0010#\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001a\u0010)\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\u0004R.\u00101\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u00107\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001c\u0010=\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010C\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010I\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001c\u0010L\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010F\u001a\u0004\bK\u0010HR\u001c\u0010O\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010\u0006\u001a\u0004\bN\u0010\u0004R\u001c\u0010R\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010\u0006\u001a\u0004\bQ\u0010\u0004R\u001c\u0010U\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010\u0006\u001a\u0004\bT\u0010\u0004R\u001c\u0010X\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010\u0006\u001a\u0004\bW\u0010\u0004R\u001c\u0010[\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010\u0006\u001a\u0004\bZ\u0010\u0004R\u001c\u0010^\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010\u0006\u001a\u0004\b]\u0010\u0004R(\u0010a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010.\u001a\u0004\b`\u00100R(\u0010d\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010.\u001a\u0004\bc\u00100R\u001c\u0010g\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\be\u0010\u0006\u001a\u0004\bf\u0010\u0004R\u001c\u0010m\u001a\u0004\u0018\u00010h8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l¨\u0006n"}, d2 = {"Lo9l/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getState", "state", "b", "getType", "type", "c", "getReceiver", "receiver", "d", "getSpeed", "speed", "e", "getStartDate", "startDate", "f", "getPeriod", "period", "g", "getCurrency", "currency", "h", "getSourceCurrency", "sourceCurrency", "", "i", "J", "getAmount", "()J", "amount", "j", "getTitle", "title", "k", "getDescription", "description", "", "", "Lo9l/y;", "l", "Ljava/util/Map;", "getReferenceFields", "()Ljava/util/Map;", "referenceFields", "Lo9l/z;", "m", "Lo9l/z;", "getUltimateDebtor", "()Lo9l/z;", "ultimateDebtor", "Libl/d;", "n", "Libl/d;", "getTransferReason", "()Libl/d;", "transferReason", "Lgsf/r;", "o", "Lgsf/r;", "getReasons", "()Lgsf/r;", "reasons", "", "p", "Ljava/lang/Integer;", "getMonthDay", "()Ljava/lang/Integer;", "monthDay", "q", "getWeekDay", "weekDay", "r", "getGifUrl", "gifUrl", "s", "getPocketId", "pocketId", "t", "getSenderId", "senderId", "u", "getSenderType", "senderType", "v", "getChargeBearer", "chargeBearer", "w", "getSide", "side", "x", "getAdditionalInputs", "additionalInputs", "y", "getExtraAttributes", "extraAttributes", "z", "getPaymentSchemeEndToEndId", "paymentSchemeEndToEndId", "Lo9l/s;", "A", "Lo9l/s;", "getEndCriteria", "()Lo9l/s;", "endCriteria", "feature_shared_recurring_payments_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("endCriteria")
    private final s endCriteria;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("receiver")
    @NotNull
    private final String receiver;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("speed")
    private final String speed;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("startDate")
    private final String startDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("period")
    @NotNull
    private final String period;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("sourceCurrency")
    private final String sourceCurrency;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("referenceFields")
    private final Map<String, List<y>> referenceFields;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("ultimateDebtor")
    private final z ultimateDebtor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("reason")
    private final ibl.d transferReason;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("reasons")
    private final gsf.r reasons;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("monthDay")
    private final Integer monthDay;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("weekDay")
    private final Integer weekDay;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("gif")
    private final String gifUrl;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("sender")
    private final String senderId;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("senderType")
    private final String senderType;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("chargeBearer")
    private final String chargeBearer;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("side")
    private final String side;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("additionalInputs")
    private final Map<String, String> additionalInputs;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("extraAttributes")
    private final Map<String, String> extraAttributes;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("paymentSchemeEndToEndId")
    private final String paymentSchemeEndToEndId;

    public f(String state, String type, String receiver, String str, String str2, String period, String currency, String str3, long j2, String title, String description, Map map, z zVar, ibl.d dVar, gsf.r rVar, Integer num, Integer num2, String str4, String str5, String str6, String str7, String str8, String str9, Map map2, Map map3, String str10, s sVar) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.state = state;
        this.type = type;
        this.receiver = receiver;
        this.speed = str;
        this.startDate = str2;
        this.period = period;
        this.currency = currency;
        this.sourceCurrency = str3;
        this.amount = j2;
        this.title = title;
        this.description = description;
        this.referenceFields = map;
        this.ultimateDebtor = zVar;
        this.transferReason = dVar;
        this.reasons = rVar;
        this.monthDay = num;
        this.weekDay = num2;
        this.gifUrl = str4;
        this.pocketId = str5;
        this.senderId = str6;
        this.senderType = str7;
        this.chargeBearer = str8;
        this.side = str9;
        this.additionalInputs = map2;
        this.extraAttributes = map3;
        this.paymentSchemeEndToEndId = str10;
        this.endCriteria = sVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.state, fVar.state) && Intrinsics.f(this.type, fVar.type) && Intrinsics.f(this.receiver, fVar.receiver) && Intrinsics.f(this.speed, fVar.speed) && Intrinsics.f(this.startDate, fVar.startDate) && Intrinsics.f(this.period, fVar.period) && Intrinsics.f(this.currency, fVar.currency) && Intrinsics.f(this.sourceCurrency, fVar.sourceCurrency) && this.amount == fVar.amount && Intrinsics.f(this.title, fVar.title) && Intrinsics.f(this.description, fVar.description) && Intrinsics.f(this.referenceFields, fVar.referenceFields) && Intrinsics.f(this.ultimateDebtor, fVar.ultimateDebtor) && Intrinsics.f(this.transferReason, fVar.transferReason) && Intrinsics.f(this.reasons, fVar.reasons) && Intrinsics.f(this.monthDay, fVar.monthDay) && Intrinsics.f(this.weekDay, fVar.weekDay) && Intrinsics.f(this.gifUrl, fVar.gifUrl) && Intrinsics.f(this.pocketId, fVar.pocketId) && Intrinsics.f(this.senderId, fVar.senderId) && Intrinsics.f(this.senderType, fVar.senderType) && Intrinsics.f(this.chargeBearer, fVar.chargeBearer) && Intrinsics.f(this.side, fVar.side) && Intrinsics.f(this.additionalInputs, fVar.additionalInputs) && Intrinsics.f(this.extraAttributes, fVar.extraAttributes) && Intrinsics.f(this.paymentSchemeEndToEndId, fVar.paymentSchemeEndToEndId) && Intrinsics.f(this.endCriteria, fVar.endCriteria);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.state.hashCode() * 31, 31, this.type), 31, this.receiver);
        String str = this.speed;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.startDate;
        int iC2 = p.a.c(p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.period), 31, this.currency);
        String str3 = this.sourceCurrency;
        int iC3 = p.a.c(p.a.c(a0.d.c((iC2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.amount), 31, this.title), 31, this.description);
        Map<String, List<y>> map = this.referenceFields;
        int iHashCode2 = (iC3 + (map == null ? 0 : map.hashCode())) * 31;
        z zVar = this.ultimateDebtor;
        int iHashCode3 = (iHashCode2 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        ibl.d dVar = this.transferReason;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        gsf.r rVar = this.reasons;
        int iHashCode5 = (iHashCode4 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        Integer num = this.monthDay;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.weekDay;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.gifUrl;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pocketId;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.senderId;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.senderType;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.chargeBearer;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.side;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Map<String, String> map2 = this.additionalInputs;
        int iHashCode14 = (iHashCode13 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.extraAttributes;
        int iHashCode15 = (iHashCode14 + (map3 == null ? 0 : map3.hashCode())) * 31;
        String str10 = this.paymentSchemeEndToEndId;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        s sVar = this.endCriteria;
        return iHashCode16 + (sVar != null ? sVar.hashCode() : 0);
    }
}
