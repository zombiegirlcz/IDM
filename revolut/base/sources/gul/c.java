package gul;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    static {
        new BigDecimal("2.0");
    }

    public static Amount a(Amount amount, float f) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        BigDecimal scale = amount.f104717a.multiply(new BigDecimal(String.valueOf(f))).setScale(amount.f104717a.scale(), RoundingMode.CEILING);
        Intrinsics.h(scale);
        return Amount.a(amount, scale);
    }
}
