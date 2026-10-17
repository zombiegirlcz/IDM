package nya;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.core.ui_kit.views.navbar.z f220760a;

    public u(com.revolut.core.ui_kit.views.navbar.z storyNavBarContentViewModel) {
        Intrinsics.checkNotNullParameter(storyNavBarContentViewModel, "storyNavBarContentViewModel");
        this.f220760a = storyNavBarContentViewModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && this.f220760a.equals(((u) obj2).f220760a);
    }

    public final int hashCode() {
        return this.f220760a.hashCode();
    }
}
