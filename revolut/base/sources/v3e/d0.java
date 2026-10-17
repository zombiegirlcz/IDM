package v3e;

import android.view.Window;
import aw0.y9;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.storiesdelegates.BaseStoriesModel;
import com.revolut.feature.stories.StoriesActivity;
import com.revolut.feature.stories.models.ButtonAction;
import com.revolut.feature.stories.models.ButtonStyle;
import com.revolut.feature.stories.models.ColourScheme;
import com.revolut.feature.stories.models.StoriesModel;
import com.revolut.feature.stories.models.StoryPage;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qfm.r0;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class d0 extends pri.b implements c, sri.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f285880h;
    public final f9b.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sri.m f285881j;
    public final b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k f285882l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z3e.c f285883m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final npi.f f285884n;
    public final f80.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set f285885p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tri.c f285886q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s3l.f f285887r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f285888s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkedHashSet f285889t;
    public final LinkedHashSet u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f285890w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f285891x;

    public d0(d state, f9b.f errorView, sri.m navigator, b presentationModel, k storiesMapper, z3e.c storiesInteractor, npi.f dialogView, f80.a uriHelper, ImmutableSet plugins, tri.c backButtonView, s3l.f shotDialogActionDispatcher) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(storiesMapper, "storiesMapper");
        Intrinsics.checkNotNullParameter(storiesInteractor, "storiesInteractor");
        Intrinsics.checkNotNullParameter(dialogView, "dialogView");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(plugins, "plugins");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        Intrinsics.checkNotNullParameter(shotDialogActionDispatcher, "shotDialogActionDispatcher");
        this.f285880h = state;
        this.i = errorView;
        this.f285881j = navigator;
        this.k = presentationModel;
        this.f285882l = storiesMapper;
        this.f285883m = storiesInteractor;
        this.f285884n = dialogView;
        this.o = uriHelper;
        this.f285885p = plugins;
        this.f285886q = backButtonView;
        this.f285887r = shotDialogActionDispatcher;
        this.f285888s = f0.f322471a;
        this.f285889t = new LinkedHashSet();
        this.u = new LinkedHashSet();
        this.f285891x = te0.w.y0(new o(this, 0));
    }

    public final efm.b N(ButtonAction buttonAction) {
        if (this.f285880h.l0().isInitialized()) {
            pfm.h hVar = new pfm.h(new ty7.b(this, 9), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        if (buttonAction instanceof ButtonAction.NavigationCommand) {
            pfm.h hVar2 = new pfm.h(new t(this, buttonAction, 0), 2);
            Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
            return hVar2;
        }
        if (buttonAction instanceof ButtonAction.Deeplink) {
            return this.k.E1(((ButtonAction.Deeplink) buttonAction).getF88752a());
        }
        boolean z = buttonAction instanceof ButtonAction.NoAction;
        pfm.m mVar = pfm.m.f235744a;
        if (z) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    public final StoriesModel O(StoryPage storyPage) {
        for (StoriesModel storiesModel : this.f285888s) {
            ArrayList arrayList = storiesModel.f88786c;
            if (!arrayList.isEmpty()) {
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    if (Intrinsics.f(((StoryPage) it8.next()).getF88840a(), storyPage.getF88840a())) {
                        return storiesModel;
                    }
                }
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final NaviCommand P() {
        StoryPage storyPage;
        ButtonStyle e;
        d dVar = this.f285880h;
        NaviCommand naviCommand = null;
        if (dVar.H().isInitialized()) {
            return com.revolut.retail.core.navigation.a.c(new FinishCommand(-1, null, null, 6), (NaviCommand) dVar.H().get());
        }
        if (dVar.l0().isInitialized()) {
            return com.revolut.retail.core.navigation.a.c(new FinishCommand(-1, null, null, 6), (NaviCommand) dVar.l0().get());
        }
        if (!dVar.S().isInitialized()) {
            return new FinishCommand(-1, null, null, 6);
        }
        FinishCommand finishCommand = new FinishCommand(-1, null, null, 6);
        StoriesModel storiesModel = (StoriesModel) zhm.d0.o0((List) dVar.S().get());
        if (storiesModel != null && (storyPage = (StoryPage) zhm.d0.o0(storiesModel.f88786c)) != null && (e = storyPage.getE()) != null) {
            ButtonAction buttonAction = e.f88756b;
            ButtonAction.NavigationCommand navigationCommand = buttonAction instanceof ButtonAction.NavigationCommand ? (ButtonAction.NavigationCommand) buttonAction : null;
            if (navigationCommand != null) {
                naviCommand = navigationCommand.f88753a;
            }
        }
        return com.revolut.retail.core.navigation.a.c(finishCommand, naviCommand);
    }

    public final void Q(StoryPage storyPage) {
        Iterator it8 = this.f285888s.iterator();
        while (it8.hasNext() && ((StoriesModel) it8.next()).f88786c.indexOf(storyPage) < 0) {
        }
    }

    public final void R(NaviCommand naviCommand) {
        this.f285881j.c(naviCommand);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // sri.l
    public final void c(NaviCommand command) {
        Object next;
        Intrinsics.checkNotNullParameter(command, "command");
        if (this.v) {
            return;
        }
        FinishCommand finishCommand = null;
        if (command instanceof CompositeCommand) {
            Iterator it8 = ((CompositeCommand) command).f98629a.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it8.next();
                    if (((NaviCommand) next) instanceof FinishCommand) {
                        break;
                    }
                }
            }
            if (next instanceof FinishCommand) {
                finishCommand = (FinishCommand) next;
            }
        } else if (command instanceof FinishCommand) {
            finishCommand = (FinishCommand) command;
        }
        if (finishCommand == null) {
            return;
        }
        Integer num = finishCommand.f98642a;
        int iIntValue = num != null ? num.intValue() : 0;
        d4e.b bVar = (d4e.b) this.f285891x.getValue();
        if (this.v || bVar == null) {
            return;
        }
        bVar.D(new d4e.a(iIntValue));
        this.v = true;
    }

    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        h view = (h) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        b bVar = this.k;
        if (bVar instanceof e0m.d) {
            ((e0m.d) bVar).init();
        }
        efm.r rVarX = bVar.W0().x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        efm.r rVarF = o70.a.f(rVarX);
        f9b.f fVar = this.i;
        fVar.getClass();
        boolean z = false;
        efm.r rVarCompose = rVarF.compose(new f9b.e(fVar, z, z));
        Intrinsics.checkNotNullExpressionValue(rVarCompose, "compose(...)");
        bsi.b bVar2 = new bsi.b(this, view, 10);
        n nVar = new n(this, 3);
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarCompose.onErrorResumeNext(new gn.b(11, new qza.x(new BreadcrumbException(), 19)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new bo.e(10, bVar2), new bo.e(10, nVar), new c86.f(13, function0J));
        ifm.b bVar3 = this.f239031a;
        te0.w.j0(bVar3, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        ihm.f fVar2 = this.f285886q.f273801b;
        n nVar2 = new n(this, 4);
        Function1 function1K = K();
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = fVar2.onErrorResumeNext(new gn.b(11, new qza.x(new BreadcrumbException(), 11)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new bo.e(10, nVar2), new bo.e(10, function1K), new c86.f(13, function0J2));
        te0.w.j0(bVar3, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        final StoriesActivity storiesActivity = (StoriesActivity) view;
        efm.r rVarF2 = o70.a.f(storiesActivity.c1());
        final int i = 1;
        Function1 function1 = new Function1(this) { // from class: v3e.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f285912b;

            {
                this.f285912b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                BaseStoriesModel page = (BaseStoriesModel) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(page, "page");
                        Object f55191g = page.getF55191g();
                        Intrinsics.i(f55191g, "null cannot be cast to non-null type com.revolut.feature.stories.models.StoryPage");
                        ColourScheme k = ((StoryPage) f55191g).getK();
                        boolean zF = Intrinsics.f(k, ColourScheme.DarkScheme.f88764l);
                        StoriesActivity storiesActivity2 = storiesActivity;
                        if (zF) {
                            y9 statusBarStyle = y9.LIGHT;
                            Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
                            Window window = storiesActivity2.getWindow();
                            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
                            statusBarStyle.a(window);
                        } else {
                            if (!Intrinsics.f(k, ColourScheme.LightScheme.f88765l)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            y9 statusBarStyle2 = y9.DARK;
                            Intrinsics.checkNotNullParameter(statusBarStyle2, "statusBarStyle");
                            Window window2 = storiesActivity2.getWindow();
                            Intrinsics.checkNotNullExpressionValue(window2, "getWindow(...)");
                            statusBarStyle2.a(window2);
                        }
                        b bVar4 = this.f285912b.k;
                        Object f55191g2 = page.getF55191g();
                        Intrinsics.i(f55191g2, "null cannot be cast to non-null type com.revolut.feature.stories.models.StoryPage");
                        return bVar4.M2((StoryPage) f55191g2);
                    default:
                        Intrinsics.checkNotNullParameter(page, "uikitModel");
                        Object f55191g3 = page.getF55191g();
                        Intrinsics.i(f55191g3, "null cannot be cast to non-null type com.revolut.feature.stories.models.StoryPage");
                        StoryPage storyPage = (StoryPage) f55191g3;
                        d0 d0Var = this.f285912b;
                        Iterator it8 = d0Var.f285888s.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (((StoriesModel) next).f88786c.contains(storyPage)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        StoriesModel storiesModel = (StoriesModel) next;
                        boolean zContains = true;
                        if (storiesModel != null && !storiesModel.f88787g) {
                            zContains = ((List) d0Var.f285880h.Z().get()).contains(storyPage);
                        }
                        storiesActivity.b1().setSkippable(zContains);
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1K2 = K();
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = rVarF2.onErrorResumeNext(new gn.b(11, new qza.x(new BreadcrumbException(), 12)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new bo.e(10, function1), new bo.e(10, function1K2), new c86.f(13, function0J3));
        te0.w.j0(bVar3, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        efm.r rVarNever = efm.r.never();
        Intrinsics.checkNotNullExpressionValue(rVarNever, "never(...)");
        r0 r0VarD = te0.w.D(o70.a.f(rVarNever), new p(storiesActivity, 1));
        Function1 function1K3 = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new gn.b(11, new qza.x(new BreadcrumbException(), 20)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new bo.e(10, function1K3), new c86.f(13, z.f285927a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(bVar3, hVarW);
        efm.r rVarCast = storiesActivity.b1().f59735a.f.cast(qv0.p.class);
        Intrinsics.checkNotNullExpressionValue(rVarCast, "cast(...)");
        r0 r0VarD2 = te0.w.D(rVarCast, new n(this, 5));
        Function1 function1K4 = K();
        pfm.a aVar3 = new pfm.a(r0VarD2, new gn.b(11, new qza.x(new BreadcrumbException(), 21)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new bo.e(10, function1K4), new c86.f(13, a0.f285877a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar3, hVarW2);
        efm.r rVarCast2 = storiesActivity.b1().f59735a.k.cast(qv0.p.class);
        Intrinsics.checkNotNullExpressionValue(rVarCast2, "cast(...)");
        r0 r0VarD3 = te0.w.D(rVarCast2, new n(this, 6));
        Function1 function1K5 = K();
        pfm.a aVar4 = new pfm.a(r0VarD3, new gn.b(11, new qza.x(new BreadcrumbException(), 22)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new bo.e(10, function1K5), new c86.f(13, b0.f285878a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar3, hVarW3);
        efm.r rVarCast3 = storiesActivity.b1().f59735a.f58260g.cast(qv0.p.class);
        Intrinsics.checkNotNullExpressionValue(rVarCast3, "cast(...)");
        r0 r0VarD4 = te0.w.D(rVarCast3, new n(this, 7));
        Function1 function1K6 = K();
        pfm.a aVar5 = new pfm.a(r0VarD4, new gn.b(11, new qza.x(new BreadcrumbException(), 23)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new bo.e(10, function1K6), new c86.f(13, c0.f285879a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        te0.w.j0(bVar3, hVarW4);
        efm.r rVarCast4 = storiesActivity.b1().f59735a.f58261h.cast(qv0.p.class);
        Intrinsics.checkNotNullExpressionValue(rVarCast4, "cast(...)");
        efm.b bVarH = rVarCast4.flatMapCompletable(new s(new n(this, 8), 0)).h(f9b.f.a(fVar));
        Intrinsics.checkNotNullExpressionValue(bVarH, "compose(...)");
        Function1 function1K7 = K();
        pfm.a aVar6 = new pfm.a(bVarH, new gn.b(11, new qza.x(new BreadcrumbException(), 14)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new bo.e(10, function1K7), new c86.f(13, u.f285922a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        te0.w.j0(bVar3, hVarW5);
        d dVar = this.f285880h;
        if (!dVar.x().isInitialized()) {
            dVar.x().set(0);
        }
        efm.k kVarFirstElement = storiesActivity.b1().f.firstElement();
        kVarFirstElement.getClass();
        rfm.s sVar = new rfm.s(kVarFirstElement);
        Intrinsics.checkNotNullExpressionValue(sVar, "ignoreElement(...)");
        efm.b bVarH2 = o70.a.g(sVar).e(bVar.V2()).e(new pfm.h(new af.d(this, 10), 1)).h(f9b.f.a(fVar));
        Intrinsics.checkNotNullExpressionValue(bVarH2, "compose(...)");
        Function1 function1K8 = K();
        pfm.a aVar7 = new pfm.a(bVarH2, new gn.b(11, new qza.x(new BreadcrumbException(), 15)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar7.w(new bo.e(10, function1K8), new c86.f(13, v.f285923a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        te0.w.j0(bVar3, hVarW6);
        efm.r rVarSwitchMap = storiesActivity.c1().switchMap(new pv9.b(new p(storiesActivity, 0), 28));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        pfm.h hVarB = te0.w.b(o70.a.f(rVarSwitchMap), new n(this, 1));
        Function1 function1K9 = K();
        pfm.a aVar8 = new pfm.a(hVarB, new gn.b(11, new qza.x(new BreadcrumbException(), 16)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar8, "onErrorResumeNext(...)");
        ofm.h hVarW7 = aVar8.w(new bo.e(10, function1K9), new c86.f(13, w.f285924a));
        Intrinsics.checkNotNullExpressionValue(hVarW7, "subscribe(...)");
        te0.w.j0(bVar3, hVarW7);
        final int i2 = 0;
        efm.b bVarH3 = te0.w.D(o70.a.f(storiesActivity.c1()), new Function1(this) { // from class: v3e.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f285912b;

            {
                this.f285912b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                BaseStoriesModel page = (BaseStoriesModel) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(page, "page");
                        Object f55191g = page.getF55191g();
                        Intrinsics.i(f55191g, "null cannot be cast to non-null type com.revolut.feature.stories.models.StoryPage");
                        ColourScheme k = ((StoryPage) f55191g).getK();
                        boolean zF = Intrinsics.f(k, ColourScheme.DarkScheme.f88764l);
                        StoriesActivity storiesActivity2 = storiesActivity;
                        if (zF) {
                            y9 statusBarStyle = y9.LIGHT;
                            Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
                            Window window = storiesActivity2.getWindow();
                            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
                            statusBarStyle.a(window);
                        } else {
                            if (!Intrinsics.f(k, ColourScheme.LightScheme.f88765l)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            y9 statusBarStyle2 = y9.DARK;
                            Intrinsics.checkNotNullParameter(statusBarStyle2, "statusBarStyle");
                            Window window2 = storiesActivity2.getWindow();
                            Intrinsics.checkNotNullExpressionValue(window2, "getWindow(...)");
                            statusBarStyle2.a(window2);
                        }
                        b bVar4 = this.f285912b.k;
                        Object f55191g2 = page.getF55191g();
                        Intrinsics.i(f55191g2, "null cannot be cast to non-null type com.revolut.feature.stories.models.StoryPage");
                        return bVar4.M2((StoryPage) f55191g2);
                    default:
                        Intrinsics.checkNotNullParameter(page, "uikitModel");
                        Object f55191g3 = page.getF55191g();
                        Intrinsics.i(f55191g3, "null cannot be cast to non-null type com.revolut.feature.stories.models.StoryPage");
                        StoryPage storyPage = (StoryPage) f55191g3;
                        d0 d0Var = this.f285912b;
                        Iterator it8 = d0Var.f285888s.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (((StoriesModel) next).f88786c.contains(storyPage)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        StoriesModel storiesModel = (StoriesModel) next;
                        boolean zContains = true;
                        if (storiesModel != null && !storiesModel.f88787g) {
                            zContains = ((List) d0Var.f285880h.Z().get()).contains(storyPage);
                        }
                        storiesActivity.b1().setSkippable(zContains);
                        return Unit.f186387a;
                }
            }
        }).h(f9b.f.a(fVar));
        Intrinsics.checkNotNullExpressionValue(bVarH3, "compose(...)");
        Function1 function1K10 = K();
        pfm.a aVar9 = new pfm.a(bVarH3, new gn.b(11, new qza.x(new BreadcrumbException(), 17)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar9, "onErrorResumeNext(...)");
        ofm.h hVarW8 = aVar9.w(new bo.e(10, function1K10), new c86.f(13, x.f285925a));
        Intrinsics.checkNotNullExpressionValue(hVarW8, "subscribe(...)");
        te0.w.j0(bVar3, hVarW8);
        efm.b bVarIgnoreElements = storiesActivity.b1().l().takeUntil(new pv9.b(new qza.q(15), 27)).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        o oVar = new o(this, 1);
        Function1 function1K11 = K();
        gn.b bVar4 = new gn.b(11, new qza.x(new BreadcrumbException(), 13));
        bVarIgnoreElements.getClass();
        pfm.a aVar10 = new pfm.a(bVarIgnoreElements, bVar4, 2);
        Intrinsics.checkNotNullExpressionValue(aVar10, "onErrorResumeNext(...)");
        ofm.h hVarW9 = aVar10.w(new bo.e(10, function1K11), new c86.f(13, oVar));
        Intrinsics.checkNotNullExpressionValue(hVarW9, "subscribe(...)");
        te0.w.j0(bVar3, hVarW9);
        efm.b bVarSwitchMapCompletable = storiesActivity.b1().f59740j.switchMapCompletable(new pv9.b(new n(this, 2), 29));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        Function1 function1K12 = K();
        gn.b bVar5 = new gn.b(11, new qza.x(new BreadcrumbException(), 18));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar11 = new pfm.a(bVarSwitchMapCompletable, bVar5, 2);
        Intrinsics.checkNotNullExpressionValue(aVar11, "onErrorResumeNext(...)");
        ofm.h hVarW10 = aVar11.w(new bo.e(10, function1K12), new c86.f(13, y.f285926a));
        Intrinsics.checkNotNullExpressionValue(hVarW10, "subscribe(...)");
        te0.w.j0(bVar3, hVarW10);
        v60.i pageCompletedSubject = storiesActivity.b1().f59735a.f58262j;
        Intrinsics.checkNotNullExpressionValue(pageCompletedSubject, "pageCompletedSubject");
        n nVar3 = new n(this, 0);
        Function1 function1K13 = K();
        Function0 function0J4 = J();
        efm.r rVarOnErrorResumeNext4 = pageCompletedSubject.onErrorResumeNext(new gn.b(11, new qza.x(new BreadcrumbException(), 24)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new bo.e(10, nVar3), new bo.e(10, function1K13), new c86.f(13, function0J4));
        te0.w.j0(bVar3, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        v60.i iVarC1 = storiesActivity.c1();
        n nVar4 = new n(this, 9);
        Function1 function1K14 = K();
        Function0 function0J5 = J();
        efm.r rVarOnErrorResumeNext5 = iVarC1.onErrorResumeNext(new gn.b(11, new qza.x(new BreadcrumbException(), 25)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext5, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe5 = rVarOnErrorResumeNext5.subscribe(new bo.e(10, nVar4), new bo.e(10, function1K14), new c86.f(13, function0J5));
        te0.w.j0(bVar3, cVarSubscribe5);
        Intrinsics.h(cVarSubscribe5);
        for (d4e.b bVar6 : this.f285885p) {
        }
        boolean zIsInitialized = dVar.s0().isInitialized();
        sri.m mVar = this.f285881j;
        if (zIsInitialized && !this.f285890w) {
            mVar.c((NaviCommand) dVar.s0().get());
            this.f285890w = true;
        }
        if (((d4e.b) this.f285891x.getValue()) != null) {
            mVar.d(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.b, pri.e
    public final void l() {
        if (((d4e.b) this.f285891x.getValue()) != null) {
            this.f285881j.e(this);
        }
        super.l();
    }
}
