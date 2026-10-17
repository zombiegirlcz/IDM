package ys1;

import aw0.o9;
import aw0.u0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.apm.bizum.api.R$string;
import com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus;
import com.youTransactor.uCube.rpc.Constants;
import ip0.c20;
import ip0.y10;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements p {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f316393a;

    public m(z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f316393a = phoneToolsProvider;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        a domainState = (a) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        BizumRegistrationStatus.NotRegistered notRegistered = domainState.f316383a;
        sa saVar = notRegistered.getF61921g() ? new sa("ITEM_VIBAN_ID", (Clause) new TextLocalisedClause(R$string.bizum_registration_confirmation_viban_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.bizum_registration_confirmation_viban_subtitle, null, null, 14), (List) null, false, (c20) null, (y10) null, (Object) null, Constants.TAG_FULL_SVPP_IDENTIFICATION) : null;
        if (saVar != null) {
            eVarB.add(saVar);
        }
        String strB = z80.b.b(this.f316393a, notRegistered.getF61918a(), null, null, 6);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_account_field_phone, null, null, 14);
        TextClause textClause = new TextClause(strB, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        u0 u0Var = u0.LARGE;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("ITEM_PHONE_ID", textLocalisedClause, textClause, null, null, false, 0, null, null, null, u0Var, 0, null, false, null, 0, 0, 0, 0, 1046504);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_account_field_account, null, null, 14);
        xi0.b.Companion.getClass();
        xi0.b bVar = xi0.b.f306272g;
        List listK = v.k(new CellDetailsDelegate.Model("ITEM_ACCOUNT_ID", textLocalisedClause2, new TextClause(bVar.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, u0Var, 0, new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), false, null, 0, 0, 0, 0, 1038312), new CellDetailsDelegate.Model("ITEM_NAME_ID", new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_account_field_name, null, null, 14), new TextClause(notRegistered.getF61919b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, u0Var, 0, null, false, null, 0, 0, 0, 0, 1046504), new CellDetailsDelegate.Model("ITEM_IBAN_ID", new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_account_field_iban, null, null, 14), new TextClause(d0.H0(new Regex("(.{4})").replace(notRegistered.getF61920c(), "$1 ")).toString(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, u0Var, 0, null, false, null, 0, 0, 0, 0, 1046504), new CellDetailsDelegate.Model("ITEM_BIC_ID", new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_account_field_bic, null, null, 14), new TextClause(notRegistered.getD(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, u0Var, 0, null, false, null, 0, 0, 0, 0, 1046504));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        return new g(u.a(eVarB), notRegistered instanceof BizumRegistrationStatus.NotRegistered.Portability ? new TextLocalisedClause(R$string.bizum_portability_warning, null, null, 14) : null);
    }
}
