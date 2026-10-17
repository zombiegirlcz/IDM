package d78;

import com.revolut.feature.junior.accounts.models.JuniorPayload;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements pfe.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rlm.o f111870a = ue0.e.b(Json.d, new d6j.b(13));

    @Override // pfe.e
    public final String a(ProductAccountId.Payload payload) {
        JuniorPayload payload2 = (JuniorPayload) payload;
        Intrinsics.checkNotNullParameter(payload2, "payload");
        rlm.o oVar = this.f111870a;
        oVar.getClass();
        return oVar.c(JuniorPayload.INSTANCE.serializer(), payload2);
    }

    @Override // pfe.e
    public final ProductAccountId.Payload b(String serializedPayload) {
        Intrinsics.checkNotNullParameter(serializedPayload, "serializedPayload");
        rlm.o oVar = this.f111870a;
        oVar.getClass();
        return (JuniorPayload) oVar.b(nlm.a.c(JuniorPayload.INSTANCE.serializer()), serializedPayload);
    }
}
