package o5d;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f222424a;

    public d(Map swipeableTradeActions) {
        Intrinsics.checkNotNullParameter(swipeableTradeActions, "swipeableTradeActions");
        this.f222424a = swipeableTradeActions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f222424a.equals(((d) obj2).f222424a);
    }

    public final int hashCode() {
        return this.f222424a.hashCode();
    }
}
