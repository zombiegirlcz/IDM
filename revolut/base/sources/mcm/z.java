package mcm;

import com.google.common.base.Preconditions;
import ecm.a1;
import ecm.b1;
import ecm.c1;
import ecm.g2;
import ecm.s1;
import ecm.u0;
import gcm.k2;
import gcm.y5;
import gcm.z5;
import io.grpc.StatusRuntimeException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public final class z extends b1 {
    public static s1 d(Map map) {
        Long l2;
        Long l3;
        Long l4;
        Integer num;
        r rVar;
        r rVar2;
        s1 s1Var;
        Integer num2;
        Integer num3 = 5;
        Integer num4 = 100;
        Long lI = k2.i("interval", map);
        Long lI2 = k2.i("baseEjectionTime", map);
        Long lI3 = k2.i("maxEjectionTime", map);
        Integer numF = k2.f("maxEjectionPercentage", map);
        if (lI != null) {
            Preconditions.checkArgument(true);
            l2 = lI;
        } else {
            l2 = 10000000000L;
        }
        if (lI2 != null) {
            Preconditions.checkArgument(true);
            l3 = lI2;
        } else {
            l3 = 30000000000L;
        }
        if (lI3 != null) {
            Preconditions.checkArgument(true);
            l4 = lI3;
        } else {
            l4 = 300000000000L;
        }
        if (numF != null) {
            Preconditions.checkArgument(true);
            num = numF;
        } else {
            num = 10;
        }
        Map mapG = k2.g("successRateEjection", map);
        List list = null;
        if (mapG != null) {
            Integer num5 = 1900;
            Integer numF2 = k2.f("stdevFactor", mapG);
            Integer numF3 = k2.f("enforcementPercentage", mapG);
            Integer numF4 = k2.f("minimumHosts", mapG);
            Integer numF5 = k2.f("requestVolume", mapG);
            if (numF2 != null) {
                Preconditions.checkArgument(true);
                num5 = numF2;
            }
            if (numF3 != null) {
                Preconditions.checkArgument(true);
                Preconditions.checkArgument(numF3.intValue() >= 0 && numF3.intValue() <= 100);
            } else {
                numF3 = num4;
            }
            if (numF4 != null) {
                Preconditions.checkArgument(true);
                Preconditions.checkArgument(numF4.intValue() >= 0);
                num2 = numF4;
            } else {
                num2 = num3;
            }
            if (numF5 != null) {
                Preconditions.checkArgument(true);
                Preconditions.checkArgument(numF5.intValue() >= 0);
            } else {
                numF5 = num4;
            }
            rVar = new r(num5, numF3, num2, numF5);
        } else {
            rVar = null;
        }
        Map mapG2 = k2.g("failurePercentageEjection", map);
        if (mapG2 != null) {
            Integer num6 = 85;
            Integer num7 = 50;
            Integer numF6 = k2.f("threshold", mapG2);
            Integer numF7 = k2.f("enforcementPercentage", mapG2);
            Integer numF8 = k2.f("minimumHosts", mapG2);
            Integer numF9 = k2.f("requestVolume", mapG2);
            if (numF6 != null) {
                Preconditions.checkArgument(true);
                Preconditions.checkArgument(numF6.intValue() >= 0 && numF6.intValue() <= 100);
                num6 = numF6;
            }
            if (numF7 != null) {
                Preconditions.checkArgument(true);
                Preconditions.checkArgument(numF7.intValue() >= 0 && numF7.intValue() <= 100);
                num4 = numF7;
            }
            if (numF8 != null) {
                Preconditions.checkArgument(true);
                Preconditions.checkArgument(numF8.intValue() >= 0);
                num3 = numF8;
            }
            if (numF9 != null) {
                Preconditions.checkArgument(true);
                Preconditions.checkArgument(numF9.intValue() >= 0);
                num7 = numF9;
            }
            rVar2 = new r(num6, num4, num3, num7);
        } else {
            rVar2 = null;
        }
        List listC = k2.c("childPolicy", map);
        if (listC != null) {
            k2.a(listC);
            list = listC;
        }
        g gVar = i.o;
        c1 c1VarA = c1.a();
        List listR = z5.r(list);
        if (listR == null || listR.isEmpty()) {
            s1Var = new s1(g2.f124806l.g("No child LB config specified"));
        } else {
            s1 s1VarQ = z5.q(listR, c1VarA);
            g2 g2Var = s1VarQ.f124873a;
            if (g2Var != null) {
                s1Var = new s1(g2.f124806l.f(g2Var.f124811c).g(g2Var.f124810b).a("Failed to select child config"));
            } else {
                y5 y5Var = (y5) s1VarQ.f124874b;
                s1Var = new s1(new h(y5Var.f142978a, y5Var.f142979b));
            }
        }
        g2 g2Var2 = s1Var.f124873a;
        if (g2Var2 != null) {
            return new s1(g2.f124806l.g("Failed to parse child in outlier_detection_experimental: " + map).f(new StatusRuntimeException(g2Var2)));
        }
        Object obj2 = s1Var.f124874b;
        Preconditions.checkState(obj2 != null);
        Preconditions.checkState(obj2 != null);
        return new s1(new s(l2, l3, l4, num, rVar, rVar2, obj2));
    }

    @Override // ecm.s0
    public final a1 a(u0 u0Var) {
        return new y(u0Var);
    }

    @Override // ecm.b1
    public final String b() {
        return "outlier_detection_experimental";
    }

    @Override // ecm.b1
    public final s1 c(Map map) {
        try {
            return d(map);
        } catch (RuntimeException e) {
            return new s1(g2.f124807m.f(e).g("Failed parsing configuration for outlier_detection_experimental"));
        }
    }
}
