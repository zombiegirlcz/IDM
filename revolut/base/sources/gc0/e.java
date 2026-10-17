package gc0;

import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.SelectionStyle;
import gaf.l;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hbl.d f142298a;

    public e(hbl.d sharedTransactionMapper) {
        Intrinsics.checkNotNullParameter(sharedTransactionMapper, "sharedTransactionMapper");
        this.f142298a = sharedTransactionMapper;
    }

    @Override // gc0.d
    public final List a(Data data, Set selectedIds, SelectionStyle style) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        Intrinsics.checkNotNullParameter(style, "style");
        return (List) iii.c.f(data, new l(4), new g5k.f(21), new a0i.a(this, 19, selectedIds, style));
    }
}
