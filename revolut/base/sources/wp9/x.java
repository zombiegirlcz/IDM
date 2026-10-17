package wp9;

import com.revolut.feature.payments.bills_chooser.api.model.ItemizedBillData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f299207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ItemizedBillData.ScanData f299208b;

    public x(List itemizationItems, ItemizedBillData.ScanData scanData) {
        Intrinsics.checkNotNullParameter(itemizationItems, "itemizationItems");
        this.f299207a = itemizationItems;
        this.f299208b = scanData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f299207a, xVar.f299207a) && Intrinsics.f(this.f299208b, xVar.f299208b);
    }

    public final int hashCode() {
        int iHashCode = this.f299207a.hashCode() * 31;
        ItemizedBillData.ScanData scanData = this.f299208b;
        return iHashCode + (scanData == null ? 0 : scanData.hashCode());
    }
}
