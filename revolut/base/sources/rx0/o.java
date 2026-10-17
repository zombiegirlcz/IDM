package rx0;

import android.text.Editable;
import android.view.KeyEvent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final class o {
    private o() {
    }

    public static void a(KeyEvent keyEvent, Editable editable, Function0 function0) {
        if (keyEvent == null || keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 67 || editable == null || editable.length() != 0 || function0 == null) {
            return;
        }
        function0.invoke();
    }
}
