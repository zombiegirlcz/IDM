package u80;

import ch.qos.logback.core.CoreConstants;
import java.math.BigInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class o {
    public static String a(BigInteger amount, xi0.b currency, e signType, b bVar) {
        Character chValueOf = Character.valueOf(CoreConstants.DASH_CHAR);
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(signType, "signType");
        int i = bVar == null ? -1 : n.f278064a[bVar.ordinal()];
        String strJ = i != 1 ? i != 2 ? null : currency.f306286a : cp5.d.J(currency);
        int i2 = n.f278065b[signType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (amount.signum() >= 0) {
            }
        } else {
            int iSignum = amount.signum();
            if (iSignum != -1) {
                chValueOf = iSignum != 1 ? null : '+';
            }
        }
        Object[] elements = {chValueOf, strJ};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d0.k0(kotlin.collections.d.L(elements), "", null, null, 0, null, 62);
    }

    public static String b(g prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        dj0.d dVar = prefix.f278037a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(dVar.f115082a);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        return a(bigIntegerValueOf, dVar.f115083b, prefix.f278038b, prefix.f278039c);
    }
}
