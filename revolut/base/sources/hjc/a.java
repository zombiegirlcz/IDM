package hjc;

import aii.u;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.InternalDestination;
import i7d.m;
import kotlin.jvm.internal.Intrinsics;
import vhi.c;
import yhi.b;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements m {
    @Override // i7d.m
    public final u a(InternalDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return new BridgeDestination(c.c(destination, b.SOLID, null, false, 4));
    }
}
