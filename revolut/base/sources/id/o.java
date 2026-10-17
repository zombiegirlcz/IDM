package id;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import md.y2;

/* JADX INFO: loaded from: classes17.dex */
public abstract class o {
    static {
        bd.f[] fVarArr = {new bd.f(ad.n.class, 11)};
        HashMap map = new HashMap();
        bd.f fVar = fVarArr[0];
        Class cls = fVar.f14473a;
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException(a10.b.q(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map.put(cls, fVar);
        Class cls2 = fVarArr[0].f14473a;
        Collections.unmodifiableMap(map);
        int i = y2.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        ad.r.g(r.f160377c);
        ad.r.g(i.f160361a);
        ad.r.e(new b(), true);
        hd.n nVar = n.f160369a;
        hd.l lVar = hd.l.f151354b;
        lVar.e(n.f160369a);
        lVar.d(n.f160370b);
        lVar.c(n.f160371c);
        lVar.b(n.d);
        hd.k kVar = hd.k.f151352b;
        kVar.a(b.f);
        if (ed.d.a()) {
            return;
        }
        ad.r.e(new b(md.c.class, new bd.f[]{new bd.f(ad.n.class, 10)}), true);
        lVar.e(f.f160358a);
        lVar.d(f.f160359b);
        lVar.c(f.f160360c);
        lVar.b(f.d);
        kVar.a(b.e);
    }
}
