package mcm;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import ecm.a1;
import ecm.g2;
import ecm.i2;
import ecm.j2;
import ecm.k2;
import ecm.u0;
import ecm.w0;
import gcm.g6;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes22.dex */
public final class y extends a1 {
    public static final ecm.a o = new ecm.a("endpointTrackerKey");
    public final p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f204421g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k2 f204422h;
    public final i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g6 f204423j;
    public final ScheduledExecutorService k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public cpi.g f204424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Long f204425m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ecm.g f204426n;

    public y(u0 u0Var) {
        ecm.g gVarB = u0Var.b();
        this.f204426n = gVarB;
        this.i = new i(new f(this, (u0) Preconditions.checkNotNull(u0Var, "helper")));
        this.f = new p();
        this.f204422h = (k2) Preconditions.checkNotNull(u0Var.d(), "syncContext");
        this.k = (ScheduledExecutorService) Preconditions.checkNotNull(u0Var.c(), "timeService");
        this.f204423j = g6.f142663a;
        gVarB.a(ecm.f.DEBUG, "OutlierDetection lb created.");
    }

    public static boolean g(List list) {
        Iterator it8 = list.iterator();
        int size = 0;
        while (it8.hasNext()) {
            size += ((ecm.z) it8.next()).f124900a.size();
            if (size > 1) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList h(p pVar, int i) {
        ArrayList arrayList = new ArrayList();
        for (n nVar : pVar.values()) {
            if (nVar.c() >= i) {
                arrayList.add(nVar);
            }
        }
        return arrayList;
    }

    @Override // ecm.a1
    public final g2 a(w0 w0Var) {
        s sVar;
        HashMap map = this.f204421g;
        final p pVar = this.f;
        ecm.g gVar = this.f204426n;
        gVar.b(ecm.f.DEBUG, "Received resolution result: {0}", w0Var);
        final s sVar2 = (s) w0Var.f124891c;
        HashSet hashSet = new HashSet();
        HashMap map2 = new HashMap();
        for (ecm.z zVar : w0Var.f124889a) {
            ImmutableSet immutableSetCopyOf = ImmutableSet.copyOf((Collection) zVar.f124900a);
            hashSet.add(immutableSetCopyOf);
            for (SocketAddress socketAddress : zVar.f124900a) {
                if (map2.containsKey(socketAddress)) {
                    gVar.b(ecm.f.WARNING, "Unexpected duplicated address {0} belongs to multiple endpoints", socketAddress);
                }
                map2.put(socketAddress, immutableSetCopyOf);
            }
        }
        pVar.keySet().retainAll(hashSet);
        Iterator it8 = pVar.f204404a.values().iterator();
        while (it8.hasNext()) {
            ((n) it8.next()).f204399a = sVar2;
        }
        hashSet.forEach(new Consumer() { // from class: mcm.o
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                pVar.f204404a.putIfAbsent((Set) obj2, new n(sVar2));
            }
        });
        map.clear();
        for (Map.Entry entry : map2.entrySet()) {
            map.put((SocketAddress) entry.getKey(), (n) pVar.get(entry.getValue()));
        }
        r rVar = sVar2.e;
        Long l2 = sVar2.f204411a;
        if (rVar == null && sVar2.f == null) {
            cpi.g gVar2 = this.f204424l;
            if (gVar2 != null) {
                gVar2.k();
                this.f204425m = null;
                for (n nVar : pVar.f204404a.values()) {
                    if (nVar.d()) {
                        nVar.e();
                    }
                    nVar.e = 0;
                }
            }
            sVar = sVar2;
        } else {
            Long lValueOf = this.f204425m == null ? l2 : Long.valueOf(Math.max(0L, l2.longValue() - (this.f204423j.a() - this.f204425m.longValue())));
            cpi.g gVar3 = this.f204424l;
            if (gVar3 != null) {
                gVar3.k();
                for (n nVar2 : pVar.f204404a.values()) {
                    jid.z zVar2 = nVar2.f204400b;
                    ((AtomicLong) zVar2.f174461b).set(0L);
                    ((AtomicLong) zVar2.f174462c).set(0L);
                    jid.z zVar3 = nVar2.f204401c;
                    ((AtomicLong) zVar3.f174461b).set(0L);
                    ((AtomicLong) zVar3.f174462c).set(0L);
                }
            }
            k2 k2Var = this.f204422h;
            sVar = sVar2;
            et0.w wVar = new et0.w((Object) this, (Object) sVar, (Object) gVar, false, 5);
            long jLongValue = lValueOf.longValue();
            long jLongValue2 = l2.longValue();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            ScheduledExecutorService scheduledExecutorService = this.k;
            k2Var.getClass();
            j2 j2Var = new j2(wVar);
            this.f204424l = new cpi.g(j2Var, scheduledExecutorService.scheduleWithFixedDelay(new i2(k2Var, j2Var, wVar, jLongValue2), jLongValue, jLongValue2, timeUnit));
        }
        i iVar = this.i;
        jpf.a aVarA = w0Var.a();
        aVarA.f177269c = sVar.f204414g;
        iVar.d(aVarA.b());
        return g2.e;
    }

    @Override // ecm.a1
    public final void c(g2 g2Var) {
        this.i.c(g2Var);
    }

    @Override // ecm.a1
    public final void f() {
        this.i.f();
    }
}
