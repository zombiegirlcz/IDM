package com.fourthline.orca.internal;

import com.fourthline.orca.internal.f11;
import com.fourthline.orca.internal.g11;
import com.fourthline.orca.internal.h11;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class m11 implements ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mq0 f30920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fe1 f30921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aq0 f30922c;
    private final qg0 d;

    public m11(mq0 presenter, fe1 viewNavigator, aq0 popupHandler, qg0 analytics) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f30920a = presenter;
        this.f30921b = viewNavigator;
        this.f30922c = popupHandler;
        this.d = analytics;
    }

    private final void b() {
        this.d.track(f11.a.C0193a.f28316b);
        this.f30921b.b(g11.a.f28733a);
    }

    private final void c() {
        this.d.track(f11.a.c.f28318b);
        this.f30921b.b(g11.b.f28734a);
    }

    private final void d() {
        this.d.track(f11.a.b.f28317b);
    }

    public final mq0 a() {
        return this.f30920a;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(h11 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof h11.c) {
            d();
        } else if (event instanceof h11.a) {
            b();
        } else {
            if (!(event instanceof h11.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c();
        }
    }
}
