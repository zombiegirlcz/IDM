package mcm;

import ch.qos.logback.core.CoreConstants;
import com.google.common.base.Preconditions;
import ecm.a1;
import ecm.g2;
import ecm.q1;
import ecm.r0;
import ecm.x0;
import ecm.z0;
import gcm.k4;
import java.lang.reflect.Array;
import java.net.SocketAddress;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes22.dex */
public final class w extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f204417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f204418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f204419c;
    public ecm.s d;
    public z0 e;
    public final ecm.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y f204420g;

    public w(y yVar, r0 r0Var, k kVar) {
        this.f204420g = yVar;
        q1 q1Var = a1.f124777c;
        z0 z0Var = (z0) r0Var.a(q1Var);
        if (z0Var != null) {
            this.e = z0Var;
            k4 k4Var = new k4(this, z0Var, 2);
            gpk.c cVarB = r0.b();
            cVarB.i(r0Var.f124864a);
            cVarB.f145464b = (ecm.b) Preconditions.checkNotNull(r0Var.f124865b, "attrs");
            Object[][] objArr = r0Var.f124866c;
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
            cVarB.f145465c = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            cVarB.a(q1Var, k4Var);
            this.f204417a = kVar.a(new r0((List) cVarB.f145463a, (ecm.b) cVarB.f145464b, (Object[][]) cVarB.f145465c));
        } else {
            this.f204417a = kVar.a(r0Var);
        }
        this.f = this.f204417a.d();
    }

    @Override // ecm.x0
    public final ecm.b c() {
        n nVar = this.f204418b;
        x0 x0Var = this.f204417a;
        if (nVar == null) {
            return x0Var.c();
        }
        ecm.b bVarC = x0Var.c();
        bVarC.getClass();
        ecm.a aVar = y.o;
        n nVar2 = this.f204418b;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(aVar, nVar2);
        for (Map.Entry entry : bVarC.f124780a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((ecm.a) entry.getKey(), entry.getValue());
            }
        }
        return new ecm.b(identityHashMap);
    }

    @Override // mcm.d, ecm.x0
    public final void g() {
        n nVar = this.f204418b;
        if (nVar != null) {
            this.f204418b = null;
            nVar.f.remove(this);
        }
        super.g();
    }

    @Override // ecm.x0
    public final void h(z0 z0Var) {
        if (this.e != null) {
            j().h(z0Var);
            return;
        }
        this.e = z0Var;
        j().h(new k4(this, z0Var, 2));
    }

    @Override // mcm.d, ecm.x0
    public final void i(List list) {
        y yVar = this.f204420g;
        if (y.g(b()) && y.g(list)) {
            if (yVar.f.containsValue(this.f204418b)) {
                n nVar = this.f204418b;
                nVar.getClass();
                this.f204418b = null;
                nVar.f.remove(this);
            }
            SocketAddress socketAddress = (SocketAddress) ((ecm.z) list.get(0)).f124900a.get(0);
            if (yVar.f204421g.containsKey(socketAddress)) {
                ((n) yVar.f204421g.get(socketAddress)).a(this);
            }
        } else if (!y.g(b()) || y.g(list)) {
            if (!y.g(b()) && y.g(list)) {
                SocketAddress socketAddress2 = (SocketAddress) ((ecm.z) list.get(0)).f124900a.get(0);
                if (yVar.f204421g.containsKey(socketAddress2)) {
                    ((n) yVar.f204421g.get(socketAddress2)).a(this);
                }
            }
        } else if (yVar.f204421g.containsKey(a().f124900a.get(0))) {
            n nVar2 = (n) yVar.f204421g.get(a().f124900a.get(0));
            nVar2.getClass();
            this.f204418b = null;
            nVar2.f.remove(this);
            jid.z zVar = nVar2.f204400b;
            ((AtomicLong) zVar.f174461b).set(0L);
            ((AtomicLong) zVar.f174462c).set(0L);
            jid.z zVar2 = nVar2.f204401c;
            ((AtomicLong) zVar2.f174461b).set(0L);
            ((AtomicLong) zVar2.f174462c).set(0L);
        }
        this.f204417a.i(list);
    }

    @Override // mcm.d
    public final x0 j() {
        return this.f204417a;
    }

    public final void k() {
        this.f204419c = true;
        z0 z0Var = this.e;
        g2 g2VarG = g2.f124807m.g("The subchannel has been ejected by outlier detection");
        Preconditions.checkArgument(true ^ g2VarG.e(), "The error status must not be OK");
        z0Var.a(new ecm.s(ecm.r.TRANSIENT_FAILURE, g2VarG));
        this.f.b(ecm.f.INFO, "Subchannel ejected: {0}", this);
    }

    @Override // mcm.d
    public final String toString() {
        return "OutlierDetectionSubchannel{addresses=" + this.f204417a.b() + CoreConstants.CURLY_RIGHT;
    }
}
