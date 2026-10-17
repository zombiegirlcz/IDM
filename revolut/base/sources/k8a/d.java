package k8a;

import com.revolut.feature.pix.api.model.TrustedAccount;
import g8a.u;
import g8a.v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import l8a.z0;

/* JADX INFO: loaded from: classes5.dex */
public final class d {
    public static TrustedAccount a(z0 dto) {
        v vVar;
        u uVar;
        Intrinsics.checkNotNullParameter(dto, "dto");
        String status = dto.getStatus();
        u[] uVarArrValues = u.values();
        int length = uVarArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            vVar = null;
            if (i2 >= length) {
                uVar = null;
                break;
            }
            uVar = uVarArrValues[i2];
            if (a0.z(uVar.name(), status, true)) {
                break;
            }
            i2++;
        }
        if (uVar == null) {
            uVar = u.UNKNOWN;
        }
        String id10 = dto.getId();
        String type = dto.getType();
        v[] vVarArrValues = v.values();
        int length2 = vVarArrValues.length;
        while (true) {
            if (i >= length2) {
                break;
            }
            v vVar2 = vVarArrValues[i];
            if (a0.z(vVar2.name(), type, true)) {
                vVar = vVar2;
                break;
            }
            i++;
        }
        if (vVar == null) {
            vVar = v.UNKNOWN;
        }
        return new TrustedAccount(uVar, id10, vVar);
    }
}
