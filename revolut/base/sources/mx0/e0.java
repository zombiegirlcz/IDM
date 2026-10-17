package mx0;

import android.text.Editable;
import android.view.View;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.AmountInputView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e0 implements ix0.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.f f209664a = v0.a.d("create(...)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f209665b = v0.a.d("create(...)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f209666c = v0.a.d("create(...)");
    public final /* synthetic */ AmountInputView d;

    public e0(AmountInputView amountInputView) {
        this.d = amountInputView;
    }

    @Override // ix0.m
    public final boolean A() {
        return this.d.o.isFocused();
    }

    @Override // ix0.m
    public final void B(int i) {
        this.d.f58335j.setTextColor(i);
    }

    @Override // ix0.m
    public final efm.r C() {
        String strH = h();
        if (strH == null) {
            strH = "";
        }
        efm.r rVarStartWith = this.f209666c.startWith(strH);
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return rVarStartWith;
    }

    @Override // ix0.m
    public final void D(String str) {
        this.d.f58336l.setText(str);
        if (str == null) {
            str = "";
        }
        this.f209666c.onNext(str);
    }

    @Override // ix0.m
    public final void E(fp0.l runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.d.o.post(runnable);
    }

    @Override // ix0.m
    public final void F(int i) {
        this.d.f58336l.setTextColor(i);
    }

    @Override // ix0.m
    public final void G(boolean z) {
        this.d.f58335j.setVisibility(z ? 0 : 8);
    }

    @Override // ix0.m
    public final void H(yz0.b bVar) {
        this.d.o.setMaskingDelegate(bVar);
    }

    @Override // ix0.m
    public final void a(View.OnFocusChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.d.o.a(listener);
    }

    @Override // ix0.m
    public final efm.r c() {
        String strZ = z();
        if (strZ == null) {
            strZ = "";
        }
        efm.r rVarStartWith = this.f209665b.startWith(strZ);
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return rVarStartWith;
    }

    @Override // ix0.m
    public final void d(int i, int i2) {
        this.d.o.setSelection(i, i2);
    }

    @Override // ix0.m
    public final void e() {
        this.d.k.setText("");
        this.f209665b.onNext("");
    }

    @Override // ix0.m
    public final boolean f() {
        return this.d.k.getVisibility() == 0;
    }

    @Override // ix0.m
    public final void g(String str) {
        this.d.o.setText(str);
    }

    @Override // ix0.m
    public final String getHintText() {
        CharSequence hint = this.d.o.getHint();
        if (hint != null) {
            return hint.toString();
        }
        return null;
    }

    @Override // ix0.m
    public final String h() {
        CharSequence text = this.d.f58336l.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // ix0.m
    public final void j(ix0.l listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.d.o.addTextChangedListener(new ix0.v(listener, 1));
    }

    @Override // ix0.m
    public final void k(int i) {
        this.d.o.setTextColor(i);
    }

    @Override // ix0.m
    public final void l(String str) {
        this.d.f58335j.setText(str);
        if (str == null) {
            str = "";
        }
        this.f209664a.onNext(str);
    }

    @Override // ix0.m
    public final void m(boolean z) {
        this.d.getEditText().setKeyboardSuggestionsAlwaysOn(z);
    }

    @Override // ix0.m
    public final efm.r n() {
        String strW = w();
        if (strW == null) {
            strW = "";
        }
        efm.r rVarStartWith = this.f209664a.startWith(strW);
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return rVarStartWith;
    }

    @Override // ix0.m
    public final ihm.f o() {
        return this.d.o.f59127s;
    }

    @Override // ix0.m
    public final void p(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.d.f58339p.setText(text);
    }

    @Override // ix0.m
    public final void r(TextClause equalsClause, TextClause prefixClause, TextClause formattedResultClause) {
        Intrinsics.checkNotNullParameter(equalsClause, "equalsClause");
        Intrinsics.checkNotNullParameter(prefixClause, "prefixClause");
        Intrinsics.checkNotNullParameter(formattedResultClause, "formattedResultClause");
        AmountInputView amountInputView = this.d;
        ty0.c.b(or0.u.k(amountInputView).b0(), yoj.b.w(yoj.b.w(equalsClause, prefixClause), formattedResultClause), amountInputView.k, null, null, 12);
    }

    @Override // ix0.m
    public final void s(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        AmountInputView amountInputView = this.d;
        ty0.c.b(or0.u.k(amountInputView).b0(), clause, amountInputView.o, null, null, 12);
    }

    @Override // ix0.m
    public final void t(String str) {
        this.d.o.setHint(str);
    }

    @Override // ix0.m
    public final yz0.b u() {
        return this.d.o.getMaskingDelegate();
    }

    @Override // ix0.m
    public final void v(boolean z) {
        this.d.f58336l.setVisibility(z ? 0 : 8);
    }

    @Override // ix0.m
    public final String w() {
        CharSequence text = this.d.f58335j.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // ix0.m
    public final void x(boolean z) {
        this.d.k.setVisibility(z ? 0 : 8);
    }

    @Override // ix0.m
    public final String y() {
        Editable text = this.d.o.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // ix0.m
    public final String z() {
        CharSequence text = this.d.k.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }
}
