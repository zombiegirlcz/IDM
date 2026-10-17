package au0;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.internal.views.navbar.ImageAutoSizeTextView;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.feature.onboarding.impl.missinginfo.email.SignUpEmailFragment;
import com.revolut.feature.onboarding.impl.missinginfo.inputfield.MissingFieldFragment;
import com.revolut.uicomponent.selectpicture.SelectImageView;
import com.revolut.uicomponent.widgets.material_edit_text.TypefaceMaterialEditText;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes19.dex */
public final class a2 implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9143b;

    public /* synthetic */ a2(Object obj2, int i) {
        this.f9142a = i;
        this.f9143b = obj2;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
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

    private final void i(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void j(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void k(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void l(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void m(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void n(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void o(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void p(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void q(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void r(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void s(CharSequence charSequence, int i, int i2, int i3) {
    }

    private final void t(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s2) {
        boolean z;
        int i = this.f9142a;
        Object obj2 = this.f9143b;
        switch (i) {
            case 0:
                ImageAutoSizeTextView imageAutoSizeTextView = (ImageAutoSizeTextView) obj2;
                imageAutoSizeTextView.e = true;
                imageAutoSizeTextView.requestLayout();
                return;
            case 1:
                SearchView searchView = (SearchView) obj2;
                z = s2 == null || s2.length() == 0;
                SearchView.Companion companion = SearchView.INSTANCE;
                searchView.e(z);
                if (s2 != null) {
                    searchView.f57337m.onNext(s2.toString());
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                ((MissingFieldFragment) obj2).f0.onNext(new Pair(Boolean.TRUE, String.valueOf(s2)));
                return;
            case 4:
                TextWatcher textWatcher = ((TypefaceMaterialEditText) obj2).y0;
                if (textWatcher != null) {
                    textWatcher.afterTextChanged(s2);
                    return;
                }
                return;
            case 5:
                ChatInputView chatInputView = (ChatInputView) obj2;
                int i2 = ChatInputView.I0;
                chatInputView.e0();
                z = s2 == null || s2.length() == 0;
                if (z != chatInputView.f58454h0) {
                    chatInputView.f58454h0 = z;
                    if (!chatInputView.z || chatInputView.isLayoutRequested()) {
                        return;
                    }
                    chatInputView.requestLayout();
                    return;
                }
                return;
            case 6:
                com.revolut.core.ui_kit.views.i iVar = (com.revolut.core.ui_kit.views.i) obj2;
                String newText = String.valueOf(s2);
                Intrinsics.checkNotNullParameter(newText, "newText");
                fr0.i iVar2 = (fr0.i) zhm.d0.o0(iVar.f59070c);
                if (iVar2 instanceof fr0.n) {
                    fr0.n nVar = (fr0.n) iVar2;
                    Intrinsics.checkNotNullParameter(newText, "newText");
                    nVar.F = newText;
                    nVar.o();
                    iVar.g();
                }
                iVar.invalidate();
                return;
            case 7:
                ((jul.o) obj2).u();
                return;
            case 8:
                ((jpc.e) obj2).j0(String.valueOf(s2));
                return;
            case 9:
                qyl.c cVar = (qyl.c) obj2;
                cVar.a(cVar.f250300a.hasFocus());
                return;
            case 10:
                Intrinsics.checkNotNullParameter(s2, "s");
                InputText inputText = (InputText) obj2;
                boolean zIsFocused = inputText.getTextInputEditText().isFocused();
                yz0.b maskingDelegate = inputText.getTextInputEditText().getMaskingDelegate();
                CharSequence charSequence = s2;
                if (maskingDelegate != null) {
                    String strE = maskingDelegate.e();
                    charSequence = s2;
                    if (strE != null) {
                        charSequence = strE;
                    }
                }
                inputText.M0(zIsFocused, charSequence);
                inputText.L0(true, null);
                inputText.Q0();
                return;
            case 11:
                Intrinsics.checkNotNullParameter(s2, "s");
                MaskedTextInputEditText maskedTextInputEditText = (MaskedTextInputEditText) obj2;
                Iterator it8 = maskedTextInputEditText.u.iterator();
                while (it8.hasNext()) {
                    ((TextWatcher) it8.next()).afterTextChanged(s2);
                }
                maskedTextInputEditText.f(s2.toString());
                return;
            case 12:
                String str = "";
                Intrinsics.checkNotNullParameter(s2, "editable");
                uid.h hVar = (uid.h) obj2;
                EditText editText = hVar.f280384a;
                if (hVar.f280386c) {
                    return;
                }
                hVar.f280386c = true;
                try {
                    String string = s2.toString();
                    int selectionEnd = editText.getSelectionEnd();
                    if (selectionEnd < 0) {
                        selectionEnd = 0;
                    }
                    String strReplace = new Regex("\\D").replace(string, "");
                    String strU0 = kotlin.text.f0.U0(Math.min(selectionEnd, string.length()), string);
                    int i3 = 0;
                    for (int i5 = 0; i5 < strU0.length(); i5++) {
                        if (Character.isDigit(strU0.charAt(i5))) {
                            i3++;
                        }
                    }
                    if (strReplace.length() > 0) {
                        Long lN = kotlin.text.z.n(strReplace);
                        str = hVar.d.format(lN != null ? lN.longValue() : 0L);
                        Intrinsics.h(str);
                    }
                    hVar.e = str;
                    if (!string.equals(str)) {
                        s2.replace(0, s2.length(), hVar.e);
                        String str2 = hVar.e;
                        int length = str2.length();
                        int i6 = 0;
                        int i21 = 0;
                        for (int i22 = 0; i22 < length; i22++) {
                            char cCharAt = str2.charAt(i22);
                            if (i6 != i3) {
                                if (Character.isDigit(cCharAt)) {
                                    i6++;
                                }
                                i21++;
                            } else {
                                editText.setSelection(kotlin.ranges.f.g(i21, 0, hVar.e.length()));
                            }
                        }
                        editText.setSelection(kotlin.ranges.f.g(i21, 0, hVar.e.length()));
                    }
                    hVar.f280385b.invoke(hVar.e);
                    hVar.f280386c = false;
                    return;
                } catch (Throwable th10) {
                    hVar.f280386c = false;
                    throw th10;
                }
            case 13:
                return;
            default:
                zp0.y yVar = (zp0.y) obj2;
                EditText editText2 = (EditText) yVar.i.get();
                if (editText2 != null) {
                    editText2.removeTextChangedListener(this);
                    if (s2 != null) {
                        s2.replace(0, s2.length(), yVar.f);
                    }
                    int i32 = yVar.f324154h;
                    int length2 = editText2.length();
                    if (i32 > length2) {
                        i32 = length2;
                    }
                    editText2.setSelection(i32);
                    editText2.addTextChangedListener(this);
                    return;
                }
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s2, int i, int i2, int i3) {
        switch (this.f9142a) {
            case 4:
                TextWatcher textWatcher = ((TypefaceMaterialEditText) this.f9143b).y0;
                if (textWatcher != null) {
                    textWatcher.beforeTextChanged(s2, i, i2, i3);
                }
                break;
            case 10:
            case 12:
                Intrinsics.checkNotNullParameter(s2, "s");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(s2, "s");
                Iterator it8 = ((MaskedTextInputEditText) this.f9143b).u.iterator();
                while (it8.hasNext()) {
                    ((TextWatcher) it8.next()).beforeTextChanged(s2, i, i2, i3);
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s2, int i, int i2, int i3) {
        int i5 = this.f9142a;
        Object obj2 = this.f9143b;
        switch (i5) {
            case 0:
                break;
            case 1:
                SearchView searchView = (SearchView) obj2;
                if (s2 != null && s2.length() != 0) {
                    z = false;
                }
                SearchView.Companion companion = SearchView.INSTANCE;
                searchView.n(z);
                break;
            case 2:
                ea9.e eVar = (ea9.e) ((SignUpEmailFragment) obj2).C();
                if (eVar != null) {
                    String email = s2 != null ? s2.toString() : null;
                    if (email == null) {
                        email = "";
                    }
                    Intrinsics.checkNotNullParameter(email, "email");
                    efm.b bVarB = eVar.i.B(email);
                    Function1 function1K = eVar.K();
                    a08.f0 f0Var = new a08.f0(8, new e05.h(new BreadcrumbException(), 19));
                    bVarB.getClass();
                    pfm.a aVar = new pfm.a(bVarB, f0Var, 2);
                    Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                    ofm.h hVarW = aVar.w(new a08.s(11, function1K), new ea9.c(0, ea9.d.f124159a));
                    Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                    te0.w.j0(eVar.f239031a, hVarW);
                }
                break;
            case 3:
                break;
            case 4:
                TextWatcher textWatcher = ((TypefaceMaterialEditText) obj2).y0;
                if (textWatcher != null) {
                    textWatcher.onTextChanged(s2, i, i2, i3);
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            case 10:
                Intrinsics.checkNotNullParameter(s2, "s");
                InputText inputText = (InputText) obj2;
                Integer num = inputText.C;
                if (num != null) {
                    inputText.setInputLengthError(s2.length() > num.intValue());
                }
                inputText.E0();
                break;
            case 11:
                Intrinsics.checkNotNullParameter(s2, "s");
                MaskedTextInputEditText maskedTextInputEditText = (MaskedTextInputEditText) obj2;
                Iterator it8 = maskedTextInputEditText.u.iterator();
                while (it8.hasNext()) {
                    ((TextWatcher) it8.next()).onTextChanged(s2, i, i2, i3);
                }
                maskedTextInputEditText.f59127s.onNext(s2.toString());
                break;
            case 12:
                Intrinsics.checkNotNullParameter(s2, "s");
                break;
            case 13:
                ((SelectImageView) obj2).getListener();
                break;
            default:
                zp0.y yVar = (zp0.y) obj2;
                Intrinsics.checkNotNullParameter(s2, "text");
                boolean z = i2 > 0 && i3 == 0;
                im.b bVarB2 = yVar.e.b(new jm.a(s2.toString(), z ? i : i3 + i), yVar.f324150a && !z);
                jm.a aVar2 = bVarB2.f162271a;
                String formattedValue = aVar2.f175891b;
                Intrinsics.checkNotNullParameter(formattedValue, "<set-?>");
                yVar.f = formattedValue;
                String extractedValue = bVarB2.f162272b;
                yVar.f324153g = extractedValue;
                if (!z) {
                    i = aVar2.f175890a;
                }
                yVar.f324154h = i;
                ryc.a aVar3 = yVar.f324151b;
                boolean z3 = bVarB2.f162273c;
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                ((zp0.x) aVar3.f258289a).e((String) aVar3.f258290b, extractedValue, formattedValue, z3);
                break;
        }
    }
}
