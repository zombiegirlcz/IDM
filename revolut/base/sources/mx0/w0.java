package mx0;

import android.os.SystemClock;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes20.dex */
public final class w0 extends BaseInputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f210062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f210063b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(p0 p0Var) {
        super(p0Var, false);
        this.f210063b = p0Var;
        this.f210062a = -1;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        if (i != 1 || i2 != 0) {
            return super.deleteSurroundingText(i, i2);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        super.sendKeyEvent(new KeyEvent(jUptimeMillis, jUptimeMillis, 0, 67, 0, 0, -1, 0, 6));
        super.sendKeyEvent(new KeyEvent(SystemClock.uptimeMillis(), jUptimeMillis, 1, 67, 0, 0, -1, 0, 6));
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        p0 p0Var = this.f210063b;
        rx0.o.a(keyEvent, p0Var.getMainEditText$ui_kit_components_release().getText(), p0Var.getMainEditText$ui_kit_components_release().getOnDeleteKeyPressedWhenEmpty());
        return super.sendKeyEvent(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        p0 p0Var = this.f210063b;
        InputMethodManager inputMethodManager = (InputMethodManager) p0Var.getContext().getSystemService(InputMethodManager.class);
        Editable text = p0Var.getMainEditText$ui_kit_components_release().getText();
        int length = text != null ? text.length() : 0;
        int i2 = length + 1;
        if (i2 == this.f210062a) {
            i2 = length + 2;
        }
        int i3 = i2;
        this.f210062a = i3;
        inputMethodManager.updateSelection(this.f210063b, i3, i3, -1, -1);
        return super.setComposingText(charSequence, i);
    }
}
