package cv3;

import com.revolut.feature.credit.application.plugins.api.models.action_button.Action;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Action f109258a;

    public j(Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f109258a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f109258a, ((j) obj2).f109258a);
    }

    public final int hashCode() {
        return this.f109258a.hashCode();
    }
}
