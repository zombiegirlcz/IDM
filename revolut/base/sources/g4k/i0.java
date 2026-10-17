package g4k;

import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class i0 extends yji.n implements g0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final BankTransferFlowInputData f140556l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sf0.h f140557m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j60.a f140558n;

    public i0(BankTransferFlowInputData flowInputData, sf0.h serverErrorParser, j60.a bottomDialogExtension) {
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        this.f140556l = flowInputData;
        this.f140557m = serverErrorParser;
        this.f140558n = bottomDialogExtension;
    }

    public final void Z2() {
        A2(u0.b(new FinishCommand(null, null, null, 7)));
    }
}
