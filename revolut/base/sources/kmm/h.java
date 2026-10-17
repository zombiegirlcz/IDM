package kmm;

import ch.qos.logback.core.CoreConstants;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import mmm.r0;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import ulm.h1;
import ulm.i1;
import ulm.j1;
import ulm.m0;
import ulm.y1;
import ulm.z1;
import ylm.q;
import zhm.u;
import zsc.p;

/* JADX INFO: loaded from: classes14.dex */
public final class h implements y1, l {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final List f185919y = u.c(h1.HTTP_1_1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f185920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f185921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Random f185922c;
    public final long d;
    public j e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f185923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f185924h;
    public q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f185925j;
    public m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n f185926l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xlm.b f185927m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f185928n;
    public v60.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayDeque f185929p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayDeque f185930q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f185931r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f185932s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f185933t;
    public String u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f185934w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f185935x;

    public h(xlm.d taskRunner, j1 originalRequest, z1 listener, Random random, long j2, long j3, long j5) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f185920a = originalRequest;
        this.f185921b = listener;
        this.f185922c = random;
        this.d = j2;
        this.e = null;
        this.f = j3;
        this.f185923g = j5;
        this.f185927m = taskRunner.d();
        this.f185929p = new ArrayDeque();
        this.f185930q = new ArrayDeque();
        this.f185933t = -1;
        if (!"GET".equals(originalRequest.f281096b)) {
            throw new IllegalArgumentException(("Request must be GET: " + originalRequest.f281096b).toString());
        }
        mmm.l lVar = mmm.m.Companion;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        Unit unit = Unit.f186387a;
        lVar.getClass();
        this.f185924h = mmm.l.d(-1234567890, bArr).a();
    }

    public static void d(h hVar, Exception e, Response response, int i) {
        n nVar;
        if ((i & 2) != 0) {
            response = null;
        }
        boolean z = (i & 4) == 0;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(e, "e");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (hVar) {
            try {
                if (hVar.v) {
                    return;
                }
                hVar.v = true;
                v60.g gVar = hVar.o;
                n nVar2 = hVar.f185926l;
                ref$ObjectRef.f186409a = nVar2;
                hVar.f185926l = null;
                if (!z && nVar2 != null) {
                    xlm.b.c(hVar.f185927m, hVar.f185928n + " writer close", 0L, new bm9.d(ref$ObjectRef, 1), 2);
                }
                hVar.f185927m.g();
                Unit unit = Unit.f186387a;
                try {
                    hVar.f185921b.c(hVar, e, response);
                    if (gVar != null) {
                        gVar.cancel();
                    }
                    if (!z || (nVar = (n) ref$ObjectRef.f186409a) == null) {
                        return;
                    }
                    vlm.h.f(nVar);
                } finally {
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final r0 a(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        int i = response.d;
        if (i != 101) {
            StringBuilder sb6 = new StringBuilder("Expected HTTP 101 response but was '");
            sb6.append(i);
            sb6.append(p.SPACE_CHAR);
            throw new ProtocolException(j6.a.u(sb6, response.f226089c, CoreConstants.SINGLE_QUOTE_CHAR));
        }
        String strF = response.f("Connection", null);
        if (!"Upgrade".equalsIgnoreCase(strF)) {
            throw new ProtocolException(p.a.l(CoreConstants.SINGLE_QUOTE_CHAR, "Expected 'Connection' header value 'Upgrade' but was '", strF));
        }
        String strF2 = response.f("Upgrade", null);
        if (!"websocket".equalsIgnoreCase(strF2)) {
            throw new ProtocolException(p.a.l(CoreConstants.SINGLE_QUOTE_CHAR, "Expected 'Upgrade' header value 'websocket' but was '", strF2));
        }
        String strF3 = response.f("Sec-WebSocket-Accept", null);
        mmm.l lVar = mmm.m.Companion;
        String str = this.f185924h + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
        lVar.getClass();
        String strA = mmm.l.c(str).c("SHA-1").a();
        if (Intrinsics.f(strA, strF3)) {
            r0 r0Var = response.f226091h;
            if (r0Var != null) {
                return r0Var;
            }
            throw new ProtocolException("Web Socket socket missing: bad interceptor?");
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA + "' but was '" + strF3 + CoreConstants.SINGLE_QUOTE_CHAR);
    }

    public final boolean b(int i, String str) {
        String str2;
        long j2 = this.f185923g;
        synchronized (this) {
            mmm.m mVarC = null;
            try {
                if (i < 1000 || i >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i;
                } else if ((1004 > i || i >= 1007) && (1015 > i || i >= 3000)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    mmm.m.Companion.getClass();
                    mVarC = mmm.l.c(str);
                    if (mVarC.f207285a.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.v && !this.f185932s) {
                    this.f185932s = true;
                    this.f185930q.add(new d(i, j2, mVarC));
                    f();
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public final void c(OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        j1 j1Var = this.f185920a;
        if (j1Var.a("Sec-WebSocket-Extensions") != null) {
            d(this, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, 6);
            return;
        }
        OkHttpClient.a aVarA = client.a();
        m0 eventListener = m0.NONE;
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        aVarA.e = vlm.j.a(eventListener);
        aVarA.e(f185919y);
        OkHttpClient okHttpClient = new OkHttpClient(aVarA);
        i1 i1VarB = j1Var.b();
        i1VarB.b("Upgrade", "websocket");
        i1VarB.b("Connection", "Upgrade");
        i1VarB.b("Sec-WebSocket-Key", this.f185924h);
        i1VarB.b("Sec-WebSocket-Version", "13");
        i1VarB.b("Sec-WebSocket-Extensions", "permessage-deflate");
        j1 j1Var2 = new j1(i1VarB);
        q qVar = new q(okHttpClient, j1Var2, true);
        this.i = qVar;
        qVar.d(new kdh.b(this, j1Var2, 1));
    }

    public final void e() {
        int i;
        String str;
        m mVar;
        boolean z;
        synchronized (this) {
            try {
                i = this.f185933t;
                str = this.u;
                mVar = this.k;
                this.k = null;
                if (this.f185932s && this.f185930q.isEmpty()) {
                    n nVar = this.f185926l;
                    if (nVar != null) {
                        this.f185926l = null;
                        xlm.b.c(this.f185927m, this.f185928n + " writer close", 0L, new k98.a(nVar, 26), 2);
                    }
                    this.f185927m.g();
                }
                z = (this.v || this.f185926l != null || this.f185933t == -1) ? false : true;
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (z) {
            z1 z1Var = this.f185921b;
            Intrinsics.h(str);
            z1Var.a(this, i, str);
        }
        if (mVar != null) {
            vlm.h.f(mVar);
        }
    }

    public final void f() {
        TimeZone timeZone = vlm.j.f290512a;
        g gVar = this.f185925j;
        if (gVar != null) {
            this.f185927m.d(gVar, 0L);
        }
    }

    public final boolean g() {
        n nVar;
        Object obj2;
        String str;
        synchronized (this) {
            try {
                boolean z = false;
                if (this.v) {
                    return false;
                }
                n nVar2 = this.f185926l;
                Object objPoll = this.f185929p.poll();
                String str2 = null;
                int i = -1;
                if (objPoll == null) {
                    Object objPoll2 = this.f185930q.poll();
                    if (objPoll2 instanceof d) {
                        int i2 = this.f185933t;
                        str = this.u;
                        if (i2 != -1) {
                            n nVar3 = this.f185926l;
                            this.f185926l = null;
                            if (nVar3 != null && this.k == null) {
                                z = true;
                            }
                            this.f185927m.g();
                            nVar = nVar3;
                            i = i2;
                            obj2 = objPoll2;
                        } else {
                            long j2 = ((d) objPoll2).f185916c;
                            xlm.b.c(this.f185927m, this.f185928n + " cancel", TimeUnit.MILLISECONDS.toNanos(j2), new k98.a(this, 27), 4);
                            i = i2;
                            obj2 = objPoll2;
                            nVar = null;
                        }
                    } else {
                        if (objPoll2 == null) {
                            return false;
                        }
                        str = null;
                        obj2 = objPoll2;
                        nVar = null;
                    }
                } else {
                    nVar = null;
                    obj2 = null;
                    str = null;
                }
                Unit unit = Unit.f186387a;
                try {
                    if (objPoll != null) {
                        Intrinsics.h(nVar2);
                        mmm.m payload = (mmm.m) objPoll;
                        Intrinsics.checkNotNullParameter(payload, "payload");
                        nVar2.d(10, payload);
                    } else if (obj2 instanceof f) {
                        Intrinsics.h(nVar2);
                        nVar2.f(((f) obj2).f185917a, ((f) obj2).f185918b);
                        synchronized (this) {
                            this.f185931r -= (long) ((f) obj2).f185918b.f207285a.length;
                        }
                    } else {
                        if (!(obj2 instanceof d)) {
                            throw new AssertionError();
                        }
                        Intrinsics.h(nVar2);
                        int i3 = ((d) obj2).f185914a;
                        mmm.m mVar = ((d) obj2).f185915b;
                        mmm.m mVarC = mmm.m.d;
                        if (i3 != 0 || mVar != null) {
                            if (i3 != 0) {
                                if (i3 < 1000 || i3 >= 5000) {
                                    str2 = "Code must be in range [1000,5000): " + i3;
                                } else if ((1004 <= i3 && i3 < 1007) || (1015 <= i3 && i3 < 3000)) {
                                    str2 = "Code " + i3 + " is reserved and may not be used.";
                                }
                                if (str2 != null) {
                                    throw new IllegalArgumentException(str2.toString());
                                }
                            }
                            mmm.h hVar = new mmm.h();
                            hVar.A(i3);
                            if (mVar != null) {
                                hVar.v(mVar);
                            }
                            mVarC = hVar.c(hVar.f207266b);
                        }
                        try {
                            nVar2.d(8, mVarC);
                            if (z) {
                                z1 z1Var = this.f185921b;
                                Intrinsics.h(str);
                                z1Var.a(this, i, str);
                            }
                        } finally {
                            nVar2.f185952h = true;
                        }
                    }
                    return true;
                } finally {
                    if (nVar != null) {
                        vlm.h.f(nVar);
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
