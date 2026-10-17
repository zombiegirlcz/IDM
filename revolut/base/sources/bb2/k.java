package bb2;

import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f14147a;

    public k(Alias alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f14147a = alias;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f14147a, ((k) obj2).f14147a);
    }

    public final int hashCode() {
        return this.f14147a.hashCode();
    }
}
