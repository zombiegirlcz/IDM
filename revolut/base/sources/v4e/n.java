package v4e;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrendViewDelegate f286055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputChecklistDelegate f286056b;

    public n(TrendViewDelegate trendView, InputChecklistDelegate inputChecklist) {
        Intrinsics.checkNotNullParameter(trendView, "trendView");
        Intrinsics.checkNotNullParameter(inputChecklist, "inputChecklist");
        this.f286055a = trendView;
        this.f286056b = inputChecklist;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f286055a, nVar.f286055a) && Intrinsics.f(this.f286056b, nVar.f286056b);
    }

    public final int hashCode() {
        return this.f286056b.hashCode() + (this.f286055a.hashCode() * 31);
    }
}
