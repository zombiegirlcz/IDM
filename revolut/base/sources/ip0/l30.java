package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l30 implements m30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.core.ui_kit.models.b0 f165116a;

    public l30(com.revolut.core.ui_kit.models.b0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f165116a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l30) && Intrinsics.f(this.f165116a, ((l30) obj2).f165116a);
    }

    public final int hashCode() {
        return this.f165116a.hashCode();
    }
}
