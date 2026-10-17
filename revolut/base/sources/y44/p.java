package y44;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.api.models.config.AgreementsScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents.CreditApplicationDocumentsScreenContract$Configuration;
import com.revolut.feature.credit.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.ej;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import mx0.c7;
import mx4.y;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements cli.n {

    @NotNull
    public static final n Companion = new n();

    public p(y mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        boolean z;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f310776a;
        CreditApplicationDocumentsScreenContract$Configuration creditApplicationDocumentsScreenContract$Configuration = (CreditApplicationDocumentsScreenContract$Configuration) data.getContent();
        if (creditApplicationDocumentsScreenContract$Configuration == null) {
            if (!data.getLoading()) {
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.agreements_documents_title, u.c(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                return new l(u.c(new FullScreenStateDelegate.Model("ID_ERROR_ITEM", new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), null, new TextLocalisedClause(R.string.common_action_retry, null, null, 14), false, null, null, false, 0, 0, 32596)), textLocalisedClause, null, null, textClause, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false);
            }
            t0 t0Var2 = t0.f186434a;
            m70.a.c(t0Var2);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.agreements_documents_title, u.c(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            Intrinsics.checkNotNullParameter(t0Var2, "<this>");
            TextClause textClause2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            Intrinsics.checkNotNullParameter(t0Var2, "<this>");
            TextClause textClause3 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            IntRange intRange = new IntRange(0, 1, 1);
            ArrayList arrayList = new ArrayList(w.t(intRange, 10));
            vim.f it8 = intRange.iterator();
            while (it8.f289625c) {
                pb0 pb0Var = new pb0(a0.d.n("ID_LOADING_ITEM_", it8.nextInt()));
                yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                arrayList.add(pb0Var);
            }
            yp0.b.k(arrayList, R$attr.uikit_dp32, 0, 0, 0, 30);
            return new l(arrayList, textLocalisedClause2, null, null, textClause2, textClause3, false);
        }
        List<du3.a> list = creditApplicationDocumentsScreenContract$Configuration.f67003a;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = true;
        } else {
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                if (!((du3.a) it9.next()).f) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        AgreementsScreenConfig.Disclaimer disclaimer = creditApplicationDocumentsScreenContract$Configuration.f;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.agreements_documents_title, u.c(creditApplicationDocumentsScreenContract$Configuration.f67004b), null, 12);
        Clause clause = creditApplicationDocumentsScreenContract$Configuration.f67005c;
        TextLocalisedClause textLocalisedClause4 = clause != null ? new TextLocalisedClause(R$string.agreements_documents_subtitle, u.c(clause), null, 12) : null;
        Image image = creditApplicationDocumentsScreenContract$Configuration.d;
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.agreements_documents_description, u.c(creditApplicationDocumentsScreenContract$Configuration.e), null, 12);
        TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.agreements_documents_action, u.c(creditApplicationDocumentsScreenContract$Configuration.f67006g), null, 12);
        aim.e eVarB = u.b();
        ArrayList<fx4.d> arrayList2 = new ArrayList(w.t(list, 10));
        for (du3.a aVar : list) {
            String str = aVar.f117551a;
            TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(R$string.agreements_documents_document, u.c(new TextClause(aVar.f117552b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            String str2 = aVar.f117553c;
            arrayList2.add(new fx4.d(str, textLocalisedClause7, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, aVar.f));
        }
        fx4.e displayCreditDocumentData = new fx4.e(arrayList2);
        Intrinsics.checkNotNullParameter(displayCreditDocumentData, "displayCreditDocumentData");
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        for (fx4.d dVar : arrayList2) {
            arrayList3.add(new RowDelegate.Model(dVar.f138723a, y.a(), dVar.f138724b, null, 0, dVar.f138725c, null, null, 0, y.b(dVar.d), false, null, false, null, null, null, null, null, null, null, new AnalyticsContext(zw4.a.a(dVar.f138723a)), 0, 0, 0, 0, 528481240));
        }
        yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList3);
        Clause clause2 = disclaimer != null ? disclaimer.f66332a : null;
        com.revolut.feature.credit.application.plugins.api.models.config.a aVar2 = disclaimer != null ? disclaimer.f66333b : null;
        int i = aVar2 == null ? -1 : o.f310786a[aVar2.ordinal()];
        boolean z3 = i != 1 ? i != 2 ? false : z : true;
        if (clause2 != null && z3) {
            ej ejVar = new ej("ID_DISCLAIMER_ITEM", new c7(new TextLocalisedClause(R$string.agreements_documents_disclaimer, u.c(clause2), null, 12), false, null, 6));
            yp0.b.r(ejVar, 0, 0, 0, 0, 15);
            eVarB.add(ejVar);
        }
        return new l(u.a(eVarB), textLocalisedClause3, textLocalisedClause4, image, textLocalisedClause5, textLocalisedClause6, z);
    }
}
