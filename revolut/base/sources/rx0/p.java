package rx0;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f258009a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, InputConnection target) {
        super(target, true);
        Intrinsics.checkNotNullParameter(target, "target");
        this.f258009a = qVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        q qVar = this.f258009a;
        Editable text = qVar.getText();
        Function0<Unit> onDeleteKeyPressedWhenEmpty = qVar.getOnDeleteKeyPressedWhenEmpty();
        if (i > 0 && i2 == 0 && text != null && text.length() == 0 && onDeleteKeyPressedWhenEmpty != null) {
            onDeleteKeyPressedWhenEmpty.invoke();
        }
        return super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        q qVar = this.f258009a;
        o.a(event, qVar.getText(), qVar.getOnDeleteKeyPressedWhenEmpty());
        return super.sendKeyEvent(event);
    }
}
