package ns0;

import android.text.ParcelableSpan;
import android.text.TextPaint;
import android.text.style.RelativeSizeSpan;
import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Stack f218727a = new Stack();

    @Override // ns0.t
    public final void a(ParcelableSpan parcelableSpan, TextPaint paint) {
        RelativeSizeSpan spannable = (RelativeSizeSpan) parcelableSpan;
        Intrinsics.checkNotNullParameter(spannable, "spannable");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f218727a.push(Float.valueOf(spannable.getSizeChange()));
        paint.setTextSize(spannable.getSizeChange() * paint.getTextSize());
    }

    @Override // ns0.t
    public final void b(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Stack stack = this.f218727a;
        if (stack.isEmpty()) {
            return;
        }
        Float f = (Float) stack.pop();
        float textSize = paint.getTextSize();
        Intrinsics.h(f);
        paint.setTextSize(textSize / f.floatValue());
    }
}
