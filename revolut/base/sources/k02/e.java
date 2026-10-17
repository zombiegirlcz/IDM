package k02;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0010\u0010\u001eR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b \u0010\u0018R\u001a\u0010)\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010+\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010.\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b*\u0010\u0018R\u001c\u00100\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0016\u001a\u0004\b\u0005\u0010\u0018R\u001c\u00106\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b,\u0010\u0004R\u001c\u00109\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b8\u0010\u0004R\u001c\u0010>\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010@\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001c\u0010A\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b/\u0010\u0004R\u001c\u0010E\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010C\u001a\u0004\b2\u0010DR\u001c\u0010I\u001a\u0004\u0018\u00010F8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\b\t\u0010HR\u001c\u0010J\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\b?\u0010\u0004¨\u0006K"}, d2 = {"Lk02/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "m", "id", "b", "v", "state", "c", "p", "paymentMethod", "Lk02/b;", "d", "Lk02/b;", "e", "()Lk02/b;", "creditor", "", "Ljava/lang/Long;", "i", "()Ljava/lang/Long;", "estimatedNextPaymentDate", "f", "billingCurrency", "g", "J", "()J", "createdDate", "h", "u", "startDate", "estimatedNextPaymentAmount", "Lk02/c;", "j", "Lk02/c;", "q", "()Lk02/c;", "paymentMethodDetails", "k", "deactivationDate", "l", "deactivationReasonCode", "expirationDate", "n", "acceptanceExpirationDate", "Lk02/d;", "o", "Lk02/d;", "t", "()Lk02/d;", "settings", "frequency", "r", "period", "Ljo3/a;", "Ljo3/a;", "w", "()Ljo3/a;", "transactionLimit", "s", "executionType", "initiationChannel", "Lk02/a;", "Lk02/a;", "()Lk02/a;", "paymentAmounts", "Lk02/e$a;", "Lk02/e$a;", "()Lk02/e$a;", "authorisation", "pocketId", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethod")
    @NotNull
    private final String paymentMethod;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("creditor")
    private final b creditor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("estimatedNextPaymentDate")
    private final Long estimatedNextPaymentDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("billingCurrency")
    @NotNull
    private final String billingCurrency;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("startDate")
    private final Long startDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("estimatedNextPaymentAmount")
    private final Long estimatedNextPaymentAmount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethodDetails")
    @NotNull
    private final c paymentMethodDetails;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("deactivationDate")
    private final Long deactivationDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("deactivationReasonCode")
    private final String deactivationReasonCode;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("expirationDate")
    private final Long expirationDate;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("acceptanceExpirationDate")
    private final Long acceptanceExpirationDate;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("settings")
    private final d settings;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("frequency")
    private final String frequency;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("period")
    private final String period;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionLimit")
    private final jo3.a transactionLimit;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("executionType")
    private final String executionType;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("initiationChannel")
    private final String initiationChannel;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("paymentAmounts")
    private final k02.a paymentAmounts;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("authorisation")
    private final a authorisation;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lk02/e$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "state", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("state")
        @NotNull
        private final String state;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getState() {
            return this.state;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.state, ((a) obj2).state);
        }

        public final int hashCode() {
            return this.state.hashCode();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getAcceptanceExpirationDate() {
        return this.acceptanceExpirationDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getAuthorisation() {
        return this.authorisation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBillingCurrency() {
        return this.billingCurrency;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getCreditor() {
        return this.creditor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.id, eVar.id) && Intrinsics.f(this.state, eVar.state) && Intrinsics.f(this.paymentMethod, eVar.paymentMethod) && Intrinsics.f(this.creditor, eVar.creditor) && Intrinsics.f(this.estimatedNextPaymentDate, eVar.estimatedNextPaymentDate) && Intrinsics.f(this.billingCurrency, eVar.billingCurrency) && this.createdDate == eVar.createdDate && Intrinsics.f(this.startDate, eVar.startDate) && Intrinsics.f(this.estimatedNextPaymentAmount, eVar.estimatedNextPaymentAmount) && Intrinsics.f(this.paymentMethodDetails, eVar.paymentMethodDetails) && Intrinsics.f(this.deactivationDate, eVar.deactivationDate) && Intrinsics.f(this.deactivationReasonCode, eVar.deactivationReasonCode) && Intrinsics.f(this.expirationDate, eVar.expirationDate) && Intrinsics.f(this.acceptanceExpirationDate, eVar.acceptanceExpirationDate) && Intrinsics.f(this.settings, eVar.settings) && Intrinsics.f(this.frequency, eVar.frequency) && Intrinsics.f(this.period, eVar.period) && Intrinsics.f(this.transactionLimit, eVar.transactionLimit) && Intrinsics.f(this.executionType, eVar.executionType) && Intrinsics.f(this.initiationChannel, eVar.initiationChannel) && Intrinsics.f(this.paymentAmounts, eVar.paymentAmounts) && Intrinsics.f(this.authorisation, eVar.authorisation) && Intrinsics.f(this.pocketId, eVar.pocketId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getDeactivationDate() {
        return this.deactivationDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDeactivationReasonCode() {
        return this.deactivationReasonCode;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getEstimatedNextPaymentAmount() {
        return this.estimatedNextPaymentAmount;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.state), 31, this.paymentMethod);
        b bVar = this.creditor;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Long l2 = this.estimatedNextPaymentDate;
        int iC2 = a0.d.c(p.a.c((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.billingCurrency), 31, this.createdDate);
        Long l3 = this.startDate;
        int iHashCode2 = (iC2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.estimatedNextPaymentAmount;
        int iHashCode3 = (this.paymentMethodDetails.hashCode() + ((iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31)) * 31;
        Long l5 = this.deactivationDate;
        int iHashCode4 = (iHashCode3 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str = this.deactivationReasonCode;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Long l22 = this.expirationDate;
        int iHashCode6 = (iHashCode5 + (l22 == null ? 0 : l22.hashCode())) * 31;
        Long l31 = this.acceptanceExpirationDate;
        int iHashCode7 = (iHashCode6 + (l31 == null ? 0 : l31.hashCode())) * 31;
        d dVar = this.settings;
        int iHashCode8 = (iHashCode7 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str2 = this.frequency;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.period;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        jo3.a aVar = this.transactionLimit;
        int iHashCode11 = (iHashCode10 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str4 = this.executionType;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.initiationChannel;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        k02.a aVar2 = this.paymentAmounts;
        int iHashCode14 = (iHashCode13 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        a aVar3 = this.authorisation;
        int iHashCode15 = (iHashCode14 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        String str6 = this.pocketId;
        return iHashCode15 + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getEstimatedNextPaymentDate() {
        return this.estimatedNextPaymentDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getExecutionType() {
        return this.executionType;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Long getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getFrequency() {
        return this.frequency;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getInitiationChannel() {
        return this.initiationChannel;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final k02.a getPaymentAmounts() {
        return this.paymentAmounts;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final c getPaymentMethodDetails() {
        return this.paymentMethodDetails;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getPocketId() {
        return this.pocketId;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final d getSettings() {
        return this.settings;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Long getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final jo3.a getTransactionLimit() {
        return this.transactionLimit;
    }
}
