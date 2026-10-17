package aob;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.product_payload.SavingsProductAccountPayload;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements pfe.e {
    @Override // pfe.e
    public final String a(ProductAccountId.Payload payload) {
        SavingsProductAccountPayload payload2 = (SavingsProductAccountPayload) payload;
        Intrinsics.checkNotNullParameter(payload2, "payload");
        rlm.b bVar = Json.d;
        bVar.getClass();
        return bVar.c(SavingsProductAccountPayload.INSTANCE.serializer(), payload2);
    }

    @Override // pfe.e
    public final ProductAccountId.Payload b(String serializedPayload) {
        Intrinsics.checkNotNullParameter(serializedPayload, "serializedPayload");
        rlm.b bVar = Json.d;
        bVar.getClass();
        return (SavingsProductAccountPayload) bVar.b(nlm.a.c(SavingsProductAccountPayload.INSTANCE.serializer()), serializedPayload);
    }
}
