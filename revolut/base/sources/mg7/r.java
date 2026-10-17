package mg7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f205181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f205182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.feature.incentive_reward.impl.ui.incentive_selection.screen.selection.a f205183c;

    public r(List items, q navBarState, com.revolut.feature.incentive_reward.impl.ui.incentive_selection.screen.selection.a goToButtonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        Intrinsics.checkNotNullParameter(goToButtonState, "goToButtonState");
        this.f205181a = items;
        this.f205182b = navBarState;
        this.f205183c = goToButtonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f205181a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f205181a, rVar.f205181a) && Intrinsics.f(this.f205182b, rVar.f205182b) && Intrinsics.f(this.f205183c, rVar.f205183c);
    }

    public final int hashCode() {
        return this.f205183c.hashCode() + ((this.f205182b.hashCode() + (this.f205181a.hashCode() * 31)) * 31);
    }
}
