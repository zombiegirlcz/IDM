package rwh;

import android.app.Activity;
import c86.f;
import com.revolut.core.extensions.rx.BreadcrumbException;
import e0f.m;
import efm.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ofm.h;
import org.jetbrains.annotations.NotNull;
import rp0.j;
import te0.w;
import wli.x;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends fsi.c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final fsi.b f257955m = new fsi.b("CONTEXTUAL_PROMPT_ACTIVITY_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f257956h;
    public final x i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pwh.b f257957j;
    public final ifm.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f257958l;

    public e(Activity activity, x deeplinkHandler, pwh.b contextualPromptInteractor, ifm.b appCompositeDisposable) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(contextualPromptInteractor, "contextualPromptInteractor");
        Intrinsics.checkNotNullParameter(appCompositeDisposable, "appCompositeDisposable");
        j contextualPromptDialogDisplayer = new j(activity);
        Intrinsics.checkNotNullParameter(contextualPromptDialogDisplayer, "contextualPromptDialogDisplayer");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(contextualPromptInteractor, "contextualPromptInteractor");
        Intrinsics.checkNotNullParameter(appCompositeDisposable, "appCompositeDisposable");
        super(f257955m);
        this.f257956h = contextualPromptDialogDisplayer;
        this.i = deeplinkHandler;
        this.f257957j = contextualPromptInteractor;
        this.k = appCompositeDisposable;
    }

    @Override // fsi.c, fsi.a
    public final void onPause() {
        this.f257958l = false;
        super.onPause();
    }

    @Override // fsi.a
    public final void onResume() {
        this.f257958l = true;
    }

    @Override // fsi.a
    public final void onStart() {
        twh.d dVar = (twh.d) this.f257957j;
        dVar.f275029g.init();
        r rVarDistinctUntilChanged = dVar.f275030h.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        r rVarF = o70.a.f(rVarDistinctUntilChanged);
        a aVar = new a(this, 0);
        Function1 function1M = M();
        Function0 function0L = L();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new m(8, new qza.x(new BreadcrumbException(), 2)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new gn.b(9, aVar), new gn.b(9, function1M), new f(11, function0L));
        ifm.b bVar = this.f137706c;
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        j jVar = this.f257956h;
        efm.b bVarFlatMapCompletable = jVar.f256098c.flatMapCompletable(new pv9.b(new a(this, 1), 18));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1M2 = M();
        m mVar = new m(8, new qza.x(new BreadcrumbException(), 4));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarFlatMapCompletable, mVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        h hVarW = aVar2.w(new gn.b(9, function1M2), new f(11, d.f257954a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
        ihm.f fVar = jVar.d;
        a aVar3 = new a(this, 2);
        Function1 function1M3 = M();
        Function0 function0L2 = L();
        r rVarOnErrorResumeNext2 = fVar.onErrorResumeNext(new m(8, new qza.x(new BreadcrumbException(), 3)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new gn.b(9, aVar3), new gn.b(9, function1M3), new f(11, function0L2));
        w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
    }

    @Override // fsi.c, fsi.a
    public final void onStop() {
        this.f257956h.b(false);
        super.onStop();
    }
}
