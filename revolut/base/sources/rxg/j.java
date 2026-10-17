package rxg;

import d9.e1;
import java.math.BigDecimal;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public interface j {
    default BigDecimal a() {
        return e1.Z(new BigDecimal(String.valueOf(c())));
    }

    LocalDate b();

    float c();

    dj0.d d();
}
