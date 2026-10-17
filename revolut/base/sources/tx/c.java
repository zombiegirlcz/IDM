package tx;

import com.revolut.camerakit.revolut.ui.barcode.BarcodeReaderFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import xv.p;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarcodeReaderFlowContract$InputData f275072a;

    public c(BarcodeReaderFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f275072a = inputData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r1.f(r2) != false) goto L11;
     */
    @Override // xv.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r1, kotlin.coroutines.Continuation r2, xv.i r3, xv.m r4) {
        /*
            r0 = this;
            boolean r1 = r3 instanceof dx.o
            if (r1 == 0) goto L1f
            com.revolut.camerakit.revolut.ui.barcode.BarcodeReaderFlowContract$InputData r1 = r0.f275072a
            com.revolut.camerakit.revolut.ui.barcode.models.BarcodeReaderScreenSettings r1 = r1.f50754a
            kotlin.text.Regex r1 = r1.d
            if (r1 == 0) goto L1c
            dx.o r3 = (dx.o) r3
            com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcode r2 = r3.f120508a
            java.lang.String r2 = r2.f51390a
            if (r2 != 0) goto L16
            java.lang.String r2 = ""
        L16:
            boolean r1 = r1.f(r2)
            if (r1 == 0) goto L1f
        L1c:
            tx.b r1 = tx.b.f275071a
            return r1
        L1f:
            tx.a r1 = tx.a.f275070a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.c.b(java.util.List, kotlin.coroutines.Continuation, xv.i, xv.m):java.lang.Object");
    }
}
