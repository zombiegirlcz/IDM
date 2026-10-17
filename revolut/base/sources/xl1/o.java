package xl1;

import aw0.o9;
import aw0.u0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.apm.aani.impl.model.DataForRegistration;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.api.product.ApmAani;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f306911a;

    public o(z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f306911a = phoneToolsProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.apm_account_field_phone, null, null, 14);
        TextClause textClause = new TextClause(z80.b.b(this.f306911a, domainState.f306900a.f61120a, null, null, 6), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        u0 u0Var = u0.LARGE;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("ITEM_PHONE_ID", textLocalisedClause, textClause, null, null, false, 0, null, null, null, u0Var, 0, null, false, null, 0, 0, 0, 0, 1046504);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.apm_account_field_email, null, null, 14);
        DataForRegistration dataForRegistration = domainState.f306900a;
        List listK = v.k(model, new CellDetailsDelegate.Model("ITEM_EMAIL_ID", textLocalisedClause2, new TextClause(dataForRegistration.f61121b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, u0Var, 0, null, false, null, 0, 0, 0, 0, 1046504), new CellDetailsDelegate.Model("ITEM_EMIRATES_ID", new TextLocalisedClause(R$string.apm_account_field_emirates_id, null, null, 14), new TextClause(dataForRegistration.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, u0Var, 0, null, false, null, 0, 0, 0, 0, 1046504));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.apm_account_field_account, null, null, 14);
        ApmAani apmAani = ApmAani.f61807c;
        List listK2 = v.k(new CellDetailsDelegate.Model("ITEM_ACCOUNT_ID", textLocalisedClause3, new TextClause(apmAani.b().f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, u0Var, 0, new CurrencyImage(apmAani.b().f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), false, null, 0, 0, 0, 0, 1038312), new CellDetailsDelegate.Model("ITEM_NAME_ID", new TextLocalisedClause(R$string.apm_account_field_name, null, null, 14), new TextClause(dataForRegistration.f61122c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, u0Var, 0, null, false, null, 0, 0, 0, 0, 1046504));
        yp0.b.k(listK2, 0, 0, 0, 0, 31);
        eVarB.addAll(listK2);
        RowDelegate.Model model2 = new RowDelegate.Model("ITEM_DEFAULT_RECEIVER_ID", null, new TextLocalisedClause(com.revolut.feature.apm.aani.api.R$string.aani_onboarding_confirmation_default_revolut_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.apm.aani.api.R$string.aani_onboarding_confirmation_default_revolut_description, null, null, 14), null, null, 0, new vf(domainState.f306901b, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869850);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        return new g(u.a(eVarB));
    }
}
