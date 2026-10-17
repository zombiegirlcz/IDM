package ew1;

import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f129987a;

    public e(Alias alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f129987a = alias;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f129987a, ((e) obj2).f129987a);
    }

    public final int hashCode() {
        return this.f129987a.hashCode();
    }
}
