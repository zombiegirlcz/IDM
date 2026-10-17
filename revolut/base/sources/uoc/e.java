package uoc;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f281607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f281608b;

    public e(Clause title, Clause clause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f281607a = title;
        this.f281608b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f281607a, eVar.f281607a) && Intrinsics.f(this.f281608b, eVar.f281608b);
    }

    public final int hashCode() {
        int iHashCode = this.f281607a.hashCode() * 31;
        Clause clause = this.f281608b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
