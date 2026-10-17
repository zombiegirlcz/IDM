package hbe;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ConfigurableResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import efm.r;
import ip0.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k71.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import l80.e;
import l80.f;
import mx0.d;
import org.jetbrains.annotations.NotNull;
import qua.p;
import qua.u;
import qv0.i;
import te0.w;
import zhm.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends abe.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.b f150652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f150653b;

    public c(a9e.b commonSubscriptionMapper, e dateProvider) {
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f150652a = commonSubscriptionMapper;
        this.f150653b = dateProvider;
    }

    @Override // abe.a
    public final z a(Object obj2) {
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        boolean zI = u.i(model.f150649a, ((f) this.f150653b).g());
        i9e.f fVar = (i9e.f) this.f150652a;
        ActionsView.Item itemM = fVar.m();
        f01.a aVar = fVar.d;
        if (!zI) {
            itemM = null;
        }
        d dVar = d.SEMIACCENT;
        ActionsView.Item item = new ActionsView.Item("ID_DEACTIVATE_ACTION", dVar, aVar.b(new TextLocalisedClause(R$string.recurring_payment_details_action_deactivate, null, null, 14)).toString(), new ResourceImage(R$drawable.uikit_icn_24_decline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        if (!zI) {
            item = null;
        }
        ActionsView.Item[] elements = {itemM, item, zI ? null : new ActionsView.Item("ID_ACTIVATE_ACTION", dVar, aVar.b(new TextLocalisedClause(R$string.recurring_payment_details_action_activate, null, null, 14)).toString(), new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), fVar.k()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return fVar.c(kotlin.collections.d.L(elements));
    }

    @Override // abe.a
    public final List b(Object obj2) {
        Data data;
        Map map;
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        ArrayList arrayList = new ArrayList();
        p pVar = model.f150649a;
        Data data2 = model.f150650b;
        boolean zI = u.i(pVar, ((f) this.f150653b).g());
        q qVar = model.f150651c;
        o61.a aVar = (qVar == null || (map = qVar.e) == null) ? null : (o61.a) map.get(pVar.f249318c);
        String str = aVar != null ? aVar.f222488b : null;
        if (str == null) {
            str = "";
        }
        i9e.f fVar = (i9e.f) this.f150652a;
        fVar.getClass();
        sa saVar = !zI ? new sa("ID_DEACTIVATED_WARNING", new TextLocalisedClause(R$string.recurring_payment_details_deactivated_title, null, null, 14), new TextLocalisedClause(R$string.recurring_payment_details_deactivated_subtitle, zhm.u.c(str), null, 12), null, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), 8080) : null;
        if (saVar != null) {
            yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
            arrayList.add(saVar);
        }
        String str2 = pVar.f249325m;
        ibd.e eVar = pVar.f249314a;
        CellDetailsNoteDelegate.Model modelW = fVar.w(str2);
        if (modelW != null) {
            CellDetailsNoteDelegate.Model model2 = zI ? modelW : null;
            if (model2 != null) {
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                arrayList.add(model2);
            }
        }
        i iVarR = fVar.r(pVar, false);
        CellDetailsDelegate.Model modelF = fVar.F(eVar.e);
        if (eVar.e == null || ofm.q.H(pVar)) {
            modelF = null;
        }
        CellDetailsDelegate.Model modelV = fVar.v(eVar.f, pVar);
        if (!ofm.q.y(pVar) || !zI) {
            modelV = null;
        }
        i[] elements = {iVarR, modelF, modelV};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        a0.x(listL, arrayList);
        CellDetailsDelegate.Model modelA = fVar.A(pVar);
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        arrayList.add(modelA);
        try {
            Object content = data2.getContent();
            data = new Data(content != null ? ((hce.d) content).f150888a : null, data2.getError(), data2.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, data2.getLoading());
        }
        hce.d dVar = (hce.d) data2.getContent();
        List listD = fVar.d(data, qVar, dVar != null ? dVar.f150889b : null);
        if (listD != null) {
            a0.x(listD, arrayList);
        }
        CellDetailsChevronDelegate.Model modelS = fVar.s();
        yp0.b.l(modelS, 0, 0, 0, 0, null, false, 63);
        arrayList.add(modelS);
        return arrayList;
    }

    @Override // abe.a
    public final r c(hce.c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        hce.b bVar = subscriptionContent.f150886a;
        return w.h(new a(bVar.f150883a, bVar.f150884b, bVar.f150885c));
    }

    @Override // abe.a
    public final r d(hce.c subscriptionContent) {
        o61.a aVar;
        String str;
        Map map;
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        hce.b bVar = subscriptionContent.f150886a;
        p pVar = bVar.f150883a;
        q qVar = bVar.f150885c;
        String str2 = null;
        if (qVar == null || (map = qVar.e) == null) {
            aVar = null;
        } else {
            Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
            aVar = (o61.a) map.get(pVar.f249318c);
        }
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        MoneyClause moneyClauseU = ((i9e.f) this.f150652a).u(zae.c.b(subscriptionContent), u.i(pVar, ((f) this.f150653b).g()));
        if (aVar == null || (str = aVar.f222488b) == null) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        TextClause textClause = new TextClause(str, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.recurring_payment_details_header_subtitle, null, null, 14);
        ConfigurableResourceImage configurableResourceImage = new ConfigurableResourceImage(R$drawable.uikit_icn_20_recurring, null, null, null, 1022);
        LayeredImage layeredImageB = aVar != null ? aVar.f222489c : LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_bill_accounts, Integer.valueOf(R$attr.uikit_colorDeepPurple), R$attr.uikit_colorWhite, 8.0f, null, null, 48);
        if (aVar != null && aVar.f222487a != null) {
            str2 = "ID_BILL_ACCOUNTS";
        }
        return w.h(new hce.a(moneyClauseU, textClause, textLocalisedClause, layeredImageB, configurableResourceImage, str2, 32));
    }
}
