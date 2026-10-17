package df;

import android.net.TrafficStats;
import ce.p;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsException;
import de.l;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import r10.v;

/* JADX INFO: loaded from: classes.dex */
public final class d implements e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f113725m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pd.g f113726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ff.c f113727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cpi.g f113728c;
    public final j d;
    public final p e;
    public final h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f113729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f113730h;
    public final l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f113731j;
    public final HashSet k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f113732l;

    static {
        new AtomicInteger(1);
    }

    public d(pd.g gVar, cf.b bVar, ExecutorService executorService, l lVar) {
        gVar.a();
        ff.c cVar = new ff.c(gVar.f235023a, bVar);
        cpi.g gVar2 = new cpi.g(gVar);
        if (dfm.c.f114549b == null) {
            dfm.c.f114549b = new dfm.c(5);
        }
        dfm.c cVar2 = dfm.c.f114549b;
        if (j.d == null) {
            j.d = new j(cVar2);
        }
        j jVar = j.d;
        p pVar = new p(new ce.d(gVar, 2));
        h hVar = new h();
        this.f113729g = new Object();
        this.k = new HashSet();
        this.f113732l = new ArrayList();
        this.f113726a = gVar;
        this.f113727b = cVar;
        this.f113728c = gVar2;
        this.d = jVar;
        this.e = pVar;
        this.f = hVar;
        this.f113730h = executorService;
        this.i = lVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042 A[Catch: all -> 0x007e, TryCatch #1 {all -> 0x007e, blocks: (B:5:0x000e, B:7:0x001a, B:13:0x0024, B:15:0x0035, B:22:0x0062, B:23:0x0069, B:17:0x0042, B:19:0x0048, B:21:0x005a), top: B:40:0x000e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[Catch: all -> 0x007e, TryCatch #1 {all -> 0x007e, blocks: (B:5:0x000e, B:7:0x001a, B:13:0x0024, B:15:0x0035, B:22:0x0062, B:23:0x0069, B:17:0x0042, B:19:0x0048, B:21:0x005a), top: B:40:0x000e, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r7 = this;
            java.lang.Object r0 = df.d.f113725m
            monitor-enter(r0)
            pd.g r1 = r7.f113726a     // Catch: java.lang.Throwable -> L86
            r1.a()     // Catch: java.lang.Throwable -> L86
            android.content.Context r1 = r1.f235023a     // Catch: java.lang.Throwable -> L86
            cpi.g r1 = cpi.g.g(r1)     // Catch: java.lang.Throwable -> L86
            cpi.g r2 = r7.f113728c     // Catch: java.lang.Throwable -> L7e
            ef.a r2 = r2.H()     // Catch: java.lang.Throwable -> L7e
            ef.c r3 = r2.f125243b     // Catch: java.lang.Throwable -> L7e
            ef.c r4 = ef.c.NOT_GENERATED     // Catch: java.lang.Throwable -> L7e
            if (r3 == r4) goto L21
            ef.c r4 = ef.c.ATTEMPT_MIGRATION     // Catch: java.lang.Throwable -> L7e
            if (r3 != r4) goto L1f
            goto L21
        L1f:
            r3 = 0
            goto L22
        L21:
            r3 = 1
        L22:
            if (r3 == 0) goto L80
            df.h r3 = r7.f     // Catch: java.lang.Throwable -> L7e
            pd.g r4 = r7.f113726a     // Catch: java.lang.Throwable -> L7e
            r4.a()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r5 = r4.f235024b     // Catch: java.lang.Throwable -> L7e
            java.lang.String r6 = "CHIME_ANDROID_SDK"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L7e
            if (r5 != 0) goto L42
            java.lang.String r5 = "[DEFAULT]"
            r4.a()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r4 = r4.f235024b     // Catch: java.lang.Throwable -> L7e
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L7e
            if (r4 == 0) goto L62
        L42:
            ef.c r4 = r2.f125243b     // Catch: java.lang.Throwable -> L7e
            ef.c r5 = ef.c.ATTEMPT_MIGRATION     // Catch: java.lang.Throwable -> L7e
            if (r4 != r5) goto L62
            ce.p r4 = r7.e     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L7e
            ef.b r4 = (ef.b) r4     // Catch: java.lang.Throwable -> L7e
            java.lang.String r4 = r4.a()     // Catch: java.lang.Throwable -> L7e
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L7e
            if (r5 == 0) goto L69
            r3.getClass()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r4 = df.h.a()     // Catch: java.lang.Throwable -> L7e
            goto L69
        L62:
            r3.getClass()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r4 = df.h.a()     // Catch: java.lang.Throwable -> L7e
        L69:
            cpi.g r3 = r7.f113728c     // Catch: java.lang.Throwable -> L7e
            oe.c r2 = r2.a()     // Catch: java.lang.Throwable -> L7e
            r2.f224497a = r4     // Catch: java.lang.Throwable -> L7e
            ef.c r4 = ef.c.UNREGISTERED     // Catch: java.lang.Throwable -> L7e
            r2.o(r4)     // Catch: java.lang.Throwable -> L7e
            ef.a r2 = r2.d()     // Catch: java.lang.Throwable -> L7e
            r3.w(r2)     // Catch: java.lang.Throwable -> L7e
            goto L80
        L7e:
            r2 = move-exception
            goto L98
        L80:
            if (r1 == 0) goto L88
            r1.I()     // Catch: java.lang.Throwable -> L86
            goto L88
        L86:
            r1 = move-exception
            goto L9e
        L88:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L86
            r7.h(r2)
            de.l r0 = r7.i
            df.b r1 = new df.b
            r2 = 2
            r1.<init>(r7, r2)
            r0.execute(r1)
            return
        L98:
            if (r1 == 0) goto L9d
            r1.I()     // Catch: java.lang.Throwable -> L86
        L9d:
            throw r2     // Catch: java.lang.Throwable -> L86
        L9e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L86
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: df.d.a():void");
    }

    public final ef.a b(ef.a aVar) throws FirebaseInstallationsException {
        int responseCode;
        ff.b bVarF;
        ff.c cVar = this.f113727b;
        pd.g gVar = this.f113726a;
        gVar.a();
        String str = gVar.f235025c.f235030a;
        String str2 = aVar.f125242a;
        pd.g gVar2 = this.f113726a;
        gVar2.a();
        String str3 = gVar2.f235025c.f235033g;
        String str4 = aVar.d;
        ff.e eVar = cVar.f134684c;
        if (!eVar.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = ff.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = cVar.c(str, urlA);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    ff.c.h(httpURLConnectionC);
                    responseCode = httpURLConnectionC.getResponseCode();
                    eVar.b(responseCode);
                } finally {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                bVarF = ff.c.f(httpURLConnectionC);
            } else {
                ff.c.b(httpURLConnectionC, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    v vVarA = ff.b.a();
                    vVarA.A(ff.f.AUTH_ERROR);
                    bVarF = vVarA.g();
                } else {
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        v vVarA2 = ff.b.a();
                        vVarA2.A(ff.f.BAD_CONFIG);
                        bVarF = vVarA2.g();
                    }
                }
            }
            int i2 = c.f113724b[bVarF.b().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    oe.c cVarA = aVar.a();
                    cVarA.f224500g = "BAD CONFIG";
                    cVarA.o(ef.c.REGISTER_ERROR);
                    return cVarA.d();
                }
                if (i2 != 3) {
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                }
                synchronized (this) {
                    this.f113731j = null;
                }
                oe.c cVarA2 = aVar.a();
                cVarA2.o(ef.c.NOT_GENERATED);
                return cVarA2.d();
            }
            String strC = bVarF.c();
            long jD = bVarF.d();
            j jVar = this.d;
            jVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            jVar.f113740a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            oe.c cVarA3 = aVar.a();
            cVarA3.f224499c = strC;
            cVarA3.e = Long.valueOf(jD);
            cVarA3.f = Long.valueOf(seconds);
            return cVarA3.d();
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task c() {
        String str;
        e();
        synchronized (this) {
            str = this.f113731j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g gVar = new g(taskCompletionSource);
        synchronized (this.f113729g) {
            this.f113732l.add(gVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f113730h.execute(new b(this, 0));
        return task;
    }

    public final Task d() {
        e();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        f fVar = new f(this.d, taskCompletionSource);
        synchronized (this.f113729g) {
            this.f113732l.add(fVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f113730h.execute(new b(this, 1));
        return task;
    }

    public final void e() {
        pd.g gVar = this.f113726a;
        gVar.a();
        Preconditions.checkNotEmpty(gVar.f235025c.f235031b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        Preconditions.checkNotEmpty(gVar.f235025c.f235033g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        Preconditions.checkNotEmpty(gVar.f235025c.f235030a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f235025c.f235031b;
        Pattern pattern = j.f113739c;
        Preconditions.checkArgument(str.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        Preconditions.checkArgument(j.f113739c.matcher(gVar.f235025c.f235030a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final ef.a f(ef.a aVar) throws FirebaseInstallationsException {
        int responseCode;
        ff.a aVarE;
        String str = aVar.f125242a;
        String strC = (str == null || str.length() != 11) ? null : ((ef.b) this.e.get()).c();
        pd.g gVar = this.f113726a;
        gVar.a();
        String str2 = gVar.f235025c.f235030a;
        gVar.a();
        String str3 = gVar.f235025c.f235033g;
        gVar.a();
        String str4 = gVar.f235025c.f235031b;
        ff.c cVar = this.f113727b;
        ff.e eVar = cVar.f134684c;
        if (!eVar.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = ff.c.a("projects/" + str3 + "/installations");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = cVar.c(str2, urlA);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (strC != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", strC);
                    }
                    ff.c.g(httpURLConnectionC, str, str4);
                    responseCode = httpURLConnectionC.getResponseCode();
                    eVar.b(responseCode);
                } catch (Throwable th10) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th10;
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                aVarE = ff.c.e(httpURLConnectionC);
            } else {
                ff.c.b(httpURLConnectionC, str4, str2, str3);
                if (responseCode == 429) {
                    throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                }
                if (responseCode < 500 || responseCode >= 600) {
                    a5h.g gVarA = ff.a.a();
                    gVarA.I0(ff.d.BAD_CONFIG);
                    aVarE = gVarA.M();
                }
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            httpURLConnectionC.disconnect();
            TrafficStats.clearThreadStatsTag();
            int i2 = c.f113723a[aVarE.e().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                }
                oe.c cVarA = aVar.a();
                cVarA.f224500g = "BAD CONFIG";
                cVarA.o(ef.c.REGISTER_ERROR);
                return cVarA.d();
            }
            String strC2 = aVarE.c();
            String strD = aVarE.d();
            j jVar = this.d;
            jVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            jVar.f113740a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            String strC3 = aVarE.b().c();
            long jD = aVarE.b().d();
            oe.c cVarA2 = aVar.a();
            cVarA2.f224497a = strC2;
            cVarA2.o(ef.c.REGISTERED);
            cVarA2.f224499c = strC3;
            cVarA2.d = strD;
            cVarA2.e = Long.valueOf(jD);
            cVarA2.f = Long.valueOf(seconds);
            return cVarA2.d();
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void g(Exception exc2) {
        synchronized (this.f113729g) {
            try {
                Iterator it8 = this.f113732l.iterator();
                while (it8.hasNext()) {
                    if (((i) it8.next()).a(exc2)) {
                        it8.remove();
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void h(ef.a aVar) {
        synchronized (this.f113729g) {
            try {
                Iterator it8 = this.f113732l.iterator();
                while (it8.hasNext()) {
                    if (((i) it8.next()).b(aVar)) {
                        it8.remove();
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
