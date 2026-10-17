package hd;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes17.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final by5.a f151367a = new by5.a(16);

    public static void a(mp.p pVar) {
        ad.g gVar;
        ArrayList arrayList = new ArrayList();
        kd.a aVar = kd.a.f182756b;
        Iterator it8 = ((ConcurrentMap) pVar.f207709b).values().iterator();
        while (it8.hasNext()) {
            for (ad.o oVar : (List) it8.next()) {
                int i = h.f151348a[oVar.d.ordinal()];
                if (i == 1) {
                    gVar = ad.g.f3194c;
                } else if (i == 2) {
                    gVar = ad.g.d;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    gVar = ad.g.e;
                }
                int i2 = oVar.f;
                String strSubstring = oVar.f3206g;
                if (strSubstring.startsWith("type.googleapis.com/google.crypto.")) {
                    strSubstring = strSubstring.substring(34);
                }
                arrayList.add(new kd.b(gVar, i2, strSubstring, oVar.e.name()));
            }
        }
        ad.o oVar2 = (ad.o) pVar.f207710c;
        Integer numValueOf = oVar2 != null ? Integer.valueOf(oVar2.f) : null;
        if (numValueOf != null) {
            try {
                int iIntValue = numValueOf.intValue();
                Iterator it9 = arrayList.iterator();
                while (it9.hasNext()) {
                    if (((kd.b) it9.next()).f182759b == iIntValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
        Collections.unmodifiableList(arrayList);
    }
}
