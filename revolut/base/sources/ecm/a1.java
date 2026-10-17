package ecm;

import com.google.common.base.Preconditions;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f124776b = new a("internal:health-checking-config");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q1 f124777c;
    public static final a d;
    public static final a e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f124778a;

    static {
        Preconditions.checkNotNull("internal:health-check-consumer-listener", "debugString");
        f124777c = new q1(2);
        d = new a("internal:has-health-check-producer-listener");
        e = new a("io.grpc.IS_PETIOLE_POLICY");
    }

    public g2 a(w0 w0Var) {
        List list = w0Var.f124889a;
        if (!list.isEmpty() || b()) {
            int i = this.f124778a;
            this.f124778a = i + 1;
            if (i == 0) {
                d(w0Var);
            }
            this.f124778a = 0;
            return g2.e;
        }
        g2 g2VarG = g2.f124807m.g("NameResolver returned no usable address. addrs=" + list + ", attrs=" + w0Var.f124890b);
        c(g2VarG);
        return g2VarG;
    }

    public boolean b() {
        return false;
    }

    public abstract void c(g2 g2Var);

    public void d(w0 w0Var) {
        int i = this.f124778a;
        this.f124778a = i + 1;
        if (i == 0) {
            a(w0Var);
        }
        this.f124778a = 0;
    }

    public void e() {
    }

    public abstract void f();
}
