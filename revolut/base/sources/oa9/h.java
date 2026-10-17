package oa9;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.onboarding.impl.onboarding.contractual_documentation.screen.ContractualDocsContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends oki.h implements b {
    public final mre.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pre.c f223549p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ContractualDocsContract$InputData f223550q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f223551r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f223552s;

    public h(i mapper, mre.c termsNavigationFactory, pre.c termsInteractor, ContractualDocsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = termsNavigationFactory;
        this.f223549p = termsInteractor;
        this.f223550q = inputData;
        this.f223551r = mra.d.b(this, new a(new Data(null, null, true, 3, null)), mapper, null, false, 12);
        this.f223552s = new vii.b();
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f223552s, new ns9.h(continuation, this, 18)), null, null, new o95.c(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f223551r;
    }
}
