package buf;

import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferRecipient;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ManualTransferRecipient f18795b;

    public /* synthetic */ d0(ManualTransferRecipient manualTransferRecipient, int i) {
        this.f18794a = i;
        this.f18795b = manualTransferRecipient;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f18794a) {
            case 0:
                return c.a((c) obj2, null, null, null, null, null, this.f18795b, false, 95);
            default:
                return iuf.l.a((iuf.l) obj2, this.f18795b, null, null, null, null, null, 126);
        }
    }
}
