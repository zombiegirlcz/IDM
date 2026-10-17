package td2;

import c12.f;
import c12.g;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.product.ApmSpin;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$Tab;
import com.revolut.feature.apm.spin.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f269915a;

    public b(f apmNewContactExtension) {
        Intrinsics.checkNotNullParameter(apmNewContactExtension, "apmNewContactExtension");
        this.f269915a = apmNewContactExtension;
    }

    public final g a(String str) {
        n02.b bVar = n02.b.SPIN;
        List listK = v.k(ApmNewContactNavigation$Tab.PHONE.f62253b, new ApmNewContactNavigation$Tab.TAX(new TextLocalisedClause(R$string.spin_new_contact_tab_tax_name, null, null, 14), new TextLocalisedClause(R$string.spin_new_contact_tab_tax_hint, null, null, 14), new TextLocalisedClause(R$string.spin_new_contact_tab_tax_helper, null, null, 14)));
        hrf.f fVar = hrf.f.OUTGOING;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_new_contact_title, u.c(ApmSpin.f61827c.e()), null, 12);
        wi0.b.Companion.getClass();
        return new g(new ApmNewContactNavigation$InputData(bVar, listK, fVar, textLocalisedClause, wi0.b.y2, (List) null, str, 96), this.f269915a);
    }
}
