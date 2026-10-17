package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class c {
    public BackendItem a(q90.v item, List previousElements) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        throw new NotImplementedError("Override method in item " + item + " mapper");
    }

    public abstract q90.v b(BackendItem backendItem);
}
