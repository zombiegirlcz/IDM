package androidx.appcompat.widget;

import android.window.OnBackInvokedCallback;
import androidx.navigationevent.OnBackInvokedInput;
import com.google.android.material.motion.MaterialBackHandler;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class c implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6806b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f6805a = i;
        this.f6806b = obj2;
    }

    public final void onBackInvoked() {
        switch (this.f6805a) {
            case 0:
                ((Runnable) this.f6806b).run();
                break;
            case 1:
                ((MaterialBackHandler) this.f6806b).handleBackInvoked();
                break;
            default:
                ((OnBackInvokedInput) this.f6806b).dispatchOnBackCompleted();
                break;
        }
    }
}
