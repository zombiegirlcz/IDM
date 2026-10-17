package vmh;

import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionsDelegate f290580a;

    public a(ActionsDelegate actionsDelegate) {
        Intrinsics.checkNotNullParameter(actionsDelegate, "actionsDelegate");
        this.f290580a = actionsDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f290580a, ((a) obj2).f290580a);
    }

    public final int hashCode() {
        return this.f290580a.hashCode();
    }
}
