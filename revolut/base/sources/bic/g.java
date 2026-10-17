package bic;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.rewards.api.model.concierge.AdditionalInfoBottomSheet;
import eic.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements Function1 {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static koi.j a(dgc.d description) {
        Intrinsics.checkNotNullParameter(description, "description");
        aim.e eVarB = u.b();
        ArrayList arrayList = description.f114621a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            dgc.c cVar = (dgc.c) obj2;
            AdditionalInfoBottomSheet additionalInfoBottomSheet = cVar.f114620b;
            arrayList2.add(new TextClause(cVar.f114619a, (Style) (additionalInfoBottomSheet != null ? new Click(28, (Integer) null, (Object) new p(additionalInfoBottomSheet), a0.d.n("ID_DESCRIPTION_", i), false) : null), (Integer) null, false, (o9) null, (List) null, 124));
            i = i2;
        }
        eVarB.add(new CompositeClause(arrayList2, sx4.g.e(1), null, null, 12));
        eVarB.add(sx4.g.d(2));
        eVarB.add(new TextClause(description.f114622b, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124));
        Unit unit = Unit.f186387a;
        PlainTextDelegate.Model model = new PlainTextDelegate.Model("ID_DESCRIPTION", (Clause) null, (Clause) new CompositeClause(u.a(eVarB), null, null, null, 14), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        return a((dgc.d) obj2);
    }
}
