package com.fourthline.orca.internal;

import com.fourthline.orca.internal.j30;
import com.fourthline.orca.internal.r30;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class e40 implements ax {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f27990h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qg0 f27991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f27992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d40 f27993c;
    private final fe1 d;
    private final q30 e;
    private final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f27994g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements e {
        @Override // com.fourthline.orca.internal.e40.e
        public void a(e40 e40Var) {
            Intrinsics.checkNotNullParameter(e40Var, "<this>");
        }
    }

    public interface c {
        void a(e40 e40Var);
    }

    public static final class d implements c {
        @Override // com.fourthline.orca.internal.e40.c
        public void a(e40 e40Var) {
            Intrinsics.checkNotNullParameter(e40Var, "<this>");
            e40Var.d().b(e40Var.a().b());
        }
    }

    public interface e {
        void a(e40 e40Var);
    }

    public e40(qg0 analytics, mq0 presenter, d40 stateProvider, fe1 viewNavigator, q30 navigationDestinations, e startScreenHandler, c finishScreenHandler) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(navigationDestinations, "navigationDestinations");
        Intrinsics.checkNotNullParameter(startScreenHandler, "startScreenHandler");
        Intrinsics.checkNotNullParameter(finishScreenHandler, "finishScreenHandler");
        this.f27991a = analytics;
        this.f27992b = presenter;
        this.f27993c = stateProvider;
        this.d = viewNavigator;
        this.e = navigationDestinations;
        this.f = startScreenHandler;
        this.f27994g = finishScreenHandler;
    }

    private final void e() {
        this.f27991a.track(j30.a.C0221a.f29792b);
        this.d.b(this.e.a());
    }

    private final void f() {
        this.f27991a.track(j30.a.c.f29794b);
        this.f27994g.a(this);
    }

    private final void g() {
        this.f27991a.track(j30.a.b.f29793b);
        this.f.a(this);
    }

    public final mq0 b() {
        return this.f27992b;
    }

    public final d40 c() {
        return this.f27993c;
    }

    public final fe1 d() {
        return this.d;
    }

    public final q30 a() {
        return this.e;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(r30 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof r30.a) {
            e();
        } else if (event instanceof r30.b) {
            f();
        } else {
            if (!(event instanceof r30.c)) {
                throw new NoWhenBranchMatchedException();
            }
            g();
        }
    }

    public /* synthetic */ e40(qg0 qg0Var, mq0 mq0Var, d40 d40Var, fe1 fe1Var, q30 q30Var, e eVar, c cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(qg0Var, mq0Var, d40Var, fe1Var, q30Var, (i & 32) != 0 ? new b() : eVar, (i & 64) != 0 ? new d() : cVar);
    }
}
