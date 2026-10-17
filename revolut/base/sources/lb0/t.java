package lb0;

import com.revolut.feature.backend_flow.domain.models.SelectionItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t implements s7a.c0, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SelectionItem.Option f193562b;

    public t(String itemId, SelectionItem.Option selectedOption) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
        this.f193561a = itemId;
        this.f193562b = selectedOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f193561a, tVar.f193561a) && Intrinsics.f(this.f193562b, tVar.f193562b);
    }

    @Override // lb0.w
    public final String getItemId() {
        return this.f193561a;
    }

    public final int hashCode() {
        return this.f193562b.hashCode() + (this.f193561a.hashCode() * 31);
    }
}
