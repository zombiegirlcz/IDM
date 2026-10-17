package uek;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f279463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f279464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f279465c;

    public d(Clause clause, List navBarMenu, boolean z) {
        Intrinsics.checkNotNullParameter(navBarMenu, "navBarMenu");
        this.f279463a = z;
        this.f279464b = navBarMenu;
        this.f279465c = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f279463a == dVar.f279463a && Intrinsics.f(this.f279464b, dVar.f279464b) && Intrinsics.f(this.f279465c, dVar.f279465c);
    }

    public final int hashCode() {
        int iD = p.a.d(Boolean.hashCode(this.f279463a) * 31, 31, this.f279464b);
        Clause clause = this.f279465c;
        return iD + (clause == null ? 0 : clause.hashCode());
    }
}
