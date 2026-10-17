package fd;

import ad.d;
import ad.r;
import bd.f;
import bd.h;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import md.v0;
import md.y2;

/* JADX INFO: loaded from: classes17.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f133842a = 0;

    static {
        f[] fVarArr = {new f(d.class, 9)};
        HashMap map = new HashMap();
        f fVar = fVarArr[0];
        Class cls = fVar.f14473a;
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException(a10.b.q(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map.put(cls, fVar);
        Class cls2 = fVarArr[0].f14473a;
        Collections.unmodifiableMap(map);
        int i = y2.CONFIG_NAME_FIELD_NUMBER;
        try {
            r.g(c.f133847b);
            if (ed.d.a()) {
                return;
            }
            r.e(new h(v0.class, new f[]{new f(d.class, 9)}, 8), true);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
