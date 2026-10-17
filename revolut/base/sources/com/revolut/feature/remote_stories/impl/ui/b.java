package com.revolut.feature.remote_stories.impl.ui;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config;
import com.revolut.feature.stories.models.StoriesModel;
import com.revolut.feature.stories.models.StoryPage;
import com.revolut.retail.core.navigation.NaviCommand;
import e0f.m;
import efm.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ofm.h;
import qm.e;
import qza.b0;
import qza.c;
import qza.d;
import qza.g;
import qza.p;
import qza.q;
import qza.r;
import qza.s;
import qza.t;
import te0.w;
import ufm.i;
import wli.x;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends ori.a implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ifm.b f81987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f81988c;
    public final x d;
    public final c e;
    public final kza.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.b f81989g;

    public b(ifm.b flowDisposable, g state, x deeplinkHandler, c loadStoriesActionHandler, kza.a remoteStoriesInteractor) {
        Intrinsics.checkNotNullParameter(flowDisposable, "flowDisposable");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(loadStoriesActionHandler, "loadStoriesActionHandler");
        Intrinsics.checkNotNullParameter(remoteStoriesInteractor, "remoteStoriesInteractor");
        this.f81987b = flowDisposable;
        this.f81988c = state;
        this.d = deeplinkHandler;
        this.e = loadStoriesActionHandler;
        this.f = remoteStoriesInteractor;
        this.f81989g = j6.a.h("create(...)");
    }

    @Override // v3e.b
    public final efm.b I2(StoryPage storyPage, StoriesModel story) {
        Intrinsics.checkNotNullParameter(storyPage, "storyPage");
        Intrinsics.checkNotNullParameter(story, "story");
        d0 d0VarC = w.C(((b0) this.f81988c).y0());
        qza.a aVar = new qza.a(5, new r(storyPage, this, 0));
        d0VarC.getClass();
        pfm.a aVar2 = new pfm.a(d0VarC, aVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        return aVar2;
    }

    @Override // v3e.b
    public final efm.b M2(StoryPage storyPage) {
        Intrinsics.checkNotNullParameter(storyPage, "storyPage");
        pfm.a aVar = new pfm.a(w.H0(w.C(((b0) this.f81988c).w0()), W0()), new pv9.b(new bsi.b(storyPage, this, 6), 12), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    @Override // v3e.b
    public final efm.b V2() {
        d0 d0VarC = w.C(((b0) this.f81988c).y0());
        pv9.b bVar = new pv9.b(new p(this, 1), 14);
        d0VarC.getClass();
        pfm.a aVar = new pfm.a(d0VarC, bVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    @Override // v3e.b
    public final d0 W0() {
        d0 d0VarC = w.C(((b0) this.f81988c).y0());
        pv9.b bVar = new pv9.b(new q(0), 13);
        d0VarC.getClass();
        i iVar = new i(d0VarC, bVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    @Override // ori.a, nri.a
    public final void i3() {
        pv9.b bVar = new pv9.b(new p(this, 0), 11);
        ihm.b bVar2 = this.f81989g;
        efm.b bVarSwitchMapCompletable = bVar2.switchMapCompletable(bVar);
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        e eVar = new e(new bo.c(new BreadcrumbException(), 28));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar = new pfm.a(bVarSwitchMapCompletable, eVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        h hVarW = aVar.w(new m(7, t.f250478a), s.f250477a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f81987b, hVarW);
        b0 b0Var = (b0) this.f81988c;
        if (b0Var.y0().isInitialized() || !b0Var.w0().isInitialized()) {
            return;
        }
        bVar2.onNext(Unit.f186387a);
    }

    public final NaviCommand j3() {
        RemoteStoriesContract$Config remoteStoriesContract$Config = (RemoteStoriesContract$Config) ((b0) this.f81988c).w0().get();
        if (remoteStoriesContract$Config instanceof RemoteStoriesContract$Config.Key) {
            return ((RemoteStoriesContract$Config.Key) remoteStoriesContract$Config).f81969c;
        }
        if (remoteStoriesContract$Config instanceof RemoteStoriesContract$Config.Id) {
            return ((RemoteStoriesContract$Config.Id) remoteStoriesContract$Config).getF81963c();
        }
        if (remoteStoriesContract$Config instanceof RemoteStoriesContract$Config.Deeplink) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // v3e.b
    public final efm.b m2(StoryPage storyPage, StoriesModel story) {
        Intrinsics.checkNotNullParameter(storyPage, "storyPage");
        Intrinsics.checkNotNullParameter(story, "story");
        d0 d0VarC = w.C(((b0) this.f81988c).y0());
        qza.a aVar = new qza.a(4, new r(storyPage, this, 1));
        d0VarC.getClass();
        pfm.a aVar2 = new pfm.a(d0VarC, aVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        return aVar2;
    }
}
