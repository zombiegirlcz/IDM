package fzl;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f139208b;

    public /* synthetic */ d(f fVar, int i) {
        this.f139207a = i;
        this.f139208b = fVar;
    }

    private final void a(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void b(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void c(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void d(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.f139207a;
        f fVar = this.f139208b;
        switch (i) {
            case 0:
                int i2 = f.u0;
                fVar.g();
                if (fVar.V) {
                    fVar.v();
                } else {
                    fVar.setError((CharSequence) null);
                }
                fVar.postInvalidate();
                break;
            default:
                if (fVar.f139230r) {
                    if (editable.length() != 0) {
                        if (!fVar.O) {
                            fVar.O = true;
                            fVar.getLabelAnimator().start();
                        }
                    } else if (fVar.O) {
                        fVar.O = false;
                        fVar.getLabelAnimator().reverse();
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i5 = this.f139207a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i5 = this.f139207a;
    }
}
