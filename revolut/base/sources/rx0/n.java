package rx0;

import android.view.inputmethod.InputConnectionWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends InputConnectionWrapper {
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence text, int i) {
        Intrinsics.checkNotNullParameter(text, "text");
        finishComposingText();
        return super.commitText(text, i);
    }
}
