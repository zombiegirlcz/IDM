package t87;

import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public static BigDecimal a(k77.g value) {
        Object objA;
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof k77.b) {
            k77.b bVar = (k77.b) value;
            BigDecimal bigDecimal = bVar.f181827c;
            if (bigDecimal != null) {
                return bVar.f181825a.subtract(bigDecimal);
            }
        } else {
            if (value instanceof k77.d) {
                dj0.d dVar = ((k77.d) value).f181830c;
                if (dVar == null) {
                    return null;
                }
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    objA = pyd.c.H(((k77.d) value).f181828a, dVar);
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                if (objA instanceof yhm.n) {
                    objA = null;
                }
                dj0.d dVar2 = (dj0.d) objA;
                if (dVar2 != null) {
                    return pyd.c.Y(dVar2);
                }
                return null;
            }
            if (!(value instanceof k77.f)) {
                throw new NoWhenBranchMatchedException();
            }
            k77.f fVar = (k77.f) value;
            BigDecimal bigDecimal2 = fVar.f181833c;
            if (bigDecimal2 != null) {
                return fVar.f181831a.subtract(bigDecimal2).multiply(new BigDecimal(100));
            }
        }
        return null;
    }
}
