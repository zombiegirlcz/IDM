package e3j;

import a31.l;
import com.revolut.domain.models.beneficiary.BeneficiaryMatchScope;
import com.revolut.feature.shared.beneficiary.api.common.QrScanResult;
import com.revolut.feature.shared.beneficiary.api.domain.PaymentCodeType;
import com.revolut.retail.feature.beneficiary.api.domain.PaymentCode;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import n61.e;
import org.jetbrains.annotations.NotNull;
import rfm.f0;
import xo9.h;
import xo9.i;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements i {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3j.b f122333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x2j.c f122334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt9.b f122335c;
    public final vo1.c d;

    public f(a bankingQrCodeParser, d3j.b beneficiaryInteractor, x2j.c beneficiaryTransferCommandFactory, wt9.b qrCodeInteractor, vo1.c billsFeatureChecker) {
        Intrinsics.checkNotNullParameter(bankingQrCodeParser, "bankingQrCodeParser");
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(beneficiaryTransferCommandFactory, "beneficiaryTransferCommandFactory");
        Intrinsics.checkNotNullParameter(qrCodeInteractor, "qrCodeInteractor");
        Intrinsics.checkNotNullParameter(billsFeatureChecker, "billsFeatureChecker");
        this.f122333a = beneficiaryInteractor;
        this.f122334b = beneficiaryTransferCommandFactory;
        this.f122335c = qrCodeInteractor;
        this.d = billsFeatureChecker;
    }

    @Override // xo9.i
    public final d0 a(h parsingResult) {
        Intrinsics.checkNotNullParameter(parsingResult, "parsingResult");
        d dVar = (d) parsingResult;
        PaymentCode paymentCode = dVar.f122331a;
        if (!((fp1.d) this.d).c(cf9.c.f23654c) || paymentCode.f99590a != PaymentCodeType.SWISS) {
            ufm.i iVar = new ufm.i(new ufm.c(new l(this, paymentCode), 2), new e31.e(6, new c(this, 0)), 0);
            Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
            return iVar;
        }
        f0 f0VarO = this.f122335c.a(dVar.f122332b).o();
        Intrinsics.checkNotNullExpressionValue(f0VarO, "toSingle(...)");
        ufm.i iVar2 = new ufm.i(new ufm.i(ue0.e.D(f0VarO, new e1d.h(this, 13)), new e31.e(7, new e1d.h(this, 14)), 1), new e31.e(3, new c(this, 1)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
        return iVar2;
    }

    @Override // xo9.i
    public final d0 b(xq2.a code) {
        Intrinsics.checkNotNullParameter(code, "code");
        ufm.i iVar = new ufm.i(new ufm.c(new b(this, code, 0), 2), new e31.e(5, new d62.a(code, 1)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final ufm.i c(QrScanResult qrScanResult) {
        f5j.a aVar = qrScanResult.f86035a;
        ufm.i iVar = new ufm.i(ue0.e.F(this.f122333a.e(new n61.b(aVar.e, aVar.f, aVar.f132333h, aVar.f132337n, aVar.o, aVar.u, null, 64512), BeneficiaryMatchScope.FULL_DETAILS), e.a.f212682a), new e31.e(4, new e1.b(this, qrScanResult, 15)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
