package til;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BridgeDestination f271578a;

    public f(BridgeDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f271578a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f271578a.equals(((f) obj2).f271578a);
    }

    public final int hashCode() {
        return this.f271578a.f98270a.hashCode();
    }
}
