package sv4;

import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes22.dex */
public interface i {
    default LocalDate a() {
        if (this instanceof h) {
            return oc.c.I(pu7.a.I(((h) this).f265840a.f68882a));
        }
        if (this instanceof g) {
            return oc.c.I(((g) this).f265838a.f272593h.getMillis());
        }
        throw new NoWhenBranchMatchedException();
    }

    default dj0.d f() {
        if (this instanceof h) {
            return ((h) this).f265840a.f68883b;
        }
        if (this instanceof g) {
            return k71.k.b(((g) this).f265838a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
