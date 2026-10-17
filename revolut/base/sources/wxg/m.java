package wxg;

import d9.e1;
import java.math.BigDecimal;
import u80.q;

/* JADX INFO: loaded from: classes9.dex */
public interface m {
    default dj0.d A() {
        if (e1.D(u())) {
            return q.a(new BigDecimal(String.valueOf((getValue().f115082a / u().abs().floatValue()) / 100)), getValue().f115083b);
        }
        return null;
    }

    default BigDecimal a() {
        return e1.Z(new BigDecimal(String.valueOf(getAllocation())));
    }

    float getAllocation();

    dj0.d getValue();

    BigDecimal u();
}
