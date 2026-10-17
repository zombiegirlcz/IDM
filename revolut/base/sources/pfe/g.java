package pfe;

import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pie.v;

/* JADX INFO: loaded from: classes8.dex */
public interface g {
    Flow a();

    default boolean b() {
        return false;
    }

    default Flow c(ProductSpaceIdentifier spaceIdentifier, v subSpaceIdentifier, sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
        Intrinsics.checkNotNullParameter(subSpaceIdentifier, "subSpaceIdentifier");
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        return d(dataLoadingMode);
    }

    Flow d(sfe.a aVar);

    default Object e(Continuation continuation) {
        return Unit.f186387a;
    }
}
