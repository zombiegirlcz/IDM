package bse;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.three_ds_verification.impl.ui.add_money.AddMoneyMethodSelectionScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import yte.p;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends oki.h implements f {
    public final AddMoneyMethodSelectionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lh3.a f18179p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f18180q;

    public e(n stateMapper, AddMoneyMethodSelectionScreenContract$InputData inputData, lh3.a addMoneyMethodsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(addMoneyMethodsInteractor, "addMoneyMethodsInteractor");
        this.o = inputData;
        this.f18179p = addMoneyMethodsInteractor;
        this.f18180q = mra.d.b(this, new g(new Data(null, null, true, 3, null), inputData.e, false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        AddMoneyMethodSelectionScreenContract$InputData addMoneyMethodSelectionScreenContract$InputData = this.o;
        yji.l.a1(this, ((oh3.f) this.f18179p).b(addMoneyMethodSelectionScreenContract$InputData.f90398a, addMoneyMethodSelectionScreenContract$InputData.f90399b.H, addMoneyMethodSelectionScreenContract$InputData.f90400c, addMoneyMethodSelectionScreenContract$InputData.d, yte.n.THREE_DS, u.c(p.INSTANT)), null, null, new bi2.n(this, null, 26), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f18180q;
    }
}
