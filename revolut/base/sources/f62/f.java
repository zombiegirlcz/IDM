package f62;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.product.ApmIris;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$Tab;
import com.revolut.feature.apm.iris.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c12.f f132380a;

    public f(c12.f apmNewContactExtension) {
        Intrinsics.checkNotNullParameter(apmNewContactExtension, "apmNewContactExtension");
        this.f132380a = apmNewContactExtension;
    }

    public final c12.g a(String str) {
        n02.b bVar = n02.b.IRIS;
        List listK = v.k(ApmNewContactNavigation$Tab.PHONE.f62253b, new ApmNewContactNavigation$Tab.TAX(new TextLocalisedClause(R$string.iris_new_contact_tab_tax_name, null, null, 14), new TextLocalisedClause(R$string.iris_new_contact_tab_tax_hint, null, null, 14), new TextLocalisedClause(R$string.iris_new_contact_tab_tax_helper, null, null, 14)));
        hrf.f fVar = hrf.f.OUTGOING;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_new_contact_title, u.c(ApmIris.f61811c.e()), null, 12);
        wi0.b.Companion.getClass();
        return new c12.g(new ApmNewContactNavigation$InputData(bVar, listK, fVar, textLocalisedClause, wi0.b.y0, (List) null, str, 96), this.f132380a);
    }
}
