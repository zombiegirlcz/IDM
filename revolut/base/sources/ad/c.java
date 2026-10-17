package ad;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes17.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f3190a = new byte[0];

    public static j a(String str) throws GeneralSecurityException {
        Map mapUnmodifiableMap;
        AtomicReference atomicReference = r.f3209a;
        synchronized (r.class) {
            mapUnmodifiableMap = Collections.unmodifiableMap(r.d);
        }
        j jVar = (j) mapUnmodifiableMap.get(str);
        if (jVar != null) {
            return jVar;
        }
        throw new GeneralSecurityException(j6.a.q("cannot find key template: ", str));
    }
}
