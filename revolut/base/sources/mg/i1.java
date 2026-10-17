package mg;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class i1 extends kg.l0 {
    @Override // kg.l0
    public final Object c(qg.a aVar) throws IOException {
        if (aVar.A() == qg.b.NULL) {
            aVar.w();
            return null;
        }
        try {
            int iS = aVar.s();
            if (iS <= 255 && iS >= -128) {
                return Byte.valueOf((byte) iS);
            }
            StringBuilder sbW = a0.d.w(iS, "Lossy conversion from ", " to byte; at path ");
            sbW.append(aVar.m());
            throw new JsonSyntaxException(sbW.toString());
        } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        if (((Number) obj2) == null) {
            cVar.m();
        } else {
            cVar.u(r4.byteValue());
        }
    }
}
