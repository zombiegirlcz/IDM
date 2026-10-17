package fs0;

import android.text.Spannable;
import android.text.method.ArrowKeyMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import ix0.c0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends ArrowKeyMovementMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f137525a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f137526b = new h();

    private g() {
    }

    @Override // android.text.method.ArrowKeyMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView widget, Spannable buffer, MotionEvent event) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(event, "event");
        h hVar = f137526b;
        if (buffer.getSpanStart(hVar) == -1) {
            buffer.setSpan(hVar, 0, buffer.length(), 18);
        }
        if (widget.hasSelection()) {
            return super.onTouchEvent(widget, buffer, event);
        }
        c0.f169220a.getClass();
        return c0.b(widget, buffer, event, true) || super.onTouchEvent(widget, buffer, event);
    }
}
