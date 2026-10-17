package af1;

import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.receipt.ReceiptScreenContract$InputData;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends jki.g implements jki.h {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ReceiptScreenContract$InputData f3823p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fkg.a f3824q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c90.c f3825r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final hf1.a f3826s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f3827t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p stateMapper, ReceiptScreenContract$InputData inputData, fkg.a qrCodeGenerator, c90.c uiResources, hf1.a receiptDestinationProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(receiptDestinationProvider, "receiptDestinationProvider");
        this.f3823p = inputData;
        this.f3824q = qrCodeGenerator;
        this.f3825r = uiResources;
        this.f3826s = receiptDestinationProvider;
        this.f3827t = new c(null);
    }

    @Override // yji.l
    public final void I1() {
        l2(new a01.e(this, null, 21), new yi5.b(26));
    }

    @Override // jki.g
    public final i r2() {
        return this.f3827t;
    }
}
