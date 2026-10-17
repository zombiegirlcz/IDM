package dt5;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BridgeDestination f117386a;

    public c(BridgeDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f117386a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f117386a.equals(((c) obj2).f117386a);
    }

    public final int hashCode() {
        return this.f117386a.f98270a.hashCode();
    }
}
