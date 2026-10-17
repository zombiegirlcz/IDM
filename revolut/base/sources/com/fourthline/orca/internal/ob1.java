package com.fourthline.orca.internal;

import com.fourthline.orca.internal.db1;
import com.fourthline.orca.internal.fb1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class ob1 implements ax, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f31630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f31631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nb1 f31632c;
    private final fe1 d;
    private final hb1 e;
    private final jb1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final lb1 f31633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final db1 f31634h;
    private final aq0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Object f31635j;

    public ob1(mq0 presenter, nb1 stateProvider, fe1 viewNavigator, hb1 screenActions, jb1 finishScreenHandler, lb1 repository, db1 analytics, aq0 aq0Var, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(screenActions, "screenActions");
        Intrinsics.checkNotNullParameter(finishScreenHandler, "finishScreenHandler");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f31630a = coroutineScope;
        this.f31631b = presenter;
        this.f31632c = stateProvider;
        this.d = viewNavigator;
        this.e = screenActions;
        this.f = finishScreenHandler;
        this.f31633g = repository;
        this.f31634h = analytics;
        this.i = aq0Var;
    }

    private final void d() {
        this.f31634h.track((db1.a) db1.a.C0184a.f27694b);
        this.d.b(this.e.b().a());
    }

    private final void e() {
        aq0 aq0Var;
        hq0 hq0VarA = this.e.a();
        if (hq0VarA == null || (aq0Var = this.i) == null) {
            return;
        }
        aq0Var.a(hq0VarA);
    }

    private final void f() {
        Object obj2 = this.f31635j;
        if (obj2 != null) {
            this.f31634h.track((db1.a) new db1.a.b(obj2));
            this.f31633g.a(obj2);
            this.f.a(this, obj2);
        }
    }

    public final nb1 b() {
        return this.f31632c;
    }

    public final fe1 c() {
        return this.d;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f31630a.getCoroutineContext();
    }

    public final mq0 a() {
        return this.f31631b;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(fb1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof fb1.d) {
            return;
        }
        if (event instanceof fb1.e) {
            a(((fb1.e) event).a());
            return;
        }
        if (event instanceof fb1.c) {
            f();
        } else if (event instanceof fb1.a) {
            d();
        } else {
            if (!(event instanceof fb1.b)) {
                throw new NoWhenBranchMatchedException();
            }
            e();
        }
    }

    private final void a(Object obj2) {
        this.f31634h.track((db1.a) new db1.a.c(obj2));
        this.f31635j = obj2;
        this.f31631b.a(this.f31632c.a(obj2));
    }
}
