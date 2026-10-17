package dj9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0004¨\u0006\u000e"}, d2 = {"Ldj9/x;", "Ldj9/y;", "", "toString", "()Ljava/lang/String;", "", "a", "I", "()I", "term", "b", "Ljava/lang/String;", "getBlockReason", "blockReason", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class x implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("term")
    private final int term;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("blockReason")
    @NotNull
    private final String blockReason;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getTerm() {
        return this.term;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return this.term == xVar.term && Intrinsics.f(this.blockReason, xVar.blockReason);
    }

    public final int hashCode() {
        return this.blockReason.hashCode() + (Integer.hashCode(this.term) * 31);
    }
}
