package cp0;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import aw0.ha;
import bp0.y;
import com.revolut.core.ui_kit.models.Clause;
import jo0.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ty0.f;
import ty0.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f107755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wy0.a f107756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f107757c;
    public final ex0.c d;
    public Clause e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Function1 f107758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g f107759h;
    public h01.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ifm.c f107760j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ifm.c f107761l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f107762m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ifm.c f107763n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f107764p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f107765q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ha f107766r;

    public b(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f107755a = view;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        wy0.a aVarF = jh.d.f(context);
        this.f107756b = aVarF;
        h.Companion.getClass();
        this.f107757c = h.a.a();
        ty0.c cVarB0 = aVarF.b0();
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.d = ((y) cVarB0).r(context2);
        this.f107759h = f.f275450a;
        this.f107766r = ha.ALLOW;
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.f107765q = true;
        }
    }

    public final SpannableStringBuilder a() {
        this.f107762m = this.f107757c.b();
        Clause clause = this.e;
        if (clause == null) {
            return null;
        }
        ty0.c cVarB0 = this.f107756b.b0();
        Context context = this.f107755a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Function1 function1 = this.f107758g;
        ha haVar = this.f107766r;
        return ty0.c.a(cVarB0, clause, context, function1, !this.f107762m ? ty0.b.DEFAULT : this.f107764p ? ty0.b.FORCE_EVERYTHING : ty0.b.FORCE_LINKS, this.f107759h, haVar, 64);
    }

    public abstract void b(View view, SpannableStringBuilder spannableStringBuilder);

    public final void c() {
        if ((this.o || this.f107764p) && this.f107765q) {
            if (this.f107763n == null) {
                this.f107763n = this.f107757c.a().subscribe(new com.onfido.android.sdk.capture.ui.userconsent.c(new a(this, 0), 10));
            }
        } else {
            ifm.c cVar = this.f107763n;
            if (cVar != null) {
                cVar.dispose();
            }
            this.f107763n = null;
        }
    }

    public final void d(Clause clause, Function1 function1, g handleTypeface) {
        Intrinsics.checkNotNullParameter(handleTypeface, "handleTypeface");
        boolean z = this.f;
        boolean z3 = this.k;
        this.e = clause;
        this.f107758g = function1;
        this.f107759h = handleTypeface;
        wy0.a aVar = this.f107756b;
        if (clause != null) {
            this.f = ((y) aVar.b0()).h(clause);
            this.k = ((y) aVar.b0()).i(clause);
            this.o = ((y) aVar.b0()).t(clause);
        } else {
            this.f = false;
            this.k = false;
            this.o = false;
        }
        this.i = aVar.Z().a();
        f(this.f107755a, a());
        g();
        if (this.f107765q && z != this.f) {
            ifm.c cVar = this.f107760j;
            if (cVar != null) {
                cVar.dispose();
            }
            this.f107760j = this.f ? aVar.Z().c().subscribe(new com.onfido.android.sdk.capture.ui.userconsent.c(new a(this, 2), 12)) : null;
        }
        if (this.f107765q && z3 != this.k) {
            ifm.c cVar2 = this.f107761l;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            this.f107761l = this.k ? this.d.f130332b.subscribe(new com.onfido.android.sdk.capture.ui.userconsent.c(new a(this, 1), 11)) : null;
        }
        c();
    }

    public abstract void e(View view, SpannableStringBuilder spannableStringBuilder);

    public abstract void f(View view, SpannableStringBuilder spannableStringBuilder);

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r12 = this;
            com.revolut.core.ui_kit.models.Clause r0 = r12.e
            android.view.View r1 = r12.f107755a
            if (r0 == 0) goto L2c
            wy0.a r2 = r12.f107756b
            ty0.c r3 = r2.b0()
            bp0.y r3 = (bp0.y) r3
            com.revolut.core.ui_kit.models.Clause r5 = r3.v(r0)
            if (r5 == 0) goto L2c
            ty0.c r4 = r2.b0()
            android.content.Context r6 = r1.getContext()
            java.lang.String r0 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            r10 = 0
            r11 = 252(0xfc, float:3.53E-43)
            r7 = 0
            r8 = 0
            r9 = 0
            android.text.SpannableStringBuilder r0 = ty0.c.a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L2d
        L2c:
            r0 = 0
        L2d:
            r12.e(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cp0.b.g():void");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        if (!this.f107765q) {
            if (this.f) {
                this.f107760j = this.f107756b.Z().c().subscribe(new com.onfido.android.sdk.capture.ui.userconsent.c(new a(this, 2), 12));
            }
            if (this.k) {
                this.f107761l = this.d.f130332b.subscribe(new com.onfido.android.sdk.capture.ui.userconsent.c(new a(this, 1), 11));
            }
        }
        this.f107765q = true;
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f107765q = false;
        ifm.c cVar = this.f107760j;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f107760j = null;
        ifm.c cVar2 = this.f107761l;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.f107761l = null;
        ifm.c cVar3 = this.f107763n;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        this.f107763n = null;
    }
}
