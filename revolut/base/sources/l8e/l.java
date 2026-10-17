package l8e;

import com.revolut.data.model.Data;
import com.revolut.feature.subaccount.impl.ui.invite.screen.VaultInvitationConfirmationScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g6e.b f192970p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ppg.b f192971q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f192972r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mre.c f192973s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f192974t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g6e.b subaccountBackgroundInteractor, ppg.b vaultsInteractor, ang.f userInteractor, mre.c termsNavigationFactory, p stateMapper, VaultInvitationConfirmationScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(subaccountBackgroundInteractor, "subaccountBackgroundInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f192970p = subaccountBackgroundInteractor;
        this.f192971q = vaultsInteractor;
        this.f192972r = userInteractor;
        this.f192973s = termsNavigationFactory;
        this.f192974t = new d(inputData.f89096a, new Data(null, null, true, 3, null), null);
    }

    @Override // yji.l
    public final void I1() {
        l2(new j(this, null), new yi5.b(26));
        l2(new k(this, null), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f192974t;
    }
}
