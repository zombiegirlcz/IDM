package ms0;

import android.text.Editable;
import android.text.TextWatcher;
import com.revolut.core.ui_kit.internal.views.TrackableEditText;

/* JADX INFO: loaded from: classes19.dex */
public final class j5 implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackableEditText f208302b;

    public /* synthetic */ j5(TrackableEditText trackableEditText, int i) {
        this.f208301a = i;
        this.f208302b = trackableEditText;
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

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f208301a) {
            case 0:
                TrackableEditText trackableEditText = this.f208302b;
                if (editable != null && editable.length() != 0) {
                    trackableEditText.f56469b = null;
                }
                trackableEditText.f56470c = false;
                break;
            case 1:
                TrackableEditText trackableEditText2 = this.f208302b;
                if (editable != null && editable.length() != 0) {
                    trackableEditText2.f56469b = null;
                }
                trackableEditText2.f56470c = false;
                break;
            default:
                TrackableEditText trackableEditText3 = this.f208302b;
                if (editable != null && editable.length() != 0) {
                    trackableEditText3.f56469b = null;
                }
                trackableEditText3.f56470c = false;
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i5 = this.f208301a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i5 = this.f208301a;
    }
}
