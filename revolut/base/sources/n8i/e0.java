package n8i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public interface e0 {
    default List a(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return zhm.f0.f322471a;
    }

    default Clause b(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return null;
    }

    default Clause c(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return null;
    }

    default Clause d(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return null;
    }

    default Clause e(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return null;
    }

    default c0 f(d0 errorModel) {
        Intrinsics.checkNotNullParameter(errorModel, "errorModel");
        return b0.f213405a;
    }
}
