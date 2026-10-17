package mig;

import hfg.w;
import kotlin.jvm.internal.Intrinsics;
import mig.f;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f205845a;

    public g(w recentSearch) {
        Intrinsics.checkNotNullParameter(recentSearch, "recentSearch");
        this.f205845a = recentSearch;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f205845a, ((g) obj2).f205845a);
    }

    public final int hashCode() {
        return this.f205845a.hashCode();
    }
}
