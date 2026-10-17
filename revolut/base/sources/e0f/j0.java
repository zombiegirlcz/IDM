package e0f;

import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j0 extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeatureCommand f121620a;

    public j0(FeatureCommand command) {
        Intrinsics.checkNotNullParameter(command, "command");
        this.f121620a = command;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j0) && this.f121620a.equals(((j0) obj2).f121620a);
    }

    public final int hashCode() {
        return this.f121620a.f98638a.hashCode();
    }
}
