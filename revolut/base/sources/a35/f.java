package a35;

import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements pfe.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rlm.o f1060a = ue0.e.b(Json.d, new b(1));

    @Override // pfe.e
    public final String a(ProductAccountId.Payload payload) {
        CreditAccountType payload2 = (CreditAccountType) payload;
        Intrinsics.checkNotNullParameter(payload2, "payload");
        rlm.o oVar = this.f1060a;
        oVar.getClass();
        return oVar.c(CreditAccountType.INSTANCE.serializer(), payload2);
    }

    @Override // pfe.e
    public final ProductAccountId.Payload b(String serializedPayload) {
        Intrinsics.checkNotNullParameter(serializedPayload, "serializedPayload");
        rlm.o oVar = this.f1060a;
        oVar.getClass();
        return (CreditAccountType) oVar.b(nlm.a.c(CreditAccountType.INSTANCE.serializer()), serializedPayload);
    }
}
