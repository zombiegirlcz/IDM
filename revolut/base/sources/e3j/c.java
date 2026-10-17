package e3j;

import com.revolut.feature.shared.beneficiary.api.common.QrScanResult;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f122330b;

    public /* synthetic */ c(f fVar, int i) {
        this.f122329a = i;
        this.f122330b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        QrScanResult scanResult = (QrScanResult) obj2;
        switch (this.f122329a) {
            case 0:
                Intrinsics.checkNotNullParameter(scanResult, "scanResult");
                break;
            default:
                Intrinsics.checkNotNullParameter(scanResult, "scanResult");
                break;
        }
        return this.f122330b.c(scanResult);
    }
}
