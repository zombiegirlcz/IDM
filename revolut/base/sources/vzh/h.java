package vzh;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q87.q;
import vdl.c1;
import yji.n;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sd5.c f293535l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CryptoOrderDraft f293536m;

    public h(sd5.c cryptoConfigInteractor, CryptoOrderDraft draft) {
        Intrinsics.checkNotNullParameter(cryptoConfigInteractor, "cryptoConfigInteractor");
        Intrinsics.checkNotNullParameter(draft, "draft");
        this.f293535l = cryptoConfigInteractor;
        this.f293536m = draft;
    }

    @Override // vzh.a
    public final void Z2(CellDetailsActionDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        n.l2(this, new q(nim.a.v(vkm.q.Q(new d78.c(new go.g(model, 2), 3), new c1((Continuation) null, this, 29)), new vx9.b(this, 15)), 14), null, new g(this, null), 3);
    }
}
