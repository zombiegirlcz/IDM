package mbe;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import efm.r;
import hce.c;
import i9e.f;
import ip0.z;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import ofm.q;
import qua.p;
import qv0.i;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends abe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.b f204204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f204205b;

    public b(a9e.b commonSubscriptionMapper, e dateProvider) {
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f204204a = commonSubscriptionMapper;
        this.f204205b = dateProvider;
    }

    @Override // abe.a
    public final z a(Object obj2) {
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        return ((f) this.f204204a).c(u.c(new ActionsView.Item("ID_MANAGE_MOBILE_PLAN_ACTION", null, false, null, null, new TextLocalisedClause(R$string.recurring_payment_details_action_manage_mobile_plan, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_gear, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670)));
    }

    @Override // abe.a
    public final List b(Object obj2) {
        Data data;
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        aim.e eVarB = u.b();
        p pVar = model.f204201a;
        Data data2 = model.f204202b;
        f fVar = (f) this.f204204a;
        i iVarR = fVar.r(pVar, false);
        p pVar2 = model.f204201a;
        ibd.e eVar = pVar2.f249314a;
        i[] elements = {iVarR, (eVar.e == null || q.H(pVar2)) ? null : fVar.F(eVar.e), q.z(pVar2, ((l80.f) this.f204205b).g()) ? fVar.v(eVar.f, pVar2) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        eVarB.addAll(listL);
        CellDetailsActionDelegate.Model modelN = fVar.n(pVar2);
        yp0.b.l(modelN, 0, 0, 0, 0, null, false, 63);
        eVarB.add(modelN);
        try {
            Object content = data2.getContent();
            data = new Data(content != null ? ((hce.d) content).f150888a : null, data2.getError(), data2.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, data2.getLoading());
        }
        k71.q qVar = model.f204203c;
        hce.d dVar = (hce.d) data2.getContent();
        List listD = fVar.d(data, qVar, dVar != null ? dVar.f150889b : null);
        if (listD != null) {
            eVarB.addAll(listD);
        }
        CellDetailsChevronDelegate.Model modelS = fVar.s();
        yp0.b.l(modelS, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
        eVarB.add(modelS);
        return u.a(eVarB);
    }

    @Override // abe.a
    public final r c(c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        p pVarA = p.a(subscriptionContent.f150886a.f150883a, null, ibd.f.INACTIVE, null, null, null, null, null, null, null, 0, null, -3, 33554431);
        hce.b bVar = subscriptionContent.f150886a;
        return w.h(new a(pVarA, bVar.f150884b, bVar.f150885c));
    }

    @Override // abe.a
    public final r d(c subscriptionContent) {
        String strA;
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        p pVarC = zae.c.c(subscriptionContent);
        p pVar = subscriptionContent.f150886a.f150883a;
        vua.a aVar = pVarC.f249330s;
        Serializable serializable = (aVar != null ? aVar.f : null) != null ? "ID_CONTACT_DETAILS" : null;
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        boolean zI = qua.u.i(pVar, ((l80.f) this.f204205b).g());
        dj0.d dVarB = zae.c.b(subscriptionContent);
        f fVar = (f) this.f204204a;
        MoneyClause moneyClauseU = fVar.u(dVarB, zI);
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        vua.a aVar2 = pVar.f249330s;
        if (aVar2 == null || (strA = aVar2.a()) == null) {
            strA = "";
        }
        TextClause textClause = new TextClause(strA, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.recurring_payment_details_subscription_toggle_title, null, null, 14);
        LayeredImage layeredImageG = fVar.g(!zI);
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        return w.h(new hce.a(moneyClauseU, textClause, textLocalisedClause, new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, pVar.k, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063), layeredImageG, serializable, 32));
    }
}
