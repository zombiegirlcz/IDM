package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ks;
import com.fourthline.orca.internal.qc0;
import com.fourthline.orca.internal.sc0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class os implements ax, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f31755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f31756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ns f31757c;
    private final n9 d;
    private final fe1 e;
    private final qg0 f;

    public os(mq0 presenter, ns stateProvider, n9 resultRepository, fe1 viewNavigator, qg0 analytics, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f31755a = coroutineScope;
        this.f31756b = presenter;
        this.f31757c = stateProvider;
        this.d = resultRepository;
        this.e = viewNavigator;
        this.f = analytics;
    }

    private final void b() {
        this.f.track(qc0.a.C0272a.f32386b);
        this.e.b(ks.a.f30373a);
    }

    private final void c() {
        this.f.track(qc0.a.e.f32390b);
        this.e.b(ks.b.f30374a);
    }

    private final void d() {
        this.f.track(qc0.a.c.f32388b);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f31755a.getCoroutineContext();
    }

    public final mq0 a() {
        return this.f31756b;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(sc0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof sc0.e) {
            d();
            return;
        }
        if (event instanceof sc0.d) {
            c();
            return;
        }
        if (event instanceof sc0.a) {
            b();
            return;
        }
        if (event instanceof sc0.b) {
            a((sc0.b) event);
        } else if (event instanceof sc0.f) {
            a((sc0.f) event);
        } else if (!(event instanceof sc0.c)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void a(sc0.f fVar) {
        this.f.track(qc0.a.b.f32387b);
        this.d.a(fVar.a());
        this.f31756b.a(this.f31757c.a(fVar.a()));
    }

    private final void a(sc0.b bVar) {
        this.f31756b.a(this.f31757c.a(bVar.b(), bVar.a()));
    }
}
