package com.fourthline.orca.internal;

import com.fourthline.orca.internal.pv0;
import com.fourthline.orca.internal.qv0;
import com.fourthline.orca.internal.rv0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class xv0 implements ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mq0 f35097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wv0 f35098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fe1 f35099c;
    private final oj0 d;
    private final nv0 e;
    private final kx f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final lx f35100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final qg0 f35101h;

    public xv0(mq0 presenter, wv0 stateProvider, fe1 viewNavigator, oj0 renderer, nv0 repository, kx fileDownloader, lx fileSharer, qg0 analytics) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(fileDownloader, "fileDownloader");
        Intrinsics.checkNotNullParameter(fileSharer, "fileSharer");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f35097a = presenter;
        this.f35098b = stateProvider;
        this.f35099c = viewNavigator;
        this.d = renderer;
        this.e = repository;
        this.f = fileDownloader;
        this.f35100g = fileSharer;
        this.f35101h = analytics;
    }

    private final void c() {
        this.f35101h.track(pv0.a.C0267a.f32058b);
        this.f35099c.b(qv0.a.f32545a);
    }

    private final void d() {
        this.f35101h.track(pv0.a.d.f32061b);
        e();
    }

    private final void e() {
        this.f35097a.a(this.f35098b.a(this.e.b(), this.d.a(this.e.a())));
    }

    private final void f() {
        this.f35101h.track(pv0.a.e.f32062b);
        this.f35100g.a(this.e.a());
    }

    public final mq0 b() {
        return this.f35097a;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(rv0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof rv0.a) {
            c();
            return;
        }
        if (event instanceof rv0.d) {
            d();
            return;
        }
        if (event instanceof rv0.e) {
            f();
        } else if (event instanceof rv0.c) {
            a();
        } else {
            if (!(event instanceof rv0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((rv0.b) event).a());
        }
    }

    private final void a() {
        this.f35101h.track(pv0.a.c.f32060b);
        this.f.a(this.e.b(), this.e.a());
    }

    private final void a(Map map) {
        this.f35101h.track(new pv0.a.b(map));
    }
}
