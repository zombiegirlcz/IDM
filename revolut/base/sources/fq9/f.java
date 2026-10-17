package fq9;

import cli.y;
import com.revolut.feature.payments.bills_chooser.impl.domain.SplitBillItem;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.members.ItemizationMembersControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends oki.h implements dli.b {
    public final y o;

    public f(ItemizationMembersControllerContract$InputData inputData, h stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        SplitBillItem splitBillItem = inputData.f79277a;
        this.o = mra.d.b(this, new d(splitBillItem, inputData.f79278b, inputData.f79279c, inputData.d, splitBillItem.d), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
