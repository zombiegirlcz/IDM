package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.orca.internal.au;
import com.fourthline.orca.internal.ju;
import com.fourthline.orca.internal.yt;
import com.fourthline.orca.internal.zt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class mu implements ax, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f31264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f31265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mq0 f31266c;
    private final wr d;
    private final fe1 e;
    private final lu f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final hu f31267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final qg0 f31268h;
    private final aq0 i;

    public mu(Context context, mq0 presenter, wr effectHandler, fe1 viewNavigator, lu stateProvider, hu repository, qg0 analytics, aq0 popupHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f31264a = coroutineScope;
        this.f31265b = context;
        this.f31266c = presenter;
        this.d = effectHandler;
        this.e = viewNavigator;
        this.f = stateProvider;
        this.f31267g = repository;
        this.f31268h = analytics;
        this.i = popupHandler;
    }

    private final void c() {
        this.d.a(new wp1(4));
        this.e.b(zt.c.a.f35715a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zt d() {
        return zt.b.f35714a;
    }

    private final void e() {
        this.f31268h.track(yt.a.C0319a.f35436b);
        c();
    }

    private final void f() {
        ng0.a(this.f31265b);
    }

    private final void g() {
        c();
    }

    private final void h() {
        this.f31268h.track(yt.a.c.f35438b);
        if (!Intrinsics.f(this.f31267g.b(), this.f31267g.a())) {
            this.e.b(zt.c.b.f35716a);
            return;
        }
        final int i = 0;
        final int i2 = 1;
        this.i.a(ju.a.C0231a.f30040a, new Function0(this) { // from class: com.fourthline.orca.internal.zp1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ mu f35690b;

            {
                this.f35690b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return mu.a(this.f35690b);
                    default:
                        return mu.b(this.f35690b);
                }
            }
        }, new Function0(this) { // from class: com.fourthline.orca.internal.zp1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ mu f35690b;

            {
                this.f35690b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return mu.a(this.f35690b);
                    default:
                        return mu.b(this.f35690b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zt i() {
        return zt.a.f35713a;
    }

    private final void j() {
        this.d.a(new wp1(3));
        this.f31266c.a(this.f.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zt k() {
        return zt.b.f35714a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zt l() {
        return zt.b.f35714a;
    }

    private final void m() {
        this.f31268h.track(yt.a.b.f35437b);
        this.d.a(new wp1(2));
        this.f31266c.a(this.f.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zt n() {
        return zt.a.f35713a;
    }

    public final mq0 b() {
        return this.f31266c;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f31264a.getF74819h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(mu muVar) {
        muVar.e.b(zt.c.b.f35716a);
        return Unit.f186387a;
    }

    public final wr a() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(au event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof au.a) {
            e();
            return;
        }
        if (event instanceof au.d) {
            h();
            return;
        }
        if (event instanceof au.b) {
            f();
            return;
        }
        if (event instanceof au.g) {
            m();
            return;
        }
        if (event instanceof au.e) {
            j();
        } else if (event instanceof au.f) {
            a(((au.f) event).a());
        } else {
            if (!(event instanceof au.c)) {
                throw new NoWhenBranchMatchedException();
            }
            g();
        }
    }

    private final void a(String str) {
        this.d.a(new wp1(1));
        this.f31267g.a(str);
        this.f31266c.a(this.f.s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(mu muVar) {
        muVar.f31267g.a("");
        muVar.d.a(new wp1(5));
        muVar.f31266c.a(muVar.f.k());
        return Unit.f186387a;
    }
}
