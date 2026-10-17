package suc;

import cli.y;
import com.revolut.feature.security_hub.impl.ui.linked_wallet_card_cancel.LinkedWalletCardCancelScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends oki.h implements dli.b {
    public final LinkedWalletCardCancelScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l93.f f265714p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f265715q;

    public m(n stateMapper, LinkedWalletCardCancelScreenContract$InputData inputData, l93.f cardInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardInteractor, "cardInteractor");
        this.o = inputData;
        this.f265714p = cardInteractor;
        this.f265715q = mra.d.b(this, new d(inputData.f85590b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f265715q;
    }
}
