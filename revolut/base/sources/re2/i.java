package re2;

import aw0.f4;
import cli.n;
import cli.y;
import com.revolut.feature.apm.swish.impl.ui.home.transaction_limit.SwishTransactionLimitScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd3.m;
import vkm.q;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends oki.h implements dli.b {

    @NotNull
    public static final h Companion = new h();
    public final SwishTransactionLimitScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.feature.apm.swish.impl.domain.a f253496p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ldd.b f253497q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w80.b f253498r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f253499s;

    public i(n stateMapper, SwishTransactionLimitScreenContract$InputData inputData, com.revolut.feature.apm.swish.impl.domain.a swishInteractor, ldd.b focusRequesterDelegate, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(swishInteractor, "swishInteractor");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.o = inputData;
        this.f253496p = swishInteractor;
        this.f253497q = focusRequesterDelegate;
        this.f253498r = amountFormatter;
        this.f253499s = mra.d.b(this, new d(inputData.f62930a, inputData.f62931b, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        ldd.b bVar = this.f253497q;
        bVar.f194072c = false;
        bVar.b(new f4("ID_AMOUNT_INPUT", true));
        yji.l.a1(this, q.q(this.f253499s.B(new m(15))), null, null, new r5e.e(this, null, 18), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f253499s;
    }
}
