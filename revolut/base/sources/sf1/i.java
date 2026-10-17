package sf1;

import com.revolut.feature.add.new_product.impl.repository.AddNewProductTrackingService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class i implements e4m.e {
    public static AddNewProductTrackingService a(h hVar, ik0.b retrofitFactory, ek.a converterFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(AddNewProductTrackingService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        AddNewProductTrackingService addNewProductTrackingService = (AddNewProductTrackingService) objCreate;
        vc.s.k(addNewProductTrackingService);
        return addNewProductTrackingService;
    }
}
