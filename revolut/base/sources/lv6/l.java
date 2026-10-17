package lv6;

import com.revolut.core.ui_kit.views.navbar.z;
import kotlin.jvm.internal.Intrinsics;
import tx0.f3;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f200330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f3 f200331b;

    public l(z story, f3 f3Var) {
        Intrinsics.checkNotNullParameter(story, "story");
        this.f200330a = story;
        this.f200331b = f3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f200330a.equals(lVar.f200330a) && Intrinsics.f(this.f200331b, lVar.f200331b);
    }

    public final int hashCode() {
        int iHashCode = this.f200330a.hashCode() * 31;
        f3 f3Var = this.f200331b;
        return iHashCode + (f3Var == null ? 0 : f3Var.hashCode());
    }
}
