package com.revolut.analytics.integrity;

import a08.s;
import b9i.h;
import bo.g;
import bo.j;
import com.google.common.math.LongMath;
import com.google.protobuf.f3;
import com.revolut.analytics.integrity.IntegrityAnalyticsFeatureToggles;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.analytics.tracking.v3.d;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.d0;
import efm.r;
import ifm.b;
import java.security.MessageDigest;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.time.TimeMark;
import pkm.k;
import te0.w;
import yh0.c;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends nri.a implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f50291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f50292c;
    public final c d;
    public final d e;
    public final gte.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f50293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MessageDigest f50294h;
    public final ConcurrentHashMap i;

    public a(b appDisposable, c integrityCheckEventProvider, c integrityCheckTokenProvider, d diagnosticEventsTracker, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(appDisposable, "appDisposable");
        Intrinsics.checkNotNullParameter(integrityCheckEventProvider, "integrityCheckEventProvider");
        Intrinsics.checkNotNullParameter(integrityCheckTokenProvider, "integrityCheckTokenProvider");
        Intrinsics.checkNotNullParameter(diagnosticEventsTracker, "diagnosticEventsTracker");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        k timeSource = k.f237220a;
        Intrinsics.checkNotNullParameter(appDisposable, "appDisposable");
        Intrinsics.checkNotNullParameter(integrityCheckEventProvider, "integrityCheckEventProvider");
        Intrinsics.checkNotNullParameter(integrityCheckTokenProvider, "integrityCheckTokenProvider");
        Intrinsics.checkNotNullParameter(diagnosticEventsTracker, "diagnosticEventsTracker");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        this.f50291b = appDisposable;
        this.f50292c = integrityCheckEventProvider;
        this.d = integrityCheckTokenProvider;
        this.e = diagnosticEventsTracker;
        this.f = featureToggleInteractor;
        this.f50293g = timeSource;
        this.f50294h = MessageDigest.getInstance("SHA-256");
        this.i = new ConcurrentHashMap();
    }

    @Override // nri.a
    public final void i3() {
        c cVar = this.f50292c;
        r rVarA0 = w.a0(cVar.d, new bng.a(5));
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: bo.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.analytics.integrity.a f17253b;

            {
                this.f17253b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        yg0.a failure = (yg0.a) obj2;
                        Intrinsics.checkNotNullParameter(failure, "failure");
                        com.revolut.analytics.integrity.a aVar = this.f17253b;
                        ConcurrentHashMap concurrentHashMap = aVar.i;
                        String str = failure.f313480a;
                        Object obj3 = concurrentHashMap.get(str);
                        if (obj3 == null) {
                            i iVar = new i(failure.f313480a, aVar.f50293g.a(), oi0.d.n(failure), 8, 0);
                            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(str, iVar);
                            obj3 = objPutIfAbsent == null ? iVar : objPutIfAbsent;
                        }
                        i iVar2 = (i) obj3;
                        TimeMark timeMark = iVar2.f17255b;
                        int i2 = iVar2.d;
                        String nonce = iVar2.f17254a;
                        String str2 = failure.f313480a;
                        String str3 = iVar2.f17256c;
                        Intrinsics.checkNotNullParameter(nonce, "nonce");
                        Intrinsics.checkNotNullParameter(timeMark, "timeMark");
                        concurrentHashMap.put(str2, new i(nonce, timeMark, str3, i2 + 1));
                        final String strN = oi0.d.n(failure);
                        com.revolut.analytics.tracking.v3.d dVar = aVar.e;
                        MessageDigest messageDigest = aVar.f50294h;
                        byte[] bytes = nonce.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                        byte[] bArrDigest = messageDigest.digest(bytes);
                        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
                        final String nonceHash = jli.g.i(bArrDigest);
                        final int i3 = iVar2.d;
                        final long jA = timeMark.a();
                        final String str4 = iVar2.f17256c;
                        final com.revolut.analytics.tracking.v3.f fVar = (com.revolut.analytics.tracking.v3.f) dVar;
                        fVar.getClass();
                        Intrinsics.checkNotNullParameter(nonceHash, "nonceHash");
                        com.revolut.analytics.tracking.v3.f.g(fVar, AnalyticsProduct.Shared.MobilePlatform.f, null, null, new Function0() { // from class: no.d0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                final String str5 = nonceHash;
                                final int i5 = i3;
                                final long j2 = jA;
                                final String str6 = str4;
                                final String str7 = strN;
                                final com.revolut.analytics.tracking.v3.f fVar2 = fVar;
                                return new AnalyticsContext(m72.b.h("integrity_token_request", com.bumptech.glide.c.g(new Function1(str5, i5, j2, str6, str7, fVar2) { // from class: no.f0

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final /* synthetic */ String f217763a;

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ int f217764b;

                                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                                    public final /* synthetic */ long f217765c;
                                    public final /* synthetic */ String d;
                                    public final /* synthetic */ String e;

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        f3 buildStruct = (f3) obj4;
                                        Intrinsics.checkNotNullParameter(buildStruct, "$this$buildStruct");
                                        com.bumptech.glide.c.x(buildStruct, "nonce_hash", this.f217763a);
                                        com.bumptech.glide.c.v(buildStruct, "attempt", Integer.valueOf(this.f217764b));
                                        com.bumptech.glide.c.w(buildStruct, "duration", Long.valueOf(kotlin.time.b.f(this.f217765c)));
                                        String str8 = this.d;
                                        if (str8 != null) {
                                            com.bumptech.glide.c.x(buildStruct, "initial_error", str8);
                                        }
                                        String str9 = this.e;
                                        if (str9 != null) {
                                            com.revolut.analytics.tracking.v3.f.c(buildStruct, "latest_error", str9);
                                        }
                                        return Unit.f186387a;
                                    }
                                }), AnalyticsContext.INSTANCE));
                            }
                        }, 14);
                        if (!aVar.f.a(IntegrityAnalyticsFeatureToggles.IntegrityTokenRequestsRetryAnalyticsEnabled.f50290c) && i2 <= 8) {
                            long jPow = LongMath.pow(2L, i2 - 1) * 125;
                            ifm.b bVar = aVar.f50291b;
                            d0 d0VarA = aVar.d.a(nonce);
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            rfm.l lVarK = d0VarA.k(jPow, hhm.f.f152430b);
                            Intrinsics.checkNotNullExpressionValue(lVarK, "delaySubscription(...)");
                            ufm.i iVar3 = new ufm.i(lVarK, new s(6, new b9i.h(new BreadcrumbException(), 12)), 2);
                            Intrinsics.checkNotNullExpressionValue(iVar3, "onErrorResumeNext(...)");
                            ofm.i iVar4 = new ofm.i(new a08.r(10, l.f17259a), new a08.r(10, m.f17260a), 0);
                            iVar3.q(iVar4);
                            Intrinsics.checkNotNullExpressionValue(iVar4, "subscribe(...)");
                            w.j0(bVar, iVar4);
                        }
                        break;
                    default:
                        yg0.c success = (yg0.c) obj2;
                        Intrinsics.checkNotNullParameter(success, "success");
                        com.revolut.analytics.integrity.a aVar2 = this.f17253b;
                        i iVar5 = (i) aVar2.i.remove(success.f313483a);
                        if (iVar5 == null) {
                            iVar5 = new i(success.f313483a, aVar2.f50293g.a(), null, 12, 0);
                        }
                        com.revolut.analytics.tracking.v3.d dVar2 = aVar2.e;
                        String str5 = iVar5.f17254a;
                        MessageDigest messageDigest2 = aVar2.f50294h;
                        byte[] bytes2 = str5.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                        byte[] bArrDigest2 = messageDigest2.digest(bytes2);
                        Intrinsics.checkNotNullExpressionValue(bArrDigest2, "digest(...)");
                        final String nonceHash2 = jli.g.i(bArrDigest2);
                        final int i5 = iVar5.d;
                        final long jA2 = iVar5.f17255b.a();
                        final String str6 = iVar5.f17256c;
                        final com.revolut.analytics.tracking.v3.f fVar2 = (com.revolut.analytics.tracking.v3.f) dVar2;
                        fVar2.getClass();
                        Intrinsics.checkNotNullParameter(nonceHash2, "nonceHash");
                        final String str7 = null;
                        com.revolut.analytics.tracking.v3.f.g(fVar2, AnalyticsProduct.Shared.MobilePlatform.f, null, null, new Function0() { // from class: no.d0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                final String str52 = nonceHash2;
                                final int i59 = i5;
                                final long j2 = jA2;
                                final String str62 = str6;
                                final String str72 = str7;
                                final com.revolut.analytics.tracking.v3.f fVar22 = fVar2;
                                return new AnalyticsContext(m72.b.h("integrity_token_request", com.bumptech.glide.c.g(new Function1(str52, i59, j2, str62, str72, fVar22) { // from class: no.f0

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final /* synthetic */ String f217763a;

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ int f217764b;

                                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                                    public final /* synthetic */ long f217765c;
                                    public final /* synthetic */ String d;
                                    public final /* synthetic */ String e;

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        f3 buildStruct = (f3) obj4;
                                        Intrinsics.checkNotNullParameter(buildStruct, "$this$buildStruct");
                                        com.bumptech.glide.c.x(buildStruct, "nonce_hash", this.f217763a);
                                        com.bumptech.glide.c.v(buildStruct, "attempt", Integer.valueOf(this.f217764b));
                                        com.bumptech.glide.c.w(buildStruct, "duration", Long.valueOf(kotlin.time.b.f(this.f217765c)));
                                        String str8 = this.d;
                                        if (str8 != null) {
                                            com.bumptech.glide.c.x(buildStruct, "initial_error", str8);
                                        }
                                        String str9 = this.e;
                                        if (str9 != null) {
                                            com.revolut.analytics.tracking.v3.f.c(buildStruct, "latest_error", str9);
                                        }
                                        return Unit.f186387a;
                                    }
                                }), AnalyticsContext.INSTANCE));
                            }
                        }, 14);
                        break;
                }
                return Unit.f186387a;
            }
        };
        r rVarOnErrorResumeNext = rVarA0.onErrorResumeNext(new s(6, new h(new BreadcrumbException(), 10)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a08.r(10, function1), new a08.r(10, j.f17257a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        b bVar = this.f50291b;
        w.j0(bVar, cVarSubscribe);
        r rVarA02 = w.a0(cVar.d, new bng.a(6));
        final int i2 = 1;
        Function1 function12 = new Function1(this) { // from class: bo.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.analytics.integrity.a f17253b;

            {
                this.f17253b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        yg0.a failure = (yg0.a) obj2;
                        Intrinsics.checkNotNullParameter(failure, "failure");
                        com.revolut.analytics.integrity.a aVar = this.f17253b;
                        ConcurrentHashMap concurrentHashMap = aVar.i;
                        String str = failure.f313480a;
                        Object obj3 = concurrentHashMap.get(str);
                        if (obj3 == null) {
                            i iVar = new i(failure.f313480a, aVar.f50293g.a(), oi0.d.n(failure), 8, 0);
                            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(str, iVar);
                            obj3 = objPutIfAbsent == null ? iVar : objPutIfAbsent;
                        }
                        i iVar2 = (i) obj3;
                        TimeMark timeMark = iVar2.f17255b;
                        int i22 = iVar2.d;
                        String nonce = iVar2.f17254a;
                        String str2 = failure.f313480a;
                        String str3 = iVar2.f17256c;
                        Intrinsics.checkNotNullParameter(nonce, "nonce");
                        Intrinsics.checkNotNullParameter(timeMark, "timeMark");
                        concurrentHashMap.put(str2, new i(nonce, timeMark, str3, i22 + 1));
                        final String strN = oi0.d.n(failure);
                        com.revolut.analytics.tracking.v3.d dVar = aVar.e;
                        MessageDigest messageDigest = aVar.f50294h;
                        byte[] bytes = nonce.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                        byte[] bArrDigest = messageDigest.digest(bytes);
                        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
                        final String nonceHash = jli.g.i(bArrDigest);
                        final int i3 = iVar2.d;
                        final long jA = timeMark.a();
                        final String str4 = iVar2.f17256c;
                        final com.revolut.analytics.tracking.v3.f fVar = (com.revolut.analytics.tracking.v3.f) dVar;
                        fVar.getClass();
                        Intrinsics.checkNotNullParameter(nonceHash, "nonceHash");
                        com.revolut.analytics.tracking.v3.f.g(fVar, AnalyticsProduct.Shared.MobilePlatform.f, null, null, new Function0() { // from class: no.d0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                final String str52 = nonceHash;
                                final int i59 = i3;
                                final long j2 = jA;
                                final String str62 = str4;
                                final String str72 = strN;
                                final com.revolut.analytics.tracking.v3.f fVar22 = fVar;
                                return new AnalyticsContext(m72.b.h("integrity_token_request", com.bumptech.glide.c.g(new Function1(str52, i59, j2, str62, str72, fVar22) { // from class: no.f0

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final /* synthetic */ String f217763a;

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ int f217764b;

                                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                                    public final /* synthetic */ long f217765c;
                                    public final /* synthetic */ String d;
                                    public final /* synthetic */ String e;

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        f3 buildStruct = (f3) obj4;
                                        Intrinsics.checkNotNullParameter(buildStruct, "$this$buildStruct");
                                        com.bumptech.glide.c.x(buildStruct, "nonce_hash", this.f217763a);
                                        com.bumptech.glide.c.v(buildStruct, "attempt", Integer.valueOf(this.f217764b));
                                        com.bumptech.glide.c.w(buildStruct, "duration", Long.valueOf(kotlin.time.b.f(this.f217765c)));
                                        String str8 = this.d;
                                        if (str8 != null) {
                                            com.bumptech.glide.c.x(buildStruct, "initial_error", str8);
                                        }
                                        String str9 = this.e;
                                        if (str9 != null) {
                                            com.revolut.analytics.tracking.v3.f.c(buildStruct, "latest_error", str9);
                                        }
                                        return Unit.f186387a;
                                    }
                                }), AnalyticsContext.INSTANCE));
                            }
                        }, 14);
                        if (!aVar.f.a(IntegrityAnalyticsFeatureToggles.IntegrityTokenRequestsRetryAnalyticsEnabled.f50290c) && i22 <= 8) {
                            long jPow = LongMath.pow(2L, i22 - 1) * 125;
                            ifm.b bVar2 = aVar.f50291b;
                            d0 d0VarA = aVar.d.a(nonce);
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            rfm.l lVarK = d0VarA.k(jPow, hhm.f.f152430b);
                            Intrinsics.checkNotNullExpressionValue(lVarK, "delaySubscription(...)");
                            ufm.i iVar3 = new ufm.i(lVarK, new s(6, new b9i.h(new BreadcrumbException(), 12)), 2);
                            Intrinsics.checkNotNullExpressionValue(iVar3, "onErrorResumeNext(...)");
                            ofm.i iVar4 = new ofm.i(new a08.r(10, l.f17259a), new a08.r(10, m.f17260a), 0);
                            iVar3.q(iVar4);
                            Intrinsics.checkNotNullExpressionValue(iVar4, "subscribe(...)");
                            w.j0(bVar2, iVar4);
                        }
                        break;
                    default:
                        yg0.c success = (yg0.c) obj2;
                        Intrinsics.checkNotNullParameter(success, "success");
                        com.revolut.analytics.integrity.a aVar2 = this.f17253b;
                        i iVar5 = (i) aVar2.i.remove(success.f313483a);
                        if (iVar5 == null) {
                            iVar5 = new i(success.f313483a, aVar2.f50293g.a(), null, 12, 0);
                        }
                        com.revolut.analytics.tracking.v3.d dVar2 = aVar2.e;
                        String str5 = iVar5.f17254a;
                        MessageDigest messageDigest2 = aVar2.f50294h;
                        byte[] bytes2 = str5.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                        byte[] bArrDigest2 = messageDigest2.digest(bytes2);
                        Intrinsics.checkNotNullExpressionValue(bArrDigest2, "digest(...)");
                        final String nonceHash2 = jli.g.i(bArrDigest2);
                        final int i5 = iVar5.d;
                        final long jA2 = iVar5.f17255b.a();
                        final String str6 = iVar5.f17256c;
                        final com.revolut.analytics.tracking.v3.f fVar2 = (com.revolut.analytics.tracking.v3.f) dVar2;
                        fVar2.getClass();
                        Intrinsics.checkNotNullParameter(nonceHash2, "nonceHash");
                        final String str7 = null;
                        com.revolut.analytics.tracking.v3.f.g(fVar2, AnalyticsProduct.Shared.MobilePlatform.f, null, null, new Function0() { // from class: no.d0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                final String str52 = nonceHash2;
                                final int i59 = i5;
                                final long j2 = jA2;
                                final String str62 = str6;
                                final String str72 = str7;
                                final com.revolut.analytics.tracking.v3.f fVar22 = fVar2;
                                return new AnalyticsContext(m72.b.h("integrity_token_request", com.bumptech.glide.c.g(new Function1(str52, i59, j2, str62, str72, fVar22) { // from class: no.f0

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final /* synthetic */ String f217763a;

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ int f217764b;

                                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                                    public final /* synthetic */ long f217765c;
                                    public final /* synthetic */ String d;
                                    public final /* synthetic */ String e;

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        f3 buildStruct = (f3) obj4;
                                        Intrinsics.checkNotNullParameter(buildStruct, "$this$buildStruct");
                                        com.bumptech.glide.c.x(buildStruct, "nonce_hash", this.f217763a);
                                        com.bumptech.glide.c.v(buildStruct, "attempt", Integer.valueOf(this.f217764b));
                                        com.bumptech.glide.c.w(buildStruct, "duration", Long.valueOf(kotlin.time.b.f(this.f217765c)));
                                        String str8 = this.d;
                                        if (str8 != null) {
                                            com.bumptech.glide.c.x(buildStruct, "initial_error", str8);
                                        }
                                        String str9 = this.e;
                                        if (str9 != null) {
                                            com.revolut.analytics.tracking.v3.f.c(buildStruct, "latest_error", str9);
                                        }
                                        return Unit.f186387a;
                                    }
                                }), AnalyticsContext.INSTANCE));
                            }
                        }, 14);
                        break;
                }
                return Unit.f186387a;
            }
        };
        r rVarOnErrorResumeNext2 = rVarA02.onErrorResumeNext(new s(6, new h(new BreadcrumbException(), 11)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new a08.r(10, function12), new a08.r(10, bo.k.f17258a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe2, "subscribe(...)");
        w.j0(bVar, cVarSubscribe2);
    }
}
