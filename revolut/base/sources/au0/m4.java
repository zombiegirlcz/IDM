package au0;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.datepicker.DateSelector;
import com.revolut.core.ui_kit.delegates.i7;
import com.revolut.core.ui_kit.internal.views.TrackableEditText;
import com.revolut.core.ui_kit.internal.views.dual_amount.AmountForDualEditView;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.views.AmountInputView;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.uicomponent.text.masked.MaskedEditText;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class m4 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9276b;

    public /* synthetic */ m4(Object obj2, int i) {
        this.f9275a = i;
        this.f9276b = obj2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        xi0.b bVar;
        String strY;
        switch (this.f9275a) {
            case 0:
                SearchView.b((SearchView) this.f9276b, z);
                break;
            case 1:
                DateSelector.lambda$showKeyboardWithAutoHideBehavior$0((EditText[]) this.f9276b, view, z);
                break;
            case 2:
                Iterator it8 = ((MaskedEditText) this.f9276b).B0.iterator();
                while (it8.hasNext()) {
                    ((View.OnFocusChangeListener) it8.next()).onFocusChange(view, z);
                }
                break;
            case 3:
                Iterator it9 = ((gzl.c) this.f9276b).d.iterator();
                while (it9.hasNext()) {
                    ((View.OnFocusChangeListener) it9.next()).onFocusChange(view, z);
                }
                break;
            case 4:
                ((i7) this.f9276b).f54284m.setSelected(z);
                break;
            case 5:
                ix0.t tVar = (ix0.t) this.f9276b;
                ix0.m mVar = tVar.f169296c;
                mVar.E(new fp0.l(tVar, 13));
                if (!z && (bVar = tVar.f169299j) != null && cp5.d.A(bVar) && (strY = mVar.y()) != null && !ix0.t.f(strY, false)) {
                    int iS = kotlin.text.d0.S(strY, tVar.f169298h.d(), 0, 6);
                    int i = 0;
                    for (int length = strY.length() - 1; -1 < length && strY.charAt(length) == '0'; length--) {
                        i++;
                    }
                    if (iS != -1) {
                        if (iS == (strY.length() - 1) - i) {
                            strY = strY.substring(0, iS);
                            Intrinsics.checkNotNullExpressionValue(strY, "substring(...)");
                        } else {
                            strY = a0.d.r(strY, tVar.d(strY));
                        }
                    }
                    mVar.p("");
                    mVar.g(strY);
                    break;
                }
                break;
            case 6:
                AmountForDualEditView amountForDualEditView = (AmountForDualEditView) this.f9276b;
                amountForDualEditView.f56915q.onNext(Boolean.valueOf(z));
                amountForDualEditView.i();
                break;
            case 7:
                TrackableEditText.d((TrackableEditText) this.f9276b, view, z);
                break;
            case 8:
                ((AmountInputView) this.f9276b).f.onNext(Boolean.valueOf(z));
                break;
            case 9:
                ChatInputView chatInputView = (ChatInputView) this.f9276b;
                chatInputView.J.onNext(Boolean.valueOf(z));
                if (!chatInputView.f0) {
                    ChatInputView.setState$default(chatInputView, z ? mx0.e4.TEXT_AND_START_BUTTON_ACTIVATED : mx0.e4.ONLY_TEXT, false, 2, null);
                }
                chatInputView.getInputContainer$ui_kit_components_release().setActivated(z);
                break;
            case 10:
                ((jul.o) this.f9276b).u();
                break;
            case 11:
                ((qyl.c) this.f9276b).a(z);
                break;
            case 12:
                InputText.j0((InputText) this.f9276b, z);
                break;
            default:
                Iterator it10 = ((MaskedTextInputEditText) this.f9276b).f59126r.iterator();
                while (it10.hasNext()) {
                    ((View.OnFocusChangeListener) it10.next()).onFocusChange(view, z);
                }
                break;
        }
    }
}
