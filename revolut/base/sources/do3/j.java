package do3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f116404a;

    public j(i ageRange) {
        Intrinsics.checkNotNullParameter(ageRange, "ageRange");
        this.f116404a = ageRange;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f116404a, ((j) obj2).f116404a);
    }

    public final int hashCode() {
        return this.f116404a.hashCode();
    }
}
