package com.fourthline.orca.internal;

import com.fourthline.orca.internal.q2;
import com.fourthline.orca.internal.rh;
import com.fourthline.orca.internal.xh;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ci implements ax {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f27462g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f27463h = 8;
    private static final String i = "document_country";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mq0 f27464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wr f27465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fe1 f27466c;
    private final qg0 d;
    private final yh e;
    private final ax f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return ci.i;
        }

        private a() {
        }
    }

    public ci(mq0 presenter, wr effectHandler, fe1 viewNavigator, qg0 analytics, yh repository, ax delegate) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f27464a = presenter;
        this.f27465b = effectHandler;
        this.f27466c = viewNavigator;
        this.d = analytics;
        this.e = repository;
        this.f = delegate;
    }

    private final void d() {
        this.d.track(rh.a.C0276a.f32728b);
        this.f27466c.b(xh.a.f34992a);
    }

    private final void e() {
        fd fdVarA = this.e.a();
        if (fdVarA != null) {
            this.d.track(new rh.a.d(fdVarA));
        }
        this.f27466c.b(xh.c.f34994a);
    }

    private final void f() {
        this.d.track(rh.a.c.f32730b);
    }

    public final wr b() {
        return this.f27465b;
    }

    public final mq0 c() {
        return this.f27464a;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(q2 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof q2.h) {
            f();
        } else if (event instanceof q2.g) {
            e();
        } else if (event instanceof q2.a) {
            d();
        }
        this.f.a(event);
    }
}
