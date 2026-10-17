package sh2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.api.product.ApmWero;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$Tab;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c12.f f263394a;

    public d(c12.f apmNewContactExtension) {
        Intrinsics.checkNotNullParameter(apmNewContactExtension, "apmNewContactExtension");
        this.f263394a = apmNewContactExtension;
    }

    public final c12.g a(wi0.b userCountry, hrf.f transferDirection, String str) {
        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        return new c12.g(new ApmNewContactNavigation$InputData(n02.b.WERO, zhm.v.k(ApmNewContactNavigation$Tab.PHONE.f62253b, ApmNewContactNavigation$Tab.EMAIL.f62252b), transferDirection, new TextLocalisedClause(R$string.apm_new_contact_title, zhm.u.c(ApmWero.f61829c.e()), null, 12), userCountry, (List) null, str, 96), this.f263394a);
    }
}
