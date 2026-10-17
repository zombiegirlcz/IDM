package mx0;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class r0 extends MaskedTextInputEditText {
    public final /* synthetic */ p0 A;
    public final /* synthetic */ p0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(p0 p0Var, Context context) {
        super(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.A = p0Var;
        this.z = p0Var;
    }

    @Override // com.revolut.core.ui_kit.views.input.MaskedTextInputEditText, yz0.a
    public final void a(View.OnFocusChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.z.a(listener);
    }

    @Override // com.revolut.core.ui_kit.views.input.MaskedTextInputEditText, yz0.a
    public final void b(View.OnFocusChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.z.b(listener);
    }

    @Override // android.widget.TextView, yz0.a
    public int getInputType() {
        return this.A.getInputType();
    }

    @Override // android.view.View
    public final boolean hasFocus() {
        return this.A.hasFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.A.isFocused();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        p0 p0Var = this.A;
        if (p0Var.f209898a.isEmpty()) {
            return;
        }
        p0Var.m(m0.FORCED_IMMEDIATE);
    }
}
