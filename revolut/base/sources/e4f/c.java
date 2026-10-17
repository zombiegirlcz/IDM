package e4f;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0011\u0010\t¨\u0006\u0013"}, d2 = {"Le4f/c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "historyAnchorMillis", "", "b", "Z", "d", "()Z", "historyLoaded", "e", "incrementalUpdatesCursorMillis", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("historyAnchorMillis")
    private final Long historyAnchorMillis;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("historyLoaded")
    private final boolean historyLoaded;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("incrementalUpdatesCursorMillis")
    private final Long incrementalUpdatesCursorMillis;

    public c() {
        this(0);
    }

    public static c a(c cVar, Long l2, boolean z, Long l3, int i) {
        if ((i & 1) != 0) {
            l2 = cVar.historyAnchorMillis;
        }
        if ((i & 2) != 0) {
            z = cVar.historyLoaded;
        }
        if ((i & 4) != 0) {
            l3 = cVar.incrementalUpdatesCursorMillis;
        }
        cVar.getClass();
        return new c(l2, l3, z);
    }

    public final boolean b() {
        return this.historyLoaded && this.incrementalUpdatesCursorMillis != null;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getHistoryAnchorMillis() {
        return this.historyAnchorMillis;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getHistoryLoaded() {
        return this.historyLoaded;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getIncrementalUpdatesCursorMillis() {
        return this.incrementalUpdatesCursorMillis;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.historyAnchorMillis, cVar.historyAnchorMillis) && this.historyLoaded == cVar.historyLoaded && Intrinsics.f(this.incrementalUpdatesCursorMillis, cVar.incrementalUpdatesCursorMillis);
    }

    public final boolean f() {
        return !(this.incrementalUpdatesCursorMillis != null);
    }

    public final int hashCode() {
        Long l2 = this.historyAnchorMillis;
        int iC = j6.a.c((l2 == null ? 0 : l2.hashCode()) * 31, 31, this.historyLoaded);
        Long l3 = this.incrementalUpdatesCursorMillis;
        return iC + (l3 != null ? l3.hashCode() : 0);
    }

    public /* synthetic */ c(int i) {
        this(null, null, false);
    }

    public c(Long l2, Long l3, boolean z) {
        this.historyAnchorMillis = l2;
        this.historyLoaded = z;
        this.incrementalUpdatesCursorMillis = l3;
    }
}
