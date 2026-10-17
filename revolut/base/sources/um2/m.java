package um2;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import mx0.u4;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4 f281208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f281209b;

    public m(u4 selectionContent, Clause clause) {
        Intrinsics.checkNotNullParameter(selectionContent, "selectionContent");
        this.f281208a = selectionContent;
        this.f281209b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f281208a, mVar.f281208a) && Intrinsics.f(this.f281209b, mVar.f281209b);
    }

    public final int hashCode() {
        int iHashCode = this.f281208a.hashCode() * 31;
        Clause clause = this.f281209b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
