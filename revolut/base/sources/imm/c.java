package imm;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f162567a;

    public c(X509Certificate... caCerts) {
        Intrinsics.checkNotNullParameter(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : caCerts) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f162567a = linkedHashMap;
    }

    @Override // imm.g
    public final X509Certificate a(X509Certificate cert) {
        Intrinsics.checkNotNullParameter(cert, "cert");
        Set set = (Set) this.f162567a.get(cert.getIssuerX500Principal());
        Object obj2 = null;
        if (set == null) {
            return null;
        }
        Iterator it8 = set.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            try {
                cert.verify(((X509Certificate) next).getPublicKey());
                obj2 = next;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 != this) {
            return (obj2 instanceof c) && Intrinsics.f(((c) obj2).f162567a, this.f162567a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f162567a.hashCode();
    }
}
