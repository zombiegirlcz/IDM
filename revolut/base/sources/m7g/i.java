package m7g;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes9.dex */
public final class i {
    private i() {
    }

    public static j a(LocalDate dateOfBirth, LocalDate referenceDate) {
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(referenceDate, "referenceDate");
        if (dateOfBirth.isAfter(referenceDate)) {
            return null;
        }
        return referenceDate.isBefore(dateOfBirth.plusYears(2L)) ? j.INFANT : referenceDate.isBefore(dateOfBirth.plusYears(18L)) ? j.CHILD : j.ADULT;
    }

    public static j b(String str) {
        j jVar;
        if (str != null) {
            j[] jVarArrValues = j.values();
            int length = jVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    jVar = null;
                    break;
                }
                jVar = jVarArrValues[i];
                if (a0.z(jVar.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (jVar != null) {
                return jVar;
            }
        }
        return j.UNKNOWN;
    }
}
