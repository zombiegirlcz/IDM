package s8h;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f261000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f261001c;

    public /* synthetic */ g(boolean z, m mVar, int i) {
        this.f260999a = i;
        this.f261000b = z;
        this.f261001c = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ParcelableDestination destination = (ParcelableDestination) obj2;
        switch (this.f260999a) {
            case 0:
                Intrinsics.checkNotNullParameter(destination, "destination");
                return (!this.f261000b || (destination instanceof BridgeDestination)) ? destination instanceof BridgeDestination ? ((BridgeDestination) destination).f98270a : u0.e(destination) : com.revolut.retail.core.navigation.a.c((NaviCommand) this.f261001c.d.getValue(), u0.e(destination));
            default:
                Intrinsics.checkNotNullParameter(destination, "destination");
                boolean z = destination instanceof BridgeDestination;
                m mVar = this.f261001c;
                return new pfm.h(new rzc.b(mVar, z ? ((BridgeDestination) destination).f98270a : this.f261000b ? com.revolut.retail.core.navigation.a.c((NaviCommand) mVar.d.getValue(), u0.e(destination)) : u0.e(destination), 5), 2);
        }
    }
}
