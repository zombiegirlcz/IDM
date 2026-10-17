package vy7;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import kotlin.jvm.internal.Intrinsics;
import te0.s;
import vx5.r;
import vx9.w;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f293256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ln.a f293257b;

    public m(ifm.b flowDisposable, g presentationModel, ln.a navigationCommandsDispatcher, kz7.b petNotificationNavigationCommandProvider) {
        Intrinsics.checkNotNullParameter(flowDisposable, "flowDisposable");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(petNotificationNavigationCommandProvider, "petNotificationNavigationCommandProvider");
        this.f293256a = presentationModel;
        this.f293257b = navigationCommandsDispatcher;
        efm.b bVarFlatMapCompletable = ((n) presentationModel.e).x0().c(s.f270018a).flatMapCompletable(new w(new vx9.b(this, 12), 23));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        tul.b bVar = new tul.b(new r(new BreadcrumbException(), 9));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar = new pfm.a(bVarFlatMapCompletable, bVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new n1i.b(24, l.f293255a), k.f293254a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(flowDisposable, hVarW);
    }

    public final efm.b a() {
        nx7.g.Companion.getClass();
        return this.f293257b.a(new ActivityNavigateCommand(nx7.a.f220445b, null, null, null, 0, null, null, null, null, false, 1022));
    }
}
