package no;

import com.google.protobuf.h3;
import com.revolut.tracking.v3.AnalyticEvent;
import ho.n;
import io.grpc.StatusRuntimeException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class z implements q, ho.z {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Duration f217881r = Duration.ofSeconds(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w60.b f217882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.retail.analytics.tracking.impl.a f217883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo.c f217884c;
    public final fo.a d;
    public final gpk.c e;
    public final ho.d0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f217885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final uo.f f217886h;
    public final b80.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fo.f f217887j;
    public final to.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f217888l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f217889m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicReference f217890n;
    public final AtomicBoolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f217891p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e0m.b f217892q;

    public z(w60.b accountRegionUrlProvider, com.revolut.retail.analytics.tracking.impl.a appAnalyticsToggles, jo.c aqueductParamsProvider, fo.a configuration, gpk.c coroutineScopeProvider, ho.d0 debugEventsStore, e diagnosticEventsTracker, uo.f eventsBuilder, b80.c networkStateRepository, fo.f offlineRepository, to.h recorder) {
        Intrinsics.checkNotNullParameter(accountRegionUrlProvider, "accountRegionUrlProvider");
        Intrinsics.checkNotNullParameter(appAnalyticsToggles, "appAnalyticsToggles");
        Intrinsics.checkNotNullParameter(aqueductParamsProvider, "aqueductParamsProvider");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(debugEventsStore, "debugEventsStore");
        Intrinsics.checkNotNullParameter(diagnosticEventsTracker, "diagnosticEventsTracker");
        Intrinsics.checkNotNullParameter(eventsBuilder, "eventsBuilder");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(offlineRepository, "offlineRepository");
        Intrinsics.checkNotNullParameter(recorder, "recorder");
        this.f217882a = accountRegionUrlProvider;
        this.f217883b = appAnalyticsToggles;
        this.f217884c = aqueductParamsProvider;
        this.d = configuration;
        this.e = coroutineScopeProvider;
        this.f = debugEventsStore;
        this.f217885g = diagnosticEventsTracker;
        this.f217886h = eventsBuilder;
        this.i = networkStateRepository;
        this.f217887j = offlineRepository;
        this.k = recorder;
        this.f217888l = new AtomicBoolean(false);
        this.f217889m = new AtomicBoolean(false);
        this.f217890n = new AtomicReference();
        this.o = new AtomicBoolean(false);
        this.f217891p = new CopyOnWriteArrayList();
        this.f217892q = new e0m.b(new nmm.h(this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(no.z r11, fo.i r12, gim.c r13) {
        /*
            java.lang.String r0 = "Response to event "
            boolean r1 = r13 instanceof no.v
            if (r1 == 0) goto L15
            r1 = r13
            no.v r1 = (no.v) r1
            int r2 = r1.f217853x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f217853x = r2
            goto L1a
        L15:
            no.v r1 = new no.v
            r1.<init>(r11, r13)
        L1a:
            java.lang.Object r13 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f217853x
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3e
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2d
            yhm.o.b(r13)
            goto Lae
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            fo.i r12 = r1.u
            yhm.o.b(r13)     // Catch: java.lang.Throwable -> L3b
            goto L4e
        L3b:
            r0 = move-exception
            r12 = r0
            goto La2
        L3e:
            yhm.o.b(r13)
            to.h r13 = r11.k     // Catch: java.lang.Throwable -> L3b
            r1.u = r12     // Catch: java.lang.Throwable -> L3b
            r1.f217853x = r5     // Catch: java.lang.Throwable -> L3b
            java.lang.Enum r13 = r13.a(r12, r1)     // Catch: java.lang.Throwable -> L3b
            if (r13 != r2) goto L4e
            goto Lb0
        L4e:
            grl.b4 r13 = (grl.b4) r13     // Catch: java.lang.Throwable -> L3b
            java.lang.String r6 = "AqueductRepository"
            java.util.concurrent.CopyOnWriteArrayList r3 = rd0.d.f253311a     // Catch: java.lang.Throwable -> L3b
            rd0.c r5 = rd0.c.DEBUG     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = r12.a()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r7 = r12.f136730a     // Catch: java.lang.Throwable -> L3b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L3b
            r8.append(r3)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = " from "
            r8.append(r0)     // Catch: java.lang.Throwable -> L3b
            r8.append(r7)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = ": "
            r8.append(r0)     // Catch: java.lang.Throwable -> L3b
            r8.append(r13)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L3b
            r9 = 0
            r10 = 16
            r8 = 0
            rd0.d.b(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L3b
            fo.f r13 = r11.f217887j     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = r12.a()     // Catch: java.lang.Throwable -> L3b
            r13.f(r0)     // Catch: java.lang.Throwable -> L3b
            java.util.concurrent.CopyOnWriteArrayList r13 = r11.f217891p     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L3b
        L8e:
            boolean r0 = r13.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto Lae
            java.lang.Object r0 = r13.next()     // Catch: java.lang.Throwable -> L3b
            no.o r0 = (no.o) r0     // Catch: java.lang.Throwable -> L3b
            com.revolut.tracking.v3.AnalyticEvent r3 = r12.f136731b     // Catch: java.lang.Throwable -> L3b
            com.revolut.analytics.tracking.v3.l r0 = (com.revolut.analytics.tracking.v3.l) r0     // Catch: java.lang.Throwable -> L3b
            r0.j3(r3)     // Catch: java.lang.Throwable -> L3b
            goto L8e
        La2:
            r13 = 0
            r1.u = r13
            r1.f217853x = r4
            java.lang.Object r11 = r11.c(r12, r1)
            if (r11 != r2) goto Lae
            goto Lb0
        Lae:
            kotlin.Unit r2 = kotlin.Unit.f186387a
        Lb0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: no.z.a(no.z, fo.i, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(no.z r10, boolean r11, gim.c r12) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.f217888l
            boolean r1 = r12 instanceof no.y
            if (r1 == 0) goto L15
            r1 = r12
            no.y r1 = (no.y) r1
            int r2 = r1.f217871w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f217871w = r2
            goto L1a
        L15:
            no.y r1 = new no.y
            r1.<init>(r10, r12)
        L1a:
            java.lang.Object r12 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f217871w
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L36
            if (r3 != r5) goto L2e
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L2b
            goto La4
        L2b:
            r10 = move-exception
            goto Lac
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            yhm.o.b(r12)
            java.util.concurrent.atomic.AtomicReference r12 = r10.f217890n
            java.lang.Object r12 = r12.get()
            al0.a r12 = (al0.a) r12
            al0.a r3 = al0.a.ONLINE
            if (r12 == r3) goto L47
        L45:
            r11 = r4
            goto L56
        L47:
            java.util.concurrent.atomic.AtomicBoolean r12 = r10.f217889m
            boolean r12 = r12.get()
            if (r12 != 0) goto L52
            if (r11 != 0) goto L52
            goto L45
        L52:
            boolean r11 = r0.compareAndSet(r4, r5)
        L56:
            if (r11 != 0) goto L5b
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L5b:
            fo.f r11 = r10.f217887j     // Catch: java.lang.Throwable -> L2b
            fo.a r12 = r10.d     // Catch: java.lang.Throwable -> L2b
            int r12 = r12.f136719a     // Catch: java.lang.Throwable -> L2b
            java.util.List r11 = r11.d(r12)     // Catch: java.lang.Throwable -> L2b
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch: java.lang.Throwable -> L2b
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2b
            r3 = 10
            int r3 = zhm.w.t(r11, r3)     // Catch: java.lang.Throwable -> L2b
            r12.<init>(r3)     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L2b
        L76:
            boolean r3 = r11.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L9b
            java.lang.Object r3 = r11.next()     // Catch: java.lang.Throwable -> L2b
            fo.i r3 = (fo.i) r3     // Catch: java.lang.Throwable -> L2b
            gpk.c r6 = r10.e     // Catch: java.lang.Throwable -> L2b
            kotlinx.coroutines.CoroutineScope r6 = r6.c()     // Catch: java.lang.Throwable -> L2b
            skm.p0 r7 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L2b
            elm.f r7 = elm.f.f127540b     // Catch: java.lang.Throwable -> L2b
            no.w r8 = new no.w     // Catch: java.lang.Throwable -> L2b
            r9 = 0
            r8.<init>(r10, r3, r9, r5)     // Catch: java.lang.Throwable -> L2b
            r3 = 2
            skm.h0 r3 = skm.e0.g(r6, r7, r9, r8, r3)     // Catch: java.lang.Throwable -> L2b
            r12.add(r3)     // Catch: java.lang.Throwable -> L2b
            goto L76
        L9b:
            r1.f217871w = r5     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r12 = skm.e0.h(r12, r1)     // Catch: java.lang.Throwable -> L2b
            if (r12 != r2) goto La4
            return r2
        La4:
            java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Throwable -> L2b
            r0.set(r4)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        Lac:
            r0.set(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: no.z.b(no.z, boolean, gim.c):java.lang.Object");
    }

    public final Object c(Throwable th10, gim.c cVar) {
        ecm.g2 g2Var;
        h3 h3VarG = com.bumptech.glide.c.g(new nd8.l(th10, 2));
        List list = to.b.f272475a;
        StatusRuntimeException statusRuntimeException = th10 instanceof StatusRuntimeException ? (StatusRuntimeException) th10 : null;
        if (zhm.d0.T(list, (statusRuntimeException == null || (g2Var = statusRuntimeException.f162992a) == null) ? null : g2Var.f124809a)) {
            nme.c cVar2 = new nme.c(20);
            if (this.o.compareAndSet(false, true)) {
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.c cVar3 = rd0.c.ERROR;
                cVar2.invoke();
                rd0.d.a(cVar3, "AqueductRepository", "recordEvent[network]", th10, h0Var);
            }
        } else {
            zhm.h0 h0Var2 = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "AqueductRepository", null, th10, h0Var2);
        }
        Object objB = ((com.revolut.analytics.tracking.v3.a) this.f217885g).b("at_retry_attempt", h3VarG, new k50.b2(this), cVar);
        return objB == fim.a.COROUTINE_SUSPENDED ? objB : Unit.f186387a;
    }

    public final void d(String str, n.a aVar, AnalyticEvent analyticEvent) {
        this.f217892q.init();
        CoroutineScope coroutineScopeC = this.e.c();
        skm.p0 p0Var = skm.p0.f264001a;
        skm.e0.C(coroutineScopeC, elm.f.f127540b, null, new x(aVar, analyticEvent, this, str, null), 2);
    }

    @Override // ho.z
    public final void pause() {
        this.f217889m.set(false);
    }

    @Override // ho.z
    public final void resume() {
        this.f217889m.set(true);
        this.f217892q.init();
    }
}
