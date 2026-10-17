package o97;

import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeatureCommand f223112a;

    public j(FeatureCommand command) {
        Intrinsics.checkNotNullParameter(command, "command");
        this.f223112a = command;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f223112a.equals(((j) obj2).f223112a);
    }

    public final int hashCode() {
        return this.f223112a.f98638a.hashCode();
    }
}
