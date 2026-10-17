package bb2;

import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f14149a;

    public o(Alias alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f14149a = alias;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f14149a, ((o) obj2).f14149a);
    }

    public final int hashCode() {
        return this.f14149a.hashCode();
    }
}
