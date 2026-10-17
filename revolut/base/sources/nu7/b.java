package nu7;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BridgeDestination f219220a;

    public b(BridgeDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f219220a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f219220a.equals(((b) obj2).f219220a);
    }

    public final int hashCode() {
        return this.f219220a.f98270a.hashCode();
    }
}
