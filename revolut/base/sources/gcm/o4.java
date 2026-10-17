package gcm;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes22.dex */
public final class o4 extends ecm.a1 {
    public final ecm.u0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ecm.x0 f142796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ecm.r f142797h = ecm.r.IDLE;

    public o4(ecm.u0 u0Var) {
        this.f = (ecm.u0) Preconditions.checkNotNull(u0Var, "helper");
    }

    @Override // ecm.a1
    public final ecm.g2 a(ecm.w0 w0Var) {
        Boolean bool;
        List list = w0Var.f124889a;
        if (list.isEmpty()) {
            ecm.g2 g2VarG = ecm.g2.f124807m.g("NameResolver returned no usable address. addrs=" + list + ", attrs=" + w0Var.f124890b);
            c(g2VarG);
            return g2VarG;
        }
        Object obj2 = w0Var.f124891c;
        if ((obj2 instanceof m4) && (bool = ((m4) obj2).f142772a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(list);
            Collections.shuffle(arrayList, new Random());
            list = arrayList;
        }
        ecm.x0 x0Var = this.f142796g;
        if (x0Var == null) {
            gpk.c cVarB = ecm.r0.b();
            cVarB.i(list);
            ecm.r0 r0Var = new ecm.r0((List) cVarB.f145463a, (ecm.b) cVarB.f145464b, (Object[][]) cVarB.f145465c);
            ecm.u0 u0Var = this.f;
            ecm.x0 x0VarA = u0Var.a(r0Var);
            x0VarA.h(new k4(this, x0VarA, 0));
            this.f142796g = x0VarA;
            ecm.r rVar = ecm.r.CONNECTING;
            n4 n4Var = new n4(ecm.v0.b(x0VarA, null));
            this.f142797h = rVar;
            u0Var.f(rVar, n4Var);
            x0VarA.f();
        } else {
            x0Var.i(list);
        }
        return ecm.g2.e;
    }

    @Override // ecm.a1
    public final void c(ecm.g2 g2Var) {
        ecm.x0 x0Var = this.f142796g;
        if (x0Var != null) {
            x0Var.g();
            this.f142796g = null;
        }
        ecm.r rVar = ecm.r.TRANSIENT_FAILURE;
        n4 n4Var = new n4(ecm.v0.a(g2Var));
        this.f142797h = rVar;
        this.f.f(rVar, n4Var);
    }

    @Override // ecm.a1
    public final void e() {
        ecm.x0 x0Var = this.f142796g;
        if (x0Var != null) {
            x0Var.f();
        }
    }

    @Override // ecm.a1
    public final void f() {
        ecm.x0 x0Var = this.f142796g;
        if (x0Var != null) {
            x0Var.g();
        }
    }
}
