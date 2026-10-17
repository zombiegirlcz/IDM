package t42;

import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f267863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c f267864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f267865c;

    public /* synthetic */ r(com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar, String str, int i) {
        this.f267863a = i;
        this.f267864b = cVar;
        this.f267865c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f267863a) {
            case 0:
                TransferData updateTransferData = (TransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                return TransferData.e(updateTransferData, null, this.f267864b.f62448w.b(this.f267865c, updateTransferData.f62455c.f306286a), null, null, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
            default:
                b update = (b) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return b.a(update, TransferData.e(this.f267864b.N2(), null, 0L, null, this.f267865c, null, null, null, 239), null, 0, null, Constants.TAG_FB_CHARGING_STATUS);
        }
    }
}
