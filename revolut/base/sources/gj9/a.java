package gj9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\f\u0010\u0013¨\u0006\u0015"}, d2 = {"Lgj9/a;", "", "", "toString", "()Ljava/lang/String;", "Lgj9/b;", "a", "Lgj9/b;", "d", "()Lgj9/b;", "type", "", "b", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "lastShownAt", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "dismissalCount", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    private final b type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastShownAt")
    private final Long lastShownAt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("dismissalCount")
    private final Integer dismissalCount;

    public a(b bVar, Long l2, Integer num) {
        this.type = bVar;
        this.lastShownAt = l2;
        this.dismissalCount = num;
    }

    public static a a(a aVar) {
        return new a(null, aVar.lastShownAt, aVar.dismissalCount);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getDismissalCount() {
        return this.dismissalCount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getLastShownAt() {
        return this.lastShownAt;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getType() {
        return this.type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.lastShownAt, aVar.lastShownAt) && Intrinsics.f(this.dismissalCount, aVar.dismissalCount);
    }

    public final int hashCode() {
        b bVar = this.type;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        Long l2 = this.lastShownAt;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.dismissalCount;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
