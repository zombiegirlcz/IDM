package x4e;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrendViewDelegate f302862a;

    public c(TrendViewDelegate trendViewDelegate) {
        Intrinsics.checkNotNullParameter(trendViewDelegate, "trendViewDelegate");
        this.f302862a = trendViewDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f302862a, ((c) obj2).f302862a);
    }

    public final int hashCode() {
        return this.f302862a.hashCode();
    }
}
