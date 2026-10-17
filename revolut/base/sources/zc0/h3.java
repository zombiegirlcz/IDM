package zc0;

import com.revolut.feature.backend_flow.domain.models.EditableListItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h3 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditableListItem f321060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321061b;

    public h3(EditableListItem item, String selectedItemId) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(selectedItemId, "selectedItemId");
        this.f321060a = item;
        this.f321061b = selectedItemId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj2;
        return Intrinsics.f(this.f321060a, h3Var.f321060a) && Intrinsics.f(this.f321061b, h3Var.f321061b);
    }

    @Override // zc0.d
    public final String getItemId() {
        return this.f321060a.f63400a;
    }

    public final int hashCode() {
        return this.f321061b.hashCode() + (this.f321060a.hashCode() * 31);
    }
}
