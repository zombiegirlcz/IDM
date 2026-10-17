package ecm;

import com.google.common.base.Preconditions;
import gcm.p4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f124784c;
    public static c1 d;
    public static final List e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f124785a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f124786b = new LinkedHashMap();

    static {
        Logger logger = Logger.getLogger(c1.class.getName());
        f124784c = logger;
        ArrayList arrayList = new ArrayList();
        try {
            boolean z = p4.f142828a;
            arrayList.add(p4.class);
        } catch (ClassNotFoundException e2) {
            logger.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e2);
        }
        try {
            int i = mcm.d0.f204378a;
            arrayList.add(mcm.d0.class);
        } catch (ClassNotFoundException e4) {
            logger.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e4);
        }
        e = Collections.unmodifiableList(arrayList);
    }

    public static synchronized c1 a() {
        try {
            if (d == null) {
                List<b1> listI = e0.i(b1.class, e, b1.class.getClassLoader(), new q1(4));
                d = new c1();
                for (b1 b1Var : listI) {
                    f124784c.fine("Service loader found " + b1Var);
                    c1 c1Var = d;
                    synchronized (c1Var) {
                        b1Var.getClass();
                        Preconditions.checkArgument(true, "isAvailable() returned false");
                        c1Var.f124785a.add(b1Var);
                    }
                }
                d.c();
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return d;
    }

    public final synchronized b1 b(String str) {
        return (b1) this.f124786b.get(Preconditions.checkNotNull(str, "policy"));
    }

    public final synchronized void c() {
        this.f124786b.clear();
        for (b1 b1Var : this.f124785a) {
            String strB = b1Var.b();
            if (((b1) this.f124786b.get(strB)) == null) {
                this.f124786b.put(strB, b1Var);
            }
        }
    }
}
