package g7;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class r extends k {
    public r(List list) {
        super(list);
    }

    @Override // g7.e
    public final Object g(s7.a aVar, float f) {
        Object obj2;
        Object obj3 = aVar.f260482b;
        s7.c cVar = this.e;
        if (cVar == null) {
            return (f != 1.0f || (obj2 = aVar.f260483c) == null) ? (k7.c) obj3 : (k7.c) obj2;
        }
        float f4 = aVar.f260484g;
        Float f5 = aVar.f260485h;
        float fFloatValue = f5 == null ? Float.MAX_VALUE : f5.floatValue();
        k7.c cVar2 = (k7.c) obj3;
        Object obj4 = aVar.f260483c;
        return (k7.c) cVar.b(f4, fFloatValue, cVar2, obj4 == null ? cVar2 : (k7.c) obj4, f, d(), this.d);
    }
}
