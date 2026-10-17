package q18;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import java.math.BigDecimal;
import java.util.List;
import jb3.l;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f241402a;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f241402a = featureToggleInteractor;
    }

    public static Clause a(x08.d dVar) {
        InstrumentTicker instrumentTicker = dVar.f301531c;
        if (instrumentTicker == null) {
            return new TextClause(dVar.f301530b, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
        }
        Intrinsics.checkNotNullParameter(instrumentTicker, "<this>");
        TextClause textClause = new TextClause(instrumentTicker.f105113c, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
        BigDecimal bigDecimalN = l.N(instrumentTicker);
        Object[] elements = {textClause, bigDecimalN != null ? xqi.a.c(bigDecimalN, false, false, false, false, false, CertificateBody.profileType) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements));
    }
}
