package f0e;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.statements.impl.ui.documents_hub.product_selector.DocumentsHubProductSelectorContract$InputData;
import dz6.n;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends oki.h implements dli.b {
    public final DocumentsHubProductSelectorContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jyd.b f131109p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ang.f f131110q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f131111r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f131112s;

    public d(DocumentsHubProductSelectorContract$InputData inputData, jyd.b interactor, ang.f userInteractor, j stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f131109p = interactor;
        this.f131110q = userInteractor;
        this.f131111r = new vii.b(w4l.i.f294643c);
        this.f131112s = mra.d.b(this, new a(new Data(null, null, true, 3, null), inputData.f88371b, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f131111r, new n(continuation, this, 25)), null, null, new ew1.d(this, continuation, 18), 3);
        l2(new ewa.d(this, continuation, 3), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f131112s;
    }
}
