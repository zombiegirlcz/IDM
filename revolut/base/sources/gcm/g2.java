package gcm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes13.dex */
public final class g2 implements ecm.m0, i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecm.n0 f142643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f142644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f142645c;
    public final ao.h d;
    public final f0 e;
    public final ScheduledExecutorService f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ecm.j0 f142646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.firebase.messaging.t f142647h;
    public final ecm.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f142648j;
    public final ecm.k2 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c2 f142649l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile List f142650m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b1 f142651n;
    public final Stopwatch o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public cpi.g f142652p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public cpi.g f142653q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public s3 f142654r;
    public b2 u;
    public volatile b2 v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ecm.g2 f142658x;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f142655s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w1 f142656t = new w1(this, 0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile ecm.s f142657w = ecm.s.a(ecm.r.IDLE);

    public g2(List list, String str, m mVar, o oVar, ScheduledExecutorService scheduledExecutorService, Supplier supplier, ecm.k2 k2Var, ao.h hVar, ecm.j0 j0Var, com.google.firebase.messaging.t tVar, t tVar2, ecm.n0 n0Var, ecm.g gVar, ArrayList arrayList) {
        Preconditions.checkNotNull(list, "addressGroups");
        Preconditions.checkArgument(!list.isEmpty(), "addressGroups is empty");
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            Preconditions.checkNotNull(it8.next(), "addressGroups contains null entry");
        }
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f142650m = listUnmodifiableList;
        c2 c2Var = new c2();
        c2Var.f142597a = listUnmodifiableList;
        this.f142649l = c2Var;
        this.f142644b = str;
        this.f142645c = mVar;
        this.e = oVar;
        this.f = scheduledExecutorService;
        this.o = (Stopwatch) supplier.get();
        this.k = k2Var;
        this.d = hVar;
        this.f142646g = j0Var;
        this.f142647h = tVar;
        this.f142643a = (ecm.n0) Preconditions.checkNotNull(n0Var, "logId");
        this.i = (ecm.g) Preconditions.checkNotNull(gVar, "channelLogger");
        this.f142648j = arrayList;
    }

    public static void e(g2 g2Var, ecm.r rVar) {
        g2Var.k.d();
        g2Var.g(ecm.s.a(rVar));
    }

    public static void f(g2 g2Var) {
        SocketAddress socketAddress;
        ecm.f0 f0Var;
        c2 c2Var = g2Var.f142649l;
        ecm.k2 k2Var = g2Var.k;
        k2Var.d();
        Preconditions.checkState(g2Var.f142652p == null, "Should have no reconnectTask scheduled");
        if (c2Var.f142598b == 0 && c2Var.f142599c == 0) {
            g2Var.o.reset().start();
        }
        SocketAddress socketAddress2 = (SocketAddress) ((ecm.z) c2Var.f142597a.get(c2Var.f142598b)).f124900a.get(c2Var.f142599c);
        if (socketAddress2 instanceof ecm.f0) {
            f0Var = (ecm.f0) socketAddress2;
            socketAddress = f0Var.f124799b;
        } else {
            socketAddress = socketAddress2;
            f0Var = null;
        }
        ecm.b bVar = ((ecm.z) c2Var.f142597a.get(c2Var.f142598b)).f124901b;
        String str = (String) bVar.f124780a.get(ecm.z.d);
        e0 e0Var = new e0();
        e0Var.f142621a = "unknown-authority";
        e0Var.f142622b = ecm.b.f124779b;
        if (str == null) {
            str = g2Var.f142644b;
        }
        e0Var.f142621a = (String) Preconditions.checkNotNull(str, "authority");
        Preconditions.checkNotNull(bVar, "eagAttributes");
        e0Var.f142622b = bVar;
        e0Var.f142623c = f0Var;
        f2 f2Var = new f2();
        f2Var.f142637a = g2Var.f142643a;
        b2 b2Var = new b2(g2Var.e.E5(socketAddress, e0Var, f2Var), g2Var.f142647h);
        f2Var.f142637a = b2Var.a();
        g2Var.u = b2Var;
        g2Var.f142655s.add(b2Var);
        Runnable runnableB = b2Var.b(new e2(g2Var, b2Var));
        if (runnableB != null) {
            k2Var.b(runnableB);
        }
        g2Var.i.b(ecm.f.INFO, "Started transport {0}", f2Var.f142637a);
    }

    public static String h(ecm.g2 g2Var) {
        StringBuilder sb6 = new StringBuilder();
        ecm.e2 e2Var = g2Var.f124809a;
        Throwable th10 = g2Var.f124811c;
        sb6.append(e2Var);
        String str = g2Var.f124810b;
        if (str != null) {
            a0.d.C(sb6, "(", str, ")");
        }
        if (th10 != null) {
            sb6.append("[");
            sb6.append(th10);
            sb6.append("]");
        }
        return sb6.toString();
    }

    @Override // ecm.m0
    public final ecm.n0 a() {
        return this.f142643a;
    }

    public final void g(ecm.s sVar) {
        this.k.d();
        if (this.f142657w.f124871a != sVar.f124871a) {
            Preconditions.checkState(this.f142657w.f124871a != ecm.r.SHUTDOWN, "Cannot transition out of SHUTDOWN to " + sVar);
            this.f142657w = sVar;
            ecm.z0 z0Var = (ecm.z0) this.d.f7847b;
            Preconditions.checkState(true, "listener is null");
            z0Var.a(sVar);
        }
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("logId", this.f142643a.f124847c).add("addressGroups", this.f142650m).toString();
    }
}
