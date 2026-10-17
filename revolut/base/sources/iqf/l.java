package iqf;

import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.transfer.core.impl.ui.reason.chooser_v2.ReasonForTransferChooserContract$InputData;
import ip4.m;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.q;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends oki.h implements dli.b {

    @NotNull
    private static final j Companion = new j();
    public final ReasonForTransferChooserContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f167835p;

    public l(ReasonForTransferChooserContract$InputData inputData, f stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f167835p = mra.d.b(this, new a(inputData.f92194a, inputData.f92195b, inputData.f92196c, ""), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.q(new ahe.i(new vkm.y(new ikf.g(this, continuation, 10), t1.e(this.f167835p.B(new m(6)), new m(7))), 3)), null, null, new ibg.g(this, continuation, 26), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f167835p;
    }
}
