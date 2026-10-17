package a83;

import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class t implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FeatureCommand f2085a;

    public t(FeatureCommand command) {
        Intrinsics.checkNotNullParameter(command, "command");
        this.f2085a = command;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && this.f2085a.equals(((t) obj2).f2085a);
    }

    public final int hashCode() {
        return this.f2085a.f98638a.hashCode();
    }
}
