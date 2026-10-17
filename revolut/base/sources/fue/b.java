package fue;

import a0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u000b\u0007\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lfue/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "type", "Lfue/b$c;", "Lfue/b$c;", "c", "()Lfue/b$c;", "upperBoundLimit", "Lfue/b$b;", "Lfue/b$b;", "()Lfue/b$b;", "singleValueLimit", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("upperBoundLimit")
    private final c upperBoundLimit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("singleValueLimit")
    private final C0806b singleValueLimit;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lfue/b$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "()J", "total", "b", "used", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("total")
        private final long total;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("used")
        private final long used;

        public a(long j2, long j3) {
            this.total = j2;
            this.used = j3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getTotal() {
            return this.total;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getUsed() {
            return this.used;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.total == aVar.total && this.used == aVar.used;
        }

        public final int hashCode() {
            return Long.hashCode(this.used) + (Long.hashCode(this.total) * 31);
        }
    }

    /* JADX INFO: renamed from: fue.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\f¨\u0006\u000e"}, d2 = {"Lfue/b$b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "b", "()J", "total", "Ljava/lang/Long;", "()Ljava/lang/Long;", "limitInTopupCurrency", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0806b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("total")
        private final long total;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("limitInTopupCurrency")
        private final Long limitInTopupCurrency;

        public C0806b(Long l2, long j2) {
            this.total = j2;
            this.limitInTopupCurrency = l2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Long getLimitInTopupCurrency() {
            return this.limitInTopupCurrency;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getTotal() {
            return this.total;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0806b)) {
                return false;
            }
            C0806b c0806b = (C0806b) obj2;
            return this.total == c0806b.total && Intrinsics.f(this.limitInTopupCurrency, c0806b.limitInTopupCurrency);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.total) * 31;
            Long l2 = this.limitInTopupCurrency;
            return iHashCode + (l2 == null ? 0 : l2.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0006\u0010\u000f¨\u0006\u0011"}, d2 = {"Lfue/b$c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "b", "()J", "total", "c", "used", "Lfue/b$a;", "Lfue/b$a;", "()Lfue/b$a;", "limitInTopupCurrency", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("total")
        private final long total;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("used")
        private final long used;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("limitInTopupCurrency")
        private final a limitInTopupCurrency;

        public c(long j2, long j3, a aVar) {
            this.total = j2;
            this.used = j3;
            this.limitInTopupCurrency = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getLimitInTopupCurrency() {
            return this.limitInTopupCurrency;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getTotal() {
            return this.total;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getUsed() {
            return this.used;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return this.total == cVar.total && this.used == cVar.used && Intrinsics.f(this.limitInTopupCurrency, cVar.limitInTopupCurrency);
        }

        public final int hashCode() {
            int iC = d.c(Long.hashCode(this.total) * 31, 31, this.used);
            a aVar = this.limitInTopupCurrency;
            return iC + (aVar == null ? 0 : aVar.hashCode());
        }
    }

    public b(String type, c cVar, C0806b c0806b) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.upperBoundLimit = cVar;
        this.singleValueLimit = c0806b;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C0806b getSingleValueLimit() {
        return this.singleValueLimit;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getUpperBoundLimit() {
        return this.upperBoundLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.upperBoundLimit, bVar.upperBoundLimit) && Intrinsics.f(this.singleValueLimit, bVar.singleValueLimit);
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        c cVar = this.upperBoundLimit;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        C0806b c0806b = this.singleValueLimit;
        return iHashCode2 + (c0806b != null ? c0806b.hashCode() : 0);
    }
}
