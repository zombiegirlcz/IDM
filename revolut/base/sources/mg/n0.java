package mg;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class n0 extends kg.l0 {
    @Override // kg.l0
    public final Object c(qg.a aVar) throws IOException {
        if (aVar.A() == qg.b.NULL) {
            aVar.w();
            return null;
        }
        String strY = aVar.y();
        if (strY.length() == 1) {
            return Character.valueOf(strY.charAt(0));
        }
        StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Expecting character, got: ", strY, "; at ");
        sbX.append(aVar.m());
        throw new JsonSyntaxException(sbX.toString());
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        Character ch5 = (Character) obj2;
        cVar.s(ch5 == null ? null : String.valueOf(ch5));
    }
}
