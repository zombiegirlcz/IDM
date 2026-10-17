package mw1;

import com.revolut.feature.apm.core.models.alias.Alias;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f209304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f209305b;

    public f(Alias currentAlias, List availableAliases) {
        Intrinsics.checkNotNullParameter(currentAlias, "currentAlias");
        Intrinsics.checkNotNullParameter(availableAliases, "availableAliases");
        this.f209304a = currentAlias;
        this.f209305b = availableAliases;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f209304a, fVar.f209304a) && Intrinsics.f(this.f209305b, fVar.f209305b);
    }

    public final int hashCode() {
        return this.f209305b.hashCode() + (this.f209304a.hashCode() * 31);
    }
}
