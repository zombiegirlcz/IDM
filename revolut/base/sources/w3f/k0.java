package w3f;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0010"}, d2 = {"Lw3f/k0;", "", "", "toString", "()Ljava/lang/String;", "Lw3f/k0$a;", "a", "Lw3f/k0$a;", "b", "()Lw3f/k0$a;", "pageInfo", "", "Lw3f/h0;", "Ljava/util/List;", "()Ljava/util/List;", "items", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("pageInfo")
    @NotNull
    private final a pageInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("items")
    @NotNull
    private final List<h0> items;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015¨\u0006\u0019"}, d2 = {"Lw3f/k0$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "getLimit", "()I", "limit", "", "b", "Z", "()Z", "last", "c", "count", "", "d", "Ljava/lang/Long;", "()Ljava/lang/Long;", "startFrom", "e", "startAfter", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("limit")
        private final int limit;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("last")
        private final boolean last;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("count")
        private final int count;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("startFrom")
        private final Long startFrom;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("startAfter")
        private final Long startAfter;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getLast() {
            return this.last;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Long getStartAfter() {
            return this.startAfter;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Long getStartFrom() {
            return this.startFrom;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.limit == aVar.limit && this.last == aVar.last && this.count == aVar.count && Intrinsics.f(this.startFrom, aVar.startFrom) && Intrinsics.f(this.startAfter, aVar.startAfter);
        }

        public final int hashCode() {
            int iB = j6.a.b(this.count, j6.a.c(Integer.hashCode(this.limit) * 31, 31, this.last), 31);
            Long l2 = this.startFrom;
            int iHashCode = (iB + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.startAfter;
            return iHashCode + (l3 != null ? l3.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getPageInfo() {
        return this.pageInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.pageInfo, k0Var.pageInfo) && Intrinsics.f(this.items, k0Var.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (this.pageInfo.hashCode() * 31);
    }
}
