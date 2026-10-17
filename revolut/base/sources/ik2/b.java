package ik2;

import cli.g;
import cli.j;
import cli.n;
import cli.y;
import com.revolut.feature.atm.impl.ui.redesign.fees.AtmFeesBottomSheetScreenContract$InputData;
import ik2.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements c {
    public final y o;

    public b(n stateMapper, AtmFeesBottomSheetScreenContract$InputData inputData) {
        j jVar;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (inputData instanceof AtmFeesBottomSheetScreenContract$InputData.WithdrawalFee) {
            jVar = d.b.f161875a;
        } else {
            if (!(inputData instanceof AtmFeesBottomSheetScreenContract$InputData.ExchangeFee)) {
                throw new NoWhenBranchMatchedException();
            }
            jVar = d.a.f161874a;
        }
        this.o = mra.d.b(this, jVar, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
