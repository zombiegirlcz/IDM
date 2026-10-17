package l4h;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import kotlin.jvm.internal.Intrinsics;
import l2c.v;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    public final TextDelegate.Model a(InstrumentTicker ticker, Data tradingLegalEntityInformation) {
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        return (TextDelegate.Model) iii.c.f(tradingLegalEntityInformation, new l2d.a(22), new v(11), new aa7.j(ticker));
    }
}
