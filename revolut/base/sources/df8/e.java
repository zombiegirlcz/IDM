package df8;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Ldf8/e;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "a", "Ljo3/b;", "b", "()Ljo3/b;", "used", "limit", "feature_junior_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("used")
    @NotNull
    private final jo3.b used;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("limit")
    @NotNull
    private final jo3.b limit;

    public e(jo3.b used, jo3.b limit) {
        Intrinsics.checkNotNullParameter(used, "used");
        Intrinsics.checkNotNullParameter(limit, "limit");
        this.used = used;
        this.limit = limit;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getUsed() {
        return this.used;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.used, eVar.used) && Intrinsics.f(this.limit, eVar.limit);
    }

    public final int hashCode() {
        return this.limit.hashCode() + (this.used.hashCode() * 31);
    }
}
