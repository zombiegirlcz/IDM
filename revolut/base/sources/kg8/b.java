package kg8;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BridgeDestination f183932a;

    public b(BridgeDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f183932a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f183932a.equals(((b) obj2).f183932a);
    }

    public final int hashCode() {
        return this.f183932a.f98270a.hashCode();
    }
}
