package gcm;

import com.google.common.base.Preconditions;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class s5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f142870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f142871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f142872c;
    public final k d;

    public s5(boolean z, int i, int i2, k kVar) {
        this.f142870a = z;
        this.f142871b = i;
        this.f142872c = i2;
        this.d = (k) Preconditions.checkNotNull(kVar, "autoLoadBalancerFactory");
    }

    public final ecm.s1 a(Map map) {
        List listR;
        ecm.s1 s1Var;
        try {
            k kVar = this.d;
            kVar.getClass();
            Object obj2 = null;
            if (map != null) {
                try {
                    listR = z5.r(z5.n(map));
                } catch (RuntimeException e) {
                    s1Var = new ecm.s1(ecm.g2.f124803g.g("can't parse load balancer configuration").f(e));
                }
            } else {
                listR = null;
            }
            s1Var = (listR == null || listR.isEmpty()) ? null : z5.q(listR, kVar.f142702a);
            if (s1Var != null) {
                ecm.g2 g2Var = s1Var.f124873a;
                if (g2Var != null) {
                    return new ecm.s1(g2Var);
                }
                obj2 = s1Var.f124874b;
            }
            return new ecm.s1(q3.a(map, this.f142870a, this.f142871b, this.f142872c, obj2));
        } catch (RuntimeException e2) {
            return new ecm.s1(ecm.g2.f124803g.g("failed to parse service config").f(e2));
        }
    }
}
