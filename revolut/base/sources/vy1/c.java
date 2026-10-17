package vy1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zz1.d;
import zz1.e;
import zz1.f;

/* JADX INFO: loaded from: classes20.dex */
public abstract class c {
    public static final f a(wy1.f fVar) {
        zz1.c cVar;
        e eVar;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String operationId = fVar.getOperationId();
        String state = fVar.getState();
        e[] eVarArrValues = e.values();
        int length = eVarArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            cVar = null;
            if (i2 >= length) {
                eVar = null;
                break;
            }
            eVar = eVarArrValues[i2];
            if (a0.z(eVar.name(), state, true)) {
                break;
            }
            i2++;
        }
        if (eVar == null) {
            throw new IllegalStateException(j6.a.q("Unknown Operation state: ", fVar.getState()));
        }
        String type = fVar.getAlias().getType();
        zz1.c[] cVarArrValues = zz1.c.values();
        int length2 = cVarArrValues.length;
        while (true) {
            if (i >= length2) {
                break;
            }
            zz1.c cVar2 = cVarArrValues[i];
            if (a0.z(cVar2.name(), type, true)) {
                cVar = cVar2;
                break;
            }
            i++;
        }
        if (cVar != null) {
            return new f(operationId, eVar, new d(cVar, fVar.getAlias().getValue()), fVar.getFailureReason());
        }
        throw new IllegalStateException(j6.a.q("Unknown Alias type: ", fVar.getAlias().getType()));
    }
}
