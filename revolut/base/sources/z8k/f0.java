package z8k;

import aw0.j8;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f320172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j8 f320173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f320174c;
    public final NavBarWithContainerBackground d;

    public f0(List items, j8 navBarConfig, r rVar, NavBarWithContainerBackground navBarWithContainerBackground) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        this.f320172a = items;
        this.f320173b = navBarConfig;
        this.f320174c = rVar;
        this.d = navBarWithContainerBackground;
    }

    @Override // jki.n
    public final List c() {
        return this.f320172a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f320172a, f0Var.f320172a) && Intrinsics.f(this.f320173b, f0Var.f320173b) && Intrinsics.f(this.f320174c, f0Var.f320174c) && Intrinsics.f(this.d, f0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f320173b.hashCode() + (this.f320172a.hashCode() * 31)) * 31;
        r rVar = this.f320174c;
        int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        NavBarWithContainerBackground navBarWithContainerBackground = this.d;
        return iHashCode2 + (navBarWithContainerBackground != null ? navBarWithContainerBackground.hashCode() : 0);
    }
}
