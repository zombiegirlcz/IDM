package kba;

import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.PixQrCodeTransactionFlowContract$State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wba.h;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PixQrCodeDecodeData f182544b;

    public /* synthetic */ d(PixQrCodeDecodeData pixQrCodeDecodeData, int i) {
        this.f182543a = i;
        this.f182544b = pixQrCodeDecodeData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f182543a) {
            case 0:
                ((PixQrCodeTransactionFlowContract$State) obj2).getClass();
                PixQrCodeDecodeData qrDecodeResult = this.f182544b;
                Intrinsics.checkNotNullParameter(qrDecodeResult, "qrDecodeResult");
                return new PixQrCodeTransactionFlowContract$State(qrDecodeResult);
            default:
                return h.a((h) obj2, null, this.f182544b, null, 27);
        }
    }
}
