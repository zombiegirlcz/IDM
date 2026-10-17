package id;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes17.dex */
public final class r implements ad.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f160375a = Logger.getLogger(r.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f160376b = {0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f160377c = new r();

    @Override // ad.q
    public final Class a() {
        return ad.n.class;
    }

    @Override // ad.q
    public final Class b() {
        return ad.n.class;
    }

    @Override // ad.q
    public final Object c(mp.p pVar) throws GeneralSecurityException {
        Iterator it8 = ((ConcurrentMap) pVar.f207709b).values().iterator();
        while (it8.hasNext()) {
            for (ad.o oVar : (List) it8.next()) {
                ad.c cVar = oVar.f3207h;
                if (cVar instanceof p) {
                    p pVar2 = (p) cVar;
                    byte[] bArr = oVar.f3205c;
                    od.a aVarA = od.a.a(bArr == null ? null : Arrays.copyOf(bArr, bArr.length));
                    if (!aVarA.equals(pVar2.b())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + pVar2.c() + " has wrong output prefix (" + pVar2.b() + ") instead of (" + aVarA + ")");
                    }
                }
            }
        }
        return new q(pVar);
    }
}
