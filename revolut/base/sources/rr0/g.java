package rr0;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import ix0.h1;
import ix0.l2;
import ix0.o2;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ox0.v;
import ox0.w;

/* JADX INFO: loaded from: classes.dex */
public final class g implements l2, sy0.a, fu0.b {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f256614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f256615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f256616c;
    public fu0.e d;
    public fu0.h e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f256617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f256618h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f256619j;
    public final o6.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o2 f256620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public nq0.a f256621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f256622n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f256623p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ag.q f256624q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f256625r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f256626s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ihm.f f256627t;
    public final ihm.b u;
    public long v;

    public g(View hostView, d callback, boolean z) {
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f256614a = hostView;
        this.f256615b = callback;
        this.f256616c = z;
        this.f256618h = -1;
        this.i = true;
        this.k = new o6.a(this, 21);
        this.f256620l = new o2(hostView, this);
        this.f256627t = v0.a.d("create(...)");
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.u = bVarE;
    }

    public static final void b(g gVar, boolean z) {
        ag.q qVar = gVar.f256624q;
        if ((qVar != null ? false : gVar.f) == z) {
            return;
        }
        if (qVar != null) {
            h1.e(qVar);
            gVar.f256624q = null;
        }
        if (z) {
            gVar.e(true);
            return;
        }
        ag.q runnable = new ag.q(gVar, 29);
        gVar.f256624q = runnable;
        Lazy lazy = h1.f169241a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        h1.a().postAtFrontOfQueue(runnable);
    }

    public static void h(g gVar, boolean z, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = gVar.f256625r;
        }
        if ((i & 2) != 0) {
            z3 = gVar.f256626s;
        }
        boolean z4 = gVar.f256626s || gVar.f256625r;
        gVar.f256625r = z;
        gVar.f256626s = z3;
        boolean z6 = z3 || z;
        if (z4 != z6) {
            gVar.f256615b.L(z6);
            gVar.f256627t.onNext(Boolean.valueOf(z6));
        }
    }

    @Override // sy0.a
    public final f V() {
        return new f(new WeakReference(this));
    }

    @Override // ix0.l2
    public final void a(boolean z) {
        int i;
        fu0.e eVar;
        if (this.f256622n != -1) {
            nq0.a aVarA = this.f256621m;
            if (aVarA == null) {
                v vVar = w.Companion;
                Context context = this.f256614a.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                vVar.getClass();
                aVarA = v.a(context);
                this.f256621m = aVarA;
            }
            LinkedHashMap linkedHashMap = aVarA.f218340a;
            Intrinsics.checkNotNullParameter(this, "button");
            if (!z) {
                nq0.b bVar = (nq0.b) linkedHashMap.remove(this);
                if (bVar != null) {
                    bVar.c();
                }
            } else if (!linkedHashMap.containsKey(this)) {
                linkedHashMap.put(this, new nq0.b(this));
            }
        }
        if (z && this.f256617g > 0) {
            g();
        }
        if (!z && this.f256617g > 0 && (eVar = this.d) != null) {
            eVar.a(false);
        }
        if (!z || (i = this.f256618h) == -1) {
            return;
        }
        this.f256618h = -1;
        c(i);
    }

    public final void b0() {
        if (this.f256622n != -1) {
            o2 o2Var = this.f256620l;
            o2Var.c();
            if (o2Var.f169272c) {
                nq0.a aVarA = this.f256621m;
                if (aVarA == null) {
                    v vVar = w.Companion;
                    Context context = this.f256614a.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    vVar.getClass();
                    aVarA = v.a(context);
                    this.f256621m = aVarA;
                }
                Intrinsics.checkNotNullParameter(this, "button");
                if (aVarA.f218342c > 0) {
                    return;
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                nq0.b bVar = (nq0.b) aVarA.f218340a.get(this);
                if (bVar != null) {
                    bVar.e(jUptimeMillis);
                }
            }
        }
    }

    public final void c(int i) {
        int i2;
        o2 o2Var = this.f256620l;
        if (!o2Var.f169272c) {
            this.f256618h = i;
            return;
        }
        while (true) {
            i2 = this.f256617g;
            if (i2 == i) {
                break;
            }
            this.f256617g = i;
            fu0.e eVar = this.d;
            boolean z = this.f256619j;
            o6.a aVar = this.k;
            View view = this.f256614a;
            if (z) {
                this.f256619j = false;
                view.removeCallbacks(aVar);
            }
            boolean z3 = this.f256616c;
            if (i != 0) {
                if (i == 1) {
                    if (z3) {
                        Context context = view.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        fu0.e eVar2 = new fu0.e(context);
                        eVar2.setCallback(this);
                        this.d = eVar2;
                        if (eVar != null) {
                            eVar.a(false);
                        }
                        g();
                    }
                    if (this.i) {
                        this.f256619j = true;
                        view.postDelayed(aVar, 500L);
                    } else {
                        i = 2;
                    }
                } else if (i == 2) {
                    h(this, true, false, 2);
                } else if (i == 3) {
                    if (i2 < 2) {
                        h(this, true, false, 2);
                    }
                    fu0.e eVar3 = this.d;
                    if (eVar3 != null) {
                        eVar3.d();
                    }
                }
            } else if (z3) {
                this.d = null;
                if (eVar != null && eVar.c()) {
                    h(this, false, false, 2);
                } else if (eVar != null) {
                    eVar.a(i2 > 2);
                }
            } else {
                h(this, false, false, 2);
            }
        }
        if (this.v == 0 && i2 <= 0 && this.f256618h == -1) {
            o2Var.f();
        }
    }

    public final void d(fu0.e view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i = this.f256618h;
        if (i < 0) {
            i = this.f256617g;
        }
        if (!Intrinsics.f(this.d, view) || 1 > i || i >= 3) {
            return;
        }
        c(3);
    }

    public final void e(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        this.u.onNext(Boolean.valueOf(z));
        this.f256620l.c();
        if (z) {
            c(1);
        } else {
            c(0);
        }
    }

    public final void f(fu0.h target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.e = target;
        fu0.e eVar = this.d;
        if (eVar != null) {
            eVar.setTarget(target);
        }
    }

    public final void g() {
        fu0.e eVar = this.d;
        if (eVar == null) {
            return;
        }
        View view = this.f256614a;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (z92.f.i(context) == null) {
            return;
        }
        eVar.e(jb3.l.j(js0.f.Companion, view));
        if (this.e == null) {
            this.e = new twg.c(view);
        }
        eVar.setTarget(this.e);
    }
}
