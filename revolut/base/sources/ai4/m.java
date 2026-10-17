package ai4;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate.Model f5193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5194b;

    public m(RowDelegate.Model model, List searchCriteria) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(searchCriteria, "searchCriteria");
        this.f5193a = model;
        this.f5194b = searchCriteria;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f5193a.equals(mVar.f5193a) && this.f5194b.equals(mVar.f5194b);
    }

    public final int hashCode() {
        return this.f5194b.hashCode() + (this.f5193a.hashCode() * 31);
    }
}
