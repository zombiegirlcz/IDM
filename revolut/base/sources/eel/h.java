package eel;

import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes12.dex */
public interface h {
    default float a() {
        if (this instanceof f) {
            return ((f) this).f125230a.f126703a.floatValue();
        }
        if (this instanceof g) {
            return ((g) this).f125231a.floatValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    default BigDecimal b() {
        if (this instanceof f) {
            return ((f) this).f125230a.f126703a;
        }
        if (this instanceof g) {
            return ((g) this).f125231a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
