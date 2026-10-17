package yma;

import com.revolut.core.extensions.rx.BreadcrumbException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends o3l.q {
    @Override // o3l.q, pri.a
    /* JADX INFO: renamed from: Q */
    public final void N(o3l.g view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.N(view);
        efm.r rVarF = o70.a.f(this.f221864j.L2());
        yea.l lVar = new yea.l(1, view, o3l.g.class, "setLinkText", "setLinkText(Ljava/lang/CharSequence;)V", 0, 6);
        Function1 function1K = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new tul.b(new xy7.n(new BreadcrumbException(), 21)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new h(0, lVar), new h(0, function1K), new t1i.n(28, function0J));
        te0.w.j0(this.f239031a, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
