package rze;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BridgeDestination f258597a;

    public f(BridgeDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f258597a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f258597a.equals(((f) obj2).f258597a);
    }

    public final int hashCode() {
        return this.f258597a.f98270a.hashCode();
    }
}
