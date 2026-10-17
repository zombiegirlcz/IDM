package ajd;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f5536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rect f5537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5538c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;

    public b(View view, Rect rect, int i, int i2, Function0 function0) {
        this.f5536a = view;
        this.f5537b = rect;
        this.f5538c = i;
        this.d = i2;
        this.e = function0;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.f5536a;
        Rect rect = this.f5537b;
        view.getWindowVisibleDisplayFrame(rect);
        if (this.f5538c - rect.bottom <= this.d + 50) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.e.invoke();
        }
    }
}
