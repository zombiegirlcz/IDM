package v1d;

import com.revolut.core.ui_kit.delegates.LineChartResizableTileDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LineChartResizableTileDelegate.Model f285292a;

    public e(LineChartResizableTileDelegate.Model item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f285292a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f285292a, ((e) obj2).f285292a);
    }

    public final int hashCode() {
        return this.f285292a.hashCode();
    }
}
