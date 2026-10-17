package ga1;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0004R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010\u0004R\u001a\u0010&\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b%\u0010\u0004R\u001a\u0010)\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0011\u001a\u0004\b(\u0010\u0004R \u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010\u001c¨\u0006-"}, d2 = {"Lga1/b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "getAmount", "()J", "amount", "b", "Ljava/lang/Long;", "getTipAmount", "()Ljava/lang/Long;", "tipAmount", "c", "Ljava/lang/String;", "getCurrency", "currency", "d", "getDescription", "description", "", "Lzc1/d;", "e", "Ljava/util/List;", "getLineItems", "()Ljava/util/List;", "lineItems", "f", "getCaptureMode", "captureMode", "g", "getCaptureAfter", "captureAfter", "h", "getExpirationDate", "expirationDate", "i", "getChannel", "channel", "j", "getAllowedPaymentMethods", "allowedPaymentMethods", "feature_acquiring_card_reader_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("tip_amount")
    private final Long tipAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("line_items")
    private final List<zc1.d> lineItems;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("capture_mode")
    @NotNull
    private final String captureMode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("capture_after")
    private final String captureAfter;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("expiration_date")
    @NotNull
    private final String expirationDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("channel")
    @NotNull
    private final String channel;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("allowed_payment_methods")
    @NotNull
    private final List<String> allowedPaymentMethods;

    public b(long j2, Long l2, String currency, String str, ArrayList arrayList, String captureMode, String str2, String expirationDate, List allowedPaymentMethods) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(captureMode, "captureMode");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter("card_reader", "channel");
        Intrinsics.checkNotNullParameter(allowedPaymentMethods, "allowedPaymentMethods");
        this.amount = j2;
        this.tipAmount = l2;
        this.currency = currency;
        this.description = str;
        this.lineItems = arrayList;
        this.captureMode = captureMode;
        this.captureAfter = str2;
        this.expirationDate = expirationDate;
        this.channel = "card_reader";
        this.allowedPaymentMethods = allowedPaymentMethods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.amount == bVar.amount && Intrinsics.f(this.tipAmount, bVar.tipAmount) && Intrinsics.f(this.currency, bVar.currency) && Intrinsics.f(this.description, bVar.description) && Intrinsics.f(this.lineItems, bVar.lineItems) && Intrinsics.f(this.captureMode, bVar.captureMode) && Intrinsics.f(this.captureAfter, bVar.captureAfter) && Intrinsics.f(this.expirationDate, bVar.expirationDate) && Intrinsics.f(this.channel, bVar.channel) && Intrinsics.f(this.allowedPaymentMethods, bVar.allowedPaymentMethods);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.amount) * 31;
        Long l2 = this.tipAmount;
        int iC = p.a.c((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.currency);
        String str = this.description;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        List<zc1.d> list = this.lineItems;
        int iC2 = p.a.c((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.captureMode);
        String str2 = this.captureAfter;
        return this.allowedPaymentMethods.hashCode() + p.a.c(p.a.c((iC2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.expirationDate), 31, this.channel);
    }
}
