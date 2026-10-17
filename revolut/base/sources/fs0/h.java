package fs0;

import android.text.Selection;
import android.text.SpanWatcher;
import android.text.Spannable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements SpanWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f137527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f137528b = new int[2];

    public final void a(Spannable spannable, Object obj2) {
        if (this.f137527a) {
            return;
        }
        if (obj2 == Selection.SELECTION_START || obj2 == Selection.SELECTION_END) {
            int selectionStart = Selection.getSelectionStart(spannable);
            int selectionEnd = Selection.getSelectionEnd(spannable);
            if (selectionStart == -1 || selectionEnd == -1) {
                return;
            }
            if (selectionStart == selectionEnd) {
                int iB = i.b(spannable, selectionStart);
                if (iB != selectionStart) {
                    try {
                        this.f137527a = true;
                        Selection.setSelection(spannable, iB, Math.min(iB + 1, spannable.length()));
                        return;
                    } finally {
                    }
                }
                return;
            }
            int[] iArr = this.f137528b;
            i.c(spannable, selectionStart, selectionEnd, iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            if (i == Math.min(selectionStart, selectionEnd) && i2 == Math.max(selectionStart, selectionEnd)) {
                return;
            }
            try {
                this.f137527a = true;
                Selection.setSelection(spannable, i, i2);
            } finally {
            }
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable text, Object what, int i, int i2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(what, "what");
        if (what == Selection.SELECTION_START) {
            i.a(text);
        }
        a(text, what);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable text, Object what, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(what, "what");
        if (what == Selection.SELECTION_START) {
            i.a(text);
        }
        a(text, what);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable text, Object what, int i, int i2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(what, "what");
    }
}
