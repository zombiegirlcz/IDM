package f62;

import c12.x;
import c12.z;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.api.product.ApmIris;
import com.revolut.feature.apm.core.api.product.ApmWero;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientListInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f132394a;

    public o(z apmRecipientListExtension, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(apmRecipientListExtension, "apmRecipientListExtension");
                this.f132394a = apmRecipientListExtension;
                break;
            default:
                Intrinsics.checkNotNullParameter(apmRecipientListExtension, "apmRecipientListExtension");
                this.f132394a = apmRecipientListExtension;
                break;
        }
    }

    public x a() {
        return new x(new ApmRecipientListInputData(ApmIris.f61811c, hrf.f.OUTGOING, new TextLocalisedClause(R$string.apm_select_contact_search_placeholder, null, null, 14)), this.f132394a);
    }

    public x b(hrf.f transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        return new x(new ApmRecipientListInputData(ApmWero.f61829c, transferDirection, new TextLocalisedClause(R$string.apm_select_contact_search_placeholder, null, null, 14)), this.f132394a);
    }
}
