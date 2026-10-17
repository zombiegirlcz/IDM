package f4h;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import ewh.y;
import f0d.k;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import yy0.j;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements c3h.a {
    public final j a(n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        return new j(new InstrumentImage(instrument.f214596b, 30, null, null));
    }

    public final CompositeClause b(n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        TextClause[] elements = {new TextClause(instrument.e, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), new TextClause(instrument.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return v1.c.f(kotlin.collections.d.L(elements), null);
    }

    public final TextClause c(n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        String str = instrument.o;
        if (str != null) {
            return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return null;
    }

    public final Clause d(Data ticker, n instrument) {
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        return (Clause) iii.c.f(ticker, new k(26), new y(27), new b(instrument));
    }

    public final TextClause e(n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        return new TextClause(instrument.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
