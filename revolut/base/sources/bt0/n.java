package bt0;

import ip0.oe0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n implements com.revolut.core.ui_kit.internal.views.chart.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oe0 f18242a;

    public n(oe0 scrollFormat, int i) {
        Intrinsics.checkNotNullParameter(scrollFormat, "scrollFormat");
        this.f18242a = scrollFormat;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f18242a == ((n) obj2).f18242a;
    }

    public final int hashCode() {
        return this.f18242a.hashCode();
    }
}
