package j7j;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd6.h f171933a;

    public i(wd6.h selectedOrderType) {
        Intrinsics.checkNotNullParameter(selectedOrderType, "selectedOrderType");
        this.f171933a = selectedOrderType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f171933a == ((i) obj2).f171933a;
    }

    public final int hashCode() {
        return this.f171933a.hashCode();
    }
}
