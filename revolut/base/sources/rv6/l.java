package rv6;

import com.revolut.core.ui_kit.views.navbar.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends com.revolut.feature.freelancer.impl.ui.cashback.screen.plan.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f257703a;

    public l(z story) {
        Intrinsics.checkNotNullParameter(story, "story");
        this.f257703a = story;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f257703a.equals(((l) obj2).f257703a);
    }

    public final int hashCode() {
        return this.f257703a.hashCode();
    }
}
