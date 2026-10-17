package bzl;

import android.text.Editable;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.uicomponent.text.PhoneEditorView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.d0;
import kotlin.text.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends l {
    public boolean d;
    public final /* synthetic */ PhoneEditorView e;

    public h(PhoneEditorView phoneEditorView) {
        this.e = phoneEditorView;
    }

    @Override // android.telephony.PhoneNumberFormattingTextWatcher, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable != null && d0.W(editable)) {
            super.afterTextChanged(editable);
            return;
        }
        PhoneEditorView phoneEditorView = this.e;
        InputText uicEditPhoneNumber = phoneEditorView.getUicEditPhoneNumber();
        uicEditPhoneNumber.setHelperText("");
        uicEditPhoneNumber.setError(false);
        uicEditPhoneNumber.getInnerEditText().removeTextChangedListener(phoneEditorView.f107277b);
        String phoneCode = phoneEditorView.getPhoneCode();
        if (editable != null) {
            editable.insert(0, phoneCode);
        }
        super.afterTextChanged(editable);
        if (editable != null) {
            int iT = d0.T(editable, phoneCode, 0, false, 6);
            Integer numValueOf = Integer.valueOf(iT);
            if (iT < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                editable.replace(numValueOf.intValue(), phoneCode.length(), "");
            }
        }
        while (editable != null) {
            Character chQ0 = f0.Q0(editable);
            if (chQ0 == null || !CharsKt.e(chQ0.charValue())) {
                break;
            } else {
                editable.replace(0, 1, "");
            }
        }
        uicEditPhoneNumber.getInnerEditText().addTextChangedListener(phoneEditorView.f107277b);
    }

    @Override // android.telephony.PhoneNumberFormattingTextWatcher, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.d) {
            return;
        }
        this.d = true;
        PhoneEditorView.Companion companion = PhoneEditorView.INSTANCE;
        this.d = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PhoneEditorView phoneEditorView, String countryCode) {
        super(countryCode);
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.e = phoneEditorView;
    }
}
