package tag;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f269330a;

    public f(String propertyId) {
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        this.f269330a = propertyId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f269330a, ((f) obj2).f269330a);
    }

    public final int hashCode() {
        return this.f269330a.hashCode();
    }
}
