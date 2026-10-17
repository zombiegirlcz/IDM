package ix0;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n1 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h30.q f169266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f169267b;

    public n1(h30.q qVar, Long l2) {
        this.f169266a = qVar;
        this.f169267b = l2;
    }

    public final void a(Object obj2) {
        Object obj3;
        Context contextI;
        Context contextI2;
        Object obj4;
        long j2;
        Long l2 = this.f169267b;
        if (l2 != null) {
            long jLongValue = l2.longValue();
            h30.q qVar = this.f169266a;
            if (qVar != null) {
                Context context = (Context) qVar.e;
                Object obj5 = qVar.f148941b;
                r1 r1Var = (r1) qVar.d;
                q1 q1VarA = r1Var.a();
                if (q1VarA == null || (obj3 = q1VarA.f169282b) == null) {
                    obj3 = obj5;
                }
                if (q1VarA == null || (contextI = (Context) q1VarA.d.get()) == null) {
                    contextI = z92.f.i(context);
                }
                Stack stack = r1Var.f169286b;
                int i = 0;
                for (Object obj6 : stack) {
                    int i2 = i + 1;
                    if (i < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    q1 q1Var = (q1) obj6;
                    long j3 = q1Var.f169281a;
                    if (j3 == jLongValue) {
                        o1 priority = q1Var.f169283c;
                        WeakReference context2 = q1Var.d;
                        j2 = jLongValue;
                        Intrinsics.checkNotNullParameter(priority, "priority");
                        Intrinsics.checkNotNullParameter(context2, "context");
                        stack.set(i, new q1(j3, obj2, priority, context2));
                    } else {
                        j2 = jLongValue;
                    }
                    i = i2;
                    jLongValue = j2;
                }
                q1 q1VarA2 = r1Var.a();
                if (q1VarA2 != null && (obj4 = q1VarA2.f169282b) != null) {
                    obj5 = obj4;
                }
                if ((q1VarA2 == null || (contextI2 = (Context) q1VarA2.d.get()) == null) && (contextI2 = z92.f.i(context)) == null) {
                    return;
                }
                if (Intrinsics.f(obj3, obj5) && contextI != null && kli.a.q(contextI) == kli.a.q(contextI2)) {
                    return;
                }
                ((p1) qVar.f148942c).f(obj5, contextI2);
            }
        }
    }

    public final void b() {
        Object obj2;
        Context contextI;
        Context contextI2;
        Object obj3;
        Long l2 = this.f169267b;
        if (l2 != null) {
            long jLongValue = l2.longValue();
            h30.q qVar = this.f169266a;
            if (qVar != null) {
                Context context = (Context) qVar.e;
                Object obj4 = qVar.f148941b;
                r1 r1Var = (r1) qVar.d;
                q1 q1VarA = r1Var.a();
                if (q1VarA == null || (obj2 = q1VarA.f169282b) == null) {
                    obj2 = obj4;
                }
                if (q1VarA == null || (contextI = (Context) q1VarA.d.get()) == null) {
                    contextI = z92.f.i(context);
                }
                zhm.a0.E(r1Var.f169286b, new a82.r(jLongValue, 18));
                q1 q1VarA2 = r1Var.a();
                if (q1VarA2 != null && (obj3 = q1VarA2.f169282b) != null) {
                    obj4 = obj3;
                }
                if ((q1VarA2 == null || (contextI2 = (Context) q1VarA2.d.get()) == null) && (contextI2 = z92.f.i(context)) == null) {
                    return;
                }
                if (Intrinsics.f(obj2, obj4) && contextI != null && kli.a.q(contextI) == kli.a.q(contextI2)) {
                    return;
                }
                ((p1) qVar.f148942c).f(obj4, contextI2);
            }
        }
    }
}
