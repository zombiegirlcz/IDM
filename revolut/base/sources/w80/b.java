package w80;

import i26.l;
import java.math.BigInteger;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import rd0.c;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f295565a;

    public b(a bigIntegerFormatter) {
        Intrinsics.checkNotNullParameter(bigIntegerFormatter, "bigIntegerFormatter");
        this.f295565a = bigIntegerFormatter;
    }

    public final long a(String amount, Integer num, String currency) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        xi0.b.Companion.getClass();
        xi0.b bVarA = xi0.a.a(currency);
        if (num != null) {
            bVarA = xi0.b.a(bVarA, num);
        }
        BigInteger bigIntegerA = this.f295565a.a(amount, bVarA);
        Long lValueOf = null;
        if (bigIntegerA != null) {
            try {
                lValueOf = Long.valueOf(l.q(bigIntegerA));
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(c.ERROR, null, null, e, h0Var);
            }
        }
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return 0L;
    }

    public final long b(String amount, String currency) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return a(amount, null, currency);
    }

    public final String c(long j2, Integer num, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j2);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        xi0.b.Companion.getClass();
        xi0.b bVarA = xi0.a.a(currency);
        if (num != null) {
            bVarA = xi0.b.a(bVarA, num);
        }
        return this.f295565a.b(bigIntegerValueOf, bVarA);
    }

    public final String d(long j2, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return c(j2, null, currency);
    }

    public final String e(dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        return d(money.f115082a, money.f115083b.f306286a);
    }
}
