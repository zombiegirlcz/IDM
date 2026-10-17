package nx0;

import android.view.View;
import bw0.m;
import bw0.n;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import efm.r;
import ip0.l0;

/* JADX INFO: loaded from: classes20.dex */
public interface a {
    View F();

    r I();

    default void M() {
    }

    ihm.f g();

    MaskedTextInputEditText getEditText();

    r k();

    r s();

    void setAmountInput(bw0.h hVar);

    void setAmountType(Clause clause);

    void setAmountTypeE2ECustomId(String str);

    void setAmountTypeImage(Image image);

    void setChevron(e eVar);

    void setHint(m mVar, n nVar);

    void setInputPosition(l0 l0Var);

    void setMaskingDelegate(yz0.b bVar);

    void setSuggestionsSourceId(String str);

    void setSwitcher(g gVar);

    default void u(int i) {
    }
}
