package a5e;

import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FixedTabsDelegate f1362a;

    public c(FixedTabsDelegate tabsDelegate) {
        Intrinsics.checkNotNullParameter(tabsDelegate, "tabsDelegate");
        this.f1362a = tabsDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f1362a, ((c) obj2).f1362a);
    }

    public final int hashCode() {
        return this.f1362a.hashCode();
    }
}
