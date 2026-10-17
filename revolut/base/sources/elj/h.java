package elj;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f127499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f127500b;

    public h(Clause title, Clause clause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f127499a = title;
        this.f127500b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f127499a, hVar.f127499a) && Intrinsics.f(this.f127500b, hVar.f127500b);
    }

    public final int hashCode() {
        int iHashCode = this.f127499a.hashCode() * 31;
        Clause clause = this.f127500b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
