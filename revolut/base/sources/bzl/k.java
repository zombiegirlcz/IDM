package bzl;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextWatcher f20067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20068b;

    public k(TextWatcher textWatcher) {
        Intrinsics.checkNotNullParameter(textWatcher, "textWatcher");
        this.f20067a = textWatcher;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.f20068b) {
            return;
        }
        this.f20068b = true;
        this.f20067a.afterTextChanged(editable);
        this.f20068b = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f20068b) {
            return;
        }
        this.f20068b = true;
        this.f20067a.beforeTextChanged(charSequence, i, i2, i3);
        this.f20068b = false;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f20068b) {
            return;
        }
        this.f20068b = true;
        this.f20067a.onTextChanged(charSequence, i, i2, i3);
        this.f20068b = false;
    }
}
