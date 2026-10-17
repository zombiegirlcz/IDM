package id;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes17.dex */
public final class i implements ad.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f160361a = new i();

    @Override // ad.q
    public final Class a() {
        return g.class;
    }

    @Override // ad.q
    public final Class b() {
        return g.class;
    }

    @Override // ad.q
    public final Object c(mp.p pVar) throws GeneralSecurityException {
        if (((ad.o) pVar.f207710c) == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it8 = ((ConcurrentMap) pVar.f207709b).values().iterator();
        while (it8.hasNext()) {
            Iterator it9 = ((List) it8.next()).iterator();
            while (it9.hasNext()) {
            }
        }
        return new h();
    }
}
