package mcm;

import ch.qos.logback.core.CoreConstants;
import com.google.common.base.Preconditions;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes22.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f204399a;
    public Long d;
    public int e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile jid.z f204400b = new jid.z();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public jid.z f204401c = new jid.z();
    public final HashSet f = new HashSet();

    public n(s sVar) {
        this.f204399a = sVar;
    }

    public final void a(w wVar) {
        if (d() && !wVar.f204419c) {
            wVar.k();
        } else if (!d() && wVar.f204419c) {
            wVar.f204419c = false;
            ecm.s sVar = wVar.d;
            if (sVar != null) {
                wVar.e.a(sVar);
                wVar.f.b(ecm.f.INFO, "Subchannel unejected: {0}", wVar);
            }
        }
        wVar.f204418b = this;
        this.f.add(wVar);
    }

    public final void b(long j2) {
        this.d = Long.valueOf(j2);
        this.e++;
        Iterator it8 = this.f.iterator();
        while (it8.hasNext()) {
            ((w) it8.next()).k();
        }
    }

    public final long c() {
        return ((AtomicLong) this.f204401c.f174462c).get() + ((AtomicLong) this.f204401c.f174461b).get();
    }

    public final boolean d() {
        return this.d != null;
    }

    public final void e() {
        Preconditions.checkState(this.d != null, "not currently ejected");
        this.d = null;
        for (w wVar : this.f) {
            wVar.f204419c = false;
            ecm.s sVar = wVar.d;
            if (sVar != null) {
                wVar.e.a(sVar);
                wVar.f.b(ecm.f.INFO, "Subchannel unejected: {0}", wVar);
            }
        }
    }

    public final String toString() {
        return "EndpointTracker{subchannels=" + this.f + CoreConstants.CURLY_RIGHT;
    }
}
