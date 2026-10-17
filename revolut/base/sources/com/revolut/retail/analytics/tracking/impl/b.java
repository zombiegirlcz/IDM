package com.revolut.retail.analytics.tracking.impl;

import ald.p;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import ang.f;
import com.appsflyer.AppsFlyerLib;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.extensions.rx.BreadcrumbException;
import e0f.m;
import efm.c0;
import ho.n;
import ho.q;
import ho.x;
import ho.y;
import ie.b0;
import ihm.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import noi.c;
import noi.g;
import noi.h;
import noi.k;
import noi.o;
import pfm.r;
import skm.e0;
import skm.p0;
import soi.e;
import te0.w;
import yk0.d;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends nri.a implements loi.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f98546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f98547c;
    public final e d;
    public final zm0.c e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f98548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ifm.b f98549h;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d4m.a f98550j;
    public final i1b.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f98551l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f98552m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f98553n;
    public final Lazy o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile Class f98554p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinkedHashMap f98555q;

    public b(gte.a toggles, c toastView, e targetedAnalyticsRepository, zm0.c sessionProvider, f userInteractor, ImmutableSet trackers, ifm.b disposables, d schedulerProvider, d4m.a performanceAnalyticsInteractor, i1b.f appsFlyerProvider) {
        Intrinsics.checkNotNullParameter(toggles, "toggles");
        Intrinsics.checkNotNullParameter(toastView, "toastView");
        Intrinsics.checkNotNullParameter(targetedAnalyticsRepository, "targetedAnalyticsRepository");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(disposables, "disposables");
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(performanceAnalyticsInteractor, "performanceAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(appsFlyerProvider, "appsFlyerProvider");
        this.f98546b = toggles;
        this.f98547c = toastView;
        this.d = targetedAnalyticsRepository;
        this.e = sessionProvider;
        this.f = userInteractor;
        this.f98548g = trackers;
        this.f98549h = disposables;
        this.i = schedulerProvider;
        this.f98550j = performanceAnalyticsInteractor;
        this.k = appsFlyerProvider;
        this.f98551l = p.a.h("toSerialized(...)");
        this.f98552m = p.a.h("toSerialized(...)");
        this.f98553n = p.a.h("toSerialized(...)");
        this.o = yhm.j.b(new ite.d(this, 19));
        this.f98555q = new LinkedHashMap();
    }

    @Override // ho.t
    public final void e2(n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        init();
        if (((Boolean) this.o.getValue()).booleanValue() && (event instanceof n.a)) {
            String message = q.a(event);
            c cVar = this.f98547c;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            new Handler(cVar.f218048a.getMainLooper()).postDelayed(new k0.b(cVar, message, 23), jli.b.d() - cVar.f218049b > 1500 ? 0L : 1500L);
        }
        this.f98551l.onNext(event);
    }

    @Override // nri.a
    public final void i3() {
        ifm.c cVarSubscribe;
        for (h hVar : this.f98548g) {
            r rVarY = new pfm.h(new lm.a(hVar, 1), 2).y(j3(hVar));
            Intrinsics.checkNotNullExpressionValue(rVarY, "subscribeOn(...)");
            pfm.a aVar = new pfm.a(rVarY, new mp.r(new bo.c(new BreadcrumbException(), 22), (byte) 0), 2);
            Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
            ofm.h hVarW = aVar.w(new m(5, o.f218064a), noi.n.f218063a);
            Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
            ifm.b bVar = this.f98549h;
            w.j0(bVar, hVarW);
            efm.r eventStream = this.f98551l.observeOn(j3(hVar));
            if (!(hVar instanceof k)) {
                Intrinsics.h(eventStream);
                eventStream = efm.r.defer(new ag.d(eventStream, this, 2));
                Intrinsics.checkNotNullExpressionValue(eventStream, "defer(...)");
            }
            Intrinsics.checkNotNullExpressionValue(eventStream, "let(...)");
            Intrinsics.checkNotNullParameter(eventStream, "eventStream");
            if (hVar.a()) {
                efm.r rVarFilter = eventStream.filter(new b0(new noi.d(hVar, 1), 14));
                Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
                noi.d dVar = new noi.d(hVar, 2);
                efm.r rVarOnErrorResumeNext = rVarFilter.onErrorResumeNext(new gn.b(5, new bo.c(new BreadcrumbException(), 19)));
                Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
                cVarSubscribe = rVarOnErrorResumeNext.subscribe(new bo.e(6, dVar), new bo.e(6, noi.e.f218052a));
                Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
            } else {
                cVarSubscribe = lfm.e.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "disposed(...)");
            }
            w.j0(bVar, cVarSubscribe);
            efm.r eventStream2 = this.f98552m.observeOn(j3(hVar));
            Intrinsics.checkNotNullExpressionValue(eventStream2, "observeOn(...)");
            Intrinsics.checkNotNullParameter(eventStream2, "eventStream");
            efm.r rVarDoOnNext = eventStream2.doOnNext(new b0(new noi.d(hVar, 3), 15));
            Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
            noi.d dVar2 = new noi.d(hVar, 4);
            efm.r rVarOnErrorResumeNext2 = rVarDoOnNext.onErrorResumeNext(new gn.b(5, new bo.c(new BreadcrumbException(), 20)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
            ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new bo.e(6, dVar2), new bo.e(6, noi.f.f218053a));
            Intrinsics.checkNotNullExpressionValue(cVarSubscribe2, "subscribe(...)");
            w.j0(bVar, cVarSubscribe2);
            efm.r eventStream3 = this.f98553n.observeOn(j3(hVar));
            Intrinsics.checkNotNullExpressionValue(eventStream3, "observeOn(...)");
            Intrinsics.checkNotNullParameter(eventStream3, "eventStream");
            efm.r rVarDoOnNext2 = eventStream3.doOnNext(new b0(new noi.d(hVar, 0), 13));
            Intrinsics.checkNotNullExpressionValue(rVarDoOnNext2, "doOnNext(...)");
            jli.f fVar = new jli.f(hVar, 19);
            efm.r rVarOnErrorResumeNext3 = rVarDoOnNext2.onErrorResumeNext(new gn.b(5, new bo.c(new BreadcrumbException(), 21)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
            ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new bo.e(6, fVar), new bo.e(6, g.f218054a));
            Intrinsics.checkNotNullExpressionValue(cVarSubscribe3, "subscribe(...)");
            w.j0(bVar, cVarSubscribe3);
        }
        w.f0(((cn0.g) this.e).g()).subscribe(new b0(new noi.m(this, 1), 19), new b0(new jli.f(21), 20));
        w.f0(this.f.d.e()).subscribe(new b0(new noi.m(this, 3), 21), new b0(new jli.f(22), 22));
    }

    public final c0 j3(h hVar) {
        String name = hVar.getClass().getName();
        LinkedHashMap linkedHashMap = this.f98555q;
        Object objA = linkedHashMap.get(name);
        if (objA == null) {
            this.i.getClass();
            objA = d.a();
            linkedHashMap.put(name, objA);
        }
        return (c0) objA;
    }

    public final void k3(boolean z) {
        Iterator it8 = this.f98548g.iterator();
        while (it8.hasNext()) {
            ((h) it8.next()).e(z);
        }
        l1b.g gVar = (l1b.g) this.k.f157602c;
        AppsFlyerLib appsFlyerLib = gVar.f191518b;
        boolean z3 = !z;
        appsFlyerLib.anonymizeUser(z3);
        Context context = gVar.f191521h;
        appsFlyerLib.stop(z3, context);
        if (z) {
            Activity activityC = h80.c.c();
            if (activityC != null) {
                context = activityC;
            }
            appsFlyerLib.start(context);
        }
        CoroutineScope coroutineScope = gVar.e;
        p0 p0Var = p0.f264001a;
        e0.C(coroutineScope, elm.f.f127540b, null, new l1b.f(gVar, z, null, 1), 2);
    }

    public final void l3(y userInfo) {
        String strA;
        String strA2;
        Intrinsics.checkNotNullParameter(userInfo, "info");
        init();
        this.f98552m.onNext(userInfo);
        boolean z = userInfo instanceof ho.w;
        Continuation continuation = null;
        if (z) {
            strA = ((ho.w) userInfo).a();
        } else {
            if (!(userInfo instanceof x)) {
                throw new NoWhenBranchMatchedException();
            }
            strA = null;
        }
        ((aoi.c) this.f98550j.get()).a(strA);
        i1b.f fVar = this.k;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        if (userInfo instanceof x) {
            strA2 = null;
        } else {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            strA2 = ((ho.w) userInfo).a();
        }
        String strB = strA2 != null ? fVar.d.b(strA2) : null;
        CoroutineScope coroutineScope = fVar.e;
        p0 p0Var = p0.f264001a;
        e0.C(coroutineScope, zkm.o.f323119a, null, new p(fVar, strB, continuation, 4), 2);
    }
}
