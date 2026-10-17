package rx0;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.revolut.core.ui_kit.views.input.InputText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f258006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputText f258007b;

    public l(InputText inputText) {
        this.f258007b = inputText;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.f258006a) {
                ViewParent parent = v.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                this.f258006a = false;
            }
            return false;
        }
        if (!InputText.p0(this.f258007b)) {
            this.f258006a = false;
            return false;
        }
        ViewParent parent2 = v.getParent();
        if (parent2 != null) {
            parent2.requestDisallowInterceptTouchEvent(true);
        }
        this.f258006a = true;
        return false;
    }
}
