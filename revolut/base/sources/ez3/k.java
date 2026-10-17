package ez3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dx4.l f130902b;

    public k(String linkId, dx4.l action) {
        Intrinsics.checkNotNullParameter(linkId, "linkId");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f130901a = linkId;
        this.f130902b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f130901a, kVar.f130901a) && Intrinsics.f(this.f130902b, kVar.f130902b);
    }

    public final int hashCode() {
        return this.f130902b.hashCode() + (this.f130901a.hashCode() * 31);
    }
}
