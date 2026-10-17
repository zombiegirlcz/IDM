package jnb;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.impl.documents.presentation.documents.ProductDocumentsContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends oki.h implements g {
    public final ProductDocumentsContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gnb.b f176678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ijb.a f176679q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f176680r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f176681s;

    public p(m stateMapper, ProductDocumentsContract$InputData inputData, gnb.b savingsDocumentsInteractor, ijb.a savingsProductInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(savingsDocumentsInteractor, "savingsDocumentsInteractor");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        this.o = inputData;
        this.f176678p = savingsDocumentsInteractor;
        this.f176679q = savingsProductInteractor;
        this.f176680r = new vii.b();
        this.f176681s = mra.d.b(this, new b(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f176680r, new iw6.l(continuation, this, 21)), null, null, new jij.h(this, continuation, 11), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f176681s;
    }
}
