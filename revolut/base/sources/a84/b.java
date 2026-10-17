package a84;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import hs3.q1;

/* JADX INFO: loaded from: classes22.dex */
public interface b {
    TwinVerticalButton E();

    default q1 O0() {
        return q1.SCROLL_TO_END;
    }

    void f1();

    RecyclerView h();

    default boolean i() {
        return true;
    }

    void o1();
}
