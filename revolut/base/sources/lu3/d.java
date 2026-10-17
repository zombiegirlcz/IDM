package lu3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f200020a;

    public d(List additionalConsents) {
        Intrinsics.checkNotNullParameter(additionalConsents, "additionalConsents");
        this.f200020a = additionalConsents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f200020a, ((d) obj2).f200020a);
    }

    public final int hashCode() {
        return this.f200020a.hashCode();
    }
}
