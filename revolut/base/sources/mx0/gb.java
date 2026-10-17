package mx0;

import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import com.revolut.core.ui_kit.views.PhoneInputTextView;
import com.revolut.core.ui_kit.views.input.InputText;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes20.dex */
public final class gb extends PhoneNumberFormattingTextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f209721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f209722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PhoneInputTextView f209723c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(PhoneInputTextView phoneInputTextView, String countryCode) {
        super(countryCode);
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f209723c = phoneInputTextView;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f209721a = yhm.j.b(new mw1.a(9));
        this.f209722b = yhm.j.b(new mw1.a(10));
    }

    @Override // android.telephony.PhoneNumberFormattingTextWatcher, android.text.TextWatcher
    public final void afterTextChanged(Editable s2) {
        Intrinsics.checkNotNullParameter(s2, "s");
        boolean zW = kotlin.text.d0.W(s2);
        PhoneInputTextView phoneInputTextView = this.f209723c;
        if (zW) {
            super.afterTextChanged(s2);
        } else {
            InputText phoneNumberInput = phoneInputTextView.getPhoneNumberInput();
            phoneNumberInput.setError(false);
            phoneNumberInput.A0(phoneInputTextView.f58822a);
            String strValueOf = String.valueOf(phoneInputTextView.getCountryCodeInput().getText());
            if (kotlin.text.d0.p0(s2, strValueOf, false)) {
                super.afterTextChanged(s2);
            } else {
                s2.insert(0, strValueOf);
                super.afterTextChanged(s2);
                int selectionStart = phoneInputTextView.getPhoneNumberInput().getSelectionStart();
                int length = kotlin.text.d0.p0(s2, strValueOf, false) ? strValueOf.length() : 0;
                int length2 = s2.length();
                int i = length;
                while (length < length2 && CharsKt.e(s2.charAt(length))) {
                    i++;
                    length++;
                }
                s2.replace(0, s2.length(), s2.subSequence(i, s2.length()));
                int i2 = selectionStart - i;
                phoneNumberInput.getInnerEditText().setSelection(i2 >= 0 ? i2 : 0);
            }
            phoneNumberInput.r0(phoneInputTextView.f58822a);
        }
        phoneInputTextView.d.onNext(s2.toString());
    }
}
