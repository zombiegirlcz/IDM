package z18;

import aw0.e;
import aw0.n6;
import aw0.o9;
import aw0.t0;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.insight_details.InsightDetailsBottomSheetContract$InputData;
import com.revolut.retail.common.ui.R$string;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import java.math.BigDecimal;
import java.util.List;
import jb3.l;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.bouncycastle.asn1.eac.CertificateBody;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsightDetailsBottomSheetContract$InputData f318759a;

    public c(InsightDetailsBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f318759a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        Clause textClause;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        InsightDetailsBottomSheetContract$InputData insightDetailsBottomSheetContract$InputData = this.f318759a;
        Clause clause = insightDetailsBottomSheetContract$InputData.f76451b;
        InstrumentTicker instrumentTicker = insightDetailsBottomSheetContract$InputData.f76450a;
        lw0.a aVar = new lw0.a(clause, null, new lw0.b(new InstrumentImage(instrumentTicker.f105112b, 30, null, null), null), null, false, 26);
        PlainTextDelegate.Model model = new PlainTextDelegate.Model("INSIGHT_DETAILS_DESCRIPTION", (Clause) null, insightDetailsBottomSheetContract$InputData.f76452c, (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
        t0 t0Var = new t0((Clause) new TextClause(instrumentTicker.f105113c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, 0, false, 30);
        BigDecimal bigDecimalN = l.N(instrumentTicker);
        if (bigDecimalN != null) {
            textClause = xqi.a.c(bigDecimalN, false, false, false, false, false, CertificateBody.profileType);
        } else {
            m70.a.c(kotlin.jvm.internal.t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        List listK = v.k(model, new CellDetailsDelegate.Model("INSIGHT_DETAILS_DETAILS", t0Var, textClause, null, null, null, null, 0, null, false, false, null, null, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(new e(false, null, null, new n6(new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, 55), listK, aVar);
    }
}
