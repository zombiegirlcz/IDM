package zc0;

import com.revolut.feature.backend_flow.domain.models.FiltersInputItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m3 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FiltersInputItem.Option f321087b;

    public m3(String itemId, FiltersInputItem.Option option) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(option, "option");
        this.f321086a = itemId;
        this.f321087b = option;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) obj2;
        return Intrinsics.f(this.f321086a, m3Var.f321086a) && Intrinsics.f(this.f321087b, m3Var.f321087b);
    }

    @Override // zc0.d
    public final String getItemId() {
        return this.f321086a;
    }

    public final int hashCode() {
        return this.f321087b.hashCode() + (this.f321086a.hashCode() * 31);
    }
}
