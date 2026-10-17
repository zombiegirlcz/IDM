package ap7;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.driver.list.AdditionalDriverListScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AdditionalDriverListScreenContract$InputData f8111p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tl7.f f8112q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f8113r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f8114s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8115t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p stateMapper, AdditionalDriverListScreenContract$InputData inputData, tl7.f bottomDialog, ang.f userInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f8111p = inputData;
        this.f8112q = bottomDialog;
        this.f8113r = userInteractor;
        this.f8114s = new d(new Data(null, null, true, 3, null), inputData.f75578a);
        this.f8115t = true;
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(this.f8113r.k(false)), null, null, new k(this, null, 0), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f8114s;
    }
}
