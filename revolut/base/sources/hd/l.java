package hd;

import com.google.crypto.tink.internal.TinkBugException;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import md.u1;

/* JADX INFO: loaded from: classes17.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f151354b = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f151355a = new AtomicReference(new v(new h30.q(5)));

    public final ad.c a(r rVar) {
        AtomicReference atomicReference = this.f151355a;
        v vVar = (v) atomicReference.get();
        vVar.getClass();
        od.a aVar = (od.a) rVar.f151365b;
        if (!vVar.f151373b.containsKey(new t(r.class, aVar))) {
            try {
                g gVar = new g();
                int i = f.f151347b[((u1) rVar.d).ordinal()];
                return gVar;
            } catch (GeneralSecurityException e) {
                throw new TinkBugException("Creating a LegacyProtoKey failed", e);
            }
        }
        v vVar2 = (v) atomicReference.get();
        vVar2.getClass();
        t tVar = new t(r.class, aVar);
        HashMap map = vVar2.f151373b;
        if (map.containsKey(tVar)) {
            return ((a) map.get(tVar)).f151339b.a(rVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + tVar + " available");
    }

    public final synchronized void b(a aVar) {
        h30.q qVar = new h30.q((v) this.f151355a.get());
        qVar.L0(aVar);
        this.f151355a.set(new v(qVar));
    }

    public final synchronized void c(c cVar) {
        h30.q qVar = new h30.q((v) this.f151355a.get());
        qVar.M0(cVar);
        this.f151355a.set(new v(qVar));
    }

    public final synchronized void d(m mVar) {
        h30.q qVar = new h30.q((v) this.f151355a.get());
        qVar.N0(mVar);
        this.f151355a.set(new v(qVar));
    }

    public final synchronized void e(n nVar) {
        h30.q qVar = new h30.q((v) this.f151355a.get());
        qVar.O0(nVar);
        this.f151355a.set(new v(qVar));
    }
}
