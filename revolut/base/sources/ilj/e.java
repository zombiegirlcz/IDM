package ilj;

import aii.r;
import com.revolut.retail.feature.esim.api.model.EsimPickerItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPickerItem f162246a;

    public e(EsimPickerItem selectedItem) {
        Intrinsics.checkNotNullParameter(selectedItem, "selectedItem");
        this.f162246a = selectedItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f162246a, ((e) obj2).f162246a);
    }

    public final int hashCode() {
        return this.f162246a.hashCode();
    }
}
