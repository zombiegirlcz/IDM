package nr3;

import it3.g;
import it3.h;
import it3.i;

/* JADX INFO: loaded from: classes21.dex */
public final class b {
    private b() {
    }

    public static i a(Integer num) {
        h hVar = ((num != null && num.intValue() == 32037) || (num != null && num.intValue() == 32038) || (num != null && num.intValue() == 198014)) ? h.NOT_ELIGIBLE : (num != null && num.intValue() == 32041) ? h.FACILITY_ALREADY_ACTIVE : (num != null && num.intValue() == 32049) ? h.MAINTENANCE : (num != null && num.intValue() == 32050) ? h.UPDATE_REQUIRED : (num != null && num.intValue() == 32051) ? h.MULTIPLE_APPLICATIONS : (num != null && num.intValue() == 32052) ? h.WAITING_LIST : (num != null && num.intValue() == 32071) ? h.ELIGIBLE_WITH_CREDIT_HEALTH : null;
        if (hVar == null) {
            return null;
        }
        i.Companion.getClass();
        return g.a(hVar);
    }
}
