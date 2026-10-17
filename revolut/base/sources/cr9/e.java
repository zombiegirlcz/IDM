package cr9;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class e {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\u0004R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\u0004¨\u0006&"}, d2 = {"Lcr9/e$a;", "Lcr9/e;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getOwnerId", "ownerId", "b", "getTitle", "title", "", "c", "J", "getAmount", "()J", "amount", "d", "getCurrencyCode", "currencyCode", "", "Lcr9/p;", "e", "Ljava/util/List;", "getSplits", "()Ljava/util/List;", "splits", "Lcr9/m;", "f", "getLineItems", "lineItems", "g", "getReceiptFileName", "receiptFileName", "h", "getScanTaskId", "scanTaskId", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("ownerId")
        @NotNull
        private final String ownerId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        private final long amount;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currencyCode;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("splits")
        @NotNull
        private final List<p> splits;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("lineItems")
        private final List<m> lineItems;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("receiptFileName")
        private final String receiptFileName;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("scanTaskId")
        private final String scanTaskId;

        public a(String ownerId, String title, long j2, String currencyCode, ArrayList splits, ArrayList arrayList, String str, String str2) {
            Intrinsics.checkNotNullParameter(ownerId, "ownerId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(splits, "splits");
            this.ownerId = ownerId;
            this.title = title;
            this.amount = j2;
            this.currencyCode = currencyCode;
            this.splits = splits;
            this.lineItems = arrayList;
            this.receiptFileName = str;
            this.scanTaskId = str2;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.ownerId, aVar.ownerId) && Intrinsics.f(this.title, aVar.title) && this.amount == aVar.amount && Intrinsics.f(this.currencyCode, aVar.currencyCode) && Intrinsics.f(this.splits, aVar.splits) && Intrinsics.f(this.lineItems, aVar.lineItems) && Intrinsics.f(this.receiptFileName, aVar.receiptFileName) && Intrinsics.f(this.scanTaskId, aVar.scanTaskId);
        }

        public final int hashCode() {
            int iD = p.a.d(p.a.c(a0.d.c(p.a.c(this.ownerId.hashCode() * 31, 31, this.title), 31, this.amount), 31, this.currencyCode), 31, this.splits);
            List<m> list = this.lineItems;
            int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.receiptFileName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.scanTaskId;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\u0004¨\u0006\u001d"}, d2 = {"Lcr9/e$b;", "Lcr9/e;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getOwnerId", "ownerId", "b", "getTransactionId", "transactionId", "", "Lcr9/p;", "c", "Ljava/util/List;", "getSplits", "()Ljava/util/List;", "splits", "Lcr9/m;", "d", "getLineItems", "lineItems", "e", "getReceiptFileName", "receiptFileName", "f", "getScanTaskId", "scanTaskId", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("ownerId")
        @NotNull
        private final String ownerId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("transactionId")
        @NotNull
        private final String transactionId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("splits")
        @NotNull
        private final List<p> splits;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("lineItems")
        private final List<m> lineItems;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("receiptFileName")
        private final String receiptFileName;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("scanTaskId")
        private final String scanTaskId;

        public b(String ownerId, String transactionId, String str, String str2, ArrayList splits, ArrayList arrayList) {
            Intrinsics.checkNotNullParameter(ownerId, "ownerId");
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            Intrinsics.checkNotNullParameter(splits, "splits");
            this.ownerId = ownerId;
            this.transactionId = transactionId;
            this.splits = splits;
            this.lineItems = arrayList;
            this.receiptFileName = str;
            this.scanTaskId = str2;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.ownerId, bVar.ownerId) && Intrinsics.f(this.transactionId, bVar.transactionId) && Intrinsics.f(this.splits, bVar.splits) && Intrinsics.f(this.lineItems, bVar.lineItems) && Intrinsics.f(this.receiptFileName, bVar.receiptFileName) && Intrinsics.f(this.scanTaskId, bVar.scanTaskId);
        }

        public final int hashCode() {
            int iD = p.a.d(p.a.c(this.ownerId.hashCode() * 31, 31, this.transactionId), 31, this.splits);
            List<m> list = this.lineItems;
            int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.receiptFileName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.scanTaskId;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }
    }

    private e() {
    }
}
