package lxk;

import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.trading_hours.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements g {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ImageClause a(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        Float fValueOf = Float.valueOf(16.0f);
        return new ImageClause(i, numValueOf, fValueOf, fValueOf, 16);
    }

    public final TextLocalisedClause b(o4l.a tradingSessionSchedule) {
        Intrinsics.checkNotNullParameter(tradingSessionSchedule, "tradingSessionSchedule");
        int i = f.f200592a[tradingSessionSchedule.f222295a.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.wealthcore_trading_market_hours_pre_market_title, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.wealthcore_trading_market_hours_open_title, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.wealthcore_trading_market_hours_after_hours_title, null, null, 14);
        }
        if (i == 4 || i == 5) {
            return new TextLocalisedClause(R$string.wealthcore_trading_market_hours_closed_title, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
