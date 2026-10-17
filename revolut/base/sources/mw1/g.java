package mw1;

import aii.r;
import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f209306a;

    public g(Alias alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f209306a = alias;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f209306a, ((g) obj2).f209306a);
    }

    public final int hashCode() {
        return this.f209306a.hashCode();
    }
}
