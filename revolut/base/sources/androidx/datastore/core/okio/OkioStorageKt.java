package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.InterProcessCoordinatorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mmm.g0;
import mmm.h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmmm/h0;", "path", "Landroidx/datastore/core/InterProcessCoordinator;", "createSingleProcessCoordinator", "(Lmmm/h0;)Landroidx/datastore/core/InterProcessCoordinator;", "datastore-core-okio"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class OkioStorageKt {
    @NotNull
    public static final InterProcessCoordinator createSingleProcessCoordinator(@NotNull h0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        g0 g0Var = h0.Companion;
        String strV = path.f207272a.v();
        g0Var.getClass();
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(g0.a(strV, true).f207272a.v());
    }
}
