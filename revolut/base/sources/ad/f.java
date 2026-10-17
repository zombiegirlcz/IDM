package ad;

import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes17.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f3192b = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f3193a;

    public f(f fVar) {
        this.f3193a = new ConcurrentHashMap(fVar.f3193a);
    }

    public final synchronized e a(String str) {
        if (!this.f3193a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (e) this.f3193a.get(str);
    }

    public final synchronized void b(hd.e eVar) {
        if (!eVar.b().a()) {
            throw new GeneralSecurityException("failed to register key manager " + eVar.getClass() + " as it is not FIPS compatible.");
        }
        c(new e(eVar));
    }

    public final synchronized void c(e eVar) {
        try {
            hd.e eVar2 = eVar.f3191a;
            Class cls = (Class) eVar2.f151344b;
            if (!((Map) eVar2.f151345c).keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + eVar2.toString() + " does not support primitive class " + cls.getName());
            }
            String strC = eVar2.c();
            e eVar3 = (e) this.f3193a.get(strC);
            if (eVar3 != null && !eVar3.f3191a.getClass().equals(eVar.f3191a.getClass())) {
                f3192b.warning("Attempted overwrite of a registered key manager for key type ".concat(strC));
                throw new GeneralSecurityException("typeUrl (" + strC + ") is already registered with " + eVar3.f3191a.getClass().getName() + ", cannot be re-registered with " + eVar.f3191a.getClass().getName());
            }
            this.f3193a.putIfAbsent(strC, eVar);
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public f() {
        this.f3193a = new ConcurrentHashMap();
    }
}
