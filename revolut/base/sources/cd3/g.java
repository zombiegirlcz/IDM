package cd3;

import fd3.h;
import java.util.Date;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f23171a = r0.k(new Pair("ACTIVE", uc3.e.ACTIVE), new Pair("NOTICE_PERIOD", uc3.e.NOTICE_PERIOD), new Pair("DEPRECATED", uc3.e.DEPRECATED), new Pair("TERMINATED", uc3.e.TERMINATED));

    public static final uc3.f a(h hVar) {
        uc3.e eVar;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        String status = hVar.getStatus();
        uc3.e[] eVarArrValues = uc3.e.values();
        int length = eVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                eVar = null;
                break;
            }
            eVar = eVarArrValues[i];
            if (a0.z(eVar.name(), status, true)) {
                break;
            }
            i++;
        }
        if (eVar == null) {
            eVar = uc3.e.UNKNOWN;
        }
        Long deprecationDate = hVar.getDeprecationDate();
        return new uc3.f(eVar, deprecationDate != null ? new Date(deprecationDate.longValue()).toInstant() : null);
    }
}
