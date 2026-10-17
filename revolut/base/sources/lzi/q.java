package lzi;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f200998a;

    public q(List percentageBands) {
        Intrinsics.checkNotNullParameter(percentageBands, "percentageBands");
        this.f200998a = percentageBands;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f200998a, ((q) obj2).f200998a);
    }

    public final int hashCode() {
        return this.f200998a.hashCode();
    }
}
