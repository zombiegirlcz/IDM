package bzl;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.views.PhoneInputTextView;
import com.revolut.uicomponent.text.PhoneEditorView;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlin.text.f0;
import kotlin.text.z;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f20066b;

    public /* synthetic */ j(FrameLayout frameLayout, int i) {
        this.f20065a = i;
        this.f20066b = frameLayout;
    }

    public final CharSequence a(Spanned spanned, int i, int i2) {
        switch (this.f20065a) {
            case 0:
                PhoneEditorView phoneEditorView = (PhoneEditorView) this.f20066b;
                CharSequence charSequenceT0 = f0.T0(spanned, kotlin.ranges.f.o(i, i2));
                if (!d0.W(charSequenceT0)) {
                    return charSequenceT0;
                }
                String country = Locale.getDefault().getCountry();
                String str = "+" + phoneEditorView.getPhoneNumberUtil().f(country);
                phoneEditorView.setCode(str, country);
                return str;
            default:
                CharSequence charSequenceT02 = f0.T0(spanned, kotlin.ranges.f.o(i, i2));
                PhoneInputTextView phoneInputTextView = (PhoneInputTextView) this.f20066b;
                if (!d0.W(charSequenceT02)) {
                    return charSequenceT02;
                }
                return a0.d.n("+", phoneInputTextView.getPhoneNumberUtil().f(Locale.getDefault().getCountry()));
        }
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence source, int i, int i2, Spanned dest, int i3, int i5) {
        int iIntValue;
        String strL;
        int iIntValue2;
        String strL2;
        switch (this.f20065a) {
            case 0:
                PhoneEditorView phoneEditorView = (PhoneEditorView) this.f20066b;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(dest, "dest");
                StringBuilder sbJ0 = d0.j0(dest, i3, i5, source);
                if (!d0.p0(sbJ0, "+", false)) {
                    Integer numM = z.m(sbJ0.toString());
                    if (numM != null && (strL = phoneEditorView.getPhoneNumberUtil().l((iIntValue = numM.intValue()))) != null) {
                        String str = "+" + iIntValue;
                        phoneEditorView.setCode(str, strL);
                    }
                    break;
                }
                break;
            default:
                PhoneInputTextView phoneInputTextView = (PhoneInputTextView) this.f20066b;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(dest, "dest");
                StringBuilder sbJ02 = d0.j0(dest, i3, i5, source);
                if (!d0.p0(sbJ02, "+", false)) {
                    Integer numM2 = z.m(sbJ02.toString());
                    if (numM2 != null && (strL2 = phoneInputTextView.getPhoneNumberUtil().l((iIntValue2 = numM2.intValue()))) != null) {
                        String strN = a0.d.n("+", iIntValue2);
                        wi0.b.Companion.getClass();
                        phoneInputTextView.setPhoneCountryCode(strN, wi0.a.a(strL2));
                        ihm.f fVar = phoneInputTextView.f58824c;
                        CharSequence text = phoneInputTextView.getCountryCodeInput().getText();
                        if (text == null) {
                            text = "";
                        }
                        fVar.onNext(text);
                        ihm.f fVar2 = phoneInputTextView.d;
                        CharSequence text2 = phoneInputTextView.getPhoneNumberInput().getText();
                        fVar2.onNext(text2 != null ? text2 : "");
                    }
                    break;
                }
                break;
        }
        return a(dest, i3, i5);
    }
}
