package lc1;

import cli.g;
import cli.k;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends h implements b {
    public final cfc.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f193783p;

    public d(e stateMapper, cfc.b cardReaderUiMerchantInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(cardReaderUiMerchantInteractor, "cardReaderUiMerchantInteractor");
        this.o = cardReaderUiMerchantInteractor;
        this.f193783p = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new kze.h(this, null, 7), new yi5.b(26));
    }

    @Override // cli.z
    public final g getState() {
        return this.f193783p;
    }
}
