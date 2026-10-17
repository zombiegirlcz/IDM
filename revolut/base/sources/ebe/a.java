package ebe;

import a9e.b;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import efm.r;
import hce.c;
import ip0.z;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import qua.h;
import qua.p;
import qua.u;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends abe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f124315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f124316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gbe.a f124317c;

    public a(b commonSubscriptionMapper, e dateProvider, gbe.a billCommonSubscriptionMapper) {
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(billCommonSubscriptionMapper, "billCommonSubscriptionMapper");
        this.f124315a = commonSubscriptionMapper;
        this.f124316b = dateProvider;
        this.f124317c = billCommonSubscriptionMapper;
    }

    @Override // abe.a
    public final z a(Object obj2) {
        Boolean boolValueOf;
        List list;
        dbe.a model = (dbe.a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        p pVar = model.f112735a;
        boolean zI = u.i(pVar, ((f) this.f124316b).g());
        List list2 = pVar.Z;
        ActionsView.Item itemM = null;
        if (!zI) {
            return null;
        }
        if (list2 != null) {
            boolValueOf = Boolean.valueOf(list2.size() == 1 && list2.contains(fva.a.CHANGE_DESCRIPTION));
        } else {
            boolValueOf = null;
        }
        boolean zJ = pd.b.j(boolValueOf);
        h hVar = pVar.C;
        b bVar = this.f124315a;
        if (hVar != null && (list = list2) != null && !list.isEmpty() && !zJ) {
            itemM = ((i9e.f) bVar).m();
        }
        i9e.f fVar = (i9e.f) bVar;
        ActionsView.Item[] elements = {itemM, fVar.x()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return fVar.c(d.L(elements));
    }

    @Override // abe.a
    public final List b(Object obj2) {
        dbe.a model = (dbe.a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        p pVar = model.f112735a;
        h hVar = pVar.C;
        String str = hVar != null ? hVar.f249298b : null;
        List list = pVar.Z;
        return this.f124317c.a(model, str, true, pd.b.j(list != null ? Boolean.valueOf(list.contains(fva.a.CHANGE_DESCRIPTION)) : null));
    }

    @Override // abe.a
    public final r c(c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        hce.b bVar = subscriptionContent.f150886a;
        return w.h(new dbe.a(bVar.f150883a, bVar.f150884b, bVar.f150885c));
    }

    @Override // abe.a
    public final r d(c subscriptionContent) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        p pVarC = zae.c.c(subscriptionContent);
        hce.b bVar = subscriptionContent.f150886a;
        p pVar = bVar.f150883a;
        boolean zI = u.i(pVarC, ((f) this.f124316b).g());
        dj0.d dVarB = zae.c.b(subscriptionContent);
        i9e.f fVar = (i9e.f) this.f124315a;
        MoneyClause moneyClauseU = fVar.u(dVarB, zI);
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        h hVar = bVar.f150883a.C;
        Clause textLocalisedClause = (hVar == null || (str2 = hVar.f249298b) == null) ? new TextLocalisedClause(R$string.recurring_payments_form_transfer, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10) : new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.recurring_payment_details_header_bills_and_taxes_subtitle, null, null, 14);
        LayeredImage layeredImageG = fVar.g(!zI);
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        h hVar2 = pVar.C;
        if (hVar2 == null || (str = hVar2.f249298b) == null) {
            Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
            str = pVar.f249325m;
        }
        return w.h(new hce.a(moneyClauseU, textLocalisedClause, textLocalisedClause2, new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, str, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063), layeredImageG, (Serializable) null, 96));
    }
}
