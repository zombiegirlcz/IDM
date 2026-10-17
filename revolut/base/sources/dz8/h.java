package dz8;

import aii.u;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f121294a;

    public h(BridgeDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f121294a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f121294a, ((h) obj2).f121294a);
    }

    public final int hashCode() {
        return this.f121294a.hashCode();
    }
}
