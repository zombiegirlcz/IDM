package qyl;

import android.text.Editable;
import android.text.TextWatcher;
import com.revolut.uicomponent.card.ExternalCardView;
import com.revolut.uicomponent.widgets.support_edit_text.MultipleDrawableMaterialEditText;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zsc.p;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExternalCardView f250308b;

    public /* synthetic */ g(ExternalCardView externalCardView, int i) {
        this.f250307a = i;
        this.f250308b = externalCardView;
    }

    private final void a(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void b(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void c(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable currentValueEditable) {
        switch (this.f250307a) {
            case 0:
                ExternalCardView externalCardView = this.f250308b;
                externalCardView.e(externalCardView.getCardNumberText().hasFocus(), currentValueEditable);
                break;
            default:
                if (currentValueEditable != null) {
                    ExternalCardView externalCardView2 = this.f250308b;
                    bzl.e eVar = externalCardView2.J;
                    MultipleDrawableMaterialEditText editText = externalCardView2.getCardNumberText();
                    Intrinsics.checkNotNullExpressionValue(editText, "access$getCardNumberText(...)");
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(editText, "editText");
                    Intrinsics.checkNotNullParameter(currentValueEditable, "currentValueEditable");
                    boolean z = false;
                    int selectionEnd = editText != null ? editText.getSelectionEnd() : 0;
                    String inputValue = currentValueEditable.toString();
                    Intrinsics.checkNotNullParameter(inputValue, "inputValue");
                    if (eVar.f20059a > 0 && eVar.f20060b == 0) {
                        z = true;
                    }
                    bzl.f fVarA = eVar.a(selectionEnd, inputValue);
                    String str = fVarA.f20061a;
                    int i = fVarA.f20062b;
                    int i2 = i / 4;
                    if (z && (selectionEnd - 4) % 5 == 0) {
                        String value = d0.f0(str, i - eVar.f20059a, i).toString();
                        int i3 = (i - eVar.f20059a) - 1;
                        Intrinsics.checkNotNullParameter(value, "value");
                        fVarA = new bzl.f(value, i3);
                    }
                    String str2 = fVarA.f20061a;
                    StringBuilder sb6 = new StringBuilder();
                    int i5 = 4;
                    while (i5 <= str2.length()) {
                        String strSubstring = str2.substring(i5 - 4, i5);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        sb6.append(strSubstring);
                        sb6.append(p.SPACE_CHAR);
                        i5 += 4;
                    }
                    String strSubstring2 = str2.substring(i5 - 4, str2.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    sb6.append(strSubstring2);
                    String value2 = sb6.toString();
                    Intrinsics.checkNotNullExpressionValue(value2, "toString(...)");
                    int i6 = fVarA.f20062b + i2;
                    Intrinsics.checkNotNullParameter(value2, "value");
                    if (!Intrinsics.f(value2, inputValue)) {
                        editText.setText(value2);
                        if (i6 != editText.getSelectionEnd() && i6 > 0 && i6 <= editText.getText().length()) {
                            editText.setSelection(i6, i6);
                        }
                    }
                    String cardNumber = eVar.a(selectionEnd, value2).f20061a;
                    externalCardView2.getBrandIconCallback();
                    i listener = externalCardView2.getListener();
                    if (listener != null) {
                        com.revolut.uicomponent.products.d dVar = (com.revolut.uicomponent.products.d) listener;
                        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
                        ((ihm.f) dVar.f107223a.f107175c.getValue()).onNext(new Pair(dVar.f107224b.f107182a, cardNumber));
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i5 = this.f250307a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.f250307a) {
            case 0:
                break;
            default:
                bzl.e eVar = this.f250308b.J;
                eVar.f20059a = i2;
                eVar.f20060b = i3;
                break;
        }
    }
}
