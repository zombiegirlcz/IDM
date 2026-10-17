package n8i;

import com.revolut.kompot.common.StackDestination;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.v9;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g0 extends yji.n {
    public List Z2(k1j.a targetAccountType) {
        Intrinsics.checkNotNullParameter(targetAccountType, "targetAccountType");
        return zhm.f0.f322471a;
    }

    public StackDestination b3(l destinationModel) {
        Intrinsics.checkNotNullParameter(destinationModel, "destinationModel");
        throw new IllegalStateException("No destination found for model type: ".concat(l.class.getSimpleName()));
    }

    public o c3(y yVar) {
        return null;
    }

    public void d3(Object obj2, Object event, v9 onAmountUpdate) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(onAmountUpdate, "onAmountUpdate");
    }
}
