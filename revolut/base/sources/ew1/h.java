package ew1;

import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f129991a;

    public h(Alias selectedAlias) {
        Intrinsics.checkNotNullParameter(selectedAlias, "selectedAlias");
        this.f129991a = selectedAlias;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f129991a, ((h) obj2).f129991a);
    }

    public final int hashCode() {
        return this.f129991a.hashCode();
    }
}
