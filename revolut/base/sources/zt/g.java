package zt;

import au.i;
import au.j;
import au.k;
import au.l;
import com.revolut.biometric_verification.impl.ui.step.nfc.flow.BiometricVerificationNfcFlowContract$AuthData;
import com.revolut.biometric_verification.impl.ui.step.nfc.flow.BiometricVerificationNfcFlowContract$Step;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f324999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.biometric_verification.impl.ui.step.nfc.flow.a f325000b;

    public /* synthetic */ g(com.revolut.biometric_verification.impl.ui.step.nfc.flow.a aVar, int i) {
        this.f324999a = i;
        this.f325000b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f324999a) {
            case 0:
                du.a result = (du.a) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                com.revolut.biometric_verification.impl.ui.step.nfc.flow.a aVar = this.f325000b;
                h.t2(aVar, aVar.f50627q, new BiometricVerificationNfcFlowContract$Step.ConsolidatedNfcReaderStep(new BiometricVerificationNfcFlowContract$AuthData.ICAO(result.f117485a, result.f117486b, result.f117487c)), false, null, false, 12);
                return Unit.f186387a;
            default:
                l result2 = (l) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                boolean z = result2 instanceof j;
                com.revolut.biometric_verification.impl.ui.step.nfc.flow.a aVar2 = this.f325000b;
                if (z) {
                    aVar2.C2(new e(((j) result2).f9119a, aVar2.o.d));
                } else if (result2 instanceof k) {
                    k kVar = (k) result2;
                    h.t2(aVar2, aVar2.f50627q, new BiometricVerificationNfcFlowContract$Step.UpdateDetails(kVar.f9120a, kVar.f9121b, kVar.f9122c, kVar.d), false, null, false, 12);
                } else {
                    if (!(result2 instanceof i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.C2(new d(((i) result2).f9118a));
                }
                return Unit.f186387a;
        }
    }
}
