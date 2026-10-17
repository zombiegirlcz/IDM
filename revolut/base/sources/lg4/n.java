package lg4;

import ht3.l0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f195056a;

    public n(l0 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f195056a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f195056a, ((n) obj2).f195056a);
    }

    public final int hashCode() {
        return this.f195056a.hashCode();
    }
}
