package ns0;

import android.text.ParcelableSpan;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Stack f218723a = new Stack();

    @Override // ns0.t
    public final void a(ParcelableSpan parcelableSpan, TextPaint paint) {
        ForegroundColorSpan spannable = (ForegroundColorSpan) parcelableSpan;
        Intrinsics.checkNotNullParameter(spannable, "spannable");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f218723a.push(Integer.valueOf(paint.getColor()));
        paint.setColor(spannable.getForegroundColor());
    }

    @Override // ns0.t
    public final void b(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Stack stack = this.f218723a;
        if (stack.isEmpty()) {
            return;
        }
        Object objPop = stack.pop();
        Intrinsics.checkNotNullExpressionValue(objPop, "pop(...)");
        paint.setColor(((Number) objPop).intValue());
    }
}
