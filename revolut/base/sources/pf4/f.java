package pf4;

import com.revolut.feature.credit.application.plugins.api.models.action_button.Action;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Action f235438a;

    public f(Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f235438a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f235438a, ((f) obj2).f235438a);
    }

    public final int hashCode() {
        return this.f235438a.hashCode();
    }
}
