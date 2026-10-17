package e1k;

import aw0.o9;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class b {
    private b() {
    }

    public static CurrencyClause a(vel.a aVar) {
        return new CurrencyClause(aVar.f288344a, CurrencyClause.Format.Ticker.f57756a, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254));
    }

    public static TextClause b(InstrumentTicker instrumentTicker) {
        return new TextClause(instrumentTicker.f105113c, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
    }
}
