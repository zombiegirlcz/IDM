package bv4;

import al4.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.settings.screen.CreditCardSettingsScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import om4.k2;
import om4.x2;
import vkm.q;
import vkm.v1;
import yji.l;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends oki.h implements dli.b {
    public final CreditCardSettingsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f18965p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f18966q;

    public i(CreditCardSettingsScreenContract$InputData inputData, n creditCardInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f18965p = creditCardInteractor;
        this.f18966q = mra.d.b(this, new d(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        String facilityId = this.o.f69637a;
        x2 x2Var = (x2) this.f18965p;
        x2Var.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        l.a1(this, rd0.e.n(q.Q(new v1(new k2(x2Var, facilityId, null, 1)), new mki.d(continuation, new Data(f0.f322471a, null, false, 6, null), x2Var, facilityId, 4)), h0.f322473a), null, null, new btd.e(this, continuation, 8), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f18966q;
    }
}
