package ft9;

import com.revolut.feature.payments.groups.impl.ui_new.details_settlement.GroupDetailsSettlementScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends bji.b implements jki.h {
    public final f u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(GroupDetailsSettlementScreenContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.u = new f(inputData.f79419a, inputData.f79420b);
    }

    @Override // bji.b, jki.g
    public final jki.i r2() {
        return this.u;
    }
}
