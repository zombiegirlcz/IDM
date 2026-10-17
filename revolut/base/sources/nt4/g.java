package nt4;

import al4.n;
import at.r;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_history.CreditCardLimitHistoryControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import om4.x2;
import w4l.j;
import yji.l;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends h implements dli.b {
    public final CreditCardLimitHistoryControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f218965p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f218966q;

    public g(CreditCardLimitHistoryControllerContract$InputData inputData, n creditCardInteractor, r stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f218965p = creditCardInteractor;
        this.f218966q = mra.d.b(this, new d(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, ((x2) this.f218965p).j(this.o.f69536a, j.f294644c), null, null, new nn7.d(this, null, 19), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f218966q;
    }
}
