package mg;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class q0 extends kg.l0 {
    @Override // kg.l0
    public final Object c(qg.a aVar) throws IOException {
        if (aVar.A() == qg.b.NULL) {
            aVar.w();
            return null;
        }
        String strY = aVar.y();
        try {
            return com.google.gson.internal.j.o(strY);
        } catch (NumberFormatException e) {
            StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Failed parsing '", strY, "' as BigInteger; at path ");
            sbX.append(aVar.m());
            throw new JsonSyntaxException(sbX.toString(), e);
        }
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        cVar.r((BigInteger) obj2);
    }
}
