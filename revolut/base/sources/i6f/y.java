package i6f;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f158990a;

    public y(List otherActions) {
        Intrinsics.checkNotNullParameter(otherActions, "otherActions");
        this.f158990a = otherActions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f158990a, ((y) obj2).f158990a);
    }

    public final int hashCode() {
        return this.f158990a.hashCode();
    }
}
