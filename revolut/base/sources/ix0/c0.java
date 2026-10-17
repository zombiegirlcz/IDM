package ix0;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends BaseMovementMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f169220a = new c0();

    private c0() {
    }

    public static b0 a(Layout layout, Spannable text, float f, float f4) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(text, "text");
        int lineForVertical = layout.getLineForVertical((int) f4);
        float lineLeft = layout.getLineLeft(lineForVertical);
        if (f > layout.getLineRight(lineForVertical) || lineLeft > f) {
            return null;
        }
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
        Object[] spans = text.getSpans(offsetForHorizontal, offsetForHorizontal, b0.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        return (b0) kotlin.collections.d.P(spans);
    }

    public static boolean b(TextView widget, Spannable buffer, MotionEvent event, boolean z) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        if (action != 0 && action != 1) {
            if (action != 3) {
                return false;
            }
            c(buffer, widget, z);
            return false;
        }
        int x3 = (int) event.getX();
        int y2 = (int) event.getY();
        int totalPaddingLeft = x3 - widget.getTotalPaddingLeft();
        int totalPaddingTop = y2 - widget.getTotalPaddingTop();
        int scrollX = widget.getScrollX() + totalPaddingLeft;
        int scrollY = widget.getScrollY() + totalPaddingTop;
        Layout layout = widget.getLayout();
        Intrinsics.checkNotNullExpressionValue(layout, "getLayout(...)");
        b0 b0VarA = a(layout, buffer, scrollX, scrollY);
        if (b0VarA != null) {
            b0VarA.b(action, widget, buffer, z);
            return true;
        }
        c(buffer, widget, z);
        return false;
    }

    public static final void c(Spannable spannable, TextView textView, boolean z) {
        b0[] b0VarArr = (b0[]) spannable.getSpans(0, spannable.length(), b0.class);
        Intrinsics.h(b0VarArr);
        for (b0 b0Var : b0VarArr) {
            b0Var.b(3, textView, spannable, z);
        }
    }

    @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView widget, Spannable buffer, MotionEvent event) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(event, "event");
        return b(widget, buffer, event, false) || super.onTouchEvent(widget, buffer, event);
    }
}
