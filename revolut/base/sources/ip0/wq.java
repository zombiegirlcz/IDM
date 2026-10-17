package ip0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class wq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f167056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f167057b;

    public wq(Clause clause, int i) {
        this.f167056a = i;
        this.f167057b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof wq)) {
            return false;
        }
        wq wqVar = (wq) obj2;
        return this.f167056a == wqVar.f167056a && Intrinsics.f(this.f167057b, wqVar.f167057b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f167056a) * 31;
        Clause clause = this.f167057b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
