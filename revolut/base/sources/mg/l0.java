package mg;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class l0 extends kg.l0 {
    @Override // kg.l0
    public final Object c(qg.a aVar) {
        if (aVar.A() != qg.b.NULL) {
            return Float.valueOf((float) aVar.r());
        }
        aVar.w();
        return null;
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        Number numberValueOf = (Number) obj2;
        if (numberValueOf == null) {
            cVar.m();
            return;
        }
        if (!(numberValueOf instanceof Float)) {
            numberValueOf = Float.valueOf(numberValueOf.floatValue());
        }
        cVar.r(numberValueOf);
    }
}
