package h12;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BridgeDestination f148447a;

    public d(BridgeDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f148447a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f148447a.equals(((d) obj2).f148447a);
    }

    public final int hashCode() {
        return this.f148447a.f98270a.hashCode();
    }
}
