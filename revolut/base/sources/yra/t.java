package yra;

import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import com.revolut.feature.transfer.core.api.interactor.ReferenceData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f316194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f316195c;

    public /* synthetic */ t(x xVar, String str, int i) {
        this.f316193a = i;
        this.f316194b = xVar;
        this.f316195c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f316193a) {
            case 0:
                PushToCardTransferData updateTransferData = (PushToCardTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                return PushToCardTransferData.a(updateTransferData, this.f316194b.z.b(this.f316195c, updateTransferData.f81529c.f306286a), null, null, null, null, null, null, 509);
            default:
                j updateState = (j) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                x xVar = this.f316194b;
                PushToCardTransferData pushToCardTransferDataY2 = xVar.y2();
                String str = this.f316195c;
                PushToCardTransferData pushToCardTransferDataA = PushToCardTransferData.a(pushToCardTransferDataY2, 0L, null, null, null, null, str, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
                o oVar = ((j) xVar.t2()).e;
                if (oVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ReferenceData referenceData = oVar.f316183a;
                Intrinsics.checkNotNullParameter(referenceData, "referenceData");
                return j.a(updateState, pushToCardTransferDataA, null, 0, new o(referenceData, str), 13);
        }
    }
}
