package t04;

import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q {
    public static Object a(my3.o field) {
        Intrinsics.checkNotNullParameter(field, "field");
        if (field instanceof my3.j) {
            my3.j jVar = (my3.j) field;
            dj0.d dVar = jVar.e;
            return new m(dVar != null ? dVar.f115082a : 0L, jVar.f210324g.f306286a);
        }
        if (field instanceof my3.n) {
            String str = ((my3.n) field).e;
            if (str != null) {
                return str;
            }
        } else {
            if (!(field instanceof my3.k)) {
                throw new NoWhenBranchMatchedException();
            }
            LocalDate localDate = ((my3.k) field).e;
            String string = localDate != null ? localDate.toString() : null;
            if (string != null) {
                return string;
            }
        }
        return "";
    }
}
