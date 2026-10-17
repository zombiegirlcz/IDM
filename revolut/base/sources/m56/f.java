package m56;

import cli.y;
import com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.transfer_assets.DeFiTransferAssetsScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends oki.h implements dli.b {
    public final DeFiTransferAssetsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k18.c f202844p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f202845q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f202846r;

    public f(DeFiTransferAssetsScreenContract$InputData inputData, k18.c deFiAccountsInteractor, h stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deFiAccountsInteractor, "deFiAccountsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f202844p = deFiAccountsInteractor;
        this.f202845q = new vii.b();
        this.f202846r = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(this.f202845q, new li2.f(continuation, this, 21)), null, new lph.h(this, continuation, 25), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f202846r;
    }
}
