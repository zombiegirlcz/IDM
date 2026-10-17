package fzl;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import mx0.p0;
import zp0.x;
import zp0.y;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f139210b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f139209a = i;
        this.f139210b = obj2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        String strValueOf;
        switch (this.f139209a) {
            case 0:
                f fVar = (f) this.f139210b;
                if (fVar.f139230r && fVar.f139232s) {
                    if (z) {
                        fVar.getLabelFocusAnimator().start();
                    } else {
                        fVar.getLabelFocusAnimator().reverse();
                    }
                }
                if (fVar.f0 && !z) {
                    fVar.v();
                }
                View.OnFocusChangeListener onFocusChangeListener = fVar.f139219h;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(view, z);
                    return;
                }
                return;
            case 1:
                p0 p0Var = (p0) this.f139210b;
                kt0.d dVar = p0Var.C;
                if (z) {
                    if (dVar == null) {
                        Intrinsics.r("cursorDrawRunnable");
                        throw null;
                    }
                    dVar.run();
                } else {
                    if (dVar == null) {
                        Intrinsics.r("cursorDrawRunnable");
                        throw null;
                    }
                    p0Var.removeCallbacks(dVar);
                }
                p0Var.invalidate();
                CopyOnWriteArrayList copyOnWriteArrayList = p0Var.E;
                int size = copyOnWriteArrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View.OnFocusChangeListener) copyOnWriteArrayList.get(i)).onFocusChange(view, z);
                }
                return;
            default:
                y yVar = (y) this.f139210b;
                WeakReference weakReference = yVar.i;
                boolean z3 = yVar.f324150a;
                if (z3 && z) {
                    EditText editText = (EditText) weakReference.get();
                    Editable text = editText != null ? editText.getText() : null;
                    Intrinsics.h(text);
                    if (text.length() == 0) {
                        strValueOf = "";
                    } else {
                        EditText editText2 = (EditText) weakReference.get();
                        strValueOf = String.valueOf(editText2 != null ? editText2.getText() : null);
                    }
                    im.b bVarB = yVar.e.b(new jm.a(strValueOf, strValueOf.length()), z3);
                    jm.a aVar = bVarB.f162271a;
                    EditText editText3 = (EditText) weakReference.get();
                    if (editText3 != null) {
                        editText3.setText(aVar.f175891b);
                    }
                    EditText editText4 = (EditText) weakReference.get();
                    if (editText4 != null) {
                        editText4.setSelection(aVar.f175890a);
                    }
                    ryc.a aVar2 = yVar.f324151b;
                    boolean z4 = bVarB.f162273c;
                    String extractedValue = bVarB.f162272b;
                    String formattedValue = yVar.f;
                    Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                    Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                    ((x) aVar2.f258289a).e((String) aVar2.f258290b, extractedValue, formattedValue, z4);
                    return;
                }
                return;
        }
    }
}
