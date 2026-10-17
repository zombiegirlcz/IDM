package xo;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mm0.n;
import org.jetbrains.annotations.NotNull;
import rp0.i;
import rp0.j;
import skm.a2;
import skm.e0;
import sri.m;
import te0.w;
import x94.q;
import xng.l;

/* JADX INFO: loaded from: classes.dex */
public final class d extends fsi.c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f307527h;
    public final m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zm0.c f307528j;
    public final j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wsc.a f307529l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bp.a f307530m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a2 f307531n;
    public a2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f307532p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h commandProvider, m navigator, zm0.c sessionProvider, j contextualPromptDialogDisplayer, wsc.a screenshotEventSource, bp.a bugReportPromptFactory) {
        super(f.f307533g);
        Intrinsics.checkNotNullParameter(commandProvider, "commandProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        Intrinsics.checkNotNullParameter(contextualPromptDialogDisplayer, "contextualPromptDialogDisplayer");
        Intrinsics.checkNotNullParameter(screenshotEventSource, "screenshotEventSource");
        Intrinsics.checkNotNullParameter(bugReportPromptFactory, "bugReportPromptFactory");
        f.Companion.getClass();
        this.f307527h = commandProvider;
        this.i = navigator;
        this.f307528j = sessionProvider;
        this.k = contextualPromptDialogDisplayer;
        this.f307529l = screenshotEventSource;
        this.f307530m = bugReportPromptFactory;
    }

    @Override // fsi.a
    public final void onStart() {
        if (((cn0.g) this.f307528j).d() instanceof n) {
            j jVar = this.k;
            ihm.f fVar = jVar.f256098c;
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: xo.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f307525b;

                {
                    this.f307525b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    i it8 = (i) obj2;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            d dVar = this.f307525b;
                            dVar.i.c(new FeatureCommand(dVar.f307527h.b()));
                            a2 a2Var = dVar.o;
                            if (a2Var != null) {
                                e0.l(a2Var, "Dismissed manually", null);
                            }
                            dVar.o = null;
                            dVar.k.b(true);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            d dVar2 = this.f307525b;
                            dVar2.f307532p = true;
                            e0.C(dVar2, null, null, new hd2.b(8), 3).k(new l(dVar2, 3));
                            a2 a2Var2 = dVar2.o;
                            if (a2Var2 != null) {
                                e0.l(a2Var2, "Dismissed manually", null);
                            }
                            dVar2.o = null;
                            dVar2.k.b(true);
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Function1 function1M = M();
            Function0 function0L = L();
            r rVarOnErrorResumeNext = fVar.onErrorResumeNext(new nw8.d(24, new q(new BreadcrumbException(), 23)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
            ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new ly7.g(29, function1), new ly7.g(29, function1M), new t1i.n(22, function0L));
            ifm.b bVar = this.f137706c;
            w.j0(bVar, cVarSubscribe);
            Intrinsics.h(cVarSubscribe);
            ihm.f fVar2 = jVar.d;
            final int i2 = 1;
            Function1 function12 = new Function1(this) { // from class: xo.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f307525b;

                {
                    this.f307525b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    i it8 = (i) obj2;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            d dVar = this.f307525b;
                            dVar.i.c(new FeatureCommand(dVar.f307527h.b()));
                            a2 a2Var = dVar.o;
                            if (a2Var != null) {
                                e0.l(a2Var, "Dismissed manually", null);
                            }
                            dVar.o = null;
                            dVar.k.b(true);
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            d dVar2 = this.f307525b;
                            dVar2.f307532p = true;
                            e0.C(dVar2, null, null, new hd2.b(8), 3).k(new l(dVar2, 3));
                            a2 a2Var2 = dVar2.o;
                            if (a2Var2 != null) {
                                e0.l(a2Var2, "Dismissed manually", null);
                            }
                            dVar2.o = null;
                            dVar2.k.b(true);
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Function1 function1M2 = M();
            Function0 function0L2 = L();
            r rVarOnErrorResumeNext2 = fVar2.onErrorResumeNext(new nw8.d(24, new q(new BreadcrumbException(), 24)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
            ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new ly7.g(29, function12), new ly7.g(29, function1M2), new t1i.n(22, function0L2));
            w.j0(bVar, cVarSubscribe2);
            Intrinsics.h(cVarSubscribe2);
            this.f307531n = e0.C(this, null, null, new c(this, null, 0), 3);
        }
    }

    @Override // fsi.c, fsi.a
    public final void onStop() {
        super.onStop();
        a2 a2Var = this.f307531n;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f307531n = null;
    }
}
