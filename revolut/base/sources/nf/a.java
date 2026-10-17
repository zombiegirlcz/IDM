package nf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.perf.config.RemoteConfigManager;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final qf.a d = qf.a.d();
    public static volatile a e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteConfigManager f214765a = RemoteConfigManager.getInstance();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.google.firebase.perf.util.e f214766b = new com.google.firebase.perf.util.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f214767c = w.b();

    public static synchronized a e() {
        try {
            if (e == null) {
                e = new a();
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return e;
    }

    public static boolean l(long j2) {
        return j2 >= 0;
    }

    public static boolean m(String str) {
        if (!str.trim().isEmpty()) {
            for (String str2 : str.split(";")) {
                if (str2.trim().equals("21.0.5")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean n(long j2) {
        return j2 >= 0;
    }

    public static boolean p(double d5) {
        return 0.0d <= d5 && d5 <= 1.0d;
    }

    public final com.google.firebase.perf.util.f a(nim.a aVar) {
        w wVar = this.f214767c;
        String strN = aVar.n();
        if (strN == null) {
            wVar.getClass();
            w.f214789c.a("Key is null when getting boolean value on device cache.");
            return new com.google.firebase.perf.util.f();
        }
        if (wVar.f214790a == null) {
            wVar.c(w.a());
            if (wVar.f214790a == null) {
                return new com.google.firebase.perf.util.f();
            }
        }
        if (!wVar.f214790a.contains(strN)) {
            return new com.google.firebase.perf.util.f();
        }
        try {
            return new com.google.firebase.perf.util.f(Boolean.valueOf(wVar.f214790a.getBoolean(strN, false)));
        } catch (ClassCastException e2) {
            w.f214789c.b("Key %s from sharedPreferences has type other than long: %s", strN, e2.getMessage());
            return new com.google.firebase.perf.util.f();
        }
    }

    public final com.google.firebase.perf.util.f b(nim.a aVar) {
        w wVar = this.f214767c;
        String strN = aVar.n();
        if (strN == null) {
            wVar.getClass();
            w.f214789c.a("Key is null when getting double value on device cache.");
            return new com.google.firebase.perf.util.f();
        }
        if (wVar.f214790a == null) {
            wVar.c(w.a());
            if (wVar.f214790a == null) {
                return new com.google.firebase.perf.util.f();
            }
        }
        if (!wVar.f214790a.contains(strN)) {
            return new com.google.firebase.perf.util.f();
        }
        try {
            try {
                return new com.google.firebase.perf.util.f(Double.valueOf(Double.longBitsToDouble(wVar.f214790a.getLong(strN, 0L))));
            } catch (ClassCastException e2) {
                w.f214789c.b("Key %s from sharedPreferences has type other than double: %s", strN, e2.getMessage());
                return new com.google.firebase.perf.util.f();
            }
        } catch (ClassCastException unused) {
            return new com.google.firebase.perf.util.f(Double.valueOf(Float.valueOf(wVar.f214790a.getFloat(strN, BitmapDescriptorFactory.HUE_RED)).doubleValue()));
        }
    }

    public final com.google.firebase.perf.util.f c(nim.a aVar) {
        w wVar = this.f214767c;
        String strN = aVar.n();
        if (strN == null) {
            wVar.getClass();
            w.f214789c.a("Key is null when getting long value on device cache.");
            return new com.google.firebase.perf.util.f();
        }
        if (wVar.f214790a == null) {
            wVar.c(w.a());
            if (wVar.f214790a == null) {
                return new com.google.firebase.perf.util.f();
            }
        }
        if (!wVar.f214790a.contains(strN)) {
            return new com.google.firebase.perf.util.f();
        }
        try {
            return new com.google.firebase.perf.util.f(Long.valueOf(wVar.f214790a.getLong(strN, 0L)));
        } catch (ClassCastException e2) {
            w.f214789c.b("Key %s from sharedPreferences has type other than long: %s", strN, e2.getMessage());
            return new com.google.firebase.perf.util.f();
        }
    }

    public final com.google.firebase.perf.util.f d(nim.a aVar) {
        w wVar = this.f214767c;
        String strN = aVar.n();
        if (strN == null) {
            wVar.getClass();
            w.f214789c.a("Key is null when getting String value on device cache.");
            return new com.google.firebase.perf.util.f();
        }
        if (wVar.f214790a == null) {
            wVar.c(w.a());
            if (wVar.f214790a == null) {
                return new com.google.firebase.perf.util.f();
            }
        }
        if (!wVar.f214790a.contains(strN)) {
            return new com.google.firebase.perf.util.f();
        }
        try {
            return new com.google.firebase.perf.util.f(wVar.f214790a.getString(strN, ""));
        } catch (ClassCastException e2) {
            w.f214789c.b("Key %s from sharedPreferences has type other than String: %s", strN, e2.getMessage());
            return new com.google.firebase.perf.util.f();
        }
    }

    public final boolean f() {
        d dVarH = d.H();
        com.google.firebase.perf.util.f fVarH = h(dVarH);
        if (fVarH.b()) {
            return ((Boolean) fVarH.a()).booleanValue();
        }
        com.google.firebase.perf.util.f fVar = this.f214765a.getBoolean("fpr_experiment_app_start_ttid");
        if (fVar.b()) {
            this.f214767c.g("com.google.firebase.perf.ExperimentTTID", ((Boolean) fVar.a()).booleanValue());
            return ((Boolean) fVar.a()).booleanValue();
        }
        com.google.firebase.perf.util.f fVarA = a(dVarH);
        if (fVarA.b()) {
            return ((Boolean) fVarA.a()).booleanValue();
        }
        return false;
    }

    public final Boolean g() {
        b bVar;
        c cVar;
        synchronized (b.class) {
            try {
                if (b.f214768a == null) {
                    b.f214768a = new b();
                }
                bVar = b.f214768a;
            } finally {
            }
        }
        com.google.firebase.perf.util.f fVarH = h(bVar);
        if ((fVarH.b() ? (Boolean) fVarH.a() : Boolean.FALSE).booleanValue()) {
            return Boolean.FALSE;
        }
        synchronized (c.class) {
            try {
                if (c.f214769a == null) {
                    c.f214769a = new c();
                }
                cVar = c.f214769a;
            } finally {
            }
        }
        com.google.firebase.perf.util.f fVarA = a(cVar);
        if (fVarA.b()) {
            return (Boolean) fVarA.a();
        }
        com.google.firebase.perf.util.f fVarH2 = h(cVar);
        if (fVarH2.b()) {
            return (Boolean) fVarH2.a();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.firebase.perf.util.f h(nim.a r3) {
        /*
            r2 = this;
            com.google.firebase.perf.util.e r0 = r2.f214766b
            java.lang.String r3 = r3.s()
            if (r3 == 0) goto L12
            android.os.Bundle r1 = r0.f49600a
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L12:
            r0.getClass()
        L15:
            r1 = 0
        L16:
            if (r1 != 0) goto L1e
            com.google.firebase.perf.util.f r3 = new com.google.firebase.perf.util.f
            r3.<init>()
            return r3
        L1e:
            android.os.Bundle r0 = r0.f49600a     // Catch: java.lang.ClassCastException -> L34
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.ClassCastException -> L34
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.ClassCastException -> L34
            if (r0 != 0) goto L2e
            com.google.firebase.perf.util.f r0 = new com.google.firebase.perf.util.f     // Catch: java.lang.ClassCastException -> L34
            r0.<init>()     // Catch: java.lang.ClassCastException -> L34
            return r0
        L2e:
            com.google.firebase.perf.util.f r1 = new com.google.firebase.perf.util.f     // Catch: java.lang.ClassCastException -> L34
            r1.<init>(r0)     // Catch: java.lang.ClassCastException -> L34
            return r1
        L34:
            r0 = move-exception
            qf.a r1 = com.google.firebase.perf.util.e.f49599b
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0}
            java.lang.String r0 = "Metadata key %s contains type other than boolean: %s"
            r1.b(r0, r3)
            com.google.firebase.perf.util.f r3 = new com.google.firebase.perf.util.f
            r3.<init>()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.a.h(nim.a):com.google.firebase.perf.util.f");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.firebase.perf.util.f i(nim.a r3) {
        /*
            r2 = this;
            com.google.firebase.perf.util.e r0 = r2.f214766b
            java.lang.String r3 = r3.s()
            if (r3 == 0) goto L12
            android.os.Bundle r1 = r0.f49600a
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L12:
            r0.getClass()
        L15:
            r1 = 0
        L16:
            if (r1 != 0) goto L1e
            com.google.firebase.perf.util.f r3 = new com.google.firebase.perf.util.f
            r3.<init>()
            return r3
        L1e:
            android.os.Bundle r0 = r0.f49600a
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L2c
            com.google.firebase.perf.util.f r3 = new com.google.firebase.perf.util.f
            r3.<init>()
            return r3
        L2c:
            boolean r1 = r0 instanceof java.lang.Float
            if (r1 == 0) goto L40
            java.lang.Float r0 = (java.lang.Float) r0
            double r0 = r0.doubleValue()
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            com.google.firebase.perf.util.f r0 = new com.google.firebase.perf.util.f
            r0.<init>(r3)
            return r0
        L40:
            boolean r1 = r0 instanceof java.lang.Double
            if (r1 == 0) goto L4c
            java.lang.Double r0 = (java.lang.Double) r0
            com.google.firebase.perf.util.f r3 = new com.google.firebase.perf.util.f
            r3.<init>(r0)
            return r3
        L4c:
            qf.a r0 = com.google.firebase.perf.util.e.f49599b
            java.lang.String r1 = "Metadata key %s contains type other than double: %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r0.b(r1, r3)
            com.google.firebase.perf.util.f r3 = new com.google.firebase.perf.util.f
            r3.<init>()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.a.i(nim.a):com.google.firebase.perf.util.f");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v13, types: [com.google.firebase.perf.util.f] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.firebase.perf.util.f] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.google.firebase.perf.util.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.firebase.perf.util.f j(nim.a r3) {
        /*
            r2 = this;
            com.google.firebase.perf.util.e r0 = r2.f214766b
            java.lang.String r3 = r3.s()
            if (r3 == 0) goto L12
            android.os.Bundle r1 = r0.f49600a
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L12:
            r0.getClass()
        L15:
            r1 = 0
        L16:
            if (r1 != 0) goto L1e
            com.google.firebase.perf.util.f r3 = new com.google.firebase.perf.util.f
            r3.<init>()
            goto L4b
        L1e:
            android.os.Bundle r0 = r0.f49600a     // Catch: java.lang.ClassCastException -> L36
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.ClassCastException -> L36
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.ClassCastException -> L36
            if (r0 != 0) goto L2f
            com.google.firebase.perf.util.f r0 = new com.google.firebase.perf.util.f     // Catch: java.lang.ClassCastException -> L36
            r0.<init>()     // Catch: java.lang.ClassCastException -> L36
            r3 = r0
            goto L4b
        L2f:
            com.google.firebase.perf.util.f r1 = new com.google.firebase.perf.util.f     // Catch: java.lang.ClassCastException -> L36
            r1.<init>(r0)     // Catch: java.lang.ClassCastException -> L36
            r3 = r1
            goto L4b
        L36:
            r0 = move-exception
            qf.a r1 = com.google.firebase.perf.util.e.f49599b
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0}
            java.lang.String r0 = "Metadata key %s contains type other than int: %s"
            r1.b(r0, r3)
            com.google.firebase.perf.util.f r3 = new com.google.firebase.perf.util.f
            r3.<init>()
        L4b:
            boolean r0 = r3.b()
            if (r0 == 0) goto L66
            java.lang.Object r3 = r3.a()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            long r0 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            com.google.firebase.perf.util.f r0 = new com.google.firebase.perf.util.f
            r0.<init>(r3)
            goto L6b
        L66:
            com.google.firebase.perf.util.f r0 = new com.google.firebase.perf.util.f
            r0.<init>()
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.a.j(nim.a):com.google.firebase.perf.util.f");
    }

    public final long k() {
        k kVar;
        synchronized (k.class) {
            try {
                if (k.f214777a == null) {
                    k.f214777a = new k();
                }
                kVar = k.f214777a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        RemoteConfigManager remoteConfigManager = this.f214765a;
        kVar.getClass();
        com.google.firebase.perf.util.f fVar = remoteConfigManager.getLong("fpr_rl_time_limit_sec");
        if (fVar.b() && ((Long) fVar.a()).longValue() > 0) {
            this.f214767c.e(((Long) fVar.a()).longValue(), "com.google.firebase.perf.TimeLimitSec");
            return ((Long) fVar.a()).longValue();
        }
        com.google.firebase.perf.util.f fVarC = c(kVar);
        if (!fVarC.b() || ((Long) fVarC.a()).longValue() <= 0) {
            return 600L;
        }
        return ((Long) fVarC.a()).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o() {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.a.o():boolean");
    }
}
