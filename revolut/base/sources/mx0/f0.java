package mx0;

import android.view.View;
import android.view.ViewTreeObserver;
import com.revolut.core.ui_kit.views.AmountInputView;

/* JADX INFO: loaded from: classes20.dex */
public final class f0 implements ViewTreeObserver.OnWindowFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f209688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AmountInputView f209689b;

    public f0(View view, AmountInputView amountInputView) {
        this.f209688a = view;
        this.f209689b = amountInputView;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            View view = this.f209688a;
            kli.c.d(view, 0L);
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
            this.f209689b.f58345x = null;
        }
    }
}
