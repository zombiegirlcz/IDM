package mg;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class y0 extends kg.l0 {
    @Override // kg.l0
    public final Object c(qg.a aVar) throws IOException {
        if (aVar.A() == qg.b.NULL) {
            aVar.w();
            return null;
        }
        String strY = aVar.y();
        try {
            return UUID.fromString(strY);
        } catch (IllegalArgumentException e) {
            StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Failed parsing '", strY, "' as UUID; at path ");
            sbX.append(aVar.m());
            throw new JsonSyntaxException(sbX.toString(), e);
        }
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        UUID uuid = (UUID) obj2;
        cVar.s(uuid == null ? null : uuid.toString());
    }
}
