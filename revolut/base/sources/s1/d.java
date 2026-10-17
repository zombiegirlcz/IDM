package s1;

import android.os.CancellationSignal;
import androidx.compose.foundation.text.input.internal.HandwritingGestureApi34;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import skm.a2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f259037b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f259036a = i;
        this.f259037b = obj2;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f259036a) {
            case 0:
                HandwritingGestureApi34.previewHandwritingGesture$lambda$1((TextFieldSelectionManager) this.f259037b);
                break;
            default:
                ((a2) this.f259037b).f(null);
                break;
        }
    }
}
