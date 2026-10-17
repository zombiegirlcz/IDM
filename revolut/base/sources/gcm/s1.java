package gcm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f142864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f142865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImmutableSet f142866c;

    public s1(int i, long j2, Set set) {
        this.f142864a = i;
        this.f142865b = j2;
        this.f142866c = ImmutableSet.copyOf((Collection) set);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || s1.class != obj2.getClass()) {
            return false;
        }
        s1 s1Var = (s1) obj2;
        return this.f142864a == s1Var.f142864a && this.f142865b == s1Var.f142865b && Objects.equal(this.f142866c, s1Var.f142866c);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f142864a), Long.valueOf(this.f142865b), this.f142866c);
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("maxAttempts", this.f142864a).add("hedgingDelayNanos", this.f142865b).add("nonFatalStatusCodes", this.f142866c).toString();
    }
}
