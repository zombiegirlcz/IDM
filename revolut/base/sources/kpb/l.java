package kpb;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.impl.ui.product_migration.ProductMigrationScreenContract$InputData;
import klf.a3;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends oki.h implements dli.b {
    public final ProductMigrationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ijb.a f188221p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mpg.a f188222q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final clb.c f188223r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f188224s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f188225t;

    public l(ProductMigrationScreenContract$InputData inputData, ijb.a savingsProductInteractor, mpg.a savingsTcAcceptanceApi, clb.c savingsErrorHandlingApi, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(savingsTcAcceptanceApi, "savingsTcAcceptanceApi");
        Intrinsics.checkNotNullParameter(savingsErrorHandlingApi, "savingsErrorHandlingApi");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f188221p = savingsProductInteractor;
        this.f188222q = savingsTcAcceptanceApi;
        this.f188223r = savingsErrorHandlingApi;
        this.f188224s = new vii.b();
        this.f188225t = mra.d.b(this, new d(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f188224s, new a3(continuation, this, 2)), null, null, new kae.d(this, continuation, 26), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f188225t;
    }
}
