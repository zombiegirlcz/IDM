package z8l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\f\u001a\u0004\b\"\u0010\u0004R\u001a\u0010&\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\f\u001a\u0004\b%\u0010\u0004R\u001a\u0010,\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\f\u001a\u0004\b.\u0010\u0004¨\u00060"}, d2 = {"Lz8l/c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "getAmount", "()J", "amount", "b", "Ljava/lang/String;", "getCurrency", "currency", "c", "getPayerPhone", "payerPhone", "d", "getPayerEmail", "payerEmail", "e", "getPayerCode", "payerCode", "f", "getId", "id", "g", "getPayerName", "payerName", "h", "getComment", "comment", "i", "getGifUrl", "gifUrl", "j", "getMoneyRequestAppSource", "moneyRequestAppSource", "", "k", "Z", "getNotifyPayee", "()Z", "notifyPayee", "l", "getPdaRecipientId", "pdaRecipientId", "feature_shared_payments_money_request_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("payerPhone")
    private final String payerPhone;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("payerEmail")
    private final String payerEmail;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("payerCode")
    private final String payerCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("id")
    private final String id;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("payerName")
    private final String payerName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("comment")
    private final String comment;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("gif")
    private final String gifUrl;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("moneyRequestAppSource")
    @NotNull
    private final String moneyRequestAppSource;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("notify")
    private final boolean notifyPayee;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("pdaRecipientId")
    private final String pdaRecipientId;

    public c(long j2, String currency, String str, String str2, String str3, String str4, String str5, String str6, String moneyRequestAppSource) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(moneyRequestAppSource, "moneyRequestAppSource");
        this.amount = j2;
        this.currency = currency;
        this.payerPhone = str;
        this.payerEmail = str2;
        this.payerCode = str3;
        this.id = null;
        this.payerName = str4;
        this.comment = str5;
        this.gifUrl = str6;
        this.moneyRequestAppSource = moneyRequestAppSource;
        this.notifyPayee = true;
        this.pdaRecipientId = null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.amount == cVar.amount && Intrinsics.f(this.currency, cVar.currency) && Intrinsics.f(this.payerPhone, cVar.payerPhone) && Intrinsics.f(this.payerEmail, cVar.payerEmail) && Intrinsics.f(this.payerCode, cVar.payerCode) && Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.payerName, cVar.payerName) && Intrinsics.f(this.comment, cVar.comment) && Intrinsics.f(this.gifUrl, cVar.gifUrl) && Intrinsics.f(this.moneyRequestAppSource, cVar.moneyRequestAppSource) && this.notifyPayee == cVar.notifyPayee && Intrinsics.f(this.pdaRecipientId, cVar.pdaRecipientId);
    }

    public final int hashCode() {
        int iC = p.a.c(Long.hashCode(this.amount) * 31, 31, this.currency);
        String str = this.payerPhone;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.payerEmail;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.payerCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.id;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.payerName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.comment;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.gifUrl;
        int iC2 = j6.a.c(p.a.c((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.moneyRequestAppSource), 31, this.notifyPayee);
        String str8 = this.pdaRecipientId;
        return iC2 + (str8 != null ? str8.hashCode() : 0);
    }
}
