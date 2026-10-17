package ux0;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f283770a;

    public k(Set highlightedActionIds) {
        Intrinsics.checkNotNullParameter(highlightedActionIds, "highlightedActionIds");
        this.f283770a = highlightedActionIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f283770a, ((k) obj2).f283770a);
    }

    public final int hashCode() {
        return this.f283770a.hashCode();
    }
}
