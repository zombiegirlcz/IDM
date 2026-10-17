package m62;

import aw0.o9;
import aw0.t0;
import aw0.u0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.iris.IrisRegistrationStatus;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class r implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f202984a;

    public r(z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f202984a = phoneToolsProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        String strB = z80.b.b(this.f202984a, domainState.f202968a.getPhone(), null, null, 6);
        t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.apm_account_field_phone, null, null, 14), (Image) null, 0, false, 30);
        TextClause textClause = new TextClause(strB, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        u0 u0Var = u0.LARGE;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("ITEM_PHONE_ID", t0Var, textClause, null, null, null, u0Var, 0, null, false, false, null, null, 32504);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        IrisRegistrationStatus.NotRegistered notRegistered = domainState.f202968a;
        t0 t0Var2 = new t0((Clause) new TextLocalisedClause(R$string.apm_account_field_account, null, null, 14), (Image) null, 0, false, 30);
        xi0.b.Companion.getClass();
        xi0.b bVar = xi0.b.f306272g;
        List listK = v.k(new CellDetailsDelegate.Model("ITEM_ACCOUNT_ID", t0Var2, new TextClause(bVar.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), false, false, null, null, 31736), new CellDetailsDelegate.Model("ITEM_NAME_ID", new t0((Clause) new TextLocalisedClause(R$string.apm_account_field_name, null, null, 14), (Image) null, 0, false, 30), new TextClause(notRegistered.getName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, u0Var, 0, null, false, false, null, null, 32504), new CellDetailsDelegate.Model("ITEM_IBAN_ID", new t0((Clause) new TextLocalisedClause(R$string.apm_account_field_iban, null, null, 14), (Image) null, 0, false, 30), new TextClause(d0.H0(new Regex("(.{4})").replace(notRegistered.getIban(), "$1 ")).toString(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, u0Var, 0, null, false, false, null, null, 32504), new CellDetailsDelegate.Model("ITEM_BIC_ID", new t0((Clause) new TextLocalisedClause(R$string.apm_account_field_bic, null, null, 14), (Image) null, 0, false, 30), new TextClause(notRegistered.getBic(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, u0Var, 0, null, false, false, null, null, 32504));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        return new h(u.a(eVarB));
    }
}
