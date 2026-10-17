package ax;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10814a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f10815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10816c;

    public d(View view, Function0 function0) {
        this.f10816c = view;
        this.f10815b = function0;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f10814a) {
            case 0:
                ((View) this.f10816c).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.f10815b.invoke();
                break;
            default:
                this.f10815b.invoke();
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f10816c;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
        }
    }

    public d(Function0 function0, ViewTreeObserver viewTreeObserver) {
        this.f10815b = function0;
        this.f10816c = viewTreeObserver;
    }
}
