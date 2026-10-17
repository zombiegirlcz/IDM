package cr9;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class f0 {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006 "}, d2 = {"Lcr9/f0$a;", "Lcr9/f0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getTitle", "title", "", "b", "J", "getAmount", "()J", "amount", "c", "getCurrencyCode", "currencyCode", "d", "getOwnerId", "ownerId", "", "Lcr9/p;", "e", "Ljava/util/List;", "getSplits", "()Ljava/util/List;", "splits", "Lcr9/m;", "f", "getLineItems", "lineItems", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        private final long amount;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currencyCode;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("ownerId")
        @NotNull
        private final String ownerId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("splits")
        @NotNull
        private final List<p> splits;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("lineItems")
        private final List<m> lineItems;

        public a(String title, long j2, String currencyCode, String ownerId, ArrayList splits, ArrayList arrayList) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(ownerId, "ownerId");
            Intrinsics.checkNotNullParameter(splits, "splits");
            this.title = title;
            this.amount = j2;
            this.currencyCode = currencyCode;
            this.ownerId = ownerId;
            this.splits = splits;
            this.lineItems = arrayList;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.title, aVar.title) && this.amount == aVar.amount && Intrinsics.f(this.currencyCode, aVar.currencyCode) && Intrinsics.f(this.ownerId, aVar.ownerId) && Intrinsics.f(this.splits, aVar.splits) && Intrinsics.f(this.lineItems, aVar.lineItems);
        }

        public final int hashCode() {
            int iD = p.a.d(p.a.c(p.a.c(a0.d.c(this.title.hashCode() * 31, 31, this.amount), 31, this.currencyCode), 31, this.ownerId), 31, this.splits);
            List<m> list = this.lineItems;
            return iD + (list == null ? 0 : list.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"Lcr9/f0$b;", "Lcr9/f0;", "", "toString", "()Ljava/lang/String;", "", "Lcr9/p;", "a", "Ljava/util/List;", "getSplits", "()Ljava/util/List;", "splits", "Lcr9/m;", "b", "getLineItems", "lineItems", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("splits")
        @NotNull
        private final List<p> splits;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("lineItems")
        private final List<m> lineItems;

        public b(ArrayList splits, ArrayList arrayList) {
            Intrinsics.checkNotNullParameter(splits, "splits");
            this.splits = splits;
            this.lineItems = arrayList;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.splits, bVar.splits) && Intrinsics.f(this.lineItems, bVar.lineItems);
        }

        public final int hashCode() {
            int iHashCode = this.splits.hashCode() * 31;
            List<m> list = this.lineItems;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }
    }

    private f0() {
    }
}
