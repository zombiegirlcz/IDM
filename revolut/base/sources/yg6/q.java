package yg6;

import com.revolut.feature.external_accounts.api.model.LinkedAccountPayload;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements pfe.e {
    @Override // pfe.e
    public final String a(ProductAccountId.Payload payload) {
        LinkedAccountPayload payload2 = (LinkedAccountPayload) payload;
        Intrinsics.checkNotNullParameter(payload2, "payload");
        rlm.b bVar = Json.d;
        bVar.getClass();
        return bVar.c(LinkedAccountPayload.INSTANCE.serializer(), payload2);
    }

    @Override // pfe.e
    public final ProductAccountId.Payload b(String serializedPayload) {
        Intrinsics.checkNotNullParameter(serializedPayload, "serializedPayload");
        rlm.b bVar = Json.d;
        bVar.getClass();
        return (LinkedAccountPayload) bVar.b(nlm.a.c(LinkedAccountPayload.INSTANCE.serializer()), serializedPayload);
    }
}
