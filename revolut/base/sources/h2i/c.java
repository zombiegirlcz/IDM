package h2i;

import a08.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import gzg.a0;
import h0l.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ofm.h;
import qfm.r0;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends pri.c implements g2i.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g2i.b f148822h;
    public final opi.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final rpi.c f148823j;

    public c(g2i.b mapper, opi.d expandableDialogView, rpi.c keyboardView) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
        this.f148822h = mapper;
        this.i = expandableDialogView;
        this.f148823j = keyboardView;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        h1i.b view = (h1i.b) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        r rVarFilter = view.S().filter(new g(new a0(17), 3));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        r0 r0VarD = w.D(rVarFilter, new gwe.d(this, 19));
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new f4h.a(new b(new BreadcrumbException(), 0)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        a function = a.f148819a;
        Intrinsics.checkNotNullParameter(function, "function");
        h hVarW = aVar2.w(new s(17, function1K), new a1l.c(6));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f239031a, hVarW);
    }
}
