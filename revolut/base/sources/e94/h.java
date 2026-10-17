package e94;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.hub.DebtsV2HubScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends oki.h implements l {
    public final DebtsV2HubScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xw3.a f123905p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a94.k f123906q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f123907r;

    public h(DebtsV2HubScreenContract$InputData input, xw3.a debtsInteractor, a94.k debtsControllerModelExtension, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(debtsInteractor, "debtsInteractor");
        Intrinsics.checkNotNullParameter(debtsControllerModelExtension, "debtsControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = input;
        this.f123905p = debtsInteractor;
        this.f123906q = debtsControllerModelExtension;
        this.f123907r = mra.d.b(this, new m(new Data(null, null, true, 3, null), false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        a94.k kVar = this.f123906q;
        yji.l.a1(this, rd0.e.n(pyd.c.m(kVar.f2317n.B(new h0() { // from class: a94.j
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((r) obj2).f2328a;
            }
        })), zhm.h0.f322473a), null, null, new e0b.c(this, null, 27), 3);
        yji.l.a1(this, kVar.f2317n.B(new a82.l(21)), null, null, new a2g.q(this, (Continuation) null, 13), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f123907r;
    }
}
