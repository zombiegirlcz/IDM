package ju8;

import a08.f0;
import a9j.j;
import ae7.i;
import com.revolut.core.extensions.rx.BreadcrumbException;
import cu8.g1;
import cu8.j1;
import efm.r;
import g2e.t;
import jlh.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.h;
import te0.w;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends nri.a implements mm.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zd7.b f178641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ifm.b f178642c;
    public final g1 d;
    public final mm.d e;
    public final ln.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f80.a f178643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j1 f178644h;

    public d(zd7.b imagePickerBottomDialog, ifm.b compositeDisposable, g1 presentationModel, mm.d actions, ln.a navigationCommandsDispatcher, f80.a uriHelper, j1 state) {
        Intrinsics.checkNotNullParameter(imagePickerBottomDialog, "imagePickerBottomDialog");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f178641b = imagePickerBottomDialog;
        this.f178642c = compositeDisposable;
        this.d = presentationModel;
        this.e = actions;
        this.f = navigationCommandsDispatcher;
        this.f178643g = uriHelper;
        this.f178644h = state;
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        e action = (e) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        h hVar = new h(new i1i.a(this, 7), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return o70.a.d(hVar);
    }

    @Override // nri.a
    public final void i3() {
        r rVarHide = ((i) this.f178641b).f3498l.map(new j(new a9h.b(29), 14)).hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.b bVarSwitchMapCompletable = rVarHide.switchMapCompletable(new ju0.f(1, new g(this, 29)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        t tVar = new t(new j2i.c(new BreadcrumbException(), 6));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar = new pfm.a(bVarSwitchMapCompletable, tVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new f0(21, c.f178640a), b.f178639a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f178642c, hVarW);
    }
}
