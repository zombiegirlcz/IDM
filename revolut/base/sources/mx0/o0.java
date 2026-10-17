package mx0;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o0 implements ix0.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f209866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f209867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f209868c;
    public int d;
    public final ihm.f e;
    public CharSequence f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f209869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f209870h;
    public SpannableStringBuilder i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SpannableStringBuilder f209871j;
    public CharSequence k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f209872l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ihm.f f209873m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f209874n;
    public String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f209875p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ihm.f f209876q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ix0.b f209877r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p0 f209878s;

    public o0(p0 p0Var, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f209878s = p0Var;
        this.f209866a = context;
        this.d = p0Var.getMainEditText$ui_kit_components_release().getCurrentTextColor();
        this.e = v0.a.d("create(...)");
        this.f = "";
        this.f209869g = p0Var.getMainEditText$ui_kit_components_release().getCurrentHintTextColor();
        this.f209872l = p0Var.getMainEditText$ui_kit_components_release().getCurrentTextColor();
        this.f209873m = v0.a.d("create(...)");
        this.f209875p = p0Var.getMainEditText$ui_kit_components_release().getCurrentTextColor();
        this.f209876q = v0.a.d("create(...)");
        this.f209877r = new ix0.b();
    }

    @Override // ix0.m
    public final boolean A() {
        return this.f209878s.isFocused();
    }

    @Override // ix0.m
    public final void B(int i) {
        if (this.d != i) {
            this.d = i;
            p0.n(this.f209878s);
        }
    }

    @Override // ix0.m
    public final efm.r C() {
        String str = this.o;
        if (str == null) {
            str = "";
        }
        efm.r rVarStartWith = this.f209876q.startWith(str);
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return rVarStartWith;
    }

    @Override // ix0.m
    public final void D(String str) {
        if (Intrinsics.f(this.o, str)) {
            return;
        }
        this.o = str;
        if (str == null) {
            str = "";
        }
        this.f209876q.onNext(str);
        p0.n(this.f209878s);
    }

    @Override // ix0.m
    public final void E(fp0.l runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f209878s.post(runnable);
    }

    @Override // ix0.m
    public final void F(int i) {
        if (this.f209875p != i) {
            this.f209875p = i;
            p0.n(this.f209878s);
        }
    }

    @Override // ix0.m
    public final void G(boolean z) {
        if (this.f209867b != z) {
            this.f209867b = z;
            p0.n(this.f209878s);
        }
    }

    @Override // ix0.m
    public final void H(yz0.b bVar) {
        this.f209878s.getMainEditText$ui_kit_components_release().setMaskingDelegate(bVar);
    }

    @Override // ix0.m
    public final void a(View.OnFocusChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f209878s.a(listener);
    }

    @Override // ix0.m
    public final efm.r c() {
        String strZ = z();
        if (strZ == null) {
            strZ = "";
        }
        efm.r rVarStartWith = this.f209873m.startWith(strZ);
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return rVarStartWith;
    }

    @Override // ix0.m
    public final void d(int i, int i2) {
    }

    @Override // ix0.m
    public final void e() {
        if (Intrinsics.f(this.k, "")) {
            return;
        }
        this.k = "";
        this.f209873m.onNext("");
        p0.n(this.f209878s);
    }

    @Override // ix0.m
    public final boolean f() {
        return this.f209870h;
    }

    @Override // ix0.m
    public final void g(String str) {
        p0 p0Var = this.f209878s;
        p0Var.getMainEditText$ui_kit_components_release().setText(str);
        p0.n(p0Var);
    }

    @Override // ix0.m
    public final String getHintText() {
        CharSequence hint = this.f209878s.getMainEditText$ui_kit_components_release().getHint();
        if (hint != null) {
            return hint.toString();
        }
        return null;
    }

    @Override // ix0.m
    public final String h() {
        return this.o;
    }

    @Override // ix0.m
    public final void j(ix0.l listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        p0 p0Var = this.f209878s;
        p0Var.getMainEditText$ui_kit_components_release().addTextChangedListener(new n0(listener, p0Var));
    }

    @Override // ix0.m
    public final void k(int i) {
        p0 p0Var = this.f209878s;
        if (p0Var.getMainEditText$ui_kit_components_release().getCurrentTextColor() != i) {
            p0Var.getMainEditText$ui_kit_components_release().setTextColor(i);
            p0.n(p0Var);
        }
    }

    @Override // ix0.m
    public final void l(String str) {
        if (Intrinsics.f(this.f209868c, str)) {
            return;
        }
        this.f209868c = str;
        if (str == null) {
            str = "";
        }
        this.e.onNext(str);
        p0.n(this.f209878s);
    }

    @Override // ix0.m
    public final void m(boolean z) {
        this.f209878s.getMainEditText$ui_kit_components_release().setKeyboardSuggestionsAlwaysOn(z);
    }

    @Override // ix0.m
    public final efm.r n() {
        String str = this.f209868c;
        if (str == null) {
            str = "";
        }
        efm.r rVarStartWith = this.e.startWith(str);
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return rVarStartWith;
    }

    @Override // ix0.m
    public final ihm.f o() {
        return this.f209878s.getMainEditText$ui_kit_components_release().f59127s;
    }

    @Override // ix0.m
    public final void p(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (Intrinsics.f(this.f, text)) {
            return;
        }
        this.f = text;
        p0.n(this.f209878s);
    }

    @Override // ix0.m
    public final void r(TextClause equalsClause, TextClause prefixClause, TextClause formattedResultClause) {
        Intrinsics.checkNotNullParameter(equalsClause, "equalsClause");
        Intrinsics.checkNotNullParameter(prefixClause, "prefixClause");
        Intrinsics.checkNotNullParameter(formattedResultClause, "formattedResultClause");
        p0 p0Var = this.f209878s;
        ty0.c cVarB0 = or0.u.k(p0Var).b0();
        Context context = this.f209866a;
        SpannableStringBuilder spannableStringBuilderA = ty0.c.a(cVarB0, equalsClause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
        SpannableStringBuilder spannableStringBuilderA2 = ty0.c.a(or0.u.k(p0Var).b0(), prefixClause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
        SpannableStringBuilder spannableStringBuilderA3 = ty0.c.a(or0.u.k(p0Var).b0(), formattedResultClause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
        if (Intrinsics.f(this.i, spannableStringBuilderA) && Intrinsics.f(this.f209871j, spannableStringBuilderA2) && Intrinsics.f(this.k, spannableStringBuilderA3)) {
            return;
        }
        this.i = spannableStringBuilderA;
        this.f209871j = spannableStringBuilderA2;
        this.k = spannableStringBuilderA3;
        p0.n(p0Var);
    }

    @Override // ix0.m
    public final void s(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        p0 p0Var = this.f209878s;
        ty0.c.b(or0.u.k(p0Var).b0(), clause, p0Var.getMainEditText$ui_kit_components_release(), null, null, 12);
        p0.n(p0Var);
    }

    @Override // ix0.m
    public final void t(String str) {
        p0 p0Var = this.f209878s;
        p0Var.getMainEditText$ui_kit_components_release().setHint(str);
        String strY = y();
        if (strY == null || strY.length() == 0) {
            p0.n(p0Var);
        }
    }

    @Override // ix0.m
    public final yz0.b u() {
        return this.f209878s.getMainEditText$ui_kit_components_release().getMaskingDelegate();
    }

    @Override // ix0.m
    public final void v(boolean z) {
        if (this.f209874n != z) {
            this.f209874n = z;
            p0.n(this.f209878s);
        }
    }

    @Override // ix0.m
    public final String w() {
        return this.f209868c;
    }

    @Override // ix0.m
    public final void x(boolean z) {
        if (this.f209870h != z) {
            this.f209870h = z;
            p0.n(this.f209878s);
        }
    }

    @Override // ix0.m
    public final String y() {
        Editable text = this.f209878s.getMainEditText$ui_kit_components_release().getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // ix0.m
    public final String z() {
        CharSequence charSequence = this.k;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
