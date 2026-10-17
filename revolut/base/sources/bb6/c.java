package bb6;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ViewTreeObserver.OnWindowFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f14172a;

    public c(View view) {
        this.f14172a = view;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            View view = this.f14172a;
            if (view.isFocused()) {
                view.post(new b(view, 0));
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
    }
}
