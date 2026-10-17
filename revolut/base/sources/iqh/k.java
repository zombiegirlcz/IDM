package iqh;

import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenerSelectedFilter.Options f167862a;

    public k(ScreenerSelectedFilter.Options updatedSelectedFilter) {
        Intrinsics.checkNotNullParameter(updatedSelectedFilter, "updatedSelectedFilter");
        this.f167862a = updatedSelectedFilter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f167862a.equals(((k) obj2).f167862a);
    }

    public final int hashCode() {
        return this.f167862a.hashCode();
    }
}
