package b65;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q35.r;
import sx4.g;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c45.b f12533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ky4.c f12534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f12535c;

    public e(c45.b accountMapper, a75.a insuranceItemMapper, ky4.c numberFormatter, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(accountMapper, "accountMapper");
        Intrinsics.checkNotNullParameter(insuranceItemMapper, "insuranceItemMapper");
        Intrinsics.checkNotNullParameter(numberFormatter, "numberFormatter");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f12533a = accountMapper;
        this.f12534b = numberFormatter;
        this.f12535c = featureToggleInteractor;
    }

    public static final CellDetailsNoteDelegate.Model a(r rVar, Clause clause) {
        Clause textLocalisedClause = rVar.isEnabled() ? clause : null;
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.loan_management_autopay_setup_action, null, null, 14);
        }
        return new CellDetailsNoteDelegate.Model("ID_AUTO_PAY", new TextLocalisedClause(R$string.loan_management_autopay, null, null, 14), null, null, null, true, new ResourceImage(R$drawable.uikit_icn_24_calendar_recurring, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), g.f(textLocalisedClause, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254)), null, null, null, 0, 130644);
    }

    public static final ListSubheaderDelegate.Model c() {
        return new ListSubheaderDelegate.Model("ID_MANAGE_REPAYMENTS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.loan_management_details_repayment_details, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (Image) null, (Clause) new TextLocalisedClause(R$string.loan_management_details_action_manage, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65450);
    }

    public final List b(x35.e eVar, w35.a aVar) {
        if (eVar == null) {
            return yp0.b.i(new RowDelegate.Model("empty_autopay_account_list_id", null, new TextLocalisedClause(R$string.loan_management_manage_repayments_mandate_set_up, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868858), c(), null, 0, 0, 126);
        }
        c45.b bVar = this.f12533a;
        return aVar != null ? yp0.b.i(bVar.j(eVar, null, aVar), c(), null, 0, 0, 126) : yp0.b.i(bVar.i(eVar, null), c(), null, 0, 0, 126);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0399  */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final aim.e d(com.revolut.feature.credit.loan.api.models.rev10.LoanDetails r41, q35.r r42, com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard r43, x35.e r44) {
        /*
            Method dump skipped, instruction units count: 1021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b65.e.d(com.revolut.feature.credit.loan.api.models.rev10.LoanDetails, q35.r, com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard, x35.e):aim.e");
    }
}
