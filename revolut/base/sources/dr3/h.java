package dr3;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes21.dex */
public final class h {
    public static ht3.k a(st3.d dto) {
        ht3.j jVar;
        Intrinsics.checkNotNullParameter(dto, "dto");
        String value = dto.getValue();
        String type = dto.getType();
        ht3.j[] jVarArrValues = ht3.j.values();
        int length = jVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jVar = null;
                break;
            }
            jVar = jVarArrValues[i];
            if (a0.z(jVar.name(), type, true)) {
                break;
            }
            i++;
        }
        if (jVar == null) {
            jVar = ht3.j.DEFAULT;
        }
        return new ht3.k(value, jVar);
    }
}
