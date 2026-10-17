package kg;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class k extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183859a;

    public /* synthetic */ k(int i) {
        this.f183859a = i;
    }

    @Override // kg.l0
    public final Object c(qg.a aVar) {
        switch (this.f183859a) {
            case 0:
                if (aVar.A() != qg.b.NULL) {
                    return Double.valueOf(aVar.r());
                }
                aVar.w();
                return null;
            case 1:
                if (aVar.A() != qg.b.NULL) {
                    return Float.valueOf((float) aVar.r());
                }
                aVar.w();
                return null;
            default:
                aVar.H();
                return null;
        }
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        switch (this.f183859a) {
            case 0:
                Number number = (Number) obj2;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    o.a(dDoubleValue);
                    cVar.t(dDoubleValue);
                } else {
                    cVar.m();
                }
                break;
            case 1:
                Number numberValueOf = (Number) obj2;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    o.a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    cVar.r(numberValueOf);
                } else {
                    cVar.m();
                }
                break;
            default:
                cVar.m();
                break;
        }
    }

    public String toString() {
        switch (this.f183859a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
