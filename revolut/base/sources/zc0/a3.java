package zc0;

import com.revolut.feature.backend_flow.domain.models.ChipsSelectionItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a3 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChipsSelectionItem.Chip f321004b;

    public a3(String itemId, ChipsSelectionItem.Chip chip) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(chip, "chip");
        this.f321003a = itemId;
        this.f321004b = chip;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj2;
        return Intrinsics.f(this.f321003a, a3Var.f321003a) && Intrinsics.f(this.f321004b, a3Var.f321004b);
    }

    @Override // zc0.d
    public final String getItemId() {
        return this.f321003a;
    }

    public final int hashCode() {
        return this.f321004b.hashCode() + (this.f321003a.hashCode() * 31);
    }
}
