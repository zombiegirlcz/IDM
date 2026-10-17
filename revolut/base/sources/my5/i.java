package my5;

import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ny5.j;
import qfm.r0;
import te0.s;
import te0.w;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends pri.c implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f210348h;
    public final opi.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j f210349j;

    public i(d presentationModel, opi.d bottomDialogView, j sortingPickerDialogMapper) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(bottomDialogView, "bottomDialogView");
        Intrinsics.checkNotNullParameter(sortingPickerDialogMapper, "sortingPickerDialogMapper");
        this.f210348h = presentationModel;
        this.i = bottomDialogView;
        this.f210349j = sortingPickerDialogMapper;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        c view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        r rVarF = o70.a.f(((te0.r) this.f210348h.f210342b.K()).c(s.f270018a));
        e eVar = new e(this, 0);
        Function1 function1K = K();
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new a08.s(26, new ms2.j(new BreadcrumbException(), 4)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new ly7.g(3, eVar), new ly7.g(3, function1K), new j7a.j(11, function0J));
        ifm.b bVar = this.f239031a;
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        r0 r0VarD = w.D(view.U(), new e(this, 1));
        Function1 function1K2 = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new a08.s(26, new ms2.j(new BreadcrumbException(), 6)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new ly7.g(3, function1K2), new j7a.j(11, g.f210346a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
        r0 r0VarD2 = w.D(view.x1(), new e(this, 2));
        Function1 function1K3 = K();
        pfm.a aVar3 = new pfm.a(r0VarD2, new a08.s(26, new ms2.j(new BreadcrumbException(), 5)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new ly7.g(3, function1K3), new j7a.j(11, f.f210345a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        r0 r0VarD3 = w.D(view.Q0(), new e(this, 3));
        Function1 function1K4 = K();
        pfm.a aVar4 = new pfm.a(r0VarD3, new a08.s(26, new ms2.j(new BreadcrumbException(), 7)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new ly7.g(3, function1K4), new j7a.j(11, h.f210347a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
    }
}
