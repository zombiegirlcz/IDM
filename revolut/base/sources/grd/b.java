package grd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.AddEditAssetContract$InputData$Mode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddEditAssetContract$InputData$Mode f145991a;

    public b(AddEditAssetContract$InputData$Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f145991a = mode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f145991a, ((b) obj2).f145991a);
    }

    public final int hashCode() {
        return this.f145991a.hashCode();
    }
}
