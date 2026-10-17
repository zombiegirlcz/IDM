package jsg;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h extends q implements Function1 {
    public static final h f = new h();

    public h() {
        super(1, BridgeDestination.class, "<init>", "<init>(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        NaviCommand p0 = (NaviCommand) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new BridgeDestination(p0);
    }
}
