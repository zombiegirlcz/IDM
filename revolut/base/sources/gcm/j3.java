package gcm;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class j3 extends ecm.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecm.r0 f142689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.n0 f142690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f142691c;
    public final t d;
    public List e;
    public g2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f142692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f142693h;
    public cpi.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k3 f142694j;

    public j3(k3 k3Var, ecm.r0 r0Var) {
        this.f142694j = k3Var;
        Preconditions.checkNotNull(r0Var, "args");
        List list = r0Var.f124864a;
        this.e = list;
        Logger logger = k3.f142706d0;
        this.f142689a = r0Var;
        ecm.n0 n0Var = new ecm.n0("Subchannel", k3Var.u.e(), ecm.n0.d.incrementAndGet());
        this.f142690b = n0Var;
        g6 g6Var = k3Var.f142718m;
        t tVar = new t(n0Var, g6Var.a(), "Subchannel for " + list);
        this.d = tVar;
        this.f142691c = new q(tVar, g6Var);
    }

    @Override // ecm.x0
    public final List b() {
        this.f142694j.f142719n.d();
        Preconditions.checkState(this.f142692g, "not started");
        return this.e;
    }

    @Override // ecm.x0
    public final ecm.b c() {
        return this.f142689a.f124865b;
    }

    @Override // ecm.x0
    public final ecm.g d() {
        return this.f142691c;
    }

    @Override // ecm.x0
    public final Object e() {
        Preconditions.checkState(this.f142692g, "Subchannel is not started");
        return this.f;
    }

    @Override // ecm.x0
    public final void f() {
        this.f142694j.f142719n.d();
        Preconditions.checkState(this.f142692g, "not started");
        g2 g2Var = this.f;
        if (g2Var.v != null) {
            return;
        }
        g2Var.k.execute(new x1(g2Var, 0));
    }

    @Override // ecm.x0
    public final void g() {
        cpi.g gVar;
        k3 k3Var = this.f142694j;
        k3Var.f142719n.d();
        if (this.f == null) {
            this.f142693h = true;
            return;
        }
        if (!this.f142693h) {
            this.f142693h = true;
        } else {
            if (!k3Var.H || (gVar = this.i) == null) {
                return;
            }
            gVar.k();
            this.i = null;
        }
        if (!k3Var.H) {
            this.i = k3Var.f142719n.c(k3Var.f142714g.f142787a.getScheduledExecutorService(), new q2(new com.bumptech.glide.k(this, 6)), 5L, TimeUnit.SECONDS);
        } else {
            g2 g2Var = this.f;
            g2Var.k.execute(new ch.p(12, g2Var, false, k3.f142707e0));
        }
    }

    @Override // ecm.x0
    public final void h(ecm.z0 z0Var) {
        k3 k3Var = this.f142694j;
        k3Var.f142719n.d();
        Preconditions.checkState(!this.f142692g, "already started");
        Preconditions.checkState(!this.f142693h, "already shutdown");
        Preconditions.checkState(!k3Var.H, "Channel is being terminated");
        this.f142692g = true;
        List list = this.f142689a.f124864a;
        String strE = k3Var.u.e();
        m mVar = k3Var.f142724t;
        o oVar = k3Var.f142714g;
        ScheduledExecutorService scheduledExecutorService = oVar.f142787a.getScheduledExecutorService();
        Supplier supplier = k3Var.f142721q;
        ecm.k2 k2Var = k3Var.f142719n;
        ao.h hVar = new ao.h(this, z0Var, 13);
        ecm.j0 j0Var = k3Var.O;
        k3Var.K.getClass();
        g2 g2Var = new g2(list, strE, mVar, oVar, scheduledExecutorService, supplier, k2Var, hVar, j0Var, new com.google.firebase.messaging.t(10), this.d, this.f142690b, this.f142691c, k3Var.v);
        t tVar = k3Var.M;
        ecm.g0 g0Var = ecm.g0.CT_INFO;
        long jA = k3Var.f142718m.a();
        Long lValueOf = Long.valueOf(jA);
        Preconditions.checkNotNull("Child Subchannel started", "description");
        Preconditions.checkNotNull(g0Var, "severity");
        Preconditions.checkNotNull(lValueOf, "timestampNanos");
        Preconditions.checkState(true, "at least one of channelRef and subchannelRef must be null");
        tVar.b(new ecm.h0("Child Subchannel started", g0Var, jA, g2Var));
        this.f = g2Var;
        k3Var.A.add(g2Var);
    }

    @Override // ecm.x0
    public final void i(List list) {
        this.f142694j.f142719n.d();
        this.e = list;
        g2 g2Var = this.f;
        g2Var.getClass();
        Preconditions.checkNotNull(list, "newAddressGroups");
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            Preconditions.checkNotNull(it8.next(), "newAddressGroups contains null entry");
        }
        Preconditions.checkArgument(!list.isEmpty(), "newAddressGroups is empty");
        g2Var.k.execute(new au0.x5(14, (Object) g2Var, false, (Object) Collections.unmodifiableList(new ArrayList(list))));
    }

    public final String toString() {
        return this.f142690b.toString();
    }
}
