package com.revolut.feature.remote_stories.impl.ui;

import com.google.firebase.messaging.t;
import kotlin.jvm.internal.Intrinsics;
import no.f2;
import qza.c;
import qza.d0;
import qza.g;
import qza.o;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kza.b f81982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kza.a f81983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f81984c;
    public final ln.a d;
    public final o e;
    public final d0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f80.a f81985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tm.g f81986h;

    public a(kza.b remoteStoriesLoadingInteractor, kza.a remoteStoriesInteractor, g state, ln.a navigationDispatcher, o mapper, d0 storyRequestParamsParser, f80.a uriHelper, t actionsFactory) {
        Intrinsics.checkNotNullParameter(remoteStoriesLoadingInteractor, "remoteStoriesLoadingInteractor");
        Intrinsics.checkNotNullParameter(remoteStoriesInteractor, "remoteStoriesInteractor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(navigationDispatcher, "navigationDispatcher");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storyRequestParamsParser, "storyRequestParamsParser");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(actionsFactory, "actionsFactory");
        this.f81982a = remoteStoriesLoadingInteractor;
        this.f81983b = remoteStoriesInteractor;
        this.f81984c = state;
        this.d = navigationDispatcher;
        this.e = mapper;
        this.f = storyRequestParamsParser;
        this.f81985g = uriHelper;
        this.f81986h = actionsFactory.f(new f2(this, 9));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        qza.b action = (qza.b) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return this.f81986h.a(action);
    }
}
