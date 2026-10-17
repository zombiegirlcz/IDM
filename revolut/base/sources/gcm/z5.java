package gcm;

import com.google.common.base.Preconditions;
import com.google.common.base.Verify;
import com.google.common.base.VerifyException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public abstract class z5 implements f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ecm.a f143012a = new ecm.a("io.grpc.internal.GrpcAttributes.securityLevel");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ecm.a f143013b = new ecm.a("io.grpc.internal.GrpcAttributes.clientEagAttrs");

    public static r2 l() {
        return w4.e == null ? new w4() : new f61.a();
    }

    public static Set m(String str, Map map) {
        ecm.e2 e2VarValueOf;
        List listC = k2.c(str, map);
        if (listC == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(ecm.e2.class);
        for (Object obj2 : listC) {
            if (obj2 instanceof Double) {
                Double d = (Double) obj2;
                int iIntValue = d.intValue();
                Verify.verify(((double) iIntValue) == d.doubleValue(), "Status code %s is not integral", obj2);
                e2VarValueOf = ecm.g2.c(iIntValue).f124809a;
                Verify.verify(e2VarValueOf.c() == d.intValue(), "Status code %s is not valid", obj2);
            } else {
                if (!(obj2 instanceof String)) {
                    throw new VerifyException("Can not convert status code " + obj2 + " to Status.Code, because its type is " + obj2.getClass());
                }
                try {
                    e2VarValueOf = ecm.e2.valueOf((String) obj2);
                } catch (IllegalArgumentException e) {
                    throw new VerifyException(v0.a.h(obj2, "Status code ", " is not valid"), e);
                }
            }
            enumSetNoneOf.add(e2VarValueOf);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    public static List n(Map map) {
        String strH;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            List listC = k2.c("loadBalancingConfig", map);
            if (listC == null) {
                listC = null;
            } else {
                k2.a(listC);
            }
            arrayList.addAll(listC);
        }
        if (arrayList.isEmpty() && (strH = k2.h("loadBalancingPolicy", map)) != null) {
            arrayList.add(Collections.singletonMap(strH.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static ecm.s1 q(List list, ecm.c1 c1Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            x5 x5Var = (x5) it8.next();
            String strA = x5Var.a();
            ecm.b1 b1VarB = c1Var.b(strA);
            if (b1VarB != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(z5.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                ecm.s1 s1VarC = b1VarB.c(x5Var.b());
                return s1VarC.f124873a != null ? s1VarC : new ecm.s1(new y5(b1VarB, s1VarC.f124874b));
            }
            arrayList.add(strA);
        }
        return new ecm.s1(ecm.g2.f124803g.g("None of " + arrayList + " specified by Service Config are available."));
    }

    public static List r(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            Map map = (Map) it8.next();
            if (map.size() != 1) {
                throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
            }
            String str = (String) ((Map.Entry) map.entrySet().iterator().next()).getKey();
            arrayList.add(new x5(str, k2.g(str, map)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // gcm.f6
    public void b(ecm.o oVar) {
        ((c) this).d.b((ecm.o) Preconditions.checkNotNull(oVar, "compressor"));
    }

    @Override // gcm.f6
    public void c(kcm.a aVar) {
        Preconditions.checkNotNull(aVar, "message");
        try {
            if (!((c) this).d.isClosed()) {
                ((c) this).d.c(aVar);
            }
        } finally {
            p1.b(aVar);
        }
    }

    @Override // gcm.f6
    public void f() {
        hcm.o oVar = ((hcm.p) this).f151304n;
        w3 w3Var = oVar.d;
        w3Var.f142916a = oVar;
        oVar.f142572a = w3Var;
    }

    @Override // gcm.f6
    public void flush() {
        j1 j1Var = ((c) this).d;
        if (j1Var.isClosed()) {
            return;
        }
        j1Var.flush();
    }

    public abstract boolean o(w5 w5Var);

    public abstract void p(w5 w5Var);

    @Override // gcm.f6
    public void request() {
        hcm.o oVar = ((hcm.p) this).f151304n;
        oVar.getClass();
        dfm.b.b();
        com.bumptech.glide.k kVar = new com.bumptech.glide.k(oVar, 2);
        synchronized (oVar.f151298x) {
            kVar.run();
        }
    }
}
