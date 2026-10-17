package v9;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes16.dex */
public abstract class v extends p0 implements t9.h {
    @Override // t9.h
    public final k9.k a(k9.v vVar, k9.d dVar) {
        Class cls = this.f286928a;
        d9.p pVarM = o0.m(vVar, dVar, cls);
        return (pVarM == null || u.f286943a[pVarM.f112315b.ordinal()] != 1) ? this : cls == BigDecimal.class ? s.e : s.f;
    }
}
