package qe5;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.documents.api.R$string;
import java.util.ArrayList;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements p {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f245083a;

    public n(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f245083a = featureToggleInteractor;
    }

    public static RowDelegate.Model b(int i, int i2, String str) {
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i2, null, null, 14);
        yy0.i iVar = yy0.l.Companion;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        iVar.getClass();
        return new RowDelegate.Model(str, image24, textLocalisedClause, null, 0, null, null, null, 0, new tf(yy0.i.a(resourceImage)), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList arrayListG = yp0.b.g(v.k(new RowDelegate.Model("CRYPTO_ACCOUNT_STATEMENT_SETTING_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_balance_sheet, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.crypto_documents_statements_account_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.crypto_documents_statements_account_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("CRYPTO_PNL_STATEMENT_SETTING_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_pnl, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.crypto_documents_statements_pnl_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.crypto_documents_statements_pnl_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872)), new ListSubheaderDelegate.Model("STATEMENTS_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.crypto_documents_statements_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        return new e(d0.E0((List) iii.c.f(domainState.f245074a, new qc7.c(21), new qc8.a(11), new qbg.j(this, 4)), d0.E0(yp0.b.g(u.c(new RowDelegate.Model("CRYPTO_TAX_REPORT_SETTING_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_percent, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.crypto_documents_reports_tax_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.crypto_documents_reports_tax_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872)), new ListSubheaderDelegate.Model("REPORTS_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.crypto_documents_reports_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), arrayListG)));
    }
}
