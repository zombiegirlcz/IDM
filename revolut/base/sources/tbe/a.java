package tbe;

import a9e.b;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import efm.r;
import fva.j;
import ip0.z;
import java.util.ArrayList;
import java.util.List;
import k71.q;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import mae.c;
import mx0.d;
import org.joda.time.LocalDate;
import qua.p;
import qua.u;
import qv0.i;
import t73.z2;
import te0.w;
import wik.t;
import zhm.a0;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends abe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f269520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f269521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final egk.e f269522c;

    public a(b commonSubscriptionMapper, e dateProvider, egk.e pricingPlanUiInteractor, c pricingPlanSubscriptionIconMapper) {
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(pricingPlanUiInteractor, "pricingPlanUiInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanSubscriptionIconMapper, "pricingPlanSubscriptionIconMapper");
        this.f269520a = commonSubscriptionMapper;
        this.f269521b = dateProvider;
        this.f269522c = pricingPlanUiInteractor;
    }

    @Override // abe.a
    public final z a(Object obj2) {
        cbe.a model = (cbe.a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        List listC = u.h(model.f22781a, ((f) this.f269521b).k()) ? zhm.u.c(new ActionsView.Item("ID_MANAGE_PLAN", d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.recurring_payment_details_action_manage_plan, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_settings, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668)) : null;
        if (listC != null) {
            return ((i9e.f) this.f269520a).c(listC);
        }
        return null;
    }

    @Override // abe.a
    public final List b(Object obj2) {
        List listL;
        Data data;
        boolean z;
        CellDetailsDelegate.Model model;
        cbe.a model2 = (cbe.a) obj2;
        Intrinsics.checkNotNullParameter(model2, "model");
        ArrayList arrayList = new ArrayList();
        p pVar = model2.f22781a;
        Data data2 = model2.f22782b;
        boolean zH = u.h(pVar, ((f) this.f269521b).k());
        p pVar2 = model2.f22781a;
        j jVar = pVar2.O;
        LocalDate localDate = pVar2.e;
        ibd.e eVar = pVar2.f249314a;
        b bVar = this.f269520a;
        if (jVar == null || !jVar.f138401a) {
            i9e.f fVar = (i9e.f) bVar;
            i iVarR = fVar.r(pVar2, false);
            LocalDate localDate2 = eVar.e;
            LocalDate localDate3 = eVar.f;
            CellDetailsDelegate.Model modelF = fVar.F(localDate2);
            if (eVar.e == null) {
                modelF = null;
            }
            CellDetailsDelegate.Model modelV = fVar.v(localDate3, pVar2);
            if (!zH || localDate3 == null) {
                modelV = null;
            }
            i[] elements = {iVarR, modelF, modelV, localDate != null ? fVar.p(localDate) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            listL = kotlin.collections.d.L(elements);
        } else {
            i9e.f fVar2 = (i9e.f) bVar;
            i iVarR2 = fVar2.r(pVar2, false);
            LocalDate localDate4 = eVar.e;
            fVar2.getClass();
            Intrinsics.checkNotNullParameter("ID_TRIAL_PERIOD_START", "listId");
            if (localDate4 != null) {
                z = zH;
                model = new CellDetailsDelegate.Model("ID_TRIAL_PERIOD_START", new TextLocalisedClause(R$string.recurring_payment_details_trial_period_started, null, null, 14), i9e.f.q(localDate4), 0, null, null, null, null, null, false, 0, 0, 32760);
            } else {
                z = zH;
                model = null;
            }
            LocalDate localDate5 = eVar.f;
            Intrinsics.checkNotNullParameter("ID_TRIAL_FIRST_PAYMENT", "listId");
            CellDetailsDelegate.Model model3 = localDate5 != null ? new CellDetailsDelegate.Model("ID_TRIAL_FIRST_PAYMENT", new TextLocalisedClause(R$string.recurring_payment_details_trial_first_payment, null, null, 14), i9e.f.q(localDate5), 0, null, null, null, null, null, false, 0, 0, 32760) : null;
            if (!z) {
                model3 = null;
            }
            i[] elements2 = {iVarR2, model, model3, localDate != null ? fVar2.p(localDate) : null};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            listL = kotlin.collections.d.L(elements2);
        }
        List list = listL;
        yp0.b.k(list, 0, 0, 0, 0, 31);
        a0.x(list, arrayList);
        try {
            Object content = data2.getContent();
            data = new Data(content != null ? ((hce.d) content).f150888a : null, data2.getError(), data2.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, data2.getLoading());
        }
        q qVar = model2.f22783c;
        hce.d dVar = (hce.d) data2.getContent();
        i9e.f fVar3 = (i9e.f) bVar;
        List listD = fVar3.d(data, qVar, dVar != null ? dVar.f150889b : null);
        if (listD != null) {
            a0.x(listD, arrayList);
        }
        CellDetailsChevronDelegate.Model modelS = fVar3.s();
        yp0.b.l(modelS, 0, 0, 0, 0, null, false, 63);
        arrayList.add(modelS);
        return d0.Z(arrayList);
    }

    @Override // abe.a
    public final r c(hce.c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        hce.b bVar = subscriptionContent.f150886a;
        return w.h(new cbe.a(bVar.f150883a, bVar.f150884b, bVar.f150885c));
    }

    @Override // abe.a
    public final r d(hce.c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        return ue0.e.E(m70.a.g(zi0.c.J(((t) this.f269522c).d()), null, null, 3), Boolean.FALSE).map(new z2(new pud.b(this, subscriptionContent, u.h(zae.c.c(subscriptionContent), ((f) this.f269521b).k()), 16), 28));
    }
}
