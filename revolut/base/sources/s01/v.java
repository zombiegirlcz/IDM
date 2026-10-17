package s01;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class v implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 2) {
            v.getParent().requestDisallowInterceptTouchEvent(true);
        } else if (event.getAction() == 1 || event.getAction() == 3) {
            v.getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }
}
