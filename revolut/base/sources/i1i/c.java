package i1i;

import a08.f0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import g2e.t;
import hy2.l;
import i0k.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ofm.h;
import opi.d;
import p1i.i;
import qfm.r0;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends pri.c implements h1i.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f157641h;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final rpi.c f157642j;

    public c(i mapper, d expandableDialogView, rpi.c keyboardView) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
        this.f157641h = mapper;
        this.i = expandableDialogView;
        this.f157642j = keyboardView;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        h1i.b view = (h1i.b) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        r rVarFilter = view.S().filter(new l(new f(17), 29));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        r0 r0VarD = w.D(rVarFilter, new hw9.a(this, 25));
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new t(new h2i.b(new BreadcrumbException(), 13)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        b function = b.f157640a;
        Intrinsics.checkNotNullParameter(function, "function");
        h hVarW = aVar2.w(new f0(17, function1K), new a1l.c(7));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f239031a, hVarW);
    }
}
