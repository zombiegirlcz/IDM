package cvf;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcvf/l;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "c", "()I", "attempts", "b", "Ljava/lang/String;", "attemptedAt", "activationCutoffTime", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("attempts")
    private final int attempts;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("attemptedAt")
    @NotNull
    private final String attemptedAt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("activationCutoffTime")
    @NotNull
    private final String activationCutoffTime;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivationCutoffTime() {
        return this.activationCutoffTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAttemptedAt() {
        return this.attemptedAt;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getAttempts() {
        return this.attempts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.attempts == lVar.attempts && Intrinsics.f(this.attemptedAt, lVar.attemptedAt) && Intrinsics.f(this.activationCutoffTime, lVar.activationCutoffTime);
    }

    public final int hashCode() {
        return this.activationCutoffTime.hashCode() + p.a.c(Integer.hashCode(this.attempts) * 31, 31, this.attemptedAt);
    }
}
