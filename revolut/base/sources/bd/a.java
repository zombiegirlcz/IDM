package bd;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import md.b1;
import md.b3;
import md.j0;
import md.o2;
import md.p0;
import md.t2;
import md.y2;

/* JADX INFO: loaded from: classes17.dex */
public abstract class a {
    static {
        f[] fVarArr = {new f(ad.a.class, 0)};
        HashMap map = new HashMap();
        f fVar = fVarArr[0];
        Class cls = fVar.f14473a;
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException(a10.b.q(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map.put(cls, fVar);
        Class cls2 = fVarArr[0].f14473a;
        Collections.unmodifiableMap(map);
        f[] fVarArr2 = {new f(ad.a.class, 3)};
        HashMap map2 = new HashMap();
        f fVar2 = fVarArr2[0];
        Class cls3 = fVar2.f14473a;
        if (map2.containsKey(cls3)) {
            throw new IllegalArgumentException(a10.b.q(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map2.put(cls3, fVar2);
        Class cls4 = fVarArr2[0].f14473a;
        Collections.unmodifiableMap(map2);
        f[] fVarArr3 = {new f(ad.a.class, 4)};
        HashMap map3 = new HashMap();
        f fVar3 = fVarArr3[0];
        Class cls5 = fVar3.f14473a;
        if (map3.containsKey(cls5)) {
            throw new IllegalArgumentException(a10.b.q(cls5, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map3.put(cls5, fVar3);
        Class cls6 = fVarArr3[0].f14473a;
        Collections.unmodifiableMap(map3);
        f[] fVarArr4 = {new f(ad.a.class, 2)};
        HashMap map4 = new HashMap();
        f fVar4 = fVarArr4[0];
        Class cls7 = fVar4.f14473a;
        if (map4.containsKey(cls7)) {
            throw new IllegalArgumentException(a10.b.q(cls7, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map4.put(cls7, fVar4);
        Class cls8 = fVarArr4[0].f14473a;
        Collections.unmodifiableMap(map4);
        f[] fVarArr5 = {new f(ad.a.class, 6)};
        HashMap map5 = new HashMap();
        f fVar5 = fVarArr5[0];
        Class cls9 = fVar5.f14473a;
        if (map5.containsKey(cls9)) {
            throw new IllegalArgumentException(a10.b.q(cls9, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map5.put(cls9, fVar5);
        Class cls10 = fVarArr5[0].f14473a;
        Collections.unmodifiableMap(map5);
        f[] fVarArr6 = {new f(ad.a.class, 7)};
        HashMap map6 = new HashMap();
        f fVar6 = fVarArr6[0];
        Class cls11 = fVar6.f14473a;
        if (map6.containsKey(cls11)) {
            throw new IllegalArgumentException(a10.b.q(cls11, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map6.put(cls11, fVar6);
        Class cls12 = fVarArr6[0].f14473a;
        Collections.unmodifiableMap(map6);
        f[] fVarArr7 = {new f(ad.a.class, 5)};
        HashMap map7 = new HashMap();
        f fVar7 = fVarArr7[0];
        Class cls13 = fVar7.f14473a;
        if (map7.containsKey(cls13)) {
            throw new IllegalArgumentException(a10.b.q(cls13, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map7.put(cls13, fVar7);
        Class cls14 = fVarArr7[0].f14473a;
        Collections.unmodifiableMap(map7);
        f[] fVarArr8 = {new f(ad.a.class, 8)};
        HashMap map8 = new HashMap();
        f fVar8 = fVarArr8[0];
        Class cls15 = fVar8.f14473a;
        if (map8.containsKey(cls15)) {
            throw new IllegalArgumentException(a10.b.q(cls15, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map8.put(cls15, fVar8);
        Class cls16 = fVarArr8[0].f14473a;
        Collections.unmodifiableMap(map8);
        int i = y2.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        ad.r.g(e.f14472b);
        id.o.a();
        Class<md.l> cls = md.l.class;
        h hVar = new h(cls, new f[]{new f(ad.a.class, 0)}, 0);
        int i = 1;
        ad.r.e(hVar, true);
        int i2 = 3;
        ad.r.e(new h(j0.class, new f[]{new f(ad.a.class, 3)}, 2), true);
        hd.n nVar = q.f14496a;
        hd.l lVar = hd.l.f151354b;
        lVar.e(q.f14496a);
        lVar.d(q.f14497b);
        lVar.c(q.f14498c);
        lVar.b(q.d);
        if (ed.d.a()) {
            return;
        }
        ad.r.e(new h(md.a0.class, new f[]{new f(ad.a.class, 2)}, i), true);
        lVar.e(m.f14490a);
        lVar.d(m.f14491b);
        lVar.c(m.f14492c);
        lVar.b(m.d);
        int i3 = 4;
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            ad.r.e(new h(p0.class, new f[]{new f(ad.a.class, 4)}, i2), true);
            lVar.e(u.f14502a);
            lVar.d(u.f14503b);
            lVar.c(u.f14504c);
            lVar.b(u.d);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        ad.r.e(new h(b1.class, new f[]{new f(ad.a.class, 5)}, i3), true);
        hd.n nVar2 = y.f14506a;
        hd.l lVar2 = hd.l.f151354b;
        lVar2.e(y.f14506a);
        lVar2.d(y.f14507b);
        lVar2.c(y.f14508c);
        lVar2.b(y.d);
        Class<o2> cls2 = o2.class;
        ad.r.e(new h(cls2, new f[]{new f(ad.a.class, 6)}, 5), true);
        Class<t2> cls3 = t2.class;
        ad.r.e(new h(cls3, new f[]{new f(ad.a.class, 7)}, 6), true);
        Class<b3> cls4 = b3.class;
        ad.r.e(new h(cls4, new f[]{new f(ad.a.class, 8)}, 7), true);
        lVar2.e(d0.f14468a);
        lVar2.d(d0.f14469b);
        lVar2.c(d0.f14470c);
        lVar2.b(d0.d);
    }
}
