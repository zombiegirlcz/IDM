package i26;

import com.revolut.data.model.Data;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.defi.common.models.domain.DeFiAssetRiskAssessment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j extends q implements Function1 {
    public static final j f = new j();

    public j() {
        super(1, l.class, "shouldContinuePolling", "shouldContinuePolling(Lcom/revolut/data/model/Data;)Z", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        DeFiAssetDetails deFiAssetDetails;
        DeFiAssetRiskAssessment deFiAssetRiskAssessment;
        Data p0 = (Data) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        boolean z = true;
        if (p0.getContent() != null && ((deFiAssetDetails = (DeFiAssetDetails) p0.getContent()) == null || (deFiAssetRiskAssessment = deFiAssetDetails.k) == null || !deFiAssetRiskAssessment.f71687c)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
