package hui;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class u implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f155693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f155694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f155695c;

    public u(aim.e items, t navBarState, Clause clause) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        this.f155693a = items;
        this.f155694b = navBarState;
        this.f155695c = clause;
    }

    @Override // cli.p
    public final List c() {
        return this.f155693a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f155693a, uVar.f155693a) && Intrinsics.f(this.f155694b, uVar.f155694b) && Intrinsics.f(this.f155695c, uVar.f155695c);
    }

    public final int hashCode() {
        int iHashCode = (this.f155694b.hashCode() + (this.f155693a.hashCode() * 31)) * 31;
        Clause clause = this.f155695c;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
