package com.fourthline.orca.internal;

import com.fourthline.orca.internal.an;
import com.fourthline.orca.internal.bn;
import com.fourthline.orca.internal.cn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class in implements ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mq0 f29642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fe1 f29643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qg0 f29644c;

    public in(mq0 presenter, fe1 viewNavigator, qg0 analytics) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f29642a = presenter;
        this.f29643b = viewNavigator;
        this.f29644c = analytics;
    }

    private final void b() {
        this.f29644c.track(an.a.C0164a.f26848b);
        this.f29643b.b(bn.a.f27170a);
    }

    private final void c() {
        this.f29644c.track(an.a.c.f26850b);
        this.f29643b.b(new bn.b(false));
    }

    private final void d() {
        this.f29644c.track(an.a.b.f26849b);
    }

    public final mq0 a() {
        return this.f29642a;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(cn event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof cn.a) {
            b();
        } else if (event instanceof cn.b) {
            c();
        } else {
            if (!(event instanceof cn.c)) {
                throw new NoWhenBranchMatchedException();
            }
            d();
        }
    }
}
