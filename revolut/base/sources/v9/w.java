package v9;

import com.fasterxml.jackson.core.JsonGenerationException;

/* JADX INFO: loaded from: classes16.dex */
public final class w extends v {
    public static final w e = new w(0);
    public static final w f = new w(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final w f286944g = new w(2);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Class cls, int i) {
        super(cls);
        this.d = i;
    }

    @Override // v9.p0, k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) throws JsonGenerationException {
        switch (this.d) {
            case 0:
                hVar.r(((Float) obj2).floatValue());
                break;
            case 1:
                hVar.s(((Number) obj2).intValue());
                break;
            case 2:
                short sShortValue = ((Short) obj2).shortValue();
                g9.c cVar = (g9.c) hVar;
                int i = cVar.f141424q;
                cVar.E("write a number");
                if (!cVar.f123817c) {
                    if (cVar.f141423p + 6 >= i) {
                        cVar.I();
                    }
                    cVar.f141423p = f9.g.d(cVar.f141422n, sShortValue, cVar.f141423p);
                } else {
                    char c2 = cVar.f141421m;
                    if (cVar.f141423p + 8 >= i) {
                        cVar.I();
                    }
                    char[] cArr = cVar.f141422n;
                    int i2 = cVar.f141423p;
                    int i3 = i2 + 1;
                    cVar.f141423p = i3;
                    cArr[i2] = c2;
                    int iD = f9.g.d(cArr, sShortValue, i3);
                    char[] cArr2 = cVar.f141422n;
                    cVar.f141423p = iD + 1;
                    cArr2[iD] = c2;
                }
                break;
            case 3:
                hVar.q(((Double) obj2).doubleValue());
                break;
            case 4:
                hVar.s(((Integer) obj2).intValue());
                break;
            default:
                hVar.t(((Long) obj2).longValue());
                break;
        }
    }

    @Override // v9.p0, k9.k
    public void h(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar, r9.c cVar) throws JsonGenerationException {
        switch (this.d) {
            case 3:
                Double d = (Double) obj2;
                double dDoubleValue = d.doubleValue();
                String str = f9.g.f132802a;
                if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                    f9.d dVarE = cVar.e(hVar, cVar.d(obj2, com.fasterxml.jackson.core.n.VALUE_NUMBER_FLOAT));
                    hVar.q(d.doubleValue());
                    cVar.f(hVar, dVarE);
                } else {
                    hVar.q(d.doubleValue());
                }
                break;
            case 4:
                f(obj2, hVar, vVar);
                break;
            default:
                super.h(obj2, hVar, vVar, cVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(int i) {
        super(Float.class);
        this.d = i;
        switch (i) {
            case 1:
                super(Number.class);
                break;
            case 2:
                super(Short.class);
                break;
            default:
                break;
        }
    }
}
