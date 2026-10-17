package ft6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zhm.a0;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class s {
    public static as6.b b(ArrayList arrayList, as6.a aVar) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((as6.b) obj2).f8797a == aVar) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            a0.x(zhm.w.u(((as6.b) it8.next()).f8798b), arrayList3);
        }
        List listP0 = d0.P0(arrayList3, new r());
        if (listP0.isEmpty()) {
            return null;
        }
        return new as6.b(aVar, zhm.u.c(listP0));
    }

    public static as6.c c(zr6.d dVar) {
        double d = dVar.f324609a;
        dj0.d dVar2 = dVar.f324610b;
        return new as6.c(d, dVar2 != null ? new dj0.d(dVar2.f115082a, dVar2.f115083b) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ec A[PHI: r17
      0x01ec: PHI (r17v3 char) = (r17v1 char), (r17v4 char), (r17v4 char) binds: [B:126:0x01ea, B:162:0x01ec, B:82:0x016e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x024f A[PHI: r17
      0x024f: PHI (r17v2 char) = (r17v1 char), (r17v1 char), (r17v4 char) binds: [B:165:0x024f, B:126:0x01ea, B:163:0x024f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0252 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final as6.b a(zr6.f r17, wi0.b r18) {
        /*
            Method dump skipped, instruction units count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ft6.s.a(zr6.f, wi0.b):as6.b");
    }
}
