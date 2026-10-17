package a6e;

import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements pfe.e {
    @Override // pfe.e
    public final String a(ProductAccountId.Payload payload) {
        ExtendedSubaccountType payload2 = (ExtendedSubaccountType) payload;
        Intrinsics.checkNotNullParameter(payload2, "payload");
        rlm.b bVar = Json.d;
        bVar.getClass();
        return bVar.c(ExtendedSubaccountType.INSTANCE.serializer(), payload2);
    }

    @Override // pfe.e
    public final ProductAccountId.Payload b(String serializedPayload) {
        Intrinsics.checkNotNullParameter(serializedPayload, "serializedPayload");
        rlm.b bVar = Json.d;
        bVar.getClass();
        return (ExtendedSubaccountType) bVar.b(nlm.a.c(ExtendedSubaccountType.INSTANCE.serializer()), serializedPayload);
    }
}
