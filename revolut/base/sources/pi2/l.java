package pi2;

import aw0.o9;
import aw0.u0;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.wero.impl.common.WeroRegistrationStatus;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f236385a;

    public l(z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f236385a = phoneToolsProvider;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        WeroRegistrationStatus.NotRegistered notRegistered = domainState.f236379a;
        String strB = z80.b.b(this.f236385a, notRegistered.getPhone(), null, null, 6);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.apm_account_field_phone, null, null, 14);
        TextClause textClause = new TextClause(strB, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        u0 u0Var = u0.LARGE;
        List listK = v.k(new CellDetailsDelegate.Model("ITEM_PHONE_ID", textLocalisedClause, textClause, null, null, false, 0, null, null, null, u0Var, 0, null, false, null, 0, 0, 0, 0, 1046504), new CellDetailsDelegate.Model("ITEM_EMAIL_ID", new TextLocalisedClause(R$string.apm_account_field_email, null, null, 14), new TextClause(notRegistered.getEmail(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, u0Var, 0, null, false, null, 0, 0, 0, 0, 1046504));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        WeroRegistrationStatus.NotRegistered notRegistered2 = domainState.f236379a;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.apm_account_field_account, null, null, 14);
        xi0.b bVar = hh2.a.f152244a;
        List listK2 = v.k(new CellDetailsDelegate.Model("ITEM_ACCOUNT_ID", textLocalisedClause2, new TextClause(bVar.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, u0Var, 0, new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), false, null, 0, 0, 0, 0, 1038312), new CellDetailsDelegate.Model("ITEM_NAME_ID", new TextLocalisedClause(R$string.apm_account_field_name, null, null, 14), new TextClause(notRegistered2.getName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, u0Var, 0, null, false, null, 0, 0, 0, 0, 1046504), new CellDetailsDelegate.Model("ITEM_IBAN_ID", new TextLocalisedClause(R$string.apm_account_field_iban, null, null, 14), new TextClause(d0.H0(new Regex("(.{4})").replace(notRegistered2.getAccountNumber(), "$1 ")).toString(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, u0Var, 0, null, false, null, 0, 0, 0, 0, 1046504), new CellDetailsDelegate.Model("ITEM_BIC_ID", new TextLocalisedClause(R$string.apm_account_field_bic, null, null, 14), new TextClause(notRegistered2.getBic(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, u0Var, 0, null, false, null, 0, 0, 0, 0, 1046504));
        yp0.b.k(listK2, 0, 0, 0, 0, 31);
        eVarB.addAll(listK2);
        return new e(u.a(eVarB));
    }
}
