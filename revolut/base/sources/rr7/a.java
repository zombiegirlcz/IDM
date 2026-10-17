package rr7;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BridgeDestination f256732a;

    public a(BridgeDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f256732a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f256732a.equals(((a) obj2).f256732a);
    }

    public final int hashCode() {
        return this.f256732a.f98270a.hashCode();
    }
}
