package bzl;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a implements TextWatcher {
    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s2) {
        Intrinsics.checkNotNullParameter(s2, "s");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(s2, "s");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(s2, "s");
    }
}
