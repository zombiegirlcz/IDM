package e1k;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import cp5.d;
import java.math.BigDecimal;
import java.util.List;
import jb3.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import rzj.h;
import rzj.i;
import rzj.j;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class c {
    private c() {
    }

    public static CompositeClause a(j item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (!(item instanceof h)) {
            if (!(item instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            vel.a aVar = ((i) item).f258696a;
            return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new CurrencyClause(aVar.f288344a, CurrencyClause.Format.Ticker.f57756a, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254)), d.z(aVar.f288344a) ? xqi.a.b(aVar.f288346c, false, 7) : xqi.a.c(aVar.f288346c, false, false, false, false, false, CertificateBody.profileType)));
        }
        InstrumentTicker instrumentTicker = ((h) item).f258695a;
        TextClause textClause = new TextClause(instrumentTicker.f105113c, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
        BigDecimal bigDecimalN = l.N(instrumentTicker);
        Object[] elements = {textClause, bigDecimalN != null ? xqi.a.c(bigDecimalN, false, false, false, false, false, CertificateBody.profileType) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements));
    }
}
