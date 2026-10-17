package brf;

import avj.o;
import bi2.n;
import ble.c1;
import c5a.m0;
import com.revolut.data.model.Data;
import com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferTroubleshooterInputData;
import jki.g;
import jki.h;
import jki.i;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.v1;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TransferTroubleshooterInputData f18008p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mde.e f18009q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r10.f f18010r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final crf.d f18011s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f18012t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TransferTroubleshooterInputData inputData, mde.e sharedHelpDestinationProvider, r10.f transferTroubleshooterInteractor, crf.d troubleshooterActionExtension, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(sharedHelpDestinationProvider, "sharedHelpDestinationProvider");
        Intrinsics.checkNotNullParameter(transferTroubleshooterInteractor, "transferTroubleshooterInteractor");
        Intrinsics.checkNotNullParameter(troubleshooterActionExtension, "troubleshooterActionExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f18008p = inputData;
        this.f18009q = sharedHelpDestinationProvider;
        this.f18010r = transferTroubleshooterInteractor;
        this.f18011s = troubleshooterActionExtension;
        this.f18012t = new d(new Data(null, null, true, 3, null), inputData.f92174b, inputData.f92175c);
    }

    @Override // yji.l
    public final void I1() {
        y2();
    }

    @Override // jki.g
    public final i r2() {
        return this.f18012t;
    }

    public final void y2() {
        TransferTroubleshooterInputData transferTroubleshooterInputData = this.f18008p;
        String transactionId = transferTroubleshooterInputData.f92173a;
        String source = transferTroubleshooterInputData.f92175c;
        String str = transferTroubleshooterInputData.d;
        r10.f fVar = this.f18010r;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(source, "source");
        Continuation continuation = null;
        l.a1(this, rd0.e.b(nim.a.w(kli.a.h(nim.a.w(com.revolut.domain.interactors.transactions.a.c((com.revolut.domain.interactors.transactions.a) fVar.b, transactionId, null, false, 6), new com.revolut.feature.alipay_plus.mpm.webcontainer.a(28)), rd0.e.c(new c1(new v1(new m0(fVar, transactionId, continuation, 14)), 2), kotlin.coroutines.g.f186406a)), new o(source, fVar, str))), null, null, new n(this, continuation, 25), 3);
    }
}
