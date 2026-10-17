package mg;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Currency;

/* JADX INFO: loaded from: classes.dex */
public class z0 extends kg.l0 {
    @Override // kg.l0
    public final Object c(qg.a aVar) throws IOException {
        String strY = aVar.y();
        try {
            return Currency.getInstance(strY);
        } catch (IllegalArgumentException e) {
            StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Failed parsing '", strY, "' as Currency; at path ");
            sbX.append(aVar.m());
            throw new JsonSyntaxException(sbX.toString(), e);
        }
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        cVar.s(((Currency) obj2).getCurrencyCode());
    }
}
