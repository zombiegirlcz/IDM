package i8d;

import com.revolut.feature.shared.help_centre.impl.faq.screens.feedback.EditFaqFeedbackScreenContract$InputData;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import te0.w;
import yji.l;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final EditFaqFeedbackScreenContract$InputData f159506p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hg0.b f159507q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cji.d f159508r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cji.d f159509s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final cji.d f159510t;
    public final a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p stateMapper, EditFaqFeedbackScreenContract$InputData inputData, hg0.b faqInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(faqInteractor, "faqInteractor");
        this.f159506p = inputData;
        this.f159507q = faqInteractor;
        f0 f0Var = f0.f322471a;
        this.f159508r = new cji.d(f0Var);
        h0 h0Var = h0.f322473a;
        this.f159509s = new cji.d(h0Var);
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        this.f159510t = new cji.d("");
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        this.u = new a("", f0Var, h0Var);
    }

    @Override // yji.l
    public final void I1() {
        l2(new d(this, null, 0), new yi5.b(26));
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.a1(this, rd0.e.b(w.m(this.f159508r.c(), this.f159509s.c(), this.f159510t.c())), null, null, new i13.d(this, (Continuation) null, 26), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }
}
