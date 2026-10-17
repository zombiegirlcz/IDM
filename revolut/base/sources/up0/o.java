package up0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class o {

    @NotNull
    private static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qr0.i f281748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f281749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f281750c;
    public final g d;

    /* JADX WARN: Type inference failed for: r2v2, types: [up0.g] */
    /* JADX WARN: Type inference failed for: r2v3, types: [up0.g] */
    public o(qr0.i delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f281748a = delegate;
        this.f281749b = new k(null);
        final int i = 0;
        this.f281750c = new Runnable(this) { // from class: up0.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f281713b;

            {
                this.f281713b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        o oVar = this.f281713b;
                        n nVar = oVar.f281749b;
                        l lVar = nVar instanceof l ? (l) nVar : null;
                        if (lVar != null) {
                            a0 a0Var = lVar.f281731b;
                            oVar.a(a0Var.f281676c, p0.ACCOUNT_SWITCH_IN);
                            oVar.f281749b = new m(a0Var);
                            break;
                        }
                        break;
                    default:
                        o oVar2 = this.f281713b;
                        n nVar2 = oVar2.f281749b;
                        j jVar = nVar2 instanceof j ? (j) nVar2 : null;
                        if (jVar != null) {
                            a0 a0Var2 = jVar.f281726b;
                            oVar2.a(a0Var2.f281676c, a0Var2.f281675b.compareTo(jVar.f281725a.f281675b) >= 0 ? p0.BALANCE_INCREASE : p0.BALANCE_DECREASE);
                            oVar2.f281749b = new m(a0Var2);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.d = new Runnable(this) { // from class: up0.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f281713b;

            {
                this.f281713b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        o oVar = this.f281713b;
                        n nVar = oVar.f281749b;
                        l lVar = nVar instanceof l ? (l) nVar : null;
                        if (lVar != null) {
                            a0 a0Var = lVar.f281731b;
                            oVar.a(a0Var.f281676c, p0.ACCOUNT_SWITCH_IN);
                            oVar.f281749b = new m(a0Var);
                            break;
                        }
                        break;
                    default:
                        o oVar2 = this.f281713b;
                        n nVar2 = oVar2.f281749b;
                        j jVar = nVar2 instanceof j ? (j) nVar2 : null;
                        if (jVar != null) {
                            a0 a0Var2 = jVar.f281726b;
                            oVar2.a(a0Var2.f281676c, a0Var2.f281675b.compareTo(jVar.f281725a.f281675b) >= 0 ? p0.BALANCE_INCREASE : p0.BALANCE_DECREASE);
                            oVar2.f281749b = new m(a0Var2);
                            break;
                        }
                        break;
                }
            }
        };
    }

    public final void a(b configuration, p0 transition) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(transition, "transition");
        d0 d0Var = (d0) this.f281748a.f248595b;
        d0Var.o = configuration;
        if (d0Var.f281697n == h01.c.HIDDEN && d0Var.d.c()) {
            return;
        }
        d0Var.f281698p = configuration;
        d0Var.e().setBalanceConfiguration(configuration, transition);
    }

    public final void b(a0 a0Var) {
        g action = this.f281750c;
        Intrinsics.checkNotNullParameter(action, "action");
        d0 d0Var = (d0) this.f281748a.f248595b;
        d0Var.e().getView().removeCallbacks(action);
        g action2 = this.d;
        Intrinsics.checkNotNullParameter(action2, "action");
        d0Var.e().getView().removeCallbacks(action2);
        this.f281749b = i.f281716a;
        if (a0Var != null) {
            b.Companion.getClass();
            a(b.e, p0.ACCOUNT_SWITCH_OUT);
        }
    }

    public final boolean c() {
        return this.f281749b.a() != null;
    }

    public final void d(a0 a0Var, a0 a0Var2) {
        g action = this.f281750c;
        Intrinsics.checkNotNullParameter(action, "action");
        qr0.i iVar = this.f281748a;
        d0 d0Var = (d0) iVar.f248595b;
        d0Var.e().getView().removeCallbacks(action);
        g action2 = this.d;
        Intrinsics.checkNotNullParameter(action2, "action");
        d0Var.e().getView().removeCallbacks(action2);
        this.f281749b = new l(a0Var, a0Var2);
        a(a0Var.f281676c, p0.ACCOUNT_SWITCH_OUT);
        Intrinsics.checkNotNullParameter(action, "action");
        ((d0) iVar.f248595b).e().getView().postDelayed(action, (long) (r7.c().d * 0.7f));
    }
}
