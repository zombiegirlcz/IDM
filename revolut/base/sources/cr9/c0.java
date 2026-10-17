package cr9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class c0 {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u0012\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\f\u0010\u0018¨\u0006 "}, d2 = {"Lcr9/c0$a;", "Lcr9/c0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "id", "b", "j", "type", "c", "i", "transactionId", "d", "h", "payerId", "e", "g", "payeeId", "createdBy", "", "J", "()J", "amount", "currencyCode", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "exchanged", "createdDate", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("transactionId")
        private final String transactionId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("payerId")
        @NotNull
        private final String payerId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("payeeId")
        @NotNull
        private final String payeeId;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("createdBy")
        private final String createdBy;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        private final long amount;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currencyCode;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("exchanged")
        private final jo3.a exchanged;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("createdDate")
        private final long createdDate;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCreatedBy() {
            return this.createdBy;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getCreatedDate() {
            return this.createdDate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final jo3.a getExchanged() {
            return this.exchanged;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.transactionId, aVar.transactionId) && Intrinsics.f(this.payerId, aVar.payerId) && Intrinsics.f(this.payeeId, aVar.payeeId) && Intrinsics.f(this.createdBy, aVar.createdBy) && this.amount == aVar.amount && Intrinsics.f(this.currencyCode, aVar.currencyCode) && Intrinsics.f(this.exchanged, aVar.exchanged) && this.createdDate == aVar.createdDate;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getPayeeId() {
            return this.payeeId;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getPayerId() {
            return this.payerId;
        }

        public final int hashCode() {
            int iC = p.a.c(this.id.hashCode() * 31, 31, this.type);
            String str = this.transactionId;
            int iC2 = p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.payerId), 31, this.payeeId);
            String str2 = this.createdBy;
            int iC3 = p.a.c(a0.d.c((iC2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.amount), 31, this.currencyCode);
            jo3.a aVar = this.exchanged;
            return Long.hashCode(this.createdDate) + ((iC3 + (aVar != null ? aVar.hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getTransactionId() {
            return this.transactionId;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u0011\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\f\u0010\u0018¨\u0006 "}, d2 = {"Lcr9/c0$b;", "Lcr9/c0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "id", "b", "j", "type", "c", "i", "transactionId", "d", "createdBy", "e", "h", "payerId", "g", "payeeId", "", "J", "()J", "amount", "currencyCode", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "exchanged", "createdDate", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("transactionId")
        private final String transactionId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("createdBy")
        private final String createdBy;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("payerId")
        @NotNull
        private final String payerId;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("payeeId")
        @NotNull
        private final String payeeId;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        private final long amount;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currencyCode;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("exchanged")
        private final jo3.a exchanged;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("createdDate")
        private final long createdDate;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCreatedBy() {
            return this.createdBy;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getCreatedDate() {
            return this.createdDate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final jo3.a getExchanged() {
            return this.exchanged;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.transactionId, bVar.transactionId) && Intrinsics.f(this.createdBy, bVar.createdBy) && Intrinsics.f(this.payerId, bVar.payerId) && Intrinsics.f(this.payeeId, bVar.payeeId) && this.amount == bVar.amount && Intrinsics.f(this.currencyCode, bVar.currencyCode) && Intrinsics.f(this.exchanged, bVar.exchanged) && this.createdDate == bVar.createdDate;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getPayeeId() {
            return this.payeeId;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getPayerId() {
            return this.payerId;
        }

        public final int hashCode() {
            int iC = p.a.c(this.id.hashCode() * 31, 31, this.type);
            String str = this.transactionId;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.createdBy;
            int iC2 = p.a.c(a0.d.c(p.a.c(p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.payerId), 31, this.payeeId), 31, this.amount), 31, this.currencyCode);
            jo3.a aVar = this.exchanged;
            return Long.hashCode(this.createdDate) + ((iC2 + (aVar != null ? aVar.hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getTransactionId() {
            return this.transactionId;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u0005\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u0011\u0010\u001fR\u001a\u0010!\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\f\u0010\u001a¨\u0006\""}, d2 = {"Lcr9/c0$c;", "Lcr9/c0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "id", "b", "k", "type", "c", "j", "transactionId", "d", "createdBy", "e", "i", "paymentLinkId", "h", "payerId", "g", "payeeId", "", "J", "()J", "amount", "currencyCode", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "exchanged", "createdDate", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("transactionId")
        private final String transactionId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("createdBy")
        private final String createdBy;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("transferLinkId")
        private final String paymentLinkId;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("payerId")
        @NotNull
        private final String payerId;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("payeeId")
        @NotNull
        private final String payeeId;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        private final long amount;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currencyCode;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("exchanged")
        private final jo3.a exchanged;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @lg.b("createdDate")
        private final long createdDate;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCreatedBy() {
            return this.createdBy;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getCreatedDate() {
            return this.createdDate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final jo3.a getExchanged() {
            return this.exchanged;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.type, cVar.type) && Intrinsics.f(this.transactionId, cVar.transactionId) && Intrinsics.f(this.createdBy, cVar.createdBy) && Intrinsics.f(this.paymentLinkId, cVar.paymentLinkId) && Intrinsics.f(this.payerId, cVar.payerId) && Intrinsics.f(this.payeeId, cVar.payeeId) && this.amount == cVar.amount && Intrinsics.f(this.currencyCode, cVar.currencyCode) && Intrinsics.f(this.exchanged, cVar.exchanged) && this.createdDate == cVar.createdDate;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getPayeeId() {
            return this.payeeId;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getPayerId() {
            return this.payerId;
        }

        public final int hashCode() {
            int iC = p.a.c(this.id.hashCode() * 31, 31, this.type);
            String str = this.transactionId;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.createdBy;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.paymentLinkId;
            int iC2 = p.a.c(a0.d.c(p.a.c(p.a.c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.payerId), 31, this.payeeId), 31, this.amount), 31, this.currencyCode);
            jo3.a aVar = this.exchanged;
            return Long.hashCode(this.createdDate) + ((iC2 + (aVar != null ? aVar.hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getPaymentLinkId() {
            return this.paymentLinkId;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getTransactionId() {
            return this.transactionId;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getType() {
            return this.type;
        }
    }

    private c0() {
    }
}
