package mx0;

import android.text.Editable;
import android.text.TextWatcher;
import com.revolut.core.ui_kit.views.AmountInputView;

/* JADX INFO: loaded from: classes20.dex */
public final class g0 implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AmountInputView f209707b;

    public /* synthetic */ g0(AmountInputView amountInputView, int i) {
        this.f209706a = i;
        this.f209707b = amountInputView;
    }

    private final void a(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void b(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void c(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void d(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void e(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void f(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void g(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void h(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f209706a) {
            case 0:
                AmountInputView.f0(this.f209707b);
                break;
            case 1:
                AmountInputView.f0(this.f209707b);
                break;
            case 2:
                AmountInputView.f0(this.f209707b);
                break;
            default:
                AmountInputView.f0(this.f209707b);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i5 = this.f209706a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i5 = this.f209706a;
    }
}
