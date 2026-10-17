package v9;

import com.fasterxml.jackson.core.JsonGenerationException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes16.dex */
public final class t extends p0 implements t9.h {
    public static final t d = new t(Number.class);

    @Override // t9.h
    public final k9.k a(k9.v vVar, k9.d dVar) {
        Class cls = this.f286928a;
        d9.p pVarM = o0.m(vVar, dVar, cls);
        return (pVarM == null || r.f286942a[pVarM.f112315b.ordinal()] != 1) ? this : cls == BigDecimal.class ? s.e : s.f;
    }

    @Override // v9.p0, k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) throws JsonGenerationException {
        Number number = (Number) obj2;
        if (number instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) number;
            g9.c cVar = (g9.c) hVar;
            cVar.E("write a number");
            if (cVar.f123817c) {
                cVar.Q(cVar.D(bigDecimal));
                return;
            } else {
                cVar.v(cVar.D(bigDecimal));
                return;
            }
        }
        if (number instanceof BigInteger) {
            BigInteger bigInteger = (BigInteger) number;
            g9.c cVar2 = (g9.c) hVar;
            cVar2.E("write a number");
            if (cVar2.f123817c) {
                cVar2.Q(bigInteger.toString());
                return;
            } else {
                cVar2.v(bigInteger.toString());
                return;
            }
        }
        if (number instanceof Long) {
            hVar.t(number.longValue());
            return;
        }
        if (number instanceof Double) {
            hVar.q(number.doubleValue());
            return;
        }
        if (number instanceof Float) {
            hVar.r(number.floatValue());
            return;
        }
        if ((number instanceof Integer) || (number instanceof Byte) || (number instanceof Short)) {
            hVar.s(number.intValue());
            return;
        }
        String string = number.toString();
        g9.c cVar3 = (g9.c) hVar;
        cVar3.E("write a number");
        if (string == null) {
            cVar3.P();
        } else if (cVar3.f123817c) {
            cVar3.Q(string);
        } else {
            cVar3.v(string);
        }
    }
}
