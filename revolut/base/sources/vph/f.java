package vph;

import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenerSelectedFilter f291212a;

    public f(ScreenerSelectedFilter filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f291212a = filter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f291212a, ((f) obj2).f291212a);
    }

    public final int hashCode() {
        return this.f291212a.hashCode();
    }
}
