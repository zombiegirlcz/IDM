package ip0;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o6 implements p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TagViewData f165627a;

    public o6(TagViewData badge) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        this.f165627a = badge;
    }

    @Override // ip0.p6
    public final TagViewData X() {
        return this.f165627a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o6) && Intrinsics.f(this.f165627a, ((o6) obj2).f165627a);
    }

    public final int hashCode() {
        return this.f165627a.hashCode();
    }
}
