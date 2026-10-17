package z2j;

import com.revolut.feature.shared.beneficiary.api.common.QrScanResult;
import com.revolut.retail.core.navigation.FinishCommand;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import z1i.n;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements x2j.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3j.b f319094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x2k.e f319095b;

    public g(d3j.b beneficiaryInteractor, x2k.e bankTransferNaviCommandProvider) {
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(bankTransferNaviCommandProvider, "bankTransferNaviCommandProvider");
        this.f319094a = beneficiaryInteractor;
        this.f319095b = bankTransferNaviCommandProvider;
    }

    public final d0 a(String str, QrScanResult qrScanResult) {
        Intrinsics.checkNotNullParameter(qrScanResult, "qrScanResult");
        if (str == null) {
            ufm.b bVarM = d0.m(new FinishCommand(null, null, null, 7));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        d0 d0VarFirstOrError = this.f319094a.j(str, w4l.h.f294642c).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        ufm.i iVar = new ufm.i(zi0.c.s(d0VarFirstOrError), new n(new z1.c(qrScanResult, this, 12), 23), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
