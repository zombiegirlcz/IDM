package ag;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f4722s = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f4723t = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f4724a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4726c;
    public HttpURLConnection f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f4727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ScheduledExecutorService f4728h;
    public final m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pd.g f4729j;
    public final df.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f4730l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f4731m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f4732n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u f4734q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4725b = false;
    public final Random o = new Random();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Clock f4733p = DefaultClock.getInstance();
    public boolean d = false;
    public boolean e = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f4735r = new Object();

    public s(pd.g gVar, df.e eVar, m mVar, e eVar2, Context context, String str, LinkedHashSet linkedHashSet, u uVar, ScheduledExecutorService scheduledExecutorService) {
        this.f4724a = linkedHashSet;
        this.f4728h = scheduledExecutorService;
        this.f4726c = Math.max(8 - uVar.i().c(), 1);
        this.f4729j = gVar;
        this.i = mVar;
        this.k = eVar;
        this.f4730l = eVar2;
        this.f4731m = context;
        this.f4732n = str;
        this.f4734q = uVar;
    }

    public static boolean d(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb6 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb6.append(line);
            }
        } catch (IOException unused) {
            if (sb6.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb6.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean a() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedHashSet r0 = r1.f4724a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f4725b     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.d     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.e     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L17:
            r0 = move-exception
            goto L1c
        L19:
            r0 = 0
        L1a:
            monitor-exit(r1)
            return r0
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.s.a():boolean");
    }

    public final void b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f;
        if (httpURLConnection != null && !this.e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException e2) {
            }
        }
    }

    public final String c(String str) {
        pd.g gVar = this.f4729j;
        gVar.a();
        Matcher matcher = f4723t.matcher(gVar.f235025c.f235031b);
        return j6.a.s("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void e(long j2) {
        try {
            if (a()) {
                int i = this.f4726c;
                if (i > 0) {
                    this.f4726c = i - 1;
                    this.f4728h.schedule(new q(this, 0), j2, TimeUnit.MILLISECONDS);
                } else if (!this.e) {
                    new FirebaseRemoteConfigClientException();
                    g();
                }
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public final synchronized void g() {
        Iterator it8 = this.f4724a.iterator();
        while (it8.hasNext()) {
            ((r) it8.next()).a();
        }
    }

    public final synchronized void h() {
        e(Math.max(0L, this.f4734q.i().a().getTime() - new Date(this.f4733p.currentTimeMillis()).getTime()));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.s.i(java.net.HttpURLConnection, java.lang.String, java.lang.String):void");
    }

    public final synchronized c j(HttpURLConnection httpURLConnection) {
        return new c(httpURLConnection, this.i, this.f4730l, this.f4724a, new r(this), this.f4728h);
    }

    public final void k(Date date) {
        u uVar = this.f4734q;
        int iC = uVar.i().c() + 1;
        long millis = TimeUnit.MINUTES.toMillis(f4722s[(iC < 8 ? iC : 8) - 1]);
        uVar.n(new Date(date.getTime() + (millis / 2) + ((long) this.o.nextInt((int) millis))), iC);
    }
}
