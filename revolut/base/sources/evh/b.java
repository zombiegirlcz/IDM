package evh;

import evh.a;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements kg.t {
    @Override // kg.t
    public final Object deserialize(kg.u uVar, Type type, kg.s sVar) {
        kg.u uVarI;
        String strF;
        if (uVar != null && !(uVar instanceof kg.v) && sVar != null && (uVarI = uVar.c().i("type")) != null && (strF = uVarI.f()) != null) {
            if (strF.equals("INITIALS")) {
                return (a) ((a31.a) sVar).d(uVar, a.b.class);
            }
            if (strF.equals("Base64")) {
                return (a) ((a31.a) sVar).d(uVar, a.C0757a.class);
            }
        }
        return null;
    }
}
