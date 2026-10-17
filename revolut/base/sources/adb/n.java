package adb;

import cli.y;
import com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.screen.DepositAssetsScreenContract$Input;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends oki.h implements k {
    public final y o;

    public n(DepositAssetsScreenContract$Input input, cli.n stateMapper) {
        d dVar;
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        List list = input.f82797a;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<tcb.a> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (tcb.a aVar : list2) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            int i = m.f3320a[aVar.ordinal()];
            if (i == 1) {
                dVar = d.MONEY;
            } else if (i == 2) {
                dVar = d.TRADING;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = d.CRYPTO;
            }
            arrayList.add(dVar);
        }
        this.o = mra.d.b(this, new e(arrayList), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
