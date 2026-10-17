package f9;

import com.fasterxml.jackson.core.n;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.a2;
import skm.d0;
import skm.e0;
import vge.f0;
import vge.g0;
import vge.t3;
import vge.u2;

/* JADX INFO: loaded from: classes16.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f132795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f132796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f132797c;
    public Object d = null;
    public Object e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Serializable f132798g;

    public d(Object obj2, n nVar) {
        this.f132795a = obj2;
        this.f132798g = nVar;
    }

    public void a(g0 g0Var) {
        a2 a2Var;
        Object obj2 = new Object();
        a2 a2VarC = e0.C((CoroutineScope) this.f132797c, null, d0.LAZY, new uvf.b(this, g0Var, obj2, false, null, 23), 1);
        u2 u2Var = new u2(obj2, null, a2VarC);
        synchronized (this.f132795a) {
            try {
                this.f132796b = true;
                u2 u2Var2 = (u2) this.e;
                a2Var = u2Var2 != null ? u2Var2.f289032c : null;
                this.e = u2Var;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (a2Var != null) {
            a2Var.f(null);
        }
        a2VarC.start();
    }

    public void b(vge.b observation) throws Throwable {
        Throwable th10;
        a2 a2Var;
        Intrinsics.checkNotNullParameter(observation, "observation");
        synchronized (this.f132795a) {
            try {
                if (((LinkedHashMap) this.f132798g).get(observation.f288868a) != observation) {
                    return;
                }
                try {
                    Pair pair = (Pair) ((Data) ((t3) this.d).o.getValue()).getContent();
                    Continuation continuation = null;
                    if (!Intrinsics.f(pair != null ? (ProductAccountDescriptor$Value) pair.f186385a : null, observation.f288868a)) {
                        return;
                    }
                    u2 u2Var = (u2) this.e;
                    if ((u2Var != null ? u2Var.f289031b : null) == observation) {
                        return;
                    }
                    if (u2Var == null) {
                        a2Var = null;
                    } else {
                        if (u2Var.f289031b == null) {
                            this.f = observation;
                            return;
                        }
                        a2Var = u2Var.f289032c;
                    }
                    this.f132796b = true;
                    f0 f0Var = new f0(observation.f288868a, observation.f288869b);
                    Object obj2 = new Object();
                    try {
                        a2 a2VarC = e0.C((CoroutineScope) this.f132797c, null, d0.LAZY, new uvf.b(this, f0Var, obj2, false, continuation, 23), 1);
                        this.e = new u2(obj2, observation, a2VarC);
                        if (a2Var != null) {
                            a2Var.f(null);
                        }
                        a2VarC.start();
                        return;
                    } catch (Throwable th11) {
                        th = th11;
                    }
                } catch (Throwable th12) {
                    th10 = th12;
                }
            } catch (Throwable th13) {
                th = th13;
            }
            th10 = th;
            throw th10;
        }
    }
}
