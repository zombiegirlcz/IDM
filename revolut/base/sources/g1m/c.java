package g1m;

import aem.b1;
import aem.e1;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import io.ktor.client.engine.okhttp.StreamAdapterIOException;
import io.ktor.client.network.sockets.ConnectTimeoutException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import skm.a2;
import ulm.b0;
import ulm.c0;
import ulm.e0;
import ulm.p;
import ulm.x0;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes23.dex */
public final class c implements e0, InstallReferrerStateListener, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139729a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f139730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f139731c;

    public c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "newSetFromMap(ConcurrentHashMap())");
        this.f139730b = setNewSetFromMap;
        SharedPreferences sharedPreferences = context.getSharedPreferences("cookie_persistance", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…CE, Context.MODE_PRIVATE)");
        this.f139731c = sharedPreferences;
        ArrayList arrayList = new ArrayList();
        Map<String, ?> all2 = sharedPreferences.getAll();
        Intrinsics.checkNotNullExpressionValue(all2, "sharedPreferences.all");
        for (Map.Entry<String, ?> entry : all2.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            String str = value instanceof String ? (String) value : null;
            if (str != null) {
                try {
                    ((Set) this.f139730b).add(new b(str));
                } catch (JSONException unused) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    arrayList.add(key);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            editorEdit.remove((String) it8.next());
        }
        editorEdit.apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(hem.c r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof hem.g
            if (r0 == 0) goto L13
            r0 = r6
            hem.g r0 = (hem.g) r0
            int r1 = r0.f151733w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f151733w = r1
            goto L18
        L13:
            hem.g r0 = new hem.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f151733w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L5a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            kotlin.coroutines.CoroutineContext r6 = r5.getCoroutineContext()
            kotlinx.coroutines.Job r6 = skm.e0.t(r6)
            skm.s r6 = (skm.s) r6
            r2 = r6
            skm.h1 r2 = (skm.h1) r2
            r2.h0()
            boolean r2 = aem.x.b(r5)
            if (r2 != 0) goto L4f
            io.ktor.utils.io.t r5 = r5.b()     // Catch: java.lang.Throwable -> L4f
            io.ktor.utils.io.n0.a(r5)     // Catch: java.lang.Throwable -> L4f
        L4f:
            r0.f151733w = r3
            skm.r1 r6 = (skm.r1) r6
            java.lang.Object r5 = r6.u(r0)
            if (r5 != r1) goto L5a
            return r1
        L5a:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g1m.c.a(hem.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof hem.h
            if (r0 == 0) goto L13
            r0 = r9
            hem.h r0 = (hem.h) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            hem.h r0 = new hem.h
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f151736y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L50
            if (r2 == r5) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r0 = r0.f151735x
            hem.c r0 = (hem.c) r0
            yhm.o.b(r9)     // Catch: java.util.concurrent.CancellationException -> L31
            return r0
        L31:
            r9 = move-exception
            goto La5
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3c:
            int r2 = r0.v
            int r4 = r0.u
            java.lang.Object r5 = r0.f151734w
            wdm.f r5 = (wdm.f) r5
            yhm.o.b(r9)     // Catch: java.util.concurrent.CancellationException -> L31
            goto L88
        L48:
            int r2 = r0.v
            int r5 = r0.u
            yhm.o.b(r9)     // Catch: java.util.concurrent.CancellationException -> L31
            goto L73
        L50:
            yhm.o.b(r9)
            fem.d r9 = new fem.d     // Catch: java.util.concurrent.CancellationException -> L31
            r9.<init>()     // Catch: java.util.concurrent.CancellationException -> L31
            java.lang.Object r2 = r8.f139730b     // Catch: java.util.concurrent.CancellationException -> L31
            fem.d r2 = (fem.d) r2     // Catch: java.util.concurrent.CancellationException -> L31
            r9.b(r2)     // Catch: java.util.concurrent.CancellationException -> L31
            java.lang.Object r2 = r8.f139731c     // Catch: java.util.concurrent.CancellationException -> L31
            vdm.b r2 = (vdm.b) r2     // Catch: java.util.concurrent.CancellationException -> L31
            r6 = 0
            r0.u = r6     // Catch: java.util.concurrent.CancellationException -> L31
            r0.v = r6     // Catch: java.util.concurrent.CancellationException -> L31
            r0.A = r5     // Catch: java.util.concurrent.CancellationException -> L31
            java.lang.Object r9 = r2.d(r9, r0)     // Catch: java.util.concurrent.CancellationException -> L31
            if (r9 != r1) goto L71
            goto La3
        L71:
            r2 = r6
            r5 = r2
        L73:
            wdm.f r9 = (wdm.f) r9     // Catch: java.util.concurrent.CancellationException -> L31
            r0.f151734w = r9     // Catch: java.util.concurrent.CancellationException -> L31
            r0.u = r5     // Catch: java.util.concurrent.CancellationException -> L31
            r0.v = r2     // Catch: java.util.concurrent.CancellationException -> L31
            r0.A = r4     // Catch: java.util.concurrent.CancellationException -> L31
            java.lang.Object r4 = wdm.h.b(r9, r0)     // Catch: java.util.concurrent.CancellationException -> L31
            if (r4 != r1) goto L84
            goto La3
        L84:
            r7 = r5
            r5 = r9
            r9 = r4
            r4 = r7
        L88:
            wdm.f r9 = (wdm.f) r9     // Catch: java.util.concurrent.CancellationException -> L31
            hem.c r9 = r9.d()     // Catch: java.util.concurrent.CancellationException -> L31
            hem.c r5 = r5.d()     // Catch: java.util.concurrent.CancellationException -> L31
            r6 = 0
            r0.f151734w = r6     // Catch: java.util.concurrent.CancellationException -> L31
            r0.f151735x = r9     // Catch: java.util.concurrent.CancellationException -> L31
            r0.u = r4     // Catch: java.util.concurrent.CancellationException -> L31
            r0.v = r2     // Catch: java.util.concurrent.CancellationException -> L31
            r0.A = r3     // Catch: java.util.concurrent.CancellationException -> L31
            java.lang.Object r0 = r8.a(r5, r0)     // Catch: java.util.concurrent.CancellationException -> L31
            if (r0 != r1) goto La4
        La3:
            return r1
        La4:
            return r9
        La5:
            java.lang.Throwable r9 = iem.a.a(r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g1m.c.b(gim.c):java.lang.Object");
    }

    @Override // ulm.e0
    public List f(x0 url2) {
        boolean zB;
        Intrinsics.checkNotNullParameter(url2, "url");
        ArrayList<b> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Set<b> set = (Set) this.f139730b;
        for (b bVar : set) {
            c0 c0Var = bVar.f139728a;
            if (c0Var.f281074c < System.currentTimeMillis()) {
                arrayList.add(bVar);
            } else {
                String str = c0Var.d;
                Intrinsics.checkNotNullParameter(url2, "url");
                if (c0Var.i) {
                    zB = Intrinsics.f(url2.d, str);
                } else {
                    b0 b0Var = c0.Companion;
                    String str2 = url2.d;
                    b0Var.getClass();
                    zB = b0.b(str2, str);
                }
                boolean z = false;
                if (zB) {
                    b0 b0Var2 = c0.Companion;
                    String str3 = c0Var.e;
                    b0Var2.getClass();
                    String strB = url2.b();
                    if ((Intrinsics.f(strB, str3) || (a0.H(strB, str3, false) && (a0.y(str3, "/", false) || strB.charAt(str3.length()) == '/'))) && (!c0Var.f || url2.f())) {
                        z = true;
                    }
                }
                if (z) {
                    arrayList2.add(c0Var);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) this.f139731c).edit();
            for (b bVar2 : arrayList) {
                set.remove(bVar2);
                editorEdit.remove(bVar2.a());
            }
            editorEdit.apply();
        }
        return arrayList2;
    }

    @Override // ulm.e0
    public void i(x0 url2, List cookies) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        List cookies2 = cookies;
        Set set = (Set) this.f139730b;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) this.f139731c).edit();
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(cookies2, "cookies");
        ArrayList<b> arrayList = new ArrayList(cookies2.size());
        Iterator it8 = cookies2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new b((c0) it8.next()));
        }
        for (b bVar : arrayList) {
            set.remove(bVar);
            set.add(bVar);
            String strA = bVar.a();
            HashMap map = new HashMap();
            c0 c0Var = bVar.f139728a;
            map.put("name", c0Var.f281072a);
            map.put("value", c0Var.f281073b);
            map.put("expiresAt", Long.valueOf(c0Var.f281074c));
            map.put("domain", c0Var.d);
            map.put("path", c0Var.e);
            String string = new JSONObject(map).toString();
            Intrinsics.checkNotNullExpressionValue(string, "JSONObject(values).toString()");
            editorEdit.putString(strA, string);
        }
        editorEdit.apply();
    }

    @Override // ulm.p
    public void onFailure(Call call, IOException e) {
        Object obj2;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e, "e");
        skm.l lVar = (skm.l) this.f139731c;
        if (lVar.x()) {
            return;
        }
        m.Companion companion = m.INSTANCE;
        fem.e request = (fem.e) this.f139730b;
        if (e instanceof StreamAdapterIOException) {
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
        } else if (e instanceof SocketTimeoutException) {
            String message = e.getMessage();
            if (message == null || !d0.J(message, "connect", true)) {
                e = e1.a(request, e);
            } else {
                Logger logger = e1.f3713a;
                Intrinsics.checkNotNullParameter(request, "request");
                StringBuilder sb6 = new StringBuilder("Connect timeout has expired [url=");
                sb6.append(request.f134660a);
                sb6.append(", connect_timeout=");
                b1 b1Var = (b1) request.a();
                if (b1Var == null || (obj2 = b1Var.f3696b) == null) {
                    obj2 = "unknown";
                }
                sb6.append(obj2);
                sb6.append(" ms]");
                e = new ConnectTimeoutException(sb6.toString(), e);
            }
        }
        lVar.resumeWith(o.a(e));
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i) {
        Function1 function1 = (Function1) this.f139731c;
        if (i != 0) {
            if (i == 1) {
                Intrinsics.checkNotNullExpressionValue("i", "TAG");
                z0m.j.a("i", "Install referrer API connection couldn't be established.", new Object[0]);
                ((z0m.c) function1).invoke(null);
                return;
            } else {
                if (i != 2) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue("i", "TAG");
                z0m.j.a("i", "Install referrer API not available on the current Play Store app.", new Object[0]);
                ((z0m.c) function1).invoke(null);
                return;
            }
        }
        try {
            ReferrerDetails installReferrer = ((InstallReferrerClient) this.f139730b).getInstallReferrer();
            Intrinsics.checkNotNullExpressionValue(installReferrer, "referrerClient.installReferrer");
            String installReferrer2 = installReferrer.getInstallReferrer();
            Intrinsics.checkNotNullExpressionValue(installReferrer2, "response.installReferrer");
            ((z0m.c) function1).invoke(new z0m.i(installReferrer.getGooglePlayInstantParam(), installReferrer2, installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds()));
        } catch (RemoteException unused) {
            Intrinsics.checkNotNullExpressionValue("i", "TAG");
            z0m.j.a("i", "Install referrer API remote exception.", new Object[0]);
            ((z0m.c) function1).invoke(null);
        } catch (NoSuchMethodError unused2) {
            Intrinsics.checkNotNullExpressionValue("i", "TAG");
            z0m.j.a("i", "Upgrade InstallReferrer package to v1.1 or higher to add the install referrer details entity.", new Object[0]);
            ((z0m.c) function1).invoke(null);
        }
    }

    @Override // ulm.p
    public void onResponse(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        if (call.isCanceled()) {
            return;
        }
        skm.l lVar = (skm.l) this.f139731c;
        m.Companion companion = m.INSTANCE;
        lVar.resumeWith(response);
    }

    public String toString() {
        switch (this.f139729a) {
            case 1:
                return "HttpStatement[" + ((fem.d) this.f139730b).f134657a + ']';
            default:
                return super.toString();
        }
    }

    public c(fem.d builder, vdm.b client) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(client, "client");
        this.f139730b = builder;
        this.f139731c = client;
    }

    public c(fem.e requestData, skm.l continuation) {
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.f139730b = requestData;
        this.f139731c = continuation;
    }

    public c(InstallReferrerClient installReferrerClient, Function1 function1) {
        this.f139730b = installReferrerClient;
        this.f139731c = function1;
    }

    public c(io.ktor.utils.io.m channel, a2 job2) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(job2, "job");
        this.f139730b = channel;
        this.f139731c = job2;
    }
}
