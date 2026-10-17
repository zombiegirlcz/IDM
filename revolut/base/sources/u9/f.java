package u9;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import v9.o0;
import v9.z;

/* JADX INFO: loaded from: classes16.dex */
public final class f extends z {
    public static final f e = new f(0);
    public static final f f = new f(1);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(z zVar, Boolean bool, int i) {
        super(zVar, bool);
        this.d = i;
    }

    public static void r(List list, com.fasterxml.jackson.core.h hVar, k9.v vVar, int i) throws IOException {
        for (int i2 = 0; i2 < i; i2++) {
            try {
                String str = (String) list.get(i2);
                if (str == null) {
                    vVar.h(hVar);
                } else {
                    hVar.B(str);
                }
            } catch (Exception e2) {
                o0.o(vVar, e2, list, i2);
                throw null;
            }
        }
    }

    public static void s(Collection collection, com.fasterxml.jackson.core.h hVar, k9.v vVar) throws IOException {
        int i = 0;
        try {
            Iterator it8 = collection.iterator();
            while (it8.hasNext()) {
                String str = (String) it8.next();
                if (str == null) {
                    vVar.h(hVar);
                } else {
                    hVar.B(str);
                }
                i++;
            }
        } catch (Exception e2) {
            o0.o(vVar, e2, collection, i);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r0 == java.lang.Boolean.TRUE) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (r2 == java.lang.Boolean.TRUE) goto L23;
     */
    @Override // k9.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.Object r6, com.fasterxml.jackson.core.h r7, k9.v r8) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.d
            switch(r0) {
                case 0: goto L2e;
                default: goto L5;
            }
        L5:
            java.util.Collection r6 = (java.util.Collection) r6
            int r0 = r6.size()
            r1 = 1
            if (r0 != r1) goto L24
            java.lang.Boolean r0 = r5.f286948c
            if (r0 != 0) goto L1c
            k9.u r1 = k9.u.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            k9.t r2 = r8.f182201a
            boolean r1 = r2.n(r1)
            if (r1 != 0) goto L20
        L1c:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            if (r0 != r1) goto L24
        L20:
            s(r6, r7, r8)
            goto L2d
        L24:
            r7.y(r6)
            s(r6, r7, r8)
            r7.l()
        L2d:
            return
        L2e:
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            r1 = 1
            if (r0 != r1) goto L4d
            java.lang.Boolean r2 = r5.f286948c
            if (r2 != 0) goto L45
            k9.u r3 = k9.u.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            k9.t r4 = r8.f182201a
            boolean r3 = r4.n(r3)
            if (r3 != 0) goto L49
        L45:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            if (r2 != r3) goto L4d
        L49:
            r(r6, r7, r8, r1)
            goto L56
        L4d:
            r7.y(r6)
            r(r6, r7, r8, r0)
            r7.l()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.f.f(java.lang.Object, com.fasterxml.jackson.core.h, k9.v):void");
    }

    @Override // k9.k
    public final void h(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar, r9.c cVar) throws IOException {
        switch (this.d) {
            case 0:
                List list = (List) obj2;
                f9.d dVarE = cVar.e(hVar, cVar.d(list, com.fasterxml.jackson.core.n.START_ARRAY));
                hVar.i(list);
                r(list, hVar, vVar, list.size());
                cVar.f(hVar, dVarE);
                break;
            default:
                Collection collection = (Collection) obj2;
                f9.d dVarE2 = cVar.e(hVar, cVar.d(collection, com.fasterxml.jackson.core.n.START_ARRAY));
                hVar.i(collection);
                s(collection, hVar, vVar);
                cVar.f(hVar, dVarE2);
                break;
        }
    }

    @Override // v9.z
    public final k9.k q(k9.d dVar, Boolean bool) {
        switch (this.d) {
            case 0:
                return new f(this, bool, 0);
            default:
                return new f(this, bool, 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i) {
        super(List.class);
        this.d = i;
        switch (i) {
            case 1:
                super(Collection.class);
                break;
            default:
                break;
        }
    }
}
