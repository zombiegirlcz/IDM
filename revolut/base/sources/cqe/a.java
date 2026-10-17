package cqe;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.teen.accounts.api.model.TeenAccountPayload;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import pfe.e;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements e {
    @Override // pfe.e
    public final String a(ProductAccountId.Payload payload) {
        TeenAccountPayload payload2 = (TeenAccountPayload) payload;
        Intrinsics.checkNotNullParameter(payload2, "payload");
        rlm.b bVar = Json.d;
        bVar.getClass();
        return bVar.c(TeenAccountPayload.INSTANCE.serializer(), payload2);
    }

    @Override // pfe.e
    public final ProductAccountId.Payload b(String serializedPayload) {
        Intrinsics.checkNotNullParameter(serializedPayload, "serializedPayload");
        rlm.b bVar = Json.d;
        bVar.getClass();
        return (TeenAccountPayload) bVar.b(nlm.a.c(TeenAccountPayload.INSTANCE.serializer()), serializedPayload);
    }
}
