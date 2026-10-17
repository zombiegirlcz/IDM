package gcm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public final class x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f142964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f142965b;

    public x5(String str, Map map) {
        this.f142964a = (String) Preconditions.checkNotNull(str, "policyName");
        this.f142965b = (Map) Preconditions.checkNotNull(map, "rawConfigValue");
    }

    public final String a() {
        return this.f142964a;
    }

    public final Map b() {
        return this.f142965b;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof x5) {
            x5 x5Var = (x5) obj2;
            if (this.f142964a.equals(x5Var.f142964a) && this.f142965b.equals(x5Var.f142965b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f142964a, this.f142965b);
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("policyName", this.f142964a).add("rawConfigValue", this.f142965b).toString();
    }
}
