package eyj;

import com.revolut.retail.feature.junior_upgrade.impl.ui_kompot.screen.JuniorUpgradeScreenContract$InputData;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends jki.g implements d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final JuniorUpgradeScreenContract$InputData f130870p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f130871q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(JuniorUpgradeScreenContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f130870p = inputData;
        this.f130871q = new c(inputData.f101761a, inputData.f101762b, inputData.f101763c, inputData.f101764g != null, inputData.d);
    }

    @Override // jki.g
    public final i r2() {
        return this.f130871q;
    }
}
