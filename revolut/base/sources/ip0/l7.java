package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsInputDelegate;
import com.revolut.core.ui_kit.views.DateInputView;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.uicomponent.products.EditTextDelegate;
import kotlin.Pair;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class l7 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f165136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f165137c;

    public /* synthetic */ l7(Object obj2, Object obj3, int i) {
        this.f165135a = i;
        this.f165136b = obj2;
        this.f165137c = obj3;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f165135a) {
            case 0:
                CellDetailsInputDelegate cellDetailsInputDelegate = (CellDetailsInputDelegate) this.f165136b;
                m7 m7Var = (m7) this.f165137c;
                if (z) {
                    cellDetailsInputDelegate.e.onNext(m7Var);
                }
                break;
            case 1:
                ((DateInputView) this.f165136b).f58501l.onNext(new Pair((InputText) this.f165137c, Boolean.valueOf(z)));
                break;
            default:
                ((EditTextDelegate) this.f165136b).e.onNext(new Pair(((EditTextDelegate.b) this.f165137c).f107169a, Boolean.valueOf(z)));
                break;
        }
    }
}
