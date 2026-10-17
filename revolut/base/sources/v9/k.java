package v9;

import com.fasterxml.jackson.core.JsonGenerationException;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public final class k extends p0 implements t9.h {
    public final k9.c d;
    public final Boolean e;

    public k(k9.c cVar, Boolean bool) {
        super((Class) cVar.f182179a);
        this.d = cVar;
        this.e = bool;
    }

    public static Boolean r(Class cls, d9.p pVar, boolean z, Boolean bool) {
        d9.o oVar = pVar.f112315b;
        if (oVar == null || oVar == d9.o.ANY || oVar == d9.o.SCALAR) {
            return bool;
        }
        if (oVar == d9.o.STRING || oVar == d9.o.NATURAL) {
            return Boolean.FALSE;
        }
        if (oVar.a() || oVar == d9.o.ARRAY) {
            return Boolean.TRUE;
        }
        String name = cls.getName();
        String str = z ? "class" : "property";
        StringBuilder sb6 = new StringBuilder("Unsupported serialization shape (");
        sb6.append(oVar);
        sb6.append(") for Enum ");
        sb6.append(name);
        sb6.append(", not supported as ");
        throw new IllegalArgumentException(v0.a.i(sb6, str, " annotation"));
    }

    @Override // t9.h
    public final k9.k a(k9.v vVar, k9.d dVar) {
        Class cls = this.f286928a;
        d9.p pVarM = o0.m(vVar, dVar, cls);
        if (pVarM != null) {
            Boolean bool = this.e;
            Boolean boolR = r(cls, pVarM, false, bool);
            if (!Objects.equals(boolR, bool)) {
                return new k(this.d, boolR);
            }
        }
        return this;
    }

    @Override // v9.p0, k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) throws JsonGenerationException {
        boolean zN;
        Enum r92 = (Enum) obj2;
        Boolean bool = this.e;
        if (bool != null) {
            zN = bool.booleanValue();
        } else {
            zN = vVar.f182201a.n(k9.u.WRITE_ENUMS_USING_INDEX);
        }
        if (zN) {
            hVar.s(r92.ordinal());
            return;
        }
        if (vVar.f182201a.n(k9.u.WRITE_ENUMS_USING_TO_STRING)) {
            hVar.B(r92.toString());
            return;
        }
        com.fasterxml.jackson.core.q qVar = ((com.fasterxml.jackson.core.q[]) this.d.f182180b)[r92.ordinal()];
        g9.c cVar = (g9.c) hVar;
        char c2 = cVar.f141421m;
        cVar.E("write a string");
        int i = cVar.f141423p;
        int i2 = cVar.f141424q;
        if (i >= i2) {
            cVar.I();
        }
        char[] cArr = cVar.f141422n;
        int i3 = cVar.f141423p;
        int i5 = i3 + 1;
        cVar.f141423p = i5;
        cArr[i3] = c2;
        f9.i iVar = (f9.i) qVar;
        char[] cArrA = iVar.f132808b;
        if (cArrA == null) {
            f9.e eVar = f9.i.f132806c;
            String str = iVar.f132807a;
            eVar.getClass();
            cArrA = f9.e.a(str);
            iVar.f132808b = cArrA;
        }
        int length = cArrA.length;
        if (i5 + length > cArr.length) {
            length = -1;
        } else {
            System.arraycopy(cArrA, 0, cArr, i5, length);
        }
        if (length >= 0) {
            int i6 = cVar.f141423p + length;
            cVar.f141423p = i6;
            if (i6 >= i2) {
                cVar.I();
            }
            char[] cArr2 = cVar.f141422n;
            int i21 = cVar.f141423p;
            cVar.f141423p = i21 + 1;
            cArr2[i21] = c2;
            return;
        }
        char[] cArrA2 = iVar.a();
        int length2 = cArrA2.length;
        if (length2 < 32) {
            if (length2 > i2 - cVar.f141423p) {
                cVar.I();
            }
            System.arraycopy(cArrA2, 0, cVar.f141422n, cVar.f141423p, length2);
            cVar.f141423p += length2;
        } else {
            cVar.I();
            cVar.f141420l.write(cArrA2, 0, length2);
        }
        if (cVar.f141423p >= i2) {
            cVar.I();
        }
        char[] cArr3 = cVar.f141422n;
        int i22 = cVar.f141423p;
        cVar.f141423p = i22 + 1;
        cArr3[i22] = c2;
    }
}
