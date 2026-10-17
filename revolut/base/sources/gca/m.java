package gca;

import cli.y;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.refund.screen.amount.PixRefundAmountScreenContract$InputData;
import fo1.b0;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import wsg.n;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends oki.h implements dli.b {
    public final n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w80.b f142389p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f142390q;

    public m(n walletInteractor, w80.b amountFormatter, t70.g localization, PixRefundAmountScreenContract$InputData inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = walletInteractor;
        this.f142389p = amountFormatter;
        dj0.d dVar = inputData.f80736a;
        String str = inputData.f80737b;
        dj0.d dVar2 = inputData.d;
        String str2 = inputData.f80738c;
        String string = localization.getString(R$string.pix_refund_amount_title);
        xi0.b.Companion.getClass();
        this.f142390q = mra.d.b(this, new f(dVar, str, str2, dVar2, new dj0.d(0L, xi0.b.D), string, inputData.e), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new b0(this, null, 25), new yi5.b(26));
    }

    public final void I2() {
        y yVar = this.f142390q;
        dj0.d dVar = ((f) ((j2) yVar.f22677a).getValue()).f142375a;
        j2 j2Var = (j2) yVar.f22677a;
        C2(new g(dVar, ((f) j2Var.getValue()).f142377c, ((f) j2Var.getValue()).f142376b, ((f) j2Var.getValue()).f));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f142390q;
    }
}
