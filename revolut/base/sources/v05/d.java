package v05;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f284740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f284741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f284742c;

    public d(int i, Clause title, Clause clause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f284740a = title;
        this.f284741b = clause;
        this.f284742c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f284740a, dVar.f284740a) && Intrinsics.f(this.f284741b, dVar.f284741b) && this.f284742c == dVar.f284742c;
    }

    public final int hashCode() {
        int iHashCode = this.f284740a.hashCode() * 31;
        Clause clause = this.f284741b;
        return Integer.hashCode(this.f284742c) + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
