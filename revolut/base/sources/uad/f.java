package uad;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0012"}, d2 = {"Luad/f;", "", "", "toString", "()Ljava/lang/String;", "", "Luad/d;", "a", "Ljava/util/List;", "()Ljava/util/List;", "items", "Luad/c;", "b", "Luad/c;", "c", "()Luad/c;", "scannedInterval", "nextInterval", "feature_shared_order_initiation_page_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("items")
    @NotNull
    private final List<d> items;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("scannedInterval")
    @NotNull
    private final c scannedInterval;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextInterval")
    private final c nextInterval;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getNextInterval() {
        return this.nextInterval;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getScannedInterval() {
        return this.scannedInterval;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.items, fVar.items) && Intrinsics.f(this.scannedInterval, fVar.scannedInterval) && Intrinsics.f(this.nextInterval, fVar.nextInterval);
    }

    public final int hashCode() {
        int iHashCode = (this.scannedInterval.hashCode() + (this.items.hashCode() * 31)) * 31;
        c cVar = this.nextInterval;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
