package ad;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import md.v1;
import md.w2;
import md.y1;
import md.z1;

/* JADX INFO: loaded from: classes17.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f3209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f3210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f3211c;
    public static final ConcurrentHashMap d;

    static {
        Logger.getLogger(r.class.getName());
        f3209a = new AtomicReference(new f());
        f3210b = new ConcurrentHashMap();
        f3211c = new ConcurrentHashMap();
        new ConcurrentHashMap();
        d = new ConcurrentHashMap();
    }

    public static synchronized void a(String str, Map map, boolean z) {
        if (z) {
            try {
                ConcurrentHashMap concurrentHashMap = f3211c;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            } finally {
            }
        }
        if (z) {
            if (((f) f3209a.get()).f3193a.containsKey(str)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!d.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (d.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) entry2.getKey()));
                    }
                }
            }
        }
    }

    public static Object b(c cVar, Class cls) throws GeneralSecurityException {
        Object aVar;
        hd.q qVar = (hd.q) hd.k.f151352b.f151353a.get();
        qVar.getClass();
        hd.p pVar = new hd.p(cVar.getClass(), cls);
        HashMap map = qVar.f151362a;
        if (!map.containsKey(pVar)) {
            throw new GeneralSecurityException("No PrimitiveConstructor for " + pVar + " available");
        }
        switch (((hd.o) map.get(pVar)).f151359b.f149037a) {
            case 15:
                aVar = new jd.a();
                if (!jd.a.f172905a.a()) {
                    throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
                }
                return aVar;
            default:
                aVar = new jd.b();
                if (!jd.b.f172906a.a()) {
                    throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
                }
                return aVar;
        }
    }

    public static Object c(String str, com.google.crypto.tink.shaded.protobuf.j jVar, Class cls) throws GeneralSecurityException {
        f fVar = (f) f3209a.get();
        fVar.getClass();
        e eVarA = fVar.a(str);
        Set setKeySet = ((Map) eVarA.f3191a.f151345c).keySet();
        hd.e eVar = eVarA.f3191a;
        if (!setKeySet.contains(cls)) {
            StringBuilder sb6 = new StringBuilder("Primitive type ");
            sb6.append(cls.getName());
            sb6.append(" not supported by key manager of type ");
            sb6.append(eVar.getClass());
            sb6.append(", supported primitives: ");
            Set<Class> setKeySet2 = ((Map) eVar.f151345c).keySet();
            StringBuilder sb9 = new StringBuilder();
            boolean z = true;
            for (Class cls2 : setKeySet2) {
                if (!z) {
                    sb9.append(", ");
                }
                sb9.append(cls2.getCanonicalName());
                z = false;
            }
            sb6.append(sb9.toString());
            throw new GeneralSecurityException(sb6.toString());
        }
        try {
            if (!((Map) eVar.f151345c).keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + eVar.toString() + " does not support primitive class " + cls.getName());
            }
            try {
                com.google.crypto.tink.shaded.protobuf.a aVarG = eVar.g(jVar);
                if (Void.class.equals(cls)) {
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                }
                eVar.i(aVarG);
                return eVar.d(aVarG, cls);
            } catch (InvalidProtocolBufferException e) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) eVar.f151343a).getName()), e);
            }
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    public static synchronized v1 d(z1 z1Var) {
        g gVar;
        hd.e eVar = ((f) f3209a.get()).a(z1Var.A()).f3191a;
        gVar = new g(eVar, (Class) eVar.f151344b);
        if (!((Boolean) f3211c.get(z1Var.A())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + z1Var.A());
        }
        return gVar.e(z1Var.B());
    }

    public static synchronized void e(hd.e eVar, boolean z) {
        try {
            AtomicReference atomicReference = f3209a;
            f fVar = new f((f) atomicReference.get());
            fVar.b(eVar);
            String strC = eVar.c();
            a(strC, z ? eVar.e().s() : Collections.EMPTY_MAP, z);
            if (!((f) atomicReference.get()).f3193a.containsKey(strC)) {
                f3210b.put(strC, new he2.b(1));
                if (z) {
                    f(strC, eVar.e().s());
                }
            }
            f3211c.put(strC, Boolean.valueOf(z));
            atomicReference.set(fVar);
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public static void f(String str, Map map) {
        w2 w2Var;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            byte[] bArrD = ((com.google.crypto.tink.shaded.protobuf.a) ((hd.d) entry.getValue()).f151341a).d();
            i iVar = ((hd.d) entry.getValue()).f151342b;
            y1 y1VarC = z1.C();
            y1VarC.e();
            z1.v((z1) y1VarC.f49436b, str);
            com.google.crypto.tink.shaded.protobuf.i iVarC = com.google.crypto.tink.shaded.protobuf.j.c(0, bArrD.length, bArrD);
            y1VarC.e();
            z1.w((z1) y1VarC.f49436b, iVarC);
            int i = h.f3198b[iVar.ordinal()];
            if (i == 1) {
                w2Var = w2.TINK;
            } else if (i == 2) {
                w2Var = w2.LEGACY;
            } else if (i == 3) {
                w2Var = w2.RAW;
            } else {
                if (i != 4) {
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                w2Var = w2.CRUNCHY;
            }
            y1VarC.e();
            z1.x((z1) y1VarC.f49436b, w2Var);
            d.put(str2, new j((z1) y1VarC.a()));
        }
    }

    public static synchronized void g(q qVar) {
        hd.k kVar = hd.k.f151352b;
        synchronized (kVar) {
            zq.a aVar = new zq.a((hd.q) kVar.f151353a.get());
            aVar.z(qVar);
            kVar.f151353a.set(new hd.q(aVar));
        }
    }
}
