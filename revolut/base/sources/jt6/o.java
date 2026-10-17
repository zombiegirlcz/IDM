package jt6;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u0000 \u00122\u00020\u0001:\u0002\t\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u0013"}, d2 = {"Ljt6/o;", "", "", "toString", "()Ljava/lang/String;", "", "Ljt6/e;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "orders", "Ljt6/o$b;", "Ljt6/o$b;", "c", "()Ljt6/o$b;", "scannedInterval", "nextInterval", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("items")
    @NotNull
    private final List<e> orders;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("scannedInterval")
    @NotNull
    private final b scannedInterval;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextInterval")
    private final b nextInterval;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0086\b\u0018\u0000 \f2\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Ljt6/o$b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "()J", "from", "b", "to", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("from")
        private final long from;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("to")
        private final long to;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getFrom() {
            return this.from;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getTo() {
            return this.to;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return this.from == bVar.from && this.to == bVar.to;
        }

        public final int hashCode() {
            return Long.hashCode(this.to) + (Long.hashCode(this.from) * 31);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getNextInterval() {
        return this.nextInterval;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getOrders() {
        return this.orders;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getScannedInterval() {
        return this.scannedInterval;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.orders, oVar.orders) && Intrinsics.f(this.scannedInterval, oVar.scannedInterval) && Intrinsics.f(this.nextInterval, oVar.nextInterval);
    }

    public final int hashCode() {
        int iHashCode = (this.scannedInterval.hashCode() + (this.orders.hashCode() * 31)) * 31;
        b bVar = this.nextInterval;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
