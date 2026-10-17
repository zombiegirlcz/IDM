package zp0;

import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements KeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DigitsKeyListener f324097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f324098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char f324099c;
    public final String d;

    public a(String currencySymbol, char c2, char c3) {
        Intrinsics.checkNotNullParameter(currencySymbol, "currencySymbol");
        this.f324097a = DigitsKeyListener.getInstance("1234567890" + c2 + c3 + currencySymbol + ".,");
        this.f324098b = c2;
        this.f324099c = c3;
        this.d = currencySymbol;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f324097a.clearMetaKeyState(view, editable, i);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f324098b == aVar.f324098b && this.f324099c == aVar.f324099c && Intrinsics.f(this.d, aVar.d);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return 8194;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((Character.hashCode(this.f324099c) + (Character.hashCode(this.f324098b) * 31)) * 31);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f324097a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f324097a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f324097a.onKeyUp(view, editable, i, keyEvent);
    }
}
