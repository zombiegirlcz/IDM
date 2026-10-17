package j11;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0011"}, d2 = {"Lj11/e;", "", "", "toString", "()Ljava/lang/String;", "Lj11/g;", "a", "Lj11/g;", "c", "()Lj11/g;", "type", "Ljo3/a;", "b", "Ljo3/a;", "()Ljo3/a;", "threshold", "remaining", "feature_crypto_challenge_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final g type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("threshold")
    @NotNull
    private final jo3.a threshold;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("remaining")
    @NotNull
    private final jo3.a remaining;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getRemaining() {
        return this.remaining;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getThreshold() {
        return this.threshold;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g getType() {
        return this.type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.type == eVar.type && Intrinsics.f(this.threshold, eVar.threshold) && Intrinsics.f(this.remaining, eVar.remaining);
    }

    public final int hashCode() {
        return this.remaining.hashCode() + v7.j(this.threshold, this.type.hashCode() * 31, 31);
    }
}
