package qce;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class r implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f244761b;

    public /* synthetic */ r(o0 o0Var, int i) {
        this.f244760a = i;
        this.f244761b = o0Var;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f244760a) {
            case 0:
                com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, this.f244761b.f244746m);
                break;
            case 1:
                o0 o0Var = this.f244761b;
                k3l.b bVar = o0Var.f244745l;
                ((h) o0Var.f244751s).getClass();
                ((k3l.d) bVar).O(new StatusViewConfiguration.Success("BUTTON_CANCEL_CONFIRMATION_DIALOG_ID", new TextLocalisedClause(R$string.recurring_payment_details_action_cancel_direct_debit_success, null, null, 14), null, null, null, 2044));
                break;
            case 2:
                com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, this.f244761b.f244746m);
                break;
            case 3:
                com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, this.f244761b.f244746m);
                break;
            default:
                com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, this.f244761b.f244746m);
                break;
        }
    }
}
