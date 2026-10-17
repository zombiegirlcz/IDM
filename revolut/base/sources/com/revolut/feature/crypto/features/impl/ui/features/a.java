package com.revolut.feature.crypto.features.impl.ui.features;

import cli.n;
import cli.y;
import com.revolut.feature.crypto.features.impl.ui.features.CryptoFeaturesControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lfg.z;
import lg5.d;
import lg5.e;
import lg5.g;
import mf5.c;
import oki.h;
import tnb.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements d {
    public final CryptoFeaturesControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final po5.a f70855p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g0 f70856q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f70857r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f70858s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f70859t;

    public a(n stateMapper, CryptoFeaturesControllerContract$InputData inputData, po5.a cryptoWithdrawEnabledStateChecker, g0 cryptoExchangeFeesFeatureChecker, c cryptoExchangeFeesNavigationProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cryptoWithdrawEnabledStateChecker, "cryptoWithdrawEnabledStateChecker");
        Intrinsics.checkNotNullParameter(cryptoExchangeFeesFeatureChecker, "cryptoExchangeFeesFeatureChecker");
        Intrinsics.checkNotNullParameter(cryptoExchangeFeesNavigationProvider, "cryptoExchangeFeesNavigationProvider");
        this.o = inputData;
        this.f70855p = cryptoWithdrawEnabledStateChecker;
        this.f70856q = cryptoExchangeFeesFeatureChecker;
        this.f70857r = cryptoExchangeFeesNavigationProvider;
        this.f70858s = mra.d.b(this, new e(false, false), stateMapper, null, false, 12);
        this.f70859t = hx7.e.a(this, new lcc.c(this, 6));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new lg5.h(this, continuation, 0), new z(14));
        l2(new lg5.h(this, continuation, 1), new z(13));
        gg5.a aVar = this.o.f70851a;
        int i = aVar == null ? -1 : g.f195071a[aVar.ordinal()];
        if (i != -1) {
            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
            com.revolut.kompot.navigable.vc.modal.a aVar2 = this.f70859t;
            if (i == 1) {
                h.v2(aVar2, CryptoFeaturesControllerContract$ModalStep.SendLimits.f70854a, bottom_dialog);
                return;
            }
            if (i == 2) {
                h.v2(aVar2, CryptoFeaturesControllerContract$ModalStep.Multichain.f70853a, ModalDestination.Style.POPUP.f98311a);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f70857r.getClass();
                h.v2(aVar2, CryptoFeaturesControllerContract$ModalStep.ExchangeFees.f70852a, bottom_dialog);
            }
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f70859t;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f70858s;
    }
}
