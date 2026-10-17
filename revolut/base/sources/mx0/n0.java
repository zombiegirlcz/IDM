package mx0;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n0 implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ix0.l f209846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f209847b;

    public n0(ix0.l lVar, p0 p0Var) {
        this.f209846a = lVar;
        this.f209847b = p0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s2) {
        Intrinsics.checkNotNullParameter(s2, "s");
        this.f209846a.invoke(s2.toString());
        p0.n(this.f209847b);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
