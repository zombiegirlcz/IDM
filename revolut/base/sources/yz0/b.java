package yz0;

import android.text.method.KeyListener;
import com.revolut.core.ui_kit.models.Clause;

/* JADX INFO: loaded from: classes20.dex */
public interface b {
    void a();

    default KeyListener b() {
        return null;
    }

    Clause c();

    boolean d();

    String e();

    int f();

    default boolean g() {
        return false;
    }

    void onSelectionChanged(int i);
}
