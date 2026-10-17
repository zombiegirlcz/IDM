package mw1;

import com.revolut.feature.apm.core.models.alias.Alias;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f209302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f209303b;

    public e(Alias currentAlias, List availableAliases) {
        Intrinsics.checkNotNullParameter(currentAlias, "currentAlias");
        Intrinsics.checkNotNullParameter(availableAliases, "availableAliases");
        this.f209302a = currentAlias;
        this.f209303b = availableAliases;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f209302a, eVar.f209302a) && Intrinsics.f(this.f209303b, eVar.f209303b);
    }

    public final int hashCode() {
        return this.f209303b.hashCode() + (this.f209302a.hashCode() * 31);
    }
}
