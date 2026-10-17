package pn7;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_common.ui.screen.documents.DocumentListScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final DocumentListScreenContract$InputData.Policy a(String policyId) {
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        return new DocumentListScreenContract$InputData.Policy(new TextLocalisedClause(R$string.car_insurance_documents_header_title, null, null, 14), new AnalyticsProduct.Retail(zl7.a.f323191b), true, policyId);
    }
}
