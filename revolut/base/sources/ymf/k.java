package ymf;

import cli.n;
import cli.y;
import com.revolut.feature.transactions.impl.ui.kompot.receipts.ReceiptsScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yk6.m;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends oki.h implements f {

    @NotNull
    private static final h Companion = new h();
    public final ReceiptsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rnf.g f314984p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bmf.b f314985q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tqi.e f314986r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f314987s;

    public k(ReceiptsScreenContract$InputData inputData, rnf.g receiptsDelegate, bmf.b transactionDetailsModalFactory, tqi.e shareExternalDestinationFactory, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(receiptsDelegate, "receiptsDelegate");
        Intrinsics.checkNotNullParameter(transactionDetailsModalFactory, "transactionDetailsModalFactory");
        Intrinsics.checkNotNullParameter(shareExternalDestinationFactory, "shareExternalDestinationFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f314984p = receiptsDelegate;
        this.f314985q = transactionDetailsModalFactory;
        this.f314986r = shareExternalDestinationFactory;
        this.f314987s = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, new wyd.f(new hy9.b(zi0.c.w(((rnf.l) this.f314984p).b(this.o.f92065a)), 8), this, 29), null, null, new m(this, (Continuation) null, 4), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f314987s;
    }
}
