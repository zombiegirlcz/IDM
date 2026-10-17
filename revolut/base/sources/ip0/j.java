package ip0;

import com.revolut.core.ui_kit.delegates.ActionSubheaderDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f164763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f164764b;

    public j(i startButton, i endButton) {
        Intrinsics.checkNotNullParameter("ACCOUNT_DROPDOWN_ID", "listId");
        Intrinsics.checkNotNullParameter(startButton, "startButton");
        Intrinsics.checkNotNullParameter(endButton, "endButton");
        this.f164763a = startButton;
        this.f164764b = endButton;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ActionSubheaderDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF58244a() {
        return "ACCOUNT_DROPDOWN_ID";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f164763a.equals(jVar.f164763a) && this.f164764b.equals(jVar.f164764b);
    }

    public final int hashCode() {
        return this.f164764b.hashCode() + ((this.f164763a.hashCode() - 667001335) * 31);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof j ? (j) oldItem : null) != null) {
            return new k(!this.f164763a.equals(r4.f164763a), !this.f164764b.equals(r4.f164764b));
        }
        return null;
    }
}
