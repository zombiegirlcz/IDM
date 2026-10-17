package xy3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309578a;

    public i(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f309578a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f309578a, ((i) obj2).f309578a);
    }

    public final int hashCode() {
        return this.f309578a.hashCode();
    }
}
