package com.google.firebase.messaging;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.time.Clock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class o implements nbm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49517b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f49518c;
    public Object d;
    public Object e;

    public o(int i, Clock clock) {
        this.e = clock;
        this.f49516a = i;
        this.f49518c = new nbm.g[i];
        long epochSecond = clock.instant().getEpochSecond();
        for (int i2 = 0; i2 < i; i2++) {
            ((nbm.g[]) this.f49518c)[i2] = new nbm.g(epochSecond);
            epochSecond++;
        }
        this.d = new nbm.d();
    }

    public static String d(pd.g gVar) {
        gVar.a();
        pd.i iVar = gVar.f235025c;
        String str = iVar.e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = iVar.f235031b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    @Override // nbm.f
    public synchronized g8.f a(long j2, nbm.e eVar) {
        g8.f fVar;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        synchronized (this) {
            ((nbm.d) this.d).a(j2, eVar);
            g(((nbm.g[]) this.f49518c)[this.f49517b]).a(j2, eVar);
            fVar = new g8.f((nbm.d) this.d);
        }
        return fVar;
    }

    @Override // nbm.f
    public synchronized g8.f b() {
        g(((nbm.g[]) this.f49518c)[this.f49517b]);
        return new g8.f((nbm.d) this.d);
    }

    public synchronized String c() {
        try {
            if (((String) this.d) == null) {
                h();
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return (String) this.d;
    }

    public PackageInfo e(String str) {
        try {
            return ((Context) this.f49518c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String str2 = "Failed to find package " + e;
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a A[Catch: all -> 0x0025, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:15:0x0027, B:17:0x002d, B:19:0x003f, B:21:0x0045, B:24:0x004a, B:26:0x005d, B:28:0x0063, B:31:0x0068, B:33:0x0073, B:35:0x0078, B:34:0x0076), top: B:42:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f49517b     // Catch: java.lang.Throwable -> L25
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            monitor-exit(r5)
            goto L7b
        La:
            java.lang.Object r0 = r5.f49518c     // Catch: java.lang.Throwable -> L25
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L25
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r4 = "com.google.android.gms"
            int r3 = r0.checkPermission(r3, r4)     // Catch: java.lang.Throwable -> L25
            r4 = -1
            if (r3 != r4) goto L27
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r3 = "Google Play services missing or without correct permission."
            monitor-exit(r5)
            r0 = r2
            goto L7b
        L25:
            r0 = move-exception
            goto L7f
        L27:
            boolean r3 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch: java.lang.Throwable -> L25
            if (r3 != 0) goto L4a
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L25
            java.util.List r3 = r0.queryIntentServices(r3, r2)     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L4a
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L25
            if (r3 <= 0) goto L4a
            r5.f49517b = r1     // Catch: java.lang.Throwable -> L25
            monitor-exit(r5)
            r0 = r1
            goto L7b
        L4a:
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L25
            java.util.List r0 = r0.queryBroadcastReceivers(r3, r2)     // Catch: java.lang.Throwable -> L25
            r3 = 2
            if (r0 == 0) goto L68
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L25
            if (r0 <= 0) goto L68
            r5.f49517b = r3     // Catch: java.lang.Throwable -> L25
            monitor-exit(r5)
            r0 = r3
            goto L7b
        L68:
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r4 = "Failed to resolve IID implementation package, falling back"
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L76
            r5.f49517b = r3     // Catch: java.lang.Throwable -> L25
            goto L78
        L76:
            r5.f49517b = r1     // Catch: java.lang.Throwable -> L25
        L78:
            int r0 = r5.f49517b     // Catch: java.lang.Throwable -> L25
            monitor-exit(r5)
        L7b:
            if (r0 == 0) goto L7e
            return r1
        L7e:
            return r2
        L7f:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L25
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.o.f():boolean");
    }

    public nbm.g g(nbm.g gVar) {
        nbm.g gVar2;
        int i = this.f49516a;
        long epochSecond = ((Clock) this.e).instant().getEpochSecond();
        long jB = epochSecond - gVar.b();
        if (jB == 0) {
            return gVar;
        }
        long jMin = Math.min(jB, i);
        do {
            jMin--;
            int i2 = (this.f49517b + 1) % i;
            this.f49517b = i2;
            gVar2 = ((nbm.g[]) this.f49518c)[i2];
            ((nbm.d) this.d).b(gVar2);
            gVar2.c(epochSecond - jMin);
        } while (jMin > 0);
        return gVar2;
    }

    public synchronized void h() {
        PackageInfo packageInfoE = e(((Context) this.f49518c).getPackageName());
        if (packageInfoE != null) {
            this.d = Integer.toString(packageInfoE.versionCode);
            this.e = packageInfoE.versionName;
        }
    }

    public o(Context context) {
        this.f49518c = context;
    }
}
