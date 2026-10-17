package p1i;

import com.revolut.core.extensions.rx.BreadcrumbException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oma.n;
import org.jetbrains.annotations.NotNull;
import ozc.j0;
import ozc.z;
import pfm.t;
import q06.l;
import rp0.y;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends pri.c implements a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f231939h;
    public final wm.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final rpi.c f231940j;
    public final l k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ln.a f231941l;

    public h(i limitsDialogMapper, wm.e expandableDialogActionDispatcher, rpi.c keyboardView, l deeplinkRouter, ln.a navigationCommandsDispatcher) {
        Intrinsics.checkNotNullParameter(limitsDialogMapper, "limitsDialogMapper");
        Intrinsics.checkNotNullParameter(expandableDialogActionDispatcher, "expandableDialogActionDispatcher");
        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        this.f231939h = limitsDialogMapper;
        this.i = expandableDialogActionDispatcher;
        this.f231940j = keyboardView;
        this.k = deeplinkRouter;
        this.f231941l = navigationCommandsDispatcher;
    }

    public final t N(y yVar) {
        efm.b bVarC0 = this.i.c0(new wm.c(yVar));
        j0 j0Var = new j0(28, new c(this, 4));
        dfm.c cVar = mfm.f.d;
        en.a aVar = mfm.f.f205043c;
        t tVar = new t(bVarC0, j0Var, cVar, aVar, aVar, aVar, aVar);
        Intrinsics.checkNotNullExpressionValue(tVar, "doOnSubscribe(...)");
        return tVar;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        b view = (b) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        efm.b bVarFlatMapCompletable = view.S().flatMapCompletable(new j0(24, new c(this, 0)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1K = K();
        m3l.d dVar = new m3l.d(12, new n(new BreadcrumbException(), 24));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarFlatMapCompletable, dVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new o9h.d(3, function1K), new z(1, e.f231936a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        efm.b bVarFlatMapCompletable2 = view.P1().flatMapSingle(new j0(25, new c(this, 1))).flatMapCompletable(new j0(26, new c(this, 2)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable2, "flatMapCompletable(...)");
        Function1 function1K2 = K();
        m3l.d dVar2 = new m3l.d(12, new n(new BreadcrumbException(), 25));
        bVarFlatMapCompletable2.getClass();
        pfm.a aVar3 = new pfm.a(bVarFlatMapCompletable2, dVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new o9h.d(3, function1K2), new z(1, f.f231937a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        efm.b bVarFlatMapCompletable3 = view.W0().flatMapCompletable(new j0(27, new c(this, 3)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable3, "flatMapCompletable(...)");
        Function1 function1K3 = K();
        m3l.d dVar3 = new m3l.d(12, new n(new BreadcrumbException(), 26));
        bVarFlatMapCompletable3.getClass();
        pfm.a aVar4 = new pfm.a(bVarFlatMapCompletable3, dVar3, 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new o9h.d(3, function1K3), new z(1, g.f231938a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
    }
}
