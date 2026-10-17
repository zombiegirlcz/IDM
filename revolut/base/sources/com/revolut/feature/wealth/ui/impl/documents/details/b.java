package com.revolut.feature.wealth.ui.impl.documents.details;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.ui.impl.R$string;
import d1h.h;
import java.util.List;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kpj.f;
import org.jetbrains.annotations.NotNull;
import te0.w;
import ve7.i;
import vkh.c;
import vkh.e;
import vkh.g;
import vkh.t;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements p {

    @NotNull
    public static final t Companion = new t();
    public static final int f = R$attr.uikit_colorAccent;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestDocumentsDetailsScreenContract$InputData f95995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f95996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f95997c;
    public final gte.a d;
    public final Object e;

    public b(InvestDocumentsDetailsScreenContract$InputData inputData, h wealthRemoteDisclaimersMapper, f wealthAccountHeaderUiMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(wealthRemoteDisclaimersMapper, "wealthRemoteDisclaimersMapper");
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f95995a = inputData;
        this.f95996b = wealthRemoteDisclaimersMapper;
        this.f95997c = wealthAccountHeaderUiMapper;
        this.d = featureToggleInteractor;
        this.e = w.y0(new i(21));
    }

    public static RowDelegate.Model b(vkh.h hVar, int i) {
        return new RowDelegate.Model("profit-and-loss-list-id", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_pnl, (Integer) null, (Integer) null, Integer.valueOf(f), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.wealth_invest_documents_stocks_statements_pnl_statements_title, null, null, 14), null, 0, new TextLocalisedClause(i, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, hVar, null, 0, 0, 0, 0, 532676568);
    }

    public static ListSubheaderDelegate.Model c() {
        return new ListSubheaderDelegate.Model("statements-list-id", (Image) null, (Clause) new TextLocalisedClause(R$string.wealth_invest_documents_stocks_statements, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public static RowDelegate.Model d(vkh.h hVar) {
        return new RowDelegate.Model("account-statement-list-id", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_balance_sheet, (Integer) null, (Integer) null, Integer.valueOf(f), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.wealth_invest_documents_stocks_statements_account_statements_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_invest_documents_stocks_statements_account_statements_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, hVar, null, 0, 0, 0, 0, 532676568);
    }

    public static List e(b bVar, boolean z, boolean z3, vkh.h hVar, WealthAccount.TaxAdvantageWealthAccount taxAdvantageWealthAccount, int i) {
        boolean z4 = (i & 2) == 0;
        List listK = null;
        int i2 = ((i & 16) != 0 ? null : taxAdvantageWealthAccount) instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa.Custodian ? R$string.wealth_invest_documents_stocks_reports_junior_costs_and_charges_report_subtitle : R$string.wealth_invest_documents_stocks_reports_costs_and_charges_report_subtitle;
        ListSubheaderDelegate.Model modelC = c();
        RowDelegate.Model[] elements = {d(hVar), z4 ? f(hVar) : null, z ? b(hVar, R$string.wealth_invest_documents_stocks_statements_pnl_statements_subtitle) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        List listQ = i2b.a.q(modelC, listL);
        if (z3) {
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("reports-list-id", (Image) null, (Clause) new TextLocalisedClause(R$string.wealth_invest_documents_stocks_reports, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            RowDelegate.Model model2 = new RowDelegate.Model("cost-and-charges-list-id", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, Integer.valueOf(f), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.wealth_invest_documents_stocks_reports_costs_and_charges_report_title, null, null, 14), null, 0, new TextLocalisedClause(i2, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, hVar, null, 0, 0, 0, 0, 532676568);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            listK = v.k(model, model2);
        }
        return i2b.a.o(listQ, listK);
    }

    public static RowDelegate.Model f(vkh.h hVar) {
        int i;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_documents_stocks_statements_tax_documents_title, null, null, 14);
        if (hVar instanceof e) {
            i = com.revolut.retail.wealth.resources.R$string.wealth_invest_documents_robo_statements_tax_documents_subtitle;
        } else {
            if (!(hVar instanceof vkh.f)) {
                if (hVar instanceof c) {
                    throw new IllegalStateException("Commodity tax documents not supported");
                }
                if (hVar instanceof vkh.d) {
                    throw new IllegalStateException("Margin Trading tax documents not supported");
                }
                if (!(hVar instanceof g)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(("TaxAdvantage account with portfolio " + ((g) hVar).f289945a + " tax documents not supported.").toString());
            }
            i = com.revolut.retail.wealth.resources.R$string.wealth_invest_documents_stocks_statements_tax_documents_subtitle;
        }
        return new RowDelegate.Model("tax-documents-list-id", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, Integer.valueOf(f), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), textLocalisedClause, null, 0, new TextLocalisedClause(i, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, hVar, null, 0, 0, 0, 0, 532676568);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0108  */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // jki.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jki.m a(jki.i r15) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.wealth.ui.impl.documents.details.b.a(jki.i):jki.m");
    }
}
