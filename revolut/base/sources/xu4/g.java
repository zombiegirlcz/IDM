package xu4;

import cli.n;
import cli.y;
import com.revolut.feature.credit.card.impl.ui.revpoints_locked.CreditCardRevPointsLockedBottomDialogScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends oki.h implements dli.b {
    public final CreditCardRevPointsLockedBottomDialogScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f308961p;

    public g(n stateMapper, CreditCardRevPointsLockedBottomDialogScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f308961p = mra.d.b(this, new c(inputData.f69629b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f308961p;
    }
}
