package gcm;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class j4 extends ecm.a1 {
    public static final Logger o = Logger.getLogger(j4.class.getName());
    public final ecm.u0 f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c2 f142696h;
    public cpi.g k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ecm.r f142698l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ecm.r f142699m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f142700n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f142695g = new HashMap();
    public int i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f142697j = true;

    public j4(ecm.u0 u0Var) {
        ecm.r rVar = ecm.r.IDLE;
        this.f142698l = rVar;
        this.f142699m = rVar;
        boolean z = p4.f142828a;
        this.f142700n = p1.d("GRPC_PF_USE_HAPPY_EYEBALLS", false);
        this.f = (ecm.u0) Preconditions.checkNotNull(u0Var, "helper");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ecm.a1
    public final ecm.g2 a(ecm.w0 w0Var) {
        List list;
        ecm.r rVar;
        Boolean bool;
        if (this.f142698l == ecm.r.SHUTDOWN) {
            return ecm.g2.k.g("Already shut down");
        }
        List<ecm.z> list2 = w0Var.f124889a;
        ecm.b bVar = w0Var.f124890b;
        if (list2.isEmpty()) {
            ecm.g2 g2VarG = ecm.g2.f124807m.g("NameResolver returned no usable address. addrs=" + list2 + ", attrs=" + bVar);
            c(g2VarG);
            return g2VarG;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (((ecm.z) it8.next()) == null) {
                ecm.g2 g2VarG2 = ecm.g2.f124807m.g("NameResolver returned address list with null endpoint. addrs=" + list2 + ", attrs=" + bVar);
                c(g2VarG2);
                return g2VarG2;
            }
        }
        this.f142697j = true;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (ecm.z zVar : list2) {
            ArrayList arrayList2 = new ArrayList();
            for (SocketAddress socketAddress : zVar.f124900a) {
                if (hashSet.add(socketAddress)) {
                    arrayList2.add(socketAddress);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new ecm.z(arrayList2, zVar.f124901b));
            }
        }
        Object obj2 = w0Var.f124891c;
        if ((obj2 instanceof f4) && (bool = ((f4) obj2).f142641a) != null && bool.booleanValue()) {
            Collections.shuffle(arrayList, new Random());
        }
        ImmutableList immutableListBuild = ImmutableList.builder().addAll((Iterable) arrayList).build();
        c2 c2Var = this.f142696h;
        HashMap map = this.f142695g;
        if (c2Var == null) {
            c2 c2Var2 = new c2();
            c2Var2.f142597a = immutableListBuild != null ? immutableListBuild : Collections.EMPTY_LIST;
            this.f142696h = c2Var2;
        } else if (this.f142698l == ecm.r.READY) {
            SocketAddress socketAddressA = c2Var.a();
            c2 c2Var3 = this.f142696h;
            if (immutableListBuild != null) {
                list = immutableListBuild;
            } else {
                c2Var3.getClass();
                list = Collections.EMPTY_LIST;
            }
            c2Var3.f142597a = list;
            c2Var3.f142598b = 0;
            c2Var3.f142599c = 0;
            if (this.f142696h.e(socketAddressA)) {
                ecm.x0 x0Var = ((i4) map.get(socketAddressA)).f142681a;
                c2 c2Var4 = this.f142696h;
                SocketAddress socketAddressA2 = c2Var4.a();
                if (!c2Var4.c()) {
                    throw new IllegalStateException("Index is off the end of the address group list");
                }
                x0Var.i(Collections.singletonList(new ecm.z(socketAddressA2, ((ecm.z) c2Var4.f142597a.get(c2Var4.f142598b)).f124901b)));
                return ecm.g2.e;
            }
            c2 c2Var5 = this.f142696h;
            c2Var5.f142598b = 0;
            c2Var5.f142599c = 0;
        } else {
            c2Var.f142597a = immutableListBuild != null ? immutableListBuild : Collections.EMPTY_LIST;
            c2Var.f142598b = 0;
            c2Var.f142599c = 0;
        }
        HashSet<SocketAddress> hashSet2 = new HashSet(map.keySet());
        HashSet hashSet3 = new HashSet();
        UnmodifiableIterator it9 = immutableListBuild.iterator();
        while (it9.hasNext()) {
            hashSet3.addAll(((ecm.z) it9.next()).f124900a);
        }
        for (SocketAddress socketAddress2 : hashSet2) {
            if (!hashSet3.contains(socketAddress2)) {
                ((i4) map.remove(socketAddress2)).f142681a.g();
            }
        }
        if (hashSet2.size() == 0 || (rVar = this.f142698l) == ecm.r.CONNECTING || rVar == ecm.r.READY) {
            ecm.r rVar2 = ecm.r.CONNECTING;
            this.f142698l = rVar2;
            i(rVar2, new g4(ecm.v0.e));
            g();
            e();
        } else {
            ecm.r rVar3 = ecm.r.IDLE;
            if (rVar == rVar3) {
                i(rVar3, new h4(this, this));
            } else if (rVar == ecm.r.TRANSIENT_FAILURE) {
                g();
                e();
            }
        }
        return ecm.g2.e;
    }

    @Override // ecm.a1
    public final void c(ecm.g2 g2Var) {
        if (this.f142698l == ecm.r.SHUTDOWN) {
            return;
        }
        HashMap map = this.f142695g;
        Iterator it8 = map.values().iterator();
        while (it8.hasNext()) {
            ((i4) it8.next()).f142681a.g();
        }
        map.clear();
        c2 c2Var = this.f142696h;
        if (c2Var != null) {
            c2Var.f142597a = Collections.EMPTY_LIST;
            c2Var.f142598b = 0;
            c2Var.f142599c = 0;
        }
        ecm.r rVar = ecm.r.TRANSIENT_FAILURE;
        this.f142698l = rVar;
        i(rVar, new g4(ecm.v0.a(g2Var)));
    }

    @Override // ecm.a1
    public final void e() {
        final ecm.x0 x0VarA;
        c2 c2Var = this.f142696h;
        if (c2Var == null || !c2Var.c() || this.f142698l == ecm.r.SHUTDOWN) {
            return;
        }
        SocketAddress socketAddressA = this.f142696h.a();
        HashMap map = this.f142695g;
        boolean zContainsKey = map.containsKey(socketAddressA);
        Logger logger = o;
        if (zContainsKey) {
            x0VarA = ((i4) map.get(socketAddressA)).f142681a;
        } else {
            c2 c2Var2 = this.f142696h;
            if (!c2Var2.c()) {
                throw new IllegalStateException("Index is off the end of the address group list");
            }
            ecm.b bVar = ((ecm.z) c2Var2.f142597a.get(c2Var2.f142598b)).f124901b;
            e4 e4Var = new e4(this);
            gpk.c cVarB = ecm.r0.b();
            cVarB.i(Lists.newArrayList(new ecm.z(socketAddressA, bVar)));
            cVarB.a(ecm.a1.f124777c, e4Var);
            x0VarA = this.f.a(new ecm.r0((List) cVarB.f145463a, (ecm.b) cVarB.f145464b, (Object[][]) cVarB.f145465c));
            if (x0VarA == null) {
                logger.warning("Was not able to create subchannel for " + socketAddressA);
                throw new IllegalStateException("Can't create subchannel");
            }
            i4 i4Var = new i4(x0VarA, ecm.r.IDLE, e4Var);
            e4Var.f142628b = i4Var;
            map.put(socketAddressA, i4Var);
            if (x0VarA.c().f124780a.get(ecm.a1.d) == null) {
                e4Var.f142627a = ecm.s.a(ecm.r.READY);
            }
            x0VarA.h(new ecm.z0() { // from class: gcm.c4
                @Override // ecm.z0
                public final void a(ecm.s sVar) {
                    ecm.x0 x0Var;
                    j4 j4Var = this.f142603a;
                    ecm.u0 u0Var = j4Var.f;
                    ecm.r rVar = sVar.f124871a;
                    HashMap map2 = j4Var.f142695g;
                    ecm.x0 x0Var2 = x0VarA;
                    i4 i4Var2 = (i4) map2.get((SocketAddress) x0Var2.a().f124900a.get(0));
                    if (i4Var2 == null || (x0Var = i4Var2.f142681a) != x0Var2 || rVar == ecm.r.SHUTDOWN) {
                        return;
                    }
                    ecm.r rVar2 = ecm.r.IDLE;
                    if (rVar == rVar2) {
                        u0Var.e();
                    }
                    i4.a(i4Var2, rVar);
                    ecm.r rVar3 = j4Var.f142698l;
                    ecm.r rVar4 = ecm.r.TRANSIENT_FAILURE;
                    if (rVar3 == rVar4 || j4Var.f142699m == rVar4) {
                        if (rVar == ecm.r.CONNECTING) {
                            return;
                        }
                        if (rVar == rVar2) {
                            j4Var.e();
                            return;
                        }
                    }
                    int i = d4.f142615a[rVar.ordinal()];
                    if (i == 1) {
                        c2 c2Var3 = j4Var.f142696h;
                        c2Var3.f142598b = 0;
                        c2Var3.f142599c = 0;
                        j4Var.f142698l = rVar2;
                        j4Var.i(rVar2, new h4(j4Var, j4Var));
                        return;
                    }
                    if (i == 2) {
                        ecm.r rVar5 = ecm.r.CONNECTING;
                        j4Var.f142698l = rVar5;
                        j4Var.i(rVar5, new g4(ecm.v0.e));
                        return;
                    }
                    if (i == 3) {
                        j4Var.g();
                        for (i4 i4Var3 : map2.values()) {
                            if (!i4Var3.f142681a.equals(x0Var)) {
                                i4Var3.f142681a.g();
                            }
                        }
                        map2.clear();
                        ecm.r rVar6 = ecm.r.READY;
                        i4.a(i4Var2, rVar6);
                        map2.put((SocketAddress) x0Var.a().f124900a.get(0), i4Var2);
                        j4Var.f142696h.e((SocketAddress) x0Var2.a().f124900a.get(0));
                        j4Var.f142698l = rVar6;
                        j4Var.j(i4Var2);
                        return;
                    }
                    if (i != 4) {
                        throw new IllegalArgumentException("Unsupported state:" + rVar);
                    }
                    if (j4Var.f142696h.c() && ((i4) map2.get(j4Var.f142696h.a())).f142681a == x0Var2 && j4Var.f142696h.b()) {
                        j4Var.g();
                        j4Var.e();
                    }
                    c2 c2Var4 = j4Var.f142696h;
                    if (c2Var4 == null || c2Var4.c()) {
                        return;
                    }
                    int size = map2.size();
                    List list = j4Var.f142696h.f142597a;
                    if (size < (list != null ? list.size() : 0)) {
                        return;
                    }
                    Iterator it8 = map2.values().iterator();
                    while (it8.hasNext()) {
                        if (!((i4) it8.next()).d) {
                            return;
                        }
                    }
                    ecm.r rVar7 = ecm.r.TRANSIENT_FAILURE;
                    j4Var.f142698l = rVar7;
                    j4Var.i(rVar7, new g4(ecm.v0.a(sVar.f124872b)));
                    int i2 = j4Var.i + 1;
                    j4Var.i = i2;
                    List list2 = j4Var.f142696h.f142597a;
                    if (i2 >= (list2 != null ? list2.size() : 0) || j4Var.f142697j) {
                        j4Var.f142697j = false;
                        j4Var.i = 0;
                        u0Var.e();
                    }
                }
            });
        }
        int i = d4.f142615a[((i4) map.get(socketAddressA)).f142682b.ordinal()];
        if (i == 1) {
            x0VarA.f();
            i4.a((i4) map.get(socketAddressA), ecm.r.CONNECTING);
            h();
        } else {
            if (i == 2) {
                if (this.f142700n) {
                    h();
                    return;
                } else {
                    x0VarA.f();
                    return;
                }
            }
            if (i == 3) {
                logger.warning("Requesting a connection even though we have a READY subchannel");
            } else {
                if (i != 4) {
                    return;
                }
                this.f142696h.b();
                e();
            }
        }
    }

    @Override // ecm.a1
    public final void f() {
        Level level = Level.FINE;
        HashMap map = this.f142695g;
        o.log(level, "Shutting down, currently have {} subchannels created", Integer.valueOf(map.size()));
        ecm.r rVar = ecm.r.SHUTDOWN;
        this.f142698l = rVar;
        this.f142699m = rVar;
        g();
        Iterator it8 = map.values().iterator();
        while (it8.hasNext()) {
            ((i4) it8.next()).f142681a.g();
        }
        map.clear();
    }

    public final void g() {
        cpi.g gVar = this.k;
        if (gVar != null) {
            gVar.k();
            this.k = null;
        }
    }

    public final void h() {
        ecm.u0 u0Var = this.f;
        if (this.f142700n) {
            cpi.g gVar = this.k;
            if (gVar != null) {
                ecm.j2 j2Var = (ecm.j2) gVar.f107954b;
                if (!j2Var.f124829c && !j2Var.f124828b) {
                    return;
                }
            }
            try {
                ecm.k2 k2VarD = u0Var.d();
                this.k = k2VarD.c(u0Var.c(), new ag.q(this, 12), 250L, TimeUnit.MILLISECONDS);
            } catch (NullPointerException unused) {
            }
        }
    }

    public final void i(ecm.r rVar, ecm.y0 y0Var) {
        if (rVar == this.f142699m && (rVar == ecm.r.IDLE || rVar == ecm.r.CONNECTING)) {
            return;
        }
        this.f142699m = rVar;
        this.f.f(rVar, y0Var);
    }

    public final void j(i4 i4Var) {
        ecm.r rVar = i4Var.f142682b;
        ecm.r rVar2 = ecm.r.READY;
        if (rVar != rVar2) {
            return;
        }
        ecm.s sVar = i4Var.f142683c.f142627a;
        ecm.r rVar3 = sVar.f124871a;
        if (rVar3 == rVar2) {
            i(rVar2, new ecm.t0(ecm.v0.b(i4Var.f142681a, null)));
            return;
        }
        ecm.r rVar4 = ecm.r.TRANSIENT_FAILURE;
        if (rVar3 == rVar4) {
            i(rVar4, new g4(ecm.v0.a(sVar.f124872b)));
        } else if (this.f142699m != rVar4) {
            i(rVar3, new g4(ecm.v0.e));
        }
    }
}
