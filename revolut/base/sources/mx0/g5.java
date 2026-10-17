package mx0;

import android.text.Editable;
import com.google.android.material.internal.TextWatcherAdapter;
import com.revolut.core.ui_kit.views.DateInputView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g5 extends TextWatcherAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DateInputView f209716a;

    public g5(DateInputView dateInputView) {
        this.f209716a = dateInputView;
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public final void afterTextChanged(Editable s2) {
        Intrinsics.checkNotNullParameter(s2, "s");
        DateInputView.Companion aVar = DateInputView.INSTANCE;
        DateInputView dateInputView = this.f209716a;
        dateInputView.g0();
        dateInputView.m0();
        dateInputView.h0(false);
    }
}
