package nob;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.impl.ui.automations.SavingsAutomationsScreenContract$InputData;
import i3g.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rnb.m;
import rnb.w;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends oki.h implements dli.b {
    public final SavingsAutomationsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w f217969p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f217970q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final oob.a f217971r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f217972s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f217973t;

    public i(k stateMapper, SavingsAutomationsScreenContract$InputData inputData, w savingsVaultInteractor, m savingsAutoPaymentsInteractor, oob.a savingsAutomationsExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(savingsAutoPaymentsInteractor, "savingsAutoPaymentsInteractor");
        Intrinsics.checkNotNullParameter(savingsAutomationsExtension, "savingsAutomationsExtension");
        this.o = inputData;
        this.f217969p = savingsVaultInteractor;
        this.f217970q = savingsAutoPaymentsInteractor;
        this.f217971r = savingsAutomationsExtension;
        this.f217972s = new vii.b();
        this.f217973t = mra.d.b(this, new g(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, nim.a.v(q.Q(this.f217972s, new mk0.f(continuation, this, 26)), new nnf.h(7)), null, null, new nn7.d(this, continuation, 7), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f217973t;
    }
}
