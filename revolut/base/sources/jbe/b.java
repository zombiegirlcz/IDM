package jbe;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import efm.r;
import hce.c;
import ip0.z;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import mx0.d;
import org.joda.time.LocalDate;
import qua.p;
import qua.u;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends abe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.b f172629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f172630b;

    public b(a9e.b commonSubscriptionMapper, e dateProvider, mae.a cobrandSubscriptionIconMapper) {
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(cobrandSubscriptionIconMapper, "cobrandSubscriptionIconMapper");
        this.f172629a = commonSubscriptionMapper;
        this.f172630b = dateProvider;
    }

    @Override // abe.a
    public final z a(Object obj2) {
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        List listC = u.h(model.f172628a, ((f) this.f172630b).k()) ? zhm.u.c(new ActionsView.Item("ID_COBRAND", d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.recurring_payment_details_action_manage_plan, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_settings, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668)) : null;
        if (listC != null) {
            return ((i9e.f) this.f172629a).c(listC);
        }
        return null;
    }

    @Override // abe.a
    public final List b(Object obj2) {
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        p pVar = model.f172628a;
        boolean zH = u.h(pVar, ((f) this.f172630b).k());
        aim.e eVarB = zhm.u.b();
        ibd.e eVar = pVar.f249314a;
        LocalDate localDate = eVar.e;
        LocalDate localDate2 = eVar.f;
        i9e.f fVar = (i9e.f) this.f172629a;
        CellDetailsDelegate.Model modelF = fVar.F(localDate);
        CellDetailsDelegate.Model model2 = null;
        if (eVar.e == null) {
            modelF = null;
        }
        CellDetailsDelegate.Model modelV = fVar.v(localDate2, pVar);
        if (zH && localDate2 != null) {
            model2 = modelV;
        }
        CellDetailsDelegate.Model[] elements = {modelF, model2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        eVarB.addAll(listL);
        CellDetailsChevronDelegate.Model modelS = fVar.s();
        yp0.b.l(modelS, 0, 0, 0, 0, null, false, 63);
        eVarB.add(modelS);
        return zhm.u.a(eVarB);
    }

    @Override // abe.a
    public final r c(c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        return w.h(new a(subscriptionContent.f150886a.f150883a));
    }

    @Override // abe.a
    public final r d(c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        p pVarC = zae.c.c(subscriptionContent);
        boolean zH = u.h(pVarC, ((f) this.f172630b).k());
        MoneyClause moneyClauseU = ((i9e.f) this.f172629a).u(zae.c.b(subscriptionContent), zH);
        String str = pVarC.k;
        if (str == null) {
            str = "";
        }
        return w.h(new hce.a(moneyClauseU, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.recurring_payment_details_header_subscription_subtitle, null, null, 14), mae.a.a(pVarC.z), (Image) null, (Serializable) null, 112));
    }
}
