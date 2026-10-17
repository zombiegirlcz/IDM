package v9;

import java.net.InetAddress;

/* JADX INFO: loaded from: classes16.dex */
public final class e extends p0 implements t9.h {
    public final /* synthetic */ int d;
    public final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z, int i) {
        super(z ? Boolean.TYPE : Boolean.class);
        this.d = i;
        switch (i) {
            case 1:
                super(z ? Boolean.TYPE : Boolean.class);
                this.e = z;
                break;
            case 2:
                super(InetAddress.class);
                this.e = z;
                break;
            default:
                this.e = z;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    @Override // t9.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k9.k a(k9.v r2, k9.d r3) {
        /*
            r1 = this;
            int r0 = r1.d
            switch(r0) {
                case 0: goto L4f;
                case 1: goto L29;
                default: goto L5;
            }
        L5:
            java.lang.Class r0 = r1.f286928a
            d9.p r2 = v9.o0.m(r2, r3, r0)
            if (r2 == 0) goto L1b
            d9.o r2 = r2.f112315b
            boolean r3 = r2.a()
            if (r3 != 0) goto L19
            d9.o r3 = d9.o.ARRAY
            if (r2 != r3) goto L1b
        L19:
            r2 = 1
            goto L1c
        L1b:
            r2 = 0
        L1c:
            boolean r3 = r1.e
            if (r2 == r3) goto L27
            v9.e r3 = new v9.e
            r0 = 2
            r3.<init>(r2, r0)
            goto L28
        L27:
            r3 = r1
        L28:
            return r3
        L29:
            java.lang.Class r0 = r1.f286928a
            d9.p r2 = v9.o0.m(r2, r3, r0)
            if (r2 == 0) goto L4d
            d9.o r2 = r2.f112315b
            boolean r3 = r2.a()
            if (r3 == 0) goto L42
            v9.e r2 = new v9.e
            boolean r3 = r1.e
            r0 = 0
            r2.<init>(r3, r0)
            goto L4e
        L42:
            d9.o r3 = d9.o.STRING
            if (r2 != r3) goto L4d
            v9.s r2 = new v9.s
            r3 = 0
            r2.<init>(r0, r3)
            goto L4e
        L4d:
            r2 = r1
        L4e:
            return r2
        L4f:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            d9.p r2 = v9.o0.m(r2, r3, r0)
            if (r2 == 0) goto L68
            d9.o r2 = r2.f112315b
            boolean r2 = r2.a()
            if (r2 != 0) goto L68
            v9.e r2 = new v9.e
            boolean r3 = r1.e
            r0 = 1
            r2.<init>(r3, r0)
            goto L69
        L68:
            r2 = r1
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.e.a(k9.v, k9.d):k9.k");
    }

    @Override // v9.p0, k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        switch (this.d) {
            case 0:
                hVar.s(!Boolean.FALSE.equals(obj2) ? 1 : 0);
                break;
            case 1:
                hVar.k(Boolean.TRUE.equals(obj2));
                break;
            default:
                r((InetAddress) obj2, hVar);
                break;
        }
    }

    @Override // v9.p0, k9.k
    public final void h(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar, r9.c cVar) {
        switch (this.d) {
            case 0:
                hVar.k(Boolean.TRUE.equals(obj2));
                break;
            case 1:
                hVar.k(Boolean.TRUE.equals(obj2));
                break;
            default:
                InetAddress inetAddress = (InetAddress) obj2;
                f9.d dVarD = cVar.d(inetAddress, com.fasterxml.jackson.core.n.VALUE_STRING);
                dVarD.f132797c = InetAddress.class;
                f9.d dVarE = cVar.e(hVar, dVarD);
                r(inetAddress, hVar);
                cVar.f(hVar, dVarE);
                break;
        }
    }

    public void r(InetAddress inetAddress, com.fasterxml.jackson.core.h hVar) {
        String strTrim;
        if (this.e) {
            strTrim = inetAddress.getHostAddress();
        } else {
            strTrim = inetAddress.toString().trim();
            int iIndexOf = strTrim.indexOf(47);
            if (iIndexOf >= 0) {
                strTrim = iIndexOf == 0 ? strTrim.substring(1) : strTrim.substring(0, iIndexOf);
            }
        }
        hVar.B(strTrim);
    }
}
