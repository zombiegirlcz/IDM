package ijj;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f161809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f161810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f161811c;

    public i(e primaryActionButton, e secondaryActionButton, Clause clause) {
        Intrinsics.checkNotNullParameter(primaryActionButton, "primaryActionButton");
        Intrinsics.checkNotNullParameter(secondaryActionButton, "secondaryActionButton");
        this.f161809a = primaryActionButton;
        this.f161810b = secondaryActionButton;
        this.f161811c = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f161809a, iVar.f161809a) && Intrinsics.f(this.f161810b, iVar.f161810b) && Intrinsics.f(this.f161811c, iVar.f161811c);
    }

    public final int hashCode() {
        int iHashCode = (this.f161810b.hashCode() + (this.f161809a.hashCode() * 31)) * 31;
        Clause clause = this.f161811c;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
