package if6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b \u0010\u0004R\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001a\u0010&\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b\u0005\u0010%R\u001a\u0010(\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010-\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\f\u0010,R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b'\u0010\u0004R\u001c\u0010/\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b\u0014\u0010,R\u001c\u00103\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b*\u00102¨\u00064"}, d2 = {"Lif6/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "p", "type", "b", "consentId", "", "c", "Ljava/lang/Long;", "o", "()Ljava/lang/Long;", "requestedExecutionDateTime", "d", "h", "frequency", "e", "g", "firstPaymentDateTime", "", "f", "Ljava/lang/Integer;", "k", "()Ljava/lang/Integer;", "numberOfPayees", "description", "n", "reference", "i", "instrument", "j", "merchant", "J", "()J", "amount", "l", "currency", "Lif6/f;", "m", "Lif6/f;", "()Lif6/f;", "creditor", "pocketId", "debtor", "Lif6/n;", "Lif6/n;", "()Lif6/n;", "provider", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("consentId")
    private final String consentId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("requestedExecutionDateTime")
    private final Long requestedExecutionDateTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("frequency")
    private final String frequency;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("firstPaymentDateTime")
    private final Long firstPaymentDateTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("numberOfPayees")
    private final Integer numberOfPayees;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("reference")
    private final String reference;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("instrument")
    private final String instrument;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("merchant")
    @NotNull
    private final String merchant;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("creditor")
    @NotNull
    private final f creditor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("debtor")
    private final f debtor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("apm")
    private final n provider;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getConsentId() {
        return this.consentId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final f getCreditor() {
        return this.creditor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final f getDebtor() {
        return this.debtor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.type, mVar.type) && Intrinsics.f(this.consentId, mVar.consentId) && Intrinsics.f(this.requestedExecutionDateTime, mVar.requestedExecutionDateTime) && Intrinsics.f(this.frequency, mVar.frequency) && Intrinsics.f(this.firstPaymentDateTime, mVar.firstPaymentDateTime) && Intrinsics.f(this.numberOfPayees, mVar.numberOfPayees) && Intrinsics.f(this.description, mVar.description) && Intrinsics.f(this.reference, mVar.reference) && Intrinsics.f(this.instrument, mVar.instrument) && Intrinsics.f(this.merchant, mVar.merchant) && this.amount == mVar.amount && Intrinsics.f(this.currency, mVar.currency) && Intrinsics.f(this.creditor, mVar.creditor) && Intrinsics.f(this.pocketId, mVar.pocketId) && Intrinsics.f(this.debtor, mVar.debtor) && Intrinsics.f(this.provider, mVar.provider);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getFirstPaymentDateTime() {
        return this.firstPaymentDateTime;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getFrequency() {
        return this.frequency;
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.consentId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.requestedExecutionDateTime;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.frequency;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l3 = this.firstPaymentDateTime;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.numberOfPayees;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.reference;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.instrument;
        int iHashCode9 = (this.creditor.hashCode() + p.a.c(a0.d.c(p.a.c((iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.merchant), 31, this.amount), 31, this.currency)) * 31;
        String str6 = this.pocketId;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        f fVar = this.debtor;
        int iHashCode11 = (iHashCode10 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        n nVar = this.provider;
        return iHashCode11 + (nVar != null ? nVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getInstrument() {
        return this.instrument;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getMerchant() {
        return this.merchant;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Integer getNumberOfPayees() {
        return this.numberOfPayees;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getPocketId() {
        return this.pocketId;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final n getProvider() {
        return this.provider;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getReference() {
        return this.reference;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Long getRequestedExecutionDateTime() {
        return this.requestedExecutionDateTime;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
