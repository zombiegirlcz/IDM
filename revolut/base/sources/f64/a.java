package f64;

import aim.e;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import d8l.d;
import dx4.a1;
import fu3.b;
import fu3.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import rp0.m;
import rp0.y;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class a {
    public static y a(c repaymentTypeSelectionContent) {
        Intrinsics.checkNotNullParameter(repaymentTypeSelectionContent, "repaymentTypeSelectionContent");
        m.b bVar = m.Companion;
        Style style = null;
        int i = 12;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_calculator_edit_repayment_type_title, u.c(repaymentTypeSelectionContent.f138081a), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_calculator_edit_repayment_type_description, u.c(repaymentTypeSelectionContent.f138082b), null, 12);
        e eVarB = u.b();
        List<b> list = repaymentTypeSelectionContent.f138083c;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (b bVar2 : list) {
            String str = bVar2.f138078c;
            boolean z = bVar2.i;
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_application_calculator_edit_repayment_type_item_title, u.c(str), style, i);
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.credit_application_calculator_edit_repayment_type_item_subtitle, u.c(bVar2.d), style, i);
            boolean z3 = bVar2.f138080h;
            w0 w0VarA = zw4.a.a(bVar2.f138076a);
            com.revolut.core.ui_kit.delegates.c aVar = bVar2.i ? com.revolut.core.ui_kit.delegates.b.f53699a : new com.revolut.core.ui_kit.delegates.a();
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            int i2 = R$attr.uikit_colorAccent_10;
            a1 a1Var = bVar2.f138079g;
            arrayList.add(new AccountCellItemDelegate.Model(str, z3, LayeredImage.Companion.b(companion, a1Var != null ? a1Var.c() : R$drawable.uikit_icn_24_bank, Integer.valueOf(R$attr.uikit_colorAccent), i2, 8.0f, null, null, 48), textLocalisedClause3, aVar, z, textLocalisedClause4, new RowDelegate.Model.c.b(new TextLocalisedClause(R$string.credit_application_calculator_edit_repayment_type_item_primary_value, u.c(bVar2.e), null, 12), new TextLocalisedClause(R$string.credit_application_calculator_edit_repayment_type_item_secondary_value, u.c(bVar2.f), null, 12), null, false, 124), d.b(bVar2.f138080h), bVar2, new AnalyticsContext(w0VarA), 124160));
            bVar = bVar;
            textLocalisedClause = textLocalisedClause;
            textLocalisedClause2 = textLocalisedClause2;
            style = null;
            i = 12;
        }
        m.b bVar3 = bVar;
        TextLocalisedClause textLocalisedClause5 = textLocalisedClause;
        TextLocalisedClause textLocalisedClause6 = textLocalisedClause2;
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList);
        String str2 = repaymentTypeSelectionContent.d;
        if (str2 != null) {
            eVarB.add(new PlainTextDelegate.Model("repayment-type-selection-disclaimer", (Clause) null, (Clause) new TextLocalisedClause(R$string.credit_application_calculator_edit_repayment_type_footer, u.c(str2), null, 12), (v5) null, (UrlImage) null, false, pa.LIGHT, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65006));
        }
        Unit unit = Unit.f186387a;
        return dy4.b.a(bVar3, textLocalisedClause5, textLocalisedClause6, null, null, u.a(eVarB), 220);
    }
}
