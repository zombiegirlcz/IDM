package rt4;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_settings.CreditCardLimitSettingsControllerContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import om4.k0;
import om4.r0;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class p extends oki.h implements dli.b {

    @NotNull
    private static final k Companion = new k();
    public final CreditCardLimitSettingsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final al4.n f257182p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k0 f257183q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final al4.o f257184r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ky4.e f257185s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f257186t;

    public p(CreditCardLimitSettingsControllerContract$InputData inputData, al4.n creditCardInteractor, k0 creditCardFeatureInteractor, al4.o creditCardLimitIncreaseInteractor, r stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardFeatureInteractor, "creditCardFeatureInteractor");
        Intrinsics.checkNotNullParameter(creditCardLimitIncreaseInteractor, "creditCardLimitIncreaseInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f257182p = creditCardInteractor;
        this.f257183q = creditCardFeatureInteractor;
        this.f257184r = creditCardLimitIncreaseInteractor;
        this.f257185s = new ky4.e(0);
        this.f257186t = mra.d.b(this, new e(new Data(null, null, true, 3, null), inputData.f69541b), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.n(vkm.q.Q(this.f257185s, new r0(24, continuation, this)), h0.f322473a), null, null, new o(this, continuation, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f257186t;
    }
}
