package ke2;

import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.swish.impl.domain.SwishRegistrationStatus;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class s implements cli.n {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f182967a;

    public s(z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f182967a = phoneToolsProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("ID_PHONE_NUMBER", new t0((Clause) new TextLocalisedClause(R$string.apm_account_field_phone, null, null, 14), (Image) null, 0, false, 30), new TextClause(z80.b.b(this.f182967a, domainState.f182956a.f62902b, null, null, 6), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.apm_account_field_account, null, null, 14), (Image) null, 0, false, 30);
        xi0.b.Companion.getClass();
        xi0.b bVar = xi0.b.f306280r;
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("ID_ACCOUNT", t0Var, new TextClause(bVar.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), false, false, null, null, 31736);
        t0 t0Var2 = new t0((Clause) new TextLocalisedClause(R$string.apm_account_field_name, null, null, 14), (Image) null, 0, false, 30);
        SwishRegistrationStatus.NotRegistered notRegistered = domainState.f182956a;
        List listK = v.k(model2, new CellDetailsDelegate.Model("ID_NAME", t0Var2, new TextClause(notRegistered.f62901a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model("ID_ACCOUNT_NUMBER", new t0((Clause) new TextLocalisedClause(R$string.apm_account_field_account_number, null, null, 14), (Image) null, 0, false, 30), new TextClause(notRegistered.f62903c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        return new k(u.a(eVarB));
    }
}
