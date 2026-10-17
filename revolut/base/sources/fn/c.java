package fn;

import a08.f0;
import a08.o0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ofm.h;
import qfm.r0;
import te0.w;
import xpi.g;

/* JADX INFO: loaded from: classes17.dex */
public final class c extends fsi.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f136500h = 0;
    public final om.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f136501j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(tri.c backButtonView, om.c backClickDispatcher) {
        super(new fsi.b("BACK_BUTTON_ACTIVITY_DELEGATE"));
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        Intrinsics.checkNotNullParameter(backClickDispatcher, "backClickDispatcher");
        this.f136501j = backButtonView;
        this.i = backClickDispatcher;
    }

    @Override // fsi.a
    public final void onStart() {
        switch (this.f136500h) {
            case 0:
                r0 r0VarD = w.D(((tri.c) this.f136501j).f273801b, new fjd.w(this, 13));
                Function1 function1M = M();
                pfm.a aVar = new pfm.a(r0VarD, new zjh.c(new fa9.c(new BreadcrumbException(), 3), (byte) 0), 2);
                Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                b function = b.f136499a;
                Intrinsics.checkNotNullParameter(function, "function");
                h hVarW = aVar.w(new f0(12, function1M), new a1l.c(4));
                Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                w.j0(this.f137706c, hVarW);
                break;
            default:
                r0 r0VarD2 = w.D(((xpi.c) ((g) this.f136501j)).Q(), new fjd.w(this, 14));
                Function1 function1M2 = M();
                pfm.a aVar2 = new pfm.a(r0VarD2, new f61.a(new fa9.c(new BreadcrumbException(), 4)), 2);
                Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
                e function2 = e.f136503a;
                Intrinsics.checkNotNullParameter(function2, "function");
                h hVarW2 = aVar2.w(new o0(14, function1M2), new a1l.c(5));
                Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
                w.j0(this.f137706c, hVarW2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g navBar, om.c backClickDispatcher) {
        super(new fsi.b("NAV_BAR_WITH_TOOLBAR_BACK_BUTTON_ACTIVITY_DELEGATE"));
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(backClickDispatcher, "backClickDispatcher");
        this.f136501j = navBar;
        this.i = backClickDispatcher;
    }
}
