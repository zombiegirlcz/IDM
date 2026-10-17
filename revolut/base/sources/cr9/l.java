package cr9;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class l {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u0011\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\f\u0010\u0016R\u001a\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\u0004R \u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b \u0010&R\"\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b\u0018\u0010&R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004¨\u0006,"}, d2 = {"Lcr9/l$a;", "Lcr9/l;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "f", "id", "c", "h", "ownerId", "d", "createdBy", "e", "l", "title", "", "J", "()J", "amount", "g", "currencyCode", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "exchanged", "i", "createdDate", "j", "k", "state", "", "Lcr9/o;", "Ljava/util/List;", "()Ljava/util/List;", "splits", "Lcr9/m;", "lineItems", "m", "receiptImageUri", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("ownerId")
        @NotNull
        private final String ownerId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("createdBy")
        private final String createdBy;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("amount")
        private final long amount;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currencyCode;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("exchanged")
        private final jo3.a exchanged;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("createdDate")
        private final long createdDate;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("state")
        @NotNull
        private final String state;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @lg.b("splits")
        @NotNull
        private final List<o> splits;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @lg.b("lineItems")
        private final List<m> lineItems;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @lg.b("receiptImageUri")
        private final String receiptImageUri;

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
            return Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.ownerId, aVar.ownerId) && Intrinsics.f(this.createdBy, aVar.createdBy) && Intrinsics.f(this.title, aVar.title) && this.amount == aVar.amount && Intrinsics.f(this.currencyCode, aVar.currencyCode) && Intrinsics.f(this.exchanged, aVar.exchanged) && this.createdDate == aVar.createdDate && Intrinsics.f(this.state, aVar.state) && Intrinsics.f(this.splits, aVar.splits) && Intrinsics.f(this.lineItems, aVar.lineItems) && Intrinsics.f(this.receiptImageUri, aVar.receiptImageUri);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final List getLineItems() {
            return this.lineItems;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getOwnerId() {
            return this.ownerId;
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.type.hashCode() * 31, 31, this.id), 31, this.ownerId);
            String str = this.createdBy;
            int iC2 = p.a.c(a0.d.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.title), 31, this.amount), 31, this.currencyCode);
            jo3.a aVar = this.exchanged;
            int iD = p.a.d(p.a.c(a0.d.c((iC2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.createdDate), 31, this.state), 31, this.splits);
            List<m> list = this.lineItems;
            int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.receiptImageUri;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getReceiptImageUri() {
            return this.receiptImageUri;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final List getSplits() {
            return this.splits;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0005\u0010\u001eR\u001a\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0011\u0010%R\u001a\u0010'\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\f\u0010\u001eR\u001a\u0010(\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b#\u0010\u0004R \u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010+\u001a\u0004\b \u0010,R\"\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010+\u001a\u0004\b\u0016\u0010,R\u001c\u00101\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004¨\u00062"}, d2 = {"Lcr9/l$b;", "Lcr9/l;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "b", "f", "id", "c", "h", "ownerId", "d", "createdBy", "e", "n", "transactionId", "m", "transactionCategory", "g", "o", "transactionLogo", "l", "title", "", "i", "J", "()J", "amount", "j", "currencyCode", "Ljo3/a;", "k", "Ljo3/a;", "()Ljo3/a;", "exchanged", "createdDate", "state", "", "Lcr9/o;", "Ljava/util/List;", "()Ljava/util/List;", "splits", "Lcr9/m;", "lineItems", "p", "receiptImageUri", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("ownerId")
        @NotNull
        private final String ownerId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("createdBy")
        private final String createdBy;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("transactionId")
        private final String transactionId;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("category")
        @NotNull
        private final String transactionCategory;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("logo")
        private final String transactionLogo;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("amount")
        private final long amount;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currencyCode;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @lg.b("exchanged")
        private final jo3.a exchanged;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @lg.b("createdDate")
        private final long createdDate;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @lg.b("state")
        @NotNull
        private final String state;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @lg.b("splits")
        @NotNull
        private final List<o> splits;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @lg.b("lineItems")
        private final List<m> lineItems;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @lg.b("receiptImageUri")
        private final String receiptImageUri;

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
            return Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.ownerId, bVar.ownerId) && Intrinsics.f(this.createdBy, bVar.createdBy) && Intrinsics.f(this.transactionId, bVar.transactionId) && Intrinsics.f(this.transactionCategory, bVar.transactionCategory) && Intrinsics.f(this.transactionLogo, bVar.transactionLogo) && Intrinsics.f(this.title, bVar.title) && this.amount == bVar.amount && Intrinsics.f(this.currencyCode, bVar.currencyCode) && Intrinsics.f(this.exchanged, bVar.exchanged) && this.createdDate == bVar.createdDate && Intrinsics.f(this.state, bVar.state) && Intrinsics.f(this.splits, bVar.splits) && Intrinsics.f(this.lineItems, bVar.lineItems) && Intrinsics.f(this.receiptImageUri, bVar.receiptImageUri);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final List getLineItems() {
            return this.lineItems;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getOwnerId() {
            return this.ownerId;
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.type.hashCode() * 31, 31, this.id), 31, this.ownerId);
            String str = this.createdBy;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.transactionId;
            int iC2 = p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.transactionCategory);
            String str3 = this.transactionLogo;
            int iC3 = p.a.c(a0.d.c(p.a.c((iC2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.title), 31, this.amount), 31, this.currencyCode);
            jo3.a aVar = this.exchanged;
            int iD = p.a.d(p.a.c(a0.d.c((iC3 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.createdDate), 31, this.state), 31, this.splits);
            List<m> list = this.lineItems;
            int iHashCode2 = (iD + (list == null ? 0 : list.hashCode())) * 31;
            String str4 = this.receiptImageUri;
            return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getReceiptImageUri() {
            return this.receiptImageUri;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final List getSplits() {
            return this.splits;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getTransactionCategory() {
            return this.transactionCategory;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getTransactionId() {
            return this.transactionId;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final String getTransactionLogo() {
            return this.transactionLogo;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcr9/l$c;", "Lcr9/l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends l {
        private c() {
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof c);
        }

        public final int hashCode() {
            return -10571174;
        }
    }

    private l() {
    }
}
